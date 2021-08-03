/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mineco.diaco.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import gt.gob.mineco.diaco.dao.TipoRepository;

import gt.gob.mineco.diaco.util.ResponseRs;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import com.sun.star.beans.PropertyValue;
import com.sun.star.beans.XPropertySet;
import com.sun.star.container.XIndexAccess;
import com.sun.star.frame.XComponentLoader;
import com.sun.star.frame.XDesktop;
import com.sun.star.frame.XStorable;
import com.sun.star.lang.XComponent;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.text.TableColumnSeparator;
import com.sun.star.text.XParagraphCursor;
import com.sun.star.text.XText;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextDocument;
import com.sun.star.text.XTextTable;
import com.sun.star.uno.UnoRuntime;
import com.sun.star.uno.XComponentContext;
import com.sun.star.util.XCloseable;
import com.sun.star.util.XReplaceDescriptor;
import com.sun.star.util.XReplaceable;
import gt.gob.mineco.diaco.model.TIpoReg_CedulaCitacionConJur;
import gt.gob.mineco.diaco.model.TipoConsumidor;
import gt.gob.mineco.diaco.model.TipoProveedor;
import gt.gob.mineco.diaco.model.TipoQueja;
import gt.gob.mineco.diaco.model.TipoReg_ActaConciliacion;
import gt.gob.mineco.diaco.model.TipoReg_ActaIncomparecencia;
import gt.gob.mineco.diaco.model.TipoReg_CedCitacionCon;
import gt.gob.mineco.diaco.model.TipoReg_CedCitacionPro;
import gt.gob.mineco.diaco.model.TipoReg_CedNotificacionCon;
import gt.gob.mineco.diaco.model.TipoReg_CedNotificacionPro;
import gt.gob.mineco.diaco.model.TipoReg_CedulaCitacionProJur;
import gt.gob.mineco.diaco.model.TipoReg_CedulaNotificacionCitacionJuridico;
import gt.gob.mineco.diaco.model.TipoReg_CedulaNotificacionResCorreo;
import gt.gob.mineco.diaco.model.TipoReg_CedulaNotificacionResJuridico;
import gt.gob.mineco.diaco.model.TipoReg_ComPerm;
import gt.gob.mineco.diaco.model.TipoReg_DeclaracionRebeldia;
import gt.gob.mineco.diaco.model.TipoReg_FichaQueja;
import gt.gob.mineco.diaco.model.TipoReg_FormularioQueja;
import gt.gob.mineco.diaco.model.TipoReg_MovimExp;
import gt.gob.mineco.diaco.model.TipoReg_MovimExpDet;
import gt.gob.mineco.diaco.model.TipoReg_RegCedulaNotificacionCitCorreo;
import gt.gob.mineco.diaco.model.TipoReg_ResArchivoUnicaAudienciaConc;
import gt.gob.mineco.diaco.model.TipoReg_ResArchivoVerificacion;
import gt.gob.mineco.diaco.model.TipoReg_ResVisitaCampo;
import gt.gob.mineco.diaco.model.TipoReg_ResolucionAperturaAPrueba;
import gt.gob.mineco.diaco.model.TipoReg_ResolucionFinal;
import gt.gob.mineco.diaco.model.TipoTelefono;
import gt.gob.mineco.diaco.model.TipoUsuario;
import gt.gob.mineco.diaco.model.Tipo_RegResArchivoConciliacion;
import gt.gob.mineco.diaco.util.CedulaNotificacionDto;
import gt.gob.mineco.diaco.util.NumerosEnLetras;
import gt.gob.mineco.diaco.util.NumerosEnLetrasOrdinales;
import gt.gob.mineco.diaco.util.OOoOutputStream;
import java.io.ByteArrayInputStream;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import ooo.connector.BootstrapSocketConnector;

