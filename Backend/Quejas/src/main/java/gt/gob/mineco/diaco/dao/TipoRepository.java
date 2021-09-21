package gt.gob.mineco.diaco.dao;

import gt.gob.mineco.diaco.dto.AudienciaRegistrosJuridicoDto;
import gt.gob.mineco.diaco.model.TIpoReg_CedulaCitacionConJur;
import gt.gob.mineco.diaco.model.TipoActividadEconomica;
import gt.gob.mineco.diaco.model.TipoAreaInterna;
import gt.gob.mineco.diaco.model.TipoAudiencia;
import gt.gob.mineco.diaco.model.TipoAudienciaRegistros;
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
import gt.gob.mineco.diaco.model.TipoEstadoQueja;
import gt.gob.mineco.diaco.model.TipoEtnia;
import gt.gob.mineco.diaco.model.TipoExpiracion;
import gt.gob.mineco.diaco.model.TipoFlujo;
import gt.gob.mineco.diaco.model.TipoFlujoGuia;
import gt.gob.mineco.diaco.model.TipoImagenesInterno;
import gt.gob.mineco.diaco.model.TipoImagenesProveedor;
import gt.gob.mineco.diaco.model.TipoImagenesQueja;
import gt.gob.mineco.diaco.model.TipoMagicLink;
import gt.gob.mineco.diaco.model.TipoMailServer;
import gt.gob.mineco.diaco.model.TipoMotivoPOA;
import gt.gob.mineco.diaco.model.TipoMotivoQueja;
import gt.gob.mineco.diaco.model.TipoMotivoQuejaFinalizada;
import gt.gob.mineco.diaco.model.TipoMovimExp;
import gt.gob.mineco.diaco.model.TipoMovimExpDetalle;
import gt.gob.mineco.diaco.model.TipoMovimientos;
import gt.gob.mineco.diaco.model.TipoMunicipio;
import gt.gob.mineco.diaco.model.TipoPais;
import gt.gob.mineco.diaco.model.TipoParamGeneral;
import gt.gob.mineco.diaco.model.TipoPasoQueja;
import gt.gob.mineco.diaco.model.TipoPerfilesPuesto;
import gt.gob.mineco.diaco.model.TipoPlantilla;
import gt.gob.mineco.diaco.model.TipoPortalLinks;
import gt.gob.mineco.diaco.model.TipoProgramaAudiencia;
import gt.gob.mineco.diaco.model.TipoProveedor;
import gt.gob.mineco.diaco.model.TipoProveedorAprobar;
import gt.gob.mineco.diaco.model.TipoProveedorComun;
import gt.gob.mineco.diaco.model.TipoPuesto;
import gt.gob.mineco.diaco.model.TipoQRpath;
import gt.gob.mineco.diaco.model.TipoQueja;
import gt.gob.mineco.diaco.model.TipoQuejaAsignacion;
import gt.gob.mineco.diaco.model.TipoQuejaFinalizada;
import gt.gob.mineco.diaco.model.TipoQuejaRegistro;
import gt.gob.mineco.diaco.model.TipoQueja_MainAtCon;
import gt.gob.mineco.diaco.model.TipoQueja_Simple;
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
import gt.gob.mineco.diaco.model.TipoRepositorio;
import gt.gob.mineco.diaco.model.TipoResAudiencia;
import gt.gob.mineco.diaco.model.TipoResFinal;
import gt.gob.mineco.diaco.model.TipoResultadoAudiencia;
import gt.gob.mineco.diaco.model.TipoSede;
import gt.gob.mineco.diaco.model.TipoSucursal;
import gt.gob.mineco.diaco.model.TipoTareaProgramadaEjec;
import gt.gob.mineco.diaco.model.TipoTelefono;
import gt.gob.mineco.diaco.model.TipoTipoCola;
import gt.gob.mineco.diaco.model.TipoTipoConsumidor;
import gt.gob.mineco.diaco.model.TipoTipoImagen;
import gt.gob.mineco.diaco.model.TipoUsuario;
import gt.gob.mineco.diaco.model.TipoUsuarioPerfil;
import gt.gob.mineco.diaco.model.TipoUsuario_Conf;
import gt.gob.mineco.diaco.model.TipoUsuario_Simple;
import gt.gob.mineco.diaco.model.TipoVerifConcVirt;
import gt.gob.mineco.diaco.model.TipoVerifDatosInt;
import gt.gob.mineco.diaco.model.TipoViewMainQueja;
import gt.gob.mineco.diaco.model.TipoVisitaCampo;
import gt.gob.mineco.diaco.model.TipoVyvAsignaCola;
import gt.gob.mineco.diaco.model.Tipo_RegResArchivoConciliacion;
import gt.gob.mineco.diaco.service.SecurityManagerServiceImpl;
import gt.gob.mineco.diaco.util.CedulaNotificacionDto;
import gt.gob.mineco.diaco.util.Constants;
import gt.gob.mineco.diaco.util.FormBusqueda;
import gt.gob.mineco.diaco.util.FormUsuarioSrch;
import gt.gob.mineco.diaco.util.FormViewMainQueja1;
import gt.gob.mineco.diaco.util.FormViewMainQueja2;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TemporalType;
import javax.transaction.SystemException;

@ApplicationScoped
public class TipoRepository {

    @PersistenceContext
    //private EntityManagerFactory emf;
    private EntityManager em;
    //@Resource
    //UserTransaction utx;
    @Inject
    SecurityManagerServiceImpl security;

    //tokencheck
    public boolean TokenCheck(String token) throws Exception {
        boolean existeToken = security.getExisteToken(token);
        if (existeToken) {
            return true;
        } else {
            throw new Exception("Token no válido, proceso denegado.");
            //return false;
        }
    }

    //usuario
    public TipoUsuario findByIdUsuarioSec(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario.class);
        return em.find(TipoUsuario.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<TipoViewMainQueja> findAllTipoViewMainQueja() {
        this.em.getEntityManagerFactory().getCache().evict(TipoViewMainQueja.class);
        return em.createNamedQuery("TipoViewMainQueja.noFilter").getResultList();
    }

    /*
        @SuppressWarnings("unchecked")
	public List<TipoViewMainQueja> findTipoViewMainQuejaCustomFilter(FormViewMainQueja2 formViewMainQueja){
                String querystring = "SELECT v FROM TipoViewMainQueja v where 1=1";
                
                //armar el query dinamico en base a los parametros 
                if(formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null)
                    querystring = querystring + " and v.fecha_queja between :fromdate and :todate";
                if(formViewMainQueja.getEstado() != null){
                    switch(formViewMainQueja.getEstado()){
                        case 999://activos
                            querystring = querystring +  " and v.id_estado_queja in (101,102,103,104,105,106)";
                            break;
                        case 998://todos, activos e inactivos
                            break;
                        default:
                            querystring = querystring +  " and v.id_estado_queja = :estado";
                            break;
                    }
                }
                if(formViewMainQueja.getId_proveedor() != null)
                    querystring = querystring + " and v.id_proveedor = :id_proveedor";
                if(formViewMainQueja.getId_departamento() != null)
                    querystring = querystring + " and v.id_departamento = :id_departamento";
                if(formViewMainQueja.getId_municipio()!= null)
                    querystring = querystring + " and v.id_municipio = :id_municipio";
                
                querystring = querystring + " ORDER BY v.fecha_queja desc";    
                Query nq = this.em.createQuery(querystring, TipoViewMainQueja.class);
                
                //adjuntar parametros y valores en base a parametros
                if(formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null){
                    nq.setParameter("fromdate", formViewMainQueja.getFecha_desde(), TemporalType.DATE);
                    nq.setParameter("todate", formViewMainQueja.getFecha_hasta(), TemporalType.DATE);
                }
                if(formViewMainQueja.getEstado() != null){
                    if(formViewMainQueja.getEstado() < 900)
                        nq.setParameter("estado", formViewMainQueja.getEstado());
                }
                if(formViewMainQueja.getId_proveedor() != null)
                    nq.setParameter("id_proveedor", formViewMainQueja.getId_proveedor());
                if(formViewMainQueja.getId_departamento() != null)
                    nq.setParameter("id_departamento", formViewMainQueja.getId_departamento());
                if(formViewMainQueja.getId_municipio() != null)
                    nq.setParameter("id_municipio", formViewMainQueja.getId_municipio());

                return nq.getResultList();                
	}
     */
 /*
        @SuppressWarnings("unchecked")
	public List<TipoViewMainQueja> findAllTipoViewMainQuejaDate(Date from, Date to){
		return em.createNamedQuery("TipoViewMainQueja.FilterDate").setParameter("fromdate", from, TemporalType.DATE).setParameter("todate", to, TemporalType.DATE).getResultList();
	}
        
        @SuppressWarnings("unchecked")
	public List<TipoViewMainQueja> findAllTipoViewMainQuejaOne(Integer filter){
		return em.createNamedQuery("TipoViewMainQueja.FilterOne").setParameter("estado", filter).getResultList();
	}
        
        @SuppressWarnings("unchecked")
	public List<TipoViewMainQueja> findAllTipoViewMainQuejaDateOne(Date from, Date to, Integer filter){
                Query nq = this.em.createQuery("SELECT v FROM TipoViewMainQueja v where v.fecha_queja between :fromdate and :todate and v.id_estado_queja = :estado ORDER BY v.fecha_queja desc", TipoViewMainQueja.class);
                nq.setParameter("fromdate", from, TemporalType.DATE);
                nq.setParameter("todate", to, TemporalType.DATE);
                nq.setParameter("estado", filter);
                return nq.getResultList();
		//return em.createNamedQuery("TipoViewMainQueja.FilterDateOne").setParameter("fromdate", from, TemporalType.DATE).setParameter("todate", to, TemporalType.DATE).setParameter("estado", filter).getResultList();
	}

        @SuppressWarnings("unchecked")
	public List<TipoViewMainQueja> FilterActiveViewMainQueja(){
		return em.createNamedQuery("TipoViewMainQueja.FilterActive").getResultList();
	}
	
        @SuppressWarnings("unchecked")
	public List<TipoViewMainQueja> FilterActiveViewMainQueja(Date from, Date to){
		return em.createNamedQuery("TipoViewMainQueja.FilterActiveDate").setParameter("fromdate", from, TemporalType.DATE).setParameter("todate", to, TemporalType.DATE).getResultList();
	}
     */
    @SuppressWarnings("unchecked")
    public List<TipoBitacora> findAllTiposBitacora(Integer idqueja, Integer idflujo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoBitacora.class);
        switch (idflujo) {
            case 1:
                return em.createNamedQuery("TipoBitacora.findAllFlujoConsumidor").setParameter("idqueja", idqueja).getResultList();
            case 2:
                return em.createNamedQuery("TipoBitacora.findAllFlujoJuridico").setParameter("idqueja", idqueja).getResultList();
            case 3:
                return em.createNamedQuery("TipoBitacora.findAllFlujoVyV").setParameter("idqueja", idqueja).getResultList();
            case 4:
                return em.createNamedQuery("TipoBitacora.findAllFlujoConcVirt").setParameter("idqueja", idqueja).getResultList();
            case 6:
                return em.createNamedQuery("TipoBitacora.findAllFlujoServPub").setParameter("idqueja", idqueja).getResultList();
        }
        return null;
    }

