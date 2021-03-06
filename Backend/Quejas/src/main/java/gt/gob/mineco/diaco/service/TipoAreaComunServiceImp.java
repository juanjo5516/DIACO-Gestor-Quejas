package gt.gob.mineco.diaco.service;

import com.google.gson.JsonObject;
import gt.gob.mineco.diaco.dao.TipoRepository;
import gt.gob.mineco.diaco.dto.UsuarioTemporalDto;
import gt.gob.mineco.diaco.exception.ErrorException;
import gt.gob.mineco.diaco.model.TIpoReg_CedulaCitacionConJur;
import gt.gob.mineco.diaco.model.TipoActividadEconomica;
import gt.gob.mineco.diaco.model.TipoAreaInterna;
import gt.gob.mineco.diaco.model.TipoAudiencia;
import gt.gob.mineco.diaco.model.TipoBitacora;
import gt.gob.mineco.diaco.model.TipoCatalogo;
import gt.gob.mineco.diaco.model.TipoColaAsignacion;
import gt.gob.mineco.diaco.model.TipoComConsumidor;
import gt.gob.mineco.diaco.model.TipoComercio;
import gt.gob.mineco.diaco.model.TipoConcVirtInt;
import gt.gob.mineco.diaco.model.TipoConfirmarAccion;
import gt.gob.mineco.diaco.model.TipoConsumidor;
import gt.gob.mineco.diaco.model.TipoDepartamento;
import gt.gob.mineco.diaco.model.TipoDepartamentoInterno;
import gt.gob.mineco.diaco.model.TipoDiaInhabil;
import gt.gob.mineco.diaco.model.TipoEmail;
import gt.gob.mineco.diaco.model.TipoEmailEnviar;
import gt.gob.mineco.diaco.model.TipoEmailFuente;
import gt.gob.mineco.diaco.model.TipoEtnia;
import gt.gob.mineco.diaco.model.TipoExpiracion;
import gt.gob.mineco.diaco.model.TipoFlujo;
import gt.gob.mineco.diaco.model.TipoFlujoGuia;
import gt.gob.mineco.diaco.model.TipoMagicLink;
import gt.gob.mineco.diaco.model.TipoMotivoQueja;
import gt.gob.mineco.diaco.model.TipoMotivoQuejaFinalizada;
import gt.gob.mineco.diaco.model.TipoMovimExp;
import gt.gob.mineco.diaco.model.TipoMovimExpDetalle;
import gt.gob.mineco.diaco.model.TipoMovimientos;
import gt.gob.mineco.diaco.model.TipoMunicipio;
import gt.gob.mineco.diaco.model.TipoPais;
import gt.gob.mineco.diaco.model.TipoParamGeneral;
import gt.gob.mineco.diaco.model.TipoPasoQueja;
import gt.gob.mineco.diaco.model.TipoProgramaAudiencia;
import gt.gob.mineco.diaco.model.TipoProveedor;
import gt.gob.mineco.diaco.model.TipoProveedorAprobar;
import gt.gob.mineco.diaco.model.TipoPuesto;
import gt.gob.mineco.diaco.model.TipoQueja;
import gt.gob.mineco.diaco.model.TipoQuejaAsignacion;
import gt.gob.mineco.diaco.model.TipoQuejaFinalizada;
import gt.gob.mineco.diaco.model.TipoQuejaRegistro;
import gt.gob.mineco.diaco.model.TipoReasignar;
import gt.gob.mineco.diaco.model.TipoReg_ActaConciliacion;
import gt.gob.mineco.diaco.model.TipoReg_ActaIncomparecencia;
import gt.gob.mineco.diaco.model.TipoReg_ActaJuridico;
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
import gt.gob.mineco.diaco.model.TipoRegistro;
import gt.gob.mineco.diaco.model.TipoResAudiencia;
import gt.gob.mineco.diaco.model.TipoResFinal;
import gt.gob.mineco.diaco.model.TipoSede;
import gt.gob.mineco.diaco.model.TipoSucursal;
import gt.gob.mineco.diaco.model.TipoTareaProgramadaEjec;
import gt.gob.mineco.diaco.model.TipoTelefono;
import gt.gob.mineco.diaco.model.TipoTipoCola;
import gt.gob.mineco.diaco.model.TipoTipoConsumidor;
import gt.gob.mineco.diaco.model.TipoUsuario;
import gt.gob.mineco.diaco.model.TipoUsuarioPerfil;
import gt.gob.mineco.diaco.model.TipoUsuarioPerfilPK;
import gt.gob.mineco.diaco.model.TipoUsuario_Conf;
import gt.gob.mineco.diaco.model.TipoUsuario_Simple;
import gt.gob.mineco.diaco.model.TipoVerifConcVirt;
import gt.gob.mineco.diaco.model.TipoVerifDatosInt;
import gt.gob.mineco.diaco.model.TipoVisitaCampo;
import gt.gob.mineco.diaco.model.TipoVyvAsignaCola;
import gt.gob.mineco.diaco.model.Tipo_RegResArchivoConciliacion;
import gt.gob.mineco.diaco.util.CedulaNotificacionDto;
import gt.gob.mineco.diaco.util.CheckNull;
import gt.gob.mineco.diaco.util.Constants;
import gt.gob.mineco.diaco.util.Crypto;
import gt.gob.mineco.diaco.util.Email;
import gt.gob.mineco.diaco.util.FormAudiencia;
import gt.gob.mineco.diaco.util.FormBitacora;
import gt.gob.mineco.diaco.util.FormBusqueda;
import gt.gob.mineco.diaco.util.FormComConsumidor;
import gt.gob.mineco.diaco.util.FormConcVirtInt;
import gt.gob.mineco.diaco.util.FormConfColas;
import gt.gob.mineco.diaco.util.FormConfGeneral;
import gt.gob.mineco.diaco.util.FormConfUsuario;
import gt.gob.mineco.diaco.util.FormConsumidor;
import gt.gob.mineco.diaco.util.FormEstadoResolver;
import gt.gob.mineco.diaco.util.FormMotivoQuejaFinalizacion;
import gt.gob.mineco.diaco.util.FormMovimExp;
import gt.gob.mineco.diaco.util.FormParamGeneral;
import gt.gob.mineco.diaco.util.FormProveedor;
import gt.gob.mineco.diaco.util.FormQuejaFinalizada;
import gt.gob.mineco.diaco.util.FormRegistro;
import gt.gob.mineco.diaco.util.FormResAudiencia;
import gt.gob.mineco.diaco.util.FormSede;
import gt.gob.mineco.diaco.util.FormSimple;
import gt.gob.mineco.diaco.util.FormSucursal;
import gt.gob.mineco.diaco.util.FormTipoCola;
import gt.gob.mineco.diaco.util.FormTipoComercio;
import gt.gob.mineco.diaco.util.FormUsuarioSrch;
import gt.gob.mineco.diaco.util.FormVerifConcVirt;
import gt.gob.mineco.diaco.util.FormViewMainQueja1;
import gt.gob.mineco.diaco.util.FormViewMainQueja2;
import gt.gob.mineco.diaco.util.FormVisitaCampo;
import gt.gob.mineco.diaco.util.ResponseRs;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.transaction.UserTransaction;
import org.apache.commons.lang3.RandomStringUtils;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class TipoAreaComunServiceImp implements TipoAreaComunService {

    @Inject
    private TipoRepository tipoDao;
    @Inject
    private Email email;
    @Inject
    private SecurityManagerServiceImpl smsi;
    @Inject
    private Crypto cryptoSvc;
    //Crypto cryptoSvc;
    String[] ArrMagicLink = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    /**
     * Servicio de notificaciones.
     */
    @Inject
    NotificacionCorreoImp notificacionService;
    // Constante que almacena la cadena: ERROR.
    private static final String ERROR = "ERROR";

    //queja
    @Override
    public ResponseRs listTiposQueja(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposQueja());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs listTiposQueja(Integer id, String Type, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposQueja(id, Type));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getTipoQuejaCodigo(String codigoqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoQuejaCodigo(codigoqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getTipoQueja(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();
        System.out.println("Entrando a getTipoQueja (idqueja): " + idqueja);
        System.out.println("Entrando a getTipoQueja (token): " + token);

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdQueja(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs updateTipoQueja(TipoQueja tipoQueja) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(tipoQueja.getId_queja());

            if (vTipoQueja != null) {

                if (vTipoQueja.getId_estado_queja() < tipoQueja.getId_estado_queja()) {
                    vTipoQueja.setId_estado_queja(tipoQueja.getId_estado_queja());
                }

                tipoDao.saveQueja(vTipoQueja);

                response.setCode(0L);
                response.setReason("OK");
                response.setValue(vTipoQueja);
            } else {
                response.setCode(1L);
                response.setReason("NOT FOUND");
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs DocumentarTipoQueja(FormSimple formSimple) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            tipoDao.TokenCheck(formSimple.getToken());
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formSimple.getId_queja());
            if (formSimple.getValor() == 0) {
                vTipoQueja.setDocumentado("0");
            } else {
                vTipoQueja.setDocumentado("1");
            }
            vTipoQueja.setId_estado_queja(230); //nuevo estado pendiente de confirmar
            tipoDao.saveQueja(vTipoQueja);
            //bitacora auto log
            String txtmensaje = "Documentar Queja Guardado, queja enviada a Asesor Jur??dico";
            BitacoraAutomatica(formSimple.getId_queja(), 2, formSimple.getUsuario(), txtmensaje, txtmensaje, 0);
            //flujo guia
            saveTiposFlujoGuia(formSimple.getId_queja(), 9);
            //enviar queja a cola juridico luego de documentacion
            SaveConfirmarAccion(formSimple.getId_queja(), 2, "f");//flujo 2 juridico

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //email
    @Override
    public ResponseRs listEmail(Integer id, String Type, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposEmail(id, Type));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //telefono
    @Override
    public ResponseRs listTelefono(Integer id, String Type, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposTelefono(id, Type));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //consumidor
    @Override
    public ResponseRs listTiposConsumidor(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposConsumidor());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listTiposConsumidor(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdConsumidor(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs CustomFilterConsumidor(FormBusqueda formBusqueda) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(formBusqueda.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.CustomFilterConsumidor(formBusqueda));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //bitacora
    @Override
    public ResponseRs listTiposBitacora(Integer idqueja, Integer idflujo, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposBitacora(idqueja, idflujo));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getTipoBitacora(double id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdBitacora(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs addTipoBitacora(FormBitacora formBitacora) {
        ResponseRs response = new ResponseRs();
        Integer local_id_tipo_registro = null;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formBitacora.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            switch (formBitacora.getId_flujo()) {
                case 1:
                    local_id_tipo_registro = 12;
                    break;
                case 2:
                    local_id_tipo_registro = 26;
                    break;
                case 3:
                    local_id_tipo_registro = 23;
                    break;
                case 4:
                    local_id_tipo_registro = 13;
                    break;
                case 6:
                    local_id_tipo_registro = 16;
                    break;
            }
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formBitacora.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formBitacora.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formBitacora.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formBitacora.getUsuario());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_tipo_registro(local_id_tipo_registro);
            newTipoPasoQueja.setUsuario_operacion(formBitacora.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);
            //actualizar Bitacora
            TipoPasoQueja vTipoPasoQueja = tipoDao.findByTypePasoQueja(formBitacora.getId_queja(), local_id_tipo_registro);
            TipoBitacora newTipoBitacora = new TipoBitacora();
            newTipoBitacora.setId_queja_paso((int) vTipoPasoQueja.getId_queja_paso());
            newTipoBitacora.setBitacora(formBitacora.getBitacora());
            newTipoBitacora.setConsumidor(formBitacora.getConsumidor());
            newTipoBitacora.setFecha(new Date());
            newTipoBitacora.setId_queja(formBitacora.getId_queja());
            newTipoBitacora.setUsuario(formBitacora.getUsuario());
            newTipoBitacora.setId_tipo_registro(local_id_tipo_registro);
            newTipoBitacora.setId_flujo(formBitacora.getId_flujo());
            tipoDao.saveBitacora(newTipoBitacora);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(newTipoBitacora);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs updateTipoBitacora(FormBitacora formBitacora) {
        ResponseRs response = new ResponseRs();
        Integer local_id_tipo_registro = null;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formBitacora.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            switch (formBitacora.getId_flujo()) {
                case 1:
                    local_id_tipo_registro = 12;
                    break;
                case 2:
                    local_id_tipo_registro = 26;
                    break;
                case 3:
                    local_id_tipo_registro = 23;
                    break;
                case 4:
                    local_id_tipo_registro = 13;
                    break;
                case 6:
                    local_id_tipo_registro = 16;
                    break;
            }
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formBitacora.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formBitacora.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formBitacora.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formBitacora.getUsuario());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_tipo_registro(local_id_tipo_registro);
            newTipoPasoQueja.setUsuario_operacion(formBitacora.getUsuario());
            newTipoPasoQueja.setOperacion("U");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);

            TipoPasoQueja vTipoPasoQueja = tipoDao.findByTypePasoQueja(formBitacora.getId_queja(), local_id_tipo_registro);
            TipoBitacora vTipoBitacora = tipoDao.findByIdBitacora(formBitacora.getId());
            if (vTipoBitacora != null) {
                if (formBitacora.getBitacora() != null) {
                    vTipoBitacora.setBitacora(formBitacora.getBitacora());
                }
                if (formBitacora.getConsumidor() != null) {
                    vTipoBitacora.setConsumidor(formBitacora.getConsumidor());
                }

                vTipoBitacora.setId_tipo_registro(local_id_tipo_registro);
                vTipoBitacora.setId_flujo(formBitacora.getId_flujo());
                vTipoBitacora.setUsuario_actualizado(formBitacora.getUsuario());
                vTipoBitacora.setFecha_actualizado(new Date());
                vTipoBitacora.setId_queja_paso((int) vTipoPasoQueja.getId_queja_paso());
                tipoDao.saveBitacora(vTipoBitacora);
                response.setCode(0L);
                response.setReason("OK");
                response.setValue(vTipoBitacora);
                transaction.commit();
            } else {
                response.setCode(1L);
                response.setReason("NOT FOUND");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs deleteTipoBitacora(FormBitacora formBitacora) {
        ResponseRs response = new ResponseRs();
        Integer local_id_tipo_registro = null;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formBitacora.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            switch (formBitacora.getId_flujo()) {
                case 1:
                    local_id_tipo_registro = 12;
                    break;
                case 3:
                    local_id_tipo_registro = 23;
                    break;
                case 4:
                    local_id_tipo_registro = 13;
                    break;
                case 6:
                    local_id_tipo_registro = 16;
                    break;
            }
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formBitacora.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_queja(formBitacora.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formBitacora.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formBitacora.getUsuario());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_tipo_registro(local_id_tipo_registro);
            newTipoPasoQueja.setUsuario_operacion(formBitacora.getUsuario());
            newTipoPasoQueja.setOperacion("D");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            TipoBitacora vTipoBitacora = tipoDao.findByIdBitacora(formBitacora.getId());
            if (vTipoBitacora != null) {
                tipoDao.deleteBitacora(vTipoBitacora);
                response.setCode(0L);
                response.setReason("OK");
                response.setValue(vTipoBitacora);
            } else {
                response.setCode(1L);
                response.setReason("NOT FOUND");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //Catalogo
    @Override
    public ResponseRs listCatalogo(String tabla, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoCatalogo(tabla));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Comunicacion Consumidor GET
    @Override
    public ResponseRs listTiposComConsumidor(Integer idqueja, String token, Integer flujo) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposComConsumidores(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getTipoComConsumidor(Integer id, String token, Integer flujo) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdComConsumidor(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs addTipoComConsumidor(FormComConsumidor formComConsumidor) {
        ResponseRs response = new ResponseRs();
        boolean isUpdate = false; //VARIABLE QUE CONTIENE SI ES ACTUALIZACI??N O REGISTRO NUEVO
        Integer tipo_registro = 0; //diaco_cat_tipo_registro
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formComConsumidor.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            //verificar si es update o insert
            TipoComConsumidor vTipoComConsumidor; //tabla diaco_comunicacion_consumidor
            if (formComConsumidor.getId_queja() != null) {
                //vTipoComConsumidor = tipoDao.findAllTiposComConsumidor(formComConsumidor.getId_queja()); //recibe no. de queja
                /*if (vTipoComConsumidor != null) {
                    isUpdate = false; 
                    //isUpdate = false;
                }*/
            } else {
                response.setCode(1L);
                response.setReason("ERROR 1");
                return response;
            }

            //verificar flujo
            switch (formComConsumidor.getId_flujo()) {
                case 1:
                    tipo_registro = 3;
                    break;
                case 2:
                    tipo_registro = 29;
                    break;
                case 3:
                    tipo_registro = 20;
                    break;
            }//DEVUELVE EL TIPO DE REGISTRO SEGUIN EL FLUJO EN DONDE SE ENCUENTRE

            //ENLAZA CON TABla diaco_queja, actualiza depende el flujo.
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formComConsumidor.getId_queja());

            switch (formComConsumidor.getId_flujo()) {
                case 1:
                    if (vTipoQueja.getId_estado_queja() < 104) {
                        vTipoQueja.setId_estado_queja(104);
                    }
                    break;
                case 3:
                    if (vTipoQueja.getId_estado_queja() < 302) {
                        vTipoQueja.setId_estado_queja(302);
                    }
                    break;
            }

            tipoDao.saveQueja(vTipoQueja);

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formComConsumidor.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formComConsumidor.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formComConsumidor.getUsuario_operacion());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());// ASIGNA A NUEVO PASO_QUEJA LA SEDE A LA QUEJA CORRESPONDIENTE
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL); //ASIGNA SEDE CENTRAL
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(tipo_registro);
            newTipoPasoQueja.setUsuario_operacion(formComConsumidor.getUsuario_operacion());
            if (isUpdate) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            tipoDao.savePasoQueja(newTipoPasoQueja);

            System.out.println("LLEGO SIN ERROR");

            //validar campos y agregar nuevo registro
            vTipoComConsumidor = new TipoComConsumidor();
            if (formComConsumidor.getVia() != null) {
                vTipoComConsumidor.setVia(formComConsumidor.getVia());
            }
            if (formComConsumidor.getObservaciones() != null) {
                vTipoComConsumidor.setObservaciones(formComConsumidor.getObservaciones());
            }
            if (formComConsumidor.getEstatus() != null) {
                vTipoComConsumidor.setEstatus(formComConsumidor.getEstatus());
            }
            vTipoComConsumidor.setTipopasoqueja(newTipoPasoQueja);
            vTipoComConsumidor.setId_flujo(formComConsumidor.getId_flujo());
            vTipoComConsumidor.setId_tipo_registro(tipo_registro);
            vTipoComConsumidor.setFecha_ingreso(new Date());
            tipoDao.saveComConsumidor(vTipoComConsumidor);
            response.setValue(vTipoComConsumidor);

            //revisar si correo esta activo en parametros de sistema
            TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_COM_PERMANENTE);
            if (efuente != null) {
                if (efuente.getActivo() == 1) {
                    //correo comunicacion permanente
                    String cuerpo = "Estimado Usuario, se ha comenzado el proceso de revisi&oacute;n de su queja por parte de personal interno de DIACO.<br>"
                            + "Estatus: " + LimpiaStringTildes(formComConsumidor.getEstatus()) + "<br>"
                            + "Observaciones: " + LimpiaStringTildes(formComConsumidor.getObservaciones());
                    String[] mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                    System.out.println("JJ: funcion saveEmailEnviar: parametros, mailstring:" + mailstring + ",cuerpo: " + cuerpo);
                    boolean resp = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_COM_PERMANENTE, cuerpo); // fuente de email 7 com perm
                    System.out.println("Respuesta de saveEmailEnviar: " + resp);
                }
            }
            //bitacora auto log
            String txtmensaje = "Comunicaci??n Permanente Guardada";
            BitacoraAutomatica(formComConsumidor.getId_queja(), formComConsumidor.getId_flujo(), formComConsumidor.getUsuario_operacion(), txtmensaje, txtmensaje, tipo_registro);
            System.out.println("JJ: SIN ERROR, DESPUES DE BitacoraAutomatica");
            response.setCode(0L);
            response.setReason("OK");
            System.out.println("JJ: antes DE BitacoraAutomatica, formComConsumidor.getId_queja(): " + formComConsumidor.getId_queja());
            saveTiposFlujoGuia(formComConsumidor.getId_queja(), 3); //INDICA EL FLUJO EN EL QUE SE ENCUENTRA
            System.out.println("JJ: SIN ERROR, DESPUES DE saveTiposFlujoGuia");
            //TipoFlujoGuia vTipoFlujoGuia = tipoDao.findByIdTipoFlujoGuia(formComConsumidor.getId_queja());
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Error en addTipoComConsumidor: " + e.getMessage());
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR 2");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                System.out.println("Entro a catch final.");
                ee.getMessage();
            }
        }
        return response;
    }

    //Paso Queja
    @Override
    public ResponseRs listTiposPasoQueja(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposPasoQueja(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getTipoPasoQueja(double id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdPasoQueja(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getLastPasoQuejabyType(Integer id_queja, Integer id_tipo_registro, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByTypePasoQueja(id_queja, id_tipo_registro));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs addTipoPasoQueja(TipoPasoQueja tipoPasoQueja) {
        ResponseRs response = new ResponseRs();

        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(tipoPasoQueja.getId_queja());
            newTipoPasoQueja.setId_estado_operado(1);
            newTipoPasoQueja.setDescripcion(tipoPasoQueja.getDescripcion());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setUsuario_operacion(tipoPasoQueja.getUsuario_operacion());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(tipoPasoQueja.getUsuario_operacion());
            //newTipoPasoQueja.setId_sede_diaco_operacio(usuario.getId_sede_diaco());
            newTipoPasoQueja.setId_departamento_interno(tipoPasoQueja.getId_departamento_interno());
            newTipoPasoQueja.setDescripcion_consumidor(tipoPasoQueja.getDescripcion_consumidor());
            tipoDao.savePasoQueja(newTipoPasoQueja);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoPasoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //View Main Queja
    @Override
    public ResponseRs listViewMainQueja(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoViewMainQueja());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaCustomFilter1(FormViewMainQueja1 formViewMainQueja) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formViewMainQueja.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoQuejaCustomFilter1(formViewMainQueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaCustomFilterSP(FormViewMainQueja1 formViewMainQueja) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formViewMainQueja.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoQuejaCustomFilterSP(formViewMainQueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaCustomFilterVyV(FormViewMainQueja1 formViewMainQueja) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formViewMainQueja.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoQuejaCustomFilterVyV(formViewMainQueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaCustomFilterJuridico(FormViewMainQueja1 formViewMainQueja) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formViewMainQueja.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoQuejaCustomFilterJuridico(formViewMainQueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaCustomFilter2(FormViewMainQueja2 formViewMainQueja) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formViewMainQueja.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoQuejaCustomFilter2(formViewMainQueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs findTipoQuejaCustomFilterBusqueda(FormBusqueda formBusqueda) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formBusqueda.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoQuejaCustomFilterBusqueda(formBusqueda));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Departamento
    @Override
    public ResponseRs listDepartamento(String token) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposDepartamento());
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Municipio
    @Override
    public ResponseRs listMunicipio(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposMunicipio());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listMunicipio(Integer id_departamento, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposMunicipio(id_departamento));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Verificacion Conciliacion Virtual
    @Override
    public ResponseRs listTiposVerifConcVirt(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllVerifConcVirt(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getTipoVerifConcVirt(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdComConsumidor(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs addTipoVerifConcVirt(FormVerifConcVirt formVerifConcVirt) {
        ResponseRs response = new ResponseRs();
        boolean isUpdate = false;
        boolean FlowUpdate = false;
        UserTransaction transaction = null;
        Integer flujo = formVerifConcVirt.getId_flujo();
        Integer tipo_registro_local;
        boolean servpub;
        try {
            tipoDao.TokenCheck(formVerifConcVirt.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            TipoVerifConcVirt vTipoVerifConcVirt;
            if (formVerifConcVirt.getId_queja() != null) {
                vTipoVerifConcVirt = tipoDao.findAllVerifConcVirt(formVerifConcVirt.getId_queja());
                if (vTipoVerifConcVirt != null) {
                    isUpdate = true;
                }
            } else {
                response.setCode(1L);
                response.setReason("ERROR");
                return response;
            }
            if (flujo == 4) // flujo conciliacion previa
            {
                tipo_registro_local = 14; // 14 - resolver queja
            } else if (flujo == 1) {
                tipo_registro_local = 1; // 1 - verificacion conciliacion virtual
            } else {
                response.setCode(1L);
                response.setReason("ERROR");
                return response;
            }
            //actualizar estado de queja, cambia dependiendo de que flujo vienen y que operacion se realiza
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formVerifConcVirt.getId_queja());
            if (flujo == 4) { // flujo conciliacion previa
                //vTipoQueja.setId_estado_queja(101);
                //verificar si es servicio publico, si lo es reenviar a servicios publicos en estado nuevo
                servpub = false;
                if (vTipoQueja.getTipoproveedor().isServicio_publico()) {
                    servpub = true;
                }
                //si no es servicio publico se agrega a la cola de atencion al consumidor
                if (servpub) {
                    vTipoQueja.setId_estado_queja(601);
                } else {
                    savePrivConfirmarAccionAtCon(formVerifConcVirt.getId_queja());
                }
            } else if (flujo == 1) { // flujo atencion al consumidor
                if (formVerifConcVirt.getRespuesta_diaco() == 12) { // aceptar resolucion de conciliacion previa
                    vTipoQueja.setId_estado_queja(402);
                } else {
                    vTipoQueja.setId_estado_queja(102);
                }
            }
            tipoDao.saveQueja(vTipoQueja);
            response.setValue(vTipoQueja);
            vTipoQueja = tipoDao.findByIdQueja(formVerifConcVirt.getId_queja());

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formVerifConcVirt.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formVerifConcVirt.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formVerifConcVirt.getUsuario_operacion());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(tipo_registro_local);
            newTipoPasoQueja.setUsuario_operacion(formVerifConcVirt.getUsuario_operacion());
            if (isUpdate) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            tipoDao.savePasoQueja(newTipoPasoQueja);
            response.setValue(newTipoPasoQueja);

            if (isUpdate && vTipoVerifConcVirt != null) {
                //validar campos y actualizar antes del update
                if (formVerifConcVirt.getNotas() != null) {
                    vTipoVerifConcVirt.setNotas(formVerifConcVirt.getNotas());
                }
                if (formVerifConcVirt.getResolucion() != null) {
                    vTipoVerifConcVirt.setResolucion(formVerifConcVirt.getResolucion());
                    if (formVerifConcVirt.getResolucion() == 9 && !vTipoQueja.getTipoproveedor().isServicio_publico()) { //si respuesta es Resuelto
                        //revisar si correo esta activo en parametros de sistema
                        TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_CONFIRMACION_QUEJA_FINALIZADA_PORTAL_PROV);
                        if (efuente != null) {
                            if (efuente.getActivo() == 1) {
                                //save, send email
                                String cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> DIACO le informa que la queja " + vTipoQueja.getQuejaNumero() + " ha sido solucionada por parte del proveedor, por lo que previo ser archivada,  confirme si esto es correcto, haciendo click en la opci&oacute;n  de abajo.  Ha sido un gusto poder apoyarle.<br>";
                                FormSimple respsimple = GenerateMagicLinkOptions(formVerifConcVirt.getId_queja(), Constants.REG_DIACO_FUENTE_EMAIL_CONFIRMACION_QUEJA_FINALIZADA_PORTAL_PROV, "SI", "NO");
                                cuerpo = cuerpo + "Queja SI fu&eacute; resuelta: " + respsimple.getResp1() + "<br>";
                                //cuerpo=cuerpo+"En caso que su queja no haya sido resuelta a&uacute;n por favor, confirme aqui:<br>";
                                cuerpo = cuerpo + "Queja NO fu&eacute; resuelta: " + respsimple.getResp2() + "<br><br>";
                                //cuerpo=cuerpo+"Si no responde a este correo, damos por hecho que si est&aacute; conciliado.";
                                String[] mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_CONFIRMACION_QUEJA_FINALIZADA_PORTAL_PROV, cuerpo); // fuente de email 3: confirmar queja solucionada                                

                            }
                        }
                    }
                }
                if (formVerifConcVirt.getRazon_prop_provee_rechazada() != null) {
                    vTipoVerifConcVirt.setRazon_prop_provee_rechazada(formVerifConcVirt.getRazon_prop_provee_rechazada());
                    FlowUpdate = true;
                }
                if (formVerifConcVirt.getQueja_resuelta() != null) {
                    vTipoVerifConcVirt.setQueja_resuelta(formVerifConcVirt.getQueja_resuelta());
                    FlowUpdate = true;
                }
                if (formVerifConcVirt.getRespuesta_diaco() != null) {
                    vTipoVerifConcVirt.setRespuesta_diaco(formVerifConcVirt.getRespuesta_diaco());
                    FlowUpdate = true;
                }
                vTipoVerifConcVirt.setTipopasoqueja(newTipoPasoQueja);
                tipoDao.saveVerifConcVirt(vTipoVerifConcVirt);
                response.setValue(vTipoVerifConcVirt);
            } else {
                //validar campos y agregar nuevo registro
                vTipoVerifConcVirt = new TipoVerifConcVirt();
                if (formVerifConcVirt.getNotas() != null) {
                    vTipoVerifConcVirt.setNotas(formVerifConcVirt.getNotas());
                }
                if (formVerifConcVirt.getResolucion() != null) {
                    vTipoVerifConcVirt.setResolucion(formVerifConcVirt.getResolucion());
                    if (formVerifConcVirt.getResolucion() == 9 && !vTipoQueja.getTipoproveedor().isServicio_publico()) { //si respuesta es Resuelto
                        //revisar si correo esta activo en parametros de sistema
                        TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_CONFIRMACION_QUEJA_FINALIZADA_PORTAL_PROV);
                        if (efuente != null) {
                            if (efuente.getActivo() == 1) {
                                //save, send email
                                String cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> DIACO le informa que la queja " + vTipoQueja.getQuejaNumero() + " ha sido solucionada por parte del proveedor, por lo que previo ser archivada,  confirme si esto es correcto, haciendo click en la opci&oacute;n de abajo.  Ha sido un gusto poder apoyarle.<br>";
                                FormSimple respsimple = GenerateMagicLinkOptions(formVerifConcVirt.getId_queja(), Constants.REG_DIACO_FUENTE_EMAIL_CONFIRMACION_QUEJA_FINALIZADA_PORTAL_PROV, "SI", "NO");
                                cuerpo = cuerpo + "Queja SI fu&eacute; resuelta: " + respsimple.getResp1() + "<br>";
                                //cuerpo=cuerpo+"En caso que su queja no haya sido resuelta a&uacute;n por favor, confirme aqui:<br>";
                                cuerpo = cuerpo + "Queja NO fu&eacute; resuelta: " + respsimple.getResp2() + "<br><br>";
                                //cuerpo=cuerpo+"Si no responde a este correo, damos por hecho que si est&aacute; conciliado.";
                                String[] mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_CONFIRMACION_QUEJA_FINALIZADA_PORTAL_PROV, cuerpo); // fuente de email 3: confirmar queja solucionada
                            }
                        }
                    }
                }
                if (formVerifConcVirt.getRazon_prop_provee_rechazada() != null) {
                    vTipoVerifConcVirt.setRazon_prop_provee_rechazada(formVerifConcVirt.getRazon_prop_provee_rechazada());
                    FlowUpdate = true;
                }
                if (formVerifConcVirt.getQueja_resuelta() != null) {
                    vTipoVerifConcVirt.setQueja_resuelta(formVerifConcVirt.getQueja_resuelta());
                    FlowUpdate = true;
                }
                if (formVerifConcVirt.getRespuesta_diaco() != null) {
                    vTipoVerifConcVirt.setRespuesta_diaco(formVerifConcVirt.getRespuesta_diaco());
                    FlowUpdate = true;
                }
                vTipoVerifConcVirt.setTipopasoqueja(newTipoPasoQueja);
                vTipoVerifConcVirt.setId_tipo_registro(tipo_registro_local); // 14 - resolver queja
                tipoDao.saveVerifConcVirt(vTipoVerifConcVirt);
                response.setValue(vTipoVerifConcVirt);
            }
            //bitacora auto log
            String txtmensaje;
            if (flujo == 4) {
                txtmensaje = "Informaci??n Guardada en Conciliaci??n Virtual (Portal Proveedor)";
                BitacoraAutomatica(formVerifConcVirt.getId_queja(), formVerifConcVirt.getId_flujo(), formVerifConcVirt.getUsuario_operacion(), txtmensaje, txtmensaje, tipo_registro_local);
            } else if (flujo == 1) {
                txtmensaje = "Informaci??n Actualizada en Verificaci??n Conciliaci??n Virtual";
                BitacoraAutomatica(formVerifConcVirt.getId_queja(), formVerifConcVirt.getId_flujo(), formVerifConcVirt.getUsuario_operacion(), txtmensaje, txtmensaje, tipo_registro_local);
            }
            if (FlowUpdate) {
                saveTiposFlujoGuia(formVerifConcVirt.getId_queja(), 1);
                TipoFlujoGuia vTipoFlujoGuia = tipoDao.findByIdTipoFlujoGuia(formVerifConcVirt.getId_queja());
            }
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    //guardar respuesta de consumidor al enviarsele un correo debe responder si/no

    @Override
    public ResponseRs setTipoVerifConcVirtResolucion(String respuesta, String mlink) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            //tipoDao.TokenCheck(token);
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoMagicLink tipoMagicLink = tipoDao.findLastTipoMagicLink(mlink);
            //guardar respuesta en verificacion conciliacion virtual
            TipoVerifConcVirt vTipoVerifConcVirt = tipoDao.findAllVerifConcVirt(tipoMagicLink.getId_queja());
            vTipoVerifConcVirt.setRespuesta_con(respuesta.trim());
            vTipoVerifConcVirt.setFecha_respuesta_con(new Date());
            tipoDao.saveVerifConcVirt(vTipoVerifConcVirt);
            //actualizar magic link y deshabilitarlo
            if (vTipoVerifConcVirt.getRespuesta_veces() != null) {
                if (vTipoVerifConcVirt.getRespuesta_veces() == 0) {
                    vTipoVerifConcVirt.setRespuesta_veces(1);
                } else {
                    vTipoVerifConcVirt.setRespuesta_veces(2);
                    tipoMagicLink.setEstado("I");
                }
            } else {
                vTipoVerifConcVirt.setRespuesta_veces(1);
            }
            tipoDao.saveMagicLink(tipoMagicLink);
            response.setValue(vTipoVerifConcVirt);
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //proveedor
    @Override
    public ResponseRs listTiposProveedorSP(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findServPubProveedor());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listTiposProveedornoneSP(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findnoneServPubProveedor());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listTiposProveedorCPoSP(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findCPoSPProveedor());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listTiposProveedor(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdProveedor(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs CustomFilterProveedor(FormBusqueda formBusqueda) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(formBusqueda.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.CustomFilterProveedor(formBusqueda));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //flujo guia
    private ResponseRs listTiposFlujoGuia(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposFlujoGuia(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    private ResponseRs listTiposFlujoGuiaXid(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdTipoFlujoGuia(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public boolean saveTiposFlujoGuia(Integer idqueja, Integer col) throws Exception {
        if (col < 0 || col > 13) {
            return false;
        }
        TipoFlujoGuia vTipoFlujoGuia;
        //verificar si es update o insert
        vTipoFlujoGuia = tipoDao.findByIdTipoFlujoGuia(idqueja);
        if (vTipoFlujoGuia == null) {
            vTipoFlujoGuia = new TipoFlujoGuia();
            vTipoFlujoGuia.setAtcon_audiencia_conc(false);
            vTipoFlujoGuia.setAtcon_audiencia_prueba(false);
            vTipoFlujoGuia.setAtcon_com_permanente(false);
            vTipoFlujoGuia.setAtcon_conc_previa(false);
            vTipoFlujoGuia.setAtcon_verif_datos(false);
            vTipoFlujoGuia.setVyv_flag(false);
            vTipoFlujoGuia.setVyv_informe_final(false);
            vTipoFlujoGuia.setJur_flag(false);
            vTipoFlujoGuia.setJur_documentado(false);
            vTipoFlujoGuia.setJur_result_audiencia(false);
            vTipoFlujoGuia.setJur_resol_final(false);
            vTipoFlujoGuia.setJur_cobro_sancion(false);
            vTipoFlujoGuia.setSp_flag(false);
            vTipoFlujoGuia.setIdqueja(idqueja);
        }
        switch (col) {
            case 1:
                vTipoFlujoGuia.setAtcon_conc_previa(true);
                break;
            case 2:
                vTipoFlujoGuia.setAtcon_verif_datos(true);
                break;
            case 3:
                vTipoFlujoGuia.setAtcon_com_permanente(true);
                break;
            case 4:
                vTipoFlujoGuia.setAtcon_audiencia_conc(true);
                break;
            case 5:
                vTipoFlujoGuia.setAtcon_audiencia_prueba(true);
                break;
            case 6:
                vTipoFlujoGuia.setVyv_flag(true);
                break;
            case 7:
                vTipoFlujoGuia.setVyv_informe_final(true);
                break;
            case 8:
                vTipoFlujoGuia.setJur_flag(true);
                break;
            case 9:
                vTipoFlujoGuia.setJur_documentado(true);
                break;
            case 10:
                vTipoFlujoGuia.setJur_result_audiencia(true);
                break;
            case 11:
                vTipoFlujoGuia.setJur_resol_final(true);
                break;
            case 12:
                vTipoFlujoGuia.setJur_cobro_sancion(true);
                break;
            case 13:
                vTipoFlujoGuia.setSp_flag(true);
                break;
        }
        System.out.println("Antes de tipoDao.saveFlujoGuia(vTipoFlujoGuia);");
        tipoDao.saveFlujoGuia(vTipoFlujoGuia);
        return true;
    }

    //Registro
    @Override
    public ResponseRs listTiposRegistro(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposRegistro());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listTiposRegistro(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdTipoRegistro(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    private String getNextCorrelativoRegistro(Integer id) throws Exception {
        //incrementar en 1 el correlativo y guardar
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(id);
        if (vTipoRegistro != null) {
            Integer newCorr = vTipoRegistro.getCorrelativo() + 1;
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);
            //regresar el nuevo valor
            if (vTipoRegistro.getCodigo_correlativo() != null) {
                return (vTipoRegistro.getCodigo_correlativo() != null && !vTipoRegistro.getCodigo_correlativo().isEmpty() ? vTipoRegistro.getCodigo_correlativo() + "-" : "") + newCorr.toString();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private String getNextCorrelativoRegistroResultAudiencia() throws Exception {
        //incrementar en 1 el correlativo y guardar
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_RESOLUCION_APERTURA_PRUEBA);
        if (vTipoRegistro != null) {
            Integer newCorr = vTipoRegistro.getCorrelativo() + 1;
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);

            vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_JURIDICO);
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);

            vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA);
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);

            //regresar el nuevo valor
            if (vTipoRegistro.getCodigo_correlativo() != null) {
                return (vTipoRegistro.getCodigo_correlativo() != null && !vTipoRegistro.getCodigo_correlativo().isEmpty() ? vTipoRegistro.getCodigo_correlativo() + "-" : "") + newCorr.toString();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private String getNextCorrelativoRegistroResultFinal() throws Exception {
        //incrementar en 1 el correlativo y guardar
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_RESOLUCION_FINAL);
        if (vTipoRegistro != null) {
            String codigoCorr = vTipoRegistro.getCodigo_correlativo();
            Integer newCorr = vTipoRegistro.getCorrelativo() + 1;
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);

            vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_JURIDICO);
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);

            vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA);
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);

            //regresar el nuevo valor
            if (vTipoRegistro.getCodigo_correlativo() != null) {
                return (codigoCorr != null && !codigoCorr.isEmpty() ? codigoCorr + "-" : "") + newCorr.toString();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private String getCorrelativoRegNotiCita(Integer id, Long correlativoCitaNotiCons) throws Exception {
        //incrementar en 1 el correlativo y guardar
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(id);
        if (vTipoRegistro != null) {

            vTipoRegistro.setCorrelativo(correlativoCitaNotiCons.intValue());
            tipoDao.saveRegistro(vTipoRegistro);
            //regresar el nuevo valor
            //regresar el nuevo valor
            if (vTipoRegistro.getCodigo_correlativo() != null) {
                return (vTipoRegistro.getCodigo_correlativo() != null && !vTipoRegistro.getCodigo_correlativo().isEmpty() ? vTipoRegistro.getCodigo_correlativo() + "-" : "") + correlativoCitaNotiCons.toString();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private Integer getNextCorrelativoRegistroPrefijo(Integer id) throws Exception {
        //incrementar en 1 el correlativo y guardar
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(id);
        if (vTipoRegistro != null) {
            Integer newCorr = vTipoRegistro.getCorrelativo() + 1;
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);
            //regresar el nuevo valor
            return newCorr;
        } else {
            return null;
        }
    }

    private String getRegistroSoloPrefijo(Integer id) throws Exception {
        //incrementar en 1 el correlativo y guardar
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(id);
        if (vTipoRegistro != null) {
            //regresar el nuevo valor
            return vTipoRegistro.getPrefijo();
        } else {
            return null;
        }
    }

    @Override
    public ResponseRs listQuejaRegistro(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdTipoQuejaRegistro(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveQuejaRegistro(Integer idqueja, TipoReg_ComPerm tipoReg_ComPerm, Integer tipo_registro, String token) throws Exception {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            TipoQuejaRegistro vTipoQuejaRegistro = tipoDao.findbyParamsQuejaRegistro(idqueja, tipo_registro);
            if (vTipoQuejaRegistro == null) {
                vTipoQuejaRegistro = new TipoQuejaRegistro();
            }
            //registro 1-comunicacion con el consumidor
            vTipoQuejaRegistro.setId_queja(idqueja);
            vTipoQuejaRegistro.setTipoReg_ComPerm(tipoReg_ComPerm);
            vTipoQuejaRegistro.setId_tipo_registro(tipo_registro);
            tipoDao.saveQuejaRegistro(vTipoQuejaRegistro);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoQuejaRegistro);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Registro: Comunicaci??n Permanente
    /*@Override
        public ResponseRs listReg_ComPermanente(Integer idqueja){
            ResponseRs response = new ResponseRs();
		
		try { 
			response.setCode(0L);
			response.setReason("OK");
			response.setValue(tipoDao.findAllTiposReg_ComPerm(idqueja));
		} catch (Exception e) {
			e.printStackTrace();
			response.setCode(1L);
			response.setReason("ERROR");
		}		
		return response;                                
        }*/
    @Override
    public ResponseRs getReg_ComPermanente(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdTipoReg_ComPerm(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getReg_ComPermanentexIdQueja(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposReg_ComPermxIdQueja(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveReg_ComPermanente(FormRegistro formReg_ComPerm) {
        ResponseRs response = new ResponseRs();
        TipoReg_ComPerm vTipoReg_ComPerm;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formReg_ComPerm.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            System.out.println("REVISOR JJ:  ANTES DEL IF");
            //verificar si es update o insert
            vTipoReg_ComPerm = tipoDao.findTiposReg_ComPermxIdQueja(formReg_ComPerm.getId_queja());
            System.out.println("REVISOR JJ:  ANTES DEL IF" + "VALOR DE vTipoReg_ComPerm" + vTipoReg_ComPerm);
            if (vTipoReg_ComPerm == null) {
                vTipoReg_ComPerm = new TipoReg_ComPerm();
                vTipoReg_ComPerm.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_COMUNICACION_PERMANENTE)); //registro 1-comunicacion con el consumidor //TRAE PREFIJO: DIACO-AQ-FO-15
                System.out.println("REVISOR JJ: el Codigo de registro es:" + vTipoReg_ComPerm.getCodigo());
            }
            vTipoReg_ComPerm.setCreado_por(formReg_ComPerm.getCreado_por());
            vTipoReg_ComPerm.setId_queja(formReg_ComPerm.getId_queja());
            vTipoReg_ComPerm.setId_registro(Constants.REG_DIACO_REGISTRO_COMUNICACION_PERMANENTE); //registro 1-comunicacion con el consumidor
            vTipoReg_ComPerm.setId_tipo_registro(Constants.REG_TIPO_COMUNICACION_PERMANENTE); //Tipo Registro 3-Comunicaci??n Permanente
            //buscar informacion de comunicaci??n con consumidor
            List<TipoComConsumidor> vTipoComConsumidor = tipoDao.findAllComConsumidorInd(formReg_ComPerm.getId_queja(), formReg_ComPerm.getId_comunicacion_consumidor());
            System.out.println("REVISOR JJ:  " + "VALOR DE vTipoComConsumidor" + vTipoComConsumidor);
            if (vTipoComConsumidor != null) {
                vTipoReg_ComPerm.setEstatus(vTipoComConsumidor.get(0).getEstatus());
                vTipoReg_ComPerm.setObservaciones(vTipoComConsumidor.get(0).getObservaciones());
                TipoCatalogo vTipoCatalogo = tipoDao.findTipoCatalogo(vTipoComConsumidor.get(0).getVia());
                System.out.println("REVISOR JJ:  " + "VALOR DE vTipoCatalogo  = " + vTipoCatalogo);
                vTipoReg_ComPerm.setVia_comunicacion(vTipoCatalogo.getDescripcion_catalogo());
            }
            //buscar informacion queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formReg_ComPerm.getId_queja());
            System.out.println("REVISOR JJ:  " + "VALOR DE vTipoQueja  = " + vTipoQueja);
            vTipoReg_ComPerm.setFecha_creacion(new Date());

            //encuentra la fecha de confirmacion del usuario
            Date fecha_asignacion = tipoDao.findTipoConfirmarAccionByUsuarioAsignado(vTipoQueja.getUsuario_asignado(), formReg_ComPerm.getId_queja());

            vTipoReg_ComPerm.setFecha_asignacion(fecha_asignacion);
            vTipoReg_ComPerm.setFecha_notificacion(new Date());
            vTipoReg_ComPerm.setFecha_presentacion(vTipoQueja.getFecha_queja());
            vTipoReg_ComPerm.setAnio_queja(vTipoQueja.getAnio());
            vTipoReg_ComPerm.setQuejanumero(vTipoQueja.getNo_queja());
            //revisar esto dio error por nulo
            vTipoReg_ComPerm.setResponsable(vTipoQueja.getUsuario_asignado().toString());
            //buscar informacion consumidor
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            System.out.println("REVISOR JJ:  " + "VALOR DE vTipoConsumidor  = " + vTipoConsumidor);
            if (vTipoConsumidor != null) {
                vTipoReg_ComPerm.setCon_email(CommaSeparatedEmailsCons(vTipoConsumidor.getId_consumidor()));
                vTipoReg_ComPerm.setCon_telefono(CommaSeparatedTelefCons(vTipoConsumidor.getId_consumidor()));
                vTipoReg_ComPerm.setCon_nombre(vTipoConsumidor.getNombreCompleto());
                System.out.println("REVISOR JJ:  " + "DENTRO DE CONDICION (vTipoConsumidor != null)  = " + vTipoReg_ComPerm);
            }
            response.setValue(vTipoReg_ComPerm);
            System.out.println("REVISOR JJ:  " + "VALOR DE vTipoReg_ComPerm)  = " + vTipoReg_ComPerm);
            tipoDao.saveReg_ComPerm(vTipoReg_ComPerm);
            //saveQuejaRegistro(formReg_ComPerm.getId_queja(), vTipoReg_ComPerm, 3);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoReg_ComPerm);
            System.out.println("REVISOR JJ:  " + "VALOR DE vTipoReg_ComPerm) ANTES DE RESPONDER = " + vTipoReg_ComPerm);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    
    @Override
    public ResponseRs getUltimaAceptacion(FormRegistro formReg_ComPerm) {
        ResponseRs response = new ResponseRs();
        TipoConfirmarAccion confaccion = new TipoConfirmarAccion();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formReg_ComPerm.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            Date fecha_asignacion = tipoDao.findConfAccionReciente(formReg_ComPerm.getCreado_por(), formReg_ComPerm.getId_queja());
            confaccion.setFecha_creacion(fecha_asignacion);
            System.out.println("fecha_asignacion: "+fecha_asignacion);
            System.out.println("LLEGANDO A getUltimaAceptacion");
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(confaccion);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    private String CommaSeparatedEmailsCons(Integer id_consumidor) {
        List<TipoEmail> vTipoEmail = tipoDao.findAllTiposEmail(id_consumidor, "C");
        if (!vTipoEmail.isEmpty()) {
            boolean First = true;
            String StrOutput = "";
            for (TipoEmail loc : vTipoEmail) {
                if (First) {
                    First = false;
                    StrOutput = StrOutput + loc.getCorreo_electronico();
                } else {
                    StrOutput = StrOutput + ", " + loc.getCorreo_electronico();
                }
            }
            return StrOutput;
        } else {
            return "";
        }
    }

    private String CommaSeparatedTelefCons(Integer id_consumidor) {
        List<TipoTelefono> vTipoTelefono = tipoDao.findAllTiposTelefono(id_consumidor, "C");
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

    private String CommaSeparatedEmailsPro(Integer id_consumidor) {
        List<TipoEmail> vTipoEmail = tipoDao.findAllTiposEmail(id_consumidor, "P");
        if (!vTipoEmail.isEmpty()) {
            boolean First = true;
            String StrOutput = "";
            for (TipoEmail loc : vTipoEmail) {
                if (First) {
                    First = false;
                    StrOutput = StrOutput + loc.getCorreo_electronico();
                } else {
                    StrOutput = StrOutput + ", " + loc.getCorreo_electronico();
                }
            }
            return StrOutput;
        } else {
            return "";
        }
    }

    private String CommaSeparatedTelefPro(Integer id_consumidor) {
        List<TipoTelefono> vTipoTelefono = tipoDao.findAllTiposTelefono(id_consumidor, "P");
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

    //sede
    @Override
    public ResponseRs listSedeExcOne(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposSedeExcOne(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listSedeAll(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            List<TipoSede> sedeList = tipoDao.findTiposSedeAll();
            List<FormSede> sedeListF = new ArrayList<FormSede>();
            for (TipoSede sede : sedeList) {
                FormSede formSede = new FormSede();
                formSede.setId_diaco_sede(sede.getId_diaco_sede());
                formSede.setNombre_sede(sede.getNombre_sede());
                formSede.setDireccion_avenida(sede.getDireccion_avenida());
                formSede.setDireccion_calle(sede.getDireccion_calle());
                formSede.setDireccion_detalle(sede.getDireccion_detalle());
                formSede.setDireccion_zona(sede.getDireccion_zona());
                formSede.setCodigo_municipio(sede.getCodigo_municipio());
                TipoMunicipio muni = this.tipoDao.findByIdMunicipio(sede.getCodigo_municipio());
                formSede.setNombre_municipio(muni.getNombre_municipio());
                formSede.setCodigo_departamento(muni.getCodigo_departamento());
                TipoDepartamento depto = this.tipoDao.findByIdDepartamento(muni.getCodigo_departamento());
                formSede.setNombre_departamento(depto.getNombre_departamento());
                formSede.setHabilitado(sede.getHabilitado());
                formSede.setDireccion_sede(sede.getDireccion_sede());

                sedeListF.add(formSede);
            }

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(sedeListF);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }
    //Registro: Ficha Queja

    @Override
    public ResponseRs getReg_FichaQuejaxIdQueja(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposReg_FichaQuejaxIdQueja(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveReg_FichaQueja(FormRegistro formReg_FichaQueja) {
        ResponseRs response = new ResponseRs();
        TipoReg_FichaQueja vTipoReg_FichaQueja;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formReg_FichaQueja.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_FichaQueja = tipoDao.findTiposReg_FichaQuejaxIdQueja(formReg_FichaQueja.getId_queja());
            if (vTipoReg_FichaQueja == null) {
                vTipoReg_FichaQueja = new TipoReg_FichaQueja();
                //no se genera codigo porque este reporte no tiene
            }
            vTipoReg_FichaQueja.setCreado_por(formReg_FichaQueja.getCreado_por());
            vTipoReg_FichaQueja.setId_queja(formReg_FichaQueja.getId_queja());
            vTipoReg_FichaQueja.setId_registro(Constants.REG_DIACO_REGISTRO_FICHA_QUEJA); //registro 2-ficha de al queja
            vTipoReg_FichaQueja.setId_tipo_registro(Constants.REG_TIPO_MOVIMIENTO_EXPEDIENTE); //Tipo Registro 9-Movimiento de Expediente
            //hay que ver si realmente es en mov_expediente
            //buscar informacion queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formReg_FichaQueja.getId_queja());
            vTipoReg_FichaQueja.setFecha_ingreso_queja(vTipoQueja.getFecha_queja());
            vTipoReg_FichaQueja.setFecha_creacion(new Date());
            vTipoReg_FichaQueja.setAnio_queja(vTipoQueja.getAnio());
            vTipoReg_FichaQueja.setQuejanumero(vTipoQueja.getNo_queja());
            vTipoReg_FichaQueja.setSolicita_que(vTipoQueja.getSolicita_que());

            //buscar informacion CONSUMIDOR
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            System.out.println("vTipoConsumidor: "+vTipoConsumidor);
            if (vTipoConsumidor != null) {
                vTipoReg_FichaQueja.setNombre_consumidor(vTipoConsumidor.getNombreCompleto());
            }
            //buscar informacion PROVEEDOR
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            System.out.println("vTipoProveedor: "+vTipoProveedor);
            if (vTipoProveedor != null) {
                vTipoReg_FichaQueja.setNombre_proveedor(vTipoProveedor.getNombre());
            }
            //buscar informacion comunicacion permanente
            TipoComConsumidor vTipoComConsumidor = tipoDao.findAllTiposComConsumidor(formReg_FichaQueja.getId_queja());
            System.out.println("vTipoComConsumidor: "+vTipoComConsumidor);
            if (vTipoComConsumidor != null) {
                vTipoReg_FichaQueja.setFecha_comunicacion(vTipoComConsumidor.getTipopasoqueja().getFecha_operacion());
            }
            //buscar informacion visita de campo
            TipoVisitaCampo vTipoVisitaCampo = tipoDao.findLastTipoVisitaCampo(formReg_FichaQueja.getId_queja());
            System.out.println("vTipoVisitaCampo: "+vTipoVisitaCampo);
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            if (vTipoVisitaCampo != null) {
                vTipoReg_FichaQueja.setVisita_campo(dateFormat.format(vTipoVisitaCampo.getFecha_visita()));
            }

            String audienciasConciliacion = "";

            //AUDIENCIA DE CONCILIACION
            List<TipoProgramaAudiencia> vTipoProgramaAudiencia = tipoDao.findAllTiposProgramaAudienciaxIdQueja(formReg_FichaQueja.getId_queja(), 1);
            System.out.println("vTipoProgramaAudiencia: "+vTipoProgramaAudiencia.toString());
            if (vTipoProgramaAudiencia != null) {
                for (TipoProgramaAudiencia tipoProgramaAudiencia : vTipoProgramaAudiencia) {
                    audienciasConciliacion = audienciasConciliacion + dateFormat.format(tipoProgramaAudiencia.getFecha_programada()) + ", ";
                }

            }
            if (audienciasConciliacion.isEmpty()) {
                vTipoReg_FichaQueja.setAudiencia_conciliacion("N/A");
                System.out.println("if: "+vTipoReg_FichaQueja.getAudiencia_conciliacion());
            } else {
                vTipoReg_FichaQueja.setAudiencia_conciliacion(audienciasConciliacion.substring(0, audienciasConciliacion.length() - 2));
                System.out.println("else: "+vTipoReg_FichaQueja.getAudiencia_conciliacion());
            }

            //tomando fechas de reprogramaciones de la citacion registro
            TipoReg_CedCitacionPro vTipoReg_CedCitacionPro = tipoDao.findTipoReg_CedCitacionProByIdQueja(formReg_FichaQueja.getId_queja());
            System.out.println("vTipoReg_CedCitacionPro: "+vTipoReg_CedCitacionPro);
            if (vTipoReg_CedCitacionPro != null){
            if (vTipoReg_CedCitacionPro.getHist_fecha_citas() != null) {
                vTipoReg_FichaQueja.setCitacion(vTipoReg_CedCitacionPro.getHist_fecha_citas());
                System.out.println("vTipoReg_CedCitacionPro: "+vTipoReg_CedCitacionPro);
            } else {
                vTipoReg_FichaQueja.setCitacion("N/A");
                System.out.println("vTipoReg_CedCitacionPro: "+vTipoReg_CedCitacionPro);
            }
            }

            //CONCLUSION Y OBSERVACIONES
            TipoQuejaFinalizada vTipoQuejaFinalizada = tipoDao.getTipoQuejaFinxIdQueja(formReg_FichaQueja.getId_queja());
            System.out.println("vTipoQuejaFinalizada: "+vTipoQuejaFinalizada);
            vTipoReg_FichaQueja.setConclusion(vTipoQuejaFinalizada.getConclusion());
            vTipoReg_FichaQueja.setComentarios(vTipoQuejaFinalizada.getComentario());

            tipoDao.saveReg_FichaQueja(vTipoReg_FichaQueja);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoReg_FichaQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    //Programa Audiencia

    /*private ResponseRs saveProgramaAudiencia(Date fecha_programada, TipoAudiencia tipoAudiencia, Integer idqueja) throws Exception{
                ResponseRs response = new ResponseRs();
                TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(idqueja, tipoAudiencia.getEs_primera_seg_audiencia());
                if(vTipoProgramaAudiencia != null){
                    vTipoProgramaAudiencia.setActivo(false);
                    tipoDao.saveProgramaAudiencia(vTipoProgramaAudiencia);
                }
                response.setValue(vTipoProgramaAudiencia);
                
                TipoProgramaAudiencia nTipoProgramaAudiencia = new TipoProgramaAudiencia();
                nTipoProgramaAudiencia.setActivo(true);
                nTipoProgramaAudiencia.setFecha_programada(fecha_programada);
                nTipoProgramaAudiencia.setTipoAudiencia(tipoAudiencia);
                tipoDao.saveProgramaAudiencia(nTipoProgramaAudiencia);
                
                response.setCode(0L);
                response.setReason("OK");
                response.setValue(nTipoProgramaAudiencia);   
                return response;
        }*/

 /*private ResponseRs updateProgramaAudiencia(TipoAudiencia tipoAudiencia, FormAudiencia formAudiencia) throws Exception{
                ResponseRs response = new ResponseRs();
                TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formAudiencia.getId_queja(), tipoAudiencia.getEs_primera_seg_audiencia());
                if(vTipoProgramaAudiencia != null){
                    vTipoProgramaAudiencia.setId_resultado_audiencia(formAudiencia.getId_resultado_audiencia());
                    vTipoProgramaAudiencia.setComentario(formAudiencia.getComentario());
                    vTipoProgramaAudiencia.setConclusion(formAudiencia.getConclusion());
                    tipoDao.saveProgramaAudiencia(vTipoProgramaAudiencia);                    
                }
                response.setValue(vTipoProgramaAudiencia);                                
                response.setCode(0L);
                response.setReason("OK");
                return response;
        }*/
    //Audiencia
    @Override
    public ResponseRs getAudienciaxIdQueja(Integer idqueja, Integer no_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposAudienciaxIdQueja(idqueja, no_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveAudiencia(FormAudiencia formAudiencia) {
        ResponseRs response = new ResponseRs();
        TipoAudiencia vTipoAudiencia = null;
        Integer current_state;
        Integer current_type = 0;
        Integer flujo_guia_pos;
        String direccion_fisica = "";
        TipoQueja vTipoQueja = null;
        UserTransaction transaction = null;
        UserTransaction transaction2 = null;
        boolean isUpdate = true;
        try {
            tipoDao.TokenCheck(formAudiencia.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoAudiencia = tipoDao.findTiposAudienciaxIdQueja(formAudiencia.getId_queja(), formAudiencia.getEs_primera_seg_audiencia());
            if (vTipoAudiencia == null) {
                vTipoAudiencia = new TipoAudiencia();
                isUpdate = false;
            }
            /*revisar si el estado debe ser:
                        105	audiencia de conciliaci??n completa
                        106	audiencia de ofrecimiento de medio de prueba completa*/
            if (formAudiencia.getEs_primera_seg_audiencia() == 1) {
                current_state = 105;
                current_type = 4;
                direccion_fisica = Constants.SEDE_CENTRAL_PZ4_DIR;
                flujo_guia_pos = 4;
            } else {
                current_state = 106;
                flujo_guia_pos = 5;
                switch (formAudiencia.getId_flujo()) {
                    case 1:
                        current_type = 5;
                        direccion_fisica = Constants.SEDE_CENTRAL_PZ4_DIR;
                        break;
                    case 2:
                        current_type = 27;
                        direccion_fisica = Constants.SEDE_CENTRAL_EDIF_REG_MERC_DIR;
                        break;
                    default:
                        current_type = 0;
                }
            }
            //actualizar estado de queja si es menor
            vTipoQueja = tipoDao.findByIdQueja(formAudiencia.getId_queja());
            if (vTipoQueja.getId_estado_queja() < current_state) {
                vTipoQueja.setId_estado_queja(current_state);
            }
            tipoDao.saveQueja(vTipoQueja);

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formAudiencia.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formAudiencia.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formAudiencia.getUsuario());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(current_type);
            newTipoPasoQueja.setUsuario_operacion(formAudiencia.getUsuario());
            if (isUpdate) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            tipoDao.savePasoQueja(newTipoPasoQueja);

            //actualizar flujo guia
            saveTiposFlujoGuia(formAudiencia.getId_queja(), flujo_guia_pos);
            TipoFlujoGuia vTipoFlujoGuia = tipoDao.findByIdTipoFlujoGuia(formAudiencia.getId_queja());

            vTipoAudiencia.setEs_primera_seg_audiencia(formAudiencia.getEs_primera_seg_audiencia());
            vTipoAudiencia.setTipopasoqueja(newTipoPasoQueja);
            vTipoAudiencia.setId_tipo_registro(current_type);
            //revisa si solo esta actualizando la fecha de la reuni??n o si esta cerrando la reuni??n ya creada

            /*if(formAudiencia.getFecha_programada() != null){
                            tipoDao.saveAudiencia(vTipoAudiencia);
                            response.setValue(vTipoAudiencia);
                            Date loc_date=StrtoDate(formAudiencia.getFecha_programada(),formAudiencia.getHora_programada());
                            //response.setValue(saveProgramaAudiencia(loc_date,vTipoAudiencia,formAudiencia.getId_queja()) );
                            TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formAudiencia.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
                            if(vTipoProgramaAudiencia != null){
                                vTipoProgramaAudiencia.setActivo(false);
                                tipoDao.saveTipoProgramaAudiencia(vTipoProgramaAudiencia);
                            }
                            response.setValue(vTipoProgramaAudiencia);
                            TipoProgramaAudiencia nTipoProgramaAudiencia = new TipoProgramaAudiencia();
                            nTipoProgramaAudiencia.setActivo(true);
                            nTipoProgramaAudiencia.setFecha_programada(loc_date);
                            nTipoProgramaAudiencia.setTipoAudiencia(vTipoAudiencia);
                            System.out.println(vTipoAudiencia.getId_audiencia());
                            tipoDao.saveTipoProgramaAudiencia(nTipoProgramaAudiencia);
                            response.setValue(nTipoProgramaAudiencia);
                            
                            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
                            DateFormat timeFormat = new SimpleDateFormat("hh:mm aaa");  
                            //revisar si correo esta activo en parametros de sistema
                            TipoEmailFuente efuente=tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_NOTIFICACIONES_AUDIENCIA);
                            if(efuente!=null){
                                if(efuente.getActivo()==1){    
                                    //mandar correo consumidor 
                                    
                                    
                                    String cuerpo="Estimado Consumidor(a) / Usuario(a):<br> DIACO le comunica que la audiencia motivo de la queja "+vTipoQueja.getQuejaNumero()+
                                    " ha sido programada para el "+dateFormat.format(loc_date)+" a las "+timeFormat.format(loc_date)+
                                    ", por lo que se le pide tomar en cuenta que ser&aacute; necesario contar con su presencia debidamente identificado con su DPI y/o Pasaporte y/o Representaci&oacute;n Legal,"+
                                    " Patente de Comercio (cuando aplique), "+LimpiaStringTildes(direccion_fisica)+"<br>";
                                    String[] mailstring=GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                                    saveEmailEnviar(mailstring,Constants.REG_DIACO_FUENTE_EMAIL_NOTIFICACIONES_AUDIENCIA,cuerpo); // fuente de email 5: notificacion audiencia
                                    //mandar correo proveedor
                                    mailstring=GetEmailStringProveedor(vTipoQueja.getId_proveedor());
                                    saveEmailEnviar(mailstring,Constants.REG_DIACO_FUENTE_EMAIL_NOTIFICACIONES_AUDIENCIA,cuerpo); // fuente de email 5: notificacion audiencia
                                }
                            }
                            //bitacora auto log
                            TipoUsuario_Conf vtipousuario = tipoDao.findByIdUsuarioConf(formAudiencia.getUsuario());
                            TipoProveedor vproveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
                            String txtmensaje="Audiencia Programada para "+dateFormat.format(loc_date)+", "+
                                    timeFormat.format(loc_date);
                            if(vtipousuario!=null){
                                txtmensaje=txtmensaje+". Operaci??n realizada por: "+vtipousuario.getNombre()+"("+vtipousuario.getLogin()+")";
                            }
                            if(vproveedor!=null){
                                txtmensaje=txtmensaje+". Proveedor citado: "+vproveedor.getNombre()+".";
                            }
                            BitacoraAutomatica(formAudiencia.getId_queja(),1,formAudiencia.getUsuario(),txtmensaje,txtmensaje);
                            
                        }else{
             */
            if (formAudiencia.getFecha_programada() == null) {
                if (formAudiencia.getAprobado_jefe_juridico() != null) {
                    vTipoAudiencia.setAprobado_jefe_juridico(formAudiencia.getAprobado_jefe_juridico());
                }
                if (formAudiencia.getFecha_finalizada() != null) {
                    vTipoAudiencia.setFecha_finalizada(new Date());
                }
                if (formAudiencia.getFecha_firma_direccion() != null) {
                    vTipoAudiencia.setFecha_firma_direccion(StrtoDate(formAudiencia.getFecha_firma_direccion(), ""));
                }
                if (formAudiencia.getId_resultado_audiencia() != null) {
                    //response.setValue(updateProgramaAudiencia(vTipoAudiencia,formAudiencia));
                    TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formAudiencia.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
                    if (vTipoProgramaAudiencia != null) {
                        vTipoProgramaAudiencia.setId_resultado_audiencia(formAudiencia.getId_resultado_audiencia());
                        tipoDao.saveTipoProgramaAudiencia(vTipoProgramaAudiencia);
                    }
                    response.setValue(vTipoProgramaAudiencia);
                }
                tipoDao.saveAudiencia(vTipoAudiencia);
                response.setValue(vTipoAudiencia);
                //bitacora auto log
                String txtmensaje = "Resultado de Audiencia Guardado.";
                BitacoraAutomatica(formAudiencia.getId_queja(), 1, formAudiencia.getUsuario(), txtmensaje, txtmensaje, current_type);
            } else {
                tipoDao.saveAudiencia(vTipoAudiencia);
                //response.setValue(vTipoAudiencia);
            }

            //Generar 4 registros
            /*FormRegistro formregistro= new FormRegistro();
                        formregistro.setId_queja(formAudiencia.getId_queja());
                        formregistro.setId_audiencia(formAudiencia.getId_audiencia());
                        formregistro.setCreado_por(formAudiencia.getUsuario());
                        formregistro.setToken(formAudiencia.getToken());
                        boolean result=save2Registros2NotificacionesPriv(formregistro);
                        if(!result){
                            response.setCode(1L);
                            response.setReason("ERROR_REG");
                            try{
                                transaction.rollback();
                            }catch(Exception ee){
                                ee.printStackTrace();
                            }   
                        }*/
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        if (formAudiencia.getFecha_programada() != null) {
            try {
                transaction2 = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
                transaction2.begin();
                vTipoAudiencia = tipoDao.findTiposAudienciaxIdQueja(formAudiencia.getId_queja(), formAudiencia.getEs_primera_seg_audiencia());
                if (vTipoAudiencia == null) {
                    Integer intentos = 10;
                    while (intentos >= 0) {
                        transaction.wait(500);
                        System.out.println("intentos: " + intentos);
                        vTipoAudiencia = tipoDao.findTiposAudienciaxIdQueja(formAudiencia.getId_queja(), formAudiencia.getEs_primera_seg_audiencia());
                        if (vTipoAudiencia != null) {
                            break;
                        }
                        intentos--;
                    }
                }
                Integer test = vTipoAudiencia.getId_audiencia();
                Date loc_date = StrtoDate(formAudiencia.getFecha_programada(), formAudiencia.getHora_programada());
                //response.setValue(saveProgramaAudiencia(loc_date,vTipoAudiencia,formAudiencia.getId_queja()) );
                TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formAudiencia.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
                if (vTipoProgramaAudiencia != null) {
                    vTipoProgramaAudiencia.setActivo(false);
                    tipoDao.saveTipoProgramaAudiencia(vTipoProgramaAudiencia);
                }
                response.setValue(vTipoProgramaAudiencia);
                TipoProgramaAudiencia nTipoProgramaAudiencia = new TipoProgramaAudiencia();
                nTipoProgramaAudiencia.setActivo(true);
                nTipoProgramaAudiencia.setFecha_programada(loc_date);
                nTipoProgramaAudiencia.setTipoAudiencia(vTipoAudiencia);
                System.out.println(vTipoAudiencia.getId_audiencia());
                tipoDao.saveTipoProgramaAudiencia(nTipoProgramaAudiencia);
                response.setValue(nTipoProgramaAudiencia);

                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                DateFormat timeFormat = new SimpleDateFormat("HH:mm aaa");
                //revisar si correo esta activo en parametros de sistema
                TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_NOTIFICACIONES_AUDIENCIA);
                if (efuente != null) {
                    if (efuente.getActivo() == 1) {
                        //mandar correo consumidor 

                        String cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> DIACO le comunica que la audiencia motivo de la queja " + vTipoQueja.getQuejaNumero()
                                + " ha sido programada para el " + dateFormat.format(loc_date) + " a las " + timeFormat.format(loc_date)
                                + ", por lo que se le pide tomar en cuenta que ser&aacute; necesario contar con su presencia debidamente identificado con su DPI y/o Pasaporte y/o Representaci&oacute;n Legal,"
                                + " Patente de Comercio (cuando aplique), " + LimpiaStringTildes(direccion_fisica) + "<br>";
                        String[] mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                        saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_NOTIFICACIONES_AUDIENCIA, cuerpo); // fuente de email 5: notificacion audiencia
                        //mandar correo proveedor
                        mailstring = GetEmailStringProveedor(vTipoQueja.getId_proveedor());
                        saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_NOTIFICACIONES_AUDIENCIA, cuerpo); // fuente de email 5: notificacion audiencia
                    }
                }
                //bitacora auto log
                TipoUsuario_Conf vtipousuario = tipoDao.findByIdUsuarioConf(formAudiencia.getUsuario());
                TipoProveedor vproveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
                String txtmensaje = "Audiencia Programada para " + dateFormat.format(loc_date) + ", "
                        + timeFormat.format(loc_date);
                if (vtipousuario != null) {
                    txtmensaje = txtmensaje + ". Operaci??n realizada por: " + vtipousuario.getNombre() + "(" + vtipousuario.getLogin() + ")";
                }
                if (vproveedor != null) {
                    txtmensaje = txtmensaje + ". Proveedor citado: " + vproveedor.getNombre() + ".";
                }
                BitacoraAutomatica(formAudiencia.getId_queja(), 1, formAudiencia.getUsuario(), txtmensaje, txtmensaje, current_type);

                transaction2.commit();
            } catch (Exception e) {
                e.printStackTrace();
                response.setCode(1L);
                response.setReason("ERROR");
                try {
                    transaction2.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        }
        return response;
    }

    //Resultado Audiencia
    @Override
    public ResponseRs listResultadoAudiencia(Integer no_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoResultadoAudiencia(no_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Registro: Cedula Citacion Consumidor
    public ResponseRs getReg_CedCitacionCon(Integer id_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoReg_CedCitacionCon(id_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs get2Registros2Notificaciones(Integer id_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.find2Ced2Notif(id_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs get2Reg2NotiJuridico(Integer id_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.find2Ced2NotifJuridico(id_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

//aqui hay que llamar al DIACO-AS-FO-08 y DIACO-AS-FO-05
    @Override
    public ResponseRs save2Registros2NotificacionesJuridico(FormRegistro formRegistro) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        boolean flagError = false;
        try {
            tipoDao.TokenCheck(formRegistro.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            Long correlativoCons = tipoDao.getSecuenciaCitasNotisJur();
            Long correlativoProv = tipoDao.getSecuenciaCitasNotisJur();
            System.out.println("REVISOR JJ: Valor de la Variable correlativoCons: " + correlativoCons);
            System.out.println("REVISOR JJ: Valor de la Variable correlativoProv: " + correlativoProv);

            response = save_Reg_CedulaNotificacionJuridico(formRegistro, correlativoCons, "C");
            if (response.getCode() == 1L) {
                flagError = true;
            }

            response = save_Reg_CedulaNotificacionJuridico(formRegistro, correlativoProv, "P");
            if (response.getCode() == 1L) {
                flagError = true;
            }

            response = save_Reg_CedCitacionConjuridico(formRegistro, correlativoCons);
            if (response.getCode() == 1L) {
                flagError = true;
            }

            response = Save_Reg_CedCitacionProJur(formRegistro, correlativoProv);
            if (response.getCode() == 1L) {
                flagError = true;
            }

            response = save_Reg_CedulaNotificacionCitacionCorreo(formRegistro, correlativoProv);
            if (response.getCode() == 1L) {
                flagError = true;
            }
            response = save_Reg_CedulaNotificacionResCorreo(formRegistro, correlativoCons);
            if (response.getCode() == 1L) {
                flagError = true;
            }

            if (!flagError) {
                transaction.commit();
            } else {
                response.setCode(1L);
                response.setReason("ERROR");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs save2Registros2Notificaciones(FormRegistro formRegistro) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        boolean flagError = false;
        try {
            tipoDao.TokenCheck(formRegistro.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            Long correlativoCitaNotiCons = tipoDao.getSecuenciaCitasNotis();
            Long correlativoCitaNotiProvs = tipoDao.getSecuenciaCitasNotis();
            response = save_Reg_CedCitacionCon(formRegistro, correlativoCitaNotiCons);
            if (response.getCode() == 1L) {
                flagError = true;
            }
            response = Save_Reg_CedCitacionPro(formRegistro, correlativoCitaNotiProvs);
            if (response.getCode() == 1L) {
                flagError = true;
            }
            response = Save_Reg_CedNotificacionCon(formRegistro, correlativoCitaNotiCons);
            if (response.getCode() == 1L) {
                flagError = true;
            }
            response = Save_Reg_CedNotificacionPro(formRegistro, correlativoCitaNotiProvs);
            if (response.getCode() == 1L) {
                flagError = true;
            }

            if (!flagError) {
                transaction.commit();
            } else {
                response.setCode(1L);
                response.setReason("ERROR");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /*   private boolean save2Registros2NotificacionesPriv(FormRegistro formRegistro) throws Exception{
                ResponseRs response = new ResponseRs();
                boolean flagError=false;
                response=save_Reg_CedCitacionCon(formRegistro);
        if (response.getCode() == 1L) {
                    flagError=true;
        }
                response=Save_Reg_CedCitacionPro(formRegistro);
        if (response.getCode() == 1L) {
                    flagError=true;
        }
                response=Save_Reg_CedNotificacionCon(formRegistro);
        if (response.getCode() == 1L) {
                    flagError=true;
        }
                response=Save_Reg_CedNotificacionPro(formRegistro);
        if (response.getCode() == 1L) {
                    flagError=true;
        }

                if(!flagError){
                    return true;
                }else{
                    return false;
                }
        }*/
    private ResponseRs save_Reg_CedCitacionCon(FormRegistro formRegistro, Long correlativoCitaNotiCons) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TipoReg_CedCitacionCon vTipoReg_CedCitacionCon = tipoDao.findAllTipoReg_CedCitacionCon(formRegistro.getId_audiencia());
        if (vTipoReg_CedCitacionCon == null) {
            vTipoReg_CedCitacionCon = new TipoReg_CedCitacionCon();
            vTipoReg_CedCitacionCon.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR)); //registro 1-com consumidor, guarda el correlativo global
            vTipoReg_CedCitacionCon.setCodigo_citacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR)); // reg 3-cedula citacion consumidor, guarda correlativo citacion global
            vTipoReg_CedCitacionCon.setId_audiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR); // reg 3-cedula citacion consumidor,
            vTipoReg_CedCitacionCon.setVersion(vTipoRegistro.getVersion());
//                   
            vTipoReg_CedCitacionCon.setCorrelativo(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR, correlativoCitaNotiCons));

        }

        /*   if(vTipoReg_CedCitacionCon.getCorrelativo()==null)
                {  vTipoReg_CedCitacionCon.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR));
                }*/
        vTipoReg_CedCitacionCon.setCreado_por(formRegistro.getCreado_por());
        vTipoReg_CedCitacionCon.setId_queja(formRegistro.getId_queja());
        vTipoReg_CedCitacionCon.setId_registro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR); //registro 3-cedula citacion consumidor
        vTipoReg_CedCitacionCon.setJefe_dpto(JefeDepartamento(1));

        //buscar informacion audiencia
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        Integer tipo_registro = null;
        if (vTipoAudiencia != null) {
            switch (vTipoAudiencia.getEs_primera_seg_audiencia()) {
                case 1:
                    vTipoReg_CedCitacionCon.setNo_audiencia("primera");
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_CONCILIACION; //audiencia concilicacion
                    break;
                case 2:
                    vTipoReg_CedCitacionCon.setNo_audiencia("segunda");
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_OFRECIMIENTO_MED_PRUEBAS; //audiencia ofrecimiento medios de prueba
                    break;
            }
            if (tipo_registro != null) {
                vTipoReg_CedCitacionCon.setId_tipo_registro(tipo_registro);
            }
            //buscar informacion de programacion de audiencia
            //revisar aqui deberia haber un parametro para no_audiencia, ver error de active 0 en audiencia 1
            TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formRegistro.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
            vTipoReg_CedCitacionCon.setFecha_cita(vTipoProgramaAudiencia.getFecha_programada());
            vTipoReg_CedCitacionCon.setFecha_creacion(new Date());

        } else {
            response.setCode(1L);
            response.setReason("ERROR");
        }
        //buscar informacion queja
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        vTipoReg_CedCitacionCon.setDetalle_queja(vTipoQueja.getDetalle_queja());
        vTipoReg_CedCitacionCon.setAnio_queja(vTipoQueja.getAnio());
        vTipoReg_CedCitacionCon.setQuejanumero(vTipoQueja.getNo_queja());
        vTipoReg_CedCitacionCon.setSolucion(vTipoQueja.getSolicita_que());
        //buscar informacion consumidor
        TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
        if (vTipoConsumidor != null) {
            vTipoReg_CedCitacionCon.setNombre_consumidor(vTipoConsumidor.getNombreCompleto());
            vTipoReg_CedCitacionCon.setDireccion(vTipoConsumidor.getDireccion());
            vTipoReg_CedCitacionCon.setDpto_muni(vTipoConsumidor.getTipoDepartamento().getNombre_departamento() + ", " + vTipoConsumidor.getTipoMunicipio().getNombre_municipio());
            vTipoReg_CedCitacionCon.setZona(vTipoConsumidor.getDireccion_zona());
            vTipoReg_CedCitacionCon.setTelefonos(CommaSeparatedTelefCons(vTipoQueja.getId_consumidor()));
        }
        //buscar informacion proveedor
        TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
        if (vTipoProveedor != null) {
            vTipoReg_CedCitacionCon.setNombre_proveedor(vTipoProveedor.getNombre());
        }
        //buscar info sede
        TipoSede vTipoSede = tipoDao.findByIdSede(vTipoQueja.getId_diaco_sede());
        if (vTipoSede != null) {
            vTipoReg_CedCitacionCon.setDireccion_sede(vTipoSede.getDireccion_sede());
            vTipoReg_CedCitacionCon.setDpto_sede(vTipoSede.getTipoMunicipio().getTipotipoDpto().getNombre_departamento());
            vTipoReg_CedCitacionCon.setMuni_sede(vTipoSede.getTipoMunicipio().getNombre_municipio());
        }
        tipoDao.saveReg_CedCitacionCon(vTipoReg_CedCitacionCon);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_CedCitacionCon);
        return response;
    }

    //DIACO-AS-FO-08 --CONS
    private ResponseRs save_Reg_CedCitacionConjuridico(FormRegistro formRegistro, Long correlativoCitaNotiConsJur) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TIpoReg_CedulaCitacionConJur vTIpoReg_CedulaCitacionConJur = tipoDao.findAllTipoReg_CedCitacionConJur(formRegistro.getId_audiencia());

        if (vTIpoReg_CedulaCitacionConJur == null) {
            vTIpoReg_CedulaCitacionConJur = new TIpoReg_CedulaCitacionConJur();
            vTIpoReg_CedulaCitacionConJur.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR_JUR)); //registro 26
            //  vTIpoReg_CedulaCitacionConJur.setCodigoCitacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR)); // reg 26-cedula citacion consumidor, guarda correlativo citacion global
            vTIpoReg_CedulaCitacionConJur.setIdAudiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR_JUR); // reg 26-cedula citacion consumidor,
            vTIpoReg_CedulaCitacionConJur.setVersion(vTipoRegistro.getVersion());
//                   

        }

        vTIpoReg_CedulaCitacionConJur.setCorrelativo(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR_JUR, correlativoCitaNotiConsJur));
        /*   if(vTipoReg_CedCitacionCon.getCorrelativo()==null)
                {  vTipoReg_CedCitacionCon.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR));
                }*/
        vTIpoReg_CedulaCitacionConJur.setCreadoPor(formRegistro.getCreado_por());
        vTIpoReg_CedulaCitacionConJur.setIdQueja(formRegistro.getId_queja());
        vTIpoReg_CedulaCitacionConJur.setIdRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR_JUR); //registro 26-cedula citacion consumidor
        //  vTIpoReg_CedulaCitacionConJur.setJefe_dpto(JefeDepartamento(1));

        //buscar informacion audiencia
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        Integer tipo_registro = null;
        if (vTipoAudiencia != null) {
            switch (vTipoAudiencia.getEs_primera_seg_audiencia()) {
                case 1:
                    vTIpoReg_CedulaCitacionConJur.setNoAudiencia("primera");
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_CONCILIACION; //audiencia concilicacion
                    break;
                case 2:
                    vTIpoReg_CedulaCitacionConJur.setNoAudiencia("segunda");
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_OFRECIMIENTO_MED_PRUEBAS; //audiencia ofrecimiento medios de prueba
                    break;
            }
            if (tipo_registro != null) {
                vTIpoReg_CedulaCitacionConJur.setIdTipoRegistro(tipo_registro);
            }
            //buscar informacion de programacion de audiencia
            //revisar aqui deberia haber un parametro para no_audiencia, ver error de active 0 en audiencia 1
            TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formRegistro.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
            vTIpoReg_CedulaCitacionConJur.setFechaCita(vTipoProgramaAudiencia.getFecha_programada());
            vTIpoReg_CedulaCitacionConJur.setFechaCreacion(new Date());

        } else {
            response.setCode(1L);
            response.setReason("ERROR");
        }
        //buscar informacion queja
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        //vTIpoReg_CedulaCitacionConJur.setDetalle_queja(vTipoQueja.getDetalle_queja());
        vTIpoReg_CedulaCitacionConJur.setAnioQueja(vTipoQueja.getAnio());
        vTIpoReg_CedulaCitacionConJur.setQuejanumero(vTipoQueja.getNo_queja());
        // vTIpoReg_CedulaCitacionConJur.setSolucion(vTipoQueja.getSolicita_que());
        //buscar informacion consumidor
        TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
        if (vTipoConsumidor != null) {
            vTIpoReg_CedulaCitacionConJur.setNombreConsumidor(vTipoConsumidor.getNombreCompleto());
            vTIpoReg_CedulaCitacionConJur.setDireccionConsumidor(vTipoConsumidor.getDireccion());
            vTIpoReg_CedulaCitacionConJur.setDptoConsumidorMuni(vTipoConsumidor.getTipoDepartamento().getNombre_departamento() + ", " + vTipoConsumidor.getTipoMunicipio().getNombre_municipio());
            vTIpoReg_CedulaCitacionConJur.setZonaConsumidor(vTipoConsumidor.getDireccion_zona());
            vTIpoReg_CedulaCitacionConJur.setTelefonosConsumidor(CommaSeparatedTelefCons(vTipoQueja.getId_consumidor()));
        }
        //buscar informacion proveedor
        TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
        if (vTipoProveedor != null) {
            vTIpoReg_CedulaCitacionConJur.setNombreProveedor(vTipoProveedor.getNombre());
        }
        //buscar info sede
        TipoSede vTipoSede = tipoDao.findByIdSede(vTipoQueja.getId_diaco_sede());
        if (vTipoSede != null) {
            vTIpoReg_CedulaCitacionConJur.setDireccionSede(vTipoSede.getDireccion_sede());
            vTIpoReg_CedulaCitacionConJur.setDptoSede(vTipoSede.getTipoMunicipio().getTipotipoDpto().getNombre_departamento());
            vTIpoReg_CedulaCitacionConJur.setMuniSede(vTipoSede.getTipoMunicipio().getNombre_municipio());
        }
        tipoDao.saveReg_CedCitacionConJur(vTIpoReg_CedulaCitacionConJur);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTIpoReg_CedulaCitacionConJur);
        return response;
    }

    private ResponseRs Save_Reg_CedCitacionPro(FormRegistro formRegistro, Long correlativoCitaNotiProvs) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        TipoReg_CedCitacionPro vTipoReg_CedCitacionPro = tipoDao.findAllTipoReg_CedCitacionPro(formRegistro.getId_audiencia());
        if (vTipoReg_CedCitacionPro == null) {
            vTipoReg_CedCitacionPro = new TipoReg_CedCitacionPro();
            vTipoReg_CedCitacionPro.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR)); //registro 1-com consumidor, guarda el correlativo global
            vTipoReg_CedCitacionPro.setCodigo_citacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR)); // reg 3-cedula citacion consumidor, guarda correlativo citacion global
            vTipoReg_CedCitacionPro.setId_audiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR); // reg 4-cedula citacion proveedor,
            vTipoReg_CedCitacionPro.setVersion(vTipoRegistro.getVersion());

            vTipoReg_CedCitacionPro.setCorrelativo(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR, correlativoCitaNotiProvs));
            //Locale.setDefault(new Locale("es", "GT", "UNIX"));

            vTipoReg_CedCitacionPro.setHist_fecha_citas(simpleDateFormat.format(new Date()));
        } else {
            vTipoReg_CedCitacionPro.setHist_fecha_citas(vTipoReg_CedCitacionPro.getHist_fecha_citas() + ", " + simpleDateFormat.format(new Date()));
        }
        /*   if(vTipoReg_CedCitacionPro.getCorrelativo()==null)
                {  vTipoReg_CedCitacionPro.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR));
                }*/

        vTipoReg_CedCitacionPro.setCreado_por(formRegistro.getCreado_por());
        vTipoReg_CedCitacionPro.setId_queja(formRegistro.getId_queja());
        vTipoReg_CedCitacionPro.setId_registro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR); //registro 4-cedula citacion proveedor
        vTipoReg_CedCitacionPro.setJefe_dpto(JefeDepartamento(1));

        //buscar informacion audiencia
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        Integer tipo_registro = null;
        if (vTipoAudiencia != null) {
            switch (vTipoAudiencia.getEs_primera_seg_audiencia()) {
                case 1:
                    vTipoReg_CedCitacionPro.setNo_audiencia("primera");
                    tipo_registro = 4; //audiencia concilicacion
                    break;
                case 2:
                    vTipoReg_CedCitacionPro.setNo_audiencia("segunda");
                    tipo_registro = 5; //audiencia ofrecimiento medios de prueba
                    break;
            }
            if (tipo_registro != null) {
                vTipoReg_CedCitacionPro.setId_tipo_registro(tipo_registro);
            }
            //buscar informacion de programacion de audiencia
            TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formRegistro.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
            vTipoReg_CedCitacionPro.setFecha_cita(vTipoProgramaAudiencia.getFecha_programada());
            vTipoReg_CedCitacionPro.setFecha_creacion(new Date());

        } else {
            response.setCode(1L);
            response.setReason("ERROR");
        }
        //buscar informacion queja
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        vTipoReg_CedCitacionPro.setDetalle_queja(vTipoQueja.getDetalle_queja());
        vTipoReg_CedCitacionPro.setAnio_queja(vTipoQueja.getAnio());
        vTipoReg_CedCitacionPro.setQuejanumero(vTipoQueja.getNo_queja());
        vTipoReg_CedCitacionPro.setSolucion(vTipoQueja.getSolicita_que());
        //buscar informacion consumidor
        TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
        if (vTipoConsumidor != null) {
            vTipoReg_CedCitacionPro.setNombre_consumidor(vTipoConsumidor.getNombreCompleto());
        }
        //buscar informacion proveedor
        TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
        if (vTipoProveedor != null) {
            vTipoReg_CedCitacionPro.setNombre_proveedor(vTipoProveedor.getNombre());
            vTipoReg_CedCitacionPro.setDireccion(vTipoQueja.getDireccion_proveedor());
            //AQUI HAY QUE PONER LA SUCURSAL CUANDO HALLA
            vTipoReg_CedCitacionPro.setZona(String.valueOf(vTipoQueja.getZona_proveedor()));
            vTipoReg_CedCitacionPro.setDpto_muni(vTipoQueja.getTipoDepartamento().getNombre_departamento() + ", " + vTipoQueja.getTipoMunicipio().getNombre_municipio());
            //tambien la el municipio y depto de la SUCURSAL

            vTipoReg_CedCitacionPro.setTelefonos(CommaSeparatedTelefPro(vTipoQueja.getId_proveedor()));
        }
        //buscar info sede
        TipoSede vTipoSede = tipoDao.findByIdSede(vTipoQueja.getId_diaco_sede());
        if (vTipoSede != null) {
            vTipoReg_CedCitacionPro.setDireccion_sede(vTipoSede.getDireccion_sede());
            vTipoReg_CedCitacionPro.setDpto_sede(vTipoSede.getTipoMunicipio().getTipotipoDpto().getNombre_departamento());
            vTipoReg_CedCitacionPro.setMuni_sede(vTipoSede.getTipoMunicipio().getNombre_municipio());
        }
        tipoDao.saveReg_CedCitacionPro(vTipoReg_CedCitacionPro);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_CedCitacionPro);
        return response;
    }
    //DIACO-AS-FO-08 PROVEEDOR

    private ResponseRs Save_Reg_CedCitacionProJur(FormRegistro formRegistro, Long correlativoProv) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        TipoReg_CedulaCitacionProJur vTipoReg_CedulaCitacionProJur = tipoDao.findByIdAudienciaTipoReg_CedCitacionPro(formRegistro.getId_audiencia());
        if (vTipoReg_CedulaCitacionProJur == null) {
            vTipoReg_CedulaCitacionProJur = new TipoReg_CedulaCitacionProJur();
            vTipoReg_CedulaCitacionProJur.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR_JUR));
            // vTipoReg_CedulaCitacionProJur.setCodigo_citacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR_JUR));
            vTipoReg_CedulaCitacionProJur.setIdAudiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR_JUR);
            vTipoReg_CedulaCitacionProJur.setVersion(vTipoRegistro.getVersion());
            //  vTipoReg_CedCitacionPro.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR));

            //Locale.setDefault(new Locale("es", "GT", "UNIX"));
            // vTipoReg_CedCitacionPro.setHist_fecha_citas(simpleDateFormat.format(new Date()));
        }

//else  vTipoReg_CedCitacionPro.setHist_fecha_citas(vTipoReg_CedCitacionPro.getHist_fecha_citas()+", "+simpleDateFormat.format(new Date()));
        /*   if(vTipoReg_CedCitacionPro.getCorrelativo()==null)
                {  vTipoReg_CedCitacionPro.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR));
                }*/
        vTipoReg_CedulaCitacionProJur.setCorrelativo(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR_JUR, correlativoProv));
        vTipoReg_CedulaCitacionProJur.setCreadoPor(formRegistro.getCreado_por());
        vTipoReg_CedulaCitacionProJur.setIdQueja(formRegistro.getId_queja());
        vTipoReg_CedulaCitacionProJur.setIdRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR_JUR);
        //vTipoReg_CedulaCitacionProJur.setJefe_dpto(JefeDepartamento(1));

        //buscar informacion audiencia
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        Integer tipo_registro = null;
        if (vTipoAudiencia != null) {
            switch (vTipoAudiencia.getEs_primera_seg_audiencia()) {
                case 1:
                    vTipoReg_CedulaCitacionProJur.setNoAudiencia("primera");
                    tipo_registro = 4; //audiencia concilicacion
                    break;
                case 2:
                    vTipoReg_CedulaCitacionProJur.setNoAudiencia("segunda");
                    tipo_registro = 5; //audiencia ofrecimiento medios de prueba
                    break;
            }
            if (tipo_registro != null) {
                vTipoReg_CedulaCitacionProJur.setIdTipoRegistro(tipo_registro);
            }
            //buscar informacion de programacion de audiencia
            TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formRegistro.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
            vTipoReg_CedulaCitacionProJur.setFechaCita(vTipoProgramaAudiencia.getFecha_programada());
            vTipoReg_CedulaCitacionProJur.setFechaCreacion(new Date());

        } else {
            response.setCode(1L);
            response.setReason("ERROR");
        }
        //buscar informacion queja
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        //     vTipoReg_CedulaCitacionProJur.setDetalle_queja(vTipoQueja.getDetalle_queja());
        vTipoReg_CedulaCitacionProJur.setAnioQueja(vTipoQueja.getAnio());
        vTipoReg_CedulaCitacionProJur.setQuejanumero(vTipoQueja.getNo_queja());
        // vTipoReg_CedulaCitacionProJur.setSolucion(vTipoQueja.getSolicita_que());
        //buscar informacion consumidor
        TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
        if (vTipoConsumidor != null) {
            vTipoReg_CedulaCitacionProJur.setNombreConsumidor(vTipoConsumidor.getNombreCompleto());
        }
        //buscar informacion proveedor
        TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
        if (vTipoProveedor != null) {
            vTipoReg_CedulaCitacionProJur.setNombreProveedor(vTipoProveedor.getNombre());
            vTipoReg_CedulaCitacionProJur.setDireccionProveedor(vTipoQueja.getDireccion_proveedor());
            //AQUI HAY QUE PONER LA SUCURSAL CUANDO HALLA
            vTipoReg_CedulaCitacionProJur.setZonaProveedor(String.valueOf(vTipoQueja.getZona_proveedor()));
            vTipoReg_CedulaCitacionProJur.setDptoProveedorMuni(vTipoQueja.getTipoDepartamento().getNombre_departamento() + ", " + vTipoQueja.getTipoMunicipio().getNombre_municipio());
            //tambien la el municipio y depto de la SUCURSAL

            vTipoReg_CedulaCitacionProJur.setTelefonosProveedor(CommaSeparatedTelefPro(vTipoQueja.getId_proveedor()));
        }
        //buscar info sede
        TipoSede vTipoSede = tipoDao.findByIdSede(vTipoQueja.getId_diaco_sede());
        if (vTipoSede != null) {
            vTipoReg_CedulaCitacionProJur.setDireccionSede(vTipoSede.getDireccion_sede());
            vTipoReg_CedulaCitacionProJur.setDptoSede(vTipoSede.getTipoMunicipio().getTipotipoDpto().getNombre_departamento());
            vTipoReg_CedulaCitacionProJur.setMuniSede(vTipoSede.getTipoMunicipio().getNombre_municipio());
        }
        tipoDao.saveReg_CedCitacionProJur(vTipoReg_CedulaCitacionProJur);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_CedulaCitacionProJur);
        return response;
    }

    // DIACO-AS-FO-05 PROV Y CONS
    private ResponseRs save_Reg_CedulaNotificacionJuridico(FormRegistro formRegistro, Long correlativo, String es_consumidor_proveedor) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TipoReg_CedulaNotificacionCitacionJuridico vTipoReg_CedulaNotificacionCitacionJuridico = tipoDao.findAllTipoReg_CedNotificacionCitaJuridico(formRegistro.getId_audiencia(), es_consumidor_proveedor);
        if (vTipoReg_CedulaNotificacionCitacionJuridico == null) {
            vTipoReg_CedulaNotificacionCitacionJuridico = new TipoReg_CedulaNotificacionCitacionJuridico();
            vTipoReg_CedulaNotificacionCitacionJuridico.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_JURIDICO));

            vTipoReg_CedulaNotificacionCitacionJuridico.setId_audiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_JURIDICO); // 
            vTipoReg_CedulaNotificacionCitacionJuridico.setVersion(vTipoRegistro.getVersion());

        }
        vTipoReg_CedulaNotificacionCitacionJuridico.setCorrelativo(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_JURIDICO, correlativo));
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        if (es_consumidor_proveedor.equals("C")) {
            //INFO CONSUMIDOR
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            vTipoReg_CedulaNotificacionCitacionJuridico.setTelefono(vTipoConsumidor.getTelefono());
            vTipoReg_CedulaNotificacionCitacionJuridico.setMunicipio(vTipoConsumidor.getTipoMunicipio().getNombre_municipio());
            vTipoReg_CedulaNotificacionCitacionJuridico.setDepartamento(vTipoConsumidor.getTipoDepartamento().getNombre_departamento());
            vTipoReg_CedulaNotificacionCitacionJuridico.setDireccion(vTipoConsumidor.getDireccion() + " zona " + vTipoConsumidor.getDireccion_zona());
            vTipoReg_CedulaNotificacionCitacionJuridico.setNombre(vTipoConsumidor.getNombreCompleto());
            vTipoReg_CedulaNotificacionCitacionJuridico.setEs_consumidor_proveedor("C");
        } else {
            //INFO PROVEEDOR
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            vTipoReg_CedulaNotificacionCitacionJuridico.setTelefono(vTipoProveedor.getTelefono());
            vTipoReg_CedulaNotificacionCitacionJuridico.setMunicipio(vTipoQueja.getTipoMunicipioProv().getNombre_municipio());
            vTipoReg_CedulaNotificacionCitacionJuridico.setDepartamento(vTipoQueja.getTipoDepartamentoProv().getNombre_departamento());
            vTipoReg_CedulaNotificacionCitacionJuridico.setDireccion(vTipoQueja.getDireccion_proveedor());
            vTipoReg_CedulaNotificacionCitacionJuridico.setNombre(vTipoProveedor.getNombre());
            vTipoReg_CedulaNotificacionCitacionJuridico.setEs_consumidor_proveedor("P");

        }

        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        //revisar aqui deberia haber un parametro para no_audiencia, ver error de active 0 en audiencia 1
        TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formRegistro.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
        vTipoReg_CedulaNotificacionCitacionJuridico.setFecha_citacion(vTipoProgramaAudiencia.getFecha_programada());

        vTipoReg_CedulaNotificacionCitacionJuridico.setCreadoPor(formRegistro.getCreado_por());
        vTipoReg_CedulaNotificacionCitacionJuridico.setIdQueja(formRegistro.getId_queja());
        vTipoReg_CedulaNotificacionCitacionJuridico.setIdRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_JURIDICO); //registro 5-cedula notificacion consumidor
        vTipoReg_CedulaNotificacionCitacionJuridico.setIdTipoRegistro(Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_OFRECIMIENTO_MED_PRUEBAS_JURIDICO);

        vTipoReg_CedulaNotificacionCitacionJuridico.setFechaCreacion(new Date());

        if (vTipoAudiencia == null) {
            response.setCode(1L);
            response.setReason("ERROR");
            return response;
        }

        vTipoReg_CedulaNotificacionCitacionJuridico.setQuejanumero(vTipoQueja.getNo_queja());

        tipoDao.saveReg_CedNotificacionCitaJuridico(vTipoReg_CedulaNotificacionCitacionJuridico);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_CedulaNotificacionCitacionJuridico);
        return response;
    }

    private ResponseRs save_Reg_CedulaNotificacionCitacionCorreo(FormRegistro formRegistro, Long correlativo) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TipoReg_RegCedulaNotificacionCitCorreo vTipoReg_RegCedulaNotificacionCitCorreo = tipoDao.findTipoReg_CedNotificacionResJuridicoByIdAud(formRegistro.getId_audiencia());
        if (vTipoReg_RegCedulaNotificacionCitCorreo == null) {
            vTipoReg_RegCedulaNotificacionCitCorreo = new TipoReg_RegCedulaNotificacionCitCorreo();
            vTipoReg_RegCedulaNotificacionCitCorreo.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_CORREO));
            //  vTipoReg_RegCedulaNotificacionCitCorreo.setCorrelativoCitacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_CORREO));

            vTipoReg_RegCedulaNotificacionCitCorreo.setId_audiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_CORREO); // 
            vTipoReg_RegCedulaNotificacionCitCorreo.setVersion(vTipoRegistro.getVersion());

        }

        vTipoReg_RegCedulaNotificacionCitCorreo.setCorrelativoCitacion(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_CORREO, correlativo));
        vTipoReg_RegCedulaNotificacionCitCorreo.setCreadoPor(formRegistro.getCreado_por());
        vTipoReg_RegCedulaNotificacionCitCorreo.setIdQueja(formRegistro.getId_queja());
        vTipoReg_RegCedulaNotificacionCitCorreo.setIdRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_CORREO); //registro 5-cedula notificacion consumidor
        vTipoReg_RegCedulaNotificacionCitCorreo.setIdTipoRegistro(Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_OFRECIMIENTO_MED_PRUEBAS_JURIDICO);
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        vTipoReg_RegCedulaNotificacionCitCorreo.setFechaCreacion(new Date());

        if (vTipoAudiencia == null) {
            response.setCode(1L);
            response.setReason("ERROR");
            return response;
        }

        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        vTipoReg_RegCedulaNotificacionCitCorreo.setQuejanumero(vTipoQueja.getNo_queja());

        TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
        vTipoReg_RegCedulaNotificacionCitCorreo.setCitacionHacia(vTipoConsumidor.getNombreCompleto());
        vTipoReg_RegCedulaNotificacionCitCorreo.setFechaCitacion(new Date());

        tipoDao.saveReg_CedulaNotificacionCitacionCorreo(vTipoReg_RegCedulaNotificacionCitCorreo);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_RegCedulaNotificacionCitCorreo);
        return response;
    }

    private ResponseRs save_Reg_CedulaNotificacionResCorreo(FormRegistro formRegistro, Long correlativo) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TipoReg_CedulaNotificacionResCorreo vTipoReg_RegCedulaNotificacionResCorreo = tipoDao.findTipoReg_CedNotificacionResCorreo(formRegistro.getId_audiencia());
        if (vTipoReg_RegCedulaNotificacionResCorreo == null) {
            vTipoReg_RegCedulaNotificacionResCorreo = new TipoReg_CedulaNotificacionResCorreo();
            vTipoReg_RegCedulaNotificacionResCorreo.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_RES_CORREO));
            // vTipoReg_RegCedulaNotificacionResCorreo.setCorrelativoNotificacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_RES_CORREO));

            vTipoReg_RegCedulaNotificacionResCorreo.setId_audiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_RES_CORREO); // 
            vTipoReg_RegCedulaNotificacionResCorreo.setVersion(vTipoRegistro.getVersion());

        }
        vTipoReg_RegCedulaNotificacionResCorreo.setCorrelativoNotificacion(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_RES_CORREO, correlativo));
        vTipoReg_RegCedulaNotificacionResCorreo.setCreadoPor(formRegistro.getCreado_por());
        vTipoReg_RegCedulaNotificacionResCorreo.setIdQueja(formRegistro.getId_queja());
        vTipoReg_RegCedulaNotificacionResCorreo.setIdRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_RES_CORREO); //registro 17-cedula notificacion consumidor
        vTipoReg_RegCedulaNotificacionResCorreo.setIdTipoRegistro(Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_OFRECIMIENTO_MED_PRUEBAS_JURIDICO);
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        vTipoReg_RegCedulaNotificacionResCorreo.setFechaCreacion(new Date());
        vTipoReg_RegCedulaNotificacionResCorreo.setFechaResolucion(new Date());

        if (vTipoAudiencia == null) {
            response.setCode(1L);
            response.setReason("ERROR");
            return response;
        }

        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        vTipoReg_RegCedulaNotificacionResCorreo.setQuejanumero(vTipoQueja.getNo_queja());

        TipoConsumidor vTipoCOnsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
        vTipoReg_RegCedulaNotificacionResCorreo.setNotificacionHacia(vTipoCOnsumidor.getNombreCompleto());

        tipoDao.saveReg_CedulaNotificacionResCorreo(vTipoReg_RegCedulaNotificacionResCorreo);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_RegCedulaNotificacionResCorreo);
        return response;
    }

    //DIACO-AS-FO-04
    private ResponseRs save_Reg_CedulaNotificacionResJuridico(CedulaNotificacionDto pCedulaNotificaionDto) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TipoReg_CedulaNotificacionResJuridico vTipoReg_CedulaNotificacionResJuridico = tipoDao.findTipoReg_CedulaNotiResJuridicoByIdResCP(pCedulaNotificaionDto);
        if (vTipoReg_CedulaNotificacionResJuridico == null) {
            vTipoReg_CedulaNotificacionResJuridico = new TipoReg_CedulaNotificacionResJuridico();
            vTipoReg_CedulaNotificacionResJuridico.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_JURIDICO));
            vTipoReg_CedulaNotificacionResJuridico.setCorrelativo(pCedulaNotificaionDto.getCorrelativo());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_JURIDICO); // 
            vTipoReg_CedulaNotificacionResJuridico.setVersion(vTipoRegistro.getVersion());
            vTipoReg_CedulaNotificacionResJuridico.setIdQueja(pCedulaNotificaionDto.getIdQueja());
            vTipoReg_CedulaNotificacionResJuridico.setIdResultadoResolucion(pCedulaNotificaionDto.getIdResultadoResolucion());
            vTipoReg_CedulaNotificacionResJuridico.setEsCP(pCedulaNotificaionDto.getEsCP());
            vTipoReg_CedulaNotificacionResJuridico.setEsResultadoResolucion(pCedulaNotificaionDto.getEsResultadoResolucion());

        }
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(pCedulaNotificaionDto.getIdQueja());
        vTipoReg_CedulaNotificacionResJuridico.setAnio(vTipoQueja.getAnio());
        vTipoReg_CedulaNotificacionResJuridico.setCorrelativo(pCedulaNotificaionDto.getCorrelativo());
        if (pCedulaNotificaionDto.getEsCP().equals("C")) {
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            vTipoReg_CedulaNotificacionResJuridico.setTelefono(CommaSeparatedTelefCons(vTipoConsumidor.getId_consumidor()));
            vTipoReg_CedulaNotificacionResJuridico.setMunicipio(vTipoConsumidor.getTipoMunicipio().getNombre_municipio());
            vTipoReg_CedulaNotificacionResJuridico.setDepartamento(vTipoConsumidor.getTipoDepartamento().getNombre_departamento());
            vTipoReg_CedulaNotificacionResJuridico.setDireccion(vTipoConsumidor.getDireccion() + " zona " + vTipoConsumidor.getDireccion_zona());
            vTipoReg_CedulaNotificacionResJuridico.setNotificoA(vTipoConsumidor.getNombreCompleto());
        } else {
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            vTipoReg_CedulaNotificacionResJuridico.setTelefono(CommaSeparatedTelefPro(vTipoProveedor.getId_proveedor()));
            vTipoReg_CedulaNotificacionResJuridico.setMunicipio(vTipoQueja.getTipoMunicipio().getNombre_municipio());
            vTipoReg_CedulaNotificacionResJuridico.setDepartamento(vTipoQueja.getTipoDepartamento().getNombre_departamento());
            vTipoReg_CedulaNotificacionResJuridico.setDireccion(vTipoQueja.getDireccion_proveedor() + " zona " + vTipoQueja.getZona_proveedor());
            vTipoReg_CedulaNotificacionResJuridico.setNotificoA(vTipoProveedor.getNombre());
        }

        vTipoReg_CedulaNotificacionResJuridico.setCreadoPor(pCedulaNotificaionDto.getUsuario());
        vTipoReg_CedulaNotificacionResJuridico.setIdRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_JURIDICO); //registro 5-cedula notificacion consumidor

        if (pCedulaNotificaionDto.getEsResultadoResolucion().equals("resultadoAudiencia")) {
            vTipoReg_CedulaNotificacionResJuridico.setIdTipoRegistro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
        } else {
            vTipoReg_CedulaNotificacionResJuridico.setIdTipoRegistro(Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
        }

        vTipoReg_CedulaNotificacionResJuridico.setFechaCreacion(new Date());
        vTipoReg_CedulaNotificacionResJuridico.setFechaResolucion(new Date());

        vTipoReg_CedulaNotificacionResJuridico.setQuejanumero(vTipoQueja.getNo_queja());

        tipoDao.saveReg_CedNotificacionJuridico(vTipoReg_CedulaNotificacionResJuridico);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_CedulaNotificacionResJuridico);
        return response;
    }

    private ResponseRs Save_Reg_CedNotificacionCon(FormRegistro formRegistro, Long correlativoCitaNotiCons) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TipoReg_CedNotificacionCon vTipoReg_CedNotificacionCon = tipoDao.findAllTipoReg_CedNotificacionCon(formRegistro.getId_audiencia());
        if (vTipoReg_CedNotificacionCon == null) {
            vTipoReg_CedNotificacionCon = new TipoReg_CedNotificacionCon();
            vTipoReg_CedNotificacionCon.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CONSUMIDOR)); //registro 1-com consumidor, guarda el correlativo global
            vTipoReg_CedNotificacionCon.setCodigo_citacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CONSUMIDOR)); // reg 3-cedula citacion consumidor, guarda correlativo citacion global
            vTipoReg_CedNotificacionCon.setId_audiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CONSUMIDOR); // reg 5-cedula notificacion consumidor,
            vTipoReg_CedNotificacionCon.setVersion(vTipoRegistro.getVersion());
            //     vTipoReg_CedNotificacionCon.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CONSUMIDOR));
            vTipoReg_CedNotificacionCon.setCorrelativo(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CONSUMIDOR, correlativoCitaNotiCons));
        }

        /* if(vTipoReg_CedNotificacionCon.getCorrelativo()==null)
                {  vTipoReg_CedNotificacionCon.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR));
                }*/
        vTipoReg_CedNotificacionCon.setCreado_por(formRegistro.getCreado_por());
        vTipoReg_CedNotificacionCon.setId_queja(formRegistro.getId_queja());
        vTipoReg_CedNotificacionCon.setId_registro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CONSUMIDOR); //registro 5-cedula notificacion consumidor
        vTipoReg_CedNotificacionCon.setJefe_dpto(JefeDepartamento(1));
        //buscar informacion audiencia
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        Integer tipo_registro = null;
        if (vTipoAudiencia != null) {
            switch (vTipoAudiencia.getEs_primera_seg_audiencia()) {
                case 1:
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_CONCILIACION; //audiencia concilicacion
                    break;
                case 2:
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_OFRECIMIENTO_MED_PRUEBAS; //audiencia ofrecimiento medios de prueba
                    break;
            }
            if (tipo_registro != null) {
                vTipoReg_CedNotificacionCon.setId_tipo_registro(tipo_registro);
            }
            //buscar informacion de programacion de audiencia
            TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formRegistro.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
            //vTipoReg_CedNotificacionCon.setFecha_cita(vTipoProgramaAudiencia.getFecha_programada());
            vTipoReg_CedNotificacionCon.setFecha_cita(new Date());
            vTipoReg_CedNotificacionCon.setFecha_creacion(new Date());

        } else {
            response.setCode(1L);
            response.setReason("ERROR");
        }
        //buscar informacion queja
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        vTipoReg_CedNotificacionCon.setAnio_queja(vTipoQueja.getAnio());
        vTipoReg_CedNotificacionCon.setQuejanumero(vTipoQueja.getNo_queja());
        //buscar informacion consumidor
        TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
        if (vTipoConsumidor != null) {
            vTipoReg_CedNotificacionCon.setNombre_consumidor(vTipoConsumidor.getNombreCompleto());
            vTipoReg_CedNotificacionCon.setDireccion(vTipoConsumidor.getDireccion_detalle());
            vTipoReg_CedNotificacionCon.setZona(vTipoConsumidor.getDireccion_zona());
            vTipoReg_CedNotificacionCon.setDepartamento(vTipoConsumidor.getTipoDepartamento().getNombre_departamento());
            vTipoReg_CedNotificacionCon.setMunicipio(vTipoConsumidor.getTipoMunicipio().getNombre_municipio());
        }
        tipoDao.saveReg_CedNotificacionCon(vTipoReg_CedNotificacionCon);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_CedNotificacionCon);
        return response;
    }

    private ResponseRs Save_Reg_CedNotificacionPro(FormRegistro formRegistro, Long correlativoCitaNotiProvs) throws Exception {
        ResponseRs response = new ResponseRs();
        //verificar si es update o insert
        TipoReg_CedNotificacionPro vTipoReg_CedNotificacionPro = tipoDao.findAllTipoReg_CedNotificacionPro(formRegistro.getId_audiencia());
        if (vTipoReg_CedNotificacionPro == null) {
            vTipoReg_CedNotificacionPro = new TipoReg_CedNotificacionPro();
            vTipoReg_CedNotificacionPro.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_PROVEEDOR)); //registro 1-com consumidor, guarda el correlativo global
            vTipoReg_CedNotificacionPro.setCodigo_citacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_PROVEEDOR)); // reg 3-cedula citacion consumidor, guarda correlativo citacion global
            vTipoReg_CedNotificacionPro.setId_audiencia(formRegistro.getId_audiencia());
            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_PROVEEDOR); // reg 4-cedula citacion proveedor,
            vTipoReg_CedNotificacionPro.setVersion(vTipoRegistro.getVersion());
            //  vTipoReg_CedNotificacionPro.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_PROVEEDOR));
            vTipoReg_CedNotificacionPro.setCorrelativo(getCorrelativoRegNotiCita(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_PROVEEDOR, correlativoCitaNotiProvs));
        }

        /*  if(vTipoReg_CedNotificacionPro.getCorrelativo()==null)
                {  vTipoReg_CedNotificacionPro.setCorrelativo(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_PROVEEDOR));
                }*/
        vTipoReg_CedNotificacionPro.setCreado_por(formRegistro.getCreado_por());
        vTipoReg_CedNotificacionPro.setId_queja(formRegistro.getId_queja());
        vTipoReg_CedNotificacionPro.setId_registro(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_PROVEEDOR); //registro 6-cedula notificacion proveedor
        vTipoReg_CedNotificacionPro.setJefe_dpto(JefeDepartamento(1));

        //buscar informacion audiencia
        TipoAudiencia vTipoAudiencia = tipoDao.findByIdAudiencia(formRegistro.getId_audiencia());
        Integer tipo_registro = null;
        if (vTipoAudiencia != null) {
            switch (vTipoAudiencia.getEs_primera_seg_audiencia()) {
                case 1:
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_CONCILIACION; //audiencia concilicacion
                    break;
                case 2:
                    tipo_registro = Constants.REG_TIPO_PROGRAMAR_AUDIENCIA_OFRECIMIENTO_MED_PRUEBAS; //audiencia ofrecimiento medios de prueba
                    break;
            }
            if (tipo_registro != null) {
                vTipoReg_CedNotificacionPro.setId_tipo_registro(tipo_registro);
            }
            //buscar informacion de programacion de audiencia
            TipoProgramaAudiencia vTipoProgramaAudiencia = tipoDao.findTiposProgramaAudienciaxIdQueja(formRegistro.getId_queja(), vTipoAudiencia.getEs_primera_seg_audiencia());
            // vTipoReg_CedNotificacionPro.setFecha_cita(vTipoProgramaAudiencia.getFecha_programada());
            vTipoReg_CedNotificacionPro.setFecha_cita(new Date());
            vTipoReg_CedNotificacionPro.setFecha_creacion(new Date());

        } else {
            response.setCode(1L);
            response.setReason("ERROR");
        }
        //buscar informacion queja
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
        vTipoReg_CedNotificacionPro.setAnio_queja(vTipoQueja.getAnio());
        vTipoReg_CedNotificacionPro.setQuejanumero(vTipoQueja.getNo_queja());
        //buscar informacion proveedor
        TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
        if (vTipoProveedor != null) {
            vTipoReg_CedNotificacionPro.setNombre_proveedor(vTipoProveedor.getNombre());
            vTipoReg_CedNotificacionPro.setDireccion(vTipoQueja.getDireccion_proveedor());
            vTipoReg_CedNotificacionPro.setZona(String.valueOf(vTipoQueja.getZona_proveedor()));
            vTipoReg_CedNotificacionPro.setDepartamento(vTipoQueja.getTipoDepartamentoProv().getNombre_departamento());
            vTipoReg_CedNotificacionPro.setMunicipio(vTipoQueja.getTipoMunicipioProv().getNombre_municipio());
        }
        tipoDao.saveReg_CedNotificacionPro(vTipoReg_CedNotificacionPro);
        response.setCode(0L);
        response.setReason("OK");
        response.setValue(vTipoReg_CedNotificacionPro);
        return response;
    }

    //Registro: Cedula Citacion Proveedor
    @Override
    public ResponseRs getReg_CedCitacionPro(Integer id_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoReg_CedCitacionPro(id_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Registro: Cedula Notificacion Consumidor
    @Override
    public ResponseRs getReg_CedNotificacionCon(Integer id_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoReg_CedNotificacionCon(id_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Registro: Cedula Notificacion Proveedor
    @Override
    public ResponseRs getReg_CedNotificacionPro(Integer id_audiencia, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoReg_CedNotificacionPro(id_audiencia));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    private String JefeDepartamento(Integer id_flujo) {
        //por ahora id_flujo y id_puesto estan mapeados directamente, otro jefe no va a estarlo
        //1-atencion al con, 2-juridico,3-verif y vigilancia
        TipoUsuario_Conf vuser = tipoDao.findByJefeUsuarioConf(id_flujo);
        if (vuser != null) {
            return vuser.getNombre();
        } else {
            return "";
        }
    }

    //motivo poa
    @Override
    public ResponseRs listMotivoPOA(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllMotivoPOA());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }
    //motivo queja finalizada

    @Override
    public ResponseRs listMotivoQuejaFinalizada(String tipo, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllMotivoQuejaFinalizada(tipo));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listMotivoQuejaFinMotivo(Integer padre, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllMotivoQuejaFinMotivo(padre));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //queja finalizada
    @Override
    public ResponseRs getQuejaFinalizada(Integer id_queja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.getTipoQuejaFinxIdQueja(id_queja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveQuejaFinalizada(FormQuejaFinalizada formQuejaFinalizada) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        TipoQuejaFinalizada vTipoQuejaFinalizada;
        boolean isUpdate = true;
        try {
            tipoDao.TokenCheck(formQuejaFinalizada.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoQuejaFinalizada = tipoDao.getTipoQuejaFinxIdQueja(formQuejaFinalizada.getId_queja());
            if (vTipoQuejaFinalizada == null) {
                vTipoQuejaFinalizada = new TipoQuejaFinalizada();
                isUpdate = false;
            }
            //actualizar estado de queja, cambia dependiendo de que flujo vienen y que operacion se realiza
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formQuejaFinalizada.getId_queja());
            /*if (formQuejaFinalizada.isArchivo()) {
                                        vTipoQueja.setId_estado_queja(107); //archivado
                        } else {
                                        vTipoQueja.setId_estado_queja(108); //finalizado
                        }
                        tipoDao.saveQueja(vTipoQueja);
                        response.setValue(vTipoQueja);*/
            //vTipoQueja = tipoDao.findByIdQueja(formQuejaFinalizada.getId_queja());
            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formQuejaFinalizada.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formQuejaFinalizada.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formQuejaFinalizada.getUsuario_operacion());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            //if (formQuejaFinalizada.isArchivo()) {
            newTipoPasoQueja.setId_tipo_registro(11); //archivar queja
            /*} else {
                                        newTipoPasoQueja.setId_tipo_registro(10); //finalizar queja
                        }*/
            newTipoPasoQueja.setUsuario_operacion(formQuejaFinalizada.getUsuario_operacion());
            if (isUpdate) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            tipoDao.savePasoQueja(newTipoPasoQueja);
            response.setValue(newTipoPasoQueja);
            //validar campos y actualizar antes del update
            if (formQuejaFinalizada.getRazon() != null) {
                vTipoQuejaFinalizada.setId_motivo_queja_finalizada(formQuejaFinalizada.getRazon());
            }
            if (formQuejaFinalizada.getDetalles() != null) {
                vTipoQuejaFinalizada.setDetalles(formQuejaFinalizada.getDetalles());
            }
            if (formQuejaFinalizada.getConclusion() != null) {
                vTipoQuejaFinalizada.setConclusion(formQuejaFinalizada.getConclusion());
            }
            if (formQuejaFinalizada.getComentario() != null) {
                vTipoQuejaFinalizada.setComentario(formQuejaFinalizada.getComentario());
            }
            if (formQuejaFinalizada.getCategoria() != null) {
                vTipoQuejaFinalizada.setId_motivo_queja_finalizada_categoria(formQuejaFinalizada.getCategoria());
            }
            if (formQuejaFinalizada.getMotivo_poa() != null) {
                vTipoQuejaFinalizada.setId_motivo_queja_finalizada_poa(formQuejaFinalizada.getMotivo_poa());
            }
            vTipoQuejaFinalizada.setMonto_recuperado(formQuejaFinalizada.getMonto());
            vTipoQuejaFinalizada.setTipopasoqueja(newTipoPasoQueja);
            vTipoQuejaFinalizada.setId_flujo(1); //1 flujo atencion al consumidor
            tipoDao.saveQuejaFinalizada(vTipoQuejaFinalizada);
            //bitacora auto log
            String txtmensaje = "Informaci??n para Archivar Queja Guardada.";
            BitacoraAutomatica(formQuejaFinalizada.getId_queja(), 1, formQuejaFinalizada.getUsuario_operacion(), txtmensaje, txtmensaje, 11);

            response.setValue(vTipoQuejaFinalizada);
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs saveQuejaFinalizadaVyV(FormQuejaFinalizada formQuejaFinalizada) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        TipoQuejaFinalizada vTipoQuejaFinalizada;
        boolean isUpdate = true;
        try {
            tipoDao.TokenCheck(formQuejaFinalizada.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoQuejaFinalizada = tipoDao.getTipoQuejaFinxIdQueja(formQuejaFinalizada.getId_queja());
            if (vTipoQuejaFinalizada == null) {
                vTipoQuejaFinalizada = new TipoQuejaFinalizada();
                isUpdate = false;
            }
            //actualizar estado de queja, cambia dependiendo de que flujo vienen y que operacion se realiza
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formQuejaFinalizada.getId_queja());
            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formQuejaFinalizada.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(3); //verificacion y vigilancia
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formQuejaFinalizada.getUsuario_operacion());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(24); //archivar queja vyv
            newTipoPasoQueja.setUsuario_operacion(formQuejaFinalizada.getUsuario_operacion());
            if (isUpdate) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            tipoDao.savePasoQueja(newTipoPasoQueja);
            response.setValue(newTipoPasoQueja);
            //validar campos y actualizar antes del update
            if (formQuejaFinalizada.getDetalles() != null) {
                vTipoQuejaFinalizada.setDetalles(formQuejaFinalizada.getDetalles());
            }
            if (formQuejaFinalizada.getMotivo_poa() != null) {
                vTipoQuejaFinalizada.setId_motivo_queja_finalizada_poa(formQuejaFinalizada.getMotivo_poa());
            }
            vTipoQuejaFinalizada.setMonto_recuperado(formQuejaFinalizada.getMonto());
            vTipoQuejaFinalizada.setTipopasoqueja(newTipoPasoQueja);
            vTipoQuejaFinalizada.setId_flujo(3); //3 verificaicon y vigilancia
            tipoDao.saveQuejaFinalizada(vTipoQuejaFinalizada);
            //bitacora auto log
            String txtmensaje = "Informaci??n para Archivar Queja Guardada.";
            BitacoraAutomatica(formQuejaFinalizada.getId_queja(), 3, formQuejaFinalizada.getUsuario_operacion(), txtmensaje, txtmensaje, 24);

            response.setValue(vTipoQuejaFinalizada);
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs saveQuejaFinalizadaSP(FormQuejaFinalizada formQuejaFinalizada) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        TipoQuejaFinalizada vTipoQuejaFinalizada;
        boolean isUpdate = true;
        try {
            tipoDao.TokenCheck(formQuejaFinalizada.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoQuejaFinalizada = tipoDao.getTipoQuejaFinxIdQueja(formQuejaFinalizada.getId_queja());
            if (vTipoQuejaFinalizada == null) {
                vTipoQuejaFinalizada = new TipoQuejaFinalizada();
                isUpdate = false;
            }
            //actualizar estado de queja, cambia dependiendo de que flujo vienen y que operacion se realiza
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formQuejaFinalizada.getId_queja());
            vTipoQueja.setId_estado_queja(133); //pendiente aprobacion archivo
            tipoDao.saveQueja(vTipoQueja);
            response.setValue(vTipoQueja);
            vTipoQueja = tipoDao.findByIdQueja(formQuejaFinalizada.getId_queja());
            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formQuejaFinalizada.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formQuejaFinalizada.getId_departamento_interno());
            //TipoUsuario_Simple usuario=tipoDao.findByIdUsuario(formQuejaFinalizada.getUsuario_operacion());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(19); //archivar queja SP
            newTipoPasoQueja.setUsuario_operacion(formQuejaFinalizada.getUsuario_operacion());
            if (isUpdate) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            tipoDao.savePasoQueja(newTipoPasoQueja);
            response.setValue(newTipoPasoQueja);
            //validar campos y actualizar antes del update
            vTipoQuejaFinalizada.setId_motivo_queja_finalizada(9); //servicios publicos
            vTipoQuejaFinalizada.setDetalles(formQuejaFinalizada.getDetalles());
            vTipoQuejaFinalizada.setTipopasoqueja(newTipoPasoQueja);
            vTipoQuejaFinalizada.setId_flujo(6); //6 servicios publicos
            tipoDao.saveQuejaFinalizada(vTipoQuejaFinalizada);

            //revisar si correo esta activo en parametros de sistema
            TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_FINALIZAR_SERV_PUB);
            if (efuente != null) {
                if (efuente.getActivo() == 1) {
                    //mandar correo consumidor
                    TipoVerifConcVirt verifconcvirt = tipoDao.findAllVerifConcVirt(formQuejaFinalizada.getId_queja());
                    String[] mailstring;
                    String cuerpo = "";
                    if (verifconcvirt != null) {

                        cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> Hemos recibido la siguiente respuesta por parte del proveedor: ";
                        TipoCatalogo tipocatalogo = tipoDao.findTipoCatalogo(verifconcvirt.getResolucion());
                        cuerpo = cuerpo + tipocatalogo.getDescripcion_catalogo() + ". " + verifconcvirt.getNotas();
                        cuerpo = cuerpo + "<br> Su Queja ha sido finalizada y archivada. Ha sido un gusto poder apoyarle.";
                        mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                        saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_FINALIZAR_SERV_PUB, cuerpo);
                    } else {
                        cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> Hemos presentado su queja ante el proveedor pero no hemos recibido ninguna respuesta.";
                        cuerpo = cuerpo + "<br> Su Queja ha sido finalizada y archivada. Ha sido un gusto poder apoyarle.";
                        mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                        saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_FINALIZAR_SERV_PUB, cuerpo);
                    }
                }
            }
            //bitacora auto log
            String txtmensaje = "Informaci??n para Archivar Queja Guardada (Servicios P??blicos).";
            BitacoraAutomatica(formQuejaFinalizada.getId_queja(), 6, formQuejaFinalizada.getUsuario_operacion(), txtmensaje, txtmensaje, 19);

            response.setValue(vTipoQuejaFinalizada);
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs checkArchivo(Integer id_queja, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);

            TipoQuejaFinalizada vquejafinalizada = tipoDao.getTipoQuejaFinxIdQueja(id_queja);
            if (vquejafinalizada == null) {
                response.setCode(0L);
                response.setReason("NOT_FOUND");
            } else {
                response.setCode(0L);
                response.setReason("OK");
                response.setValue(vquejafinalizada);
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }
    //Visita Campo

    @Override
    public ResponseRs listVisitaCampo(Integer idqueja, Integer id_flujo, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllVisitaCampo(idqueja, id_flujo));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    private Date StrtoDate(String fecha, String hora) throws Exception {
        String hora_loc;
        if (hora.equals("")) {
            hora_loc = "00:00:00";
        } else {
            hora_loc = hora + ":00";
        }
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dt = df.parse(fecha + " " + hora_loc);
        return dt;
    }

    @Override
    public ResponseRs saveVisitaCampo(FormVisitaCampo formVisitaCampo) {
        ResponseRs response = new ResponseRs();
        Integer local_id_tipo_registro = null;
        boolean local_edit = formVisitaCampo.isEdit();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formVisitaCampo.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            switch (formVisitaCampo.getId_flujo()) {
                case 1:
                    local_id_tipo_registro = 8;
                    break;
                case 3:
                    local_id_tipo_registro = 21;
                    break;
            }
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formVisitaCampo.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formVisitaCampo.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formVisitaCampo.getId_departamento_interno());
            System.out.println(formVisitaCampo.getUsuario_operacion());
            //TipoUsuario_Simple vTipoUsuario = tipoDao.findByIdUsuario(formVisitaCampo.getUsuario_operacion());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_tipo_registro(local_id_tipo_registro);
            newTipoPasoQueja.setUsuario_operacion(formVisitaCampo.getUsuario_operacion());
            if (local_edit) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);
            //guardar visita campo
            TipoVisitaCampo vTipoVisitaCampo;
            if (local_edit) {
                vTipoVisitaCampo = tipoDao.findByIdVisitaCampo(formVisitaCampo.getId_visita_campo());
            } else {
                vTipoVisitaCampo = new TipoVisitaCampo();
            }
            vTipoVisitaCampo.setTipopasoqueja(newTipoPasoQueja);
            vTipoVisitaCampo.setFecha_visita(StrtoDate(formVisitaCampo.getFecha_visita(), ""));
            vTipoVisitaCampo.setHecha_por(formVisitaCampo.getHecha_por());
            vTipoVisitaCampo.setId_tipo_registro(local_id_tipo_registro);
            vTipoVisitaCampo.setObservaciones(formVisitaCampo.getObservaciones());
            vTipoVisitaCampo.setId_flujo(formVisitaCampo.getId_flujo());
            tipoDao.saveVisitaCampo(vTipoVisitaCampo);
            //bitacora auto log
            String txtmensaje = "Visita de Campo Guardada.";
            BitacoraAutomatica(formVisitaCampo.getId_queja(), formVisitaCampo.getId_flujo(), formVisitaCampo.getUsuario_operacion(), txtmensaje, txtmensaje, local_id_tipo_registro);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoVisitaCampo);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs deleteVisitaCampo(FormVisitaCampo formVisitaCampo) {
        ResponseRs response = new ResponseRs();
        Integer local_id_tipo_registro = null;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formVisitaCampo.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            switch (formVisitaCampo.getId_flujo()) {
                case 1:
                    local_id_tipo_registro = 8;
                    break;
                case 3:
                    local_id_tipo_registro = 21;
                    break;
            }
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formVisitaCampo.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formVisitaCampo.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formVisitaCampo.getId_departamento_interno());
            //TipoUsuario_Simple vTipoUsuario = tipoDao.findByIdUsuario(formVisitaCampo.getUsuario_operacion());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_tipo_registro(local_id_tipo_registro);
            newTipoPasoQueja.setUsuario_operacion(formVisitaCampo.getUsuario_operacion());
            newTipoPasoQueja.setOperacion("D");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);

            TipoVisitaCampo vTipoVisitaCampo = tipoDao.findByIdVisitaCampo(formVisitaCampo.getId_visita_campo());
            if (vTipoVisitaCampo != null) {
                tipoDao.deleteVisitaCampo(vTipoVisitaCampo);
                response.setCode(0L);
                response.setReason("OK");
                response.setValue(vTipoVisitaCampo);
                //bitacora auto log
                String txtmensaje = "Visita de Campo Eliminada.";
                BitacoraAutomatica(formVisitaCampo.getId_queja(), formVisitaCampo.getId_flujo(), formVisitaCampo.getUsuario_operacion(), txtmensaje, txtmensaje, local_id_tipo_registro);
            } else {
                response.setCode(1L);
                response.setReason("NOT FOUND");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    //Usuario

    @Override
    public ResponseRs listUsuario(String token, Integer id_flujo) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllUsuario(id_flujo));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getUsuario(Integer id, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdUsuario(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs EmailPassword(String email) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoUsuario_Simple vtipoUsuario_Simple = tipoDao.findUsuariobyEmail(email);
            if (vtipoUsuario_Simple != null) {
                //principal.setPassword(cryptoSvc.encrypt(principal.getPassword(), Crypto.ALG_SHA256));
                String cuerpo = "Hemos recibido una solicitud para mostrar su clave de usuario, pare reiniciar su clave por favor siga el siguiente link "
                        + GenerateMagicLink(0, Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD, 0)
                        + "<br>Si usted no gener&oacute; esta solicitud por favor borre este correo.<br>Gracias.";
                String[] mailstring = GetEmailStringUsuario(vtipoUsuario_Simple.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD, cuerpo); // fuente de email 4: reset password
            } else {
                System.out.println("Usuario nulo");
            }
            response.setReason("OK");
            transaction.commit();

            if (vtipoUsuario_Simple != null) {
                //actualizar campo de parametro con id de usuario
                transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
                transaction.begin();
                TipoMagicLink tipomagiclink = tipoDao.findLastTipoMagicLinkxIdQueja(0, Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD);
                tipomagiclink.setId_referencia(vtipoUsuario_Simple.getId_usuario());
                response.setValue(tipomagiclink);
                tipoDao.saveMagicLink(tipomagiclink);
                transaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        response.setCode(0L);
        return response;
    }
    //Registro: Resolucion visita de campo

    @Override
    public ResponseRs getReg_ResVisitaCampo(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoReg_ResVisitaCampo(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getReg_ResVisitaCampoVerifVig(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoReg_ResVerificacion(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveReg_ResVerificacionVigVisitaCampo(FormRegistro formRegistro) {
        ResponseRs response = new ResponseRs();
        TipoReg_ResArchivoVerificacion vTipoReg_ResArchivoVerificacion;
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_ResArchivoVerificacion = tipoDao.findAllTipoReg_ResVerificacion(formRegistro.getId_queja());
            if (vTipoReg_ResArchivoVerificacion == null) {
                vTipoReg_ResArchivoVerificacion = new TipoReg_ResArchivoVerificacion();
                vTipoReg_ResArchivoVerificacion.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_VISITA_CAMPO_VERIFICACION_VIG)); //
                vTipoReg_ResArchivoVerificacion.setCorrelativo_resolucion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_VISITA_CAMPO_VERIFICACION_VIG));

            }
            vTipoReg_ResArchivoVerificacion.setCreadoPor(formRegistro.getCreado_por());
            vTipoReg_ResArchivoVerificacion.setIdQueja(formRegistro.getId_queja());
            vTipoReg_ResArchivoVerificacion.setIdRegistro(Constants.REG_DIACO_REGISTRO_VISITA_CAMPO_VERIFICACION_VIG); //registro 13-resolucion visita campo verif y vigilancia
            vTipoReg_ResArchivoVerificacion.setIdTipoRegistro(Constants.REG_TIPO_VISITA_CAMPO_VERIFICACION_VIG); //registro 8-visita campo

            //buscar informacion queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
            vTipoReg_ResArchivoVerificacion.setAnioQueja(vTipoQueja.getAnio());
            vTipoReg_ResArchivoVerificacion.setQuejanumero(vTipoQueja.getNo_queja());
            vTipoReg_ResArchivoVerificacion.setFechaCreacion(new Date());
            //busca vista de campo
            TipoVisitaCampo vTipoVisitaCampo = tipoDao.findVisitaVigByIdQueja(formRegistro.getId_queja());
            vTipoReg_ResArchivoVerificacion.setFechaVerificacion(vTipoVisitaCampo.getFecha_visita());

            TipoUsuario_Simple vTipoUsuario_Simple = tipoDao.findByIdUsuario(vTipoVisitaCampo.getHecha_por());
            String usuarioInicialesArr[] = vTipoUsuario_Simple.getNombre().split(" ");
            String usuarioIniciales;
            if (usuarioInicialesArr.length > 1) {
                usuarioIniciales = usuarioInicialesArr[0].substring(0, 1) + usuarioInicialesArr[1].substring(0, 1);
            } else {
                usuarioIniciales = usuarioInicialesArr[0].substring(0, 1);
            }

            vTipoReg_ResArchivoVerificacion.setInicialesVerificador(usuarioIniciales);

            //buscar informacion consumidor
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            if (vTipoConsumidor != null) {
                vTipoReg_ResArchivoVerificacion.setNombreConsumidor(vTipoConsumidor.getNombreCompleto());
            }
            //buscar informacion proveedor
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            if (vTipoProveedor != null) {
                vTipoReg_ResArchivoVerificacion.setNombreProveedor(vTipoProveedor.getNombre());
            }

            response.setValue(vTipoReg_ResArchivoVerificacion);
            tipoDao.saveReg_ResVisitaCampoVerifVig(vTipoReg_ResArchivoVerificacion);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoReg_ResArchivoVerificacion);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs saveReg_ResVisitaCampo(FormRegistro formRegistro) {
        ResponseRs response = new ResponseRs();
        TipoReg_ResVisitaCampo vTipoReg_ResVisitaCampo;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formRegistro.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_ResVisitaCampo = tipoDao.findAllTipoReg_ResVisitaCampo(formRegistro.getId_queja());
            if (vTipoReg_ResVisitaCampo == null) {
                vTipoReg_ResVisitaCampo = new TipoReg_ResVisitaCampo();
                vTipoReg_ResVisitaCampo.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_VISITA_CAMPO)); //registro 7-resolucion visita campo
                vTipoReg_ResVisitaCampo.setCorrelativo_resolucion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_VISITA_CAMPO));

            }
            vTipoReg_ResVisitaCampo.setCreado_por(formRegistro.getCreado_por());
            vTipoReg_ResVisitaCampo.setId_queja(formRegistro.getId_queja());
            vTipoReg_ResVisitaCampo.setId_registro(Constants.REG_DIACO_REGISTRO_VISITA_CAMPO); //registro 7-resolucion visita campo
            vTipoReg_ResVisitaCampo.setId_tipo_registro(Constants.REG_TIPO_VISITA_CAMPO); //registro 8-visita campo
            //buscar informacion queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
            vTipoReg_ResVisitaCampo.setAnio_queja(vTipoQueja.getAnio());
            vTipoReg_ResVisitaCampo.setQuejanumero(vTipoQueja.getNo_queja());
            vTipoReg_ResVisitaCampo.setFecha_creacion(new Date());
            //buscar informacion consumidor
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            if (vTipoConsumidor != null) {
                vTipoReg_ResVisitaCampo.setNombre_consumidor(vTipoConsumidor.getNombreCompleto());
            }
            //buscar informacion proveedor
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            if (vTipoProveedor != null) {
                vTipoReg_ResVisitaCampo.setNombre_proveedor(vTipoProveedor.getNombre());
            }
            response.setValue(vTipoReg_ResVisitaCampo);
            tipoDao.saveReg_ResVisitaCampo(vTipoReg_ResVisitaCampo);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoReg_ResVisitaCampo);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //Departamento Interno
    @Override
    public ResponseRs listDeptoInternoMovHacia(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findMovHaciaTipoDeptoInterno());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listDeptoInternoMovHaciaVyV(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findMovHaciaTipoDeptoInternoVyV());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listDeptoInternoMovHaciaJur(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findMovHaciaTipoDeptoInternoJur());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listDeptoInternoMovHaciaSinJefe(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findMovHaciaSinJefeTipoDeptoInterno());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //queja simple
    @Override
    public ResponseRs listQuejaSimpleAct(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaSimpleAct());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaSimpleArchivo(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaSimpleArchivo());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaSimpleJuridico(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaSimpleJuridico());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaSimpleVyV(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaSimpleVyV());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaSimpleTodo(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaSimpleTodo());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listQuejaSimplePendAsig(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaSimplePendAsig());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listVyVQuejaSimpleArchivo(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaVyVSimpleArchivo());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listVyVQuejaSimpleJuridico(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaVyVSimpleJuridico());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listVyVQuejaSimpleAtCon(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaVyVSimpleAtCon());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listVyVQuejaSimplePendAsig(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaVyVSimplePendAsig());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listJurQuejaSimpleArchivo(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaJurSimpleArchivo());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listJurQuejaSimpleVerificacion(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaJurSimpleVerificacion());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listJurQuejaSimpleAtCon(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaJurSimpleAtCon());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs listJurQuejaSimplePendAsig(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoQuejaJurSimplePendAsig());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Movimiento Expediente
    @Override
    public ResponseRs getMovimExpxIdQueja(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposMovimExpxIdQueja(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getMovimExpTop5(String token, Integer id_dpto_interno) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposMovimExpTop5(id_dpto_interno));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    /*Pre movimiento guarda queja en pendiente para confirmar a diferentes flujos o envia a cola asignacion jefe, pantalla movimiento*/
    @Override
    public ResponseRs savePreMovimExp(FormMovimExp formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        TipoQueja estaqueja = null;
        int nuevo_estado = 0;
        boolean locvalido;
        String txtmensaje;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //insertar observaciones en tabla de movimientos
            if (formulario.getObservaciones() == null) {
                formulario.setObservaciones("");
            }
            TipoMovimientos vtipomovimientos = tipoDao.findbyIdQuejaMovimientos(formulario.getId_queja());
            if (vtipomovimientos == null) {
                vtipomovimientos = new TipoMovimientos();
            }
            vtipomovimientos.setId_queja(formulario.getId_queja());
            vtipomovimientos.setObservaciones(formulario.getObservaciones());
            tipoDao.saveMovimientos(vtipomovimientos);
            response.setValue(vtipomovimientos);

            //verificar si es update o insert
            TipoMovimExp vTipoMovimExp = new TipoMovimExp();

            //actualizar estado de queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            switch (formulario.getId_departamento_interno_hasta()) {
                case 2:
                    nuevo_estado = 132;//estado pendiente confirmar accion en juridico
                    break;
                /*case 3:
                                nuevo_estado=131;//estado pendiente confirmar accion en verificacion y vigilancia
                                break;  */
                case 4:
                    nuevo_estado = 133;//estado pendiente confirmar accion en archivo
                    break;
                case 91:
                    nuevo_estado = 129;// pendiente de asignaci??n por jefe
                    break;
                case 98:
                    nuevo_estado = 401;//estado nuevo en conciliacion virtual (proveedor)
                    break;
            }

            //buscar sede en base a usuario actual
            //TipoUsuario_Simple vTipoUsuario = tipoDao.findByIdUsuario(vTipoQueja.getUsuario_asignado());
            Integer id_sede_local = 0;
            if (vTipoQueja.getId_diaco_sede() != null) {
                id_sede_local = vTipoQueja.getId_diaco_sede();
            } else {
                id_sede_local = Constants.REG_DIACO_SEDE_CENTRAL;
            }
            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formulario.getId_departamento_interno());
            newTipoPasoQueja.setId_sede_diaco_operacio(id_sede_local);
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(9);
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            if (nuevo_estado == 401) {// 401 envio a proveedor
                estaqueja = tipoDao.findByIdQueja(formulario.getId_queja());
                estaqueja.setId_diaco_sede(Constants.REG_DIACO_SEDE_CENTRAL);
                tipoDao.saveQueja(estaqueja);
                locvalido = false;
                if (estaqueja.getId_estado_queja() >= 101 && estaqueja.getId_estado_queja() <= 106 && formulario.getId_proveedor() == 0) {
                    locvalido = true;
                    vTipoMovimExp.setId_proveedor_hasta(estaqueja.getId_proveedor());
                } else if (formulario.getId_proveedor() != 0 && estaqueja.getId_estado_queja() == 601) {
                    locvalido = true;
                    vTipoMovimExp.setId_proveedor_hasta(formulario.getId_proveedor());
                    estaqueja.setId_proveedor(formulario.getId_proveedor());
                }
                if (locvalido) {
                    //borrar conciliacion virtual
                    TipoVerifConcVirt tipoVerifConcVirt = tipoDao.findAllVerifConcVirt(formulario.getId_queja());
                    if (tipoVerifConcVirt != null) {
                        tipoDao.deleteVerifConcVirt(tipoVerifConcVirt);
                    }
                    //guardar movimiento
                    vTipoMovimExp.setTipopasoqueja(newTipoPasoQueja);
                    vTipoMovimExp.setId_departamento_interno_desde(formulario.getId_departamento_interno());
                    tipoDao.saveMovimExp(vTipoMovimExp);

                    estaqueja.setId_estado_queja(nuevo_estado);
                    tipoDao.saveQueja(estaqueja);
                    //guardar detalle despues de actualizar la queja
                    TipoMovimExpDetalle vTipoMovimExpDetalle = new TipoMovimExpDetalle();
                    vTipoMovimExpDetalle.setId_queja(formulario.getId_queja());
                    vTipoMovimExpDetalle.setTipoMovimExp(vTipoMovimExp);
                    vTipoMovimExpDetalle.setObservaciones(formulario.getObservaciones());
                    tipoDao.saveMovimExpDetalle(vTipoMovimExpDetalle);
                    //bitacora auto log
                    txtmensaje = "Movimiento de Queja enviado hacia Conciliaci??n Virtual (Portal Proveedor).";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                }
            } else {
                estaqueja = tipoDao.findByIdQueja(formulario.getId_queja());
                estaqueja.setId_estado_queja(nuevo_estado);
                //cambiar sede de regreso a central
                estaqueja.setId_diaco_sede(Constants.REG_DIACO_SEDE_CENTRAL);
                tipoDao.saveQueja(estaqueja);
                //bitacora auto log
                switch (nuevo_estado) {
                    case 132:
                        txtmensaje = "Movimiento de Queja enviado hacia Cola Confirmaci??n para Jur??dico.";
                        BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                        break;
                    case 133:
                        txtmensaje = "Movimiento de Queja enviado hacia Cola Confirmaci??n para Archivo.";
                        BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                        break;
                    case 129:
                        txtmensaje = "Movimiento de Queja enviado a Cola Confirmaci??n Jefe.";
                        BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                        break;
                }
                //verificar si el movimiento viene de una sede, generar movimiento de vuelta a sede central
                if (id_sede_local != 1) {
                    //insertar encabezado de movimiento expediente
                    vTipoMovimExp.setId_departamento_interno_desde(formulario.getId_departamento_interno());
                    vTipoMovimExp.setTipopasoqueja(newTipoPasoQueja);
                    vTipoMovimExp.setId_sede_desde(id_sede_local);
                    vTipoMovimExp.setId_sede_hasta(1); // sede central
                    tipoDao.saveMovimExp(vTipoMovimExp);
                    formulario.setId_sede_diaco_operacio(id_sede_local);
                    formulario.setId_sede_hasta(1);
                    //guardar encabezado registro
                    TipoReg_MovimExp nTipoReg_MovimExp = SaveReg_MovExp(0, vTipoMovimExp, formulario);
                    //guardar detalle despues de actualizar la queja
                    TipoMovimExpDetalle vTipoMovimExpDetalle = new TipoMovimExpDetalle();
                    vTipoMovimExpDetalle.setId_queja(formulario.getId_queja());
                    vTipoMovimExpDetalle.setTipoMovimExp(vTipoMovimExp);
                    vTipoMovimExpDetalle.setObservaciones(formulario.getObservaciones());
                    tipoDao.saveMovimExpDetalle(vTipoMovimExpDetalle);
                    //guardar linea del registro
                    SaveReg_MovExpDetalle(vTipoQueja, nTipoReg_MovimExp, vTipoMovimExpDetalle);
                }
            }

            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /*Pre movimiento guarda queja en pendiente para confirmar a diferentes flujos o envia a cola asignacion jefe, pantalla movimiento vyv*/
    @Override
    public ResponseRs savePreMovimExpVyV(FormMovimExp formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        TipoQueja estaqueja = null;
        int nuevo_estado = 0;
        String txtmensaje;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //insertar observaciones en tabla de movimientos
            if (formulario.getObservaciones() == null) {
                formulario.setObservaciones("");
            }
            TipoMovimientos vtipomovimientos = tipoDao.findbyIdQuejaMovimientos(formulario.getId_queja());
            if (vtipomovimientos == null) {
                vtipomovimientos = new TipoMovimientos();
            }
            vtipomovimientos.setId_queja(formulario.getId_queja());
            vtipomovimientos.setObservaciones(formulario.getObservaciones());
            tipoDao.saveMovimientos(vtipomovimientos);
            response.setValue(vtipomovimientos);

            //actualizar estado de queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            switch (formulario.getId_departamento_interno_hasta()) {
                case 2:
                    nuevo_estado = 332;//estado pendiente confirmar accion en juridico
                    break;
                case 4:
                    nuevo_estado = 333;//estado pendiente confirmar accion en archivo
                    break;
                case 91:
                    nuevo_estado = 329;// pendiente de asignaci??n por jefe
                    break;
            }

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(3); // vyv
            newTipoPasoQueja.setId_sede_diaco_operacio(formulario.getId_sede_diaco_operacio());
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(25); //movimiento vyv
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            estaqueja = tipoDao.findByIdQueja(formulario.getId_queja());
            estaqueja.setId_estado_queja(nuevo_estado);
            estaqueja.setId_diaco_sede(Constants.REG_DIACO_SEDE_CENTRAL);
            tipoDao.saveQueja(estaqueja);
            //bitacora auto log
            switch (nuevo_estado) {
                case 332:
                    txtmensaje = "Movimiento de Queja enviado hacia Cola Confirmaci??n para Jur??dico.";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 25);
                    break;
                case 333:
                    txtmensaje = "Movimiento de Queja enviado hacia Cola Confirmaci??n para Archivo.";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 25);
                    break;
                case 329:
                    txtmensaje = "Movimiento de Queja enviado a Cola Confirmaci??n Jefe.";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 25);
                    break;
            }

            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /*Pre movimiento guarda queja en pendiente para confirmar a diferentes flujos o envia a cola asignacion jefe, pantalla movimiento juridico*/
    @Override
    public ResponseRs savePreMovimExpJur(FormMovimExp formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        TipoQueja estaqueja = null;
        int nuevo_estado = 0;
        String txtmensaje;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //insertar observaciones en tabla de movimientos
            if (formulario.getObservaciones() == null) {
                formulario.setObservaciones("");
            }
            TipoMovimientos vtipomovimientos = tipoDao.findbyIdQuejaMovimientos(formulario.getId_queja());
            if (vtipomovimientos == null) {
                vtipomovimientos = new TipoMovimientos();
            }
            vtipomovimientos.setId_queja(formulario.getId_queja());
            vtipomovimientos.setObservaciones(formulario.getObservaciones());
            tipoDao.saveMovimientos(vtipomovimientos);
            response.setValue(vtipomovimientos);

            //actualizar estado de queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            switch (formulario.getId_departamento_interno_hasta()) {
                case 1:
                    nuevo_estado = 231;//estado pendiente confirmar accion atencion al consumidor
                    break;
                case 3:
                    nuevo_estado = 232;//estado pendiente confirmar verificacion y vigilancia
                    break;
                case 4:
                    nuevo_estado = 233;//estado pendiente confirmar accion en archivo
                    break;
                case 91:
                    nuevo_estado = 229;// pendiente de asignaci??n por jefe
                    break;
            }

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(2); // juridico
            newTipoPasoQueja.setId_sede_diaco_operacio(formulario.getId_sede_diaco_operacio());
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(28); //movimiento jur
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            estaqueja = tipoDao.findByIdQueja(formulario.getId_queja());
            estaqueja.setId_estado_queja(nuevo_estado);
            estaqueja.setId_diaco_sede(Constants.REG_DIACO_SEDE_CENTRAL);
            tipoDao.saveQueja(estaqueja);
            //bitacora auto log
            switch (nuevo_estado) {
                case 231:
                    txtmensaje = "Movimiento de Queja enviado hacia Cola Confirmaci??n para Atenci??n al Consumidor.";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 28);
                    break;
                case 232:
                    txtmensaje = "Movimiento de Queja enviado hacia Cola Confirmaci??n para Verificaci??n y Vigilancia.";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 28);
                    break;
                case 233:
                    txtmensaje = "Movimiento de Queja enviado hacia Cola Confirmaci??n para Archivo.";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 28);
                    break;
                case 229:
                    txtmensaje = "Movimiento de Queja enviado a Cola Confirmaci??n Jefe.";
                    BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 28);
                    break;
            }

            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /*pantalla confirmar movimiento, envia a cola de confirmar accion para cada usuario, envia a otro flujo y asigna a otra persona*/
    @Override
    public ResponseRs saveMovimExp(FormMovimExp formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        int nuevo_estado = 0;
        String txtmensaje;
        String stobservaciones;
        TipoMovimientos vtipomovimientos;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            List<Integer> QuejaList = convertCommaStringtoIntList(formulario.getListado_quejas());
            Integer primeraqueja = QuejaList.get(0);
            formulario.setId_queja(primeraqueja);
            //verificar si es update o insert
            TipoMovimExp vTipoMovimExp = new TipoMovimExp();
            //actualizar estado de queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(primeraqueja);
            switch (formulario.getId_departamento_interno_hasta()) {
                case 1:
                    nuevo_estado = 130;//estado pendiente confirmar accion en atencion al consumidor
                    break;
                case 2:
                    nuevo_estado = 230;//estado pendiente confirmar accion en juridico
                    break;
                case 3:
                    nuevo_estado = 328;//estado 328 para asigar a cola inicial
                    break;
                case 4:
                    nuevo_estado = 501;//estado archivado en archivo
                    break;
                default:
                    //error
                    response.setCode(1L);
                    response.setReason("ERROR_ESTADO");
                    try {
                        transaction.rollback();
                    } catch (Exception ee) {
                        ee.printStackTrace();
                    }
                    return response;
            }
            Integer tipo_registro = 0;
            Integer limiteinf = 0;
            Integer limitesup = 0;
            switch (formulario.getId_flujo()) {
                case 1:
                    tipo_registro = 9;
                    limiteinf = 131;
                    limitesup = 133;
                    break;
                case 2:
                    tipo_registro = 28;
                    limiteinf = 231;
                    limitesup = 233;
                    break;
                case 3:
                    tipo_registro = 25;
                    limiteinf = 331;
                    limitesup = 333;
                    break;
            }
            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(primeraqueja);
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formulario.getId_departamento_interno());
            newTipoPasoQueja.setId_sede_diaco_operacio(formulario.getId_sede_diaco_operacio());
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(tipo_registro);
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            //insertar encabezado de movimiento expediente, revisar bien esto
            //considerar poner observaciones en detalle no en encabezado
            vTipoMovimExp.setId_departamento_interno_desde(formulario.getId_departamento_interno());
            vTipoMovimExp.setId_departamento_interno_hasta(formulario.getId_departamento_interno_hasta());
            vTipoMovimExp.setTipopasoqueja(newTipoPasoQueja);
            tipoDao.saveMovimExp(vTipoMovimExp);
            //guardar encabezado registro
            TipoReg_MovimExp nTipoReg_MovimExp = SaveReg_MovExp(nuevo_estado, vTipoMovimExp, formulario);

            //guardar detalle
            Integer valoresingresados = 0;
            boolean locvalido;
            for (Integer ii : QuejaList) {
                TipoQueja estaqueja = tipoDao.findByIdQueja(ii);
                estaqueja.setId_diaco_sede(Constants.REG_DIACO_SEDE_CENTRAL);
                tipoDao.saveQueja(estaqueja);

                locvalido = false;
                if (estaqueja.getId_estado_queja() >= limiteinf && estaqueja.getId_estado_queja() <= limitesup) {
                    locvalido = true;
                }
                if (locvalido) {
                    estaqueja.setId_estado_queja(nuevo_estado);
                    tipoDao.saveQueja(estaqueja);
                    valoresingresados++;
                    //jalar observaciones de tabla de movimientos
                    vtipomovimientos = tipoDao.findbyIdQuejaMovimientos(ii);
                    if (vtipomovimientos != null) {
                        stobservaciones = vtipomovimientos.getObservaciones();
                    } else {
                        stobservaciones = "";
                    }

                    //guardar detalle despues de actualizar la queja
                    TipoMovimExpDetalle vTipoMovimExpDetalle = new TipoMovimExpDetalle();
                    vTipoMovimExpDetalle.setId_queja(ii);
                    vTipoMovimExpDetalle.setTipoMovimExp(vTipoMovimExp);
                    vTipoMovimExpDetalle.setObservaciones(stobservaciones);
                    tipoDao.saveMovimExpDetalle(vTipoMovimExpDetalle);
                    //guardar linea del registro
                    SaveReg_MovExpDetalle(estaqueja, nTipoReg_MovimExp, vTipoMovimExpDetalle);
                    //para confirmar accion insertar en esa tabla, solo a verif. y vig. y juridico.
                    Integer confAccionFlujo = 0;
                    switch (nuevo_estado) {
                        case 130:
                            confAccionFlujo = 1;
                            break;
                        case 230:
                            confAccionFlujo = 2;
                            break;
                        case 328:
                            confAccionFlujo = 3;
                            break;
                    }
                    //if(nuevo_estado ==130 || nuevo_estado==230 || nuevo_estado==330){
                    if (nuevo_estado == 130) {
                        SaveConfirmarAccion(estaqueja.getId_queja(), confAccionFlujo, "f");
                    } else if (nuevo_estado == 230) {
                        SaveColaAsignacionSinConfirmarAccion(estaqueja.getId_queja(), 99); // 99 cola especial juridico documentador
                    } else if (nuevo_estado == 328) {
                        SaveColaAsignacionSinConfirmarAccion(estaqueja.getId_queja(), 3); // cola para estado 328
                    }
                    //activar flag vyv para poder ver la queja en vyv
                    if (nuevo_estado == 328) {
                        saveTiposFlujoGuia(estaqueja.getId_queja(), 6); //se cambio a 328
                    }
                    //activar flag juridico para poder ver la queja en juridico
                    if (nuevo_estado == 230) {
                        saveTiposFlujoGuia(estaqueja.getId_queja(), 8);
                    }
                    switch (nuevo_estado) {
                        case 130:
                            //bitacora auto log
                            txtmensaje = "Movimiento de Queja enviado hacia Atenci??n al Consumidor.";
                            BitacoraAutomatica(estaqueja.getId_queja(), formulario.getId_flujo(), formulario.getUsuario(), txtmensaje, txtmensaje, tipo_registro);
                            break;
                        case 230:
                            //bitacora auto log
                            txtmensaje = "Movimiento de Queja enviado hacia Jur??dico.";
                            BitacoraAutomatica(estaqueja.getId_queja(), formulario.getId_flujo(), formulario.getUsuario(), txtmensaje, txtmensaje, tipo_registro);
                            break;
                        case 328:
                            //bitacora auto log
                            txtmensaje = "Movimiento de Queja enviado hacia Verificaci??n y Vigilancia.";
                            BitacoraAutomatica(estaqueja.getId_queja(), formulario.getId_flujo(), formulario.getUsuario(), txtmensaje, txtmensaje, tipo_registro);
                            break;
                        case 501:
                            //bitacora auto log
                            txtmensaje = "Movimiento de Queja enviado hacia Archivo.";
                            BitacoraAutomatica(estaqueja.getId_queja(), formulario.getId_flujo(), formulario.getUsuario(), txtmensaje, txtmensaje, tipo_registro);
                            break;
                    }
                }
            }

            //si no se actualizo nada se levanta un error y se hace rollback
            if (valoresingresados == 0) {
                response.setCode(1L);
                response.setReason("ERROR_LISTA");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }

            response.setCode(0L);
            response.setReason("OK");
            //hacer el response.value()
            response.setValue(nTipoReg_MovimExp);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /*movimiento individual, opciones habilitadas para quejas en estado pendiente asignacion por jefe*/
    @Override
    public ResponseRs saveMovimExpInd(FormMovimExp formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        int nuevo_estado = 0;
        String txtmensaje;
        String stobservaciones;
        TipoMovimientos vtipomovimientos;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //jalar observaciones de tabla de movimientos
            vtipomovimientos = tipoDao.findbyIdQuejaMovimientos(formulario.getId_queja());
            if (vtipomovimientos != null) {
                stobservaciones = vtipomovimientos.getObservaciones();
            } else {
                stobservaciones = "";
            }
            //verificar si es update o insert
            TipoMovimExp vTipoMovimExp = new TipoMovimExp();
            //actualizar estado de queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            switch (formulario.getId_departamento_interno_hasta()) {
                case 3:
                    nuevo_estado = 131;//estado pendiente confirmar accion en verificacion y vigilancia
                    break;
                case 96:
                    nuevo_estado = 130;//reasignaci??n a conciliador en atenci??n a consumidor
                    break;
                case 6:
                    nuevo_estado = 630;//pendiente confirmar en servicios publicos
                    break;
                case 99:// sede, genera encabezado y reporte
                    break;
                default:
                    //error
                    response.setCode(1L);
                    response.setReason("ERROR_ESTADO");
                    try {
                        transaction.rollback();
                    } catch (Exception ee) {
                        ee.printStackTrace();
                    }
                    return response;
            }

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formulario.getId_departamento_interno());
            newTipoPasoQueja.setId_sede_diaco_operacio(formulario.getId_sede_diaco_operacio());
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(9);
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            if (vTipoQueja.getId_estado_queja() == 129) {
                if (nuevo_estado != 0) {
                    vTipoQueja.setId_estado_queja(nuevo_estado);
                    vTipoQueja.setId_diaco_sede(Constants.REG_DIACO_SEDE_CENTRAL);
                    tipoDao.saveQueja(vTipoQueja);
                }
                switch (nuevo_estado) {
                    case 0:
                        //guardar detalle
                        //insertar encabezado de movimiento expediente
                        vTipoMovimExp.setId_departamento_interno_desde(formulario.getId_departamento_interno());
                        vTipoMovimExp.setTipopasoqueja(newTipoPasoQueja);
                        vTipoMovimExp.setId_sede_desde(formulario.getId_sede_diaco_operacio());
                        vTipoMovimExp.setId_sede_hasta(formulario.getId_sede_hasta());
                        tipoDao.saveMovimExp(vTipoMovimExp);
                        //guardar encabezado registro
                        TipoReg_MovimExp nTipoReg_MovimExp = SaveReg_MovExp(nuevo_estado, vTipoMovimExp, formulario);
                        //guardar estado queja
                        vTipoQueja.setId_estado_queja(130);
                        vTipoQueja.setId_diaco_sede(formulario.getId_sede_hasta());
                        tipoDao.saveQueja(vTipoQueja);
                        /*vTipoQueja.setId_estado_queja(nuevo_estado);                               
                                    tipoDao.saveQueja(vTipoQueja);*/
                        //guardar detalle despues de actualizar la queja
                        TipoMovimExpDetalle vTipoMovimExpDetalle = new TipoMovimExpDetalle();
                        vTipoMovimExpDetalle.setId_queja(formulario.getId_queja());
                        vTipoMovimExpDetalle.setTipoMovimExp(vTipoMovimExp);
                        vTipoMovimExpDetalle.setObservaciones(stobservaciones);
                        tipoDao.saveMovimExpDetalle(vTipoMovimExpDetalle);
                        //guardar linea del registro
                        SaveReg_MovExpDetalle(vTipoQueja, nTipoReg_MovimExp, vTipoMovimExpDetalle);
                        //para confirmar accion insertar en esa tabla
                        SaveConfirmarAccion(vTipoQueja.getId_queja(), formulario.getId_sede_hasta(), "s");
                        //bitacora auto log
                        txtmensaje = "Movimiento de Queja enviado hacia Sede Departamental.";
                        BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                        break;
                    case 131:
                        //bitacora auto log
                        txtmensaje = "Movimiento de Queja hacia Cola Confirmaci??n Verificaci??n y Vigilancia.";
                        BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                        break;
                    case 630:
                        SaveConfirmarAccion(vTipoQueja.getId_queja(), 6, "f");
                        saveTiposFlujoGuia(vTipoQueja.getId_queja(), 13);
                        //bitacora auto log
                        txtmensaje = "Movimiento de Queja hacia Servicios P??blicos.";
                        BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                        break;
                    case 130:
                        //borrar asignado anteriormente y luego llamar a cola atencion a consumidor
                        DeleteUsuarioAsignado(vTipoQueja.getId_queja(), 1, "f");
                        SaveConfirmarAccion(vTipoQueja.getId_queja(), 1, "f");
                        //bitacora auto log
                        txtmensaje = "Movimiento de Queja reasignada hacia Atenci??n al Consumidor.";
                        BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 9);
                        break;
                }
            }
            response.setCode(0L);
            response.setReason("OK");
            //hacer el response.value()
            response.setValue(vTipoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /*movimiento individual, opciones habilitadas para quejas en estado pendiente asignacion por jefe vyv*/
    @Override
    public ResponseRs saveMovimExpIndVyV(FormMovimExp formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        int nuevo_estado = 0;
        String txtmensaje;
        String stobservaciones;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //jalar observaciones de tabla de movimientos
            TipoMovimientos vtipomovimientos = tipoDao.findbyIdQuejaMovimientos(formulario.getId_queja());
            if (vtipomovimientos != null) {
                stobservaciones = vtipomovimientos.getObservaciones();
            } else {
                stobservaciones = "";
            }
            //verificar si es update o insert
            TipoMovimExp vTipoMovimExp = new TipoMovimExp();
            //actualizar estado de queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            switch (formulario.getId_departamento_interno_hasta()) {
                case 1:
                    nuevo_estado = 331;//estado pendiente confirmar accion en atencion al consumidor
                    break;
                case 99:// sede, genera encabezado y reporte
                    break;
                default:
                    //error
                    response.setCode(1L);
                    response.setReason("ERROR_ESTADO");
                    try {
                        transaction.rollback();
                    } catch (Exception ee) {
                        ee.printStackTrace();
                    }
                    return response;
            }

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formulario.getId_departamento_interno());
            newTipoPasoQueja.setId_sede_diaco_operacio(formulario.getId_sede_diaco_operacio());
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(25);
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            if (vTipoQueja.getId_estado_queja() == 329) {
                if (nuevo_estado != 0) {
                    vTipoQueja.setId_estado_queja(nuevo_estado);
                    vTipoQueja.setId_diaco_sede(Constants.REG_DIACO_SEDE_CENTRAL);
                    tipoDao.saveQueja(vTipoQueja);
                }
                switch (nuevo_estado) {
                    case 0:
                        //guardar detalle
                        //insertar encabezado de movimiento expediente
                        vTipoMovimExp.setId_departamento_interno_desde(formulario.getId_departamento_interno());
                        vTipoMovimExp.setTipopasoqueja(newTipoPasoQueja);
                        vTipoMovimExp.setId_sede_desde(formulario.getId_sede_diaco_operacio());
                        vTipoMovimExp.setId_sede_hasta(formulario.getId_sede_hasta());
                        tipoDao.saveMovimExp(vTipoMovimExp);
                        //guardar encabezado registro
                        TipoReg_MovimExp nTipoReg_MovimExp = SaveReg_MovExp(nuevo_estado, vTipoMovimExp, formulario);
                        //guardar estado queja
                        vTipoQueja.setId_estado_queja(130);
                        vTipoQueja.setId_diaco_sede(formulario.getId_sede_hasta());
                        tipoDao.saveQueja(vTipoQueja);
                        /*vTipoQueja.setId_estado_queja(nuevo_estado);                               
                                    tipoDao.saveQueja(vTipoQueja);*/
                        //guardar detalle despues de actualizar la queja
                        TipoMovimExpDetalle vTipoMovimExpDetalle = new TipoMovimExpDetalle();
                        vTipoMovimExpDetalle.setId_queja(formulario.getId_queja());
                        vTipoMovimExpDetalle.setTipoMovimExp(vTipoMovimExp);
                        vTipoMovimExpDetalle.setObservaciones(stobservaciones);
                        tipoDao.saveMovimExpDetalle(vTipoMovimExpDetalle);
                        //guardar linea del registro
                        SaveReg_MovExpDetalle(vTipoQueja, nTipoReg_MovimExp, vTipoMovimExpDetalle);
                        //para confirmar accion insertar en esa tabla
                        SaveConfirmarAccion(vTipoQueja.getId_queja(), formulario.getId_sede_hasta(), "s");
                        //bitacora auto log
                        txtmensaje = "Movimiento de Queja enviado hacia Sede Departamental.";
                        BitacoraAutomatica(formulario.getId_queja(), 3, formulario.getUsuario(), txtmensaje, txtmensaje, 25);
                        break;
                    case 331:
                        //bitacora auto log
                        txtmensaje = "Movimiento de Queja hacia Cola Confirmaci??n Atenci??n al Consumidor.";
                        BitacoraAutomatica(formulario.getId_queja(), 3, formulario.getUsuario(), txtmensaje, txtmensaje, 25);
                        break;
                }
            }
            response.setCode(0L);
            response.setReason("OK");
            //hacer el response.value()
            response.setValue(vTipoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /*movimiento individual, opciones habilitadas para quejas en estado pendiente asignacion por jefe juridico*/
    @Override
    public ResponseRs saveMovimExpIndJur(FormMovimExp formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        int nuevo_estado = 0;
        String txtmensaje;
        String stobservaciones;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //jalar observaciones de tabla de movimientos
            TipoMovimientos vtipomovimientos = tipoDao.findbyIdQuejaMovimientos(formulario.getId_queja());
            if (vtipomovimientos != null) {
                stobservaciones = vtipomovimientos.getObservaciones();
            } else {
                stobservaciones = "";
            }
            //verificar si es update o insert
            TipoMovimExp vTipoMovimExp = new TipoMovimExp();
            //actualizar estado de queja
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            switch (formulario.getId_departamento_interno_hasta()) {
                case 99:// sede, genera encabezado y reporte
                    break;
                default:
                    //error
                    response.setCode(1L);
                    response.setReason("ERROR_ESTADO");
                    try {
                        transaction.rollback();
                    } catch (Exception ee) {
                        ee.printStackTrace();
                    }
                    return response;
            }

            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formulario.getId_departamento_interno());
            newTipoPasoQueja.setId_sede_diaco_operacio(formulario.getId_sede_diaco_operacio());
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(28);//movimiento juridico
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);

            if (vTipoQueja.getId_estado_queja() == 229) {
                if (nuevo_estado != 0) {
                    vTipoQueja.setId_estado_queja(nuevo_estado);
                    tipoDao.saveQueja(vTipoQueja);
                }
                switch (nuevo_estado) {
                    case 0:
                        //guardar detalle
                        //insertar encabezado de movimiento expediente
                        vTipoMovimExp.setId_departamento_interno_desde(formulario.getId_departamento_interno());
                        vTipoMovimExp.setTipopasoqueja(newTipoPasoQueja);
                        vTipoMovimExp.setId_sede_desde(formulario.getId_sede_diaco_operacio());
                        vTipoMovimExp.setId_sede_hasta(formulario.getId_sede_hasta());
                        tipoDao.saveMovimExp(vTipoMovimExp);
                        //guardar encabezado registro
                        TipoReg_MovimExp nTipoReg_MovimExp = SaveReg_MovExp(nuevo_estado, vTipoMovimExp, formulario);
                        //guardar estado queja
                        vTipoQueja.setId_estado_queja(130);
                        vTipoQueja.setId_diaco_sede(formulario.getId_sede_hasta());
                        tipoDao.saveQueja(vTipoQueja);
                        /*vTipoQueja.setId_estado_queja(nuevo_estado);                               
                                    tipoDao.saveQueja(vTipoQueja);*/
                        //guardar detalle despues de actualizar la queja
                        TipoMovimExpDetalle vTipoMovimExpDetalle = new TipoMovimExpDetalle();
                        vTipoMovimExpDetalle.setId_queja(formulario.getId_queja());
                        vTipoMovimExpDetalle.setTipoMovimExp(vTipoMovimExp);
                        vTipoMovimExpDetalle.setObservaciones(stobservaciones);
                        tipoDao.saveMovimExpDetalle(vTipoMovimExpDetalle);
                        //guardar linea del registro
                        SaveReg_MovExpDetalle(vTipoQueja, nTipoReg_MovimExp, vTipoMovimExpDetalle);
                        //para confirmar accion insertar en esa tabla
                        SaveConfirmarAccion(vTipoQueja.getId_queja(), formulario.getId_sede_hasta(), "s");
                        //bitacora auto log
                        txtmensaje = "Movimiento de Queja enviado hacia Sede Departamental.";
                        BitacoraAutomatica(formulario.getId_queja(), 2, formulario.getUsuario(), txtmensaje, txtmensaje, 28);
                        break;
                }
            }
            response.setCode(0L);
            response.setReason("OK");
            //hacer el response.value()
            response.setValue(vTipoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    //Movimiento Expediente Detalle

    @Override
    public ResponseRs getMovimExpDetallexidMov(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposMovimExpDetallexIdQueja(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public static List<Integer> convertCommaStringtoIntList(String commaSeparatedStr) {
        String[] commaSeparatedArr = commaSeparatedStr.split("\\s*,\\s*");
        List<Integer> intList = new ArrayList();
        for (String s : commaSeparatedArr) {
            intList.add(Integer.valueOf(s));
        }
        return intList; //Integer.parseInt(
    }

    //Registro: Movimiento Expediente
    @Override
    public ResponseRs getReg_MovExpxId(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposReg_MovExpxIdMov(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    private TipoReg_MovimExp SaveReg_MovExp(Integer nuevo_estado, TipoMovimExp vTipoMovimExp, FormMovimExp formulario) throws Exception {
        String sede_desde;
        String sede_hasta;
        TipoReg_MovimExp newTipoReg_MovimExp = new TipoReg_MovimExp();
        //datos queja
        TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
        newTipoReg_MovimExp.setAnio_queja(vTipoQueja.getAnio());
        newTipoReg_MovimExp.setQuejanumero(vTipoQueja.getNo_queja());
        //datos movimiento

        if (nuevo_estado != 0) {
            sede_desde = vTipoQueja.getTipoSede().getNombre_sede();
            TipoDepartamentoInterno vTipoDepartamentoInterno = tipoDao.findTipoDeptoInterno(formulario.getId_departamento_interno());
            String dpto_desde = vTipoDepartamentoInterno.getNombre();
            vTipoDepartamentoInterno = tipoDao.findTipoDeptoInterno(formulario.getId_departamento_interno_hasta());
            String dpto_hasta = vTipoDepartamentoInterno.getNombre();
            newTipoReg_MovimExp.setDpto_envia(dpto_desde + "/" + sede_desde);
            newTipoReg_MovimExp.setDpto_recibe(dpto_hasta);
        } else {
            TipoSede vTipoSede = tipoDao.findByIdSede(formulario.getId_sede_diaco_operacio());
            sede_desde = vTipoSede.getNombre_sede();
            vTipoSede = tipoDao.findByIdSede(formulario.getId_sede_hasta());
            sede_hasta = vTipoSede.getNombre_sede();
            newTipoReg_MovimExp.setDpto_envia(sede_desde);
            newTipoReg_MovimExp.setDpto_recibe(sede_hasta);
        }
        newTipoReg_MovimExp.setCreado_por(formulario.getUsuario());
        newTipoReg_MovimExp.setFecha_creacion(new Date());
        newTipoReg_MovimExp.setFecha_entrega(new Date());
        newTipoReg_MovimExp.setId_queja(formulario.getId_queja());
        newTipoReg_MovimExp.setId_registro(Constants.REG_DIACO_REGISTRO_MOVIMIENTO_EXPEDIENTE);//registro:movimiento expediente
        newTipoReg_MovimExp.setId_tipo_registro(Constants.REG_TIPO_MOVIMIENTO_EXPEDIENTE); //movimiento expediente
        newTipoReg_MovimExp.setTipoMovimExp(vTipoMovimExp);
        newTipoReg_MovimExp.setNo(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_MOVIMIENTO_EXPEDIENTE));//registro:movimiento expediente
        //correlativo registro
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_MOVIMIENTO_EXPEDIENTE); //registro:movimiento expediente
        newTipoReg_MovimExp.setCodigo(vTipoRegistro.getPrefijo());
        newTipoReg_MovimExp.setVersion(vTipoRegistro.getVersion());
        tipoDao.saveReg_MovExp(newTipoReg_MovimExp);
        return newTipoReg_MovimExp;
    }

    private void SaveReg_MovExpDetalle(TipoQueja vTipoQueja, TipoReg_MovimExp vTipoReg_MovimExp, TipoMovimExpDetalle vTipoMovimExpDetalle) throws Exception {
        TipoReg_MovimExpDet vTipoReg_MovimExpDet = new TipoReg_MovimExpDet();
        vTipoReg_MovimExpDet.setTipoReg_MovimExp(vTipoReg_MovimExp);
        vTipoReg_MovimExpDet.setNo(vTipoReg_MovimExp.getNo());
        vTipoReg_MovimExpDet.setNombre_consumidor(vTipoQueja.getTipoconsumidor().getNombreCompleto());
        vTipoReg_MovimExpDet.setNombre_proveedor(vTipoQueja.getTipoproveedor().getNombre());
        vTipoReg_MovimExpDet.setQueja_no(vTipoQueja.getQuejaNumero());

        vTipoReg_MovimExpDet.setObservaciones(vTipoMovimExpDetalle.getObservaciones());
        //  TipoCatalogo vTipoCatalogo = tipoDao.findTipoCatalogo(vTipoComConsumidor.getVia());
        vTipoReg_MovimExpDet.setVia_de_ingreso(getFuente(vTipoQueja.getFuente()));

        tipoDao.saveReg_MovExpDet(vTipoReg_MovimExpDet);
    }
    //Registro: Movimiento Expediente

    @Override
    public ResponseRs getConcVirtInt(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposConcVirtInt(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveConcVirtInt(FormConcVirtInt formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        boolean isUpdate = formulario.isIs_edit();

        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(formulario.getId_departamento_interno());
            //TipoUsuario_Simple vTipoUsuario = tipoDao.findByIdUsuario(formulario.getUsuario());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(15);//15 Interaccion con Consumidor, Conciliaci??n Virtual
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            if (isUpdate) {
                newTipoPasoQueja.setOperacion("U");
            } else {
                newTipoPasoQueja.setOperacion("I");
            }
            tipoDao.savePasoQueja(newTipoPasoQueja);
            response.setValue(newTipoPasoQueja);

            // llenar datos interaccion
            TipoConcVirtInt vTipoConcVirtInt;
            if (isUpdate) {
                vTipoConcVirtInt = tipoDao.findByIdConcVirtInt(formulario.getId());
                vTipoConcVirtInt.setEstado("I");
                vTipoConcVirtInt.setRespuesta_con(formulario.getRespuesta_con());
            } else {
                vTipoConcVirtInt = new TipoConcVirtInt();
                vTipoConcVirtInt.setEstado("A");
                vTipoConcVirtInt.setPregunta(formulario.getPregunta());
                vTipoConcVirtInt.setCambiar_archivos(formulario.isCambiar_archivos());
                vTipoConcVirtInt.setCambiar_datos(formulario.isCambiar_datos());
            }
            vTipoConcVirtInt.setId_queja(formulario.getId_queja());
            vTipoConcVirtInt.setFecha(new Date());
            vTipoConcVirtInt.setTipopasoqueja(newTipoPasoQueja);
            tipoDao.saveConcVirtInt(vTipoConcVirtInt);

            //revisar si correo esta activo en parametros de sistema
            TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_CONC_VIRT_INTERACCIONES);
            if (efuente != null) {
                if (efuente.getActivo() == 1) {
                    //save, send email
                    String cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> DIACO le informa que el proveedor necesita informaci&oacute;n extra por parte suya."
                            + "<br>Para continuar por favor ingrese al siguiente link: " + GenerateMagicLink(formulario.getId_queja(), Constants.REG_DIACO_FUENTE_EMAIL_CONC_VIRT_INTERACCIONES, 0);
                    String[] mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                    boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_CONC_VIRT_INTERACCIONES, cuerpo); // fuente de email 1: interacci??n conciliacion virtual
                    if (!sendmail) {
                        response.setReason("EMAILFAIL");
                    } else {
                        response.setReason("OK");
                    }
                }
            }
            //bitacora auto log
            String txtmensaje = "Conciliaci??n Virtual (Portal Proveedor), Interacci??n con usuario guardada.";
            BitacoraAutomatica(formulario.getId_queja(), 4, formulario.getUsuario(), txtmensaje, txtmensaje, 15);

            response.setCode(0L);
            response.setValue(vTipoConcVirtInt);
            transaction.commit();

            //actualizar campo de parametro con id de interaccion conciliacion virtual
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoMagicLink tipomagiclink = tipoDao.findLastTipoMagicLinkxIdQueja(formulario.getId_queja(), Constants.REG_DIACO_FUENTE_EMAIL_CONC_VIRT_INTERACCIONES);
            tipomagiclink.setId_referencia(vTipoConcVirtInt.getId());
            response.setValue(tipomagiclink);
            tipoDao.saveMagicLink(tipomagiclink);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs SaveEmailNewPassword(String linkcode) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;

        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoMagicLink magiclink = tipoDao.findLastTipoMagicLink(linkcode);
            Integer idusuario = magiclink.getId_referencia();
            Map<String, String> respmap = smsi.GetRandomPW();
            TipoUsuario_Simple user = tipoDao.findByIdUsuario(idusuario);
            user.setClave(respmap.get("encriptado"));
            tipoDao.saveUsuarioSimple(user);

            //actualizar magic link
            magiclink.setEstado("I");
            tipoDao.saveMagicLink(magiclink);

            //correo reinicio clave
            String cuerpo = "Estimado Usuario, a petici??n suya se ha reiniciado su clave, su nueva clave es la siguiente:<br><br>" + respmap.get("clave");
            String[] mailstring = GetEmailStringUsuario(user.getEmail());
            saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD, cuerpo); // fuente de email 7 com perm

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs SetNewPassword(FormSimple formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            tipoDao.TokenCheck(formulario.getToken());
            Map<String, String> respmap = smsi.SetNewPW(formulario.getResp1());
            TipoUsuario_Simple user = tipoDao.findByIdUsuario(formulario.getUsuario());
            if (!user.getClave().equals(cryptoSvc.encrypt(formulario.getResp2(), Crypto.ALG_SHA256))) {
                response.setCode(0L);
                response.setReason("ERR_CLAVEVIEJA");
                response.setValue(user);
                transaction.rollback();
                return response;
            }
            user.setClave(respmap.get("encriptado"));
            tipoDao.saveUsuarioSimple(user);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;

    }

    private void SaveEmailNewPasswordInternal(Integer idusuario) throws Exception {
        Map<String, String> respmap = smsi.GetRandomPW();
        TipoUsuario_Simple user = tipoDao.findByIdUsuario(idusuario);
        user.setClave(respmap.get("encriptado"));
        tipoDao.saveUsuarioSimple(user);
        //correo reinicio clave
        String cuerpo = "Estimado Usuario, se ha solicitado un cambio de clave para su usuario, su nueva clave es la siguiente:<br><br>" + respmap.get("clave")
                + "<br><br>.";
        String[] mailstring = GetEmailStringUsuario(user.getEmail());
        saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD, cuerpo); // fuente de email 7 com perm

    }

    private void EmailNewUser(Integer idusuario) throws Exception {
        Map<String, String> respmap = smsi.PWNewUser();
        TipoUsuario_Simple user = tipoDao.findByIdUsuario(idusuario);
        user.setClave(respmap.get("encriptado"));
        tipoDao.saveUsuarioSimple(user);
        //correo reinicio clave
        String cuerpo = "Buen dia, se ha creado su nuevo usuario para el sistema DIACO, su clave es la siguiente: 12345678"
                + "<br><br>. Se le recomienda cambiar su clave lo antes posible.";
        String[] mailstring = GetEmailStringUsuario(user.getEmail());
        saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD, cuerpo); // fuente de email 7 com perm        
    }

    private String LimpiaStringTildes(String cadena) {
        String nueva = cadena;
        nueva = nueva.replaceAll("??", "&aacute;");
        nueva = nueva.replaceAll("??", "&eacute;");
        nueva = nueva.replaceAll("??", "&iacute;");
        nueva = nueva.replaceAll("??", "&oacute;");
        nueva = nueva.replaceAll("??", "&uacute;");
        nueva = nueva.replaceAll("??", "&Aacute;");
        nueva = nueva.replaceAll("??", "&Eacute;");
        nueva = nueva.replaceAll("??", "&Iacute;");
        nueva = nueva.replaceAll("??", "&Oacute;");
        nueva = nueva.replaceAll("??", "&Uacute;");
        nueva = nueva.replaceAll("??", "&uuml;");
        nueva = nueva.replaceAll("??", "&Uuml;");
        nueva = nueva.replaceAll("??", "&ntilde;");
        nueva = nueva.replaceAll("??", "&Ntilde;");
        return nueva;
    }

    private boolean saveEmailEnviar(String[] para, Integer idfuente, String cuerpo) throws Exception {
        TipoEmailEnviar vTipoEmailEnviar = new TipoEmailEnviar();
        TipoEmailFuente vTipoEmailFuente = tipoDao.findByIdEmailFuente(idfuente);
        System.out.println("REVISOR JJ: Resultado de variable vTipoEmailFuente: " + vTipoEmailFuente);
        System.out.println("REVISOR JJ: Resultado de variable vTipoEmailFuente.getDe(): " + vTipoEmailFuente.getDe());
        System.out.println("REVISOR JJ: Resultado de variable vTipoEmailFuente.getSubject(): " + vTipoEmailFuente.getSubject());
        System.out.println("REVISOR JJ: Resultado de variable cuerpo: " + cuerpo);
        //Email email=new Email();
        //send email
        boolean result = email.SendEmail(vTipoEmailFuente.getDe(), para, vTipoEmailFuente.getSubject(), cuerpo);
        System.out.println("REVISOR JJ: Resultado de variable result: " + result);
        vTipoEmailEnviar.setMensaje(cuerpo);
        vTipoEmailEnviar.setDe(vTipoEmailFuente.getDe());
        vTipoEmailEnviar.setPara(Arrays.toString(para));
        vTipoEmailEnviar.setSubject(vTipoEmailFuente.getSubject());
        vTipoEmailEnviar.setFecha_creado(new Date());
        vTipoEmailEnviar.setId_fuente(idfuente);
        System.out.println("LLEG?? SIN ERROR, saveEmailEnviar, valor de id_queja: " + vTipoEmailEnviar.getId_queja());
        if (result) {
            vTipoEmailEnviar.setEstado("I");
            vTipoEmailEnviar.setFallos(0);
            vTipoEmailEnviar.setFecha_enviado(new Date());
        } else {
            vTipoEmailEnviar.setEstado("A");
            vTipoEmailEnviar.setFallos(1);
            //System.out.println("else, valor de vTipoEmailEnviar: "+ vTipoEmailEnviar.toString());
            //tipoDao.saveEmailEnviar(vTipoEmailEnviar);
            return false;
        }
        //System.out.println("if, valor de vTipoEmailEnviar: "+ vTipoEmailEnviar.toString());
        //tipoDao.saveEmailEnviar(vTipoEmailEnviar);
        System.out.println("LLEG?? SIN ERROR, despues de saveEmailEnviar");
        return true;
    }

    private boolean ReSendEmailEnviar(TipoEmailEnviar correo) throws Exception {
        boolean result = email.SendEmail(correo.getDe(), CleanPara(correo.getPara()), correo.getSubject(), correo.getMensaje());
        if (result) {
            return true;
        } else {
            return false;
        }
    }

    private String[] GetEmailStringUsuario(String correo) {
        String[] recipients = new String[1];
        recipients[0] = correo;
        return recipients;
    }

    private String[] GetEmailStringContribuyente(Integer id) {
        List<TipoEmail> vTipoEmail = tipoDao.findAllTiposEmail(id, "C");
        if (!vTipoEmail.isEmpty()) {
            Integer size = vTipoEmail.size();
            String[] recipients = new String[size];
            Integer sizeposition = 0;
            String StrOutput = "";
            for (TipoEmail loc : vTipoEmail) {
                //System.out.println("**----"+loc.getId_mail()+"----**");
                recipients[sizeposition] = loc.getCorreo_electronico();
                sizeposition++;
            }
            return recipients;
        } else {
            return new String[0];
        }
    }

    private String[] GetEmailStringProveedor(Integer id) {
        List<TipoEmail> vTipoEmail = tipoDao.findAllTiposEmail(id, "P");
        if (!vTipoEmail.isEmpty()) {
            Integer size = vTipoEmail.size();
            String[] recipients = new String[size];
            Integer sizeposition = 0;
            String StrOutput = "";
            for (TipoEmail loc : vTipoEmail) {
                recipients[sizeposition] = loc.getCorreo_electronico();
                sizeposition++;
            }
            return recipients;
        } else {
            return new String[0];
        }
    }

    private String GenerateMagicLink(Integer id_queja, Integer id_fuente, Integer param1) throws Exception {
        TipoEmailFuente vTipoEmailFuente = null;
        String magiclink = "";
        for (Integer i = 0; i <= 19; i++) {
            Integer newrand = (int) (Math.random() * ((35 - 0) + 1)) + 0;
            magiclink = magiclink + ArrMagicLink[newrand];
        }
        TipoMagicLink vTipoMagicLink = tipoDao.findLastTipoMagicLink(magiclink);
        if (vTipoMagicLink == null) {
            vTipoEmailFuente = tipoDao.findByIdEmailFuente(id_fuente);
            vTipoMagicLink = new TipoMagicLink();
            vTipoMagicLink.setEstado("A");
            vTipoMagicLink.setFecha_enviado(new Date());
            vTipoMagicLink.setId_fuente(id_fuente);
            vTipoMagicLink.setLinkcode(magiclink);
            if (id_queja != 0) {
                vTipoMagicLink.setId_queja(id_queja);
            }
            vTipoMagicLink.setId_referencia(param1);
            tipoDao.saveMagicLink(vTipoMagicLink);
            String link = "<a href='" + vTipoEmailFuente.getRoot() + "#/Redirect/" + magiclink;
            /*if (!param1.isEmpty()) {
                link = link + "/" + param1;
            }*/
            link = link + "'>Click aqui</a>";
            return link;
        } else {
            return GenerateMagicLink(id_queja, id_fuente, param1);
        }
    }

    private FormSimple GenerateMagicLinkOptions(Integer id_queja, Integer id_fuente, String param1, String param2) throws Exception {
        TipoEmailFuente vTipoEmailFuente = null;
        String magiclink = "";
        for (Integer i = 0; i <= 19; i++) {
            Integer newrand = (int) (Math.random() * ((35 - 0) + 1)) + 0;
            magiclink = magiclink + ArrMagicLink[newrand];
        }
        TipoMagicLink vTipoMagicLink = tipoDao.findLastTipoMagicLink(magiclink);
        if (vTipoMagicLink == null) {
            vTipoEmailFuente = tipoDao.findByIdEmailFuente(id_fuente);
            vTipoMagicLink = new TipoMagicLink();
            vTipoMagicLink.setEstado("A");
            vTipoMagicLink.setFecha_enviado(new Date());
            vTipoMagicLink.setId_fuente(id_fuente);
            vTipoMagicLink.setLinkcode(magiclink);
            vTipoMagicLink.setId_queja(id_queja);
            tipoDao.saveMagicLink(vTipoMagicLink);
            FormSimple formsimple = new FormSimple();
            formsimple.setResp1("<a href='" + vTipoEmailFuente.getRoot() + "#/Redirect/" + magiclink + "/" + param1 + "'>Click aqui " + param1 + "</a>");
            formsimple.setResp2("<a href='" + vTipoEmailFuente.getRoot() + "#/Redirect/" + magiclink + "/" + param2 + "'>Click aqui " + param2 + "</a>");
            return formsimple;
        } else {
            return GenerateMagicLinkOptions(id_queja, id_fuente, param1, param2);
        }
    }

    //Estado Queja
    @Override
    public ResponseRs getEstadosQueja(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposEstadoQueja());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Verificacion Datos Interaccion
    @Override
    public ResponseRs getVerifDatosInt(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposVerifDatInt(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveVerifDatosInt(FormConcVirtInt formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;

        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            // insertar paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            Date date = new Date();
            newTipoPasoQueja.setFecha_operacion(date);
            newTipoPasoQueja.setId_departamento_interno(formulario.getId_departamento_interno());
            //TipoUsuario_Simple vTipoUsuario = tipoDao.findByIdUsuario(formulario.getUsuario());
            if (vTipoQueja.getId_diaco_sede() != null) {
                newTipoPasoQueja.setId_sede_diaco_operacio(vTipoQueja.getId_diaco_sede());
            } else {
                newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            }
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            newTipoPasoQueja.setId_tipo_registro(2);//2 verificacion de datos
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            tipoDao.savePasoQueja(newTipoPasoQueja);
            response.setValue(newTipoPasoQueja);

            // llenar datos interaccion
            TipoVerifDatosInt vTipoVerifDatosInt = new TipoVerifDatosInt();
            vTipoVerifDatosInt.setFecha(date);
            vTipoVerifDatosInt.setId_queja(formulario.getId_queja());
            vTipoVerifDatosInt.setTipopasoqueja(newTipoPasoQueja);
            tipoDao.saveVerifDatInt(vTipoVerifDatosInt);

            //revisar si correo esta activo en parametros de sistema
            TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_VERIF_DATOS_INFO_EXTRA);
            if (efuente != null) {
                if (efuente.getActivo() == 1) {
                    //save, send email
                    TipoVerifConcVirt vTipoVerifConcVirt = tipoDao.findAllVerifConcVirt(formulario.getId_queja());
                    String cuerpo;
                    if (vTipoVerifConcVirt != null) {

                        cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> DIACO le informa que en el sistema aparece que no hubo un acuerdo entre el proveedor y su persona."
                                + "Por lo que, para que Diaco programe la audiencia de conciliaci&oacute;n y no se cierre el caso, por favor ingresar datos complementarios "
                                + "para el proceso respectivo en la siguiente direcci&oacute;n: ";
                    } else {
                        cuerpo = "Estimado Consumidor(a) / Usuario(a):<br> DIACO le informa que para poder continuar con el tramite de su queja necesitamos que llene la informaci&oacute;n del siguiente link: ";
                    }
                    cuerpo = cuerpo + GenerateMagicLink(formulario.getId_queja(), Constants.REG_DIACO_FUENTE_EMAIL_VERIF_DATOS_INFO_EXTRA, 0);
                    String[] mailstring = GetEmailStringContribuyente(vTipoQueja.getId_consumidor());
                    System.out.println("REVISOR JJ: Resultado de variable mailstring: " + mailstring);
                    System.out.println("REVISOR JJ: Resultado de variable mailstring como Array: " + Arrays.toString(mailstring));
                    System.out.println("REVISOR JJ: Resultado de variable cuerpo: " + cuerpo);
                    boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_VERIF_DATOS_INFO_EXTRA, cuerpo); // fuente de email 2: verificacion de datos informacion adicional

                    if (!sendmail) {
                        response.setReason("EMAILFAIL");
                    } else {
                        response.setReason("OK");
                    }
                }
            }

            //bitacora auto log
            String txtmensaje = "Solicitud de informaci??n extra a usuario, verificaci??n de datos.";
            BitacoraAutomatica(formulario.getId_queja(), 1, formulario.getUsuario(), txtmensaje, txtmensaje, 2);

            response.setCode(0L);
            response.setValue(vTipoVerifDatosInt);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs VerifDatosFlujoGuia(Integer idqueja, Integer id_flujo, String token) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;

        try {
            tipoDao.TokenCheck(token);
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(idqueja);
            switch (id_flujo) {
                case 1:
                    if (vTipoQueja.getId_estado_queja() <= 103) {
                        vTipoQueja.setId_estado_queja(103);
                        tipoDao.saveQueja(vTipoQueja);
                    }
                    saveTiposFlujoGuia(idqueja, 2);
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    //Magic Link

    @Override
    public ResponseRs getMagicLink(String id) {
        ResponseRs response = new ResponseRs();

        try {
            //tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findLastTipoMagicLink(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //Registro: Formulario Queja
    @Override
    public ResponseRs getReg_FormularioQxIdQueja(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoReg_FormularioQueja(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveReg_FormularioQ(FormRegistro formRegistro) {
        ResponseRs response = new ResponseRs();
        TipoReg_FormularioQueja vTipoReg_FormularioQueja;
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formRegistro.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_FormularioQueja = tipoDao.findAllTipoReg_FormularioQueja(formRegistro.getId_queja());
            if (vTipoReg_FormularioQueja == null) {
                vTipoReg_FormularioQueja = new TipoReg_FormularioQueja();
            }
            vTipoReg_FormularioQueja.setCreado_por(formRegistro.getCreado_por());
            vTipoReg_FormularioQueja.setId_queja(formRegistro.getId_queja());
            vTipoReg_FormularioQueja.setId_registro(Constants.REG_DIACO_REGISTRO_FORMULARIO_QUEJA);
            vTipoReg_FormularioQueja.setId_tipo_registro(Constants.REG_TIPO_FORMULARIO_QUEJA);
            vTipoReg_FormularioQueja.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_FORMULARIO_QUEJA));
            //INFO QUEJA
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formRegistro.getId_queja());
            vTipoReg_FormularioQueja.setFecha(vTipoQueja.getFecha_queja());
            vTipoReg_FormularioQueja.setFecha_creacion(new Date());
            vTipoReg_FormularioQueja.setQuejanumero(vTipoQueja.getNo_queja());
            vTipoReg_FormularioQueja.setAnio_queja(vTipoQueja.getAnio());
            vTipoReg_FormularioQueja.setSolucion(vTipoQueja.getSolicita_que());
            vTipoReg_FormularioQueja.setProv_fechacompra(vTipoQueja.getFecha_factura());
            String fuente;
            /*switch (vTipoQueja.getFuente()) 
                        {
                            case "presentially" :
                                     fuente="Presencial";
                                     break;
                            case "webMobil"  :
                                    fuente="Mobil";
                                     break;
                            case "Web user" :
                                    fuente="Web";
                                    break;
                            default: fuente=vTipoQueja.getFuente();
                                  
                        
                        }*/
            fuente = getFuente(vTipoQueja.getFuente());
            vTipoReg_FormularioQueja.setVia_ingreso(fuente);
            vTipoReg_FormularioQueja.setQueja(vTipoQueja.getDetalle_queja());
            //INFO CONSUMIDOR
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            if (vTipoConsumidor != null) {
                /*  if (vTipoConsumidor.getTipo_consumidor() == 7) //si es juridico
                {
                    vTipoReg_FormularioQueja.setCon_nombre(vTipoConsumidor.getNombreCompletoJuridico());

                } else {*/
                vTipoReg_FormularioQueja.setCon_nombre(vTipoConsumidor.getNombreCompleto());
                // }
                //vTipoReg_FormularioQueja.setCon_direccion(vTipoConsumidor.getDireccion_avenida());   esto va a cambiar

                vTipoReg_FormularioQueja.setCon_email(CommaSeparatedEmailsCons(vTipoQueja.getId_consumidor()));
                vTipoReg_FormularioQueja.setCon_dpto(vTipoConsumidor.getTipoDepartamento().getNombre_departamento());
                vTipoReg_FormularioQueja.setCon_municipio(vTipoConsumidor.getTipoMunicipio().getNombre_municipio());
                vTipoReg_FormularioQueja.setCon_identificacion(vTipoConsumidor.getDocumento_identificacion());
                vTipoReg_FormularioQueja.setCon_telefono(CommaSeparatedTelefCons(vTipoQueja.getId_consumidor()));
                vTipoReg_FormularioQueja.setCon_direccion(vTipoConsumidor.getDireccion());
                vTipoReg_FormularioQueja.setCon_zona(vTipoConsumidor.getDireccion_zona());
            }
            //INFO PROVEEDOR
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            if (vTipoProveedor != null) {
                //si es proveedor individual pone el nombre completo mas nombre de empresa
                /*    if (vTipoProveedor.getTipo_proveedor() == 6) {
                    vTipoReg_FormularioQueja.setProv_nombre(vTipoProveedor.getNombreCompletoIndividual());

                } else {*/
                vTipoReg_FormularioQueja.setProv_nombre(vTipoProveedor.getNombre());
                // }

                vTipoReg_FormularioQueja.setProv_departamento(vTipoQueja.getTipoDepartamentoProv().getNombre_departamento());
                vTipoReg_FormularioQueja.setProv_municipio(vTipoQueja.getTipoMunicipioProv().getNombre_municipio());
                //vTipoReg_FormularioQueja.setProv_fechacompra(prov_fechacompra);  preguntar de donde viene esto
                vTipoReg_FormularioQueja.setProv_nit(vTipoProveedor.getNit_proveedor());
                vTipoReg_FormularioQueja.setProv_telefono(CommaSeparatedTelefPro(vTipoQueja.getId_proveedor()));
                vTipoReg_FormularioQueja.setProv_direccion(vTipoQueja.getDireccion_proveedor());
                vTipoReg_FormularioQueja.setProv_zona(String.valueOf(vTipoQueja.getZona_proveedor()));
            }
            tipoDao.saveReg_FormularioQueja(vTipoReg_FormularioQueja);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoReg_FormularioQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    // save DIACO-AS-FO-01 --APERTURA PRUEBA
    //@Override
    public TipoReg_ResolucionAperturaAPrueba saveReg_ResAperturaPrueba(TipoQueja vTipoQueja, TipoResAudiencia vTipoResAudiencia, String correlativo) {

        TipoReg_ResolucionAperturaAPrueba vTipoReg_ResolucionAperturaAPrueba = null;
        // UserTransaction transaction=null;
        try {

            /* transaction = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
                        transaction.begin();*/
            //verificar si es update o insert
            vTipoReg_ResolucionAperturaAPrueba = tipoDao.findByResAperturaPruebaIdResAudiencia(vTipoResAudiencia.getId());
            if (vTipoReg_ResolucionAperturaAPrueba == null) {
                vTipoReg_ResolucionAperturaAPrueba = new TipoReg_ResolucionAperturaAPrueba();
                vTipoReg_ResolucionAperturaAPrueba.setCreadoPor(vTipoResAudiencia.getUsuario_actualizado());
                vTipoReg_ResolucionAperturaAPrueba.setIdQueja(vTipoQueja.getId_queja());
                vTipoReg_ResolucionAperturaAPrueba.setIdRegistro(Constants.REG_DIACO_REGISTRO_RESOLUCION_APERTURA_PRUEBA);
                vTipoReg_ResolucionAperturaAPrueba.setIdTipoRegistro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
                vTipoReg_ResolucionAperturaAPrueba.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_RESOLUCION_APERTURA_PRUEBA));
                vTipoReg_ResolucionAperturaAPrueba.setIdResultadoAudiencia(vTipoResAudiencia.getId());
                vTipoReg_ResolucionAperturaAPrueba.setCorrelativo(correlativo);
            }

            vTipoReg_ResolucionAperturaAPrueba.setQuejanumero(vTipoQueja.getNo_queja());
            vTipoReg_ResolucionAperturaAPrueba.setAsignadoA(String.valueOf(vTipoResAudiencia.getUsuario_actualizado()));
            //INFO CONSUMIDOR
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            if (vTipoConsumidor != null) {

                /*  if(vTipoConsumidor.getTipo_consumidor()==7)  //si es juridico
                            {  vTipoReg_FormularioQueja.setCon_nombre(vTipoConsumidor.getNombreCompletoJuridico());
                                
                            }
                            else*/
                vTipoReg_ResolucionAperturaAPrueba.setConsumidor(vTipoConsumidor.getNombreCompleto());

            }
            //INFO PROVEEDOR
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            if (vTipoProveedor != null) {
                //si es proveedor individual pone el nombre completo mas nombre de empresa
                /*    if (vTipoProveedor.getTipo_proveedor() == 6) {
                    vTipoReg_ResolucionAperturaAPrueba.setProveedor(vTipoProveedor.getNombreCompletoIndividual());

                } else {*/
                vTipoReg_ResolucionAperturaAPrueba.setProveedor(vTipoProveedor.getNombre());
                //  }
            }
            vTipoReg_ResolucionAperturaAPrueba.setFechaCreacion(new Date());
            vTipoReg_ResolucionAperturaAPrueba.setFechaResolucionApertura(new Date());
            // TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_RESOLUCION_APERTURA_PRUEBA);
            //vTipoReg_ResolucionAperturaAPrueba.setCorrelativo(vTipoRegistro.getCodigo_correlativo() + "-" + vTipoResAudiencia.getCorr_acta());

            tipoDao.saveReg_ResAperturaPrueba(vTipoReg_ResolucionAperturaAPrueba);

            // transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();

            try {
                // transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return vTipoReg_ResolucionAperturaAPrueba;
    }

    // save DIACO-AS-FO-07 --DECLARACION DE REBELDIA        //@Override
    public void saveReg_ResDeclaracionRebeldia(TipoQueja vTipoQueja, TipoResAudiencia vTipoResAudiencia, String correlativo) {

        TipoReg_DeclaracionRebeldia vTipoReg_DeclaracionRebeldia = null;
        // UserTransaction transaction=null;
        try {

            /* transaction = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
                        transaction.begin();*/
            //verificar si es update o insert
            vTipoReg_DeclaracionRebeldia = tipoDao.findByResDeclaracionRebeldia(vTipoResAudiencia.getId());
            if (vTipoReg_DeclaracionRebeldia == null) {
                vTipoReg_DeclaracionRebeldia = new TipoReg_DeclaracionRebeldia();
                vTipoReg_DeclaracionRebeldia.setIdQueja(vTipoQueja.getId_queja());
                vTipoReg_DeclaracionRebeldia.setIdRegistro(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA);
                vTipoReg_DeclaracionRebeldia.setIdTipoRegistro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
                vTipoReg_DeclaracionRebeldia.setCorrelativo(correlativo);
                vTipoReg_DeclaracionRebeldia.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA));
                vTipoReg_DeclaracionRebeldia.setIdResultadoAudiencia(vTipoResAudiencia.getId());
            }

            vTipoReg_DeclaracionRebeldia.setQuejanumero(vTipoQueja.getNo_queja());
            vTipoReg_DeclaracionRebeldia.setCreadoPor(vTipoResAudiencia.getUsuario_actualizado());
            vTipoReg_DeclaracionRebeldia.setAnio(vTipoQueja.getAnio());
            //INFO CONSUMIDOR
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            if (vTipoConsumidor != null) {

                /*  if(vTipoConsumidor.getTipo_consumidor()==7)  //si es juridico
                            {  vTipoReg_FormularioQueja.setCon_nombre(vTipoConsumidor.getNombreCompletoJuridico());
                                
                            }
                            else*/
                vTipoReg_DeclaracionRebeldia.setConsumidorNombre(vTipoConsumidor.getNombreCompleto());

            }
            //INFO PROVEEDOR
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            if (vTipoProveedor != null) {
                //si es proveedor individual pone el nombre completo mas nombre de empresa
                /*     if (vTipoProveedor.getTipo_proveedor() == 6) {
                    vTipoReg_DeclaracionRebeldia.setProveedorNombre(vTipoProveedor.getNombreCompletoIndividual());

                } else {*/
                vTipoReg_DeclaracionRebeldia.setProveedorNombre(vTipoProveedor.getNombre());
                //  }
            }
            //fecha de audiencia
            //AUDIENCIA DE CONCILIACION
            List<TipoProgramaAudiencia> vListTipoProgramaAudiencia = tipoDao.findAllTiposProgramaAudienciaxIdQueja(vTipoQueja.getId_queja(), 2);
            TipoProgramaAudiencia vTipoProgramaAudiencia = (vListTipoProgramaAudiencia.get(0) != null ? vListTipoProgramaAudiencia.get(0) : null);
            if (vTipoProgramaAudiencia != null) {
                vTipoReg_DeclaracionRebeldia.setFechaSegundaAudiencia(vTipoProgramaAudiencia.getFecha_programada());
            }

            vTipoReg_DeclaracionRebeldia.setFechaCreacion(new Date());
            vTipoReg_DeclaracionRebeldia.setFechaNotificacion(vTipoResAudiencia.getFechanotificacion());
            //TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA);
            //vTipoReg_DeclaracionRebeldia.setCorrelativo(vTipoRegistro.getCodigo_correlativo() + "-" + vTipoResAudiencia.getCorr_acta());

            tipoDao.saveReg_ResDeclaracionRebeldia(vTipoReg_DeclaracionRebeldia);

            // transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();

            try {
                // transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

    }

    // save DIACO-AS-FO-02  resolucion final        //@Override
    public void saveReg_ResolucionFinal(TipoQueja vTipoQueja, TipoResFinal vTipoResAudiencia) {

        TipoReg_ResolucionFinal vTipoReg_ResolucionFinal = null;
        // UserTransaction transaction=null;
        try {

            /* transaction = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
                        transaction.begin();*/
            //verificar si es update o insert
            vTipoReg_ResolucionFinal = tipoDao.findByResultResolucionFinal(vTipoResAudiencia.getId());
            if (vTipoReg_ResolucionFinal == null) {
                vTipoReg_ResolucionFinal = new TipoReg_ResolucionFinal();
                vTipoReg_ResolucionFinal.setIdQueja(vTipoQueja.getId_queja());
                vTipoReg_ResolucionFinal.setIdRegistro(Constants.REG_DIACO_REGISTRO_RESOLUCION_FINAL);
                vTipoReg_ResolucionFinal.setIdTipoRegistro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
                vTipoReg_ResolucionFinal.setCodigo(getRegistroSoloPrefijo(Constants.REG_DIACO_REGISTRO_RESOLUCION_FINAL));
                vTipoReg_ResolucionFinal.setIdResultadoAudiencia(vTipoResAudiencia.getId());
            }

            vTipoReg_ResolucionFinal.setQuejanumero(vTipoQueja.getNo_queja());
            vTipoReg_ResolucionFinal.setCreadoPor(vTipoResAudiencia.getUsuario_actualizado());
            vTipoReg_ResolucionFinal.setAnio(vTipoQueja.getAnio());
            //INFO CONSUMIDOR
            TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
            if (vTipoConsumidor != null) {

                /*  if(vTipoConsumidor.getTipo_consumidor()==7)  //si es juridico
                            {  vTipoReg_FormularioQueja.setCon_nombre(vTipoConsumidor.getNombreCompletoJuridico());
                                
                            }
                            else*/
                vTipoReg_ResolucionFinal.setConsumidorNombre(vTipoConsumidor.getNombreCompleto());

            }
            //INFO PROVEEDOR
            TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
            if (vTipoProveedor != null) {
                //si es proveedor individual pone el nombre completo mas nombre de empresa
                /*    if (vTipoProveedor.getTipo_proveedor() == 6) {
                    vTipoReg_ResolucionFinal.setProveedorNombre(vTipoProveedor.getNombreCompletoIndividual());

                } else {*/
                vTipoReg_ResolucionFinal.setProveedorNombre(vTipoProveedor.getNombre());
                //  }
            }
            vTipoReg_ResolucionFinal.setFechaCreacion(new Date());

            TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_RESOLUCION_FINAL);
            vTipoReg_ResolucionFinal.setCorrelativo(vTipoRegistro.getCodigo_correlativo() + "-" + vTipoResAudiencia.getCorrelativo());

            tipoDao.saveReg_ResultResolucionFinal(vTipoReg_ResolucionFinal);

            // transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();

            try {
                // transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

    }

    //Confirmar Accion
    @Override
    public ResponseRs getConfirmarAccion(Integer idusuario, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoConfirmarAccion(idusuario));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    private Integer ProximoEstado(Integer id_queja, Integer estado) throws Exception {
        TipoFlujoGuia tipoflujoguia = tipoDao.findAllTiposFlujoGuia(id_queja);
        switch (estado) {
            //130 atencion al consumidor en espera de confirmacion
            case 130:
                if (tipoflujoguia != null) {
                    if (tipoflujoguia.getAtcon_audiencia_prueba()) {
                        return 106;
                    } else {
                        if (tipoflujoguia.getAtcon_audiencia_conc()) {
                            return 105;
                        } else {
                            if (tipoflujoguia.getAtcon_com_permanente()) {
                                return 104;
                            } else {
                                if (tipoflujoguia.getAtcon_verif_datos()) {
                                    return 103;
                                } else {
                                    if (tipoflujoguia.getAtcon_conc_previa()) {
                                        return 102;
                                    } else {
                                        return 101;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return 101;
                }
            case 230:
                if (tipoflujoguia != null) {
                    if (tipoflujoguia.getJur_cobro_sancion()) {
                        return 206;
                    } else {
                        if (tipoflujoguia.getJur_resol_final()) {
                            return 205;
                        } else {
                            if (tipoflujoguia.getJur_result_audiencia()) {
                                return 204;
                            } else {
                                if (tipoflujoguia.getAtcon_audiencia_prueba()) {
                                    return 203;
                                } else {
                                    if (tipoflujoguia.getJur_documentado()) {
                                        return 202;
                                    } else {
                                        return 201;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return 201;
                }
            case 330:
                if (tipoflujoguia != null) {
                    if (tipoflujoguia.getVyv_informe_final()) {
                        return 303;
                    } else {
                        if (tipoflujoguia.getAtcon_com_permanente()) {
                            return 302;
                        } else {
                            return 301;
                        }
                    }
                } else {
                    return 301;
                }
            case 630:
                return 601;
            default:
                return 0;
        }
    }

    private void DeleteUsuarioAsignado(Integer id_queja, Integer id, String tipo) throws Exception {
        TipoTipoCola tipotipocola = tipoDao.findTiposTipoCola(id, tipo);
        TipoQuejaAsignacion tipoqasig = tipoDao.findTiposQuejaAsignacion(id_queja, tipotipocola.getId_tipo_cola());
        tipoDao.deleteTipoQuejaAsignacion(tipoqasig);
        TipoQueja tipoqueja = tipoDao.findByIdQueja(id_queja);
        tipoqueja.setUsuario_asignado(null);
        tipoDao.saveQueja(tipoqueja);
    }

    private void InactivarConfirmarAccion(Integer id_queja) throws Exception {
        List<TipoConfirmarAccion> listado = tipoDao.findTipoConfirmarAccionxIdQuejaActivo(id_queja);
        for (TipoConfirmarAccion esteelemento : listado) {
            TipoConfirmarAccion single = tipoDao.findByIdConfirmarAccion(esteelemento.getId());
            single.setEstado("I");
            tipoDao.saveConfirmarAccion(single);
        }
    }

    private void SaveConfirmarAccion(Integer id_queja, Integer id, String tipo) throws Exception {
        System.out.println(id_queja + ", " + id + ", " + tipo);
        int flujo = 0;
        int siguiente_usuario = 0;
        boolean flagcolavacia = false;
        TipoColaAsignacion tipocolaasignacion;
        TipoTipoCola tipotipocola;
        tipotipocola = tipoDao.findTiposTipoCola(id, tipo);
        //save confirmar accion
        InactivarConfirmarAccion(id_queja);
        TipoConfirmarAccion tipoconfirmaraccion = new TipoConfirmarAccion();
        tipoconfirmaraccion.setEstado("A");
        Date date = new Date();
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //System.out.println(dateFormat.format(date));
        tipoconfirmaraccion.setFecha_creacion(date);
        tipoconfirmaraccion.setId_queja(id_queja);
        //revisar si la queja ya fue asignada antes a este flujo
        TipoQuejaAsignacion tipoqasig = tipoDao.findTiposQuejaAsignacion(id_queja, tipotipocola.getId_tipo_cola());
        boolean NuevaAsignacion = false;
        if (tipoqasig != null) {
            int usuario_asignado = 0;
            usuario_asignado = tipoqasig.getId_usuario();
            if (usuario_asignado != 0) {
                //si ya fue asignada, confirmar que el usuario esta activo en la cola de asignacion
                tipocolaasignacion = tipoDao.findTiposColaAsignacionxTipoyUsuario(tipotipocola.getId_tipo_cola(), usuario_asignado);
                if (tipocolaasignacion != null) {
                    NuevaAsignacion = false;
                    siguiente_usuario = usuario_asignado;
                } else {
                    NuevaAsignacion = true;
                }
            } else {
                NuevaAsignacion = true;
            }
        } else {
            NuevaAsignacion = true;
        }

        if (NuevaAsignacion) {
            //get nuevo due??o            
            if (tipotipocola.getUltima_asignacion() != null) {
                tipocolaasignacion = tipoDao.findTiposColaAsignacionSiguiente(tipotipocola.getId_tipo_cola(), tipotipocola.getUltima_asignacion());
                if (tipocolaasignacion != null) {
                    //agarrar el siguiente en cola de asignacion
                    siguiente_usuario = tipocolaasignacion.getId_usuario();
                } else {
                    //si no hay siguiente en cola de asignacion agarrar al primero otra vez
                    tipocolaasignacion = tipoDao.findTiposColaAsignacionPrimero(tipotipocola.getId_tipo_cola());
                    if (tipocolaasignacion != null) {
                        siguiente_usuario = tipocolaasignacion.getId_usuario();
                    } else {//si no hay nadie activo en la cola, regresar al jefe
                        flagcolavacia = true;
                    }
                }
            } else {
                //si tipo cola no tiene ultima asignacion agarrar el primero de la cola de asignacion
                tipocolaasignacion = tipoDao.findTiposColaAsignacionPrimero(tipotipocola.getId_tipo_cola());
                if (tipocolaasignacion != null) {
                    siguiente_usuario = tipocolaasignacion.getId_usuario();
                } else {//si no hay nadie activo en la cola, regresar al jefe
                    flagcolavacia = true;
                }
            }
            //actualizar tipo cola
            if (siguiente_usuario != 0) {
                tipotipocola.setUltima_asignacion(siguiente_usuario);
                tipoDao.saveTipoCola(tipotipocola);
            }
            //guardar en diaco queja asignacion
            if (tipoqasig == null) {
                tipoqasig = new TipoQuejaAsignacion();
                tipoqasig.setId_queja(id_queja);
            }
            if (siguiente_usuario != 0) {
                tipoqasig.setId_usuario(siguiente_usuario);
            }
            tipoqasig.setId_tipo_cola(tipotipocola.getId_tipo_cola());
            tipoDao.saveTipoQuejaAsignacion(tipoqasig);
        }
        if (siguiente_usuario != 0) {
            //guardar asignado en queja
            TipoQueja tipoqueja = tipoDao.findByIdQueja(id_queja);
            tipoqueja.setUsuario_asignado(siguiente_usuario);
            tipoDao.saveQueja(tipoqueja);
            //save confirmar accion
            tipoconfirmaraccion.setId_usuario(siguiente_usuario);
            tipoDao.saveConfirmarAccion(tipoconfirmaraccion);
        }
        if (flagcolavacia) {
            //raise error cola de asignacion vacia
            throw new Exception("Cola de Asignaci??n esta vac??a.");
        }
    }

    private void SaveConfirmarAccionColaEspecial(Integer id_queja, Integer id_tipo_cola) throws Exception {
        int flujo = 0;
        int siguiente_usuario = 0;
        boolean flagcolavacia = false;
        TipoColaAsignacion tipocolaasignacion;
        TipoTipoCola tipotipocola;
        tipotipocola = tipoDao.findByIdTipoCola(id_tipo_cola);
        //asignar estado inicial en base al flujo
        switch (tipotipocola.getId_flujo()) {
            case 1: //cola especial de atencion al consumidor 
                flujo = 130;
                break;
            case 2: //cola especial juridico
                flujo = 230;
                break;
            case 3://cola especial de verificacion y vigilancia servicios publicos o queja normal
                flujo = 330;
                break;
            case 6:
                flujo = 630;
                break;
        }
        //save confirmar accion
        InactivarConfirmarAccion(id_queja);
        TipoConfirmarAccion tipoconfirmaraccion = new TipoConfirmarAccion();
        tipoconfirmaraccion.setEstado("A");
        Date date = new Date();
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //System.out.println(dateFormat.format(date));
        tipoconfirmaraccion.setFecha_creacion(date);
        tipoconfirmaraccion.setId_queja(id_queja);
        //revisar si la queja ya fue asignada antes a este flujo
        TipoQuejaAsignacion tipoqasig = tipoDao.findTiposQuejaAsignacion(id_queja, tipotipocola.getId_tipo_cola());
        boolean NuevaAsignacion = false;
        if (tipoqasig != null) {
            int usuario_asignado = 0;
            usuario_asignado = tipoqasig.getId_usuario();
            if (usuario_asignado != 0) {
                //si ya fue asignada, confirmar que el usuario esta activo en la cola de asignacion
                tipocolaasignacion = tipoDao.findTiposColaAsignacionxTipoyUsuario(tipotipocola.getId_tipo_cola(), usuario_asignado);
                if (tipocolaasignacion != null) {
                    NuevaAsignacion = false;
                    siguiente_usuario = usuario_asignado;
                } else {
                    NuevaAsignacion = true;
                }
            } else {
                NuevaAsignacion = true;
            }
        } else {
            NuevaAsignacion = true;
        }

        if (NuevaAsignacion) {
            //get nuevo due??o            
            if (tipotipocola.getUltima_asignacion() != null) {
                tipocolaasignacion = tipoDao.findTiposColaAsignacionSiguiente(tipotipocola.getId_tipo_cola(), tipotipocola.getUltima_asignacion());
                if (tipocolaasignacion != null) {
                    //agarrar el siguiente en cola de asignacion
                    siguiente_usuario = tipocolaasignacion.getId_usuario();
                } else {
                    //si no hay siguiente en cola de asignacion agarrar al primero otra vez
                    tipocolaasignacion = tipoDao.findTiposColaAsignacionPrimero(tipotipocola.getId_tipo_cola());
                    if (tipocolaasignacion != null) {
                        siguiente_usuario = tipocolaasignacion.getId_usuario();
                    } else {//si no hay nadie activo en la cola, regresar al jefe
                        flagcolavacia = true;
                    }
                }
            } else {
                //si tipo cola no tiene ultima asignacion agarrar el primero de la cola de asignacion
                tipocolaasignacion = tipoDao.findTiposColaAsignacionPrimero(tipotipocola.getId_tipo_cola());
                if (tipocolaasignacion != null) {
                    siguiente_usuario = tipocolaasignacion.getId_usuario();
                } else {//si no hay nadie activo en la cola, regresar al jefe
                    flagcolavacia = true;
                }
            }
            //actualizar tipo cola
            if (siguiente_usuario != 0) {
                tipotipocola.setUltima_asignacion(siguiente_usuario);
                tipoDao.saveTipoCola(tipotipocola);
            }
            //guardar en diaco queja asignacion
            if (tipoqasig == null) {
                tipoqasig = new TipoQuejaAsignacion();
                tipoqasig.setId_queja(id_queja);
            }
            if (siguiente_usuario != 0) {
                tipoqasig.setId_usuario(siguiente_usuario);
            }
            tipoqasig.setId_tipo_cola(tipotipocola.getId_tipo_cola());
            tipoDao.saveTipoQuejaAsignacion(tipoqasig);
        }
        if (siguiente_usuario != 0) {
            //guardar asignado en queja y nuevo estado
            TipoQueja tipoqueja = tipoDao.findByIdQueja(id_queja);
            tipoqueja.setUsuario_asignado(siguiente_usuario);
            tipoqueja.setId_estado_queja(flujo);
            tipoDao.saveQueja(tipoqueja);
            //save confirmar accion
            tipoconfirmaraccion.setId_usuario(siguiente_usuario);
            tipoDao.saveConfirmarAccion(tipoconfirmaraccion);
        }
        if (flagcolavacia) {
            //raise error cola de asignacion vacia
            throw new Exception("Cola de Asignaci??n esta vac??a.");
        }
    }

    private void SaveColaAsignacionSinConfirmarAccion(Integer id_queja, Integer id_tipo_cola) throws Exception {
        int flujo = 0;
        int siguiente_usuario = 0;
        boolean flagcolavacia = false;
        TipoColaAsignacion tipocolaasignacion;
        TipoTipoCola tipotipocola;
        tipotipocola = tipoDao.findByIdTipoCola(id_tipo_cola);
        //asignar estado inicial en base al flujo
        switch (id_tipo_cola) {
            case 99: //cola especial de juridico para documentadores
                flujo = 230;
                break;
            case 3: //cola normal verificacion y vigilancia se guarda en 328
                flujo = 328;
                break;
        }
        //revisar si la queja ya fue asignada antes a este flujo
        TipoQuejaAsignacion tipoqasig = tipoDao.findTiposQuejaAsignacion(id_queja, tipotipocola.getId_tipo_cola());
        boolean NuevaAsignacion = false;
        if (tipoqasig != null) {
            int usuario_asignado = 0;
            usuario_asignado = tipoqasig.getId_usuario();
            if (usuario_asignado != 0) {
                //si ya fue asignada, confirmar que el usuario esta activo en la cola de asignacion
                tipocolaasignacion = tipoDao.findTiposColaAsignacionxTipoyUsuario(tipotipocola.getId_tipo_cola(), usuario_asignado);
                if (tipocolaasignacion != null) {
                    NuevaAsignacion = false;
                    siguiente_usuario = usuario_asignado;
                } else {
                    NuevaAsignacion = true;
                }
            } else {
                NuevaAsignacion = true;
            }
        } else {
            NuevaAsignacion = true;
        }

        if (NuevaAsignacion) {
            //get nuevo due??o            
            if (tipotipocola.getUltima_asignacion() != null) {
                tipocolaasignacion = tipoDao.findTiposColaAsignacionSiguiente(tipotipocola.getId_tipo_cola(), tipotipocola.getUltima_asignacion());
                if (tipocolaasignacion != null) {
                    //agarrar el siguiente en cola de asignacion
                    siguiente_usuario = tipocolaasignacion.getId_usuario();
                } else {
                    //si no hay siguiente en cola de asignacion agarrar al primero otra vez
                    tipocolaasignacion = tipoDao.findTiposColaAsignacionPrimero(tipotipocola.getId_tipo_cola());
                    if (tipocolaasignacion != null) {
                        siguiente_usuario = tipocolaasignacion.getId_usuario();
                    } else {//si no hay nadie activo en la cola, regresar al jefe
                        flagcolavacia = true;
                    }
                }
            } else {
                //si tipo cola no tiene ultima asignacion agarrar el primero de la cola de asignacion
                tipocolaasignacion = tipoDao.findTiposColaAsignacionPrimero(tipotipocola.getId_tipo_cola());
                if (tipocolaasignacion != null) {
                    siguiente_usuario = tipocolaasignacion.getId_usuario();
                } else {//si no hay nadie activo en la cola, regresar al jefe
                    flagcolavacia = true;
                }
            }
            //actualizar tipo cola
            if (siguiente_usuario != 0) {
                tipotipocola.setUltima_asignacion(siguiente_usuario);
                tipoDao.saveTipoCola(tipotipocola);
            }
            //guardar en diaco queja asignacion
            if (tipoqasig == null) {
                tipoqasig = new TipoQuejaAsignacion();
                tipoqasig.setId_queja(id_queja);
            }
            if (siguiente_usuario != 0) {
                tipoqasig.setId_usuario(siguiente_usuario);
            }
            tipoqasig.setId_tipo_cola(tipotipocola.getId_tipo_cola());
            tipoDao.saveTipoQuejaAsignacion(tipoqasig);
        }
        if (siguiente_usuario != 0) {
            //guardar asignado en queja
            TipoQueja tipoqueja = tipoDao.findByIdQueja(id_queja);
            tipoqueja.setUsuario_asignado(siguiente_usuario);
            if (id_tipo_cola == 99) {
                tipoqueja.setId_estado_queja(ProximoEstado(id_queja, flujo));
            } else {
                tipoqueja.setId_estado_queja(flujo);
            }
            tipoDao.saveQueja(tipoqueja);
        }
        if (flagcolavacia) {
            //raise error cola de asignacion vacia
            throw new Exception("Cola de Asignaci??n esta vac??a.");
        }
    }

    @Override
    public ResponseRs UpdateConfirmarAccion(FormSimple formSimple) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formSimple.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //buscar listado completo
            int valoresingresados = 0;
            System.out.println(formSimple.getListado_quejas());
            System.out.println(formSimple.getUsuario());
            List<Integer> QuejaList = convertCommaStringtoIntList(formSimple.getListado_quejas());
            for (Integer ii : QuejaList) {
                TipoQueja estaqueja = tipoDao.findByIdQueja(ii);
                if (estaqueja.getId_estado_queja() == 130 || estaqueja.getId_estado_queja() == 230 || estaqueja.getId_estado_queja() == 330 || estaqueja.getId_estado_queja() == 630) {
                    estaqueja.setId_estado_queja(ProximoEstado(estaqueja.getId_queja(), estaqueja.getId_estado_queja()));
                    //actualizar confirmar accion
                    TipoConfirmarAccion tipoconfirmaraccion = tipoDao.findTipoConfirmarAccionxIdQueja(ii, formSimple.getUsuario());
                    if (tipoconfirmaraccion != null) {
                        tipoconfirmaraccion.setEstado("I");
                        tipoconfirmaraccion.setFecha_aceptacion(new Date());
                        tipoconfirmaraccion.setId_queja(ii);
                        tipoconfirmaraccion.setId_usuario(formSimple.getUsuario());
                        tipoDao.saveConfirmarAccion(tipoconfirmaraccion);
                    } else {
                        //si el elemento no existe en la tabla confirmar accion, ignorar este elemento
                        continue;
                    }
                    //guardar queja
                    tipoDao.saveQueja(estaqueja);
                    valoresingresados++;
                }
            }

            //si no se actualizo nada se levanta un error y se hace rollback
            if (valoresingresados == 0) {
                response.setCode(1L);
                response.setReason("ERROR");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }

            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //public SaveConfirmarAccion
    @Override
    public ResponseRs savePubConfirmarAccionAtCon(Integer id_queja) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            //tipoDao.TokenCheck(token);
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //130 pendiente confirmar accion en atencion al consumidor
            TipoQueja tipoqueja = tipoDao.findByIdQueja(id_queja);
            if (tipoqueja.getId_estado_queja() == 130) {
                response.setCode(1L);
                response.setReason("ERROR_REPETIDO");
            } else if (tipoqueja.getId_estado_queja() == 401) { //verifica que estado sea 401 antes de continuar
                //revisar si queja va para una sede, central es identificada por 1
                //si no es 1 es porque no va a sede central y se tiene que enviar hacia esa sede
                if (tipoqueja.getId_diaco_sede() != 1) {
                    tipoqueja.setId_estado_queja(130);
                    tipoDao.saveQueja(tipoqueja);
                    SaveConfirmarAccion(tipoqueja.getId_queja(), tipoqueja.getId_diaco_sede(), "s");
                } else {
                    TipoProveedor tipoproveedor = tipoDao.findByIdProveedor(tipoqueja.getId_proveedor());
                    //si es central revisar si queja esta dentro de las 2 colas especiales de atencion al consumidor
                    switch (tipoproveedor.getId_actividad_economica()) {
                        //verificacion para servicios varios: 5 - bancos, 6 - operadores de tarjetas de credito, 7 - aseguradoras, 10 - energia electrica, 16 - servicio de agua municipal
                        case 5:
                        case 6:
                        case 7:
                        case 10:
                        case 16:
                            tipoqueja.setId_estado_queja(130);
                            tipoDao.saveQueja(tipoqueja);
                            SaveConfirmarAccionColaEspecial(tipoqueja.getId_queja(), 102); // 102 - cola servicios varios
                            break;
                        //verificacion para operadores de telecomunicaciones: 2 - telefonia, 3 - internet, 4 - servicio de cable
                        case 2:
                        case 3:
                        case 4:
                            tipoqueja.setId_estado_queja(130);
                            tipoDao.saveQueja(tipoqueja);
                            SaveConfirmarAccionColaEspecial(tipoqueja.getId_queja(), 103); // 103 - operadores de telecomunicaciones
                            break;
                        //caso contrario se manda la queja a cola normal atencion al consumidor
                        default:
                            tipoqueja.setId_estado_queja(130);
                            tipoDao.saveQueja(tipoqueja);
                            SaveConfirmarAccion(id_queja, 1, "f");
                    }
                }
                response.setCode(0L);
                response.setReason("OK");
                response.setValue("{ id_queja: " + id_queja.toString() + " }");
            } else {
                response.setCode(1L);
                response.setReason("ERROR_ESTADO_INCORRECTO");
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason(e.toString());

            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    private Integer getNextCorrelativoByIdTipoRegistro(Integer id) throws Exception {
        //incrementar en 1 el correlativo y guardar
        TipoRegistro vTipoRegistro = tipoDao.findByIdTipoRegistro(id);
        if (vTipoRegistro != null) {
            Integer newCorr = vTipoRegistro.getCorrelativo() + 1;
            vTipoRegistro.setCorrelativo(newCorr);
            tipoDao.saveRegistro(vTipoRegistro);
            //regresar el nuevo valor
            return newCorr;
        } else {
            return null;
        }
    }

    private ResponseRs savePrivConfirmarAccionAtCon(Integer id_queja) throws Exception {
        ResponseRs response = new ResponseRs();

        //130 pendiente confirmar accion en atencion al consumidor
        TipoQueja tipoqueja = tipoDao.findByIdQueja(id_queja);
        if (tipoqueja.getId_estado_queja() == 130) {
            response.setCode(1L);
            response.setReason("ERROR_REPETIDO");
        } else {
            tipoqueja.setId_estado_queja(130);
            tipoDao.saveQueja(tipoqueja);
            SaveConfirmarAccion(id_queja, 1, "f");
            response.setCode(0L);
            response.setReason("OK");
            response.setValue("{ id_queja: " + id_queja.toString() + " }");
        }
        return response;
    }

    @Override
    public Void RuteoQuejas140() {
        UserTransaction transaction = null;
        List<TipoQueja> lst_queja = tipoDao.findAllTiposQuejaPendienteRuteo();
        String error = "";
        for (TipoQueja estaqueja : lst_queja) {
            try {
                transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
                transaction.begin();
                TipoQueja localqueja = tipoDao.findByIdQueja(estaqueja.getId_queja());
                if (localqueja.getId_estado_queja() == 140) {
                    //crear registro en conciliacion virtual
                    boolean isUpdate = true;
                    TipoVerifConcVirt vTipoVerifConcVirt = tipoDao.findAllVerifConcVirt(localqueja.getId_queja());
                    if (vTipoVerifConcVirt == null) {
                        vTipoVerifConcVirt = new TipoVerifConcVirt();
                        isUpdate = false;
                    }
                    // insertar paso
                    TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
                    newTipoPasoQueja.setId_queja(localqueja.getId_queja());
                    newTipoPasoQueja.setFecha_operacion(new Date());
                    newTipoPasoQueja.setId_departamento_interno(1); // 1 - atencion al consumidor
                    newTipoPasoQueja.setId_sede_diaco_operacio(1); // 1 - central
                    newTipoPasoQueja.setId_estado_operado(101); // 101 - nuevo en atencion al consumidor
                    newTipoPasoQueja.setId_tipo_registro(14); // 14 - resolver queja
                    //newTipoPasoQueja.setUsuario_operacion(formVerifConcVirt.getUsuario_operacion()); usuario se deja en blanco
                    if (isUpdate) {
                        newTipoPasoQueja.setOperacion("U");
                    } else {
                        newTipoPasoQueja.setOperacion("I");
                    }
                    tipoDao.savePasoQueja(newTipoPasoQueja);
                    vTipoVerifConcVirt.setNotas("Queja vencida desde Portal de Proveedores asignada autom??ticamente.");
                    vTipoVerifConcVirt.setResolucion(10); //sin resolucion    
                    vTipoVerifConcVirt.setTipopasoqueja(newTipoPasoQueja);
                    tipoDao.saveVerifConcVirt(vTipoVerifConcVirt);
                    //log y flujo guia
                    String txtmensaje = "Queja vencida en Portal Proveedor, enviada a Atenci??n al Consumidor";
                    BitacoraAutomatica(localqueja.getId_queja(), 1, 0, txtmensaje, txtmensaje, 14);
                    saveTiposFlujoGuia(localqueja.getId_queja(), 1);
                    TipoFlujoGuia vTipoFlujoGuia = tipoDao.findByIdTipoFlujoGuia(localqueja.getId_queja());
                    //enviar a cola atencion al consumidor
                    savePrivConfirmarAccion140(localqueja.getId_queja());
                }
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                error = " con errores";
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
            //revisar que estado sea 140
            //buscar proveedor y ver si tiene conciliacion virtual, setear 401
            //si no tiene llamar a proceso para reasignar a cola at con.
        }
        //1 ruteo atencion al consumidor
        SaveTareaProgramada(1, new Date(), "completado" + error);
        return null;
    }

    @Override
    public Boolean savePrivConfirmarAccion140(Integer id_queja) throws Exception {
        //130 pendiente confirmar accion en atencion al consumidor
        TipoQueja tipoqueja = tipoDao.findByIdQueja(id_queja);
        if (tipoqueja.getId_estado_queja() == null) {
            return false;
        } else {
            if (tipoqueja.getId_estado_queja() == 140) {
                tipoqueja.setId_estado_queja(130);
                tipoDao.saveQueja(tipoqueja);
                SaveConfirmarAccion(id_queja, 1, "f");
                return true;
            } else {
                return false;
            }
        }
    }

    private TipoUsuario_Conf JefePorUnidad(Integer id_flujo) {
        //por ahora id_flujo y id_puesto estan mapeados directamente, otro jefe no va a estarlo
        //1-atencion al con, 2-juridico,3-verif y vigilancia
        TipoUsuario_Conf vuser = tipoDao.findByJefeUsuarioConf(id_flujo);
        if (vuser != null) {
            return vuser;
        } else {
            return null;
        }
    }

    @Override
    public Void EmailQuejasExpiradas() {
        UserTransaction transaction = null;
        Boolean error = false;
        TipoUsuario_Conf jefe_atcon = JefePorUnidad(1);
        TipoUsuario_Conf jefe_jur = JefePorUnidad(2);
        TipoUsuario_Conf jefe_vyv = JefePorUnidad(3);
        TipoUsuario_Conf jefe_sp = JefePorUnidad(1);
        List<TipoQueja> lst_queja_atcon = tipoDao.findAllExpiradoAtConCorreo();
        List<TipoQueja> lst_queja_jur = tipoDao.findAllExpiradoJurCorreo();
        List<TipoQueja> lst_queja_vyv = tipoDao.findAllExpiradoVyVCorreo();
        List<TipoQueja> lst_queja_sp = tipoDao.findAllExpiradoSPCorreo();

        //correo atencion al consumidor
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_atcon) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setExpirado_mail(1);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, a continuaci&oacute;n le mostramos el listado de quejas que han sido expiradas el dia de hoy.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_atcon.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_EXPIRADA_ATCON, cuerpo); // fuente de email 8
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        //correo juridico
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_jur) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setExpirado_mail(1);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, a continuaci&oacute;n le mostramos el listado de quejas que han sido expiradas el dia de hoy.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_jur.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_EXPIRADA_JUR, cuerpo); // fuente de email 9
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        //correo v y v
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_vyv) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setExpirado_mail(1);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, a continuaci&oacute;n le mostramos el listado de quejas que han sido expiradas el dia de hoy.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_vyv.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_EXPIRADA_VYV, cuerpo); // fuente de email 10
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        //correo s p
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_sp) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setExpirado_mail(1);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, a continuaci&oacute;n le mostramos el listado de quejas que han sido expiradas el dia de hoy.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_sp.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_EXPIRADA_SP, cuerpo); // fuente de email 11
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        //tarea 5 envio correos quejas expiradas
        if (error) {
            SaveTareaProgramada(6, new Date(), "completado con errores");
        } else {
            SaveTareaProgramada(6, new Date(), "completado");
        }
        return null;
    }

    @Override
    public Void EmailAlertaQuejasExpiradas() {
        UserTransaction transaction = null;
        Boolean error = false;
        TipoUsuario_Conf jefe_atcon = JefePorUnidad(1);
        TipoUsuario_Conf jefe_jur = JefePorUnidad(2);
        TipoUsuario_Conf jefe_vyv = JefePorUnidad(3);
        TipoUsuario_Conf jefe_sp = JefePorUnidad(1);
        List<TipoQueja> lst_queja_atcon = tipoDao.findAllAlertaExpiradoAtConCorreo();
        List<TipoQueja> lst_queja_jur = tipoDao.findAllAlertaExpiradoJurCorreo();
        List<TipoQueja> lst_queja_vyv = tipoDao.findAllAlertaExpiradoVyVCorreo();
        List<TipoQueja> lst_queja_sp = tipoDao.findAllAlertaExpiradoSPCorreo();

        //correo atencion al consumidor
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_atcon) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setFlag_alerta(0);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, favor tomar nota del siguiente listado de quejas que est&aacute;n cerca de expirar.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_atcon.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_ALERTA_EXPIRAR_ATCON, cuerpo); // fuente de email 8
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        //correo juridico
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_jur) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setFlag_alerta(0);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, favor tomar nota del siguiente listado de quejas que est&aacute;n cerca de expirar.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_jur.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_ALERTA_EXPIRAR_JUR, cuerpo); // fuente de email 9
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        //correo v y v
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_vyv) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setFlag_alerta(0);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, favor tomar nota del siguiente listado de quejas que est&aacute;n cerca de expirar.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_vyv.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_ALERTA_EXPIRAR_VYV, cuerpo); // fuente de email 10
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        //correo s p
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            String listatxtquejas = "";
            for (TipoQueja estaqueja : lst_queja_sp) {
                if (listatxtquejas.equals("")) {
                    listatxtquejas = estaqueja.getQuejaNumero();
                } else {
                    listatxtquejas = listatxtquejas + ", " + estaqueja.getQuejaNumero();
                }

                TipoQueja local = tipoDao.findByIdQueja(estaqueja.getId_queja());
                local.setFlag_alerta(0);
                tipoDao.saveQueja(local);
            }
            if (!listatxtquejas.equals("")) {
                String cuerpo = "Estimado Usuario, favor tomar nota del siguiente listado de quejas que est&aacute;n cerca de expirar.<br><br>";
                cuerpo = cuerpo + listatxtquejas;
                String[] mailstring = GetEmailStringUsuario(jefe_sp.getEmail());
                boolean sendmail = saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_QUEJA_ALERTA_EXPIRAR_SP, cuerpo); // fuente de email 11
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            error = true;
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        //tarea 5 envio correos quejas expiradas
        if (error) {
            SaveTareaProgramada(7, new Date(), "completado con errores");
        } else {
            SaveTareaProgramada(7, new Date(), "completado");
        }
        return null;
    }

    private String[] CleanPara(String Para) {
        String separado = Para.substring(1, Para.length() - 1);
        String[] commaSeparatedArr = separado.split("\\s*,\\s*");
        List<String> result = new ArrayList<String>(Arrays.asList(commaSeparatedArr));
        if (!result.isEmpty()) {
            Integer size = result.size();
            String[] recipients = new String[size];
            Integer sizeposition = 0;
            for (String loc : result) {
                recipients[sizeposition] = loc;
                sizeposition++;
            }
            return recipients;
        } else {
            return new String[0];
        }
    }

    //reenvio de correos, tarea programada
    @Override
    public Void ReenvioCorreos() {
        UserTransaction transaction = null;
        List<TipoEmailEnviar> lst_email = tipoDao.findbyActivoEmailEnviar();
        String error = "";
        Integer fallos = 0;
        boolean resultado = false;
        for (TipoEmailEnviar esteemail : lst_email) {
            try {
                transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
                transaction.begin();
                TipoEmailEnviar localemail = tipoDao.findByIdEmailEnviar(esteemail.getId());
                if (localemail.getEstado().equals("A")) {
                    resultado = ReSendEmailEnviar(localemail);
                    if (resultado) {
                        localemail.setEstado("I");
                        localemail.setFecha_enviado(new Date());
                    } else {
                        fallos = localemail.getFallos() + 1;
                        localemail.setFallos(fallos);
                        if (fallos >= 5) {
                            localemail.setEstado("I");
                        }
                    }
                    tipoDao.saveEmailEnviar(localemail);
                }
                transaction.commit();
            } catch (Exception e) {
                e.printStackTrace();
                error = " con errores";
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        }
        //2 reenvio de correos fallados
        SaveTareaProgramada(2, new Date(), "completado" + error);
        return null;
    }

    @Override
    public ResponseRs saveReg_ResArchivoConciliacion(FormRegistro PfrmReg) {

        ResponseRs response = new ResponseRs();
        Tipo_RegResArchivoConciliacion vTipoReg_ResArchConciliacion;
        UserTransaction transaction = null;

        try {

            tipoDao.TokenCheck(PfrmReg.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_ResArchConciliacion = tipoDao.findTiposReg_ResArchivoConciliacion(PfrmReg.getId_queja());
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(PfrmReg.getId_queja());
            if (vTipoReg_ResArchConciliacion == null) {
                vTipoReg_ResArchConciliacion = new Tipo_RegResArchivoConciliacion();
                vTipoReg_ResArchConciliacion.setCreadoPor(PfrmReg.getCreado_por());
                vTipoReg_ResArchConciliacion.setFechaCreacion(new Date());
                vTipoReg_ResArchConciliacion.setIdCorrelativoConciliacion(getNextCorrelativoByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_RES_ARCHIVO_CONCILIACION));
                vTipoReg_ResArchConciliacion.setIdQueja(PfrmReg.getId_queja());
                vTipoReg_ResArchConciliacion.setIdTipoRegistro(Constants.REG_TIPO_RESOLUCION_ARCHIVO_CONCILIACION);

                //se busca el nombre del consumidor
                TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
                vTipoReg_ResArchConciliacion.setNo_queja(String.valueOf(vTipoQueja.getNo_queja()));

                vTipoReg_ResArchConciliacion.setNombreConsumidor(vTipoConsumidor.getNombreCompleto());

                //se busca el nombre del proveedor  
                TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
                if (vTipoProveedor != null) {
                    vTipoReg_ResArchConciliacion.setNombreProveedor(vTipoProveedor.getNombre());
                }

            }
            vTipoReg_ResArchConciliacion.setFechaResConciliacion(new Date());
            vTipoReg_ResArchConciliacion = tipoDao.saveReg_ResArchConciliacion(vTipoReg_ResArchConciliacion);
            response.setValue(vTipoReg_ResArchConciliacion);

            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs getReg_ResArchivoConcilacion(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposReg_ResArchivoConciliacion(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveReg_ResArchUnAudConciliacion(FormRegistro PfrmReg) {

        ResponseRs response = new ResponseRs();
        TipoReg_ResArchivoUnicaAudienciaConc vTipoReg_ResArchUnAudConciliacion;
        UserTransaction transaction = null;

        try {

            tipoDao.TokenCheck(PfrmReg.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_ResArchUnAudConciliacion = tipoDao.findTiposReg_ResArchUnAudConciliacion(PfrmReg.getId_queja());
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(PfrmReg.getId_queja());
            if (vTipoReg_ResArchUnAudConciliacion == null) {
                vTipoReg_ResArchUnAudConciliacion = new TipoReg_ResArchivoUnicaAudienciaConc();
                vTipoReg_ResArchUnAudConciliacion.setCreadoPor(PfrmReg.getCreado_por());
                vTipoReg_ResArchUnAudConciliacion.setFechaCreacion(new Date());
                vTipoReg_ResArchUnAudConciliacion.setIdCorrelativoUnicaAudiencia(getNextCorrelativoByIdTipoRegistro(Constants.REG_DIACO_REGISTRO_RES_ARCHIVO_UNICA_AUD_CONC));
                vTipoReg_ResArchUnAudConciliacion.setIdQueja(PfrmReg.getId_queja());
                vTipoReg_ResArchUnAudConciliacion.setIdTipoRegistro(Constants.REG_TIPO_RESOLUCION_ARCHIVO_UNICA_AUD_CONC);

                //se busca el nombre del consumidor
                TipoConsumidor vTipoConsumidor = tipoDao.findByIdConsumidor(vTipoQueja.getId_consumidor());
                vTipoReg_ResArchUnAudConciliacion.setNombreConsumidor(vTipoConsumidor.getNombreCompleto());

                //se busca el nombre del proveedor  
                TipoProveedor vTipoProveedor = tipoDao.findByIdProveedor(vTipoQueja.getId_proveedor());
                if (vTipoProveedor != null) {
                    vTipoReg_ResArchUnAudConciliacion.setNombreProveedor(vTipoProveedor.getNombre());
                }

            }
            vTipoReg_ResArchUnAudConciliacion.setNo_queja(String.valueOf(vTipoQueja.getNo_queja()));
            vTipoReg_ResArchUnAudConciliacion.setFechaArchUnicoConc(new Date());
            vTipoReg_ResArchUnAudConciliacion = tipoDao.saveReg_ResArchUnAudConciliacion(vTipoReg_ResArchUnAudConciliacion);
            response.setValue(vTipoReg_ResArchUnAudConciliacion);

            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs getReg_ResArchivoUnAudConcilacion(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposReg_ResArchUnAudConciliacion(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //tipo cola
    @Override
    public ResponseRs getAllTipoColaSedes(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposTipoColaAllSedes());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override

    public ResponseRs getAllTipoColaxUsuario(String token, Integer idusuario) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposTipoColaAllxUsuario(idusuario));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getAllAsignaColaxTipo(String token, Integer idcola) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposColaAsignacionxTipo(idcola));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveAsignaCola(FormConfColas formulario) {
        ResponseRs response = new ResponseRs();
        TipoColaAsignacion vtipoColaAsignacion;
        UserTransaction transaction = null;

        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si se esta actualizando el estado o si ademas se esta programando una reactivacion
            vtipoColaAsignacion = tipoDao.findByIdColaAsignacion(formulario.getId_local());
            switch (formulario.getOperacion()) {
                case 1: // cambio estado
                    if (formulario.getEstado() == 1) {
                        vtipoColaAsignacion.setActivo(true);
                    } else {
                        vtipoColaAsignacion.setActivo(false);
                    }
                    break;
                case 2: // programar reactivacion
                    vtipoColaAsignacion.setActivo(false);
                    Date loc_date = StrtoDate(formulario.getFecha(), "");
                    vtipoColaAsignacion.setFecha_programado(loc_date);
                    vtipoColaAsignacion.setFlag_programado(1);
                    break;
                case 3: // borrar programacion y reactivar
                    vtipoColaAsignacion.setActivo(true);
                    vtipoColaAsignacion.setFlag_programado(0);
                    break;
            }
            tipoDao.saveColaAsignacion(vtipoColaAsignacion);
            response.setValue(vtipoColaAsignacion);
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs saveAsignaColaNew(FormConfColas formulario) {
        ResponseRs response = new ResponseRs();
        TipoColaAsignacion vtipoColaAsignacion;
        UserTransaction transaction = null;

        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si se esta actualizando el estado o si ademas se esta programando una reactivacion
            vtipoColaAsignacion = tipoDao.findTiposColaAsignacionxTipoyUsuario(formulario.getId_tipo_cola(), formulario.getUsuario_asignado());
            if (vtipoColaAsignacion != null) {
                response.setCode(1L);
                response.setReason("ERROR");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            } else {
                vtipoColaAsignacion = new TipoColaAsignacion();
                vtipoColaAsignacion.setActivo(true);
                vtipoColaAsignacion.setCreado_por(formulario.getUsuario_operacion());
                vtipoColaAsignacion.setFecha_creacion(new Date());
                vtipoColaAsignacion.setId_tipo_cola(formulario.getId_tipo_cola());
                vtipoColaAsignacion.setId_usuario(formulario.getUsuario_asignado());
                tipoDao.saveColaAsignacion(vtipoColaAsignacion);
                response.setValue(vtipoColaAsignacion);
            }
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs delAsignaCola(FormConfColas formulario) {
        ResponseRs response = new ResponseRs();
        TipoColaAsignacion vtipoColaAsignacion;
        UserTransaction transaction = null;

        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si se esta actualizando el estado o si ademas se esta programando una reactivacion
            vtipoColaAsignacion = tipoDao.findByIdColaAsignacion(formulario.getId_local());
            if (vtipoColaAsignacion == null) {
                response.setCode(1L);
                response.setReason("ERROR");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            } else {
                response.setValue(vtipoColaAsignacion);
                tipoDao.deleteColaAsignacion(vtipoColaAsignacion);
            }
            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs getEspecialxFlujo(String token, Integer id_flujo) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTiposTipoColaEspecialxFlujo(id_flujo));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public void BitacoraAutomatica(Integer idqueja, Integer idflujo, Integer usuario, String bitacora, String consumidor, Integer auto_fuente) throws Exception {
        Integer local_id_tipo_registro = 0;
        switch (idflujo) {
            case 1:
                local_id_tipo_registro = 12;
                break;
            case 2:
                local_id_tipo_registro = 26;
                break;
            case 3:
                local_id_tipo_registro = 23;
                break;
            case 4:
                local_id_tipo_registro = 13;
                break;
            case 6:
                local_id_tipo_registro = 16;
                break;
        }
        TipoBitacora tipobitacora = new TipoBitacora();
        tipobitacora.setBitacora(bitacora);
        tipobitacora.setConsumidor(consumidor);
        tipobitacora.setFecha(new Date());
        tipobitacora.setId_queja(idqueja);
        tipobitacora.setId_flujo(idflujo);
        if (auto_fuente != 0) {
            tipobitacora.setAuto_fuente(auto_fuente);
        }
        if (usuario != 0) {
            tipobitacora.setUsuario(usuario);
        }
        tipobitacora.setId_tipo_registro(local_id_tipo_registro);
        tipoDao.saveBitacora(tipobitacora);
    }

    public Void SaveTareaProgramada(Integer id_proceso, Date ejecucion, String resultado) {
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoTareaProgramadaEjec vtareaprogramada = new TipoTareaProgramadaEjec();
            vtareaprogramada.setId_proceso(id_proceso);
            vtareaprogramada.setEjecucion(ejecucion);
            vtareaprogramada.setResultado(resultado);
            tipoDao.saveTareaProgramada(vtareaprogramada);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return null;
    }

    //validador registros
    @Override
    public ResponseRs ValidadorRegistros(Integer id_queja, String token) {
        ResponseRs response = new ResponseRs();
        boolean valido = true;

        try {
            tipoDao.TokenCheck(token);
            //queja, id_departamento, id_municipio, 
            TipoQueja vtipoqueja = tipoDao.findByIdQueja(id_queja);
            if (vtipoqueja != null) {
                if (vtipoqueja.getId_departamento() == null) {
                    valido = false;
                }
                if (vtipoqueja.getId_municipio() == null) {
                    valido = false;
                }
                //consumidor, nacionalidad, codigo_municipio, codigo_departamento
                TipoConsumidor vtipocon = tipoDao.findByIdConsumidor(vtipoqueja.getId_consumidor());
                if (vtipocon != null) {
                    if (vtipocon.getNacionalidad() == null) {
                        valido = false;
                    }
                    if (vtipocon.getCodigo_municipio() == null) {
                        valido = false;
                    }
                    if (vtipocon.getCodigo_departamento() == null) {
                        valido = false;
                    }
                    //email, consumidor
                    List<TipoEmail> lst_email_con = tipoDao.findAllTiposEmail(vtipoqueja.getId_consumidor(), "C");
                    if (lst_email_con.isEmpty()) {
                        valido = false;
                    }
                    //telefono, consumidor
                    List<TipoTelefono> lst_tel_con = tipoDao.findAllTiposTelefono(vtipoqueja.getId_consumidor(), "C");
                    if (lst_tel_con.isEmpty()) {
                        valido = false;
                    }
                } else {
                    valido = false;
                }
                //proveedor, nombre != Pendiente, direccion, codigo_departamento, codigo_municipio
                TipoProveedor vtipopro = tipoDao.findByIdProveedor(vtipoqueja.getId_proveedor());
                if (vtipopro != null) {
                    if (vtipopro.getNombre() != null) {
                        if (vtipopro.getNombre().equals("Pendiente")) {
                            valido = false;
                        }
                    } else {
                        valido = false;
                    }
                    if (vtipopro.getDireccion() == null) {
                        valido = false;
                    }
                    if (vtipopro.getCodigo_departamento() == null) {
                        valido = false;
                    }
                    if (vtipopro.getCodigo_municipio() == null) {
                        valido = false;
                    }
                    //email, consumidor
                    List<TipoEmail> lst_email_pro = tipoDao.findAllTiposEmail(vtipoqueja.getId_proveedor(), "P");
                    if (lst_email_pro.isEmpty()) {
                        valido = false;
                    }
                    //telefono, consumidor
                    List<TipoTelefono> lst_tel_pro = tipoDao.findAllTiposTelefono(vtipoqueja.getId_proveedor(), "P");
                    if (lst_tel_pro.isEmpty()) {
                        valido = false;
                    }
                } else {
                    valido = false;
                }
            } else {
                valido = false;
            }

            if (valido) {
                response.setCode(0L);
                response.setReason("OK");
            } else {
                response.setCode(0L);
                response.setReason("INVALID");
            }
            response.setValue(vtipoqueja);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //reasignar queja
    @Override
    public ResponseRs ReasignarQuejaSave(FormSimple formSimple) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formSimple.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //actualizar queja, estado y persona asignada
            TipoQueja tipoqueja = tipoDao.findByIdQueja(formSimple.getId_queja());
            tipoqueja.setUsuario_asignado(formSimple.getValor());

            String msg = "";
            //System.out.println(formSimple.getBolvalor());
            if (formSimple.getValor2() == 1) {
                msg = "reactivada";
            } else {
                msg = "reasignada";
            }

            Integer preestado = 0;
            switch (formSimple.getId_flujo()) {
                case 1:
                    preestado = 130;
                    break;
                case 2:
                    preestado = 230;
                    break;
                case 3:
                    preestado = 330;
                    break;
                case 6:
                    preestado = 630;
                    break;
            }
            //Integer prox_estado=ProximoEstado(formSimple.getId_queja(),preestado);
            tipoqueja.setId_estado_queja(preestado);

            tipoDao.saveQueja(tipoqueja);

            //save confirmar accion
            InactivarConfirmarAccion(formSimple.getId_queja());
            TipoConfirmarAccion tipoconfirmaraccion = new TipoConfirmarAccion();
            tipoconfirmaraccion.setEstado("A");
            tipoconfirmaraccion.setFecha_creacion(new Date());
            tipoconfirmaraccion.setId_queja(formSimple.getId_queja());
            tipoconfirmaraccion.setId_usuario(formSimple.getValor());
            tipoDao.saveConfirmarAccion(tipoconfirmaraccion);
            //guardar registro reasignado
            TipoReasignar tiporeasignado = new TipoReasignar();
            tiporeasignado.setFecha_operacion(new Date());
            tiporeasignado.setId_queja(formSimple.getId_queja());
            tiporeasignado.setUsuario_operacion(formSimple.getUsuario());
            tiporeasignado.setUsuario_reasignar(formSimple.getValor());
            tipoDao.saveReasignar(tiporeasignado);

            //buscar nombre reasignacion
            TipoUsuario_Simple tus = tipoDao.findByIdUsuario(formSimple.getValor());
            String nom_asignado = tus.getNombre();

            //bitacora auto log
            String txtmensaje = "La Queja fu?? " + msg + " y asignada a " + nom_asignado;
            BitacoraAutomatica(formSimple.getId_queja(), formSimple.getId_flujo(), formSimple.getUsuario(), txtmensaje, txtmensaje, 0);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tiporeasignado);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //configuracion: parametros generales
    @Override
    public ResponseRs getParamGenerales(String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdParamGeneral(1));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveEstadoResolver(FormEstadoResolver formestadoresolver) {
        System.out.println("VAlor de id_queja: "+formestadoresolver.getId_queja()+" Valor de valor: "+formestadoresolver.getEstado_resolver());
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formestadoresolver.getId_queja());
            System.out.println("Variable vTipoQueja: "+vTipoQueja.toString());
            if (vTipoQueja != null) {

                vTipoQueja.setIs_est_resolver(formestadoresolver.getEstado_resolver());

                tipoDao.saveQueja(vTipoQueja);

                response.setCode(0L);
                response.setReason("PROBANDO saveEstadoResolver");
                response.setValue(vTipoQueja);
            } else {
                response.setCode(1L);
                response.setReason("ERROR");
            }
        transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERRORjj");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs saveParamGenerales(FormParamGeneral formParamGeneral) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formParamGeneral.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoParamGeneral tipoParamGeneral = tipoDao.findByIdParamGeneral(1);
            tipoParamGeneral.setFecha_modifico(new Date());
            tipoParamGeneral.setUsuario_modifico(formParamGeneral.getUsuario());
            tipoParamGeneral.setUma(formParamGeneral.getUMA());
            tipoParamGeneral.setTitulo_ministerio(formParamGeneral.getTitulo());
            tipoParamGeneral.setGenero_ministro(formParamGeneral.getGenero());
            tipoParamGeneral.setNombre_ministro(formParamGeneral.getNombre());
            tipoDao.saveParamGeneral(tipoParamGeneral);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoParamGeneral);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //configuracion usuario
    public ResponseRs getUsuarioCustomFilter(FormUsuarioSrch formUsuarioSrch) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formUsuarioSrch.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoUsuarioCustomFilter(formUsuarioSrch));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }
    //configuracion usuario

    public ResponseRs getUsuarioCustomFilterConcPrev(FormUsuarioSrch formUsuarioSrch) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(formUsuarioSrch.getToken());
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoUsuarioCustomFilterConcPrev(formUsuarioSrch));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveConfUsuario(FormConfUsuario formConfUsuario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        boolean UsuarioNuevo = false;
        try {
            tipoDao.TokenCheck(formConfUsuario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //guardar info usuario
            TipoUsuario_Conf vusuario;
            if (formConfUsuario.getId_usuario() != 0) {
                vusuario = tipoDao.findByIdUsuarioConf(formConfUsuario.getId_usuario());
            } else {
                vusuario = new TipoUsuario_Conf();
                UsuarioNuevo = true;
            }
            if (!formConfUsuario.getDpi().equals("")) {
                vusuario.setDpi(formConfUsuario.getDpi());
            }
            if (!formConfUsuario.getNit().equals("")) {
                vusuario.setNit(formConfUsuario.getNit());
            }
            //valida email no repetido
            TipoUsuario_Conf valida_email;
            if (formConfUsuario.getId_usuario() != 0) {
                valida_email = tipoDao.findByEmailExcUsuarioConf(formConfUsuario.getEmail(), formConfUsuario.getId_usuario());
            } else {
                valida_email = tipoDao.findByEmailUsuarioConf(formConfUsuario.getEmail());
            }
            if (valida_email != null) {
                response.setCode(1L);
                response.setReason("ERROR_EMAIL");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }
            //valida login no repetido
            TipoUsuario_Conf valida_login;
            if (formConfUsuario.getId_usuario() != 0) {
                valida_login = tipoDao.findByLoginExcUsuarioConf(formConfUsuario.getUsuario(), formConfUsuario.getId_usuario());
            } else {
                valida_login = tipoDao.findByLoginUsuarioConf(formConfUsuario.getUsuario());
            }
            if (valida_login != null) {
                response.setCode(1L);
                response.setReason("ERROR_USUARIO");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }
            vusuario.setEmail(formConfUsuario.getEmail());
            vusuario.setFecha_adicion(new Date());
            vusuario.setHabilitado(formConfUsuario.getEstado().toString());
            vusuario.setId_sede_diaco(formConfUsuario.getId_sede());
            vusuario.setLogin(formConfUsuario.getUsuario());
            vusuario.setNombre(formConfUsuario.getNombre());
            vusuario.setTelefono(formConfUsuario.getTelefono());
            vusuario.setId_puesto(formConfUsuario.getPuesto());
            tipoDao.saveUsuarioConf(vusuario);

            TipoUsuario_Conf usuarioSrch = tipoDao.findByLoginUsuarioConf(formConfUsuario.getUsuario());
            //guarda permisos globales, parametros generales
            TipoUsuarioPerfil vperfil = null;
            if (formConfUsuario.getGlob_paramgen() != 0) { //agregar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_Parametros(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_GENERALES_PARAMETROS);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_Parametros(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos globales, administracion usuarios
            if (formConfUsuario.getGlob_admusuarios() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_AdmUsuarios(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_GENERALES_ADMONUSUARIOS);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_AdmUsuarios(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos globales, configuracion
            if (formConfUsuario.getGlob_confsistema() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_Configuracion(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_GENERALES_CONFIGURACION);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_Configuracion(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos globales, aprobar portal proveedores
            if (formConfUsuario.getGlob_aprobarpp() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_AprobarPP(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_GENERALES_APROBACION_PP);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_AprobarPP(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos globales, catalogos
            if (formConfUsuario.getGlob_catalogos() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_Catalogos(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_GENERALES_CATALOGOS);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_general_Catalogos(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }

            Integer perfillocal;
            //guarda permisos atencion al consumidor, rol
            if (formConfUsuario.getAtcon_rol() != 0) { //agregar permiso
                perfillocal = 0;
                switch (formConfUsuario.getAtcon_rol()) {
                    case 1:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_ATCON_NORMAL;
                        break;
                    case 2:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_ATCON_REVISOR;
                        break;
                    case 3:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_ATCON_ADMINISTRADOR;
                        break;
                    case 4:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_ATCON_VERIFICADOR;
                        break;
                }
                boolean newvalue = false;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        //revisar si es el mismo, si no borrarlo
                        if (!java.util.Objects.equals(perfillocal, vperfil.getTipoUsuarioPerfilPK().getIdPerfilPuesto())) {
                            tipoDao.deleteUsuarioPerfil(vperfil);
                            newvalue = true;
                        }
                    } else {
                        newvalue = true;
                    }
                } else {
                    newvalue = true;
                }
                if (newvalue) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(perfillocal);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos atencion al consumidor, config sistema
            /*if(formConfUsuario.getAtcon_confsistema()!= 0){ //agregar permiso
                        vperfil=null;
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_atcon_conf(formConfUsuario.getId_usuario());                            
                        }
                        if(vperfil==null){
                            vperfil=new TipoUsuarioPerfil();
                            vperfil.setFechaAdicion(new Date());
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString()); 
                            TipoUsuarioPerfilPK perfilpk=new TipoUsuarioPerfilPK();
                            perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_ATCON_CONFIGURACION);
                            perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                            vperfil.setTipoUsuarioPerfilPK(perfilpk);
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                            tipoDao.saveUsuarioPerfil(vperfil);
                        }
                    }else{//borrar permiso
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_atcon_conf(formConfUsuario.getId_usuario());
                            if(vperfil != null){
                                tipoDao.deleteUsuarioPerfil(vperfil);
                            }
                        }
                    }*/
            //guarda permisos atencion al consumidor, administracion colas
            if (formConfUsuario.getAtcon_admcolas() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_colas(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_ATCON_COLAS);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_colas(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos atencion al consumidor, link presencial
            if (formConfUsuario.getAtcon_presencial() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_presencial(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_ATCON_PRESENCIAL);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_presencial(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }

            // Permiso para Perfil Call Center
            if (formConfUsuario.getAtcon_call_center() != 0) {
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_call_center(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_ATCON_CALL_CENTER);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_atcon_call_center(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }

            //guarda permisos juridico, rol
            if (formConfUsuario.getJur_rol() != 0) { //agregar permiso
                perfillocal = 0;
                switch (formConfUsuario.getJur_rol()) {
                    case 1:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_JUR_NORMAL;
                        break;
                    case 2:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_JUR_REVISOR;
                        break;
                    case 3:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_JUR_ADMINISTRADOR;
                        break;
                }
                boolean newvalue = false;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_jur_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        //revisar si es el mismo, si no borrarlo
                        if (!java.util.Objects.equals(perfillocal, vperfil.getTipoUsuarioPerfilPK().getIdPerfilPuesto())) {
                            tipoDao.deleteUsuarioPerfil(vperfil);
                            newvalue = true;
                        }
                    } else {
                        newvalue = true;
                    }
                } else {
                    newvalue = true;
                }
                if (newvalue) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(perfillocal);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_jur_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos juridico, config sistema
            /*if(formConfUsuario.getJur_confsistema()!= 0){ //agregar permiso
                        vperfil=null;
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_jur_conf(formConfUsuario.getId_usuario());
                        }
                        if(vperfil==null){
                            vperfil=new TipoUsuarioPerfil();
                            vperfil.setFechaAdicion(new Date());
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString()); 
                            TipoUsuarioPerfilPK perfilpk=new TipoUsuarioPerfilPK();
                            perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_JUR_CONFIGURACION);
                            perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                            vperfil.setTipoUsuarioPerfilPK(perfilpk);
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                            tipoDao.saveUsuarioPerfil(vperfil);
                        }
                    }else{//borrar permiso
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_jur_conf(formConfUsuario.getId_usuario());
                            if(vperfil != null){
                                tipoDao.deleteUsuarioPerfil(vperfil);
                            }
                        }
                    }*/
            //guarda permisos juridico, administracion colas
            if (formConfUsuario.getJur_admcolas() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_jur_colas(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_JUR_COLAS);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_jur_colas(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos verificaci??n y vigilancia, rol
            if (formConfUsuario.getVyv_rol() != 0) { //agregar permiso
                perfillocal = 0;
                switch (formConfUsuario.getVyv_rol()) {
                    case 1:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_VYV_NORMAL;
                        break;
                    case 2:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_VYV_REVISOR;
                        break;
                    case 3:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_VYV_ADMINISTRADOR;
                        break;
                }
                boolean newvalue = false;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_vyv_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        //revisar si es el mismo, si no borrarlo
                        if (!java.util.Objects.equals(perfillocal, vperfil.getTipoUsuarioPerfilPK().getIdPerfilPuesto())) {
                            tipoDao.deleteUsuarioPerfil(vperfil);
                            newvalue = true;
                        }
                    } else {
                        newvalue = true;
                    }
                } else {
                    newvalue = true;
                }
                if (newvalue) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(perfillocal);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_vyv_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos verificaci??n y vigilancia, config sistema
            /*if(formConfUsuario.getVyv_confsistema()!= 0){ //agregar permiso
                        vperfil=null;
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_vyv_conf(formConfUsuario.getId_usuario());
                        }
                        if(vperfil==null){
                            vperfil=new TipoUsuarioPerfil();
                            vperfil.setFechaAdicion(new Date());
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString()); 
                            TipoUsuarioPerfilPK perfilpk=new TipoUsuarioPerfilPK();
                            perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_VYV_CONFIGURACION);
                            perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                            vperfil.setTipoUsuarioPerfilPK(perfilpk);
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                            tipoDao.saveUsuarioPerfil(vperfil);
                        }
                    }else{//borrar permiso
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_vyv_conf(formConfUsuario.getId_usuario());
                            if(vperfil != null){
                                tipoDao.deleteUsuarioPerfil(vperfil);
                            }
                        }
                    }*/
            //guarda permisos verificaci??n y vigilancia, administracion colas
            if (formConfUsuario.getVyv_admcolas() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_vyv_colas(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_VYV_COLAS);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_vyv_colas(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos servicios p??blicos, rol
            if (formConfUsuario.getSp_rol() != 0) { //agregar permiso
                perfillocal = 0;
                switch (formConfUsuario.getSp_rol()) {
                    case 1:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_SP_NORMAL;
                        break;
                    case 2:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_SP_REVISOR;
                        break;
                    case 3:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_SP_ADMINISTRADOR;
                        break;
                }
                boolean newvalue = false;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_sp_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        //revisar si es el mismo, si no borrarlo
                        if (!java.util.Objects.equals(perfillocal, vperfil.getTipoUsuarioPerfilPK().getIdPerfilPuesto())) {
                            tipoDao.deleteUsuarioPerfil(vperfil);
                            newvalue = true;
                        }
                    } else {
                        newvalue = true;
                    }
                } else {
                    newvalue = true;
                }
                if (newvalue) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(perfillocal);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_sp_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }
            //guarda permisos servicios p??blicos, config sistema
            /*if(formConfUsuario.getSp_confsistema()!= 0){ //agregar permiso
                        vperfil=null;
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_sp_conf(formConfUsuario.getId_usuario());
                        }
                        if(vperfil==null){
                            vperfil=new TipoUsuarioPerfil();
                            vperfil.setFechaAdicion(new Date());
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString()); 
                            TipoUsuarioPerfilPK perfilpk=new TipoUsuarioPerfilPK();
                            perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_SP_CONFIGURACION);
                            perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                            vperfil.setTipoUsuarioPerfilPK(perfilpk);
                            vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                            tipoDao.saveUsuarioPerfil(vperfil);
                        }
                    }else{//borrar permiso
                        if(formConfUsuario.getId_usuario()!=0){
                            vperfil=tipoDao.findUsuarioPerfil_sp_conf(formConfUsuario.getId_usuario());
                            if(vperfil != null){
                                tipoDao.deleteUsuarioPerfil(vperfil);
                            }
                        }
                    }*/
            //guarda permisos servicios p??blicos, administracion colas
            if (formConfUsuario.getSp_admcolas() != 0) { //agregar permiso
                vperfil = null;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_sp_colas(formConfUsuario.getId_usuario());
                }
                if (vperfil == null) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(Constants.REG_DIACO_PERFIL_USUARIO_SP_COLAS);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPerfil_sp_colas(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }

            //genera clave y manda clave a usuario
            //genera clave y manda clave a usuario
            if (formConfUsuario.getResetpassword() == 1 && !UsuarioNuevo) {
                SaveEmailNewPasswordInternal(usuarioSrch.getId_usuario());
            }
            if (UsuarioNuevo) {
                EmailNewUser(usuarioSrch.getId_usuario());
            }
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(usuarioSrch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason(e.toString());
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /**
     * Conf antigua.
     *
     * @param formConfUsuario DTO
     * @return Response.
     */
    @Override
    public ResponseRs saveConfUsuarioPP(FormConfUsuario formConfUsuario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formConfUsuario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //guardar info usuario
            TipoUsuario_Conf vusuario;
            if (formConfUsuario.getId_usuario() != 0) {
                vusuario = tipoDao.findByIdUsuarioConf(formConfUsuario.getId_usuario());
            } else {
                vusuario = new TipoUsuario_Conf();
            }
            if (!formConfUsuario.getDpi().equals("")) {
                vusuario.setDpi(formConfUsuario.getDpi());
            }
            if (!formConfUsuario.getNit().equals("")) {
                vusuario.setNit(formConfUsuario.getNit());
            }
            //valida email no repetido
            TipoUsuario_Conf valida_email;
            if (formConfUsuario.getId_usuario() != 0) {
                valida_email = tipoDao.findByEmailExcUsuarioConf(formConfUsuario.getEmail(), formConfUsuario.getId_usuario());
            } else {
                valida_email = tipoDao.findByEmailUsuarioConf(formConfUsuario.getEmail());
            }
            if (valida_email != null) {
                response.setCode(1L);
                response.setReason("ERROR_EMAIL");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }
            //valida login no repetido
            TipoUsuario_Conf valida_login;
            if (formConfUsuario.getId_usuario() != 0) {
                valida_login = tipoDao.findByLoginExcUsuarioConf(formConfUsuario.getUsuario(), formConfUsuario.getId_usuario());
            } else {
                valida_login = tipoDao.findByLoginUsuarioConf(formConfUsuario.getUsuario());
            }
            if (valida_login != null) {
                response.setCode(1L);
                response.setReason("ERROR_USUARIO");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }
            vusuario.setEmail(formConfUsuario.getEmail());
            vusuario.setFecha_adicion(new Date());
            vusuario.setHabilitado(formConfUsuario.getEstado().toString());
            vusuario.setLogin(formConfUsuario.getUsuario());
            vusuario.setNombre(formConfUsuario.getNombre());
            vusuario.setTelefono(formConfUsuario.getTelefono());
            vusuario.setId_proveedor(formConfUsuario.getProveedor());
            tipoDao.saveUsuarioConf(vusuario);

            TipoUsuario_Conf usuarioSrch = tipoDao.findByLoginUsuarioConf(formConfUsuario.getUsuario());
            TipoUsuarioPerfil vperfil = null;
            Integer perfillocal;
            //guarda permisos portal proveedores, rol
            if (formConfUsuario.getPp_rol() != 0) { //agregar permiso
                perfillocal = 0;
                switch (formConfUsuario.getPp_rol()) {
                    case 1:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_PP_NORMAL;
                        break;
                    case 3:
                        perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_PP_ADMINISTRADOR;
                        break;
                }
                boolean newvalue = false;
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPP_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        //revisar si es el mismo, si no borrarlo
                        if (!java.util.Objects.equals(perfillocal, vperfil.getTipoUsuarioPerfilPK().getIdPerfilPuesto())) {
                            tipoDao.deleteUsuarioPerfil(vperfil);
                            newvalue = true;
                        }
                    } else {
                        newvalue = true;
                    }
                } else {
                    newvalue = true;
                }
                if (newvalue) {
                    vperfil = new TipoUsuarioPerfil();
                    vperfil.setFechaAdicion(new Date());
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
                    perfilpk.setIdPerfilPuesto(perfillocal);
                    perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
                    vperfil.setTipoUsuarioPerfilPK(perfilpk);
                    vperfil.setUsuarioAdicion(formConfUsuario.getUsuario_operacion().toString());
                    tipoDao.saveUsuarioPerfil(vperfil);
                }
            } else {//borrar permiso
                if (formConfUsuario.getId_usuario() != 0) {
                    vperfil = tipoDao.findUsuarioPP_Rol(formConfUsuario.getId_usuario());
                    if (vperfil != null) {
                        tipoDao.deleteUsuarioPerfil(vperfil);
                    }
                }
            }

            //genera clave y manda clave a usuario
            if (formConfUsuario.getResetpassword() == 1) {
                SaveEmailNewPasswordInternal(usuarioSrch.getId_usuario());
            }

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(usuarioSrch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs getUsuarioConfById(Integer idusuario, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            TipoUsuario_Conf ruser = tipoDao.findByIdUsuarioConf(idusuario);
            JsonObject temp = new JsonObject();
            CheckNull checknull = new CheckNull();
            temp.addProperty("id_usuario", ruser.getId_usuario());
            temp.addProperty("fecha_adicion", checknull.cknull(ruser.getFecha_adicion()));
            temp.addProperty("nombre", checknull.cknull(ruser.getNombre()));
            temp.addProperty("id_sede_diaco", checknull.cknull(ruser.getId_sede_diaco()));
            temp.addProperty("login", checknull.cknull(ruser.getLogin()));
            temp.addProperty("habilitado", checknull.cknull(ruser.getHabilitado()));
            temp.addProperty("email", checknull.cknull(ruser.getEmail()));
            temp.addProperty("dpi", checknull.cknull(ruser.getDpi()));
            temp.addProperty("telefono", checknull.cknull(ruser.getTelefono()));
            temp.addProperty("nit", checknull.cknull(ruser.getNit()));
            temp.addProperty("id_puesto", checknull.cknull(ruser.getId_puesto()));
            temp.addProperty("login", checknull.cknull(ruser.getLogin()));

            TipoUsuarioPerfil vuser = tipoDao.findUsuarioPerfil_general_Parametros(idusuario);
            if (vuser != null) {
                temp.addProperty("general_Parametros", 1);
            } else {
                temp.addProperty("general_Parametros", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_general_AdmUsuarios(idusuario);
            if (vuser != null) {
                temp.addProperty("general_AdmUsuarios", 1);
            } else {
                temp.addProperty("general_AdmUsuarios", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_general_Configuracion(idusuario);
            if (vuser != null) {
                temp.addProperty("general_Configuracion", 1);
            } else {
                temp.addProperty("general_Configuracion", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_general_AprobarPP(idusuario);
            if (vuser != null) {
                temp.addProperty("general_aprobarpp", 1);
            } else {
                temp.addProperty("general_aprobarpp", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_general_Catalogos(idusuario);
            if (vuser != null) {
                temp.addProperty("general_catalogos", 1);
            } else {
                temp.addProperty("general_catalogos", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_atcon_colas(idusuario);
            if (vuser != null) {
                temp.addProperty("atcon_colas", 1);
            } else {
                temp.addProperty("atcon_colas", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_atcon_presencial(idusuario);
            if (vuser != null) {
                temp.addProperty("atcon_presencial", 1);
            } else {
                temp.addProperty("atcon_presencial", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_atcon_call_center(idusuario);
            if (vuser != null) {
                temp.addProperty("atencion_call", 1);
            } else {
                temp.addProperty("atencion_call", 0);
            }

            /*vuser=tipoDao.findUsuarioPerfil_atcon_conf(idusuario);
                    if(vuser!=null){
                        temp.addProperty("atcon_conf",1);
                    }else{
                        temp.addProperty("atcon_conf",0);
                    }*/
            vuser = tipoDao.findUsuarioPerfil_jur_colas(idusuario);
            if (vuser != null) {
                temp.addProperty("jur_colas", 1);
            } else {
                temp.addProperty("jur_colas", 0);
            }
            /*vuser=tipoDao.findUsuarioPerfil_jur_conf(idusuario);
                    if(vuser!=null){
                        temp.addProperty("jur_conf",1);
                    }else{
                        temp.addProperty("jur_conf",0);
                    }*/
            vuser = tipoDao.findUsuarioPerfil_vyv_colas(idusuario);
            if (vuser != null) {
                temp.addProperty("vyv_colas", 1);
            } else {
                temp.addProperty("vyv_colas", 0);
            }
            /*vuser=tipoDao.findUsuarioPerfil_vyv_conf(idusuario);
                    if(vuser!=null){
                        temp.addProperty("vyv_conf",1);
                    }else{
                        temp.addProperty("vyv_conf",0);
                    }*/
            vuser = tipoDao.findUsuarioPerfil_sp_colas(idusuario);
            if (vuser != null) {
                temp.addProperty("sp_colas", 1);
            } else {
                temp.addProperty("sp_colas", 0);
            }
            /*vuser=tipoDao.findUsuarioPerfil_sp_conf(idusuario);
                    if(vuser!=null){
                        temp.addProperty("sp_conf",1);
                    }else{
                        temp.addProperty("sp_conf",0);
                    }*/
            vuser = tipoDao.findUsuarioPerfil_atcon_Rol(idusuario);
            if (vuser != null) {
                switch (vuser.getTipoUsuarioPerfilPK().getIdPerfilPuesto()) {
                    case 1:
                        temp.addProperty("atcon_rol", 1);
                        break;
                    case 2:
                        temp.addProperty("atcon_rol", 2);
                        break;
                    case 3:
                        temp.addProperty("atcon_rol", 3);
                        break;
                    case 29:
                        temp.addProperty("atcon_rol", 4);
                        break;
                }
            } else {
                temp.addProperty("atcon_rol", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_jur_Rol(idusuario);
            if (vuser != null) {
                switch (vuser.getTipoUsuarioPerfilPK().getIdPerfilPuesto()) {
                    case 12:
                        temp.addProperty("jur_rol", 1);
                        break;
                    case 13:
                        temp.addProperty("jur_rol", 2);
                        break;
                    case 14:
                        temp.addProperty("jur_rol", 3);
                        break;
                }
            } else {
                temp.addProperty("jur_rol", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_vyv_Rol(idusuario);
            if (vuser != null) {
                switch (vuser.getTipoUsuarioPerfilPK().getIdPerfilPuesto()) {
                    case 9:
                        temp.addProperty("vyv_rol", 1);
                        break;
                    case 10:
                        temp.addProperty("vyv_rol", 2);
                        break;
                    case 11:
                        temp.addProperty("vyv_rol", 3);
                        break;
                }
            } else {
                temp.addProperty("vyv_rol", 0);
            }
            vuser = tipoDao.findUsuarioPerfil_sp_Rol(idusuario);
            if (vuser != null) {
                switch (vuser.getTipoUsuarioPerfilPK().getIdPerfilPuesto()) {
                    case 6:
                        temp.addProperty("sp_rol", 1);
                        break;
                    case 7:
                        temp.addProperty("sp_rol", 2);
                        break;
                    case 8:
                        temp.addProperty("sp_rol", 3);
                        break;
                }
            } else {
                temp.addProperty("sp_rol", 0);
            }

            response.setCode(0L);
            response.setReason("OK");
            //response.setValue(temp.toString()+",");
            response.setValue(temp);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getUsuarioConfPPById(Integer idusuario, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            TipoUsuario_Conf ruser = tipoDao.findByIdUsuarioConf(idusuario);
            JsonObject temp = new JsonObject();
            CheckNull checknull = new CheckNull();
            temp.addProperty("id_usuario", ruser.getId_usuario());
            temp.addProperty("fecha_adicion", checknull.cknull(ruser.getFecha_adicion()));
            temp.addProperty("nombre", checknull.cknull(ruser.getNombre()));
            temp.addProperty("login", checknull.cknull(ruser.getLogin()));
            temp.addProperty("habilitado", checknull.cknull(ruser.getHabilitado()));
            temp.addProperty("email", checknull.cknull(ruser.getEmail()));
            temp.addProperty("dpi", checknull.cknull(ruser.getDpi()));
            temp.addProperty("telefono", checknull.cknull(ruser.getTelefono()));
            temp.addProperty("nit", checknull.cknull(ruser.getNit()));
            temp.addProperty("login", checknull.cknull(ruser.getLogin()));
            temp.addProperty("proveedor", checknull.cknull(ruser.getId_proveedor()));

            TipoUsuarioPerfil vuser = tipoDao.findUsuarioPP_Rol(idusuario);
            if (vuser != null) {
                if (vuser.getTipoUsuarioPerfilPK().getIdPerfilPuesto() == 4) {
                    temp.addProperty("pp_rol", 1);
                } else if (vuser.getTipoUsuarioPerfilPK().getIdPerfilPuesto() == 5) {
                    temp.addProperty("pp_rol", 3);
                }
            } else {
                temp.addProperty("pp_rol", 0);
            }

            response.setCode(0L);
            response.setReason("OK");
            //response.setValue(temp.toString()+",");
            response.setValue(temp);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs getUsuarioAsignaCola(Integer id_tipo_cola, Integer id_flujo, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findUsuarioAsignaCola(id_tipo_cola, id_flujo));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }
    //expiracion

    @Override
    public ResponseRs getConfiguracionGeneral(String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            List<TipoEmailFuente> vemail = tipoDao.findAllEmailFuente();
            JsonObject temp = new JsonObject();
            CheckNull checknull = new CheckNull();
            for (TipoEmailFuente loc_element : vemail) {
                switch (loc_element.getId_fuente()) {
                    case 1:
                        temp.addProperty("dias_conc_virt_int", loc_element.getVencer_en());
                        break;
                    case 2:
                        temp.addProperty("dias_verif_datos", loc_element.getVencer_en());
                        temp.addProperty("activo_verif_datos", loc_element.getActivo());
                        break;
                    case 3:
                        temp.addProperty("dias_conf_queja_fin", loc_element.getVencer_en());
                        temp.addProperty("activo_conf_resp_pp", loc_element.getActivo());
                        break;
                    case 5:
                        temp.addProperty("activo_notif_audiencia", loc_element.getActivo());
                        break;
                    case 6:
                        temp.addProperty("activo_notif_queja_sp", loc_element.getActivo());
                        break;
                    case 7:
                        temp.addProperty("activo_com_perm", loc_element.getActivo());
                        break;
                }
            }
            List<TipoExpiracion> vexp = tipoDao.findAllExpiracion();
            for (TipoExpiracion loc_element : vexp) {
                switch (loc_element.getId()) {
                    case 1:
                        temp.addProperty("expira_portal_proveedores", loc_element.getVence_en());
                        break;
                    case 2:
                        temp.addProperty("expira_atcon", loc_element.getVence_en());
                        break;
                    case 3:
                        temp.addProperty("expira_jur", loc_element.getVence_en());
                        break;
                    case 4:
                        temp.addProperty("expira_vyv", loc_element.getVence_en());
                        break;
                    case 5:
                        temp.addProperty("expira_sp", loc_element.getVence_en());
                        break;
                    case 6:
                        temp.addProperty("alerta_atcon", loc_element.getVence_en());
                        break;
                    case 7:
                        temp.addProperty("alerta_jur", loc_element.getVence_en());
                        break;
                    case 8:
                        temp.addProperty("alerta_vyv", loc_element.getVence_en());
                        break;
                    case 9:
                        temp.addProperty("alerta_sp", loc_element.getVence_en());
                        break;
                }
            }

            response.setCode(0L);
            response.setReason("OK");
            //response.setValue(temp.toString()+",");
            response.setValue(temp);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveConfiguracionGeneral(FormConfGeneral formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //guardar info usuario
            List<TipoEmailFuente> vemail = tipoDao.findAllEmailFuente();
            TipoEmailFuente single_element;
            for (TipoEmailFuente loc_element : vemail) {
                switch (loc_element.getId_fuente()) {
                    case 1:
                        single_element = tipoDao.findByIdEmailFuente(loc_element.getId_fuente());
                        single_element.setVencer_en(formulario.getDias_link_conc_virt());
                        tipoDao.saveEmailFuente(single_element);
                        break;
                    case 2:
                        single_element = tipoDao.findByIdEmailFuente(loc_element.getId_fuente());
                        single_element.setVencer_en(formulario.getDias_link_verif_datos());
                        single_element.setActivo(formulario.getCorreos_verif_datos());
                        tipoDao.saveEmailFuente(single_element);
                        break;
                    case 3:
                        single_element = tipoDao.findByIdEmailFuente(loc_element.getId_fuente());
                        single_element.setVencer_en(formulario.getDias_conf_queja_fin());
                        single_element.setActivo(formulario.getCorreos_conf_resp_pp());
                        tipoDao.saveEmailFuente(single_element);
                        break;
                    case 5:
                        single_element = tipoDao.findByIdEmailFuente(loc_element.getId_fuente());
                        single_element.setActivo(formulario.getCorreos_audiencias());
                        tipoDao.saveEmailFuente(single_element);
                        break;
                    case 6:
                        single_element = tipoDao.findByIdEmailFuente(loc_element.getId_fuente());
                        single_element.setActivo(formulario.getCorreos_archivar_sp());
                        tipoDao.saveEmailFuente(single_element);
                        break;
                    case 7:
                        single_element = tipoDao.findByIdEmailFuente(loc_element.getId_fuente());
                        single_element.setActivo(formulario.getCorreos_com_perm());
                        tipoDao.saveEmailFuente(single_element);
                        break;
                }
            }
            TipoExpiracion single_element2;
            List<TipoExpiracion> vexp = tipoDao.findAllExpiracion();
            for (TipoExpiracion loc_element : vexp) {
                switch (loc_element.getId()) {
                    case 1:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_expirar_pp());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 2:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_expirar_atcon());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 3:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_expirar_jur());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 4:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_expirar_vyv());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 5:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_expirar_sp());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 6:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_alerta_atcon());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 7:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_alerta_jur());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 8:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_alerta_vyv());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                    case 9:
                        single_element2 = tipoDao.findByIdExpiracion(loc_element.getId());
                        single_element2.setVence_en(formulario.getDias_alerta_sp());
                        tipoDao.saveExpiracion(single_element2);
                        break;
                }
            }

            response.setCode(0L);
            response.setReason("OK");
            //response.setValue(single_element2);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //catalogo puestos
    public ResponseRs getPuestos(String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findPuestoAll());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs updateDepartamento(int codigoDepartamento, String nombreDepartamento, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoDepartamento depto = this.tipoDao.findByIdDepartamento(codigoDepartamento);

            if (depto != null) {
                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                depto.setNombre_departamento(nombreDepartamento);
                depto.setHabilitado("1");
                this.tipoDao.saveDepartamento(depto);
                transaction.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    //portal links

    public ResponseRs getPortalLinks() {
        ResponseRs response = new ResponseRs();
        try {
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findPortalLinksAll());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //proveedor aprobar
    @Override
    public ResponseRs GetProveedorAprobar(String token, String estado) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            if (estado.equals("T")) {
                response.setValue(tipoDao.findAllProveedorAprobar());
            } else {
                response.setValue(tipoDao.findByEstadoProveedorAprobar(estado));
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs UpdProveedorAprobar(String token, Integer id, String estado, String razon, Integer usuario_operacion) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(token);
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoProveedorAprobar vproveedor = tipoDao.findByIdProveedorAprobar(id);
            vproveedor.setEstado(estado);
            if (!razon.equals("")) {
                vproveedor.setNota_rechazo(razon);
            }
            tipoDao.saveProveedorAprobar(vproveedor);

            //si el proveedor fue aprobar, buscar si ya existe por nit
            //si ya existe solo activarle conciliacion previa, si no existe crearlo y activarle conciliacion previa
            if (estado.equals("A")) {
                TipoProveedor vprov = tipoDao.findxNITProveedor(vproveedor.getNit());
                if (vprov != null) {
                    //prov ya existe solo se actualiza
                    vprov.setServicio_publico(false);
                    vprov.setHabilitado_conciliacion_previa("1");
                    vprov.setFecha_modificacion(new Date());
                    vprov.setFecha_registro_conciliacion_previa(new Date());
                    vprov.setUsuario_modifico(usuario_operacion.toString());
                    vprov.setHabilitado("1");
                    tipoDao.saveProveedor(vprov);
                } else {
                    //prov no existe se crea uno nuevo
                    vprov = new TipoProveedor();
                    vprov.setHabilitado_conciliacion_previa("1");
                    vprov.setCodigo_departamento(vproveedor.getDepartamento());
                    vprov.setCodigo_municipio(vproveedor.getMunicipio());
                    vprov.setDireccion(vproveedor.getDireccion());
                    vprov.setFecha_adicion(new Date());
                    vprov.setFecha_registro_conciliacion_previa(new Date());
                    vprov.setHabilitado("1");
                    vprov.setNit_proveedor(vproveedor.getNit());
                    vprov.setNombre(vproveedor.getNombre());
                    vprov.setUsuario_adiciono(usuario_operacion.toString());
                    //valores por default
                    if (vproveedor.getTipo_proveedor() != null) {
                        vprov.setTipo_proveedor(vproveedor.getTipo_proveedor());
                    } else {
                        vprov.setTipo_proveedor(6); //individual
                    }
                    if (vproveedor.getId_actividad_economica() != null) {
                        vprov.setId_actividad_economica(vproveedor.getId_actividad_economica());
                    } else {
                        vprov.setId_actividad_economica(1); //default
                    }
                    if (vproveedor.getId_tipo_comercio() != null) {
                        vprov.setId_tipo_comercio(vproveedor.getId_tipo_comercio());
                    } else {
                        vprov.setId_tipo_comercio(1); //default
                    }
                    if (vproveedor.getRazon_social() != null) {
                        vprov.setRazon_social(vproveedor.getRazon_social());
                    }
                    Integer nextv = tipoDao.ProveedorSPnextID();
                    System.out.println("***" + nextv + "***");
                    vprov.setId_proveedor(nextv);
                    tipoDao.saveProveedor(vprov);
                    response.setValue(vprov);
                    //actualizar email
                    if (vproveedor.getCorreo() != null && !vproveedor.getCorreo().trim().equals("")) {
                        TipoEmail vemail = new TipoEmail();
                        vemail.setCorreo_electronico(vproveedor.getCorreo());
                        vemail.setFecha_adicion(new Date());
                        vemail.setId_proveedor(vprov.getId_proveedor());
                        vemail.setUsuario_adiciono(usuario_operacion);
                        tipoDao.saveEmail(vemail);
                    }
                    //actualizar telefono
                    if (vproveedor.getTelefono() != null && !vproveedor.getTelefono().trim().equals("")) {
                        TipoTelefono vtelefono = new TipoTelefono();
                        vtelefono.setFecha_adicion(new Date());
                        vtelefono.setId_proveedor(vprov.getId_proveedor());
                        vtelefono.setTelefono(vproveedor.getTelefono());
                        vtelefono.setTipo_telefono(3);
                        vtelefono.setUsuario_adiciono(usuario_operacion);
                        tipoDao.saveTelefono(vtelefono);
                    }
                }

            }
            //revisar si correo esta activo en parametros de sistema
            TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_PROVEEDOR_APROBADO);
            if (efuente != null) {
                if (efuente.getActivo() == 1) {
                    //correo a proveedor con su qr
                    String cuerpo = "Estimado Proveedor, su solicitud de registro a proveedores de DIACO ha sido aprovada.<br>"
                            + "Adjunto a este correo hay un link para ver los detalles:<br>"
                            + "<a href='" + efuente.getDireccion() + "/" + vproveedor.getNit() + "'>Detalles Confirmaci&oacute;n</a>";
                    String[] mailstring = GetEmailStringUsuario(vproveedor.getCorreo_notif());
                    saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_PROVEEDOR_APROBADO, cuerpo);
                }
            }
            response.setCode(0L);
            response.setReason("OK");
            //response.setValue(single_element2);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs ProveedorAprobarxNitProv(String nit) {
        ResponseRs response = new ResponseRs();
        try {
            //tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findProveedorAprobarxNitProv(nit));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //resultado audiencia
    @Override
    public ResponseRs GetAllResAudiencia(Integer id_queja, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllResAudiencia(id_queja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs GetResAudiencia(Integer id, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdResAudiencia(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveResAudiencia(FormResAudiencia formResAudiencia) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formResAudiencia.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formResAudiencia.getId_queja());
            if (vTipoQueja.getId_estado_queja() < 204) {
                vTipoQueja.setId_estado_queja(204);
            }
            tipoDao.saveQueja(vTipoQueja);
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formResAudiencia.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(Constants.REG_DIACO_DPTOINTERNO_JURIDICO);
            newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            newTipoPasoQueja.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
            newTipoPasoQueja.setUsuario_operacion(formResAudiencia.getUsuario_modifico());
            newTipoPasoQueja.setOperacion("I");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);
            Date loc_date;
            TipoResAudiencia nResAudiencia = new TipoResAudiencia();
            if (formResAudiencia.getCcitacion() != null) {
                nResAudiencia.setCcitacion(formResAudiencia.getCcitacion());
            } else {
                nResAudiencia.setCcitacion("");
            }
            //System.out.println("*+"+formResAudiencia.getFechanotificacion()+"+*");
            if (formResAudiencia.getFechanotificacion() != null) {
                loc_date = StrtoDate(formResAudiencia.getFechanotificacion(), "");
                nResAudiencia.setFechanotificacion(loc_date);
            } else {
                nResAudiencia.setFechanotificacion(null);
            }
            nResAudiencia.setFecha_actualizado(new Date());
            /*loc_date = StrtoDate(formResAudiencia.getFecha(), formResAudiencia.getHora());
            nResAudiencia.setFechahora(loc_date);*/
            nResAudiencia.setTipopasoqueja(newTipoPasoQueja);
            nResAudiencia.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
            nResAudiencia.setTipo(formResAudiencia.getTipo());
            nResAudiencia.setUsuario_actualizado(formResAudiencia.getUsuario_modifico());

            /*      if (formResAudiencia.getTipo() == 19) {
                nResAudiencia.setCorr_acta(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_RESOLUCION_APERTURA_PRUEBA));
                nResAudiencia.setCorr_notif_cons(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_RESOLUCION_APERTURA_PRUEBA));
                nResAudiencia.setCorr_notif_prov(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_RESOLUCION_APERTURA_PRUEBA));
            } else if (formResAudiencia.getTipo() == 24) {
                nResAudiencia.setCorr_acta(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA));
                nResAudiencia.setCorr_notif_cons(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA));
                nResAudiencia.setCorr_notif_prov(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_DECLARACION_REBELDIA));
            }*/
            String correlativo = getNextCorrelativoRegistroResultAudiencia();

            String corrArr[] = correlativo.split("-");
            int corrInt = (corrArr.length >= 1 ? Integer.parseInt(corrArr[1]) : 0);
            nResAudiencia.setCorr_acta(corrInt);
            nResAudiencia.setCorr_notif_cons(corrInt);
            nResAudiencia.setCorr_notif_prov(corrInt);

            tipoDao.saveResAudiencia(nResAudiencia);
            response.setValue(nResAudiencia);

            //tipo si es apertura de prueba llamar a func de save reg, tipo 19
            if (formResAudiencia.getTipo() == 19) {
                TipoReg_ResolucionAperturaAPrueba vTipoReg_ResolucionAperturaAPrueba = saveReg_ResAperturaPrueba(vTipoQueja, nResAudiencia, correlativo);
            } else if (formResAudiencia.getTipo() == 24) // si es declaracion de rebeldia , reg tipo 24
            {
                saveReg_ResDeclaracionRebeldia(vTipoQueja, nResAudiencia, correlativo);
            }

            //guarda las NOTIFICACIONES DIACO-AS-FO-04
            CedulaNotificacionDto vCedulaNotificacionDto = new CedulaNotificacionDto();
            //consumidor
            vCedulaNotificacionDto.setEsCP("C");
            vCedulaNotificacionDto.setEsResultadoResolucion("resultadoAudiencia");
            vCedulaNotificacionDto.setIdQueja(formResAudiencia.getId_queja());
            vCedulaNotificacionDto.setUsuario(formResAudiencia.getUsuario_modifico());
            vCedulaNotificacionDto.setIdResultadoResolucion(nResAudiencia.getId());
            vCedulaNotificacionDto.setCorrelativo(correlativo);
            save_Reg_CedulaNotificacionResJuridico(vCedulaNotificacionDto);
            //proveedor
            vCedulaNotificacionDto.setEsCP("P");
            save_Reg_CedulaNotificacionResJuridico(vCedulaNotificacionDto);

            /*  nResAudiencia.setId_acta(vTipoReg_ResolucionAperturaAPrueba.getId());
            tipoDao.saveResAudiencia(nResAudiencia);*/
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(nResAudiencia);
            //flujo guia
            saveTiposFlujoGuia(formResAudiencia.getId_queja(), 10); //resultado de audiencia

            //revisar el tipo de resultado de audiencia que se inserto
            TipoCatalogo vcatalogo = tipoDao.findTipoCatalogo(formResAudiencia.getTipo());
            String strtipo = "";
            if (vcatalogo != null) {
                strtipo = vcatalogo.getDescripcion_catalogo();
            }
            //bitacora automatica
            String txtmensaje = "Se agreg?? un elemento en Resultado Audiencia";
            if (!strtipo.equals("")) {
                txtmensaje = txtmensaje + " de tipo: " + strtipo;
            }
            txtmensaje = txtmensaje + ", con correlativo: " + corrInt;
            BitacoraAutomatica(formResAudiencia.getId_queja(), 2, formResAudiencia.getUsuario_modifico(), txtmensaje, txtmensaje, Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs updResAudiencia(FormResAudiencia formResAudiencia) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formResAudiencia.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formResAudiencia.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formResAudiencia.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(Constants.REG_DIACO_DPTOINTERNO_JURIDICO);
            newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            newTipoPasoQueja.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
            newTipoPasoQueja.setUsuario_operacion(formResAudiencia.getUsuario_modifico());
            newTipoPasoQueja.setOperacion("U");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);
            Date loc_date;
            TipoResAudiencia nResAudiencia = tipoDao.findByIdResAudiencia(formResAudiencia.getId());
            if (formResAudiencia.getCcitacion() != null) {
                nResAudiencia.setCcitacion(formResAudiencia.getCcitacion());
            } else {
                nResAudiencia.setCcitacion("");
            }
            if (formResAudiencia.getFechanotificacion() != null) {
                loc_date = StrtoDate(formResAudiencia.getFechanotificacion(), "");
                nResAudiencia.setFechanotificacion(loc_date);
            } else {
                nResAudiencia.setFechanotificacion(null);
            }
            nResAudiencia.setFecha_actualizado(new Date());
            /*loc_date = StrtoDate(formResAudiencia.getFecha(), formResAudiencia.getHora());
            nResAudiencia.setFechahora(loc_date);*/
            nResAudiencia.setTipopasoqueja(newTipoPasoQueja);
            nResAudiencia.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
            nResAudiencia.setTipo(formResAudiencia.getTipo());
            nResAudiencia.setUsuario_actualizado(formResAudiencia.getUsuario_modifico());
            tipoDao.saveResAudiencia(nResAudiencia);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(nResAudiencia);
            //bitacora automatica
            /*String txtmensaje = "Se edit?? un elemento en Resultado Audiencia para esta queja.";
            BitacoraAutomatica(formResAudiencia.getId_queja(), 2, formResAudiencia.getUsuario_modifico(), txtmensaje, txtmensaje, Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
             */
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs delResAudiencia(FormResAudiencia formResAudiencia) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formResAudiencia.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formResAudiencia.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formResAudiencia.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(Constants.REG_DIACO_DPTOINTERNO_JURIDICO);
            newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            newTipoPasoQueja.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
            newTipoPasoQueja.setUsuario_operacion(formResAudiencia.getUsuario_modifico());
            newTipoPasoQueja.setOperacion("D");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);

            TipoResAudiencia vResAudiencia = tipoDao.findByIdResAudiencia(formResAudiencia.getId());

            if (vResAudiencia != null) {

                //delete de los registros relacionados a la audiencia
                TipoReg_DeclaracionRebeldia vTipoReg_DeclaracionRebeldia = tipoDao.findByResDeclaracionRebeldia(vResAudiencia.getId());
                if (vTipoReg_DeclaracionRebeldia != null) {
                    tipoDao.deleteRegRebeldia(vTipoReg_DeclaracionRebeldia);
                }

                TipoReg_ResolucionAperturaAPrueba vTipoReg_ResolucionAperturaAPrueba = tipoDao.findByResAperturaPruebaIdResAudiencia(vResAudiencia.getId());
                if (vTipoReg_ResolucionAperturaAPrueba != null) {
                    tipoDao.deleteRegAperturaPrueba(vTipoReg_ResolucionAperturaAPrueba);
                }

                CedulaNotificacionDto vCedulaNotificacionDto = new CedulaNotificacionDto();
                vCedulaNotificacionDto.setIdQueja(vTipoQueja.getId_queja());
                vCedulaNotificacionDto.setEsResultadoResolucion("resultadoAudiencia");
                List<TipoReg_CedulaNotificacionResJuridico> vTipoReg_CedulaNotificacionResJuridico = tipoDao.findAllTipoReg_CedulaNotiResJuridicoByIdResQueja(vCedulaNotificacionDto);
                for (TipoReg_CedulaNotificacionResJuridico objReg_CedulaNotificacionResJuridico : vTipoReg_CedulaNotificacionResJuridico) {
                    tipoDao.deleteCedulaNotificacionResJuridico(objReg_CedulaNotificacionResJuridico);
                }

                tipoDao.deleteResAudiencia(vResAudiencia);
                response.setCode(0L);
                response.setReason("OK");
                response.setValue(vResAudiencia);
                //bitacora automatica
                /*String txtmensaje = "Se elimin?? un elemento en Resultado Audiencia para esta queja.";
                BitacoraAutomatica(formResAudiencia.getId_queja(), 2, formResAudiencia.getUsuario_modifico(), txtmensaje, txtmensaje, Constants.REG_TIPO_JURIDICO_RESULTADO_AUDIENCIA);
                 */
            } else {
                response.setCode(1L);
                response.setReason("NOT FOUND");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs saveDepartamento(String nombreDepartamento, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();

        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoDepartamento tipoDepartamento = new TipoDepartamento();

            int max = (Integer) tipoDao.findNextIdTiposDepartamento();
            max = max + 1;
            System.out.println("last " + max);
            tipoDepartamento.setCodigo_departamento(max);
            tipoDepartamento.setNombre_departamento(nombreDepartamento);
            tipoDepartamento.setHabilitado("1");

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveDepartamento(tipoDepartamento);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        return response;
    }

    public ResponseRs deleteDepartamento(int codigoDepartamento, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            TipoDepartamento depto = this.tipoDao.findByIdDepartamento(codigoDepartamento);
            depto.setHabilitado("0");
            if (depto != null) {
                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                this.tipoDao.saveDepartamento(depto);
                transaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }
    //Departamento interno     

    public ResponseRs listDeptoInterno(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTiposDepartamentoInterno());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveDepartamentoInterno(String nombreDepartamento, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();

        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoDepartamentoInterno tipoDepartamentoInterno = new TipoDepartamentoInterno();
            int max = (Integer) tipoDao.findNextIdTiposDepartamentoInterno();
            max = max + 1;
            System.out.println("last " + max);
            tipoDepartamentoInterno.setId_departamento_interno(max);
            tipoDepartamentoInterno.setNombre(nombreDepartamento);
            tipoDepartamentoInterno.setFecha_adicion(new Date());
            tipoDepartamentoInterno.setUsuario_adiciono(1);
            tipoDepartamentoInterno.setHabilitado("1");
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveDepartamentoInterno(tipoDepartamentoInterno);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        return response;
    }

    public ResponseRs updateDepartamentoInterno(int codigoDepartamento, String nombreDepartamento, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoDepartamentoInterno depto = this.tipoDao.findByIdDepartamentoInterno(codigoDepartamento);

            if (depto != null) {
                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                depto.setNombre(nombreDepartamento);
                depto.setFecha_adicion(new Date());
                depto.setUsuario_adiciono(1);
                depto.setHabilitado("1");
                this.tipoDao.saveDepartamentoInterno(depto);
                transaction.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs deleteDepartamentoInterno(int codigoDepartamento, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            TipoDepartamentoInterno depto = this.tipoDao.findByIdDepartamentoInterno(codigoDepartamento);
            depto.setHabilitado("0");
            if (depto != null) {
                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                this.tipoDao.saveDepartamentoInterno(depto);
                transaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs saveMunicipio(int codigoDepto, String token, String nombreMunicipio, String usuario) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoMunicipio tipoMunicipio = new TipoMunicipio();
            TipoDepartamento tipoDepartamento = tipoDao.findByIdDepartamento(codigoDepto);

            tipoMunicipio.setCodigo_departamento(codigoDepto);
            tipoMunicipio.setHabilitado("1");
            tipoMunicipio.setNombre_municipio(nombreMunicipio);
            tipoMunicipio.setTipotipoDpto(tipoDepartamento);
            tipoMunicipio.setUsuario_adiciono(usuario);
            tipoMunicipio.setUsuario_modifico(usuario);
            tipoMunicipio.setFecha_modificacion(new Date());
            tipoMunicipio.setFecha_adicion(new Date());

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveMunicipio(tipoMunicipio);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs updateMunicipio(int codigoDepto, String token, int codigoMunicipio, String nombreMunicipio, String usuario) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoMunicipio tipoMunicipio = tipoDao.findByIdMunicipio(codigoMunicipio);

            TipoDepartamento tipoDepartamento = tipoDao.findByIdDepartamento(codigoDepto);

            if (tipoDepartamento != null) {
                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                tipoMunicipio.setCodigo_departamento(codigoDepto);
                tipoMunicipio.setCodigo_municipio(codigoMunicipio);
                tipoMunicipio.setNombre_municipio(nombreMunicipio);
                tipoMunicipio.setHabilitado("1");
                tipoMunicipio.setUsuario_modifico(usuario);
                tipoMunicipio.setFecha_modificacion(new Date());

                tipoMunicipio.setTipotipoDpto(tipoDepartamento);
                this.tipoDao.saveMunicipio(tipoMunicipio);
                transaction.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs deleteMunicipio(int codigoMunicipio, String token, String usuario) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            TipoMunicipio muni = this.tipoDao.findByIdMunicipio(codigoMunicipio);

            if (muni != null) {
                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                muni.setHabilitado("0");
                muni.setUsuario_modifico(usuario);
                muni.setFecha_modificacion(new Date());
                this.tipoDao.saveMunicipio(muni);
                transaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs savePais(String nombrePais, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoPais tipoPais = new TipoPais();
            tipoPais.setNombre_pais(nombrePais);
            tipoPais.setFecha_adicion(new Date());
            tipoPais.setFecha_modificacion(new Date());
            tipoPais.setHabilitado("1");
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.savePais(tipoPais);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs updatePais(Integer idPais, String nombrePais, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoPais tipoPais = tipoDao.findByIdPais(idPais);
            if (tipoPais != null) {
                tipoPais.setNombre_pais(nombrePais);
                tipoPais.setFecha_modificacion(new Date());
                tipoPais.setHabilitado("1");
                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                tipoDao.savePais(tipoPais);
                transaction.commit();
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs deletePais(Integer idPais, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoPais tipoPais = tipoDao.findByIdPais(idPais);
            if (tipoPais != null) {
                tipoPais.setFecha_modificacion(new Date());
                tipoPais.setHabilitado("0");

                tipoDao.TokenCheck(token);
                response.setCode(0L);
                response.setReason("OK");
                tipoDao.savePais(tipoPais);
                transaction.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs listPaises(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllPaises());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveSede(String nombreSede, Integer codigoMunicipio,
            String direccionAvenida, String direccionCalle, String direccionZona, String direccionDetalle, String avenidaOCalle, String usuario, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoSede tipoSede = new TipoSede();
            tipoSede.setNombre_sede(nombreSede);
            tipoSede.setDireccion_avenida(direccionAvenida);
            tipoSede.setDireccion_calle(direccionCalle);
            tipoSede.setDireccion_detalle(direccionDetalle);
            tipoSede.setDireccion_zona(direccionZona);
            tipoSede.setCodigo_municipio(codigoMunicipio);
            tipoSede.setFecha_adicion(new Date());
            tipoSede.setUsuario_adiciono(usuario);
            tipoSede.setFecha_modificacion(new Date());
            tipoSede.setUsuario_modifico(usuario);
            tipoSede.setHabilitado("A");
            String direccionCompleta = "";

            direccionCompleta = direccionAvenida + " " + avenidaOCalle + " " + direccionCalle + " zona " + direccionZona + " " + direccionDetalle;

            tipoSede.setDireccion_sede(direccionCompleta);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveSede(tipoSede);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;

    }

    public ResponseRs updateSede(Integer idSede, String nombreSede, Integer codigoMunicipio,
            String direccionAvenida, String direccionCalle, String direccionZona,
            String direccionDetalle, String avenidaOCalle, String usuario, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            TipoSede tipoSede = tipoDao.findByIdSede(idSede);

            tipoSede.setNombre_sede(nombreSede);
            tipoSede.setDireccion_avenida(direccionAvenida);
            tipoSede.setDireccion_calle(direccionCalle);
            tipoSede.setDireccion_detalle(direccionDetalle);
            tipoSede.setDireccion_zona(direccionZona);
            tipoSede.setCodigo_municipio(codigoMunicipio);

            tipoSede.setFecha_modificacion(new Date());
            tipoSede.setUsuario_modifico(usuario);
            tipoSede.setHabilitado("A");

            String direccionCompleta = "";
            direccionCompleta = direccionAvenida + " " + avenidaOCalle + " " + direccionCalle + " zona " + direccionZona + " " + direccionDetalle;

            tipoSede.setDireccion_sede(direccionCompleta);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveSede(tipoSede);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;

    }

    public ResponseRs deleteSede(Integer idSede, String usuario, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            TipoSede tipoSede = tipoDao.findByIdSede(idSede);
            if (idSede != 1) {
                tipoSede.setHabilitado("N");
            }

            tipoSede.setUsuario_modifico(usuario);
            tipoSede.setFecha_modificacion(new Date());
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveSede(tipoSede);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;

    }

    public ResponseRs listDiaInhabil(String token, Integer id_departamento) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoDiaInhabil(id_departamento));

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveDiaInhabil(String token, Integer id_departamento, Integer dia, Integer mes, String descripcion, String usuario) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoDiaInhabil diaIn = new TipoDiaInhabil();
            diaIn.setDescripcion(descripcion);
            diaIn.setDia(dia);
            diaIn.setMes(mes);
            diaIn.setFecha_adicion(new Date());
            diaIn.setFecha_modifico(new Date());
            diaIn.setHabilitado("1");
            diaIn.setUsuario_adiciono(usuario);
            diaIn.setUsuario_modifico(usuario);
            diaIn.setId_departamento(id_departamento);
            tipoDao.TokenCheck(token);

            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveDiaInhabil(diaIn);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs updateDiaInhabil(Integer id_dia_inhabil, String token, Integer id_departamento, Integer dia, Integer mes, String descripcion, String usuario) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            TipoDiaInhabil diaIn = tipoDao.findByIdDiaInhabil(id_dia_inhabil);
            diaIn.setDescripcion(descripcion);
            diaIn.setFecha_modifico(new Date());
            diaIn.setUsuario_modifico(usuario);
            diaIn.setMes(mes);
            diaIn.setDia(dia);
            diaIn.setHabilitado("1");
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");

            tipoDao.saveDiaInhabil(diaIn);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs deleteDiaInhabil(String token, Integer id_dia_inhabil, String usuario) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoDiaInhabil diaIn = tipoDao.findByIdDiaInhabil(id_dia_inhabil);

            diaIn.setHabilitado("0");
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveDiaInhabil(diaIn);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs getListMotivoQueja(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllMotivoQueja());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveMotivoQueja(String motivo, String usuario, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoMotivoQueja motivoQueja = new TipoMotivoQueja();
            motivoQueja.setMotivo(motivo);
            motivoQueja.setHabilitado("1");
            motivoQueja.setFecha_adicion(new Date());
            motivoQueja.setFecha_modificacion(new Date());
            motivoQueja.setUsuario_adiciono(usuario);
            motivoQueja.setUsuario_modifico(usuario);
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveMotivoQueja(motivoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs updateMotivoQueja(Integer idMotivoQueja, String motivo, String usuario, String operacion, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoMotivoQueja motivoQueja = tipoDao.findMotivoQueja(idMotivoQueja);
            if ("UPDATE".equals(operacion)) {
                motivoQueja.setMotivo(motivo);
                motivoQueja.setHabilitado("1");
            } else if ("DELETE".equals(operacion)) {
                motivoQueja.setHabilitado("0");
            }
            motivoQueja.setFecha_modificacion(new Date());
            motivoQueja.setUsuario_modifico(usuario);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveMotivoQueja(motivoQueja);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs getMunicipio(Integer codigoMunicipio, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdMunicipio(codigoMunicipio));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs getDepartamento(Integer codigoDepartamento, String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdDepartamento(codigoDepartamento));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveCatProveedor(
            FormProveedor p) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoProveedor prov = new TipoProveedor();
            // int max = (Integer)tipoDao.findNextIdTipoProveedor();
            //max= max+1;
            //prov.setId_proveedor(max);
            //System.out.println("el codigo departamento es "+p.getCodigo_departamento());
            prov.setNombre(p.getNombre());
            prov.setNit_proveedor(p.getNit_proveedor());
            prov.setCodigo_departamento(p.getCodigo_departamento());
            prov.setCodigo_municipio(p.getCodigo_municipio());
            prov.setPrimer_nombre(p.getPrimer_nombre());
            prov.setSegundo_nombre(p.getSegundo_nombre());
            prov.setTercer_nombre(p.getTercer_nombre());
            prov.setPrimer_apellido(p.getPrimer_apellido());
            prov.setSegundo_apellido(p.getSegundo_apellido());
            prov.setApellido_casada(p.getApellido_casada());
            prov.setDireccion(p.getDireccion());
            prov.setDireccion_zona(p.getDireccion_zona());
            prov.setFecha_modificacion(new Date());
            prov.setFecha_adicion(new Date());
            prov.setUsuario_adiciono(p.getUsuario());
            prov.setUsuario_modifico(p.getUsuario());
            prov.setNombre_empresa(p.getNombre_empresa());
            prov.setRazon_social(p.getRazon_social());
            prov.setHabilitado("1");
            prov.setTelefono(p.getTelefono());
            prov.setTipo_proveedor(p.getTipo_proveedor());

            prov.setEmail(p.getEmail());
            prov.setPermite_calificacion(p.isPermite_calificacion());
            prov.setHabilitado_conciliacion_previa("1");
            prov.setFecha_registro_conciliacion_previa(new Date());
            prov.setId_actividad_economica(p.getId_actividad_economica());
            prov.setId_tipo_comercio(p.getId_tipo_comercio());
            prov.setHabilitado_notificacion_electronica(p.getHabilitado_notificacion_electronica());
            prov.setHabilitado_conciliacion_previa(p.getHabilitado_conciliacion_previa());
            prov.setServicio_publico(p.isServicio_publico());

            tipoDao.TokenCheck(p.getToken());
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveProveedor(prov);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        return response;
    }

    public ResponseRs updateCatProveedor(FormProveedor p) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoProveedor prov = tipoDao.findByIdProveedor(p.getId_proveedor());

            prov.setNombre(p.getNombre());
            prov.setNit_proveedor(p.getNit_proveedor());
            prov.setCodigo_departamento(p.getCodigo_departamento());
            prov.setCodigo_municipio(p.getCodigo_municipio());
            prov.setPrimer_nombre(p.getPrimer_nombre());
            prov.setSegundo_nombre(p.getSegundo_nombre());
            prov.setTercer_nombre(p.getTercer_nombre());
            prov.setPrimer_apellido(p.getPrimer_apellido());
            prov.setSegundo_apellido(p.getSegundo_apellido());
            prov.setApellido_casada(p.getApellido_casada());
            prov.setDireccion(p.getDireccion());
            prov.setDireccion_zona(p.getDireccion_zona());
            prov.setFecha_modificacion(new Date());
            prov.setFecha_adicion(new Date());
            prov.setUsuario_adiciono(p.getUsuario());
            prov.setUsuario_modifico(p.getUsuario());
            prov.setNombre_empresa(p.getNombre_empresa());
            prov.setRazon_social(p.getRazon_social());
            prov.setHabilitado("1");
            prov.setTelefono(p.getTelefono());
            prov.setTipo_proveedor(p.getTipo_proveedor());

            prov.setEmail(p.getEmail());
            prov.setPermite_calificacion(p.isPermite_calificacion());
            prov.setHabilitado_conciliacion_previa("1");
            prov.setFecha_registro_conciliacion_previa(new Date());
            prov.setId_actividad_economica(p.getId_actividad_economica());
            prov.setId_tipo_comercio(p.getId_tipo_comercio());
            prov.setHabilitado_notificacion_electronica(p.getHabilitado_notificacion_electronica());
            prov.setHabilitado_conciliacion_previa(p.getHabilitado_conciliacion_previa());
            prov.setServicio_publico(p.isServicio_publico());

            tipoDao.TokenCheck(p.getToken());
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveProveedor(prov);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        return response;
    }

    public ResponseRs deleteCatProveedor(Integer id, String usuario, String token) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoProveedor prov = tipoDao.findByIdProveedor(id);
            prov.setHabilitado("0");
            prov.setUsuario_modifico(usuario);
            prov.setFecha_modificacion(new Date());
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveProveedor(prov);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs listTiposProveedorComun(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllProveedorComun());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs listTiposActividadEconomica(String token) {

        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllActividadEconomica());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;

    }

    public ResponseRs listTipoComercio(Integer idActividadEconomica, String token) {

        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoComercio(idActividadEconomica));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;

    }

    public ResponseRs findProveedorByNit(String nit, String token) {
        ResponseRs response = new ResponseRs();
        try {
            List<FormProveedor> provListF = new ArrayList<FormProveedor>();
            FormProveedor provForm = new FormProveedor();
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            TipoProveedor prov = tipoDao.findProveeorByNit(nit);
            provForm.setId_proveedor(prov.getId_proveedor());
            provForm.setNombre(prov.getNombre());
            provForm.setCodigo_municipio(prov.getCodigo_municipio());
            provForm.setCodigo_departamento(prov.getCodigo_departamento());
            provForm.setId_actividad_economica(prov.getId_actividad_economica());
            provForm.setId_tipo_comercio(prov.getId_tipo_comercio());
            provForm.setNit_proveedor(prov.getNit_proveedor());
            provForm.setPrimer_nombre(prov.getPrimer_nombre());
            provForm.setPrimer_apellido(prov.getPrimer_apellido());

            if (prov.getSegundo_nombre() != null) {
                provForm.setSegundo_nombre(prov.getSegundo_nombre());
            } else {
                provForm.setSegundo_nombre(" ");
            }
            if (prov.getTercer_nombre() != null) {
                provForm.setTercer_nombre(prov.getTercer_nombre());
            } else {
                provForm.setTercer_nombre(" ");
            }
            if (prov.getSegundo_apellido() != null) {

                provForm.setSegundo_apellido(prov.getSegundo_apellido());
            } else {

                provForm.setSegundo_apellido(" ");
            }

            if (prov.getApellido_casada() != null) {

                provForm.setApellido_casada(prov.getApellido_casada());

            } else {

                provForm.setApellido_casada(" ");
            }
            provForm.setNombre_empresa(prov.getNombre_empresa());
            provForm.setRazon_social(prov.getRazon_social());
            provForm.setDireccion(prov.getDireccion());
            provForm.setCallecilla(provForm.getCallecilla());
            provForm.setDireccion_avenida(prov.getDireccion_avenida());
            provForm.setDireccion_calle(prov.getDireccion_calle());
            provForm.setDireccion_detalle(prov.getDireccion_detalle());
            provForm.setDireccion_zona(prov.getDireccion_zona());
            provForm.setEmail(prov.getEmail());
            provForm.setHabilitado(prov.getHabilitado());
            provForm.setHabilitado_conciliacion_previa(prov.getHabilitado_conciliacion_previa());
            provForm.setHabilitado_notificacion_electronica(prov.getHabilitado_notificacion_electronica());

            provForm.setPermite_calificacion(prov.isPermite_calificacion());
            provForm.setServicio_publico(prov.isServicio_publico());
            provForm.setTelefono(prov.getTelefono());
            TipoDepartamento depto = tipoDao.findByIdDepartamento(prov.getCodigo_departamento());
            provForm.setNombre_departamento(depto.getNombre_departamento());
            TipoMunicipio muni = tipoDao.findByIdMunicipio(prov.getCodigo_municipio());
            provForm.setNombre_municipio(muni.getNombre_municipio());
            TipoActividadEconomica actividad = tipoDao.findByIdActividadEconomica(prov.getId_actividad_economica());
            provForm.setNombre_actividad_economica(actividad.getNombre_actividad_economica());
            TipoComercio comercio = tipoDao.findByIdTipoComercio(prov.getId_tipo_comercio());
            provForm.setTipo_comercio(comercio.getTipo_comercio());
            provForm.setTipo_proveedor(prov.getTipo_proveedor());
            provListF.add(provForm);
            response.setValue(provListF);

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs findProveedorById(Integer idProveedor, String token) {
        ResponseRs response = new ResponseRs();
        try {

            List<FormProveedor> provListF = new ArrayList<FormProveedor>();
            FormProveedor provForm = new FormProveedor();
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            TipoProveedor prov = tipoDao.findByIdProveedor(idProveedor);

            provForm.setId_proveedor(prov.getId_proveedor());
            provForm.setNombre(prov.getNombre());
            provForm.setCodigo_municipio(prov.getCodigo_municipio());
            provForm.setCodigo_departamento(prov.getCodigo_departamento());
            provForm.setId_actividad_economica(prov.getId_actividad_economica());
            provForm.setId_tipo_comercio(prov.getId_tipo_comercio());
            provForm.setNit_proveedor(prov.getNit_proveedor());
            provForm.setPrimer_nombre(prov.getPrimer_nombre());
            provForm.setSegundo_nombre(prov.getSegundo_nombre());
            provForm.setTercer_nombre(prov.getTercer_nombre());
            provForm.setPrimer_apellido(prov.getPrimer_apellido());
            provForm.setSegundo_apellido(prov.getSegundo_apellido());
            provForm.setApellido_casada(prov.getApellido_casada());
            provForm.setNombre_empresa(prov.getNombre_empresa());
            provForm.setRazon_social(prov.getRazon_social());
            provForm.setDireccion(prov.getDireccion());
            provForm.setDireccion_avenida(prov.getDireccion_avenida());
            provForm.setDireccion_calle(prov.getDireccion_calle());
            provForm.setDireccion_detalle(prov.getDireccion_detalle());
            provForm.setDireccion_zona(prov.getDireccion_zona());
            provForm.setEmail(prov.getEmail());
            provForm.setHabilitado(prov.getHabilitado());
            provForm.setHabilitado_conciliacion_previa(prov.getHabilitado_conciliacion_previa());
            provForm.setHabilitado_notificacion_electronica(prov.getHabilitado_notificacion_electronica());

            provForm.setPermite_calificacion(prov.isPermite_calificacion());
            provForm.setServicio_publico(prov.isServicio_publico());
            provForm.setTelefono(prov.getTelefono());
            TipoDepartamento depto = tipoDao.findByIdDepartamento(prov.getCodigo_departamento());
            provForm.setNombre_departamento(depto.getNombre_departamento());
            TipoMunicipio muni = tipoDao.findByIdMunicipio(prov.getCodigo_municipio());
            provForm.setNombre_municipio(muni.getNombre_municipio());
            TipoActividadEconomica actividad = tipoDao.findByIdActividadEconomica(prov.getId_actividad_economica());
            provForm.setNombre_actividad_economica(actividad.getNombre_actividad_economica());
            TipoComercio comercio = tipoDao.findByIdTipoComercio(prov.getId_tipo_comercio());
            provForm.setTipo_comercio(comercio.getTipo_comercio());
            provForm.setTipo_proveedor(prov.getTipo_proveedor());
            provListF.add(provForm);
            response.setValue(provListF);

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveConsumidor(FormConsumidor f) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoConsumidor cons = new TipoConsumidor();

            // int max =(Integer)tipoDao.findNextIdTipoConsumidor();
            // max= max+1;
            // cons.setId_consumidor(max);
            cons.setNombre1(f.getNombre1());
            cons.setNombre2(f.getNombre2());
            cons.setNombre3(f.getNombre3());
            cons.setApellido1(f.getApellido1());
            cons.setApellido2(f.getApellido2());
            cons.setApellido_casada(f.getApellido_casada());

            cons.setDireccion_zona(f.getDireccion_zona());

            cons.setDireccion(f.getDireccion());
            if (f.getNacionalidad() == 1) {
                cons.setId_pais(1);
            } else {
                cons.setId_pais(f.getId_pais());
            }
            cons.setDocumento_identificacion(f.getDocumento_identificacion());
            cons.setNit_consumidor(f.getNit_consumidor());
            cons.setGenero(f.getGenero());

            cons.setHabilitado_notificacion_electronica(f.getHabilitado_notificacion_electronica());
            cons.setTipo_consumidor(f.getTipo_consumidor());
            cons.setTipo_documento(f.getTipo_documento());
            cons.setId_etnia(f.getId_etnia());

            cons.setDireccion_detalle(f.getDireccion_detalle());
            cons.setTelefono(f.getTelefono());
            cons.setDomicilio(f.getDomicilio());
            cons.setReferencia(f.getReferencia());
            cons.setCorreo_electronico1(f.getCorreo_electronico1());
            cons.setCorreo_electronico2(f.getCorreo_electronico2());
            cons.setRepresentante_legal(f.getRepresentante_legal());
            cons.setNombre_empresa(f.getNombre_empresa());
            cons.setRazon_social(f.getRazon_social());

            cons.setCodigo_departamento(f.getCodigo_departamento());
            cons.setCodigo_municipio(f.getCodigo_municipio());

            cons.setNacionalidad(f.getNacionalidad());

            cons.setSede_diaco_cercana(f.getSede_diaco_cercana());
            cons.setId_motivo_queja(f.getId_motivo_queja());
            cons.setUsuario_adiciono(f.getUsuario_modifico());
            cons.setUsuario_modifico(f.getUsuario_modifico());
            cons.setFecha_adicion(new Date());
            cons.setHabilitado("1");
            //cons.setId_consumidor(max);
            cons.setAutorizoPublicar(f.getAutorizoPublicar());

            tipoDao.TokenCheck(f.getToken());
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveConsumidor(cons);

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //resolucion final
    @Override
    public ResponseRs GetCorrelativoResFinal(String token) {

        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findbyIDTiposRegistro(Constants.REG_DIACO_REGISTRO_RESOLUCION_FINAL_ARCHIVO_JURIDICO));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    //resolucion final
    @Override
    public ResponseRs GetAllResFinal(Integer id_queja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllResFinal(id_queja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;

    }

    @Override
    public ResponseRs GetResFinal(Integer id, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findByIdResFinal(id));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override   //resolucion final
    public ResponseRs saveResFinal(FormSimple formResAudiencia) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formResAudiencia.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formResAudiencia.getId_queja());
            if (vTipoQueja.getId_estado_queja() < 205) {
                vTipoQueja.setId_estado_queja(205);
            }
            tipoDao.saveQueja(vTipoQueja);
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formResAudiencia.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(Constants.REG_DIACO_DPTOINTERNO_JURIDICO);
            newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            newTipoPasoQueja.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
            newTipoPasoQueja.setUsuario_operacion(formResAudiencia.getUsuario());
            newTipoPasoQueja.setOperacion("I");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);
            TipoResFinal nResAudiencia = new TipoResFinal();
            nResAudiencia.setTipopasoqueja(newTipoPasoQueja);
            nResAudiencia.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
            nResAudiencia.setTipo(formResAudiencia.getValor());
            nResAudiencia.setUsuario_actualizado(formResAudiencia.getUsuario());
            nResAudiencia.setFecha_actualizado(new Date());

            String correlativo = getNextCorrelativoRegistroResultFinal();
            System.out.println(correlativo);
            String corrArr[] = correlativo.split("-");
            int corrInt = (corrArr.length >= 1 ? Integer.parseInt(corrArr[1]) : 0);

            nResAudiencia.setCorrelativo(corrInt);
            
            nResAudiencia.setMotivo_archivo(formResAudiencia.getValor2());
            nResAudiencia.setMonto_recuperado(formResAudiencia.getValor3());

            //nResAudiencia.setCorr_notif_cons(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_RESOLUCION_FINAL_ARCHIVO_JURIDICO));
            //nResAudiencia.setCorr_notif_prov(getNextCorrelativoRegistroPrefijo(Constants.REG_DIACO_REGISTRO_RESOLUCION_FINAL_ARCHIVO_JURIDICO));
            nResAudiencia.setCorr_notif_cons(corrInt);
            nResAudiencia.setCorr_notif_prov(corrInt);
            tipoDao.saveResFinal(nResAudiencia);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(nResAudiencia);
            //flujo guia
            saveTiposFlujoGuia(formResAudiencia.getId_queja(), 11); //resultado de audiencia
            //revisar el tipo de resultado de audiencia que se inserto
            TipoCatalogo vcatalogo = tipoDao.findTipoCatalogo(formResAudiencia.getValor());
            String strtipo = "";
            if (vcatalogo != null) {
                strtipo = vcatalogo.getDescripcion_catalogo();
            }
            //bitacora automatica
            String txtmensaje = "Se agreg?? un elemento en Resoluci??n Final";
            if (!strtipo.equals("")) {
                txtmensaje = txtmensaje + " de tipo: " + vcatalogo.getDescripcion_catalogo();
            }
            txtmensaje = txtmensaje + ", con correlativo: " + corrInt;
            BitacoraAutomatica(formResAudiencia.getId_queja(), 2, formResAudiencia.getUsuario(), txtmensaje, txtmensaje, Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);

            transaction.commit();

            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            //guarda la resolucion final solo si tipo de resolucion final es archivo
            if (formResAudiencia.getValor() == 20) {
                saveReg_ResolucionFinal(vTipoQueja, nResAudiencia);
            }

            //guarda las NOTIFICACIONES DIACO-AS-FO-04
            CedulaNotificacionDto vCedulaNotificacionDto = new CedulaNotificacionDto();
            //consumidor
            vCedulaNotificacionDto.setEsCP("C");
            vCedulaNotificacionDto.setEsResultadoResolucion("resolucionFinal");
            vCedulaNotificacionDto.setIdQueja(formResAudiencia.getId_queja());
            vCedulaNotificacionDto.setUsuario(formResAudiencia.getUsuario());
            vCedulaNotificacionDto.setIdResultadoResolucion(nResAudiencia.getId());
            vCedulaNotificacionDto.setCorrelativo(correlativo);
            save_Reg_CedulaNotificacionResJuridico(vCedulaNotificacionDto);
            //proveedor
            vCedulaNotificacionDto.setEsCP("P");
            save_Reg_CedulaNotificacionResJuridico(vCedulaNotificacionDto);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs updResFinal(FormSimple formResAudiencia) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formResAudiencia.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formResAudiencia.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formResAudiencia.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(Constants.REG_DIACO_DPTOINTERNO_JURIDICO);
            newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            newTipoPasoQueja.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
            newTipoPasoQueja.setUsuario_operacion(formResAudiencia.getUsuario());
            newTipoPasoQueja.setOperacion("U");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);
            TipoResFinal nResAudiencia = tipoDao.findByIdResFinal(formResAudiencia.getValor2());
            nResAudiencia.setTipopasoqueja(newTipoPasoQueja);
            nResAudiencia.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
            nResAudiencia.setTipo(formResAudiencia.getValor());
            nResAudiencia.setUsuario_actualizado(formResAudiencia.getUsuario());
            tipoDao.saveResFinal(nResAudiencia);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(nResAudiencia);
            //bitacora automatica
            /*String txtmensaje = "Se edit?? un elemento en Resoluci??n Final para esta queja.";
            BitacoraAutomatica(formResAudiencia.getId_queja(), 2, formResAudiencia.getUsuario(), txtmensaje, txtmensaje, Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
             */
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public ResponseRs delResFinal(FormSimple formResAudiencia) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            tipoDao.TokenCheck(formResAudiencia.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formResAudiencia.getId_queja());
            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formResAudiencia.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(Constants.REG_DIACO_DPTOINTERNO_JURIDICO);
            newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            newTipoPasoQueja.setId_tipo_registro(Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
            newTipoPasoQueja.setUsuario_operacion(formResAudiencia.getUsuario());
            newTipoPasoQueja.setOperacion("D");
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);

            TipoResFinal vResFinal = tipoDao.findByIdResFinal(formResAudiencia.getValor2());
            if (vResFinal != null) {
                tipoDao.deleteResFinal(vResFinal);
                response.setCode(0L);
                response.setReason("OK");
                response.setValue(vResFinal);
                //bitacora automatica
                /*String txtmensaje = "Se elimin?? un elemento en Resoluci??n Final para esta queja.";
                BitacoraAutomatica(formResAudiencia.getId_queja(), 2, formResAudiencia.getUsuario(), txtmensaje, txtmensaje, Constants.REG_TIPO_JURIDICO_RESULUCION_FINAL);
                 */
            } else {
                response.setCode(1L);
                response.setReason("NOT FOUND");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    //vyv asigna cola inicial
    @Override
    public ResponseRs GetxidquejaVyvColaInicial(Integer id_queja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findbyIdQVyvQuejaInicial(id_queja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveVyvColaInicial(FormSimple formulario) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        String operacion = "";
        try {
            tipoDao.TokenCheck(formulario.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoQueja vTipoQueja = tipoDao.findByIdQueja(formulario.getId_queja());
            TipoVyvAsignaCola tvyvasignacola = tipoDao.findbyIdQVyvQuejaInicial(formulario.getId_queja());
            if (tvyvasignacola == null) {
                tvyvasignacola = new TipoVyvAsignaCola();
                operacion = "I";
            } else {
                operacion = "U";
            }

            // llenar datos paso
            TipoPasoQueja newTipoPasoQueja = new TipoPasoQueja();
            newTipoPasoQueja.setId_queja(formulario.getId_queja());
            newTipoPasoQueja.setFecha_operacion(new Date());
            newTipoPasoQueja.setId_departamento_interno(Constants.REG_DIACO_DPTOINTERNO_VERIFICACION);
            newTipoPasoQueja.setId_sede_diaco_operacio(Constants.REG_DIACO_SEDE_CENTRAL);
            newTipoPasoQueja.setId_tipo_registro(Constants.REG_TIPO_VYV_ASIGNA_QUEJA_INICIAL);
            newTipoPasoQueja.setUsuario_operacion(formulario.getUsuario());
            newTipoPasoQueja.setOperacion(operacion);
            newTipoPasoQueja.setId_estado_operado(vTipoQueja.getId_estado_queja());
            tipoDao.savePasoQueja(newTipoPasoQueja);

            tvyvasignacola.setTipopasoqueja(newTipoPasoQueja);
            tvyvasignacola.setId_tipo_registro(Constants.REG_TIPO_VYV_ASIGNA_QUEJA_INICIAL);
            tvyvasignacola.setId_tipo_cola(formulario.getValor());
            tvyvasignacola.setUsuario_modifico(formulario.getUsuario());
            tvyvasignacola.setId_queja(formulario.getId_queja());
            tvyvasignacola.setFecha_modifico(new Date());
            tipoDao.saveVyvQuejaInicial(tvyvasignacola);

            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tvyvasignacola);
            //bitacora automatica
            String txtmensaje = "Se guard?? la asignaci??n inicial de queja en verificaci??n y vigilancia.";
            BitacoraAutomatica(formulario.getId_queja(), 3, formulario.getUsuario(), txtmensaje, txtmensaje, Constants.REG_TIPO_VYV_ASIGNA_QUEJA_INICIAL);

            //asignar queja a cola de vyv
            SaveConfirmarAccionColaEspecial(formulario.getId_queja(), formulario.getValor());

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    @Override
    public TipoReg_ActaConciliacion saveReg_ActaConciliacion(FormRegistro PfrmReg) {

        ResponseRs response = new ResponseRs();
        TipoReg_ActaConciliacion vTipoReg_ActaConciliacion = new TipoReg_ActaConciliacion();
        UserTransaction transaction = null;

        try {

            tipoDao.TokenCheck(PfrmReg.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_ActaConciliacion = tipoDao.findTipoReg_ActaConciliacion(PfrmReg.getId_queja());
            if (vTipoReg_ActaConciliacion == null) {
                vTipoReg_ActaConciliacion = new TipoReg_ActaConciliacion();
                vTipoReg_ActaConciliacion.setCreadoPor(PfrmReg.getCreado_por());
                vTipoReg_ActaConciliacion.setFechaCreacion(new Date());
                vTipoReg_ActaConciliacion.setIdCorrelativoActaConciliacion(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_ACTA_CONCILIACION));

                vTipoReg_ActaConciliacion.setIdQueja(PfrmReg.getId_queja());
                vTipoReg_ActaConciliacion.setIdTipoRegistro(Constants.REG_TIPO_CONCILIACION_AT);

                vTipoReg_ActaConciliacion = tipoDao.saveReg_ActaConciliacion(vTipoReg_ActaConciliacion);

            }
            response.setValue(vTipoReg_ActaConciliacion);

            response.setCode(0L);
            response.setReason("OK");
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return vTipoReg_ActaConciliacion;
    }

    @Override
    public ResponseRs getReg_actaJuridico(Integer idqueja, String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findTipoReg_ActaJuridico(idqueja));
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    @Override
    public ResponseRs saveReg_ActaJuridico(FormRegistro PfrmReg) {

        ResponseRs response = new ResponseRs();
        TipoReg_ActaJuridico vTipoReg_ActaJuridico = new TipoReg_ActaJuridico();
        UserTransaction transaction = null;

        try {

            tipoDao.TokenCheck(PfrmReg.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_ActaJuridico = tipoDao.findTipoReg_ActaJuridico(PfrmReg.getId_queja());
            if (vTipoReg_ActaJuridico == null) {
                vTipoReg_ActaJuridico = new TipoReg_ActaJuridico();
                vTipoReg_ActaJuridico.setCreadoPor(PfrmReg.getCreado_por());
                vTipoReg_ActaJuridico.setFechaCreacion(new Date());
                vTipoReg_ActaJuridico.setIdCorrelativoActa(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_ACTA_JURIDICO) + "-" + convertToLocalDateViaInstant(new Date()).getYear());
                vTipoReg_ActaJuridico.setIdQueja(PfrmReg.getId_queja());
                vTipoReg_ActaJuridico.setIdRegistro((Constants.REG_DIACO_REGISTRO_ACTA_JURIDICO));

                vTipoReg_ActaJuridico = tipoDao.saveTipoReg_ActaJuridico(vTipoReg_ActaJuridico);

            }
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(vTipoReg_ActaJuridico);

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();

            }
        }
        return response;
    }

    @Override
    public TipoReg_ActaIncomparecencia saveReg_ActaIncomparecencia(FormRegistro PfrmReg) {

        ResponseRs response = new ResponseRs();
        TipoReg_ActaIncomparecencia vTipoReg_ActaIncomparecencia = new TipoReg_ActaIncomparecencia();
        UserTransaction transaction = null;

        try {

            tipoDao.TokenCheck(PfrmReg.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            //verificar si es update o insert
            vTipoReg_ActaIncomparecencia = tipoDao.findTipoReg_ActaIncomparecencia(PfrmReg.getId_queja());
            if (vTipoReg_ActaIncomparecencia == null) {
                vTipoReg_ActaIncomparecencia = new TipoReg_ActaIncomparecencia();
                vTipoReg_ActaIncomparecencia.setCreadoPor(PfrmReg.getCreado_por());
                vTipoReg_ActaIncomparecencia.setFechaCreacion(new Date());
                vTipoReg_ActaIncomparecencia.setIdCorrelativoActaIncomparecencia(getNextCorrelativoRegistro(Constants.REG_DIACO_REGISTRO_ACTA_INCOMPARECENCIA));

                vTipoReg_ActaIncomparecencia.setIdQueja(PfrmReg.getId_queja());
                vTipoReg_ActaIncomparecencia.setIdTipoRegistro(Constants.REG_TIPO_CONCILIACION_AT);

                vTipoReg_ActaIncomparecencia = tipoDao.saveTipoReg_ActaIncomparecencia(vTipoReg_ActaIncomparecencia);

            }
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return vTipoReg_ActaIncomparecencia;
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

    //qr path
    @Override
    public ResponseRs GetQRpath() {
        ResponseRs response = new ResponseRs();

        try {
            //tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findQRpath());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs updateConsumidor(FormConsumidor f) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoConsumidor cons = tipoDao.findByIdConsumidor(f.getId_consumidor());

            //cons.setId_consumidor(f.getId_consumidor());
            cons.setNombre1(f.getNombre1());
            cons.setNombre2(f.getNombre2());
            cons.setNombre3(f.getNombre3());
            cons.setApellido1(f.getApellido1());
            cons.setApellido2(f.getApellido2());
            cons.setApellido_casada(f.getApellido_casada());

            cons.setDireccion(f.getDireccion());
            cons.setDireccion_zona(f.getDireccion_zona());

            if (f.getNacionalidad() == 1) {
                cons.setId_pais(1);
            } else {
                cons.setId_pais(f.getId_pais());
            }
            cons.setDocumento_identificacion(f.getDocumento_identificacion());
            cons.setNit_consumidor(f.getNit_consumidor());
            cons.setGenero(f.getGenero());

            cons.setHabilitado_notificacion_electronica(f.getHabilitado_notificacion_electronica());
            cons.setTipo_consumidor(f.getTipo_consumidor());
            cons.setTipo_documento(f.getTipo_documento());
            cons.setId_etnia(f.getId_etnia());

            cons.setDireccion_detalle(f.getDireccion_detalle());
            cons.setTelefono(f.getTelefono());
            cons.setDomicilio(f.getDomicilio());
            cons.setReferencia(f.getReferencia());
            cons.setCorreo_electronico1(f.getCorreo_electronico1());
            cons.setCorreo_electronico2(f.getCorreo_electronico2());
            cons.setRepresentante_legal(f.getRepresentante_legal());
            cons.setNombre_empresa(f.getNombre_empresa());
            cons.setRazon_social(f.getRazon_social());

            cons.setCodigo_departamento(f.getCodigo_departamento());
            cons.setCodigo_municipio(f.getCodigo_municipio());

            cons.setNacionalidad(f.getNacionalidad());

            cons.setSede_diaco_cercana(f.getSede_diaco_cercana());
            cons.setId_motivo_queja(f.getId_motivo_queja());

            cons.setUsuario_modifico(f.getUsuario_modifico());
            cons.setFecha_adicion(new Date());
            cons.setHabilitado("1");
            cons.setId_consumidor(f.getId_consumidor());
            cons.setAutorizoPublicar(f.getAutorizoPublicar());

            tipoDao.TokenCheck(f.getToken());
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveConsumidor(cons);

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs deleteConsumidor(Integer idConsumidor, String usuario, String token) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoConsumidor cons = tipoDao.findByIdConsumidor(idConsumidor);
            cons.setUsuario_modifico(usuario);
            cons.setFecha_adicion(new Date());
            cons.setHabilitado("0");
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveConsumidor(cons);

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /**
     * getters and setters *
     */
    public TipoRepository getTipoQuejaDao() {
        return tipoDao;
    }

    public void setTipoQuejaDao(TipoRepository tipoQuejaDao) {
        this.tipoDao = tipoQuejaDao;
    }

    public ResponseRs listPuestos(String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoPuesto());

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs savePuesto(Integer id, String nombre, String usuario, String token, String operacion) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        TipoPuesto tipoPuesto;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            Integer us = 0;
            List<TipoUsuario> tipoUsuario = tipoDao.findTipoUsuarioByLogin(usuario);
            if (tipoUsuario != null) {
                us = tipoUsuario.get(0).getIdUsuario();
            }
            if ("INSERT".equals(operacion)) {
                tipoPuesto = new TipoPuesto();
                tipoPuesto.setNombre(nombre);
                tipoPuesto.setEstado(1);

                int max = (Integer) tipoDao.findNextIdTipoPuesto();
                max = max + 1;
                tipoPuesto.setId(max);

            } else {
                tipoPuesto = tipoDao.findTipoPuesto(id);
                if ("UPDATE".equals(operacion)) {
                    tipoPuesto.setNombre(nombre);
                    tipoPuesto.setEstado(1);
                } else if ("DELETE".equals(operacion)) {

                    tipoPuesto.setEstado(0);

                }
            }

            tipoPuesto.setModificado_por(us);
            tipoPuesto.setModificado(new Date());
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.savePuesto(tipoPuesto);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }

        return response;
    }

    public ResponseRs listTipoCola(String token) {
        ResponseRs response = new ResponseRs();
        try {

            List<FormTipoCola> formColaList = new ArrayList<FormTipoCola>();
            List<TipoTipoCola> listCola = tipoDao.findAllTipoCola();

            for (TipoTipoCola c : listCola) {
                FormTipoCola cola = new FormTipoCola();
                cola.setId_tipo_cola(c.getId_tipo_cola());
                cola.setId_flujo(c.getId_flujo());
                cola.setId_sede(c.getId_sede());
                cola.setTipo(c.getTipo());
                cola.setUltima_asignacion(c.getUltima_asignacion());
                cola.setNombre(c.getNombre());
                cola.setHabilitado(c.getHabilitado());

                if (c.getId_flujo() != null) {
                    TipoFlujo tipoFlujo = tipoDao.findByIdFlujo(c.getId_flujo());
                    cola.setNombre_flujo(tipoFlujo.getFlujo());
                }

                if (c.getId_sede() != null) {
                    TipoSede tipoSede = tipoDao.findByIdSede(c.getId_sede());
                    cola.setNombre_sede(tipoSede.getNombre_sede());
                }

                formColaList.add(cola);

            }

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(formColaList);

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveTipoCola(Integer idTipoCola, Integer idFlujo, String nombre,
            String tipo, Integer idSede, Integer usuario, String operacion, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoTipoCola tipoCola;

            if ("INSERT".equals(operacion)) {
                tipoCola = new TipoTipoCola();
                tipoCola.setCreado_por(usuario);
                tipoCola.setFecha_creacion(new Date());

                tipoCola.setId_flujo(idFlujo);

                if (idSede == 0) {
                    tipoCola.setId_sede(null);
                } else {
                    tipoCola.setId_sede(idSede);

                }

                tipoCola.setTipo(tipo);

                tipoCola.setNombre(nombre);
                tipoCola.setHabilitado("1");
                Integer max = (Integer) tipoDao.findNextIdTipoCola();
                max = max + 1;
                tipoCola.setId_tipo_cola(max);

            } else {
                tipoCola = tipoDao.findByIdTipoCola(idTipoCola);
                if ("UPDATE".equals(operacion)) {
                    tipoCola.setHabilitado("1");

                    tipoCola.setId_flujo(idFlujo);
                    if (idSede == 0) {
                        tipoCola.setId_sede(null);
                    } else {
                        tipoCola.setId_sede(idSede);

                    }
                    tipoCola.setTipo(tipo);
                    tipoCola.setNombre(nombre);

                } else if ("DELETE".equals(operacion)) {
                    tipoCola.setHabilitado("0");
                }
            }

            tipoCola.setFecha_modificacion(new Date());
            tipoCola.setModificado_por(usuario);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveTipoCola(tipoCola);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs listDepartamentoForDiaInhabil(String token) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoDepartamentoComboDiaInhabil());
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs findTipoColaById(Integer idTipoCola, String token) {
        ResponseRs response = new ResponseRs();
        try {

            List<FormTipoCola> colaListF = new ArrayList<FormTipoCola>();
            FormTipoCola colaForm = new FormTipoCola();
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            TipoTipoCola tipoCola = tipoDao.findByIdTipoCola(idTipoCola);
            colaForm.setCreado_por(tipoCola.getCreado_por());
            colaForm.setFecha_creacion(tipoCola.getFecha_creacion());
            colaForm.setFecha_modificacion(tipoCola.getFecha_modificacion());
            colaForm.setModificado_por(tipoCola.getModificado_por());
            colaForm.setHabilitado(tipoCola.getHabilitado());

            colaForm.setId_flujo(tipoCola.getId_flujo());
            colaForm.setId_sede(tipoCola.getId_sede());
            colaForm.setId_tipo_cola(tipoCola.getId_tipo_cola());
            colaForm.setNombre(tipoCola.getNombre());
            colaForm.setTipo(tipoCola.getTipo());
            colaForm.setUltima_asignacion(tipoCola.getUltima_asignacion());

            TipoFlujo tipoFlujo = tipoDao.findByIdFlujo(tipoCola.getId_flujo());
            colaForm.setNombre_flujo(tipoFlujo.getFlujo());

            TipoSede tipoSede = tipoDao.findByIdSede(tipoCola.getId_sede());
            colaForm.setNombre_sede(tipoSede.getNombre_sede());

            colaListF.add(colaForm);

            response.setValue(colaListF);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs listTipoFlujo(String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoFlujo());

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs listTipoEtnia(String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoEtnia());

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs findConsumidorByNit(String nit, String token) {
        ResponseRs response = new ResponseRs();

        try {
            FormConsumidor fCons = new FormConsumidor();
            List<FormConsumidor> fConsList = new ArrayList<FormConsumidor>();
            tipoDao.TokenCheck(token);

            TipoConsumidor tipoConsumidor = tipoDao.findConsumidorByNit(nit);

            fCons.setApellido1(tipoConsumidor.getApellido1());
            fCons.setApellido2(tipoConsumidor.getApellido2());
            fCons.setApellido_casada(tipoConsumidor.getApellido_casada());
            fCons.setAutorizoPublicar(tipoConsumidor.getAutorizoPublicar());
            fCons.setCodigo_departamento(tipoConsumidor.getCodigo_departamento());
            fCons.setCodigo_municipio(tipoConsumidor.getCodigo_municipio());
            fCons.setCorreo_electronico1(tipoConsumidor.getCorreo_electronico1());
            fCons.setCorreo_electronico2(tipoConsumidor.getCorreo_electronico2());
            fCons.setDireccion(tipoConsumidor.getDireccion());
            fCons.setDireccion_avenida(tipoConsumidor.getDireccion_avenida());
            fCons.setDireccion_calle(tipoConsumidor.getDireccion_calle());
            fCons.setDireccion_zona(tipoConsumidor.getDireccion_zona());
            fCons.setDireccion_detalle(tipoConsumidor.getDireccion_detalle());
            fCons.setDocumento_identificacion(tipoConsumidor.getDocumento_identificacion());
            fCons.setDomicilio(tipoConsumidor.getDomicilio());
            fCons.setGenero(tipoConsumidor.getGenero());
            fCons.setHabilitado(tipoConsumidor.getHabilitado());
            fCons.setHabilitado_notificacion_electronica(tipoConsumidor.getHabilitado_notificacion_electronica());
            fCons.setId_consumidor(tipoConsumidor.getId_consumidor());
            fCons.setId_etnia(tipoConsumidor.getId_etnia());
            fCons.setId_motivo_queja(tipoConsumidor.getId_motivo_queja());
            fCons.setId_pais(tipoConsumidor.getId_pais());
            fCons.setNacionalidad(tipoConsumidor.getNacionalidad());
            fCons.setNit_consumidor(tipoConsumidor.getNit_consumidor());
            fCons.setNombre1(tipoConsumidor.getNombre1());
            fCons.setNombre2(tipoConsumidor.getNombre2());
            fCons.setNombre3(tipoConsumidor.getNombre3());
            if (tipoConsumidor.getCodigo_departamento() != null) {
                TipoDepartamento tipoDepto = tipoDao.findByIdDepartamento(tipoConsumidor.getCodigo_departamento());
                fCons.setNombre_departamento(tipoDepto.getNombre_departamento());
            }
            fCons.setNombre_empresa(tipoConsumidor.getNombre_empresa());
            if (tipoConsumidor.getId_etnia() != null) {
                TipoEtnia tipoEtnia = tipoDao.findByIdEtnia(tipoConsumidor.getId_etnia());
                fCons.setNombre_etnia(tipoEtnia.getDescripcion());
            }

            if (tipoConsumidor.getId_motivo_queja() != null) {
                TipoMotivoQueja tipoMotivo = tipoDao.findByIdMotivoQueja(tipoConsumidor.getId_motivo_queja());
                fCons.setNombre_motivo_queja(tipoMotivo.getMotivo());
            }

            if (tipoConsumidor.getCodigo_municipio() != null) {
                TipoMunicipio tipoMuni = tipoDao.findByIdMunicipio(tipoConsumidor.getCodigo_municipio());
                fCons.setNombre_municipio(tipoMuni.getNombre_municipio());
            }

            if (tipoConsumidor.getId_pais() != null) {
                TipoPais pais = tipoDao.findByIdPais(tipoConsumidor.getId_pais());
                fCons.setNombre_pais(pais.getNombre_pais());
            }

            if (tipoConsumidor.getSede_diaco_cercana() != null) {
                TipoSede sede = tipoDao.findByIdSede(tipoConsumidor.getSede_diaco_cercana());
                fCons.setNombre_sede(sede.getNombre_sede());
            }

            fCons.setRazon_social(tipoConsumidor.getRazon_social());
            fCons.setReferencia(tipoConsumidor.getReferencia());
            fCons.setRepresentante_legal(tipoConsumidor.getRepresentante_legal());
            fCons.setSede_diaco_cercana(tipoConsumidor.getSede_diaco_cercana());
            fCons.setTelefono(tipoConsumidor.getTelefono());
            fCons.setTipo_consumidor(tipoConsumidor.getTipo_consumidor());
            fCons.setTipo_documento(tipoConsumidor.getTipo_documento());

            if ("M".equals(tipoConsumidor.getGenero())) {
                fCons.setNombre_genero("Masculino");
            } else if ("F".equals(tipoConsumidor.getGenero())) {
                fCons.setNombre_genero("Femenino");
            }

            if (6 == tipoConsumidor.getTipo_consumidor()) {
                fCons.setNombre_tipo_consumidor("individual");
            } else if (tipoConsumidor.getTipo_consumidor() == 7) {
                fCons.setNombre_tipo_consumidor("juridico");
            }

            if (tipoConsumidor.getNacionalidad() == 1) {
                fCons.setNombre_nacionalidad("guatemalteco(a)");
            } else if (tipoConsumidor.getNacionalidad() == 2) {
                fCons.setNombre_nacionalidad("extranjero(a)");
            }

            fCons.setDireccion(tipoConsumidor.getDireccion());

            fConsList.add(fCons);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(fConsList);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs findConsumidorByDpi(String dpi, String token) {
        ResponseRs response = new ResponseRs();

        try {
            FormConsumidor fCons = new FormConsumidor();
            List<FormConsumidor> fConsList = new ArrayList<FormConsumidor>();
            tipoDao.TokenCheck(token);

            TipoConsumidor tipoConsumidor = tipoDao.findConsumidorByDpi(dpi);

            fCons.setApellido1(tipoConsumidor.getApellido1());
            fCons.setApellido2(tipoConsumidor.getApellido2());
            fCons.setApellido_casada(tipoConsumidor.getApellido_casada());
            fCons.setAutorizoPublicar(tipoConsumidor.getAutorizoPublicar());
            fCons.setCodigo_departamento(tipoConsumidor.getCodigo_departamento());
            fCons.setCodigo_municipio(tipoConsumidor.getCodigo_municipio());
            fCons.setCorreo_electronico1(tipoConsumidor.getCorreo_electronico1());
            fCons.setCorreo_electronico2(tipoConsumidor.getCorreo_electronico2());
            fCons.setDireccion(tipoConsumidor.getDireccion());
            fCons.setDireccion_avenida(tipoConsumidor.getDireccion_avenida());
            fCons.setDireccion_calle(tipoConsumidor.getDireccion_calle());
            fCons.setDireccion_zona(tipoConsumidor.getDireccion_zona());
            fCons.setDireccion_detalle(tipoConsumidor.getDireccion_detalle());
            fCons.setDocumento_identificacion(tipoConsumidor.getDocumento_identificacion());
            fCons.setDomicilio(tipoConsumidor.getDomicilio());
            fCons.setGenero(tipoConsumidor.getGenero());
            fCons.setHabilitado(tipoConsumidor.getHabilitado());
            fCons.setHabilitado_notificacion_electronica(tipoConsumidor.getHabilitado_notificacion_electronica());
            fCons.setId_consumidor(tipoConsumidor.getId_consumidor());
            fCons.setId_etnia(tipoConsumidor.getId_etnia());
            fCons.setId_motivo_queja(tipoConsumidor.getId_motivo_queja());
            fCons.setId_pais(tipoConsumidor.getId_pais());
            fCons.setNacionalidad(tipoConsumidor.getNacionalidad());
            fCons.setNit_consumidor(tipoConsumidor.getNit_consumidor());
            fCons.setNombre1(tipoConsumidor.getNombre1());
            fCons.setNombre2(tipoConsumidor.getNombre2());
            fCons.setNombre3(tipoConsumidor.getNombre3());
            if (tipoConsumidor.getCodigo_departamento() != null) {
                TipoDepartamento tipoDepto = tipoDao.findByIdDepartamento(tipoConsumidor.getCodigo_departamento());
                fCons.setNombre_departamento(tipoDepto.getNombre_departamento());
            }
            fCons.setNombre_empresa(tipoConsumidor.getNombre_empresa());
            if (tipoConsumidor.getId_etnia() != null) {
                TipoEtnia tipoEtnia = tipoDao.findByIdEtnia(tipoConsumidor.getId_etnia());
                fCons.setNombre_etnia(tipoEtnia.getDescripcion());
            }

            if (tipoConsumidor.getId_motivo_queja() != null) {
                TipoMotivoQueja tipoMotivo = tipoDao.findByIdMotivoQueja(tipoConsumidor.getId_motivo_queja());
                fCons.setNombre_motivo_queja(tipoMotivo.getMotivo());
            }

            if (tipoConsumidor.getCodigo_municipio() != null) {
                TipoMunicipio tipoMuni = tipoDao.findByIdMunicipio(tipoConsumidor.getCodigo_municipio());
                fCons.setNombre_municipio(tipoMuni.getNombre_municipio());
            }

            if (tipoConsumidor.getId_pais() != null) {
                TipoPais pais = tipoDao.findByIdPais(tipoConsumidor.getId_pais());
                fCons.setNombre_pais(pais.getNombre_pais());
            }

            if (tipoConsumidor.getSede_diaco_cercana() != null) {
                TipoSede sede = tipoDao.findByIdSede(tipoConsumidor.getSede_diaco_cercana());
                fCons.setNombre_sede(sede.getNombre_sede());
            }

            fCons.setRazon_social(tipoConsumidor.getRazon_social());
            fCons.setReferencia(tipoConsumidor.getReferencia());
            fCons.setRepresentante_legal(tipoConsumidor.getRepresentante_legal());
            fCons.setSede_diaco_cercana(tipoConsumidor.getSede_diaco_cercana());
            fCons.setTelefono(tipoConsumidor.getTelefono());
            fCons.setTipo_consumidor(tipoConsumidor.getTipo_consumidor());
            fCons.setTipo_documento(tipoConsumidor.getTipo_documento());

            if ("M".equals(tipoConsumidor.getGenero())) {
                fCons.setNombre_genero("Masculino");
            } else if ("F".equals(tipoConsumidor.getGenero())) {
                fCons.setNombre_genero("Femenino");
            }

            if (6 == tipoConsumidor.getTipo_consumidor()) {
                fCons.setNombre_tipo_consumidor("individual");
            } else if (tipoConsumidor.getTipo_consumidor() == 7) {
                fCons.setNombre_tipo_consumidor("juridico");
            }

            if (tipoConsumidor.getNacionalidad() == 1) {
                fCons.setNombre_nacionalidad("guatemalteco(a)");
            } else if (tipoConsumidor.getNacionalidad() == 2) {
                fCons.setNombre_nacionalidad("extranjero(a)");
            }

            fCons.setDireccion(tipoConsumidor.getDireccion());

            fConsList.add(fCons);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(fConsList);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveTipoTipoConsumidor(Integer idTipoTipoConsumidor, String nombre, String token, String usuario, String operacion) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            TipoTipoConsumidor tipoCons;
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");

            transaction.begin();
            if ("INSERT".equals(operacion)) {
                tipoCons = new TipoTipoConsumidor();
                tipoCons.setNombre_consumidor(nombre);
                tipoCons.setFecha_adicion(new Date());
                tipoCons.setUsuario_adicion(usuario);
                tipoCons.setHabilitado("1");
            } else {
                tipoCons = tipoDao.findByIdTipoConsumidor(idTipoTipoConsumidor);
                if ("UPDATE".equals(operacion)) {
                    tipoCons.setNombre_consumidor(nombre);
                    tipoCons.setHabilitado("1");
                } else if ("DELETE".equals(operacion)) {
                    tipoCons.setHabilitado("0");
                }
            }

            tipoCons.setFecha_modificacion(new Date());
            tipoCons.setUsuario_modificacion(usuario);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveTipoTipoConsumidor(tipoCons);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs listTipoTipoConsumidor(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoTipoConsumidor());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs listTipoAreaInterna(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.findAllTipoAreaInterna());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveTipoAreaInterna(Integer id, String nombre, String token, String usuario, String operacion) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            TipoAreaInterna tipoArea;
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");

            transaction.begin();
            if ("INSERT".equals(operacion)) {
                tipoArea = new TipoAreaInterna();
                tipoArea.setNombre(nombre);
                tipoArea.setTipo_area(1);
                tipoArea.setFecha_adicion(new Date());
                tipoArea.setUsuario_adiciono(usuario);
                tipoArea.setHabilitado("1");
            } else {
                tipoArea = tipoDao.findByIdTipoAreaInterna(id);
                if ("UPDATE".equals(operacion)) {
                    tipoArea.setNombre(nombre);
                    tipoArea.setTipo_area(1);
                    tipoArea.setHabilitado("1");
                } else if ("DELETE".equals(operacion)) {
                    tipoArea.setHabilitado("0");
                }
            }

            tipoArea.setFecha_modificacion(new Date());
            tipoArea.setUsuario_modifico(usuario);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveTipoAreaInterna(tipoArea);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs listTipoMotivoQuejaFinalizada(String token) {
        ResponseRs response = new ResponseRs();

        try {
            List<TipoMotivoQuejaFinalizada> list = tipoDao.findAllTipoMotivoQuejaFinalizada();
            List<FormMotivoQuejaFinalizacion> finList = new ArrayList<FormMotivoQuejaFinalizacion>();
            for (TipoMotivoQuejaFinalizada li : list) {
                FormMotivoQuejaFinalizacion f = new FormMotivoQuejaFinalizacion();
                f.setDescripcion(li.getDescripcion());
                f.setId_motivo_queja_finalizada(li.getId_motivo_queja_finalizada());
                f.setEstado(li.getEstado());
                f.setTipo(li.getTipo());
                f.setPadre(li.getPadre());

                if ("S".equals(li.getTipo())) {
                    f.setNombreTipo("Servicios Publicos");
                } else if ("F".equals(li.getTipo())) {
                    f.setNombreTipo("Razon Finalizacion");
                } else if ("C".equals(li.getTipo())) {
                    f.setNombreTipo("Categoria Atencion Al Consumidor");
                } else if ("A".equals(li.getTipo())) {
                    f.setNombreTipo("Razon Atencion Al Consumidor");
                } else {
                    f.setNombreTipo("ninguno");
                }

                if (li.getPadre() != null) {
                    TipoMotivoQuejaFinalizada tipoMotivo = this.tipoDao.findByIdTipoMotivoQuejaFinalizada(li.getPadre());
                    f.setNombrePadre(tipoMotivo.getDescripcion());
                } else {
                    f.setNombrePadre(" ");
                }

                finList.add(f);
            }

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(finList);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveTipoMotivoQuejaFinalizada(Integer id, String nombre, String tipo, Integer padre,
            String token, String usuario, String operacion) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            TipoMotivoQuejaFinalizada tipoMotivo;
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");

            transaction.begin();
            if ("INSERT".equals(operacion)) {
                tipoMotivo = new TipoMotivoQuejaFinalizada();
                int max = (Integer) tipoDao.findNextIdTipoMotivoQuejaFinalizada();
                max = max + 1;
                tipoMotivo.setId_motivo_queja_finalizada(max);
                tipoMotivo.setDescripcion(nombre);
                if (padre != 0) {
                    tipoMotivo.setPadre(padre);
                }
                tipoMotivo.setEstado("A");
                tipoMotivo.setTipo(tipo);
                tipoMotivo.setFecha_creacion(new Date());
                tipoMotivo.setUsuario_creacion(usuario);

            } else {
                tipoMotivo = tipoDao.findByIdTipoMotivoQuejaFinalizada(id);
                if ("UPDATE".equals(operacion)) {
                    tipoMotivo.setId_motivo_queja_finalizada(id);
                    tipoMotivo.setDescripcion(nombre);
                    if (padre != 0) {
                        tipoMotivo.setPadre(padre);
                    }

                    tipoMotivo.setEstado("A");
                    tipoMotivo.setTipo(tipo);

                } else if ("DELETE".equals(operacion)) {
                    tipoMotivo.setEstado("N");
                }
            }

            tipoMotivo.setFecha_modifico(new Date());
            tipoMotivo.setUsuario_modifico(usuario);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveTipoMotivoQuejaFinalizada(tipoMotivo);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs saveActividadEconomica(Integer id, String nombreActividad, String usuario, String operacion, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoActividadEconomica tipoActividad;

            if ("INSERT".equals(operacion)) {
                tipoActividad = new TipoActividadEconomica();
                tipoActividad.setUsuario_adiciono(usuario);
                tipoActividad.setFecha_adicion(new Date());

                tipoActividad.setHabilitado("1");
                tipoActividad.setNombre_actividad_economica(nombreActividad);

            } else {
                tipoActividad = tipoDao.findByIdActividadEconomica(id);
                if ("UPDATE".equals(operacion)) {
                    tipoActividad.setHabilitado("1");
                    tipoActividad.setNombre_actividad_economica(nombreActividad);

                } else if ("DELETE".equals(operacion)) {
                    tipoActividad.setHabilitado("0");
                }
            }

            tipoActividad.setFecha_modificacion(new Date());
            tipoActividad.setUsuario_modifico(usuario);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveActividadEconomica(tipoActividad);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs saveTipoComercio(Integer id, Integer idActividad, String nombre, String usuario, String operacion, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoComercio tipoComercio;

            if ("INSERT".equals(operacion)) {
                tipoComercio = new TipoComercio();
                tipoComercio.setUsuario_adiciono(usuario);
                tipoComercio.setFecha_adicion(new Date());

                tipoComercio.setHabilitado("1");
                tipoComercio.setTipo_comercio(nombre);
                tipoComercio.setId_actividad_economica(idActividad);

            } else {
                tipoComercio = tipoDao.findByIdTipoComercio(id);
                if ("UPDATE".equals(operacion)) {
                    tipoComercio.setHabilitado("1");
                    tipoComercio.setTipo_comercio(nombre);
                    tipoComercio.setId_actividad_economica(idActividad);

                } else if ("DELETE".equals(operacion)) {
                    tipoComercio.setHabilitado("0");
                }
            }

            tipoComercio.setFecha_modificacion(new Date());
            tipoComercio.setUsuario_modifico(usuario);

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveTipoComercio(tipoComercio);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs listTipoComercioAll(String token) {
        ResponseRs response = new ResponseRs();
        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");

            List<TipoComercio> comList = tipoDao.findAllTipoComercio();
            List<FormTipoComercio> formList = new ArrayList<FormTipoComercio>();

            for (TipoComercio item : comList) {
                FormTipoComercio formCom = new FormTipoComercio();
                formCom.setId_tipo_comercio(item.getId_tipo_comercio());
                formCom.setId_actividad_economica(item.getId_actividad_economica());
                formCom.setTipo_comercio(item.getTipo_comercio());
                formCom.setHabilitado(item.getHabilitado());

                TipoActividadEconomica actividad = tipoDao.findByIdActividadEconomica(item.getId_actividad_economica());
                formCom.setNombre_actividad_economica(actividad.getNombre_actividad_economica());
                formList.add(formCom);
            }
            response.setValue(formList);

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public ResponseRs listTipoSucursal(Integer idProveedor, String token) {
        ResponseRs response = new ResponseRs();

        try {
            List<TipoSucursal> listSucursal = tipoDao.findAllTipoSucursalByProveedor(idProveedor);
            List<FormSucursal> listF = new ArrayList<FormSucursal>();
            TipoProveedor proveedor = tipoDao.findByIdProveedor(idProveedor);

            for (TipoSucursal s : listSucursal) {
                FormSucursal f = new FormSucursal();
                f.setCodigo_departamento(s.getCodigo_departamento());
                f.setCodigo_municipio(s.getCodigo_municipio());
                f.setDireccion(s.getDireccion());
                f.setId_proveedor(s.getId_proveedor());
                f.setId_sucursal(s.getId_sucursal());
                f.setTelefono(s.getTelefono());
                f.setZona(s.getZona());
                f.setNombre_proveedor(proveedor.getNombre());
                TipoDepartamento depa = tipoDao.findByIdDepartamento(s.getCodigo_departamento());
                f.setNombre_departamento(depa.getNombre_departamento());
                TipoMunicipio muni = tipoDao.findByIdMunicipio(s.getCodigo_municipio());
                f.setNombre_municipio(muni.getNombre_municipio());

                listF.add(f);
            }
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(listF);
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    public ResponseRs saveTipoSucursal(FormSucursal s, String operacion) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoSucursal tipoSucursal;

            if ("INSERT".equals(operacion)) {
                tipoSucursal = new TipoSucursal();
                Integer max = (Integer) tipoDao.findNextIdTipoSucursal();
                if (max == null) {
                    max = 0;
                }
                max = max + 1;
                tipoSucursal.setUsuario_adiciono(s.getUsuario());
                tipoSucursal.setFecha_adiciono(new Date());

                tipoSucursal.setHabilitado("1");
                tipoSucursal.setId_proveedor(s.getId_proveedor());
                tipoSucursal.setId_sucursal(max);
                tipoSucursal.setCodigo_departamento(s.getCodigo_departamento());
                tipoSucursal.setCodigo_municipio(s.getCodigo_municipio());
                tipoSucursal.setDireccion(s.getDireccion());
                tipoSucursal.setZona(s.getZona());
                tipoSucursal.setTelefono(s.getTelefono());
            } else {
                tipoSucursal = tipoDao.findByIdTipoSucursal(s.getId_sucursal());
                if ("UPDATE".equals(operacion)) {
                    tipoSucursal.setHabilitado("1");
                    tipoSucursal.setId_proveedor(s.getId_proveedor());
                    tipoSucursal.setId_sucursal(s.getId_sucursal());
                    tipoSucursal.setCodigo_departamento(s.getCodigo_departamento());
                    tipoSucursal.setCodigo_municipio(s.getCodigo_municipio());
                    tipoSucursal.setDireccion(s.getDireccion());
                    tipoSucursal.setZona(s.getZona());
                    tipoSucursal.setTelefono(s.getTelefono());
                } else if ("DELETE".equals(operacion)) {
                    tipoSucursal.setHabilitado("0");
                }
            }

            tipoSucursal.setUsuario_modifico(s.getUsuario());
            tipoSucursal.setFecha_modifico(new Date());

            tipoDao.TokenCheck(s.getToken());
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveTipoSucursal(tipoSucursal);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs deleteTipoSucursal(Integer id, String usuario, String token) {
        UserTransaction transaction = null;
        ResponseRs response = new ResponseRs();
        try {
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TipoSucursal tipoSucursal = tipoDao.findByIdTipoSucursal(id);
            tipoSucursal.setHabilitado("0");
            tipoSucursal.setUsuario_modifico(usuario);
            tipoSucursal.setFecha_modifico(new Date());

            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            tipoDao.saveTipoSucursal(tipoSucursal);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {

                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    public ResponseRs listProveedorAll(String token) {
        ResponseRs response = new ResponseRs();

        try {
            tipoDao.TokenCheck(token);
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(tipoDao.listProveedorAll());
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
        }
        return response;
    }

    /**
     * Metodo que sirve para generar un nuevo password para cierto usuario.
     *
     * @param pIdUsuario ID del usuario a quien se le cambia el password.
     * @param pLoginUsuario Login del usuario.
     * @throws ErrorException Si ocurre un error.
     */
    private UsuarioTemporalDto generarNuevoPasswordUsuario(Integer pIdUsuario,
            String pLoginUsuario) throws ErrorException {
        try {
            System.out.println("Call: generarNuevoPasswordUsuario " + pIdUsuario);
            // Se genera un nuevo password.
            Map<String, String> respmap = smsi.GetRandomPW();
            // Se consulta al usuario proveedor.
            TipoUsuario_Simple user = tipoDao.findByIdUsuario(pIdUsuario);
            // Se actualiza la clave.
            user.setClave(respmap.get("encriptado"));
            // Graba en Base de datos.
            tipoDao.saveUsuarioSimple(user);
            // Almacenamos la informacion del proveedor en un DTO para su 
            // posterior manipulacion.
            UsuarioTemporalDto miUsuario = new UsuarioTemporalDto();
            miUsuario.setIdUsuario(pIdUsuario);
            miUsuario.setEmail(user.getEmail());
            miUsuario.setNombre(user.getNombre());
            miUsuario.setLoginUsuario(pLoginUsuario);
            miUsuario.setPassword(respmap.get("clave"));
            // Retornamos el dto.
            return miUsuario;
        } catch (Exception e) {
            throw new ErrorException("Error al generar password y enviar correo.", e);
        }
    }

    /**
     * Metodo que sirve para construir un correo electronico para ser enviado al
     * proveedor.
     *
     * @param pUsuarioTemp DTO con los atributos del proveedor.
     */
    private String construirCorreo(UsuarioTemporalDto pUsuarioTemp) {
        // cuerpo del correo.
        String cuerpo = "Estimado Usuario, se ha solicitado un cambio de clave "
                + "para su usuario."
                + "<br>Sus nuevas credenciales son: "
                + "<br> Login: " + pUsuarioTemp.getLoginUsuario()
                + "<br> Password: " + pUsuarioTemp.getPassword()
                + "<br><br>."
                + "<br>Por seguridad cambie su password luego de ingresar al sistema.";
        return cuerpo;
    }

    /**
     * Metodo que sirve para guardar y mandar una notificacion.
     *
     * @param pDestinatario Destinatario de correo.
     * @param pNombre Nombre del destinatario.
     * @param idfuente Fuente de envio.
     * @param cuerpo Cuerpo del correo.
     * @return Si {@code true} cuando se logra enviar el correo.
     * @throws Exception Si ocurre un error.
     */
    private boolean procesarNotificacionCorreo(String[] pDestinatario, String pNombre,
            Integer idfuente, String cuerpo) throws Exception {
        System.out.println("Call: procesarNotificacionCorreo");
        // DTO con los atributos del correo electronico a enviar.
        // Se almacena toda la metadata que sirve para mandar un correo por la web.
        TipoEmailEnviar regCorreo = new TipoEmailEnviar();
        // Se configura el remitente
        TipoEmailFuente regRemitente = tipoDao.findByIdEmailFuente(idfuente);
        // Notificacion de correo.
        boolean enviado = notificacionService.enviarNotificacion(pDestinatario[0],
                pNombre, cuerpo);

        if (!enviado) {
            throw new ErrorException("Error al notificar por correo electr??nico.");
        }

        regCorreo.setMensaje(cuerpo);
        regCorreo.setDe(regRemitente.getDe());
        regCorreo.setPara(Arrays.toString(pDestinatario));
        regCorreo.setSubject(regRemitente.getSubject());
        regCorreo.setFecha_creado(new Date());
        regCorreo.setId_fuente(idfuente);
        if (enviado) {
            regCorreo.setEstado("I");
            regCorreo.setFallos(0);
            regCorreo.setFecha_enviado(new Date());
        } else {
            regCorreo.setEstado("A");
            regCorreo.setFallos(1);
            tipoDao.saveEmailEnviar(regCorreo);
            return false;
        }
        tipoDao.saveEmailEnviar(regCorreo);
        System.out.println("Call: saveEmailEnviar");
        return true;
    }

    /**
     * Metodo que sirve para crear al usuario proveedor.
     * <p>
     * Con la informacion basica del proveedor se genera un usuario y password
     * en el portal de proveedores.
     * <p>
     * Por defecto se crean usuarios de tipo Administradores.
     *
     * @param pProveedor DTO con la informacion del proveedor.
     * @param pUsuarioOperacion Usuario de la operacion.
     * @return Respuesta del tipo {@link ResponseRs}.
     */
    @Override
    public ResponseRs crearUsuarioProveedor(FormConfUsuario pProveedor,
            Integer pUsuarioOperacion) {
        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            System.out.println("Metodo: crearUsuarioProveedor");
            // Token
            tipoDao.TokenCheck(pProveedor.getToken());
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            // Buscar registro de Proveedor previamente almacenado en BD en la
            // Tabla temporal.
            TipoProveedorAprobar regProveedorAprobado = tipoDao.
                    findByIdProveedorAprobar(pProveedor.getId_usuario()); //Busca en tabla diaco_proveedor_aprobar
            // Registro del proveedor recien creado.
            TipoProveedor regProveedor = tipoDao.findProveeorByNit(regProveedorAprobado.getNit()); //Busca en tabla diaco_proveedor
            // Lista de correos electronicos del proveedor.
            List<TipoEmail> listaCorreosProveedor = tipoDao.
                    findByCodigoProveedor(regProveedor.getId_proveedor()); //Busca en tabla diaco_email

            System.out.println("Call: findByIdUsuarioConf " + regProveedor.toString());
            // Se busca al usuario previamente almacenado.
            TipoUsuario_Conf regNuevoUsuario = new TipoUsuario_Conf();
            // Se utiliza el primer correo registrado en la lista.
            String primerEmailProveedor = listaCorreosProveedor.get(0).getCorreo_electronico();
            //valida email no repetido
            // TODO
            // Agregar este servicio al momento de enviar la solicitud
            // para descartar desde la creacion de la misma.
            System.out.println("Call: findByEmailUsuarioConf " + primerEmailProveedor);
            TipoUsuario_Conf valida_email;
            System.out.println("Verificando: getCorreo jj");

            if (pProveedor.getId_usuario() != 0) {
                valida_email = tipoDao.findByEmailExcUsuarioConf(primerEmailProveedor, pProveedor.getId_usuario());
                System.out.println("(IF)Valor de valida_email: " + valida_email);
            } else {
                valida_email = tipoDao.findByEmailUsuarioConf(primerEmailProveedor);
                System.out.println("(ELSE)Valor de valida_email: " + valida_email);
            }
            System.out.println("Valor de valida_email: " + valida_email);
            if (valida_email == null) {
                System.out.println("Verificando: valida_email == NULL");
                System.out.println("Correo no repetido.");
            }

            if (valida_email != null) {
                response.setCode(1L);
                response.setReason("ERROR_EMAIL");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }

            // Cadena alfanumerica de 8 caracteres.
            String miUsernameGenerado = RandomStringUtils.randomAlphanumeric(8);

            TipoUsuario_Conf regLoginUsuario = tipoDao.
                    findByLoginUsuarioConf(miUsernameGenerado);

            if (regLoginUsuario == null) {
                System.out.println("Verificando: regLoginUsuario == NULL");
                System.out.println("Login no repetido.");
            }

            if (regLoginUsuario != null) {
                response.setCode(1L);
                response.setReason("ERROR_USUARIO");
                try {
                    transaction.rollback();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
                return response;
            }
            System.out.println("Creando nuevo registro de Usuario.");
            regNuevoUsuario.setEmail(primerEmailProveedor);
            regNuevoUsuario.setFecha_adicion(new Date());
            regNuevoUsuario.setHabilitado("1");
            regNuevoUsuario.setNit(regProveedor.getNit_proveedor());
            regNuevoUsuario.setLogin(miUsernameGenerado);
            regNuevoUsuario.setNombre(regProveedor.getNombreProveedor());
            regNuevoUsuario.setTelefono(regProveedor.getTelefono());
            regNuevoUsuario.setId_proveedor(regProveedor.getId_proveedor());
            regNuevoUsuario.setDpi(regProveedorAprobado.getCui());
            System.out.println("Call: saveUsuarioConf " + regNuevoUsuario.toString());
            tipoDao.saveUsuarioConf(regNuevoUsuario);

            TipoUsuario_Conf usuarioSrch = tipoDao.findByLoginUsuarioConf(regNuevoUsuario.getLogin());
            System.out.println("Call: findByLoginUsuarioConf " + usuarioSrch.toString());
            TipoUsuarioPerfil vperfil = null;
            Integer perfillocal;
            //guarda permisos portal proveedores, rol
            perfillocal = Constants.REG_DIACO_PERFIL_USUARIO_PP_ADMINISTRADOR;

            //vperfil = tipoDao.findUsuarioPP_Rol(pProveedor.getId_usuario());
            vperfil = new TipoUsuarioPerfil();
            vperfil.setFechaAdicion(new Date());
            vperfil.setUsuarioAdicion(pUsuarioOperacion.toString());
            TipoUsuarioPerfilPK perfilpk = new TipoUsuarioPerfilPK();
            perfilpk.setIdPerfilPuesto(perfillocal);
            perfilpk.setIdUsuario(usuarioSrch.getId_usuario());
            vperfil.setTipoUsuarioPerfilPK(perfilpk);
            vperfil.setUsuarioAdicion(pUsuarioOperacion.toString());
            System.out.println("Call: saveUsuarioPerfil " + vperfil.toString());
            tipoDao.saveUsuarioPerfil(vperfil);
            System.out.println("Call: SaveEmailNewPasswordInternal " + usuarioSrch.getId_usuario());
            // Generar un nuevo password para el proveedor y lo almacena en un 
            // DTO temporal del usuario.
            UsuarioTemporalDto usuarioTemp = this.
                    generarNuevoPasswordUsuario(usuarioSrch.getId_usuario(),
                            miUsernameGenerado);
            // Crear un cuerpo/contenido de correo electronico con las nuevas 
            // credenciales usando el DTO temporal.
            String cuerpoCorreo = this.construirCorreo(usuarioTemp);
            // Obtener la direccion de correo electronico.
            String[] destinatario = GetEmailStringUsuario(usuarioTemp.getEmail());
            // Guardar correo e intentar enviarlo.
            this.procesarNotificacionCorreo(destinatario, regProveedor.getNombreProveedor(),
                    Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD,
                    cuerpoCorreo);
            // Respuesta.
            response.setCode(0L);
            response.setReason("OK");
            response.setValue(usuarioSrch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /**
     * Metodo que sirve para aprobar la solicitud de creacion del proveedor.
     * <p>
     * Cambia el estado del proveedor previamente almacenado de "T" = Temporal,
     * hacia "A" = Activo.
     * <p>
     * Activa la conciliacion previa.
     *
     * @param pToken Token de seguridad.
     * @param pEstado Estado del usuario.
     * @param pId Identificador del usuario.
     * @param pUsuarioOperacion Usuario que realiza la operacion.
     * @return Respuesta del tipo {@link ResponseRs}.
     */
    @Override
    public ResponseRs aprobarSolicitudProveedor(String pToken, String pEstado,
            Integer pId, Integer pUsuarioOperacion) {

        ResponseRs response = new ResponseRs();
        UserTransaction transaction = null;
        try {
            System.out.println("Metodo: aprobarSolicitudProveedor");
            // Token
            tipoDao.TokenCheck(pToken);
            transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            // Buscar registro de Proveedor previamente almacenado en BD.
            TipoProveedorAprobar regProveedor = tipoDao.findByIdProveedorAprobar(pId);
            // Nuevo estado.
            regProveedor.setEstado(pEstado);
            // Aprobado no lleva nota de rechazo.
            regProveedor.setNota_rechazo("");
            // Actualizamos en BD.
            tipoDao.saveProveedorAprobar(regProveedor);
            System.out.println("regProveedor: " + regProveedor.toString());
            // Para el estado "A":
            // si el proveedor fue aprobar, buscar si ya existe por nit
            TipoProveedor tipoProveedor = tipoDao.findxNITProveedor(regProveedor.getNit());
            System.out.println("TipoProveedor: " + tipoProveedor);
            if (tipoProveedor != null) {
                System.out.println("Actualizando...");
                //prov ya existe solo se actualiza
                tipoProveedor.setServicio_publico(false);
                tipoProveedor.setHabilitado_conciliacion_previa("1");
                tipoProveedor.setFecha_modificacion(new Date());
                tipoProveedor.setFecha_registro_conciliacion_previa(new Date());
                tipoProveedor.setUsuario_modifico(pUsuarioOperacion.toString());
                tipoProveedor.setHabilitado("1");
                tipoProveedor.setEmail(regProveedor.getCorreo());
                tipoProveedor.setTipo_proveedor(regProveedor.getTipo_proveedor());
                tipoDao.saveProveedor(tipoProveedor);
            } else {
                System.out.println("Nuevo...");
                //prov no existe se crea uno nuevo
                tipoProveedor = new TipoProveedor();
                tipoProveedor.setHabilitado_conciliacion_previa("1");
                tipoProveedor.setCodigo_departamento(regProveedor.getDepartamento());
                tipoProveedor.setCodigo_municipio(regProveedor.getMunicipio());
                tipoProveedor.setDireccion(regProveedor.getDireccion());
                tipoProveedor.setFecha_adicion(new Date());
                tipoProveedor.setFecha_registro_conciliacion_previa(new Date());
                tipoProveedor.setHabilitado("1");
                tipoProveedor.setNit_proveedor(regProveedor.getNit());
                tipoProveedor.setNombre(regProveedor.getNombre());
                tipoProveedor.setUsuario_adiciono(pUsuarioOperacion.toString());
                tipoProveedor.setEmail(regProveedor.getCorreo());
                //valores por default
                if (regProveedor.getTipo_proveedor() != null) {
                    tipoProveedor.setTipo_proveedor(regProveedor.getTipo_proveedor());
                } else {
                    tipoProveedor.setTipo_proveedor(6); //individual
                }
                if (regProveedor.getId_actividad_economica() != null) {
                    tipoProveedor.setId_actividad_economica(regProveedor.getId_actividad_economica());
                } else {
                    tipoProveedor.setId_actividad_economica(1); //default
                }
                if (regProveedor.getId_tipo_comercio() != null) {
                    tipoProveedor.setId_tipo_comercio(regProveedor.getId_tipo_comercio());
                } else {
                    tipoProveedor.setId_tipo_comercio(1); //default
                }
                if (regProveedor.getRazon_social() != null) {
                    tipoProveedor.setRazon_social(regProveedor.getRazon_social());
                }
                Integer nextv = tipoDao.ProveedorSPnextID();
                System.out.println(" ProveedorSPnextID: " + nextv);

                tipoProveedor.setId_proveedor(nextv);
                tipoDao.saveProveedor(tipoProveedor);
                response.setValue(tipoProveedor);
                //actualizar email
                if (regProveedor.getCorreo() != null && !regProveedor.getCorreo().trim().equals("")) {
                    TipoEmail vemail = new TipoEmail();
                    vemail.setCorreo_electronico(regProveedor.getCorreo());
                    vemail.setFecha_adicion(new Date());
                    vemail.setId_proveedor(tipoProveedor.getId_proveedor());
                    vemail.setUsuario_adiciono(pUsuarioOperacion);
                    tipoDao.saveEmail(vemail);
                }
                //actualizar telefono
                if (regProveedor.getTelefono() != null && !regProveedor.getTelefono().trim().equals("")) {
                    TipoTelefono vtelefono = new TipoTelefono();
                    vtelefono.setFecha_adicion(new Date());
                    vtelefono.setId_proveedor(tipoProveedor.getId_proveedor());
                    vtelefono.setTelefono(regProveedor.getTelefono());
                    vtelefono.setTipo_telefono(3);
                    vtelefono.setUsuario_adiciono(pUsuarioOperacion);
                    tipoDao.saveTelefono(vtelefono);
                }
            }
            //revisar si correo esta activo en parametros de sistema
            TipoEmailFuente efuente = tipoDao.findByIdEmailFuente(Constants.REG_DIACO_FUENTE_EMAIL_PROVEEDOR_APROBADO);
            if (efuente != null) {
                if (efuente.getActivo() == 1) {
                    //correo a proveedor con su qr
                    String cuerpo = "Estimado Proveedor, su solicitud de registro a proveedores de DIACO ha sido aprobada.<br>"
                            + "Adjunto a este correo hay un link para ver los detalles:<br>"
                            + "<a href='" + efuente.getDireccion() + "/" + regProveedor.getNit() + "'>Detalles Confirmaci&oacute;n</a>";
                    String[] mailstring = GetEmailStringUsuario(regProveedor.getCorreo_notif());
                    //saveEmailEnviar(mailstring, Constants.REG_DIACO_FUENTE_EMAIL_PROVEEDOR_APROBADO, cuerpo);

                    this.procesarNotificacionCorreo(mailstring, regProveedor.getNombre(),
                            Constants.REG_DIACO_FUENTE_EMAIL_RESET_PASSWORD,
                            cuerpo);
                }
            }
            response.setCode(0L);
            response.setReason("OK");
            //response.setValue(single_element2);
            transaction.commit();
            System.out.println("aprobarSolicitudProveedor: Finalizado.");
        } catch (Exception e) {
            e.printStackTrace();
            response.setCode(1L);
            response.setReason("ERROR");
            try {
                transaction.rollback();
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
        return response;
    }

    /**
     * Metodo que sirve para procesar la aprobacion de la solicitud del usuario.
     * <p>
     * Ejecuta un proceso que realiza:
     * <ul>
     * <li>aprobarSolicitudProveedor
     * {@link TipoAreaComunService#aprobarSolicitudProveedor}</li>
     * <li>crearUsuarioProveedor
     * {@link TipoAreaComunService#crearUsuarioProveedor}</li>
     * </ul>
     *
     * @param pToken Token de seguridad.
     * @param pEstado Estado del usuario.
     * @param pIdUsuario Identificador del usuario.
     * @param pUsuarioOperacion Usuario que realiza la operacion.
     * @return Respuesta del tipo {@link ResponseRs}.
     */
    @Override
    public ResponseRs procesarAprobacionUsuario(String pToken, String pEstado,
            Integer pIdUsuario, Integer pUsuarioOperacion) {

        ResponseRs respuesta;
        System.out.println("Metodo: procesarAprobacionUsuario.");
        System.out.println("pToken: " + pToken);
        System.out.println("pEstado: " + pEstado);
        System.out.println("pIdUsuario: " + pIdUsuario);
        System.out.println("pUsuarioOperacion: " + pUsuarioOperacion);

        // Primer proceso.
        respuesta = this.aprobarSolicitudProveedor(pToken, pEstado, pIdUsuario, pUsuarioOperacion);
        if (respuesta.getReason().equalsIgnoreCase(ERROR)) {
            return respuesta;
        } else {
            FormConfUsuario formularioCrearUsuario = new FormConfUsuario();
            formularioCrearUsuario.setToken(pToken);
            formularioCrearUsuario.setId_usuario(pIdUsuario);
            // Segundo proceso.
            respuesta = this.crearUsuarioProveedor(formularioCrearUsuario, pUsuarioOperacion);
        }

        return respuesta;
    }

}