/**
 *
 * @author julio
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class TipoRegistrosQuejaServiceImpl implements TipoRegistrosQuejaService {

    @Inject
    private TipoRepository tipoDao;

    //private static final String OOOEXEFOLDER;
    //private final String oooExeFolder = "/opt/libreoffice6.1/program";//PRODUCCION
    //private final String oooExeFolder = "/usr/lib/libreoffice/program";
    private final String oooExeFolder="C:/Program Files/LibreOffice/program"; //DESARROLLO
    
     
    /* local---*/ //private final String workingDir="/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
    //private final String workingDir= "/home/diaco/Documentos/FILESERVER/diacoRegistros1/"; //PRODUCCION
      
    private final String workingDir="C:/Users/jjaguilal/Documents/FILESERVER/diacoRegistros/"; //DESARROLLO

    /*  static 
    { OOOEXEFOLDER = "/opt/libreoffice6.1/program";
    }*/

 /*DIACO-AQ-FO-02*/
    @Override
    public Response getFormularioQueja(Integer idqueja, String pToken) {
        try {
            System.out.println("JJ-Variable oooExeFolder: "+oooExeFolder);
            tipoDao.TokenCheck(pToken);
            TipoReg_FormularioQueja formQueja = tipoDao.findByIdFormularioQueja(idqueja);

            // Initialise
            //  String OOOEXEFOLDER = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            System.out.println("JJ-Variable xContext: "+xContext);
            //XComponentContext xContext = Bootstrap.bootstrap();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);
            System.out.println("JJ-Variable oDesktop: "+oDesktop);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);
            System.out.println("JJ-Variable xDesktop: "+xDesktop);

            // Load the Document
            //  String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-02.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
                
            }
            System.out.println("Leyendo DIACO-AQ-FO-02.docx");
            


            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);
            System.out.println("JJ-Variable xCompLoader: "+xCompLoader);

            String sUrl = "file:///" + myTemplate;
            System.out.println("JJ-Variable sUrl: "+sUrl);

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);
            System.out.println("JJ-Variable propertyValues: "+propertyValues);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
            System.out.println("JJ-Variable xComp: "+xComp);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;
            System.out.println("JJ-Variable xReplaceDescr: "+xReplaceDescr);

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            System.out.println("JJ-Variable xTextDocument: "+xTextDocument);

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);
            System.out.println("JJ-Variable xReplaceable: "+xReplaceable);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();
            System.out.println("JJ-Variable xReplaceDescr: "+xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(formQueja.getQuejanumero().toString() + "-" + formQueja.getAnio_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<via_ingreso>");
            xReplaceDescr.setReplaceString(formQueja.getVia_ingreso());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_nombre());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_queja>");
            xReplaceDescr.setReplaceString(simpleDateFormat.format(formQueja.getFecha()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<identificacion_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_identificacion());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_prov>");
            xReplaceDescr.setReplaceString(formQueja.getProv_nombre());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<tel_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_telefono());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nit_prov>");
            xReplaceDescr.setReplaceString(formQueja.getProv_nit());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<email_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_email());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<tel_prov>");
            xReplaceDescr.setReplaceString(formQueja.getProv_telefono());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<dir_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_direccion());
            xReplaceable.replaceAll(xReplaceDescr);

            if (formQueja.getProv_fechacompra() != null) {
                xReplaceDescr.setSearchString("<fecha_compra>");
                xReplaceDescr.setReplaceString(simpleDateFormat.format(formQueja.getProv_fechacompra()));
                xReplaceable.replaceAll(xReplaceDescr);
            } else {
                xReplaceDescr.setSearchString("<fecha_compra>");
                xReplaceDescr.setReplaceString("");
                xReplaceable.replaceAll(xReplaceDescr);
            }

            xReplaceDescr.setSearchString("<depto_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_dpto());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<dir_prov>");
            xReplaceDescr.setReplaceString(formQueja.getProv_direccion());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<zona_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_zona());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<depto_prov>");
            xReplaceDescr.setReplaceString(formQueja.getProv_departamento());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<municipio_cons>");
            xReplaceDescr.setReplaceString(formQueja.getCon_municipio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<zona_prov>");
            xReplaceDescr.setReplaceString(formQueja.getProv_zona());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<municipio_prov>");
            xReplaceDescr.setReplaceString(formQueja.getProv_municipio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<detalle_queja>");
            xReplaceDescr.setReplaceString(formQueja.getQueja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<posible_solucion>");
            xReplaceDescr.setReplaceString(formQueja.getSolucion());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();
            System.out.println("Exportando a PDF");

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);

            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            //response.header("Content-Disposition", "attachment;filename=queja.pdf");
            response.header("Content-Disposition", "attachment;filename=queja.docx");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de obtener registro"+e);
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getRegistroComunicacionPermanente(Integer pIdRegistro, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);
            //TipoReg_FormularioQueja formQueja = tipoDao.findByIdFormularioQueja(idqueja);
            TipoReg_ComPerm regComPerm = tipoDao.findByIdComunicacionPermanente(pIdRegistro);
            System.out.println("JJ: Variables: pIdRegistro="+pIdRegistro);

            // Initialise
            // String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            // Load the Document
            // String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-15.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            xReplaceDescr.setSearchString("<fecha_presentacion>");
            xReplaceDescr.setReplaceString(simpleDateFormat.format(regComPerm.getFecha_presentacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<id_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(regComPerm.getQuejanumero() + "-" + regComPerm.getAnio_queja()));
            xReplaceable.replaceAll(xReplaceDescr);

            // mail merge the signatory
            xReplaceDescr.setSearchString("<fecha_asignacion>");
            xReplaceDescr.setReplaceString(simpleDateFormat.format(regComPerm.getFecha_creacion()));

            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<responsable_comunicacion>");

            TipoUsuario tipoUsuario = tipoDao.findByIdUsuarioSec(Integer.parseInt(regComPerm.getResponsable()));
            xReplaceDescr.setReplaceString(tipoUsuario.getNombre());
            xReplaceable.replaceAll(xReplaceDescr);

            if (regComPerm.getVia_comunicacion().equals("Teléfono")) {
                xReplaceDescr.setSearchString("<tel_x>");
                xReplaceDescr.setReplaceString("x");
                xReplaceable.replaceAll(xReplaceDescr);

                xReplaceDescr.setSearchString("<email_x>");
                xReplaceDescr.setReplaceString("");
                xReplaceable.replaceAll(xReplaceDescr);
            } else {
                xReplaceDescr.setSearchString("<tel_x>");
                xReplaceDescr.setReplaceString("");
                xReplaceable.replaceAll(xReplaceDescr);

                xReplaceDescr.setSearchString("<email_x>");
                xReplaceDescr.setReplaceString("x");
                xReplaceable.replaceAll(xReplaceDescr);
            }

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(regComPerm.getCon_nombre());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<telefono>");
            xReplaceDescr.setReplaceString(regComPerm.getCon_telefono());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<email>");
            xReplaceDescr.setReplaceString(regComPerm.getCon_email());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<estatus>");
            xReplaceDescr.setReplaceString(regComPerm.getEstatus());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_notificacion>");
            xReplaceDescr.setReplaceString(simpleDateFormat.format(regComPerm.getFecha_notificacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<observaciones>");
            xReplaceDescr.setReplaceString(regComPerm.getObservaciones());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + regComPerm.getId_queja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getCedulaCitacionCons(Integer pId_audiencia, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_CedCitacionCon cedCitacion = tipoDao.findByIdCedCitacionCons(pId_audiencia);

            LocalDate hoy = LocalDate.now();
            int anio = hoy.getYear();
            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate ld = LocalDate.now();

            LocalDateTime dateCitacion = cedCitacion.getFecha_cita().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            // Load the Document
            // String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
             String myTemplate ;
             
            //VERIFICA SI EL CONSUMIDOR ES JURIDICO
              TipoQueja vTipoQueja = tipoDao.findByIdQueja(cedCitacion.getId_queja());
                 TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
                  if (vTipoConsumidor.getTipo_consumidor()==7)
                   {
                      myTemplate = workingDir + "DIACO-AQ-FO-05_cons_jur.docx";
                   } 
                  else
                   {  myTemplate = workingDir + "DIACO-AQ-FO-05_cons.docx";
                   }     
            
            
           

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            // mail merge the date
          /*  xReplaceDescr.setSearchString("<fecha_creacion_citacion>");
            xReplaceDescr.setReplaceString(ld.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);*/
            
            xReplaceDescr.setSearchString("<fecha_creacion_citacion>");
            xReplaceDescr.setReplaceString((convertToLocalDateViaInstant(cedCitacion.getFecha_creacion())).format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_citacion>");
            xReplaceDescr.setReplaceString(dateCitacion.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<queja_num>");
            xReplaceDescr.setReplaceString(cedCitacion.getQuejanumero() + "-" + cedCitacion.getAnio_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(cedCitacion.getCorrelativo() + "-" + convertToLocalDateViaInstant(cedCitacion.getFecha_creacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<operador>");
            xReplaceDescr.setReplaceString(cedCitacion.getTipoUsuario().getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(cedCitacion.getNombre_consumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<tel_consumidor>");
            xReplaceDescr.setReplaceString(cedCitacion.getTelefonos());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<cita_hora>");
            xReplaceDescr.setReplaceString(String.valueOf(dateCitacion.getHour()) + ":" + ((String.valueOf(dateCitacion.getMinute())).equals("0") ? "00" : (String.valueOf(dateCitacion.getMinute()))));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_proveedor>");
            xReplaceDescr.setReplaceString(cedCitacion.getNombre_proveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<motivo_queja>");
            xReplaceDescr.setReplaceString(cedCitacion.getDetalle_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<direccion_consumidor>");
            xReplaceDescr.setReplaceString(cedCitacion.getDireccion() + " Zona " + cedCitacion.getZona());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<muniDepa>");
            xReplaceDescr.setReplaceString(cedCitacion.getDpto_muni());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<posible_solucion>");
            xReplaceDescr.setReplaceString(cedCitacion.getSolucion());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + cedCitacion.getId_queja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getActaConciliacioAtContr(TipoReg_ActaConciliacion vTipoReg_ActaConciliacion) {
        try {

            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            // Load the Document
            // String myTemplate = workingDir + "DIACO-AQ-FO-06.docx";
            String myTemplate = workingDir + "DIACO_AQ_FO_06.doc";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            // mail merge the addressee
            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_ActaConciliacion.getIdCorrelativoActaConciliacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "MS Word 97";
            //ulai	"MS Word 2007 XML"
            //ulai writer_MS_Word_2007

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=DIACO-AQ-FO-06_doc.doc");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getActaIncomparecenciaAtContr(TipoReg_ActaIncomparecencia vTipoReg_ActaIncomparecencia) {
        try {

            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            // Load the Document
            String myTemplate = workingDir + "DIACO_AQ_FO_07.doc";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            // mail merge the addressee
            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_ActaIncomparecencia.getIdCorrelativoActaIncomparecencia()));
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "MS Word 97";
            // propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=DIACO_AQ_FO_07.docx");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getCedulaCitacionProv(Integer pId_audiencia, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);
            TipoReg_CedCitacionPro cedCitacionProv = tipoDao.findByIdCedCitacionProv(pId_audiencia);

            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate hoy = LocalDate.now();
            LocalDateTime dateCitacion = cedCitacionProv.getFecha_cita().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();
            int anio = hoy.getYear();
            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            // Load the Document
            // String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-05_prov.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            // mail merge the date
            /*String fechaPresentacion = simpleDateFormat.format(cedCitacionProv.getFecha_creacion());
            xReplaceDescr.setSearchString("<fecha_creacion_citacion>");
            xReplaceDescr.setReplaceString(hoy.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);*/
            
            String fechaPresentacion = simpleDateFormat.format(cedCitacionProv.getFecha_creacion());
            xReplaceDescr.setSearchString("<fecha_creacion_citacion>");
            xReplaceDescr.setReplaceString((convertToLocalDateViaInstant(cedCitacionProv.getFecha_creacion())).format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);
            

            // mail merge the addressee
            xReplaceDescr.setSearchString("<queja_num>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getQuejanumero() + "-" + cedCitacionProv.getAnio_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            // mail merge the signatory
            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getCorrelativo() + "-" + convertToLocalDateViaInstant(cedCitacionProv.getFecha_creacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<operador>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getTipoUsuario().getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_prov>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getNombre_proveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<dir_prov>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getDireccion() + " Zona " + cedCitacionProv.getZona());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<muniDepa>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getDpto_muni());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<tel_prov>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getTelefonos());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_citacion>");
            xReplaceDescr.setReplaceString(dateCitacion.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<cita_hora>");
            xReplaceDescr.setReplaceString(dateCitacion.getHour() + ":" + (dateCitacion.getMinute() == 0 ? "00" : dateCitacion.getMinute()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<detalle_queja>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getDetalle_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<posible_solucion>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getSolucion());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(cedCitacionProv.getNombre_consumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + cedCitacionProv.getId_queja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getCedulaNotificacionCons(Integer pId_audiencia, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);
            TipoReg_CedNotificacionCon notifiCons = tipoDao.findByIdCedNotiCons(pId_audiencia);
            LocalDate hoy = LocalDate.now();
            int yearToday = hoy.getYear();
            // Initialise
            // String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            // String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-12_cons.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(notifiCons.getQuejanumero() + "-" + notifiCons.getAnio_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(notifiCons.getCorrelativo() + "-" + convertToLocalDateViaInstant(notifiCons.getFecha_creacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<operador>");
            xReplaceDescr.setReplaceString(notifiCons.getTipoUsuario().getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<muni_cons>");
            xReplaceDescr.setReplaceString(notifiCons.getMunicipio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<depto_cons>");
            xReplaceDescr.setReplaceString(notifiCons.getDepartamento());
            xReplaceable.replaceAll(xReplaceDescr);
            
            
              //calculo para underlines
            String underline=getUnderLineSpacesCedulasNotis(notifiCons.getMunicipio(),notifiCons.getDepartamento());
            
            xReplaceDescr.setSearchString("<_>");
            xReplaceDescr.setReplaceString(underline);
            xReplaceable.replaceAll(xReplaceDescr);
          

            xReplaceDescr.setSearchString("<dir_consLetras>");
            xReplaceDescr.setReplaceString((NumerosEnLetrasOrdinales.direccionAletras(notifiCons.getDireccion() + " zona " + notifiCons.getZona())).toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_cons>");
            xReplaceDescr.setReplaceString(notifiCons.getNombre_consumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            //LocalDate ld = LocalDate.now();
            LocalDateTime dateCitacion = notifiCons.getFecha_cita().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

            int day = dateCitacion.getDayOfMonth();
            String mes = dateCitacion.format(DateTimeFormatter.ofPattern("MMMM"));
            String mesUpper = mes.substring(0, 1).toUpperCase() + mes.substring(1);
            int year = dateCitacion.getYear();
            NumerosEnLetras nl = new NumerosEnLetras();
            String dia = nl.convertir(day);
            String anio = nl.convertir(year);
            xReplaceDescr.setSearchString("<fecha_notificacion>");
            xReplaceDescr.setReplaceString(dia + " de " + mesUpper + " de " + anio);
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<email>");
            xReplaceDescr.setReplaceString(notifiCons.getEmails());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + notifiCons.getId_queja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getCedulaNotificacionProv(Integer pId_audiencia, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_CedNotificacionPro notiProv = tipoDao.findByIdCedNotiProv(pId_audiencia);
            LocalDate hoy = LocalDate.now();
            int yearToday = hoy.getYear();
            // Initialise
            //  String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-12_Prov.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(notiProv.getQuejanumero() + "-" + notiProv.getAnio_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(notiProv.getCorrelativo() + "-" + convertToLocalDateViaInstant(notiProv.getFecha_creacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<dir_provLetras>");
            xReplaceDescr.setReplaceString((NumerosEnLetrasOrdinales.direccionAletras(notiProv.getDireccion() + "  zona " + notiProv.getZona())).toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<operador>");
            xReplaceDescr.setReplaceString(notiProv.getTipoUsuario().getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_prov>");
            xReplaceDescr.setReplaceString(notiProv.getNombre_proveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<muni_prov>");
            xReplaceDescr.setReplaceString(notiProv.getMunicipio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<depto_prov>");
            xReplaceDescr.setReplaceString(notiProv.getDepartamento());
            xReplaceable.replaceAll(xReplaceDescr);

            //calculo para underlines
            String underline=getUnderLineSpacesCedulasNotis(notiProv.getMunicipio(),notiProv.getDepartamento());
            
            xReplaceDescr.setSearchString("<_>");
            xReplaceDescr.setReplaceString(underline);
            xReplaceable.replaceAll(xReplaceDescr);

            

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate ld = LocalDate.now();
            LocalDateTime dateCitacion = notiProv.getFecha_cita().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

            int day = dateCitacion.getDayOfMonth();
            String mes = dateCitacion.format(DateTimeFormatter.ofPattern("MMMM"));
            String mesUpper = mes.substring(0, 1).toUpperCase() + mes.substring(1);
            int year = dateCitacion.getYear();
            NumerosEnLetras nl = new NumerosEnLetras();
            String dia = nl.convertir(day);
            String anio = nl.convertir(year);
            xReplaceDescr.setSearchString("<fecha_notificacion>");
            xReplaceDescr.setReplaceString(dia + " de " + mesUpper + " de " + anio);
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<email>");
            xReplaceDescr.setReplaceString(notiProv.getEmails());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());
            // seria interesante y de probar lo del StreamingOutput
            // en https://stackoverflow.com/questions/29712554/how-to-download-a-file-using-a-java-rest-service-and-a-data-stream

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + notiProv.getId_queja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getResArchivoConciliacion(Integer pId, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            Tipo_RegResArchivoConciliacion resArchivo = tipoDao.findByIdResArchivoConciliacion(pId);
            TipoQueja vTipoQueja=tipoDao.findByIdQueja(resArchivo.getIdQueja());
            // Initialise
            // String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-08.docx"; 

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            xReplaceDescr.setSearchString("<num_correlativo>");
            xReplaceDescr.setReplaceString(String.valueOf(resArchivo.getIdCorrelativoConciliacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate dateCitacion = LocalDate.now();

            int day = dateCitacion.getDayOfMonth();
            String mes = dateCitacion.format(DateTimeFormatter.ofPattern("MMMM"));
            String mesUpper = mes.substring(0, 1).toUpperCase() + mes.substring(1);
            int year = dateCitacion.getYear();
            NumerosEnLetras nl = new NumerosEnLetras();
            String dia = nl.convertir(day);
            String anio = nl.convertir(year);

            xReplaceDescr.setSearchString("<fecha_queja_enLetras>");
            xReplaceDescr.setReplaceString(dia + " de " + mesUpper + " de " + anio);
            xReplaceable.replaceAll(xReplaceDescr);

            String num_queja_letras = nl.convertir(Integer.parseInt(resArchivo.getNo_queja())) + " guion " + anio;
            xReplaceDescr.setSearchString("<num_quejaLetras>");
            xReplaceDescr.setReplaceString(num_queja_letras);
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(resArchivo.getNo_queja() + "-" + vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_cons>");
            xReplaceDescr.setReplaceString(resArchivo.getNombreConsumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_prov>");
            xReplaceDescr.setReplaceString(resArchivo.getNombreProveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + resArchivo.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getFichaQueja(Integer pIdqueja, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);
            // TipoReg_FormularioQueja formQueja = tipoDao.findByIdFormularioQueja(pIdqueja);
            TipoReg_FichaQueja fichaQueja = tipoDao.findByIdFichaQueja(pIdqueja);
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(fichaQueja.getId_queja());
            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Load the Document
            // String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "ficha_queja.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(fichaQueja.getQuejanumero() + "-" + fichaQueja.getAnio_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_ingreso_queja>");
            xReplaceDescr.setReplaceString(simpleDateFormat.format(fichaQueja.getFecha_ingreso_queja()) + "(" + getFuente(vTipoQueja.getFuente()) + ")");
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_prov>");
            xReplaceDescr.setReplaceString(fichaQueja.getNombre_proveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_cons>");
            xReplaceDescr.setReplaceString(fichaQueja.getNombre_consumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<motivo_queja>");
            xReplaceDescr.setReplaceString(fichaQueja.getSolicita_que());
            xReplaceable.replaceAll(xReplaceDescr);

            if (fichaQueja.getFecha_comunicacion() != null) {
                xReplaceDescr.setSearchString("<fecha_comunicacion>");
                xReplaceDescr.setReplaceString(simpleDateFormat.format(fichaQueja.getFecha_comunicacion()));
                xReplaceable.replaceAll(xReplaceDescr);
            } else {
                xReplaceDescr.setSearchString("<fecha_comunicacion>");
                xReplaceDescr.setReplaceString("");
                xReplaceable.replaceAll(xReplaceDescr);
            }

            xReplaceDescr.setSearchString("<visita_campo>");
            xReplaceDescr.setReplaceString(fichaQueja.getVisita_campo() != null ? fichaQueja.getVisita_campo() : "N/A");
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_citacion>");
            xReplaceDescr.setReplaceString(fichaQueja.getCitacion() != null ? fichaQueja.getCitacion() : "N/A");
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_audiencia_conciliacion>");
            xReplaceDescr.setReplaceString(fichaQueja.getAudiencia_conciliacion());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<conclusion>");
            xReplaceDescr.setReplaceString(fichaQueja.getConclusion());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<observaciones>");
            xReplaceDescr.setReplaceString(fichaQueja.getComentarios());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + fichaQueja.getId_queja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    /*DIACO-AQ-FO-09*/
    @Override
    public Response getArchivoVisitaCampo(Integer pIdqueja, String pFechaResolucion, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_ResVisitaCampo visitaCampo = tipoDao.findByIdResolucionVisitaCampo(pIdqueja);

            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            LocalDate dateVIsita = LocalDate.now();
            int year = dateVIsita.getYear();
            NumerosEnLetras nl = new NumerosEnLetras();
            String anio = nl.convertir(year);

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-09.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            xReplaceDescr.setSearchString("<correlativo_visita_campo>");
            xReplaceDescr.setReplaceString(visitaCampo.getCorrelativo_resolucion());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(visitaCampo.getQuejanumero()) + "-" + visitaCampo.getAnio_queja());
            xReplaceable.replaceAll(xReplaceDescr);

            String numQuejaLetras = nl.convertir(visitaCampo.getQuejanumero()) + " guion " + anio;
            xReplaceDescr.setSearchString("<num_quejaLetras>");
            xReplaceDescr.setReplaceString(numQuejaLetras);
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_resolucion>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(visitaCampo.getFecha_creacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_prov>");
            xReplaceDescr.setReplaceString(visitaCampo.getNombre_proveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_cons>");
            xReplaceDescr.setReplaceString(visitaCampo.getNombre_consumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + visitaCampo.getId_queja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    /*DIACO-VQ-FO-07*/
    @Override
    public Response getArchivoVisitaCampoVerifVig(Integer pId, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_ResArchivoVerificacion visitaCampo = tipoDao.findByIdResolucionVisitaCampoVerif(pId);

            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-VQ-FO-07.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            xReplaceDescr.setSearchString("<iniciales_verif>");
            xReplaceDescr.setReplaceString(visitaCampo.getInicialesVerificador());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_verif>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(visitaCampo.getFechaVerificacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<no_expediente>");
            xReplaceDescr.setReplaceString(String.valueOf(visitaCampo.getQuejanumero()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(visitaCampo.getNombreConsumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            
            if(visitaCampo.getNombreProveedor().toUpperCase().substring(0, 1).equals("I")){
            xReplaceDescr.setSearchString("<y_e>");
            xReplaceDescr.setReplaceString("e");
            xReplaceable.replaceAll(xReplaceDescr);
            } else 
            {
                xReplaceDescr.setSearchString("<y_e>");
                 xReplaceDescr.setReplaceString("y");
                xReplaceable.replaceAll(xReplaceDescr);
            }
            
            xReplaceDescr.setSearchString("<nombre_proveedor>");
            xReplaceDescr.setReplaceString(visitaCampo.getNombreProveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + visitaCampo.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    /*DIACO-AS-FO-04*/
    @Override
    public Response getCedulaNotificacionResolucionJuridico(CedulaNotificacionDto pCedulaNotificacionDto) {
        try {
            
            System.out.println("REVISOR JJ: Entrando a getCedulaNotificacionResolucionJuridico con parametro pCedulaNotificacionDto EsCP: "+pCedulaNotificacionDto.getEsCP()+" idQueja: "+ pCedulaNotificacionDto.getIdQueja()+" getEsResultadoResolucion: "+ pCedulaNotificacionDto.getEsResultadoResolucion());

            tipoDao.TokenCheck(pCedulaNotificacionDto.getToken());
            TipoReg_CedulaNotificacionResJuridico vTipoReg_CedulaNotificacionResJuridico = tipoDao.findTipoReg_CedulaNotiResJuridicoByIdResCP(pCedulaNotificacionDto);
                
            System.out.println("REVISOR JJ: Entrando a vTipoReg_CedulaNotificacionResJuridico getId: "+vTipoReg_CedulaNotificacionResJuridico.getId());
            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AS-FO-04.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();
             TipoUsuario vTipoUsuario=tipoDao.findByIdUsuarioSec(vTipoReg_CedulaNotificacionResJuridico.getCreadoPor());

            xReplaceDescr.setSearchString("<asignado_a>");
            xReplaceDescr.setReplaceString(vTipoUsuario.getNombre());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<no_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_CedulaNotificacionResJuridico.getQuejanumero()) + "-"+vTipoReg_CedulaNotificacionResJuridico.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_CedulaNotificacionResJuridico.getCorrelativo())+"-"+convertToLocalDateViaInstant( vTipoReg_CedulaNotificacionResJuridico.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);
              

            xReplaceDescr.setSearchString("<telefono>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaNotificacionResJuridico.getTelefono());
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<municipio>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaNotificacionResJuridico.getMunicipio());
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<departamento>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaNotificacionResJuridico.getDepartamento());
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<direccion>");
            xReplaceDescr.setReplaceString(NumerosEnLetrasOrdinales.direccionAletras(vTipoReg_CedulaNotificacionResJuridico.getDireccion()));
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<notifico_a>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaNotificacionResJuridico.getNotificoA().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<fecha_notificacion>");
            xReplaceDescr.setReplaceString(getFechaEnLetras( vTipoReg_CedulaNotificacionResJuridico.getFechaResolucion()));
            xReplaceable.replaceAll(xReplaceDescr);
            
            
            
            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + vTipoReg_CedulaNotificacionResJuridico.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    /*DIACO-AS-FO-05*/
    @Override
    public Response getCedulaNotificacionCitacionJuridico(Integer pIdAudiencia, String esCP, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_CedulaNotificacionCitacionJuridico tipoReg_CedulaNotificacionCitacionJuridico = tipoDao.findByIdAudienciaCPCedulaNotiCitaJuridico(pIdAudiencia, esCP);

            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            LocalDate hoy = LocalDate.now();

            // Load the Document
            String myTemplate = workingDir + "DIACO-AS-FO-05.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            TipoUsuario vTipoUsuario = tipoDao.findByIdUsuarioSec(tipoReg_CedulaNotificacionCitacionJuridico.getCreadoPor());
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(tipoReg_CedulaNotificacionCitacionJuridico.getIdQueja());

            xReplaceDescr.setSearchString("<usuario_asignado>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoUsuario.getNombre()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(tipoReg_CedulaNotificacionCitacionJuridico.getQuejanumero()) + "-" + vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(tipoReg_CedulaNotificacionCitacionJuridico.getCorrelativo() + "-" + convertToLocalDateViaInstant(tipoReg_CedulaNotificacionCitacionJuridico.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_telefono>");
            xReplaceDescr.setReplaceString(tipoReg_CedulaNotificacionCitacionJuridico.getTelefono());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<municipio>");
            xReplaceDescr.setReplaceString(tipoReg_CedulaNotificacionCitacionJuridico.getMunicipio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<depto>");
            xReplaceDescr.setReplaceString(tipoReg_CedulaNotificacionCitacionJuridico.getDepartamento());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<direccion>");
            xReplaceDescr.setReplaceString(NumerosEnLetrasOrdinales.direccionAletras(tipoReg_CedulaNotificacionCitacionJuridico.getDireccion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_mayus>");
            xReplaceDescr.setReplaceString(tipoReg_CedulaNotificacionCitacionJuridico.getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_citacion_letras>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(tipoReg_CedulaNotificacionCitacionJuridico.getFechaCreacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + tipoReg_CedulaNotificacionCitacionJuridico.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    //DIACO-AS-FO-08 CONS
    @Override
    public Response getCedulaCitacionConsJuridico(Integer pIdAudiencia, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TIpoReg_CedulaCitacionConJur vTIpoReg_CedulaCitacionConJur = tipoDao.findAllTipoReg_CedCitacionConJur(pIdAudiencia);

            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Load the Document
            String myTemplate = workingDir + "DIACO-AS-FO-08_CONS.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            TipoUsuario vTipoUsuario = tipoDao.findByIdUsuarioSec(vTIpoReg_CedulaCitacionConJur.getCreadoPor());

            xReplaceDescr.setSearchString("<usuario_asignado>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoUsuario.getNombre()));
            xReplaceable.replaceAll(xReplaceDescr);

            LocalDate hoy = LocalDate.now();
            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(vTIpoReg_CedulaCitacionConJur.getQuejanumero()) + "-" + vTIpoReg_CedulaCitacionConJur.getAnioQueja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fechaNumLetras>");
            xReplaceDescr.setReplaceString(convertToLocalDateViaInstant(vTIpoReg_CedulaCitacionConJur.getFechaCreacion()).format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);
            

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(vTIpoReg_CedulaCitacionConJur.getCorrelativo() + "-" + convertToLocalDateViaInstant(vTIpoReg_CedulaCitacionConJur.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(vTIpoReg_CedulaCitacionConJur.getNombreConsumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<direccion>");
            xReplaceDescr.setReplaceString(vTIpoReg_CedulaCitacionConJur.getDireccionConsumidor() + " zona "+vTIpoReg_CedulaCitacionConJur.getZonaConsumidor());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<muni_depto>");
            xReplaceDescr.setReplaceString(vTIpoReg_CedulaCitacionConJur.getDptoConsumidorMuni());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<telefono_cons>");
            xReplaceDescr.setReplaceString(vTIpoReg_CedulaCitacionConJur.getTelefonosConsumidor());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_proveedor>");
            xReplaceDescr.setReplaceString(vTIpoReg_CedulaCitacionConJur.getNombreProveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            LocalDateTime dateCitacion = vTIpoReg_CedulaCitacionConJur.getFechaCita().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

            xReplaceDescr.setSearchString("<fecha_mes_letras>");
            xReplaceDescr.setReplaceString(dateCitacion.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<cita_hora>");
            xReplaceDescr.setReplaceString(String.valueOf(dateCitacion.getHour()) + ":" + ((String.valueOf(dateCitacion.getMinute())).equals("0") ? "00" : (String.valueOf(dateCitacion.getMinute()))));
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + vTIpoReg_CedulaCitacionConJur.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    //DIACO-AS-FO-08 PRO
    @Override
    public Response getCedulaCitacionProJuridico(Integer pIdAudiencia, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_CedulaCitacionProJur vTipoReg_CedulaCitacionProJur = tipoDao.findByIdAudienciaTipoReg_CedCitacionPro(pIdAudiencia);

            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Load the Document
            String myTemplate = workingDir + "DIACO-AS-FO-08_PROV.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            TipoUsuario vTipoUsuario = tipoDao.findByIdUsuarioSec(vTipoReg_CedulaCitacionProJur.getCreadoPor());

            xReplaceDescr.setSearchString("<usuario_asignado>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoUsuario.getNombre()));
            xReplaceable.replaceAll(xReplaceDescr);

            LocalDate hoy = LocalDate.now();
            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_CedulaCitacionProJur.getQuejanumero()) + "-" + vTipoReg_CedulaCitacionProJur.getAnioQueja());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fechaNumLetras>");
            xReplaceDescr.setReplaceString(convertToLocalDateViaInstant(vTipoReg_CedulaCitacionProJur.getFechaCreacion()).format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);
            
            

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaCitacionProJur.getCorrelativo() + "-" +convertToLocalDateViaInstant(vTipoReg_CedulaCitacionProJur.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_proveedor>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaCitacionProJur.getNombreProveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<direccion_proveedor>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaCitacionProJur.getDireccionProveedor()+ " zona "+ vTipoReg_CedulaCitacionProJur.getZonaProveedor());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<muni_depto>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaCitacionProJur.getDptoProveedorMuni());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<telefono_prov>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaCitacionProJur.getTelefonosProveedor());
            xReplaceable.replaceAll(xReplaceDescr);

            LocalDateTime dateCitacion = vTipoReg_CedulaCitacionProJur.getFechaCita().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime();

            xReplaceDescr.setSearchString("<fecha_mes_letras>");
            xReplaceDescr.setReplaceString(dateCitacion.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<cita_hora>");
            xReplaceDescr.setReplaceString(String.valueOf(dateCitacion.getHour()) + ":" + ((String.valueOf(dateCitacion.getMinute())).equals("0") ? "00" : (String.valueOf(dateCitacion.getMinute()))));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(vTipoReg_CedulaCitacionProJur.getNombreConsumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + vTipoReg_CedulaCitacionProJur.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    /*DIACO-AS-FO-10*/
    @Override
    public Response getCedulaNotificacionCitacionCorreo(Integer pIdAudiencia, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_RegCedulaNotificacionCitCorreo tipoReg_RegCedulaNotificacionCitCorreo = tipoDao.findByIdAudienciaRegCedNotiCitCorreo(pIdAudiencia);
            TipoUsuario vTipoUsuario=tipoDao.findByIdUsuarioSec(tipoReg_RegCedulaNotificacionCitCorreo.getCreadoPor());
            TipoQueja vTipoQueja=tipoDao.findByIdQueja(tipoReg_RegCedulaNotificacionCitCorreo.getIdQueja());

            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AS-FO-10.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            
            xReplaceDescr.setSearchString("<asignado_a>");
            xReplaceDescr.setReplaceString(vTipoUsuario.getNombre());
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<no_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(tipoReg_RegCedulaNotificacionCitCorreo.getQuejanumero())+"-"+vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(tipoReg_RegCedulaNotificacionCitCorreo.getCorrelativoCitacion()+"-"+convertToLocalDateViaInstant(tipoReg_RegCedulaNotificacionCitCorreo.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<notificacion_hacia>");
            xReplaceDescr.setReplaceString(tipoReg_RegCedulaNotificacionCitCorreo.getCitacionHacia());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_citacion>");
            if (tipoReg_RegCedulaNotificacionCitCorreo.getFechaCitacion() != null) {
                xReplaceDescr.setReplaceString(getFechaEnLetras(tipoReg_RegCedulaNotificacionCitCorreo.getFechaCitacion()));
            } else {
                xReplaceDescr.setReplaceString("");
            }
            xReplaceable.replaceAll(xReplaceDescr);
            
            
            xReplaceDescr.setSearchString("<fecha_actual_num_art_letras>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(tipoReg_RegCedulaNotificacionCitCorreo.getFechaCitacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + tipoReg_RegCedulaNotificacionCitCorreo.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    /*DIACO-AS-FO-11*/
    @Override
    public Response getCedulaNotificacionResCorreo(Integer pIdAudiencia, String pToken) {
        try {

            tipoDao.TokenCheck(pToken);
            TipoReg_CedulaNotificacionResCorreo tipoReg_CedulaNotificacionResCorreo = tipoDao.findTipoReg_CedNotificacionResCorreo(pIdAudiencia);
            TipoQueja vTipoQueja=tipoDao.findByIdQueja(tipoReg_CedulaNotificacionResCorreo.getIdQueja());
            TipoUsuario vTipoUsuario=tipoDao.findByIdUsuarioSec(tipoReg_CedulaNotificacionResCorreo.getCreadoPor());
            // Initialise
            //String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AS-FO-11.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            
            xReplaceDescr.setSearchString("<usuario_asignado>");
            xReplaceDescr.setReplaceString(vTipoUsuario.getNombre());
            xReplaceable.replaceAll(xReplaceDescr);
            
            xReplaceDescr.setSearchString("<no_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(tipoReg_CedulaNotificacionResCorreo.getQuejanumero())+"-"+vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(tipoReg_CedulaNotificacionResCorreo.getCorrelativoNotificacion()+"-"+convertToLocalDateViaInstant(tipoReg_CedulaNotificacionResCorreo.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_a_notificar>");
            xReplaceDescr.setReplaceString(tipoReg_CedulaNotificacionResCorreo.getNotificacionHacia().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_resolucion>");
            if (tipoReg_CedulaNotificacionResCorreo.getFechaResolucion() != null) {
                xReplaceDescr.setReplaceString(getFechaEnLetras(tipoReg_CedulaNotificacionResCorreo.getFechaResolucion()));
            } else {
                xReplaceDescr.setReplaceString("");
            }
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_actual_num_art_letras>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(tipoReg_CedulaNotificacionResCorreo.getFechaResolucion()));
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + tipoReg_CedulaNotificacionResCorreo.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    @Override
    public Response getResArchivoUnicaAudiencia(Integer pId_Queja, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);
            TipoReg_ResArchivoUnicaAudienciaConc resArchivo = tipoDao.findByIdResArchivoUnicaAudConc(pId_Queja);
            TipoQueja vTipoQueja=tipoDao.findByIdQueja(resArchivo.getIdQueja());

            // Initialise
            //  String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AQ-FO-11.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate dateCitacion = LocalDate.now();
            int day = dateCitacion.getDayOfMonth();
            String mes = dateCitacion.format(DateTimeFormatter.ofPattern("MMMM"));
            String mesUpper = mes.substring(0, 1).toUpperCase() + mes.substring(1);
            int year = dateCitacion.getYear();
            NumerosEnLetras nl = new NumerosEnLetras();
            String dia = nl.convertir(day);
            String anio = nl.convertir(year);

            xReplaceDescr.setSearchString("<num_correlativo>");
            xReplaceDescr.setReplaceString(String.valueOf(resArchivo.getIdCorrelativoUnicaAudiencia()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(resArchivo.getNo_queja() + "-" + vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            String numQuejaLetras = nl.convertir(Integer.parseInt(resArchivo.getNo_queja())) + " guion " + anio;
            xReplaceDescr.setSearchString("<num_quejaLetras>");
            xReplaceDescr.setReplaceString(numQuejaLetras);
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_queja_enLetras>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(resArchivo.getFechaCreacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_cons>");
            xReplaceDescr.setReplaceString(resArchivo.getNombreConsumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_prov>");
            xReplaceDescr.setReplaceString(resArchivo.getNombreProveedor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=ComPerm" + resArchivo.getIdQueja() + ".pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    //DIACO-AS-FO-12
    @Override
    public Response getCaratulaJuridico(Integer pId_Queja, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);

            TipoQueja vTipoQueja = tipoDao.findByIdQueja(pId_Queja);
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());

            // Initialise
            //  String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AS-FO-12.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate dateCitacion = LocalDate.now();
            int day = dateCitacion.getDayOfMonth();
            String mes = dateCitacion.format(DateTimeFormatter.ofPattern("MMMM"));
            String mesUpper = mes.substring(0, 1).toUpperCase() + mes.substring(1);
            int year = dateCitacion.getYear();
            NumerosEnLetras nl = new NumerosEnLetras();
            String dia = nl.convertir(day);
            String anio = nl.convertir(year);

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(vTipoConsumidor.getNombreCompleto().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<direccion_consumidor>");
            xReplaceDescr.setReplaceString(vTipoConsumidor.getDireccion() + ", " + vTipoConsumidor.getDireccion_zona() + ", " + vTipoConsumidor.getTipoMunicipio().getNombre_municipio() + ", " + vTipoConsumidor.getTipoDepartamento().getNombre_departamento());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<telefono_consumidor>");
            xReplaceDescr.setReplaceString(CommaSeparatedTelef(vTipoConsumidor.getId_consumidor(), "C"));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_proveedor>");
            // xReplaceDescr.setReplaceString((vTipoProveedor.getTipo_proveedor()==6)?vTipoProveedor.getNombreCompletoIndividual():vTipoProveedor.getNombre());
            xReplaceDescr.setReplaceString(vTipoProveedor.getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<direccion_proveedor>");
            xReplaceDescr.setReplaceString(vTipoQueja.getDireccion_proveedor() + " zona " + vTipoQueja.getZona_proveedor() + ", " + vTipoQueja.getTipoMunicipioProv().getNombre_municipio() + ", " + vTipoQueja.getTipoDepartamentoProv().getNombre_departamento()
            );
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<telefono_proveedor>");
            xReplaceDescr.setReplaceString(CommaSeparatedTelef(vTipoQueja.getId_proveedor(), "P"));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<numero_queja>");
            xReplaceDescr.setReplaceString(vTipoQueja.getNo_queja() + "-" + vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<asignado_a>");
            xReplaceDescr.setReplaceString(vTipoQueja.getTipoUsuario().getNombre());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=caratula.pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    // DIACO_AS-FO-01
    @Override
    public Response getAperturaPrueba(Integer pIdResultAudiencia, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);

            TipoReg_ResolucionAperturaAPrueba vTipoReg_ResolucionAperturaAPrueba = tipoDao.findByResAperturaPruebaIdResAudiencia(pIdResultAudiencia);

            // Initialise
            //  String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AS-FO-01.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate hoy = LocalDate.now();

            TipoUsuario vTipoUsuario = tipoDao.findByIdUsuarioSec(Integer.parseInt(vTipoReg_ResolucionAperturaAPrueba.getAsignadoA()));
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(vTipoReg_ResolucionAperturaAPrueba.getIdQueja());
            xReplaceDescr.setSearchString("<usuario_asignado>");
            xReplaceDescr.setReplaceString(vTipoUsuario.getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_en_letras>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(vTipoReg_ResolucionAperturaAPrueba.getFechaResolucionApertura()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            // xReplaceDescr.setReplaceString((vTipoProveedor.getTipo_proveedor()==6)?vTipoProveedor.getNombreCompletoIndividual():vTipoProveedor.getNombre());
            xReplaceDescr.setReplaceString(vTipoReg_ResolucionAperturaAPrueba.getCorrelativo() + "-" + convertToLocalDateViaInstant(vTipoReg_ResolucionAperturaAPrueba.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_ResolucionAperturaAPrueba.getQuejanumero()) + "-" + vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<consumidor>");
            xReplaceDescr.setReplaceString(vTipoReg_ResolucionAperturaAPrueba.getConsumidor().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<proveedor>");
            xReplaceDescr.setReplaceString(vTipoReg_ResolucionAperturaAPrueba.getProveedor());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=aperturaPrueba.pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }
    
    
    
    // DIACO-AS-FO-02 resolucion final
    @Override
    public Response getResolucionFinal(Integer pIdResultAudiencia, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);

            TipoReg_ResolucionFinal vTipoReg_ResolucionFinal = tipoDao.findByResultResolucionFinal(pIdResultAudiencia);

            // Initialise
            //  String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AS-FO-02.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            

            TipoUsuario vTipoUsuario = tipoDao.findByIdUsuarioSec(vTipoReg_ResolucionFinal.getCreadoPor());
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(vTipoReg_ResolucionFinal.getIdQueja());
         
            xReplaceDescr.setSearchString("<asignado_a>");
            xReplaceDescr.setReplaceString(vTipoUsuario.getNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_creacion_en_letras>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(vTipoReg_ResolucionFinal.getFechaCreacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
             xReplaceDescr.setReplaceString(vTipoReg_ResolucionFinal.getCorrelativo() + "-" + convertToLocalDateViaInstant(vTipoReg_ResolucionFinal.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_ResolucionFinal.getQuejanumero()) + "-" + vTipoQueja.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<nombre_consumidor>");
            xReplaceDescr.setReplaceString(vTipoReg_ResolucionFinal.getConsumidorNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            if(vTipoReg_ResolucionFinal.getProveedorNombre().toUpperCase().substring(0, 1).equals("I"))
            {
             xReplaceDescr.setSearchString("<y_e>");
             xReplaceDescr.setReplaceString("e");
             xReplaceable.replaceAll(xReplaceDescr);
            } else 
            {
             xReplaceDescr.setSearchString("<y_e>");
             xReplaceDescr.setReplaceString("y");
             xReplaceable.replaceAll(xReplaceDescr);
            }
            xReplaceDescr.setSearchString("<nombre_proveedor>");
            xReplaceDescr.setReplaceString(vTipoReg_ResolucionFinal.getProveedorNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=resolucionFInal.pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }


    
    // DIACO_AS-FO-07  REBELDIA
    @Override
    public Response getDeclaracionRebeldia(Integer pIdResAudiencia, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);

            TipoReg_DeclaracionRebeldia vTipoReg_DeclaracionRebeldia =  tipoDao.findByResDeclaracionRebeldia(pIdResAudiencia);

            // Initialise
            //  String oooExeFolder = "/opt/libreoffice6.1/program";
            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
            //XComponentContext xContext = Bootstrap.bootstrap();

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            // Load the Document
            //String workingDir = "/home/julio/Documents/Mineco/proyPrototipo/diacoRegistros/";
            String myTemplate = workingDir + "DIACO-AS-FO-07.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);
//xComp.dispose();

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate hoy = LocalDate.now();

            //TipoUsuario vTipoUsuario = tipoDao.findByIdUsuarioSec(Integer.parseInt(vTipoReg_ResolucionAperturaAPrueba.getAsignadoA()));
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(vTipoReg_DeclaracionRebeldia.getIdQueja());
            xReplaceDescr.setSearchString("<usuario_asignado>");
            xReplaceDescr.setReplaceString(vTipoReg_DeclaracionRebeldia.getTipoUsuario().getNombre());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_en_letras>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(vTipoReg_DeclaracionRebeldia.getFechaCreacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(vTipoReg_DeclaracionRebeldia.getCorrelativo() + "-" + convertToLocalDateViaInstant(vTipoReg_DeclaracionRebeldia.getFechaCreacion()).getYear());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<num_queja>");
            xReplaceDescr.setReplaceString(String.valueOf(vTipoReg_DeclaracionRebeldia.getQuejanumero()) + "-" + vTipoReg_DeclaracionRebeldia.getAnio());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<consumidor_nombre>");
            xReplaceDescr.setReplaceString(vTipoReg_DeclaracionRebeldia.getConsumidorNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<proveedor_nombre>");
            xReplaceDescr.setReplaceString(vTipoReg_DeclaracionRebeldia.getProveedorNombre().toUpperCase());
            xReplaceable.replaceAll(xReplaceDescr);

             xReplaceDescr.setSearchString("<fecha_letras_notificacion>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(vTipoReg_DeclaracionRebeldia.getFechaNotificacion()));
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<fecha_letras_2da_audiencia>");
            xReplaceDescr.setReplaceString(getFechaEnLetras(vTipoReg_DeclaracionRebeldia.getFechaSegundaAudiencia()));
            xReplaceable.replaceAll(xReplaceDescr);
            
            
            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=aperturaPrueba.pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    
    
    
    @Override
    public Response getMovimientoExpediente(Integer pId_Mov, String pToken) {
        try {
            tipoDao.TokenCheck(pToken);
            TipoReg_MovimExp resMovExp = tipoDao.findByIdRegMovExpediente(pId_Mov);

            List<TipoReg_MovimExpDet> movExpDetalle = tipoDao.findByIdRegMovExpedienteDetalle(pId_Mov);

            XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

            XMultiComponentFactory xMCF = xContext.getServiceManager();

            Object oDesktop = xMCF.createInstanceWithContext(
                    "com.sun.star.frame.Desktop", xContext);

            XDesktop xDesktop = (XDesktop) UnoRuntime.queryInterface(
                    XDesktop.class, oDesktop);

            Locale.setDefault(new Locale("es", "GT", "UNIX"));

            String myTemplate = workingDir + "DIACO-AQ-FO-03.docx";

            if (!new File(myTemplate).canRead()) {
                throw new RuntimeException("Cannot load template:" + new File(myTemplate));
            }

            XComponentLoader xCompLoader = (XComponentLoader) UnoRuntime
                    .queryInterface(com.sun.star.frame.XComponentLoader.class, xDesktop);

            String sUrl = "file:///" + myTemplate;

            PropertyValue[] propertyValues = new PropertyValue[0];

            propertyValues = new PropertyValue[1];
            propertyValues[0] = new PropertyValue();
            propertyValues[0].Name = "Hidden";
            propertyValues[0].Value = new Boolean(true);

            XComponent xComp = xCompLoader.loadComponentFromURL(
                    sUrl, "_blank", 0, propertyValues);

            // Manipulate
            XReplaceDescriptor xReplaceDescr = null;
            XReplaceable xReplaceable = null;

            XTextDocument xTextDocument = (XTextDocument) UnoRuntime
                    .queryInterface(XTextDocument.class, xComp);
            //xTextDocument.dispose();

            xReplaceable = (XReplaceable) UnoRuntime
                    .queryInterface(XReplaceable.class,
                            xTextDocument);

            xReplaceDescr = (XReplaceDescriptor) xReplaceable
                    .createReplaceDescriptor();

            Locale.setDefault(new Locale("es", "GT", "UNIX"));
            LocalDate dateCitacion = LocalDate.now();

            xReplaceDescr.setSearchString("<fecha_entrega>");
            xReplaceDescr.setReplaceString(convertToLocalDateViaInstant(resMovExp.getFecha_entrega()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            xReplaceable.replaceAll(xReplaceDescr);
            

            xReplaceDescr.setSearchString("<depto_envia>");
            xReplaceDescr.setReplaceString(resMovExp.getDpto_envia());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<depto_recibe>");
            xReplaceDescr.setReplaceString(resMovExp.getDpto_recibe());
            xReplaceable.replaceAll(xReplaceDescr);

            xReplaceDescr.setSearchString("<correlativo>");
            xReplaceDescr.setReplaceString(String.valueOf(resMovExp.getNo()));
            xReplaceable.replaceAll(xReplaceDescr);

            XMultiServiceFactory mxDocFactory;

            mxDocFactory = UnoRuntime.queryInterface(
                    XMultiServiceFactory.class, xTextDocument);
            XTextCursor mxDocCursor = null;

            XText mxDocText = xTextDocument.getText();
            mxDocCursor = mxDocText.createTextCursor();

            XParagraphCursor xParaCursor = (XParagraphCursor) UnoRuntime.queryInterface(
                    XParagraphCursor.class, mxDocCursor);
            //xParaCursor.gotoPreviousParagraph ( false );

            /*  xParaCursor.gotoNextParagraph(false);
            xParaCursor.gotoNextParagraph(false);
            xParaCursor.gotoNextParagraph(false);
            xParaCursor.gotoNextParagraph(false);*/
            // mxDocCursor.gotoEnd(false);
            XTextTable xTable = UnoRuntime.queryInterface(
                    XTextTable.class, mxDocFactory.createInstance(
                            "com.sun.star.text.TextTable"));

            // Specify that we want the table to have 4 rows and 4 columns
            xTable.initialize(movExpDetalle.size() + 1, 6);

            // Insert the table into the document
            mxDocText.insertTextContent(mxDocCursor, xTable, false);
            // Get an XIndexAccess of the table rows
            XIndexAccess xRows = xTable.getRows();
            XIndexAccess xColumn = xTable.getColumns();

            // Access the property set of the first row (properties listed in
            // service description: com.sun.star.text.TextTableRow)
            XPropertySet xRow = UnoRuntime.queryInterface(
                    XPropertySet.class, xRows.getByIndex(0));
            // If BackTransparent is false, then the background color is visible
            xRow.setPropertyValue("BackTransparent", Boolean.FALSE);
            // Specify the color of the background to be dark blue
            xRow.setPropertyValue("BackColor", 0xBFBFBF);

            // Access the property set of the whole table para cambiar
            // el ancho de las columnas******************************
            XPropertySet xTableProps = UnoRuntime.queryInterface(
                    XPropertySet.class, xTable);

            Object xObj = xTableProps.getPropertyValue("TableColumnSeparators");

            short sTableColumnRelativeSum = (Short) xTableProps.getPropertyValue("TableColumnRelativeSum");

            TableColumnSeparator[] xSeparators = (TableColumnSeparator[]) UnoRuntime.queryInterface(
                    TableColumnSeparator[].class, xObj);
            short pos0 = (short) Math.ceil(sTableColumnRelativeSum * 0.04);
            xSeparators[0].Position = pos0;
            short pos1 = (short) ((Math.ceil(sTableColumnRelativeSum * 0.10)) + pos0);
            xSeparators[1].Position = pos1;
            short pos2 = (short) ((Math.ceil(sTableColumnRelativeSum * 0.12)) + pos1);
            xSeparators[2].Position = pos2;
            short pos3 = (short) ((Math.ceil(sTableColumnRelativeSum * 0.20)) + pos2);
            xSeparators[3].Position = pos3;
            short pos4 = (short) ((Math.ceil(sTableColumnRelativeSum * 0.20)) + pos3);
            xSeparators[4].Position = pos4;

            xTableProps.setPropertyValue("TableColumnSeparators", xSeparators);

            // ***********************set the text  of all the cells in the first row
            // of the table
            insertIntoCell("A1", "No.", xTable);
            insertIntoCell("B1", "Queja No.", xTable);
            insertIntoCell("C1", "Via de Ingreso", xTable);
            insertIntoCell("D1", "Consumidor", xTable);
            insertIntoCell("E1", "Proveedor", xTable);
            insertIntoCell("F1", "Observaciones", xTable);

            // Insert random numbers into the first this three cells of each
            // remaining row
            int i = 2;
            for (Iterator<TipoReg_MovimExpDet> iterator = movExpDetalle.iterator(); iterator.hasNext();) {
                TipoReg_MovimExpDet next = iterator.next();
                // for (int i = 2; i < 21; i++) {
                xTable.getCellByName("A" + i).setValue(i - 1);
                setCellText("B" + i, next.getQueja_no(), xTable);
                setCellText("C" + i, next.getVia_de_ingreso(), xTable);
                setCellText("D" + i, next.getNombre_consumidor(), xTable);
                setCellText("E" + i, next.getNombre_proveedor(), xTable);
                setCellText("F" + i, next.getObservaciones(), xTable);
                i++;

            }

            OOoOutputStream output = new OOoOutputStream();

            // save as a PDF 
            XStorable xStorable = (XStorable) UnoRuntime
                    .queryInterface(XStorable.class, xComp);

            propertyValues = new PropertyValue[2];
            // Setting the flag for overwriting
            propertyValues[0] = new PropertyValue();
            propertyValues[1] = new PropertyValue();

            propertyValues[0].Name = "OutputStream";
            propertyValues[0].Value = output;
            // Setting the filter name

            propertyValues[1].Name = "FilterName";
            propertyValues[1].Value = "writer_pdf_Export";

            // Appending the favoured extension to the origin document name
            xStorable.storeToURL("private:stream", propertyValues);

            // shutdown
            //xDesktop.terminate();
            // close document
            XCloseable xcloseable = (XCloseable) UnoRuntime.queryInterface(XCloseable.class, xComp);
            xcloseable.close(false);
            ByteArrayInputStream inStream = new ByteArrayInputStream(output.toByteArray());

            ResponseBuilder response = Response.ok((Object) inStream);
            response.header("Content-Disposition", "attachment;filename=MovReg.pdf");
            return response.build();

        } catch (Exception e) {
            e.printStackTrace();
            ResponseBuilder response = Response.serverError();
            return response.build();
        }
    }

    private String getFechaEnLetras(Date date) {

        LocalDate dateVerificacion = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        int day = dateVerificacion.getDayOfMonth();
        String mes = dateVerificacion.format(DateTimeFormatter.ofPattern("MMMM"));
        String mesUpper = mes.substring(0, 1).toUpperCase() + mes.substring(1);
        int year = dateVerificacion.getYear();
        NumerosEnLetras nl = new NumerosEnLetras();
        String dia = nl.convertir(day);
        String anio = nl.convertir(year);

        return dia + " de " + mesUpper + " de " + anio;

    }

    /**
     * This method returns a random double which isn't too high or too low
     */
    protected double getRandomDouble() {
        Random maRandom = null;
        maRandom = new Random();
        return ((maRandom.nextInt() % 1000) * maRandom.nextDouble());
    }

    protected static void insertIntoCell(String sCellName, String sText,
            XTextTable xTable) {
        // Access the XText interface of the cell referred to by sCellName
        XText xCellText = UnoRuntime.queryInterface(
                XText.class, xTable.getCellByName(sCellName));

        // create a text cursor from the cells XText interface
        XTextCursor xCellCursor = xCellText.createTextCursor();
        // Get the property set of the cell's TextCursor
        /*  XPropertySet xCellCursorProps = UnoRuntime.queryInterface(
                XPropertySet.class, xCellCursor);

        try {
            // Set the colour of the text to white
            xCellCursorProps.setPropertyValue("CharColor", Integer.valueOf(16777215));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        // Set the text in the cell to sText
        xCellText.setString(sText);
    }

    /**
     * @return the tipoDao
     */
    public TipoRepository getTipoDao() {
        return tipoDao;
    }

    /**
     * @param tipoDao the tipoDao to set
     */
    public void setTipoDao(TipoRepository tipoDao) {
        this.tipoDao = tipoDao;
    }

    private void setCellText(String cellName, String data, XTextTable table) // puts text into the named cell of the table
    {
        XText cellText = qi(XText.class, table.getCellByName(cellName));
        cellText.setString(data);
    }  // end of setCellText()

    public <T> T qi(Class<T> aType, Object o) // the "Loki" function -- reduces typing
    {
        return UnoRuntime.queryInterface(aType, o);
    }

    private String getFuente(String fuente) {
        String fuenteTransformada = "";
        switch (fuente) {
            case "presentially":
                fuenteTransformada = "Presencial";
                break;
            case "webMobil":
                fuenteTransformada = "Mobil";
                break;
            case "Web user":
                fuenteTransformada = "Web";
                break;
            default:
                fuenteTransformada = fuente;

        }
        return fuenteTransformada;
    }

    private String CommaSeparatedTelef(Integer id_CP, String esCP) {
        List<TipoTelefono> vTipoTelefono = tipoDao.findAllTiposTelefono(id_CP, esCP);
        if (!vTipoTelefono.isEmpty()) {
            boolean First = true;
            String StrOutput = "";
            for (TipoTelefono loc : vTipoTelefono) {
                if (First) {
                    First = false;
                    StrOutput = StrOutput + loc.getTelefono();
                } else {
                    StrOutput = StrOutput + ", " + loc.getTelefono();
                }
            }
            return StrOutput;
        } else {
            return "";
        }
    }

    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
    
    private String getUnderLineSpacesCedulasNotis(String muni,String depto)
    {
        int diff=44-muni.length()-depto.length();
           String underline="";
            for (int i = 0; i < diff; i++) {
               underline=underline+"_";
                
            }
            return underline;
        
    }

}