    public TipoBitacora findByIdBitacora(double id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoBitacora.class);
        return em.find(TipoBitacora.class, id);
    }

    public void saveBitacora(TipoBitacora tipoBitacora) throws SystemException {
        em.persist(tipoBitacora);
    }

    public void deleteBitacora(TipoBitacora tipoBitacora) throws SystemException {
        em.remove(tipoBitacora);
    }

    public TipoProveedor findProveedorById(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedor.class);
        return em.find(TipoProveedor.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllTiposQueja() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllTiposQueja(Integer id, String Type) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        if (Type.equalsIgnoreCase("C")) {
            return em.createNamedQuery("TipoQueja.findAllbyConsumidor").setParameter("id_consumidor", id).getResultList();
        } else if (Type.equalsIgnoreCase("P")) {
            return em.createNamedQuery("TipoQueja.findAllbyProveedor").setParameter("id_proveedor", id).getResultList();
        }
        return null;
    }

    public TipoQueja findByIdQueja(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoEstadoQueja.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        System.out.println("Entrando a findByIdQueja (idqueja): "+idqueja);
        return em.find(TipoQueja.class, idqueja);
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllTiposQuejaPendienteRuteo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllPendienteRuteo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllExpiradoAtConCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllExpiradoAtConCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllExpiradoJurCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllExpiradoJurCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllExpiradoVyVCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllExpiradoVyVCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllExpiradoSPCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllExpiradoSPCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllAlertaExpiradoAtConCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllAlertaExpiradoAtConCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllAlertaExpiradoJurCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllAlertaExpiradoJurCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllAlertaExpiradoVyVCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllAlertaExpiradoVyVCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja> findAllAlertaExpiradoSPCorreo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        return em.createNamedQuery("TipoQueja.findAllAlertaExpiradoSPCorreo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoQueja findTipoQuejaCodigo(String codigoqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        List<TipoQueja> DataList = em.createNamedQuery("TipoQueja.findbyCodigo").setParameter("codigoqueja", codigoqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void saveQueja(TipoQueja tipoQueja) {
        em.persist(tipoQueja);
    }

    public void deleteQueja(TipoQueja tipoQueja) {
        em.persist(tipoQueja);
    }

    @SuppressWarnings("unchecked")
    public TipoPasoQueja findByTypePasoQueja(Integer id_queja, Integer id_tipo_registro) {
        this.em.getEntityManagerFactory().getCache().evict(TipoPasoQueja.class);
        return getFirstResultOrNull(em.createNamedQuery("TipoPasoQueja.findByType").setParameter("id_queja", id_queja).setParameter("id_tipo_registro", id_tipo_registro));
    }

    public static TipoPasoQueja getFirstResultOrNull(Query query) {

        List results = query.getResultList();
        if (results.isEmpty()) {
            return null;
        } else if (results.size() >= 1) {
            return (TipoPasoQueja) results.get(0);
        }
        throw new NonUniqueResultException();
    }

    @SuppressWarnings("unchecked")
    public List<TipoPasoQueja> findAllTiposPasoQueja(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoPasoQueja.class);
        return em.createNamedQuery("TipoPasoQueja.findAll").setParameter("idqueja", idqueja).getResultList();
    }

    public TipoPasoQueja findByIdPasoQueja(double id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoPasoQueja.class);
        return em.find(TipoPasoQueja.class, id);
    }

    public void savePasoQueja(TipoPasoQueja tipoPasoQueja) {
        em.persist(tipoPasoQueja);
    }

    public void deletePasoQueja(TipoPasoQueja tipoPasoQueja) {
        em.persist(tipoPasoQueja);
    }
    //catalogo

    @SuppressWarnings("unchecked")
    public List<TipoCatalogo> findAllTipoCatalogo(String tabla) {
        this.em.getEntityManagerFactory().getCache().evict(TipoCatalogo.class);
        return em.createNamedQuery("TipoCatalogo.findAll").setParameter("tabla", tabla).getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoCatalogo findTipoCatalogo(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoCatalogo.class);
        return em.find(TipoCatalogo.class, id);
    }

    //comunicacion con consumidor
    @SuppressWarnings("unchecked")
    public List<TipoComConsumidor> findAllTiposComConsumidores(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoComConsumidor.class);
        return em.createNamedQuery("TipoComConsumidor.findAll").setParameter("idqueja", idqueja).getResultList();
    }
    
    @SuppressWarnings("unchecked")
    public List<TipoComConsumidor> findAllComConsumidorInd(Integer idqueja, Integer idcomunicacionconsumidor) {
        this.em.getEntityManagerFactory().getCache().evict(TipoComConsumidor.class);
        return em.createNamedQuery("TipoComConsumidor.findInd").setParameter("idcomunicacionconsumidor", idcomunicacionconsumidor).getResultList();
    }
    
    @SuppressWarnings("unchecked")
    public TipoComConsumidor findAllTiposComConsumidor(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoComConsumidor.class);
        return getSingleResultOrNull(em.createNamedQuery("TipoComConsumidor.findAll").setParameter("idqueja", idqueja));
    }

    public static TipoComConsumidor getSingleResultOrNull(Query query) {
        List results = query.getResultList();
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return (TipoComConsumidor) results.get(0);
        }
        throw new NonUniqueResultException();
    }

    public TipoComConsumidor findByIdComConsumidor(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoComConsumidor.class);
        return em.find(TipoComConsumidor.class, id);
    }

    public void saveComConsumidor(TipoComConsumidor tipoComConsumidor) {
        em.persist(tipoComConsumidor);
    }

    @SuppressWarnings("unchecked")
    public List<TipoEmail> findAllTiposEmail(Integer id, String Type) {
        this.em.getEntityManagerFactory().getCache().evict(TipoEmail.class);
        if (Type.equalsIgnoreCase("C")) {
            return em.createNamedQuery("TipoEmail.findAllC").setParameter("id_consumidor", id).getResultList();
        } else if (Type.equalsIgnoreCase("P")) {
            return em.createNamedQuery("TipoEmail.findAllP").setParameter("id_proveedor", id).getResultList();
        }
        return null;
    }

    public TipoEmail findByIdEmail(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoEmail.class);
        return em.find(TipoEmail.class, id);
    }

    /**
     * Busqueda de base de datos:
     * <p>
     * Todos los email registrados para cierto proveedor.
     *
     * @param pCodigoProveedor Codigo del proveedor.
     * @return Listado que contiene {@link TipoEmail}
     */
    public List<TipoEmail> findByCodigoProveedor(Integer pCodigoProveedor) {
        return em.createNamedQuery("TipoEmail.findAllP").
                setParameter("id_proveedor", pCodigoProveedor).getResultList();
    }

    public void saveEmail(TipoEmail tipoEmail) throws SystemException {
        em.persist(tipoEmail);
    }

    public void deleteEmail(TipoEmail tipoEmail) throws SystemException {
        em.remove(tipoEmail);
    }

    @SuppressWarnings("unchecked")
    public List<TipoTelefono> findAllTiposTelefono(Integer id, String Type) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTelefono.class);
        if (Type.equalsIgnoreCase("C")) {
            return em.createNamedQuery("TipoTelefono.findAllC").setParameter("id_consumidor", id).getResultList();
        } else if (Type.equalsIgnoreCase("P")) {
            return em.createNamedQuery("TipoTelefono.findAllP").setParameter("id_proveedor", id).getResultList();
        }
        return null;
    }

    public TipoTelefono findByIdTelefono(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTelefono.class);
        return em.find(TipoTelefono.class, id);
    }

    public void saveTelefono(TipoTelefono tipoTelefono) throws SystemException {
        em.persist(tipoTelefono);
    }

    public void deleteTelefono(TipoTelefono tipoTelefono) throws SystemException {
        em.remove(tipoTelefono);
    }
    //consumidor

    @SuppressWarnings("unchecked")
    public List<TipoConsumidor> findAllTiposConsumidor() {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        return em.createNamedQuery("TipoComConsumidor.findAll").getResultList();
    }

    public TipoConsumidor findByIdConsumidor(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        return em.find(TipoConsumidor.class, id);
    }

    public void saveConsumidor(TipoConsumidor tipoConsumidor) throws SystemException {
        em.persist(tipoConsumidor);
    }

    public void deleteConsumidor(TipoConsumidor tipoConsumidor) throws SystemException {
        em.remove(tipoConsumidor);
    }

    @SuppressWarnings("unchecked")
    public List<TipoConsumidor> CustomFilterConsumidor(FormBusqueda formBusqueda) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);

        String querystring = "SELECT v FROM TipoConsumidor v where v.habilitado='1'";

        if (!formBusqueda.getCon_nombre().isEmpty()) {
            querystring = querystring + " and ( coalesce(CONCAT( UPPER(v.nombre1), ' '),'') + coalesce(CONCAT( UPPER(v.nombre2), ' '),'') + coalesce(UPPER(v.nombre3),'') ) LIKE UPPER(:con_nombre)";
        }
        if (!formBusqueda.getCon_apellido().isEmpty()) {
            querystring = querystring + " and ( coalesce(CONCAT( UPPER(v.apellido1), ' '),'') + coalesce(CONCAT( UPPER(v.apellido2), ' '),'') + coalesce(UPPER(v.apellido_casada),'') ) LIKE UPPER(:con_apellido)";
        }
        if (!formBusqueda.getCon_dpi().isEmpty()) {
            querystring = querystring + " and UPPER(v.documento_identificacion) LIKE UPPER(:con_dpi)";
        }
        if (!formBusqueda.getCon_nit().isEmpty()) {
            querystring = querystring + " and UPPER(v.nit_consumidor) LIKE UPPER(:con_nit)";
        }
        Query nq = this.em.createQuery(querystring, TipoConsumidor.class).setMaxResults(100);
        String param;
        if (!formBusqueda.getCon_nombre().isEmpty()) {
            param = "%" + formBusqueda.getCon_nombre().replaceAll(" ", "%") + "%";
            System.out.println(param);
            nq.setParameter("con_nombre", param);
        }
        if (!formBusqueda.getCon_apellido().isEmpty()) {
            param = "%" + formBusqueda.getCon_apellido().replaceAll(" ", "%") + "%";
            nq.setParameter("con_apellido", param);
        }
        if (!formBusqueda.getCon_dpi().isEmpty()) {
            param = "%" + formBusqueda.getCon_dpi().replaceAll(" ", "%") + "%";
            nq.setParameter("con_dpi", param);
        }
        if (!formBusqueda.getCon_nit().isEmpty()) {
            param = "%" + formBusqueda.getCon_nit().replaceAll(" ", "%") + "%";
            nq.setParameter("con_nit", param);
        }
        return nq.getResultList();
    }

    //departamento
    @SuppressWarnings("unchecked")
    public List<TipoDepartamento> findAllTiposDepartamento() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamento.class);
        return em.createNamedQuery("TipoDepartamento.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTiposDepartamento() {

        return em.createQuery("select max(t.codigo_departamento) from TipoDepartamento t ").getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTipoProveedor() {
        return em.createQuery("select max(t.id_proveedor) from TipoProveedor t ").getSingleResult();
    }

    public TipoDepartamento findByIdDepartamento(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamento.class);
        return em.find(TipoDepartamento.class, id);
    }

    public void saveDepartamento(TipoDepartamento tipoDepartamento) throws SystemException {
        em.persist(tipoDepartamento);
    }

    public void deleteDepartamento(TipoDepartamento tipoDepartamento) throws SystemException {
        em.remove(tipoDepartamento);
    }
    //municipio

    @SuppressWarnings("unchecked")
    public List<TipoMunicipio> findAllTiposMunicipio() {
        this.em.getEntityManagerFactory().getCache().evict(TipoMunicipio.class);
        return em.createNamedQuery("TipoMunicipio.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoMunicipio> findAllTiposMunicipio(Integer id_departamento) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMunicipio.class);
        return em.createNamedQuery("TipoMunicipio.findAllbyDpto").setParameter("id_departamento", id_departamento).getResultList();
    }

    public TipoMunicipio findByIdMunicipio(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMunicipio.class);
        return em.find(TipoMunicipio.class, id);
    }

    public TipoActividadEconomica findByIdActividadEconomica(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoActividadEconomica.class);
        return em.find(TipoActividadEconomica.class, id);
    }

    public TipoComercio findByIdTipoComercio(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoComercio.class);
        return em.find(TipoComercio.class, id);
    }

    public void saveMunicipio(TipoMunicipio tipoMunicipio) throws SystemException {
        em.persist(tipoMunicipio);
    }

    public void deleteMunicipio(TipoMunicipio tipoMunicipio) throws SystemException {
        em.remove(tipoMunicipio);
    }
    //conciliacion virtual

    @SuppressWarnings("unchecked")
    public TipoVerifConcVirt findAllVerifConcVirt(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVerifConcVirt.class);
        List<TipoVerifConcVirt> DataList = em.createNamedQuery("TipoVerifConcVirt.findAll").setParameter("idqueja", idqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoVerifConcVirt findByIdVerifConcVirt(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVerifConcVirt.class);
        return em.find(TipoVerifConcVirt.class, id);
    }

    public void saveVerifConcVirt(TipoVerifConcVirt tipoComConsumidor) {
        em.persist(tipoComConsumidor);
    }

    public void deleteVerifConcVirt(TipoVerifConcVirt tipoComConsumidor) {
        em.remove(tipoComConsumidor);
    }

    private Date AddOneDaytoDate(Date dt) {
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        dt = c.getTime();
        return dt;
    }

    //QuejaJoin
    @SuppressWarnings("unchecked")
    public List<TipoQueja_MainAtCon> findTipoQuejaCustomFilter1(FormViewMainQueja1 formViewMainQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujoGuia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_MainAtCon.class);
        Query nq;
        try {
            String querystring = "SELECT v FROM TipoQueja_MainAtCon v where 1=1";
            //si se esta buscando por # de queja ignorar los demas parametros
            if (!formViewMainQueja.getNo_queja().isEmpty()) {
                querystring = querystring + " and CONCAT(UPPER(v.no_queja), '-',UPPER(v.anio)) = :noqueja";
                if (RolFlujo_AtencionalConsumidor(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoQueja_MainAtCon.class).setMaxResults(2000);
                /*String param="%"+formViewMainQueja.getNo_queja().replaceAll(" ","%")+"%";
                    nq.setParameter("noqueja", param);*/
                nq.setParameter("noqueja", formViewMainQueja.getNo_queja());
                if (RolFlujo_AtencionalConsumidor(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            } else {
                //armar el query dinamico en base a los parametros 
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    querystring = querystring + " and v.fecha_queja between :fromdate and :todate";
                }
                if (formViewMainQueja.getEstado() != null) {
                    switch (formViewMainQueja.getEstado()) {
                        case 999://activos
                            querystring = querystring + " and v.id_estado_queja in (101,102,103,104,105,106)";
                            break;
                        case 998://todos, activos e inactivos
                            break;
                        case 997://pendiente de confirmación
                            querystring = querystring + " and v.id_estado_queja in (129,130,131,132,133,229,230,231,232,233,330,630)";
                            break;
                        default:
                            querystring = querystring + " and v.id_estado_queja = :estado";
                            break;
                    }
                }
                if (RolFlujo_AtencionalConsumidor(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoViewMainQueja.class);

                //adjuntar parametros y valores en base a parametros
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    nq.setParameter("fromdate", StrtoDate(formViewMainQueja.getFecha_desde(), ""), TemporalType.DATE);

                    nq.setParameter("todate", StrtoDateAdd1Day(formViewMainQueja.getFecha_hasta(), ""), TemporalType.DATE);
                }
                if (formViewMainQueja.getEstado() != null) {
                    if (formViewMainQueja.getEstado() < 900) {
                        nq.setParameter("estado", formViewMainQueja.getEstado());
                    }
                }

                if (RolFlujo_AtencionalConsumidor(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            }
            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Date StrtoDate(String fecha, String hora) throws Exception {
        String hora_loc;
        if (hora.equals("")) {
            hora_loc = "00:00:00";
        } else {
            hora_loc = hora + ":00";
        }
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date dt = df.parse(fecha + " " + hora_loc);
        return dt;
    }

    private Date StrtoDateAdd1Day(String fecha, String hora) throws Exception {
        String hora_loc;
        if (hora.equals("")) {
            hora_loc = "00:00:00";
        } else {
            hora_loc = hora + ":00";
        }
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        Date dt = df.parse(fecha + " " + hora_loc);
        return AddOneDaytoDate(dt);
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_MainAtCon> findTipoQuejaCustomFilterSP(FormViewMainQueja1 formViewMainQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujoGuia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_MainAtCon.class);
        try {
            Query nq;
            String querystring = "SELECT v FROM TipoQueja_MainAtCon v where v.tipoflujoguia.sp_flag = TRUE";
            //si se esta buscando por # de queja ignorar los demas parametros
            if (!formViewMainQueja.getNo_queja().isEmpty()) {
                querystring = querystring + " and CONCAT(UPPER(v.no_queja), '-',UPPER(v.anio)) = :noqueja";
                if (RolFlujo_ServiciosPublicos(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoQueja_MainAtCon.class).setMaxResults(2000);
                /*String param="%"+formViewMainQueja.getNo_queja().replaceAll(" ","%")+"%";
                    nq.setParameter("noqueja", param);*/
                nq.setParameter("noqueja", formViewMainQueja.getNo_queja());
                if (RolFlujo_ServiciosPublicos(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            } else {
                //armar el query dinamico en base a los parametros 
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    querystring = querystring + " and v.fecha_queja between :fromdate and :todate";
                }
                if (formViewMainQueja.getEstado() != null) {
                    switch (formViewMainQueja.getEstado()) {
                        case 999://activos
                            querystring = querystring + " and v.id_estado_queja in (601)";
                            break;
                        case 998://todos, activos e inactivos
                            break;
                        case 997://pendiente de confirmación
                            querystring = querystring + " and v.id_estado_queja in (129,130,131,132,133,229,230,231,232,233,330,630)";
                            break;
                        case 996:
                            querystring = querystring + " and v.id_estado_queja in (101,102,103,104,105,106)";
                            break;
                        default:
                            querystring = querystring + " and v.id_estado_queja = :estado";
                            break;
                    }
                }
                if (RolFlujo_ServiciosPublicos(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoViewMainQueja.class);

                //adjuntar parametros y valores en base a parametros
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    nq.setParameter("fromdate", StrtoDate(formViewMainQueja.getFecha_desde(), ""), TemporalType.DATE);
                    nq.setParameter("todate", StrtoDateAdd1Day(formViewMainQueja.getFecha_hasta(), ""), TemporalType.DATE);
                }
                if (formViewMainQueja.getEstado() != null) {
                    if (formViewMainQueja.getEstado() < 900) {
                        nq.setParameter("estado", formViewMainQueja.getEstado());
                    }
                }

                if (RolFlujo_ServiciosPublicos(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            }
            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_MainAtCon> findTipoQuejaCustomFilterVyV(FormViewMainQueja1 formViewMainQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujoGuia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_MainAtCon.class);
        try {
            Query nq;
            String querystring = "SELECT v FROM TipoQueja_MainAtCon v where v.tipoflujoguia.vyv_flag = TRUE";
            //si se esta buscando por # de queja ignorar los demas parametros
            if (!formViewMainQueja.getNo_queja().isEmpty()) {
                querystring = querystring + " and CONCAT(UPPER(v.no_queja), '-',UPPER(v.anio)) = :noqueja";
                if (RolFlujo_VerificacionVigilancia(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoQueja_MainAtCon.class).setMaxResults(2000);
                /*String param="%"+formViewMainQueja.getNo_queja().replaceAll(" ","%")+"%";
                    nq.setParameter("noqueja", param);*/
                nq.setParameter("noqueja", formViewMainQueja.getNo_queja());
                if (RolFlujo_VerificacionVigilancia(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            } else {
                //armar el query dinamico en base a los parametros 
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    querystring = querystring + " and v.fecha_queja between :fromdate and :todate";
                }
                if (formViewMainQueja.getEstado() != null) {
                    switch (formViewMainQueja.getEstado()) {
                        case 999://activos
                            querystring = querystring + " and v.id_estado_queja in (301,302,303)";
                            break;
                        case 998://todos, activos e inactivos
                            break;
                        case 997://pendiente de confirmación
                            querystring = querystring + " and v.id_estado_queja in (129,130,131,132,133,229,230,231,232,233,330,630)";
                            break;
                        case 996:
                            querystring = querystring + " and v.id_estado_queja in (101,102,103,104,105,106)";
                            break;
                        default:
                            querystring = querystring + " and v.id_estado_queja = :estado";
                            break;
                    }
                }
                if (RolFlujo_VerificacionVigilancia(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoViewMainQueja.class);

                //adjuntar parametros y valores en base a parametros
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    nq.setParameter("fromdate", StrtoDate(formViewMainQueja.getFecha_desde(), ""), TemporalType.DATE);
                    nq.setParameter("todate", StrtoDateAdd1Day(formViewMainQueja.getFecha_hasta(), ""), TemporalType.DATE);
                }
                if (formViewMainQueja.getEstado() != null) {
                    if (formViewMainQueja.getEstado() < 900) {
                        nq.setParameter("estado", formViewMainQueja.getEstado());
                    }
                }

                if (RolFlujo_VerificacionVigilancia(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            }
            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_MainAtCon> findTipoQuejaCustomFilterJuridico(FormViewMainQueja1 formViewMainQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujoGuia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_MainAtCon.class);
        try {
            Query nq;
            String querystring = "SELECT v FROM TipoQueja_MainAtCon v where v.tipoflujoguia.jur_flag = TRUE";
            //si se esta buscando por # de queja ignorar los demas parametros
            if (!formViewMainQueja.getNo_queja().isEmpty()) {
                querystring = querystring + " and CONCAT(UPPER(v.no_queja), '-',UPPER(v.anio)) = :noqueja";
                if (RolFlujo_Juridico(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoQueja_MainAtCon.class).setMaxResults(2000);
                /*String param="%"+formViewMainQueja.getNo_queja().replaceAll(" ","%")+"%";
                    nq.setParameter("noqueja", param);*/
                nq.setParameter("noqueja", formViewMainQueja.getNo_queja());
                if (RolFlujo_Juridico(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            } else {
                //armar el query dinamico en base a los parametros 
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    querystring = querystring + " and v.fecha_queja between :fromdate and :todate";
                }
                if (formViewMainQueja.getEstado() != null) {
                    switch (formViewMainQueja.getEstado()) {
                        case 999://activos
                            querystring = querystring + " and v.id_estado_queja in (201,202,203,204,205,206)";
                            break;
                        case 998://todos, activos e inactivos
                            break;
                        case 997://pendiente de confirmación
                            querystring = querystring + " and v.id_estado_queja in (129,130,131,132,133,229,230,231,232,233,330,630)";
                            break;
                        case 996:
                            querystring = querystring + " and v.id_estado_queja in (101,102,103,104,105,106)";
                            break;
                        default:
                            querystring = querystring + " and v.id_estado_queja = :estado";
                            break;
                    }
                }
                if (RolFlujo_Juridico(formViewMainQueja.getUsuario()) <= 1) {
                    querystring = querystring + " and v.usuario_asignado = :usuario";
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoViewMainQueja.class);

                //adjuntar parametros y valores en base a parametros
                if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                    nq.setParameter("fromdate", StrtoDate(formViewMainQueja.getFecha_desde(), ""), TemporalType.DATE);
                    nq.setParameter("todate", StrtoDateAdd1Day(formViewMainQueja.getFecha_hasta(), ""), TemporalType.DATE);
                }
                if (formViewMainQueja.getEstado() != null) {
                    if (formViewMainQueja.getEstado() < 900) {
                        nq.setParameter("estado", formViewMainQueja.getEstado());
                    }
                }

                if (RolFlujo_Juridico(formViewMainQueja.getUsuario()) <= 1) {
                    nq.setParameter("usuario", formViewMainQueja.getUsuario());
                }
            }
            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_MainAtCon> findTipoQuejaCustomFilterBusqueda(FormBusqueda formBusqueda) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujoGuia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_MainAtCon.class);
        Query nq;
        String querystring = "SELECT v FROM TipoQueja_MainAtCon v";
        try {
            switch (formBusqueda.getId_flujo()) {
                case 2:
                    querystring = querystring + " where v.tipoflujoguia.jur_flag = TRUE";
                    break;
                case 3:
                    querystring = querystring + " where v.tipoflujoguia.vyv_flag = TRUE";
                    break;
                default:
                    querystring = querystring + " where 1=1";
            }

            //si se esta buscando por # de queja ignorar los demas parametros
            if (!formBusqueda.getNo_queja().isEmpty()) {
                querystring = querystring + " and CONCAT(UPPER(v.no_queja), '-',UPPER(v.anio)) like :noqueja";
                switch (formBusqueda.getId_flujo()) {
                    case 1:
                        if (RolFlujo_AtencionalConsumidor(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                    case 2:
                        if (RolFlujo_Juridico(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                    case 3:
                        if (RolFlujo_VerificacionVigilancia(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                    case 6:
                        if (RolFlujo_ServiciosPublicos(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                }
                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoQueja_MainAtCon.class);
                String param = "%" + formBusqueda.getNo_queja().replaceAll(" ", "%") + "%";
                nq.setParameter("noqueja", param);
                switch (formBusqueda.getId_flujo()) {
                    case 1:
                        if (RolFlujo_AtencionalConsumidor(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                    case 2:
                        if (RolFlujo_Juridico(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                    case 3:
                        if (RolFlujo_VerificacionVigilancia(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                    case 6:
                        if (RolFlujo_ServiciosPublicos(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                }
                //no se esta buscando por numero de queja, se consideran todos los demas parametros    
            } else {
                //armar el query dinamico en base a los parametros 
                if (formBusqueda.getFecha_desde() != null && formBusqueda.getFecha_hasta() != null) {
                    querystring = querystring + " and v.fecha_queja between :fromdate and :todate";
                }

                if (formBusqueda.getId_proveedor() != 0) {
                    querystring = querystring + " and v.id_proveedor = :proveedor";
                }

                if (formBusqueda.getId_consumidor() != 0) {
                    querystring = querystring + " and v.id_consumidor = :consumidor";
                }

                switch (formBusqueda.getId_flujo()) {
                    case 1:
                        if (RolFlujo_AtencionalConsumidor(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                    case 2:
                        if (RolFlujo_Juridico(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                    case 3:
                        if (RolFlujo_VerificacionVigilancia(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                    case 6:
                        if (RolFlujo_ServiciosPublicos(formBusqueda.getId_usuario()) <= 1) {
                            querystring = querystring + " and v.usuario_asignado = :usuario";
                        }
                        break;
                }

                switch (formBusqueda.getEstado()) {
                    case 0: //Todos
                        break;
                    case 1: //Activos
                        querystring = querystring + " and v.id_estado_queja not in (402,501)";
                        break;
                    case 2:
                        querystring = querystring + " and v.id_estado_queja in (402,501)";
                        break;
                }

                querystring = querystring + " ORDER BY v.fecha_queja desc";
                nq = this.em.createQuery(querystring, TipoQueja_MainAtCon.class).setMaxResults(100);

                //adjuntar parametros y valores en base a parametros
                if (formBusqueda.getFecha_desde() != null && formBusqueda.getFecha_hasta() != null) {
                    nq.setParameter("fromdate", StrtoDate(formBusqueda.getFecha_desde(), ""), TemporalType.DATE);
                    nq.setParameter("todate", StrtoDateAdd1Day(formBusqueda.getFecha_hasta(), ""), TemporalType.DATE);
                }
                if (formBusqueda.getId_proveedor() != 0) {
                    nq.setParameter("proveedor", formBusqueda.getId_proveedor());
                }
                if (formBusqueda.getId_consumidor() != 0) {
                    nq.setParameter("consumidor", formBusqueda.getId_consumidor());
                }
                switch (formBusqueda.getId_flujo()) {
                    case 1:
                        if (RolFlujo_AtencionalConsumidor(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                    case 2:
                        if (RolFlujo_Juridico(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                    case 3:
                        if (RolFlujo_VerificacionVigilancia(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                    case 6:
                        if (RolFlujo_ServiciosPublicos(formBusqueda.getId_usuario()) <= 1) {
                            nq.setParameter("usuario", formBusqueda.getId_usuario());
                        }
                        break;
                }
            }
            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Integer RolFlujo_AtencionalConsumidor(Integer id_usuario) {
        //1-normal, 2-revisor, 3-admin,2-verificador (actua como rol revisor para fines de filtro)
        Integer rol = 0;
        Integer rol_return = 0;
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario.class);

        TipoUsuario tipousuario = findByIdUsuarioSec(id_usuario);
        if (tipousuario != null) {
            for (TipoUsuarioPerfil loc : tipousuario.getTipoUsuarioPerfilList()) {
                if (loc.getTipoPerfilesPuesto().getTipoflujo() != null) {
                    if (loc.getTipoPerfilesPuesto().getTipoflujo().getId() == 1) {
                        //System.out.println("evaluate: "+loc.getTipoPerfilesPuesto().getPerfil());
                        switch (loc.getTipoPerfilesPuesto().getPerfil()) {
                            case "Normal":
                                rol = 1;
                                break;
                            case "Revisor":
                                rol = 2;
                                break;
                            case "Administrador":
                                rol = 3;
                                break;
                            case "Verificador":
                                rol = 2;
                                break;
                        }
                        if (rol_return < rol) {
                            rol_return = rol;
                        }
                    }
                }
            }
            //System.out.println("rol de java: "+rol_return.toString());
            return rol_return;
        } else {
            return 0;
        }
    }

    private Integer RolFlujo_ServiciosPublicos(Integer id_usuario) {
        //1-normal, 2-revisor, 3-admin
        Integer rol = 0;
        Integer rol_return = 0;
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario.class);
        TipoUsuario tipousuario = findByIdUsuarioSec(id_usuario);
        if (tipousuario != null) {
            for (TipoUsuarioPerfil loc : tipousuario.getTipoUsuarioPerfilList()) {
                if (loc.getTipoPerfilesPuesto().getTipoflujo() != null) {
                    if (loc.getTipoPerfilesPuesto().getTipoflujo().getId() == 6) {
                        //System.out.println("evaluate: "+loc.getTipoPerfilesPuesto().getPerfil());
                        switch (loc.getTipoPerfilesPuesto().getPerfil()) {
                            case "Normal":
                                rol = 1;
                                break;
                            case "Revisor":
                                rol = 2;
                                break;
                            case "Administrador":
                                rol = 3;
                                break;
                        }
                        if (rol_return < rol) {
                            rol_return = rol;
                        }
                    }
                }
            }
            //System.out.println("rol de java: "+rol_return.toString());
            return rol_return;
        } else {
            return 0;
        }
    }

    private Integer RolFlujo_VerificacionVigilancia(Integer id_usuario) {
        //1-normal, 2-revisor, 3-admin
        Integer rol = 0;
        Integer rol_return = 0;
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario.class);
        TipoUsuario tipousuario = findByIdUsuarioSec(id_usuario);
        if (tipousuario != null) {
            for (TipoUsuarioPerfil loc : tipousuario.getTipoUsuarioPerfilList()) {
                if (loc.getTipoPerfilesPuesto().getTipoflujo() != null) {
                    if (loc.getTipoPerfilesPuesto().getTipoflujo().getId() == 3) {
                        //System.out.println("evaluate: "+loc.getTipoPerfilesPuesto().getPerfil());
                        switch (loc.getTipoPerfilesPuesto().getPerfil()) {
                            case "Normal":
                                rol = 1;
                                break;
                            case "Revisor":
                                rol = 2;
                                break;
                            case "Administrador":
                                rol = 3;
                                break;
                        }
                        if (rol_return < rol) {
                            rol_return = rol;
                        }
                    }
                }
            }
            //System.out.println("rol de java: "+rol_return.toString());
            return rol_return;
        } else {
            return 0;
        }
    }

    private Integer RolFlujo_Juridico(Integer id_usuario) {
        //1-normal, 2-revisor, 3-admin
        Integer rol = 0;
        Integer rol_return = 0;
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario.class);
        TipoUsuario tipousuario = findByIdUsuarioSec(id_usuario);
        if (tipousuario != null) {
            for (TipoUsuarioPerfil loc : tipousuario.getTipoUsuarioPerfilList()) {
                if (loc.getTipoPerfilesPuesto().getTipoflujo() != null) {
                    if (loc.getTipoPerfilesPuesto().getTipoflujo().getId() == 2) {
                        //System.out.println("evaluate: "+loc.getTipoPerfilesPuesto().getPerfil());
                        switch (loc.getTipoPerfilesPuesto().getPerfil()) {
                            case "Normal":
                                rol = 1;
                                break;
                            case "Revisor":
                                rol = 2;
                                break;
                            case "Administrador":
                                rol = 3;
                                break;
                        }
                        if (rol_return < rol) {
                            rol_return = rol;
                        }
                    }
                }
            }
            //System.out.println("rol de java: "+rol_return.toString());
            return rol_return;
        } else {
            return 0;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_MainAtCon> findTipoQuejaCustomFilter2(FormViewMainQueja2 formViewMainQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujoGuia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_MainAtCon.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedor.class);
        try {
            String querystring = "SELECT v FROM TipoQueja_MainAtCon v where 1=1";

            //armar el query dinamico en base a los parametros 
            if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                querystring = querystring + " and v.fecha_queja between :fromdate and :todate";
            }
            if (formViewMainQueja.getEstado() != null) {
                switch (formViewMainQueja.getEstado()) {
                    case 999://activos
                        querystring = querystring + " and v.id_estado_queja in (101,102,103,104,105,106)";
                        break;
                    case 998://todos, activos e inactivos
                        break;
                    default:
                        querystring = querystring + " and v.id_estado_queja = :estado";
                        break;
                }
            }
            querystring = querystring + " and v.id_proveedor = :id_proveedor";
            if (formViewMainQueja.getId_departamento() != null) {
                querystring = querystring + " and v.id_departamento = :id_departamento";
            }
            if (formViewMainQueja.getId_municipio() != null) {
                querystring = querystring + " and v.id_municipio = :id_municipio";
            }

            querystring = querystring + " ORDER BY v.fecha_queja desc";
            Query nq = this.em.createQuery(querystring, TipoViewMainQueja.class).setMaxResults(2000);

            //adjuntar parametros y valores en base a parametros
            if (formViewMainQueja.getFecha_desde() != null && formViewMainQueja.getFecha_hasta() != null) {
                nq.setParameter("fromdate", StrtoDate(formViewMainQueja.getFecha_desde(), ""), TemporalType.DATE);
                nq.setParameter("todate", StrtoDateAdd1Day(formViewMainQueja.getFecha_hasta(), ""), TemporalType.DATE);
            }
            if (formViewMainQueja.getEstado() != null) {
                if (formViewMainQueja.getEstado() < 900) {
                    nq.setParameter("estado", formViewMainQueja.getEstado());
                }
            }
            //if(formViewMainQueja.getId_proveedor() != null)
            nq.setParameter("id_proveedor", formViewMainQueja.getId_proveedor());
            if (formViewMainQueja.getId_departamento() != null) {
                nq.setParameter("id_departamento", formViewMainQueja.getId_departamento());
            }
            if (formViewMainQueja.getId_municipio() != null) {
                nq.setParameter("id_municipio", formViewMainQueja.getId_municipio());
            }

            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //proveedor
    @SuppressWarnings("unchecked")
    public List<TipoConsumidor> findServPubProveedor() {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        return em.createNamedQuery("TipoProveedor.findSP").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoConsumidor> findnoneServPubProveedor() {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        return em.createNamedQuery("TipoProveedor.findnoneSP").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoProveedor> findCPoSPProveedor() {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedor.class);
        return em.createNamedQuery("TipoProveedor.findCPoSP").getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoProveedor findxNITProveedor(String nit) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedor.class);
        List<TipoProveedor> DataList = em.createNamedQuery("TipoProveedor.findxNit").setParameter("nit", nit).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoProveedor findByIdProveedor(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedor.class);
        return em.find(TipoProveedor.class, id);
    }

    public Integer ProveedorSPnextID() {
        Integer result = 0;
        //em.createNamedStoredProcedureQuery("TipoProveedor.svf_GetSeqNextProveedor").getOutputParameterValue(result);

        //StoredProcedureQuery findByYearProcedure = em.createNamedStoredProcedureQuery("TipoProveedor.svf_GetSeqNextProveedor");
        //findByYearProcedure.setParameter("newid", result);
        //findByYearProcedure.getOutputParameterValue(result);
        StoredProcedureQuery sp = em.createStoredProcedureQuery("svf_GetSeqNextProveedor");
        sp.registerStoredProcedureParameter(1, Integer.class, ParameterMode.OUT);
        sp.setParameter(1, result);
        //sp.getResultList().
        sp.execute();
        result = (Integer) sp.getOutputParameterValue("nwid");
        if (result == 0) {
            return null;
        } else {
            return result;
        }
    }

    public void saveProveedor(TipoProveedor tipoProveedor) throws SystemException {
        em.persist(tipoProveedor);
    }

    public void deleteProveedor(TipoProveedor tipoProveedor) throws SystemException {
        em.remove(tipoProveedor);
    }

    @SuppressWarnings("unchecked")
    public List<TipoConsumidor> CustomFilterProveedor(FormBusqueda formBusqueda) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedor.class);

        String querystring = "SELECT v FROM TipoProveedor v where v.habilitado='1'";

        if (!formBusqueda.getPro_nombre().isEmpty()) {
            querystring = querystring + " and UPPER(v.nombre) LIKE UPPER(:pro_nombre)";
        }
        if (!formBusqueda.getPro_nit().isEmpty()) {
            querystring = querystring + " and UPPER(v.nit_proveedor) LIKE UPPER(:pro_nit)";
        }
        Query nq = this.em.createQuery(querystring, TipoProveedor.class).setMaxResults(100);
        String param;
        if (!formBusqueda.getPro_nombre().isEmpty()) {
            param = "%" + formBusqueda.getPro_nombre().replaceAll(" ", "%") + "%";
            System.out.println(param);
            nq.setParameter("pro_nombre", param);
        }
        if (!formBusqueda.getPro_nit().isEmpty()) {
            param = "%" + formBusqueda.getPro_nit().replaceAll(" ", "%") + "%";
            nq.setParameter("pro_nit", param);
        }
        return nq.getResultList();
    }

    //flujo guia
    @SuppressWarnings("unchecked")
    public TipoFlujoGuia findAllTiposFlujoGuia(Integer idqueja) {
        List<TipoFlujoGuia> DataList = em.createNamedQuery("TipoFlujoGuia.findAll").setParameter("id_queja", idqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoFlujoGuia findByIdTipoFlujoGuia(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujoGuia.class);
        return em.find(TipoFlujoGuia.class, id);
    }

    public void saveFlujoGuia(TipoFlujoGuia tipoFlujoGuia) throws SystemException {
        em.persist(tipoFlujoGuia);
    }

    public void deleteFlujoGuia(TipoFlujoGuia tipoFlujoGuia) throws SystemException {
        em.remove(tipoFlujoGuia);
    }

    //Registro
    @SuppressWarnings("unchecked")
    public List<TipoRegistro> findAllTiposRegistro() {
        this.em.getEntityManagerFactory().getCache().evict(TipoRegistro.class);
        return em.createNamedQuery("TipoRegistro.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoRegistro> findbyIDTiposRegistro(Integer id_registro) {
        this.em.getEntityManagerFactory().getCache().evict(TipoRegistro.class);
        return em.createNamedQuery("TipoRegistro.findbyID").setParameter("id_registro", id_registro).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoProveedorComun> findAllProveedorComun() {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedorComun.class);
        return em.createNamedQuery("TipoProveedorComun.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoActividadEconomica> findAllActividadEconomica() {
        this.em.getEntityManagerFactory().getCache().evict(TipoActividadEconomica.class);
        return em.createNamedQuery("TipoActividadEconomica.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoComercio> findAllTipoComercio(Integer id_actividad_economica) {
        this.em.getEntityManagerFactory().getCache().evict(TipoComercio.class);
        return em.createNamedQuery("TipoComercio.findAll").setParameter("id_actividad_economicaP", id_actividad_economica).getResultList();
    }

    public TipoRegistro findByIdTipoRegistro(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoRegistro.class);
        return em.find(TipoRegistro.class, id);
    }

    public void saveRegistro(TipoRegistro tipoRegistro) throws SystemException {
        em.persist(tipoRegistro);
    }

    public void deleteRegistro(TipoRegistro tipoRegistro) throws SystemException {
        em.remove(tipoRegistro);
    }

    //Queja Registro
    @SuppressWarnings("unchecked")
    public TipoQuejaRegistro findbyParamsQuejaRegistro(Integer id_queja, Integer id_tipo_registro) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQuejaRegistro.class);
        List<TipoQuejaRegistro> DataList = em.createNamedQuery("TipoQuejaRegistro.findbyparams").setParameter("id_queja", id_queja).setParameter("id_tipo_registro", id_tipo_registro).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoQuejaRegistro findByIdTipoQuejaRegistro(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQuejaRegistro.class);
        return em.find(TipoQuejaRegistro.class, id);
    }

    @SuppressWarnings("unchecked")
    public TipoProveedor findProveeorByNit(String nit) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedor.class);
        List<TipoProveedor> DataList = em.createNamedQuery("TipoProveedor.findByNit").setParameter("nit_proveedorP", nit).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void saveQuejaRegistro(TipoQuejaRegistro tipoQuejaRegistro) throws SystemException {
        em.persist(tipoQuejaRegistro);
    }

    public void deleteQuejaRegistro(TipoQuejaRegistro tipoQuejaRegistro) throws SystemException {
        em.remove(tipoQuejaRegistro);
    }

    //Registro: Comunicación Permanente
    @SuppressWarnings("unchecked")
    public TipoReg_ComPerm findTiposReg_ComPermxIdQueja(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ComPerm.class);
        List<TipoReg_ComPerm> DataList = em.createNamedQuery("TipoReg_ComPerm.findAll").setParameter("idqueja", idqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }
    
    @SuppressWarnings("unchecked")
    public TipoReg_ComPerm findTiposReg_ComPermxIdCom(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ComPerm.class);
        List<TipoReg_ComPerm> DataList = em.createNamedQuery("TipoReg_ComPerm.findAll").setParameter("idqueja", idqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_ComPerm findByIdTipoReg_ComPerm(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ComPerm.class);
        return em.find(TipoReg_ComPerm.class, id);
    }

    public void saveReg_ComPerm(TipoReg_ComPerm tipoReg_ComPerm) throws SystemException {
        em.persist(tipoReg_ComPerm);
    }

    public void deleteReg_ComPerm(TipoReg_ComPerm tipoReg_ComPerm) throws SystemException {
        em.remove(tipoReg_ComPerm);
    }

    //Registro: Ficha Queja, Movimiento
    @SuppressWarnings("unchecked")
    public TipoReg_FichaQueja findTiposReg_FichaQuejaxIdQueja(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_FichaQueja.class);
        List<TipoReg_FichaQueja> DataList = em.createNamedQuery("TipoReg_FichaQueja.findAll").setParameter("idqueja", idqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_FichaQueja findByIdTipoReg_FichaQueja(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_FichaQueja.class);
        return em.find(TipoReg_FichaQueja.class, id);
    }

    public void saveReg_FichaQueja(TipoReg_FichaQueja tipoReg_FichaQueja) throws SystemException {
        em.persist(tipoReg_FichaQueja);
    }

    public void deleteReg_FichaQueja(TipoReg_FichaQueja tipoReg_FichaQueja) throws SystemException {
        em.remove(tipoReg_FichaQueja);
    }

    //sede
    public List<TipoSede> findTiposSedeExcOne(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        return em.createNamedQuery("TipoSede.findAllExcOne").setParameter("excluir_id", id).getResultList();
    }

    public List<TipoSede> findTiposSedeAll() {
        this.em.getEntityManagerFactory().getCache().evict(TipoSede.class);
        return em.createNamedQuery("TipoSede.findAll").getResultList();
    }

    public TipoSede findByIdSede(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoSede.class);
        return em.find(TipoSede.class, id);
    }
    //Programa Audiencia

    @SuppressWarnings("unchecked")
    public TipoProgramaAudiencia findTiposProgramaAudienciaxIdQueja(Integer idqueja, Integer no_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProgramaAudiencia.class);
        List<TipoProgramaAudiencia> DataList = em.createNamedQuery("TipoProgramaAudiencia.findxIdQuejaAct").setParameter("idqueja", idqueja).setParameter("no_audiencia", no_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<TipoProgramaAudiencia> findAllTiposProgramaAudienciaxIdQueja(Integer idqueja, Integer no_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProgramaAudiencia.class);
        List<TipoProgramaAudiencia> DataList = em.createNamedQuery("TipoProgramaAudiencia.findxIdQuejaAct").setParameter("idqueja", idqueja).setParameter("no_audiencia", no_audiencia).getResultList();
        return DataList;
    }

    public TipoProgramaAudiencia findByIdProgramaAudiencia(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProgramaAudiencia.class);
        return em.find(TipoProgramaAudiencia.class, id);
    }

    public void saveTipoProgramaAudiencia(TipoProgramaAudiencia tipoProgramaAudiencia) throws SystemException {
        em.persist(tipoProgramaAudiencia);
    }

    public void deleteTipoProgramaAudiencia(TipoProgramaAudiencia tipoProgramaAudiencia) throws SystemException {
        em.remove(tipoProgramaAudiencia);
    }

    //Audiencia
    @SuppressWarnings("unchecked")
    public TipoAudiencia findTiposAudienciaxIdQueja(Integer idqueja, Integer no_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProgramaAudiencia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoAudiencia.class);
        List<TipoAudiencia> DataList = em.createNamedQuery("TipoAudiencia.findxIdQuejaNo").setParameter("idqueja", idqueja).setParameter("no_audiencia", no_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoAudiencia findByIdAudiencia(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoAudiencia.class);
        return em.find(TipoAudiencia.class, id);
    }

    public void saveAudiencia(TipoAudiencia tipoAudiencia) throws SystemException {
        em.persist(tipoAudiencia);
    }

    public void deleteAudiencia(TipoAudiencia tipoAudiencia) throws SystemException {
        em.remove(tipoAudiencia);
    }

    //Resultado Audiencia
    public List<TipoResultadoAudiencia> findAllTipoResultadoAudiencia(Integer no_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoResultadoAudiencia.class);
        return em.createNamedQuery("TipoResultadoAudiencia.findAll").setParameter("no_audiencia", no_audiencia.toString()).getResultList();
    }

    //Registro Cedula Citacion Consumidor
    @SuppressWarnings("unchecked")
    public TipoReg_CedCitacionCon findAllTipoReg_CedCitacionCon(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionCon.class);
        List<TipoReg_CedCitacionCon> DataList = em.createNamedQuery("TipoReg_CedCitacionCon.findAll").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //Registro Cedula Citacion Consumidor
    @SuppressWarnings("unchecked")
    public TIpoReg_CedulaCitacionConJur findAllTipoReg_CedCitacionConJur(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TIpoReg_CedulaCitacionConJur.class);
        List<TIpoReg_CedulaCitacionConJur> DataList = em.createNamedQuery("TIpoReg_CedulaCitacionConJur.findByIdAudiencia").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedCitacionCon findByIdReg_CedCitacionCon(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionCon.class);
        return em.find(TipoReg_CedCitacionCon.class, id);
    }

    public void saveReg_CedCitacionCon(TipoReg_CedCitacionCon tipoReg_CedCitacionCon) throws SystemException {
        em.persist(tipoReg_CedCitacionCon);
    }

    public void saveReg_CedCitacionConJur(TIpoReg_CedulaCitacionConJur tipoReg_CedCitacionConJur) throws SystemException {
        em.persist(tipoReg_CedCitacionConJur);
    }

    public void deleteReg_CedCitacionCon(TipoReg_CedCitacionCon tipoReg_CedCitacionCon) throws SystemException {
        em.remove(tipoReg_CedCitacionCon);
    }

    public TipoAudienciaRegistros find2Ced2Notif(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoAudiencia.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoAudienciaRegistros.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionCon.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionPro.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionCon.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionPro.class);
        List<TipoAudienciaRegistros> DataList = em.createNamedQuery("TipoAudienciaRegistros.findAll").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public AudienciaRegistrosJuridicoDto find2Ced2NotifJuridico(Integer id_audiencia) {

        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionCitacionJuridico.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionResCorreo.class);
        this.em.getEntityManagerFactory().getCache().evict(TIpoReg_CedulaCitacionConJur.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaCitacionProJur.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_RegCedulaNotificacionCitCorreo.class);
        Query query = em.createNativeQuery("select id, codigo ,1 from reg_cedula_notificacion_citacion_juridico where id_audiencia=? and es_consumidor_proveedor='C'\n"
                + "union\n"
                + "select id, codigo, 2 from reg_cedula_notificacion_citacion_juridico where id_audiencia=? and es_consumidor_proveedor='P'\n"
                + "union\n"
                + "select id, codigo, id_registro from reg_cedula_notificacion_res_correo where id_audiencia=? \n"
                + "union\n"
                + "select id, codigo, id_registro from reg_cedula_citacion_con_jur where id_audiencia=? \n"
                + "union\n"
                + "select id, codigo, id_registro from reg_cedula_citacion_pro_jur where id_audiencia=? \n"
                + "union\n"
                + "select id, codigo, id_registro from reg_cedula_notificacion_cit_correo where id_audiencia=?");
        query.setParameter(1, id_audiencia);
        query.setParameter(2, id_audiencia);
        query.setParameter(3, id_audiencia);
        query.setParameter(4, id_audiencia);
        query.setParameter(5, id_audiencia);
        query.setParameter(6, id_audiencia);

        List<Object[]> rawResultList;
        rawResultList = query.getResultList();
        AudienciaRegistrosJuridicoDto audienciaRegistrosJuridicoDto = new AudienciaRegistrosJuridicoDto();
        audienciaRegistrosJuridicoDto.setId_audiencia(String.valueOf(id_audiencia));
        for (Object[] objects : rawResultList) {

            //cedulas notificaciones
            if (((String) ((objects[2] != null) ? objects[2].toString() : "")).equals("1")) {
                audienciaRegistrosJuridicoDto.setCedula_notificacion_citacion_jur_con_id(((String) ((objects[0] != null) ? objects[0].toString() : "")));
                audienciaRegistrosJuridicoDto.setCedula_notificacion_citacion_jur_con_codigo(((String) ((objects[1] != null) ? objects[1].toString() : "")));
            } else if (((String) ((objects[2] != null) ? objects[2].toString() : "")).equals("2")) {
                audienciaRegistrosJuridicoDto.setCedula_notificacion_citacion_jur_pro_id(((String) ((objects[0] != null) ? objects[0].toString() : "")));
                audienciaRegistrosJuridicoDto.setCedula_notificacion_citacion_jur_pro_codigo(((String) ((objects[1] != null) ? objects[1].toString() : "")));
            } //cedulas citaciones 
            else if (((String) ((objects[2] != null) ? objects[2].toString() : "")).equals(String.valueOf(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_CONSUMIDOR_JUR))) {
                audienciaRegistrosJuridicoDto.setCedula_citacion_jur_con_id(((String) ((objects[0] != null) ? objects[0].toString() : "")));
                audienciaRegistrosJuridicoDto.setCedula_citacion_jur_con_codigo(((String) ((objects[1] != null) ? objects[1].toString() : "")));
            } else if (((String) ((objects[2] != null) ? objects[2].toString() : "")).equals(String.valueOf(Constants.REG_DIACO_REGISTRO_CEDULA_CITACION_PROVEEDOR_JUR))) {
                audienciaRegistrosJuridicoDto.setCedula_citacion_jur_pro_id(((String) ((objects[0] != null) ? objects[0].toString() : "")));
                audienciaRegistrosJuridicoDto.setCedula_citacion_jur_pro_codigo(((String) ((objects[1] != null) ? objects[1].toString() : "")));
            } //cedulas por correo
            else if (((String) ((objects[2] != null) ? objects[2].toString() : "")).equals(String.valueOf(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_CITACION_CORREO))) {
                audienciaRegistrosJuridicoDto.setCedula_notificacion_cit_correo_id(((String) ((objects[0] != null) ? objects[0].toString() : "")));
                audienciaRegistrosJuridicoDto.setCedula_notificacion_cit_correo_codigo(((String) ((objects[1] != null) ? objects[1].toString() : "")));
            } else if (((String) ((objects[2] != null) ? objects[2].toString() : "")).equals(String.valueOf(Constants.REG_DIACO_REGISTRO_CEDULA_NOTIFICACION_RES_CORREO))) {
                audienciaRegistrosJuridicoDto.setCedula_notificacion_re_correo_id(((String) ((objects[0] != null) ? objects[0].toString() : "")));
                audienciaRegistrosJuridicoDto.setCedula_notificacion_re_correo_codigo(((String) ((objects[1] != null) ? objects[1].toString() : "")));
            }
        }

        return audienciaRegistrosJuridicoDto;
    }

    //Registro Cedula Citacion Proveedor
    @SuppressWarnings("unchecked")
    public TipoReg_CedCitacionPro findAllTipoReg_CedCitacionPro(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionPro.class);
        List<TipoReg_CedCitacionPro> DataList = em.createNamedQuery("TipoReg_CedCitacionPro.findAll").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //Registro Cedula Citacion Proveedor
    @SuppressWarnings("unchecked")
    public TipoReg_CedulaCitacionProJur findByIdAudienciaTipoReg_CedCitacionPro(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaCitacionProJur.class);
        List<TipoReg_CedulaCitacionProJur> DataList = em.createNamedQuery("TipoReg_CedulaCitacionProJur.findByIdAudiencia").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //Registro Cedula Citacion Proveedor
    @SuppressWarnings("unchecked")
    public TipoReg_CedCitacionPro findTipoReg_CedCitacionProByIdQueja(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionPro.class);
        List<TipoReg_CedCitacionPro> DataList = em.createNamedQuery("TipoReg_CedCitacionPro.findByIdQueja").setParameter("id_queja", id_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedCitacionPro findByIdReg_CedCitacionPro(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionPro.class);
        return em.find(TipoReg_CedCitacionPro.class, id);
    }

    public void saveReg_CedCitacionPro(TipoReg_CedCitacionPro tipoReg_CedCitacionPro) throws SystemException {
        em.persist(tipoReg_CedCitacionPro);
    }

    public void saveReg_CedCitacionProJur(TipoReg_CedulaCitacionProJur vTipoReg_CedulaCitacionProJur) throws SystemException {
        em.persist(vTipoReg_CedulaCitacionProJur);
    }

    public void deleteReg_CedCitacionPro(TipoReg_CedCitacionPro tipoReg_CedCitacionPro) throws SystemException {
        em.remove(tipoReg_CedCitacionPro);
    }

    //Registro Cedula Notificacion Consumidor
    @SuppressWarnings("unchecked")
    public TipoReg_CedNotificacionCon findAllTipoReg_CedNotificacionCon(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionCon.class);
        List<TipoReg_CedNotificacionCon> DataList = em.createNamedQuery("TipoReg_CedNotificacionCon.findAll").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public TipoReg_CedulaNotificacionResJuridico findTipoReg_CedulaNotiResJuridicoByIdResCP(CedulaNotificacionDto pCedulaNotificaionDto) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionResJuridico.class);
        List<TipoReg_CedulaNotificacionResJuridico> DataList = em.createNamedQuery("TipoReg_CedulaNotificacionResJuridico.findByIdResCP").setParameter("idQueja", pCedulaNotificaionDto.getIdQueja()).setParameter("esCP", pCedulaNotificaionDto.getEsCP()).setParameter("esResultadoResolucion", pCedulaNotificaionDto.getEsResultadoResolucion()).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<TipoReg_CedulaNotificacionResJuridico> findAllTipoReg_CedulaNotiResJuridicoByIdResQueja(CedulaNotificacionDto pCedulaNotificaionDto) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionResJuridico.class);
        List<TipoReg_CedulaNotificacionResJuridico> DataList = em.createNamedQuery("TipoReg_CedulaNotificacionResJuridico.findByIdResQuejaAud").setParameter("idQueja", pCedulaNotificaionDto.getIdQueja()).setParameter("esResultadoResolucion", pCedulaNotificaionDto.getEsResultadoResolucion()).getResultList();
        return DataList;
    }

//Registro Cedula Notificacion Citacion Juridico
    @SuppressWarnings("unchecked")
    public TipoReg_CedulaNotificacionCitacionJuridico findAllTipoReg_CedNotificacionCitaJuridico(Integer id_audiencia, String esCP) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionCitacionJuridico.class);
        List<TipoReg_CedulaNotificacionCitacionJuridico> DataList = em.createNamedQuery("TipoReg_CedulaNotificacionCitacionJuridico.findByIdAudienciaTipoCP").setParameter("id_audiencia", id_audiencia).setParameter("esCP", esCP).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //Registro Cedula Notificacion Juridico
    @SuppressWarnings("unchecked")
    public TipoReg_RegCedulaNotificacionCitCorreo findTipoReg_CedNotificacionResJuridicoByIdAud(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_RegCedulaNotificacionCitCorreo.class);
        List<TipoReg_RegCedulaNotificacionCitCorreo> DataList = em.createNamedQuery("TipoReg_RegCedulaNotificacionCitCorreo.findByIdAudiencia").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //Registro Cedula Notificacion Juridico
    @SuppressWarnings("unchecked")
    public TipoReg_CedulaNotificacionResCorreo findTipoReg_CedNotificacionResCorreo(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionResCorreo.class);
        List<TipoReg_CedulaNotificacionResCorreo> DataList = em.createNamedQuery("TipoReg_CedulaNotificacionResCorreo.findByIdAudiencia").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedNotificacionCon findByIdReg_CedNotificacionCon(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionCon.class);
        return em.find(TipoReg_CedNotificacionCon.class, id);
    }

    public void saveReg_CedNotificacionCon(TipoReg_CedNotificacionCon tipoReg_CedNotificacionCon) throws SystemException {
        em.persist(tipoReg_CedNotificacionCon);
    }

    public void saveReg_CedNotificacionJuridico(TipoReg_CedulaNotificacionResJuridico tipoReg_CedNotificacionJur) throws SystemException {
        em.persist(tipoReg_CedNotificacionJur);
    }

    public void saveReg_CedNotificacionCitaJuridico(TipoReg_CedulaNotificacionCitacionJuridico pTipoReg_CedulaNotificacionCitacionJuridico) throws SystemException {
        em.persist(pTipoReg_CedulaNotificacionCitacionJuridico);
    }

    public void saveReg_CedulaNotificacionCitacionCorreo(TipoReg_RegCedulaNotificacionCitCorreo tipoReg_CedNotifiCitacionCorreo) throws SystemException {
        em.persist(tipoReg_CedNotifiCitacionCorreo);
    }

    public void saveReg_CedulaNotificacionResCorreo(TipoReg_CedulaNotificacionResCorreo tipoReg_CedNotifiResCorreo) throws SystemException {
        em.persist(tipoReg_CedNotifiResCorreo);
    }

    public void deleteReg_CedNotificacionCon(TipoReg_CedNotificacionCon tipoReg_CedNotificacionCon) throws SystemException {
        em.remove(tipoReg_CedNotificacionCon);
    }

    //Registro Cedula Notificacion Proveedor
    @SuppressWarnings("unchecked")
    public TipoReg_CedNotificacionPro findAllTipoReg_CedNotificacionPro(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionPro.class);
        List<TipoReg_CedNotificacionPro> DataList = em.createNamedQuery("TipoReg_CedNotificacionPro.findAll").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedNotificacionPro findByIdReg_CedNotificacionPro(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionPro.class);
        return em.find(TipoReg_CedNotificacionPro.class, id);
    }

    public void saveReg_CedNotificacionPro(TipoReg_CedNotificacionPro tipoReg_CedNotificacionPro) throws SystemException {
        em.persist(tipoReg_CedNotificacionPro);
    }

    public void deleteReg_CedNotificacionPro(TipoReg_CedNotificacionPro tipoReg_CedNotificacionPro) throws SystemException {
        em.remove(tipoReg_CedNotificacionPro);
    }

    //motivo poa
    @SuppressWarnings("unchecked")
    public List<TipoMotivoPOA> findAllMotivoPOA() {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoPOA.class);
        return em.createNamedQuery("TipoMotivoPOA.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoMotivoPOA findMotivoPOA(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoPOA.class);
        return em.find(TipoMotivoPOA.class, id);
    }

    //motivo queja finalizada
    @SuppressWarnings("unchecked")
    public List<TipoMotivoQuejaFinalizada> findAllMotivoQuejaFinalizada(String tipo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQuejaFinalizada.class);
        return em.createNamedQuery("TipoMotivoQuejaFinalizada.findAll").setParameter("tipo", tipo).getResultList();
    }

    //motivo queja finalizada
    @SuppressWarnings("unchecked")
    public List<TipoMotivoQuejaFinalizada> findAllMotivoQuejaFinMotivo(Integer padre) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQuejaFinalizada.class);
        return em.createNamedQuery("TipoMotivoQuejaFinalizada.findMotivo").setParameter("padre", padre).getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoMotivoQuejaFinalizada findMotivoQuejaFinalizada(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQuejaFinalizada.class);
        return em.find(TipoMotivoQuejaFinalizada.class, id);
    }

    //queja finalizada
    public TipoQuejaFinalizada getTipoQuejaFinxIdQueja(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQuejaFinalizada.class);
        List<TipoQuejaFinalizada> DataList = em.createNamedQuery("TipoQuejaFinalizada.findxIdQuejaAct").setParameter("idqueja", id_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoQuejaFinalizada findByIdQuejaFinalizada(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQuejaFinalizada.class);
        return em.find(TipoQuejaFinalizada.class, id);
    }

    public void saveQuejaFinalizada(TipoQuejaFinalizada tipoQuejaFinalizada) throws SystemException {
        em.persist(tipoQuejaFinalizada);
    }

    public void deleteQuejaFinalizada(TipoQuejaFinalizada tipoQuejaFinalizada) throws SystemException {
        em.remove(tipoQuejaFinalizada);
    }

    //visita de campo
    @SuppressWarnings("unchecked")
    public List<TipoVisitaCampo> findAllVisitaCampo(Integer idqueja, Integer id_flujo) {
        /*switch(id_flujo){
                case 1:
                    return em.createNamedQuery("TipoVisitaCampo.findAllAtCon").setParameter("idqueja", idqueja).getResultList();
                default:
                    return null;
            }*/
        this.em.getEntityManagerFactory().getCache().evict(TipoVisitaCampo.class);
        return em.createNamedQuery("TipoVisitaCampo.findAll").setParameter("idqueja", idqueja).getResultList();
    }

    public TipoVisitaCampo findLastTipoVisitaCampo(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVisitaCampo.class);
        List<TipoVisitaCampo> DataList = em.createNamedQuery("TipoVisitaCampo.findLast").setParameter("idqueja", id_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoVisitaCampo findVisitaVigByIdQueja(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVisitaCampo.class);
        List<TipoVisitaCampo> DataList = em.createNamedQuery("TipoVisitaCampo.findVisitaVigByIdQueja").setParameter("idqueja", id_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoVisitaCampo findByIdVisitaCampo(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVisitaCampo.class);
        return em.find(TipoVisitaCampo.class, id);
    }

    public void saveVisitaCampo(TipoVisitaCampo tipoVisitaCampo) {
        em.persist(tipoVisitaCampo);
    }

    public void deleteVisitaCampo(TipoVisitaCampo tipoVisitaCampo) {
        em.remove(tipoVisitaCampo);
    }

    //usuario
    @SuppressWarnings("unchecked")
    public List<TipoUsuario_Simple> findAllUsuario(Integer id_flujo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Simple.class);
        return em.createNamedQuery("TipoUsuario_Simple.findall").setParameter("id_flujo", id_flujo).getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoUsuario_Simple findUsuariobyEmail(String email) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Simple.class);
        List<TipoUsuario_Simple> DataList = em.createNamedQuery("TipoUsuario_Simple.findbyEmail").setParameter("email", email).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<TipoUsuario_Simple> findUsuarioAsignaCola(Integer id_tipo_cola, Integer id_flujo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Simple.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoColaAsignacion.class);
        return em.createNamedQuery("TipoUsuario_Simple.findAsignaCola").setParameter("id_tipo_cola", id_tipo_cola).setParameter("id_flujo", id_flujo).getResultList();
    }

    public TipoUsuario_Simple findByIdUsuario(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Simple.class);
        return em.find(TipoUsuario_Simple.class, id);
    }

    public void saveUsuarioSimple(TipoUsuario_Simple tipoUsuario) {
        em.persist(tipoUsuario);
    }

    public TipoUsuario_Conf findByIdTipoUsuario(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        List<TipoUsuario_Conf> DataList = em.createNamedQuery("TipoUsuario_Conf.findbyID").setParameter("id_usuario", id).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuario_Conf findByIdUsuarioConf(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        return em.find(TipoUsuario_Conf.class, id);
    }

    public TipoUsuario_Conf findByLoginUsuarioConf(String login) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        List<TipoUsuario_Conf> DataList = em.createNamedQuery("TipoUsuario_Conf.findbyLogin").setParameter("login", login).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuario_Conf findByEmailUsuarioConf(String email) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        List<TipoUsuario_Conf> DataList = em.createNamedQuery("TipoUsuario_Conf.findbyEmail").setParameter("email", email).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuario_Conf findByLoginExcUsuarioConf(String login, Integer idusuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        List<TipoUsuario_Conf> DataList = em.createNamedQuery("TipoUsuario_Conf.findbyLoginExc").setParameter("login", login).setParameter("idusuario", idusuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuario_Conf findByEmailExcUsuarioConf(String email, Integer idusuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        List<TipoUsuario_Conf> DataList = em.createNamedQuery("TipoUsuario_Conf.findbyEmailExc").setParameter("email", email).setParameter("idusuario", idusuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuario_Conf findByJefeUsuarioConf(Integer id_puesto) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        List<TipoUsuario_Conf> DataList = em.createNamedQuery("TipoUsuario_Conf.findbyJefe").setParameter("id_puesto", id_puesto).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void saveUsuarioConf(TipoUsuario_Conf tipoUsuario) {
        em.persist(tipoUsuario);
    }
    //usuario perfil

    public void saveUsuarioPerfil(TipoUsuarioPerfil tipoUsuarioPerfil) {
        em.persist(tipoUsuarioPerfil);
    }

    public void deleteUsuarioPerfil(TipoUsuarioPerfil tipoUsuarioPerfil) {
        em.remove(tipoUsuarioPerfil);
    }

    public TipoUsuarioPerfil findUsuarioPP_Rol(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_pp_rol").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_general_Parametros(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_general_Parametros").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_general_AdmUsuarios(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_general_AdmUsuarios").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_general_Configuracion(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_general_Configuracion").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_general_AprobarPP(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_general_AprobarPP").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_general_Catalogos(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_general_Catalogos").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_atcon_Rol(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_atcon_Rol").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_jur_Rol(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_jur_Rol").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_vyv_Rol(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_vyv_Rol").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_sp_Rol(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_sp_Rol").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_atcon_conf(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_atcon_Conf").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_jur_conf(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_jur_Conf").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_vyv_conf(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_vyv_Conf").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_sp_conf(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_sp_Conf").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_atcon_colas(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_atcon_Colas").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_jur_colas(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_jur_Colas").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_vyv_colas(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_vyv_Colas").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_sp_colas(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_sp_Colas").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_atcon_presencial(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_atcon_Presencial").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoUsuarioPerfil findUsuarioPerfil_atcon_call_center(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        List<TipoUsuarioPerfil> DataList = em.createNamedQuery("TipoUsuarioPerfil.find_atcon_call_center").setParameter("idUsuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }
    //perfiles puesto

    public TipoPerfilesPuesto findByIdPerfilesPuesto(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoPerfilesPuesto.class);
        return em.find(TipoPerfilesPuesto.class, id);
    }
    //Registro Resolucion Visita de Campo

    @SuppressWarnings("unchecked")
    public TipoReg_ResArchivoVerificacion findAllTipoReg_ResVerificacion(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResArchivoVerificacion.class);
        List<TipoReg_ResArchivoVerificacion> DataList = em.createNamedQuery("TipoReg_ResArchivoVerificacion.findByIdQueja").setParameter("idQueja", id_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //Registro Resolucion Visita de Campo
    @SuppressWarnings("unchecked")
    public TipoReg_ResVisitaCampo findAllTipoReg_ResVisitaCampo(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResVisitaCampo.class);
        List<TipoReg_ResVisitaCampo> DataList = em.createNamedQuery("TipoReg_ResVisitaCampo.findAll").setParameter("id_queja", id_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_ResVisitaCampo findByIdReg_ResVisitaCampo(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResVisitaCampo.class);
        return em.find(TipoReg_ResVisitaCampo.class, id);
    }

    public void saveReg_ResVisitaCampo(TipoReg_ResVisitaCampo tipoReg_ResVisitaCampo) throws SystemException {
        em.persist(tipoReg_ResVisitaCampo);
    }

    public void saveReg_ResVisitaCampoVerifVig(TipoReg_ResArchivoVerificacion pTipoReg_ResArchivoVerificacion) throws SystemException {
        em.persist(pTipoReg_ResArchivoVerificacion);
    }

    public void deleteReg_ResVisitaCampo(TipoReg_ResVisitaCampo tipoReg_ResVisitaCampo) throws SystemException {
        em.remove(tipoReg_ResVisitaCampo);
    }

    //departamento interno
    @SuppressWarnings("unchecked")
    public List<TipoDepartamentoInterno> findAllTipoDeptoInterno() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.createNamedQuery("TipoDepartamentoInterno.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoDepartamentoInterno> findMovHaciaTipoDeptoInterno() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.createNamedQuery("TipoDepartamentoInterno.findMovHacia").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoDepartamentoInterno> findMovHaciaTipoDeptoInternoVyV() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.createNamedQuery("TipoDepartamentoInterno.findMovHaciaVyV").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoDepartamentoInterno> findMovHaciaSinJefeTipoDeptoInterno() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.createNamedQuery("TipoDepartamentoInterno.findMovHaciaSinJefe").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoDepartamentoInterno> findMovHaciaTipoDeptoInternoJur() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.createNamedQuery("TipoDepartamentoInterno.findMovHaciaJur").getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoDepartamentoInterno findTipoDeptoInterno(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.find(TipoDepartamentoInterno.class, id);
    }

    //queja simple
    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaSimpleAct() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.findAllActivoAtCon").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaSimpleArchivo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.findAllArchivoAtCon").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaSimpleJuridico() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.findAllJuridicoAtCon").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaSimpleVyV() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.findAllVyVAtCon").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaSimpleTodo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaSimplePendAsig() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.findPendAsignacion").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaVyVSimpleArchivo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.VyVfindAllArchivo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaVyVSimpleJuridico() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.VyVfindAllJuridico").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaVyVSimpleAtCon() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.VyVfindAllAtCon").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaVyVSimplePendAsig() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.VyVfindPendAsignacion").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaJurSimpleArchivo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.JurfindAllArchivo").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaJurSimpleVerificacion() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.JurfindAllVerificacion").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaJurSimpleAtCon() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.JurfindAllAtCon").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoQueja_Simple> findAllTipoQuejaJurSimplePendAsig() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQueja_Simple.class);
        return em.createNamedQuery("TipoQueja_Simple.JurfindPendAsignacion").getResultList();
    }
    //Movimiento Expediente

    @SuppressWarnings("unchecked")
    public List<TipoMovimExp> findTiposMovimExpxIdQueja(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMovimExp.class);
        return em.createNamedQuery("TipoMovimExp.findall").setParameter("idqueja", idqueja).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoMovimExp> findTiposMovimExpTop5(Integer id_dpto_interno) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMovimExp.class);
        return em.createNamedQuery("TipoMovimExp.findTop5").setParameter("id_departamento_interno_desde", id_dpto_interno).setMaxResults(5).getResultList();
    }

    public TipoMovimExp findByIdMovimExp(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMovimExp.class);
        return em.find(TipoMovimExp.class, id);
    }

    public void saveMovimExp(TipoMovimExp tipoMovimExp) throws SystemException {
        em.persist(tipoMovimExp);
    }

    public void deleteMovimExp(TipoMovimExp tipoMovimExp) throws SystemException {
        em.remove(tipoMovimExp);
    }

    //Movimiento Expediente Detalle
    @SuppressWarnings("unchecked")
    public List<TipoMovimExpDetalle> findTiposMovimExpDetallexIdQueja(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMovimExpDetalle.class);
        return em.createNamedQuery("TipoMovimExpDetalle.findall").setParameter("id", id).getResultList();
    }

    public TipoMovimExpDetalle findByIdMovimExpDetalle(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMovimExpDetalle.class);
        return em.find(TipoMovimExpDetalle.class, id);
    }

    public void saveMovimExpDetalle(TipoMovimExpDetalle tipoMovimExpDetalle) throws SystemException {
        em.persist(tipoMovimExpDetalle);
    }

    //Registro: Movimiento Expediente
    @SuppressWarnings("unchecked")
    public List<TipoReg_MovimExp> findTiposReg_MovExpxIdMov(Integer id_cambio_exp) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_MovimExp.class);
        return em.createNamedQuery("TipoReg_MovimExp.findAll").setParameter("id_cambio_exp", id_cambio_exp).getResultList();
    }

    public TipoReg_MovimExp findByIdTipoReg_MovExp(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        return em.find(TipoReg_MovimExp.class, id);
    }

    public void saveReg_MovExp(TipoReg_MovimExp tipoReg_MovimExp) throws SystemException {
        em.persist(tipoReg_MovimExp);
    }

    public void saveReg_MovExpDet(TipoReg_MovimExpDet tipoReg_MovimExpDet) throws SystemException {
        em.persist(tipoReg_MovimExpDet);
    }

    //Conciliación Virtual, Interacción con Consumidor
    @SuppressWarnings("unchecked")
    public List<TipoConcVirtInt> findTiposConcVirtInt(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConcVirtInt.class);
        return em.createNamedQuery("TipoConcVirtInt.findAll").setParameter("idqueja", idqueja).getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoConcVirtInt findLastConcVirtInt(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConcVirtInt.class);
        List<TipoConcVirtInt> DataList = em.createNamedQuery("TipoConcVirtInt.findLast").setParameter("idqueja", idqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoConcVirtInt findByIdConcVirtInt(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConcVirtInt.class);
        return em.find(TipoConcVirtInt.class, id);
    }

    public void saveConcVirtInt(TipoConcVirtInt tipoConcVirtInt) throws SystemException {
        em.persist(tipoConcVirtInt);
    }

    //email fuente
    public TipoEmailFuente findByIdEmailFuente(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoEmailFuente.class);
        return em.find(TipoEmailFuente.class, id);
    }

    public List<TipoEmailFuente> findAllEmailFuente() {
        this.em.getEntityManagerFactory().getCache().evict(TipoExpiracion.class);
        return em.createNamedQuery("TipoEmailFuente.findAll").getResultList();
    }

    public void saveEmailFuente(TipoEmailFuente tipoEmailFuente) throws SystemException {
        em.persist(tipoEmailFuente);
    }
    //queja expiracion

    public TipoExpiracion findByIdExpiracion(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoExpiracion.class);
        return em.find(TipoExpiracion.class, id);
    }

    public List<TipoExpiracion> findAllExpiracion() {
        this.em.getEntityManagerFactory().getCache().evict(TipoExpiracion.class);
        return em.createNamedQuery("TipoExpiracion.findAll").getResultList();
    }

    public void saveExpiracion(TipoExpiracion tipoExpiracion) throws SystemException {
        em.persist(tipoExpiracion);
    }

    //email enviar
    public TipoEmailEnviar findByIdEmailEnviar(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoEmailEnviar.class);
        return em.find(TipoEmailEnviar.class, id);
    }

    public void saveEmailEnviar(TipoEmailEnviar tipoEmailEnviar) throws SystemException {
        System.out.println("JJ: tipoEmailEnviar: persist: "+tipoEmailEnviar.toString());
        em.persist(tipoEmailEnviar);
    }

    public List<TipoEmailEnviar> findbyActivoEmailEnviar() {
        this.em.getEntityManagerFactory().getCache().evict(TipoEmailEnviar.class);
        return em.createNamedQuery("TipoEmailEnviar.findxActivo").getResultList();
    }

    //Magic Link
    @SuppressWarnings("unchecked")
    public TipoMagicLink findLastTipoMagicLink(String linkcode) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMagicLink.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoEmailFuente.class);
        List<TipoMagicLink> DataList = em.createNamedQuery("TipoMagicLink.findAll").setParameter("linkcode", linkcode).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoMagicLink findLastTipoMagicLinkxIdQueja(Integer id_queja, Integer id_fuente) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMagicLink.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoEmailFuente.class);
        List<TipoMagicLink> DataList;
        if (id_queja != 0) {
            DataList = em.createNamedQuery("TipoMagicLink.findLastxIDQueja").setParameter("id_queja", id_queja).setParameter("id_fuente", id_fuente).setMaxResults(1).getResultList();
        } else {
            DataList = em.createNamedQuery("TipoMagicLink.findLastsinIDQueja").setParameter("id_fuente", id_fuente).setMaxResults(1).getResultList();
        }
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void saveMagicLink(TipoMagicLink tipoMagicLink) throws SystemException {
        em.persist(tipoMagicLink);
    }

    //Conciliación Virtual, Interacción con Consumidor
    @SuppressWarnings("unchecked")
    public List<TipoEstadoQueja> findTiposEstadoQueja() {
        this.em.getEntityManagerFactory().getCache().evict(TipoEstadoQueja.class);
        return em.createNamedQuery("TipoEstadoQueja.findAll").getResultList();
    }

    //Verificación de datos interacción
    @SuppressWarnings("unchecked")
    public List<TipoVerifDatosInt> findTiposVerifDatInt(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVerifDatosInt.class);
        return em.createNamedQuery("TipoVerifDatosInt.findAll").setParameter("id_queja", id_queja).getResultList();
    }

    public TipoVerifDatosInt findByIdVerifDatInt(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVerifDatosInt.class);
        return em.find(TipoVerifDatosInt.class, id);
    }

    public void saveVerifDatInt(TipoVerifDatosInt tipoVerifDatosInt) throws SystemException {
        em.persist(tipoVerifDatosInt);
    }

    public TipoRepositorio findByIdRepositorio(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoRepositorio.class);
        return em.find(TipoRepositorio.class, id);
    }
    // Imagenes y repositorio

    @SuppressWarnings("unchecked")
    public TipoRepositorio findActiveRepo(String tipo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoRepositorio.class);
        List<TipoRepositorio> DataList = em.createNamedQuery("TipoRepositorio.findActive").setParameter("tipo", tipo).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<TipoImagenesQueja> findAllImagenesQueja(Integer idqueja, Integer idflujo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesQueja.class);
        switch (idflujo) {
            case 1:
                return em.createNamedQuery("TipoImagenesQueja.findAllFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            case 2:
                return em.createNamedQuery("TipoImagenesQueja.findAllFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            case 3:
                return em.createNamedQuery("TipoImagenesQueja.findAllFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            case 4:
                return em.createNamedQuery("TipoImagenesQueja.findAllFlujoConcVirt").setParameter("id_queja", idqueja).getResultList();
            case 6:
                return em.createNamedQuery("TipoImagenesQueja.findAllFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            default:
                return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoImagenesQueja> findZipImagenesQueja(Integer idqueja, Integer idflujo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesQueja.class);
        switch (idflujo) {
            case 1:
                return em.createNamedQuery("TipoImagenesQueja.findZipFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            case 2:
                return em.createNamedQuery("TipoImagenesQueja.findZipFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            case 3:
                return em.createNamedQuery("TipoImagenesQueja.findZipFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            case 4:
                return em.createNamedQuery("TipoImagenesQueja.findZipFlujoConcVirt").setParameter("id_queja", idqueja).getResultList();
            case 6:
                return em.createNamedQuery("TipoImagenesQueja.findZipFlujoAtencionCon").setParameter("id_queja", idqueja).getResultList();
            default:
                return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoImagenesQueja> findbyQuejaImagen(Integer idqueja, String imagen) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesQueja.class);
        return em.createNamedQuery("TipoImagenesQueja.findbyQuejaImagen").setParameter("id_queja", idqueja).setParameter("archivo", imagen).getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoImagenesInterno findbyQuejaImagenInterna(Integer idqueja, String imagen) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesInterno.class);
        List<TipoImagenesInterno> DataList = em.createNamedQuery("TipoImagenesInterno.findbyQuejaImagen").setParameter("id_queja", idqueja).setParameter("archivo", imagen).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoImagenesQueja findByIdImagenesQueja(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesQueja.class);
        return em.find(TipoImagenesQueja.class, id);
    }

    public TipoImagenesInterno findByIdImagenesInterno(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesInterno.class);
        return em.find(TipoImagenesInterno.class, id);
    }

    public TipoImagenesProveedor findByIdImagenesProveedor(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesProveedor.class);
        return em.find(TipoImagenesProveedor.class, id);
    }

    @SuppressWarnings("unchecked")
    public TipoImagenesQueja findbyCatImagen(Integer idqueja, Integer categoria) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesQueja.class);
        List<TipoImagenesQueja> DataList = em.createNamedQuery("TipoImagenesQueja.findbyCatImagen").setParameter("id_queja", idqueja).setParameter("categoria", categoria).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public TipoImagenesInterno findbyCatInterna(Integer idqueja, Integer categoria) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesInterno.class);
        List<TipoImagenesInterno> DataList = em.createNamedQuery("TipoImagenesInterno.findbyCatImagen").setParameter("id_queja", idqueja).setParameter("categoria", categoria).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public TipoImagenesProveedor findbyCatProveedor(Integer id_proveedor, Integer categoria) {
        this.em.getEntityManagerFactory().getCache().evict(TipoImagenesProveedor.class);
        List<TipoImagenesProveedor> DataList = em.createNamedQuery("TipoImagenesProveedor.findbyCatImagen").setParameter("id_proveedor", id_proveedor).setParameter("categoria", categoria).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void saveImagenesQueja(TipoImagenesQueja tipoImagenesQueja) {
        em.persist(tipoImagenesQueja);
    }

    public void deleteImagenesQueja(TipoImagenesQueja tipoImagenesQueja) {
        em.remove(tipoImagenesQueja);
    }

    public void saveImagenesInterno(TipoImagenesInterno tipoImagenesInterno) {
        em.persist(tipoImagenesInterno);
    }

    public void deleteImagenesInterno(TipoImagenesInterno tipoImagenesInterno) {
        em.remove(tipoImagenesInterno);
    }

    public void saveImagenesProveedor(TipoImagenesProveedor tipoImagenesProveedor) {
        em.persist(tipoImagenesProveedor);
    }

    public void deleteImagenesProveedor(TipoImagenesProveedor tipoImagenesProveedor) {
        em.remove(tipoImagenesProveedor);
    }

    public TipoTipoImagen findByIdTipoImagen(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoImagen.class);
        return em.find(TipoTipoImagen.class, id);
    }

    //Registro formulario queja
    @SuppressWarnings("unchecked")
    public TipoReg_FormularioQueja findAllTipoReg_FormularioQueja(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_FormularioQueja.class);
        List<TipoReg_FormularioQueja> DataList = em.createNamedQuery("TipoReg_FormularioQueja.findAll").setParameter("pId_queja", id_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //apertura prueba
    @SuppressWarnings("unchecked")
    public TipoReg_ResolucionAperturaAPrueba findByResAperturaPruebaIdResAudiencia(Integer idResultadoAudiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResolucionAperturaAPrueba.class);
        List<TipoReg_ResolucionAperturaAPrueba> DataList = em.createNamedQuery("TipoReg_ResolucionAperturaAPrueba.findByIdResultadoAudiencia").setParameter("idResultadoAudiencia", idResultadoAudiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void deleteRegAperturaPrueba(TipoReg_ResolucionAperturaAPrueba pTipoReg_ResolucionAperturaAPrueba) throws SystemException {
        em.remove(pTipoReg_ResolucionAperturaAPrueba);
    }

    // find declaracion de rebeldia
    @SuppressWarnings("unchecked")
    public TipoReg_DeclaracionRebeldia findByResDeclaracionRebeldia(Integer idResultadoAudiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_DeclaracionRebeldia.class);
        List<TipoReg_DeclaracionRebeldia> DataList = em.createNamedQuery("TipoReg_DeclaracionRebeldia.findByIdResultadoAudiencia").setParameter("idResultadoAudiencia", idResultadoAudiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void deleteRegRebeldia(TipoReg_DeclaracionRebeldia pTipoReg_DeclaracionRebeldia) throws SystemException {
        em.remove(pTipoReg_DeclaracionRebeldia);
    }

    // find declaracion de resolucion final
    @SuppressWarnings("unchecked")
    public TipoReg_ResolucionFinal findByResultResolucionFinal(Integer idResultadoAudiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResolucionFinal.class);
        List<TipoReg_ResolucionFinal> DataList = em.createNamedQuery("TipoReg_ResolucionFinal.findByIdResultadoAudiencia").setParameter("idResultadoAudiencia", idResultadoAudiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_FormularioQueja findByIdReg_FormularioQueja(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_FormularioQueja.class);
        return em.find(TipoReg_FormularioQueja.class, id);
    }

    public void saveReg_FormularioQueja(TipoReg_FormularioQueja tipoReg_FormularioQueja) throws SystemException {
        em.persist(tipoReg_FormularioQueja);
    }

    public void saveReg_ResAperturaPrueba(TipoReg_ResolucionAperturaAPrueba vTipoReg_ResolucionAperturaAPrueba) throws SystemException {
        em.persist(vTipoReg_ResolucionAperturaAPrueba);
    }

    public void saveReg_ResDeclaracionRebeldia(TipoReg_DeclaracionRebeldia vTipoReg_DeclaracionRebeldia) throws SystemException {
        em.persist(vTipoReg_DeclaracionRebeldia);
    }
    //resultado resolucion final

    public void saveReg_ResultResolucionFinal(TipoReg_ResolucionFinal vTipoReg_ResolucionFinal) throws SystemException {
        em.persist(vTipoReg_ResolucionFinal);
    }

    public void deleteReg_FormularioQueja(TipoReg_FormularioQueja tipoReg_FormularioQueja) throws SystemException {
        em.remove(tipoReg_FormularioQueja);
    }

    //Plantillas en blanco, para llenar actas
    @SuppressWarnings("unchecked")
    public TipoPlantilla findTipoPlantillaxID(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoPlantilla.class);
        List<TipoPlantilla> DataList = em.createNamedQuery("TipoPlantilla.findxID").setParameter("id", id).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //Confirmar Acción
    @SuppressWarnings("unchecked")
    public TipoConfirmarAccion findTipoConfirmarAccionxIdQueja(Integer id_queja, Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConfirmarAccion.class);
        List<TipoConfirmarAccion> DataList = em.createNamedQuery("TipoConfirmarAccion.findxIdQueja").setParameter("id_queja", id_queja).setParameter("id_usuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<TipoConfirmarAccion> findAllTipoConfirmarAccion(Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConfirmarAccion.class);
        return em.createNamedQuery("TipoConfirmarAccion.findAll").setParameter("id_usuario", id_usuario).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoConfirmarAccion> findTipoConfirmarAccionxIdQuejaActivo(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConfirmarAccion.class);
        return em.createNamedQuery("TipoConfirmarAccion.findAllActive").setParameter("id_queja", id_queja).setMaxResults(1).getResultList();
    }

    public TipoConfirmarAccion findByIdConfirmarAccion(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConfirmarAccion.class);
        return em.find(TipoConfirmarAccion.class, id);
    }

    public void saveConfirmarAccion(TipoConfirmarAccion tipoConfirmarAccion) throws SystemException {
        em.persist(tipoConfirmarAccion);
    }

    public void deleteConfirmarAccion(TipoConfirmarAccion tipoConfirmarAccion) throws SystemException {
        em.remove(tipoConfirmarAccion);
    }

    //tipo cola
    @SuppressWarnings("unchecked")
    public TipoTipoCola findTiposTipoCola(Integer id, String tipo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoCola.class);
        List<TipoTipoCola> DataList = null;
        if (tipo.equals("f")) {
            DataList = em.createNamedQuery("TipoTipoCola.findxflujo").setParameter("id_flujo", id).setMaxResults(1).getResultList();
        } else {
            DataList = em.createNamedQuery("TipoTipoCola.findxsede").setParameter("sede", id).setMaxResults(1).getResultList();
        }
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<TipoTipoCola> findTiposTipoColaAllSedes() {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoCola.class);
        return em.createNamedQuery("TipoTipoCola.findAllxsede").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoTipoCola> findTiposTipoColaEspecialxFlujo(Integer id_flujo) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoCola.class);
        return em.createNamedQuery("TipoTipoCola.findxFlujoEspecial").setParameter("id_flujo", id_flujo).getResultList();
    }

    public TipoTipoCola findByIdTipoCola(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoCola.class);
        return em.find(TipoTipoCola.class, id);
    }

    public void saveTipoCola(TipoTipoCola tipoTipoCola) throws SystemException {
        em.persist(tipoTipoCola);
    }

    @SuppressWarnings("unchecked")
    public List<TipoTipoCola> findTiposTipoColaAllxUsuario(Integer idusuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoCola.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        String str_perfiles = "";

        try {
            TipoUsuarioPerfil vuserroles = findUsuarioPerfil_atcon_colas(idusuario);
            if (vuserroles != null) {
                str_perfiles = "(1";
            }
            vuserroles = findUsuarioPerfil_jur_colas(idusuario);
            if (vuserroles != null) {
                if (str_perfiles.equals("")) {
                    str_perfiles = "(2";
                } else {
                    str_perfiles = str_perfiles + ",2";
                }
            }
            vuserroles = findUsuarioPerfil_vyv_colas(idusuario);
            if (vuserroles != null) {
                if (str_perfiles.equals("")) {
                    str_perfiles = "(3";
                } else {
                    str_perfiles = str_perfiles + ",3";
                }
            }
            vuserroles = findUsuarioPerfil_sp_colas(idusuario);
            if (vuserroles != null) {
                if (str_perfiles.equals("")) {
                    str_perfiles = "(6";
                } else {
                    str_perfiles = str_perfiles + ",6";
                }
            }
            if (!str_perfiles.equals("")) {
                str_perfiles = str_perfiles + ")";
                Query nq;
                String querystring = "";
                querystring = "SELECT v FROM TipoTipoCola v where v.id_flujo in " + str_perfiles;
                querystring = querystring + " order by v.id_flujo, v.nombre";
                nq = this.em.createQuery(querystring, TipoTipoCola.class);
                System.out.println("-*" + querystring + "*-");
                return nq.getResultList();
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    //queja asignacion
    @SuppressWarnings("unchecked")
    public TipoQuejaAsignacion findTiposQuejaAsignacion(Integer id_queja, Integer id_tipo_cola) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQuejaAsignacion.class);
        List<TipoQuejaAsignacion> DataList = em.createNamedQuery("TipoQuejaAsignacion.findXIDqueja").setParameter("id_queja", id_queja).setParameter("id_tipo_cola", id_tipo_cola).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoQuejaAsignacion findByIdQuejaAsignacion(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoQuejaAsignacion.class);
        return em.find(TipoQuejaAsignacion.class, id);
    }

    public void saveTipoQuejaAsignacion(TipoQuejaAsignacion tipoQuejaAsignacion) throws SystemException {
        em.persist(tipoQuejaAsignacion);
    }

    public void deleteTipoQuejaAsignacion(TipoQuejaAsignacion tipoQuejaAsignacion) throws SystemException {
        em.remove(tipoQuejaAsignacion);
    }

    //cola asignacion
    @SuppressWarnings("unchecked")
    public TipoColaAsignacion findTiposColaAsignacionPrimero(Integer id_tipo_cola) {
        this.em.getEntityManagerFactory().getCache().evict(TipoColaAsignacion.class);
        List<TipoColaAsignacion> DataList = em.createNamedQuery("TipoColaAsignacion.findPrimero").setParameter("id_tipo_cola", id_tipo_cola).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public TipoColaAsignacion findTiposColaAsignacionSiguiente(Integer id_tipo_cola, Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoColaAsignacion.class);
        List<TipoColaAsignacion> DataList = em.createNamedQuery("TipoColaAsignacion.findSiguiente").setParameter("id_tipo_cola", id_tipo_cola).setParameter("id_usuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public TipoColaAsignacion findTiposColaAsignacionxTipoyUsuario(Integer id_tipo_cola, Integer id_usuario) {
        this.em.getEntityManagerFactory().getCache().evict(TipoColaAsignacion.class);
        List<TipoColaAsignacion> DataList = em.createNamedQuery("TipoColaAsignacion.findXTipoyUsuario").setParameter("id_tipo_cola", id_tipo_cola).setParameter("id_usuario", id_usuario).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public List<TipoColaAsignacion> findTiposColaAsignacionxTipo(Integer id_tipo_cola) {
        this.em.getEntityManagerFactory().getCache().evict(TipoColaAsignacion.class);
        return em.createNamedQuery("TipoColaAsignacion.findXTipo").setParameter("id_tipo_cola", id_tipo_cola).getResultList();
    }

    public TipoColaAsignacion findByIdColaAsignacion(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoColaAsignacion.class);
        return em.find(TipoColaAsignacion.class, id);
    }

    public void saveColaAsignacion(TipoColaAsignacion tipoColaAsignacion) throws SystemException {
        em.persist(tipoColaAsignacion);
    }

    public void deleteColaAsignacion(TipoColaAsignacion tipoColaAsignacion) throws SystemException {
        em.remove(tipoColaAsignacion);
    }
    //email server config

    @SuppressWarnings("unchecked")
    public TipoMailServer findAllTipoMailServer() {
        this.em.getEntityManagerFactory().getCache().evict(TipoMailServer.class);
        List<TipoMailServer> DataList = em.createNamedQuery("TipoMailServer.findAll").setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //tareas programadas
    public void saveTareaProgramada(TipoTareaProgramadaEjec tipoTareaProgramadaEjec) throws SystemException {
        em.persist(tipoTareaProgramadaEjec);
    }

    //reasignar queja
    public TipoReasignar findByIdQuejaReasignar(Integer idqueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReasignar.class);
        List<TipoReasignar> DataList = em.createNamedQuery("TipoReasignar.findAllxIdQueja").setParameter("idqueja", idqueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReasignar findByIdReasignar(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReasignar.class);
        return em.find(TipoReasignar.class, id);
    }

    public void saveReasignar(TipoReasignar tipoReasignar) throws SystemException {
        em.persist(tipoReasignar);
    }

    public void deleteReasignar(TipoReasignar tipoReasignar) throws SystemException {
        em.remove(tipoReasignar);
    }

    //funciones Generación de registros
    public TipoReg_ComPerm findByIdComunicacionPermanente(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ComPerm.class);
        return em.find(TipoReg_ComPerm.class, id);
    }

    public TipoReg_FichaQueja findByIdFichaQueja(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_FichaQueja.class);
        return em.find(TipoReg_FichaQueja.class, id);
    }

    public TipoReg_FormularioQueja findByIdFormularioQueja(Integer pId_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_FormularioQueja.class);
        List<TipoReg_FormularioQueja> DataList = em.createNamedQuery("TipoReg_FormularioQueja.findAll").setParameter("pId_queja", pId_queja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);

    }

    public TipoReg_ResVisitaCampo findByIdResolucionVisitaCampo(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResVisitaCampo.class);
        return em.find(TipoReg_ResVisitaCampo.class, id);
    }

    public TipoReg_ResArchivoVerificacion findByIdResolucionVisitaCampoVerif(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResArchivoVerificacion.class);
        return em.find(TipoReg_ResArchivoVerificacion.class, id);
    }

    public TipoReg_CedulaNotificacionResJuridico findByIdCedulaNotificacionResJuridico(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionResJuridico.class);
        return em.find(TipoReg_CedulaNotificacionResJuridico.class, id);
    }

    public TipoReg_CedulaNotificacionResJuridico findByIdAudienciaCedulaNotiResJuridico(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionResJuridico.class);
        List<TipoReg_CedulaNotificacionResJuridico> DataList = em.createNamedQuery("TipoReg_CedulaNotificacionResJuridico.findByIdAudiencia").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public void deleteCedulaNotificacionResJuridico(TipoReg_CedulaNotificacionResJuridico pTipoReg_CedulaNotificacionResJuridico) throws SystemException {
        em.remove(pTipoReg_CedulaNotificacionResJuridico);
    }

    public TipoReg_CedulaNotificacionCitacionJuridico findByIdCedulaNotificacionCitacionJuridico(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionCitacionJuridico.class);
        return em.find(TipoReg_CedulaNotificacionCitacionJuridico.class, id);
    }

    public TipoReg_CedulaNotificacionCitacionJuridico findByIdAudienciaCPCedulaNotiCitaJuridico(Integer pId_audiencia, String esCP) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedulaNotificacionCitacionJuridico.class);
        List<TipoReg_CedulaNotificacionCitacionJuridico> DataList = em.createNamedQuery("TipoReg_CedulaNotificacionCitacionJuridico.findByIdAudienciaTipoCP").setParameter("id_audiencia", pId_audiencia).setParameter("esCP", esCP).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_RegCedulaNotificacionCitCorreo findByIdRegCedulaNotificacionCitCorreo(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_RegCedulaNotificacionCitCorreo.class);
        return em.find(TipoReg_RegCedulaNotificacionCitCorreo.class, id);
    }

    public TipoReg_RegCedulaNotificacionCitCorreo findByIdAudienciaRegCedNotiCitCorreo(Integer id_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_RegCedulaNotificacionCitCorreo.class);
        List<TipoReg_RegCedulaNotificacionCitCorreo> DataList = em.createNamedQuery("TipoReg_RegCedulaNotificacionCitCorreo.findByIdAudiencia").setParameter("id_audiencia", id_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedCitacionCon findByIdCedCitacionCons(Integer pId_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionCon.class);
        List<TipoReg_CedCitacionCon> DataList = em.createNamedQuery("TipoReg_CedCitacionCon.findAll").setParameter("id_audiencia", pId_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedCitacionPro findByIdCedCitacionProv(Integer pId_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedCitacionPro.class);
        List<TipoReg_CedCitacionPro> DataList = em.createNamedQuery("TipoReg_CedCitacionPro.findAll").setParameter("id_audiencia", pId_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedNotificacionCon findByIdCedNotiCons(Integer pId_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionCon.class);
        List<TipoReg_CedNotificacionCon> DataList = em.createNamedQuery("TipoReg_CedNotificacionCon.findAll").setParameter("id_audiencia", pId_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_CedNotificacionPro findByIdCedNotiProv(Integer pId_audiencia) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_CedNotificacionPro.class);
        List<TipoReg_CedNotificacionPro> DataList = em.createNamedQuery("TipoReg_CedNotificacionPro.findAll").setParameter("id_audiencia", pId_audiencia).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public Tipo_RegResArchivoConciliacion findByIdResArchivoConciliacion(Integer pId) {
        this.em.getEntityManagerFactory().getCache().evict(Tipo_RegResArchivoConciliacion.class);
        List<Tipo_RegResArchivoConciliacion> DataList = em.createNamedQuery("Tipo_RegResArchivoConciliacion.findById").setParameter("id", pId).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);

    }

    public TipoReg_ResArchivoUnicaAudienciaConc findByIdResArchivoUnicaAudConc(Integer pId) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResArchivoUnicaAudienciaConc.class);
        List<TipoReg_ResArchivoUnicaAudienciaConc> DataList = em.createNamedQuery("TipoReg_ResArchivoUnicaAudienciaConc.findById").setParameter("id", pId).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);

    }

    public TipoReg_MovimExp findByIdRegMovExpediente(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_MovimExp.class);
        List<TipoReg_MovimExp> DataList = em.createNamedQuery("TipoReg_MovimExp.findById").setParameter("id", id).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public List<TipoReg_MovimExpDet> findByIdRegMovExpedienteDetalle(Integer pId_Mov_Exp) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_MovimExpDet.class);
        // List<TipoReg_MovimExpDet> DataList=em.createNamedQuery("TipoReg_MovimExpDet.findAll").setParameter("id", pId_Mov_Exp).setMaxResults(1).getResultList();
        List<TipoReg_MovimExpDet> DataList = em.createQuery("SELECT t FROM TipoReg_MovimExpDet t where t.tipoReg_MovimExp.id = :pId", TipoReg_MovimExpDet.class).setParameter("pId", pId_Mov_Exp).getResultList();
        return DataList;
    }

    public Tipo_RegResArchivoConciliacion findTiposReg_ResArchivoConciliacion(Integer pIdQueja) {
        this.em.getEntityManagerFactory().getCache().evict(Tipo_RegResArchivoConciliacion.class);
        List<Tipo_RegResArchivoConciliacion> DataList = em.createNamedQuery("Tipo_RegResArchivoConciliacion.findByIdQueja").setParameter("idQueja", pIdQueja).setMaxResults(1).getResultList();;
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public Tipo_RegResArchivoConciliacion saveReg_ResArchConciliacion(Tipo_RegResArchivoConciliacion tipoReg_ResArchicoConciliacion) throws SystemException {
        em.persist(tipoReg_ResArchicoConciliacion);
        em.flush();
        return tipoReg_ResArchicoConciliacion;
    }

    public TipoReg_ResArchivoUnicaAudienciaConc findTiposReg_ResArchUnAudConciliacion(Integer pIdQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ResArchivoUnicaAudienciaConc.class);
        List<TipoReg_ResArchivoUnicaAudienciaConc> DataList = em.createNamedQuery("TipoReg_ResArchivoUnicaAudienciaConc.findByIdQueja").setParameter("idQueja", pIdQueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_ResArchivoUnicaAudienciaConc saveReg_ResArchUnAudConciliacion(TipoReg_ResArchivoUnicaAudienciaConc tipoReg_ResArchivoUnicaAudienciaConc) throws SystemException {
        em.persist(tipoReg_ResArchivoUnicaAudienciaConc);
        em.flush();
        return tipoReg_ResArchivoUnicaAudienciaConc;
    }
//fin funciones generacion de registros

    //parametros generales
    public TipoParamGeneral findByIdParamGeneral(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoParamGeneral.class);
        return em.find(TipoParamGeneral.class, id);
    }

    public void saveParamGeneral(TipoParamGeneral tipoParamGeneral) throws SystemException {
        em.persist(tipoParamGeneral);
    }

    //configuracion usuarios
    @SuppressWarnings("unchecked")
    public List<TipoUsuario_Simple> findTipoUsuarioCustomFilter(FormUsuarioSrch formUsuarioSrch) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Simple.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        Query nq;
        try {
            String querystring = "";
            if (formUsuarioSrch.getFlujo() == 0) {
                querystring = "SELECT v FROM TipoUsuario_Simple v where v.id_proveedor is null and v.habilitado != '9'";
            } else {
                querystring = "SELECT v FROM TipoUsuario_Simple v where v.id_proveedor is null and v.habilitado != '9' and v.id_usuario in ( select distinct sq.diacoUsuario.idUsuario from TipoUsuarioPerfil sq where sq.diacoPerfilesPuesto.tipoflujo.id = :id_flujo )";
            }
            if (!formUsuarioSrch.getNombre().equals("")) {
                querystring = querystring + " and UPPER(v.nombre) LIKE UPPER(:nombre)";
            }
            if (!formUsuarioSrch.getUsuario().equals("")) {
                querystring = querystring + " and UPPER(v.login) LIKE UPPER(:login)";
            }
            querystring = querystring + " order by v.login";
            nq = this.em.createQuery(querystring, TipoUsuario_Simple.class).setMaxResults(2000);
            if (formUsuarioSrch.getFlujo() != 0) {
                nq.setParameter("id_flujo", formUsuarioSrch.getFlujo());
            }
            String param = "";
            if (!formUsuarioSrch.getNombre().equals("")) {
                param = "%" + formUsuarioSrch.getNombre().replaceAll(" ", "%") + "%";
                nq.setParameter("nombre", param);
            }
            if (!formUsuarioSrch.getUsuario().equals("")) {
                param = "%" + formUsuarioSrch.getUsuario().replaceAll(" ", "%") + "%";
                nq.setParameter("login", param);
            }
            System.out.println("-*" + querystring + "*-");
            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoUsuario_Simple> findTipoUsuarioCustomFilterConcPrev(FormUsuarioSrch formUsuarioSrch) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Simple.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario_Conf.class);
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuarioPerfil.class);
        Query nq;
        try {
            String querystring = "";
            if (formUsuarioSrch.getProveedor() == 0) {
                querystring = "SELECT v FROM TipoUsuario_Simple v where v.id_proveedor IS NOT NULL and v.habilitado != '9'";
            } else {
                querystring = "SELECT v FROM TipoUsuario_Simple v where v.id_proveedor = :id_proveedor and v.habilitado != '9'";
            }
            if (!formUsuarioSrch.getNombre().equals("")) {
                querystring = querystring + " and UPPER(v.nombre) LIKE UPPER(:nombre)";
            }
            if (!formUsuarioSrch.getUsuario().equals("")) {
                querystring = querystring + " and UPPER(v.login) LIKE UPPER(:login)";
            }
            querystring = querystring + " order by v.login";
            nq = this.em.createQuery(querystring, TipoUsuario_Simple.class).setMaxResults(2000);
            if (formUsuarioSrch.getProveedor() != 0) {
                nq.setParameter("id_proveedor", formUsuarioSrch.getProveedor());
            }
            String param = "";
            if (!formUsuarioSrch.getNombre().equals("")) {
                param = "%" + formUsuarioSrch.getNombre().replaceAll(" ", "%") + "%";
                nq.setParameter("nombre", param);
            }
            if (!formUsuarioSrch.getUsuario().equals("")) {
                param = "%" + formUsuarioSrch.getUsuario().replaceAll(" ", "%") + "%";
                nq.setParameter("login", param);
            }
            System.out.println("-*" + querystring + "*-");
            return nq.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<TipoDepartamentoInterno> findAllTiposDepartamentoInterno() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.createNamedQuery("TipoDepartamentoInterno.findAll").getResultList();
    }

    public TipoDepartamentoInterno findByIdDepartamentoInterno(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.find(TipoDepartamentoInterno.class, id);
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTiposDepartamentoInterno() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamentoInterno.class);
        return em.createQuery("select max(t.id_departamento_interno) from TipoDepartamentoInterno t ").getSingleResult();
    }

    public void saveDepartamentoInterno(TipoDepartamentoInterno tipoDepartamentoInterno) throws SystemException {
        em.persist(tipoDepartamentoInterno);
    }

    public void deleteDepartamentoInterno(TipoDepartamentoInterno tipoDepartamentoInterno) throws SystemException {
        em.remove(tipoDepartamentoInterno);
    }

    @SuppressWarnings("unchecked")
    public List<TipoPais> findAllPaises() {
        this.em.getEntityManagerFactory().getCache().evict(TipoPais.class);
        return em.createNamedQuery("TipoPais.findAll").getResultList();
    }

    public void savePais(TipoPais tipoPais) throws SystemException {
        em.persist(tipoPais);
    }

    public TipoPais findByIdPais(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoPais.class);
        return em.find(TipoPais.class, id);

    }

    public void saveSede(TipoSede tipoSede) throws SystemException {
        em.persist(tipoSede);
    }

    public void saveDiaInhabil(TipoDiaInhabil tipoDiaInhabil) throws SystemException {
        em.persist(tipoDiaInhabil);
    }

    public TipoDiaInhabil findByIdDiaInhabil(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoDiaInhabil.class);
        return em.find(TipoDiaInhabil.class, id);
    }

    public void deleteDiaInhabil(TipoDiaInhabil tipoDiaInhabil) throws SystemException {
        em.remove(tipoDiaInhabil);
    }

    @SuppressWarnings("unchecked")
    public List<TipoDiaInhabil> findAllTipoDiaInhabil(Integer id_departamentoP) {
        this.em.getEntityManagerFactory().getCache().evict(TipoDiaInhabil.class);
        return em.createNamedQuery("TipoDiaInhabil.findAllByDepto").setParameter("id_departamentoP", id_departamentoP).getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoMotivoQueja findMotivoQueja(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQueja.class);
        return em.find(TipoMotivoQueja.class, id);
    }

    //motivo queja finalizada
    @SuppressWarnings("unchecked")
    public List<TipoMotivoQueja> findAllMotivoQueja() {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQueja.class);
        return em.createNamedQuery("TipoMotivoQueja.findAll").getResultList();
    }

    public void saveMotivoQueja(TipoMotivoQueja tipoMotivoQueja) throws SystemException {
        em.persist(tipoMotivoQueja);
    }

    //Catalogo Puestos
    @SuppressWarnings("unchecked")
    public List<TipoPuesto> findPuestoAll() {
        this.em.getEntityManagerFactory().getCache().evict(TipoPuesto.class);
        return em.createNamedQuery("TipoPuesto.findAll").getResultList();
    }

    //proveedor aprobar
    public List<TipoProveedorAprobar> findByEstadoProveedorAprobar(String estado) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedorAprobar.class);
        return em.createNamedQuery("TipoProveedorAprobar.findxEstado").setParameter("estado", estado).getResultList();
    }

    public List<TipoProveedorAprobar> findAllProveedorAprobar() {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedorAprobar.class);
        return em.createNamedQuery("TipoProveedorAprobar.findAll").getResultList();
    }

    public TipoProveedorAprobar findByIdProveedorAprobar(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedorAprobar.class);
        return em.find(TipoProveedorAprobar.class, id);
    }

    public TipoProveedorAprobar findProveedorAprobarxNitProv(String NitProv) {
        this.em.getEntityManagerFactory().getCache().evict(TipoProveedorAprobar.class);
        List<TipoProveedorAprobar> DataList = em.createNamedQuery("TipoProveedorAprobar.findByNitProv").setParameter("NitProv", NitProv).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);

    }

    public void saveProveedorAprobar(TipoProveedorAprobar tipoProveedorAprobar) throws SystemException {
        em.persist(tipoProveedorAprobar);
    }

    public void deleteProveedorAprobar(TipoProveedorAprobar tipoProveedorAprobar) throws SystemException {
        em.remove(tipoProveedorAprobar);
    }

    //em set, get
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    //Portal Links
    @SuppressWarnings("unchecked")
    public List<TipoPortalLinks> findPortalLinksAll() {
        this.em.getEntityManagerFactory().getCache().evict(TipoPortalLinks.class);
        return em.createNamedQuery("TipoPortalLinks.findAll").getResultList();
    }

    //resultado de audiencia para juridico 
    public TipoResAudiencia findByIdResAudiencia(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoResAudiencia.class);
        return em.find(TipoResAudiencia.class, id);
    }

    public void saveResAudiencia(TipoResAudiencia tipoResAudiencia) throws SystemException {
        em.persist(tipoResAudiencia);
    }

    public void deleteResAudiencia(TipoResAudiencia tipoResAudiencia) throws SystemException {
        em.remove(tipoResAudiencia);
    }

    @SuppressWarnings("unchecked")
    public List<TipoResAudiencia> findAllResAudiencia(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoResAudiencia.class);
        return em.createNamedQuery("TipoResAudiencia.findAll").setParameter("id_queja", id_queja).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoPuesto> findAllTipoPuesto() {
        this.em.getEntityManagerFactory().getCache().evict(TipoPuesto.class);
        return em.createNamedQuery("TipoPuesto.findAll").getResultList();
    }

    //resolucion final para juridico 
    public TipoResFinal findByIdResFinal(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoResFinal.class);
        return em.find(TipoResFinal.class, id);
    }

    public void saveResFinal(TipoResFinal tipoResFinal) throws SystemException {
        em.persist(tipoResFinal);
    }

    public void deleteResFinal(TipoResFinal tipoResFinal) throws SystemException {
        em.remove(tipoResFinal);
    }

    @SuppressWarnings("unchecked")
    public List<TipoResFinal> findAllResFinal(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoResFinal.class);
        return em.createNamedQuery("TipoResFinal.findAll").setParameter("id_queja", id_queja).getResultList();
    }

    //resolucion final para juridico 
    public TipoMovimientos findByIdMovimientos(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMovimientos.class);
        return em.find(TipoMovimientos.class, id);
    }

    public void saveMovimientos(TipoMovimientos tipoMovimientos) throws SystemException {
        em.persist(tipoMovimientos);
    }

    public void deleteMovimientos(TipoMovimientos tipoMovimientos) throws SystemException {
        em.remove(tipoMovimientos);
    }

    @SuppressWarnings("unchecked")
    public TipoMovimientos findbyIdQuejaMovimientos(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMovimientos.class);
        List<TipoMovimientos> DataList = em.createNamedQuery("TipoMovimientos.findAll").setParameter("id_queja", id_queja).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public Date findTipoConfirmarAccionByUsuarioAsignado(Integer id_usuario, Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConfirmarAccion.class);

        Query query = em.createNativeQuery("select fecha_aceptacion from diaco_confirmar_accion t where t.id_queja=? and t.id_usuario=? and t.id=(select max(t2.id) from diaco_confirmar_accion t2 where t2.id_queja=? and t2.id_usuario= ?)");
        query.setParameter(1, id_queja);
        query.setParameter(2, id_usuario);
        query.setParameter(3, id_queja);
        query.setParameter(4, id_usuario);

        Timestamp fechaTimeStamp;
        fechaTimeStamp = (Timestamp) query.getResultList().get(0);
        Date fecha_asignacion = new Date(fechaTimeStamp.getTime());
        /*for (Object[] objects : rawResultList) {
               if(objects[0]!=null)
               {
                  fecha_asignacion= (Date) objects[0];
               }
           }*/
        return fecha_asignacion;

    }

    
    @SuppressWarnings("unchecked")
    public Date findConfAccionReciente(Integer id_usuario, Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConfirmarAccion.class);

        Query query = em.createNativeQuery("select max(fecha_aceptacion) from diaco_confirmar_accion t where t.id_queja=? and t.id_usuario=? AND t.estado='I'");
        query.setParameter(1, id_queja);
        query.setParameter(2, id_usuario);

        Timestamp fechaTimeStamp;
        fechaTimeStamp = (Timestamp) query.getResultList().get(0);
        Date fecha_asignacion = new Date(fechaTimeStamp.getTime());
        /*for (Object[] objects : rawResultList) {
               if(objects[0]!=null)
               {
                  fecha_asignacion= (Date) objects[0];
               }
           }*/
        return fecha_asignacion;

    }

    public Long getSecuenciaCitasNotis() {
        Query query = em.createNativeQuery("SELECT (NEXT VALUE FOR dbo.citaciones_notificaciones_at_seq)");
        return (Long) query.getSingleResult();
    }

    public Long getSecuenciaCitasNotisJur() {
        Query query = em.createNativeQuery("SELECT (NEXT VALUE FOR citaciones_notificaciones_jur_seq)");
        return (Long) query.getSingleResult();
    }

    public TipoReg_ActaConciliacion findTipoReg_ActaConciliacion(Integer pIdQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ActaConciliacion.class);
        List<TipoReg_ActaConciliacion> DataList = em.createNamedQuery("TipoReg_ActaConciliacion.findByIdQueja").setParameter("idQueja", pIdQueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_ActaConciliacion saveReg_ActaConciliacion(TipoReg_ActaConciliacion tipoReg_ActaConciliacion) throws SystemException {
        em.persist(tipoReg_ActaConciliacion);
        em.flush();
        return tipoReg_ActaConciliacion;
    }

    public TipoReg_ActaIncomparecencia findTipoReg_ActaIncomparecencia(Integer pIdQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ActaIncomparecencia.class);
        List<TipoReg_ActaIncomparecencia> DataList = em.createNamedQuery("TipoReg_ActaIncomparecencia.findByIdQueja").setParameter("idQueja", pIdQueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_ActaJuridico findTipoReg_ActaJuridico(Integer pIdQueja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoReg_ActaJuridico.class);
        List<TipoReg_ActaJuridico> DataList = em.createNamedQuery("TipoReg_ActaJuridico.findByIdQueja").setParameter("idQueja", pIdQueja).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    public TipoReg_ActaJuridico saveTipoReg_ActaJuridico(TipoReg_ActaJuridico vTipoReg_ActaJuridico) throws SystemException {
        em.persist(vTipoReg_ActaJuridico);
        em.flush();
        return vTipoReg_ActaJuridico;
    }

    public TipoReg_ActaIncomparecencia saveTipoReg_ActaIncomparecencia(TipoReg_ActaIncomparecencia tipoReg_ActaIncomparecencia) throws SystemException {
        em.persist(tipoReg_ActaIncomparecencia);
        em.flush();
        return tipoReg_ActaIncomparecencia;
    }

    //vyv asigna queja inicial
    public TipoVyvAsignaCola findByIdVyvQuejaInicial(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVyvAsignaCola.class);
        return em.find(TipoVyvAsignaCola.class, id);
    }

    public void saveVyvQuejaInicial(TipoVyvAsignaCola tipoVyvAsignaCola) throws SystemException {
        em.persist(tipoVyvAsignaCola);
    }

    public void deleteVyvQuejaInicial(TipoVyvAsignaCola tipoVyvAsignaCola) throws SystemException {
        em.remove(tipoVyvAsignaCola);
    }

    @SuppressWarnings("unchecked")
    public TipoVyvAsignaCola findbyIdQVyvQuejaInicial(Integer id_queja) {
        this.em.getEntityManagerFactory().getCache().evict(TipoVyvAsignaCola.class);
        List<TipoVyvAsignaCola> DataList = em.createNamedQuery("TipoVyvAsignaCola.findAll").setParameter("id_queja", id_queja).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    //qr path 
    @SuppressWarnings("unchecked")
    public TipoQRpath findQRpath() {
        this.em.getEntityManagerFactory().getCache().evict(TipoQRpath.class);
        List<TipoQRpath> DataList = em.createNamedQuery("TipoQRpath.findAll").getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public TipoPuesto findTipoPuesto(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoPuesto.class);
        return em.find(TipoPuesto.class, id);
    }

    public void savePuesto(TipoPuesto tipoPuesto) throws SystemException {
        em.persist(tipoPuesto);
    }

    @SuppressWarnings("unchecked")
    public List<TipoTipoCola> findAllTipoCola() {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoCola.class);
        return em.createNamedQuery("TipoTipoCola.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoUsuario> findTipoUsuarioByLogin(String login) {
        this.em.getEntityManagerFactory().getCache().evict(TipoUsuario.class);
        return em.createNamedQuery("TipoUsuario.findByLogin").setParameter("login", login).getResultList();
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTipoPuesto() {
        this.em.getEntityManagerFactory().getCache().evict(TipoPuesto.class);
        return em.createQuery("select max(t.id) from TipoPuesto t ").getSingleResult();
    }

    //obtiene una lista de departamentos incluyendo el llamado "Todo el pais"
    @SuppressWarnings("unchecked")
    public List<TipoDepartamento> findAllTipoDepartamentoComboDiaInhabil() {
        this.em.getEntityManagerFactory().getCache().evict(TipoDepartamento.class);
        return em.createNamedQuery("TipoDepartamento.findAllComboDiaInhabil").getResultList();
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTipoCola() {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoCola.class);
        return em.createQuery("select max(t.id_tipo_cola) from TipoTipoCola t ").getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public TipoFlujo findByIdFlujo(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujo.class);
        return em.find(TipoFlujo.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<TipoFlujo> findAllTipoFlujo() {
        this.em.getEntityManagerFactory().getCache().evict(TipoFlujo.class);
        return em.createNamedQuery("TipoFlujo.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoEtnia> findAllTipoEtnia() {
        this.em.getEntityManagerFactory().getCache().evict(TipoEtnia.class);
        return em.createNamedQuery("TipoEtnia.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTipoConsumidor() {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        return em.createQuery("select max(t.id_consumidor) from TipoConsumidor t ").getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public TipoConsumidor findConsumidorByNit(String nit) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        List<TipoConsumidor> DataList = em.createNamedQuery("TipoConsumidor.findByNit").setParameter("nit", nit).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }
    
    @SuppressWarnings("unchecked")
    public TipoConsumidor findConsumidorByDpi(String dpi) {
        this.em.getEntityManagerFactory().getCache().evict(TipoConsumidor.class);
        List<TipoConsumidor> DataList = em.createNamedQuery("TipoConsumidor.findByDpi").setParameter("dpi", dpi).setMaxResults(1).getResultList();
        return DataList.isEmpty() ? null : DataList.get(0);
    }

    @SuppressWarnings("unchecked")
    public TipoEtnia findByIdEtnia(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoEtnia.class);
        return em.find(TipoEtnia.class, id);
    }

    @SuppressWarnings("unchecked")
    public TipoMotivoQueja findByIdMotivoQueja(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQueja.class);
        return em.find(TipoMotivoQueja.class, id);
    }

    @SuppressWarnings("unchecked")
    public TipoTipoConsumidor findByIdTipoConsumidor(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoConsumidor.class);
        return em.find(TipoTipoConsumidor.class, id);
    }

    public void saveTipoTipoConsumidor(TipoTipoConsumidor tipoTipoConsumidor) throws SystemException {
        em.persist(tipoTipoConsumidor);
    }

    @SuppressWarnings("unchecked")
    public List<TipoTipoConsumidor> findAllTipoTipoConsumidor() {
        this.em.getEntityManagerFactory().getCache().evict(TipoTipoConsumidor.class);
        return em.createNamedQuery("TipoTipoConsumidor.findAll").getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoAreaInterna findByIdTipoAreaInterna(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoAreaInterna.class);
        return em.find(TipoAreaInterna.class, id);
    }

    public void saveTipoAreaInterna(TipoAreaInterna tipoArea) throws SystemException {
        em.persist(tipoArea);
    }

    @SuppressWarnings("unchecked")
    public List<TipoAreaInterna> findAllTipoAreaInterna() {
        this.em.getEntityManagerFactory().getCache().evict(TipoAreaInterna.class);
        return em.createNamedQuery("TipoAreaInterna.findAll").getResultList();
    }

    public void saveTipoMotivoQuejaFinalizada(TipoMotivoQuejaFinalizada tipoQueja) throws SystemException {
        em.persist(tipoQueja);
    }

    @SuppressWarnings("unchecked")
    public List<TipoMotivoQuejaFinalizada> findAllTipoMotivoQuejaFinalizada() {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQuejaFinalizada.class);
        return em.createNamedQuery("TipoMotivoQuejaFinalizada.findAll2").getResultList();
    }

    @SuppressWarnings("unchecked")
    public TipoMotivoQuejaFinalizada findByIdTipoMotivoQuejaFinalizada(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQuejaFinalizada.class);
        return em.find(TipoMotivoQuejaFinalizada.class, id);
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTipoMotivoQuejaFinalizada() {
        this.em.getEntityManagerFactory().getCache().evict(TipoMotivoQuejaFinalizada.class);
        return em.createQuery("select max(t.id_motivo_queja_finalizada) from TipoMotivoQuejaFinalizada t  ").getSingleResult();
    }

    public void saveActividadEconomica(TipoActividadEconomica tipoActividad) throws SystemException {
        em.persist(tipoActividad);
    }

    public void saveTipoComercio(TipoComercio tipoComercio) throws SystemException {
        em.persist(tipoComercio);
    }

    @SuppressWarnings("unchecked")
    public List<TipoComercio> findAllTipoComercio() {
        this.em.getEntityManagerFactory().getCache().evict(TipoComercio.class);
        return em.createNamedQuery("TipoComercio.findAll2").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<TipoSucursal> findAllTipoSucursalByProveedor(Integer id_proveedor) {
        return em.createNamedQuery("TipoSucursal.findAllByProveedor").setParameter("id_proveedor", id_proveedor).getResultList();
    }

    public void saveTipoSucursal(TipoSucursal tipoSucursal) throws SystemException {
        em.persist(tipoSucursal);
    }

    public TipoSucursal findByIdTipoSucursal(Integer id) {
        this.em.getEntityManagerFactory().getCache().evict(TipoSucursal.class);
        return em.find(TipoSucursal.class, id);
    }

    @SuppressWarnings("unchecked")
    public Object findNextIdTipoSucursal() {
        return em.createQuery("select max(t.id_sucursal) from TipoSucursal t ").getSingleResult();
    }

    @SuppressWarnings("unchecked")
    public List<TipoProveedor> listProveedorAll() {
        return em.createNamedQuery("TipoProveedor.findAll").getResultList();
    }
}
