package gt.gob.mineco.diaco.model;

import com.google.gson.JsonObject;
import java.io.Serializable;
import javax.persistence.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import gt.gob.mineco.diaco.model.TipoDepartamento;
import gt.gob.mineco.diaco.model.TipoMunicipio;
/**
 * The persistent class for the diaco_consumidor database table.
 * 
 */
@Entity
@Table(name="diaco_consumidor")
@NamedQueries({
@NamedQuery(name="TipoConsumidor.findAll", query="SELECT t FROM TipoConsumidor t where t.habilitado='1' "),
@NamedQuery(name="TipoConsumidor.findByNit", query="SELECT t FROM TipoConsumidor t where t.nit_consumidor = :nit and t.habilitado='1' "),
@NamedQuery(name="TipoConsumidor.findByDpi", query="SELECT t FROM TipoConsumidor t where t.documento_identificacion = :dpi and t.habilitado='1' ")
})        
//inner join t.tipopasoqueja og where og.id_queja_paso=:usr
public class TipoConsumidor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consumidor_seq")
        @SequenceGenerator(name = "consumidor_seq", sequenceName = "seq_diaco_consumidor", allocationSize = 1)
	@Column(name="id_consumidor", precision=0) 
        private Integer id_consumidor;
        @Column(name="nacionalidad")
        private Integer nacionalidad;
        @Column(name="tipo_consumidor")        
	private Integer tipo_consumidor;
        @Column(name="nit_consumidor")
        private String nit_consumidor;
	@Column(name="documento_identificacion")        
	private String documento_identificacion;
        @Column(name="genero")        
	private String genero;
        @Column(name="direccion_calle")        
	private String direccion_calle;
        @Column(name="direccion_avenida")        
	private String direccion_avenida;
        @Column(name="direccion_zona")        
	private String direccion_zona;
        @Column(name="codigo_municipio")        
	private Integer codigo_municipio;
        @Column(name="codigo_departamento")        
	private Integer codigo_departamento;
        @Column(name="sede_diaco_cercana")        
	private Integer sede_diaco_cercana;
        @Column(name="habilitado_notificacion_electronica")        
	private String habilitado_notificacion_electronica;
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name="fecha_adicion")
        private Date fecha_adicion;
        @Column(name="usuario_adiciono")        
	private String usuario_adiciono;
        @Column(name="usuario_modifico")        
	private String usuario_modifico;
        @Column(name="nombre1")        
	private String nombre1;
        @Column(name="nombre2")        
	private String nombre2;
        @Column(name="nombre3")        
	private String nombre3;
        @Column(name="apellido1")        
	private String apellido1;
        @Column(name="apellido2")        
	private String apellido2;
        @Column(name="apellido_casada")        
	private String apellido_casada;
        @Column(name="id_motivo_queja")        
	private Integer id_motivo_queja;
        @Column(name="tipo_documento")        
	private Integer tipo_documento;
        @Column(name="id_pais")        
	private Integer id_pais;
        @Column(name="id_etnia")
        private Integer id_etnia;
        @Column(name="domicilio")
        private String domicilio;
        @Column(name="direccion_detalle")
        private String direccion_detalle;
        @Column(name="telefono")
        private String telefono;
        @Column(name="referencia")
        private String referencia;
        @Column(name="correo_electronico1")
        private String correo_electronico1;
        @Column(name="correo_electronico2")
        private String correo_electronico2;
        @Column(name="direccion")
        private String direccion;
        @Column(name="representante_legal")
        private String representante_legal;
        @Column(name="nombre_empresa")
        private String nombre_empresa;
        @Column(name="razon_social")
        private String razon_social;
       @Column(name="habilitado")
       private String habilitado;
       @Column(name="autorizoPublicar")
       private String autorizoPublicar;
       
        
        
        
        @OneToOne
        @JoinColumn(name = "codigo_departamento", referencedColumnName = "codigo_departamento",updatable=false, insertable=false)
        private TipoDepartamento tipoDepartamento;
        @OneToOne
        @JoinColumn(name = "codigo_municipio", referencedColumnName = "codigo_municipio",updatable=false, insertable=false)
        private TipoMunicipio tipoMunicipio;
        
        
        @JoinColumn(name = "id_motivo_queja", referencedColumnName = "id_motivo_queja",updatable=false, insertable=false)
        private TipoMotivoQueja tipoMotivoQueja;
                
        
        @JoinColumn(name = "id_pais", referencedColumnName = "id_pais",updatable=false, insertable=false)
        private TipoPais tipoPais;

        
        @JoinColumn(name = "sede_diaco_cercana", referencedColumnName = "id_diaco_sede",updatable=false, insertable=false)
        private TipoSede tipoSede;

        
    public TipoConsumidor() {
       
    }

    public String getAutorizoPublicar() {
        return autorizoPublicar;
    }

    public void setAutorizoPublicar(String autorizoPublicar) {
        this.autorizoPublicar = autorizoPublicar;
    }

    
    
    
    
    public String GetDireccionCompleta(){
        String direccion="";
        if(direccion_calle!=null)
            direccion=direccion+direccion_calle+" calle ";
        if(direccion_avenida!=null)
            direccion=direccion+direccion_avenida+" avenida ";
        if(direccion_zona!=null)
            direccion=direccion+", zona "+direccion_zona;
        return direccion.trim();
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    
    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCorreo_electronico1() {
        return correo_electronico1;
    }

    public void setCorreo_electronico1(String correo_electronico1) {
        this.correo_electronico1 = correo_electronico1;
    }

    public String getCorreo_electronico2() {
        return correo_electronico2;
    }

    public void setCorreo_electronico2(String correo_electronico2) {
        this.correo_electronico2 = correo_electronico2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(String representante_legal) {
        this.representante_legal = representante_legal;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDireccion_detalle() {
        return direccion_detalle;
    }

    public void setDireccion_detalle(String direccion_detalle) {
        this.direccion_detalle = direccion_detalle;
    }

    
    
    public Integer getId_motivo_queja() {
        return id_motivo_queja;
    }

    public void setId_motivo_queja(Integer id_motivo_queja) {
        this.id_motivo_queja = id_motivo_queja;
    }

    public Integer getId_pais() {
        return id_pais;
    }

    public void setId_pais(Integer id_pais) {
        this.id_pais = id_pais;
    }

   
    public Integer getId_etnia() {
        return id_etnia;
    }

    public void setId_etnia(Integer id_etnia) {
        this.id_etnia = id_etnia;
    }

    public TipoMotivoQueja getTipoMotivoQueja() {
        return tipoMotivoQueja;
    }

    public void setTipoMotivoQueja(TipoMotivoQueja tipoMotivoQueja) {
        this.tipoMotivoQueja = tipoMotivoQueja;
    }

    public Integer getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(Integer tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public TipoPais getTipoPais() {
        return tipoPais;
    }

    public void setTipoPais(TipoPais tipoPais) {
        this.tipoPais = tipoPais;
    }

    public TipoSede getTipoSede() {
        return tipoSede;
    }

    public void setTipoSede(TipoSede tipoSede) {
        this.tipoSede = tipoSede;
    }
    
    
    
    public Integer getId_consumidor() {
        return id_consumidor;
    }

    public void setId_consumidor(Integer id_consumidor) {
        this.id_consumidor = id_consumidor;
    }

    public Integer getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Integer nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getTipo_consumidor() {
        return tipo_consumidor;
    }

    public void setTipo_consumidor(Integer tipo_consumidor) {
        this.tipo_consumidor = tipo_consumidor;
    }

    public String getNit_consumidor() {
        return nit_consumidor;
    }

    public void setNit_consumidor(String nit_consumidor) {
        this.nit_consumidor = nit_consumidor;
    }

    public String getDocumento_identificacion() {
        return documento_identificacion;
    }

    public void setDocumento_identificacion(String documento_identificacion) {
        this.documento_identificacion = documento_identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion_calle() {
        return direccion_calle;
    }

    public void setDireccion_calle(String direccion_calle) {
        this.direccion_calle = direccion_calle;
    }

    public String getDireccion_avenida() {
        return direccion_avenida;
    }

    public void setDireccion_avenida(String direccion_avenida) {
        this.direccion_avenida = direccion_avenida;
    }

    public String getDireccion_zona() {
        return direccion_zona;
    }

    public void setDireccion_zona(String direccion_zona) {
        this.direccion_zona = direccion_zona;
    }

    public Integer getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(Integer codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }

    public Integer getCodigo_departamento() {
        return codigo_departamento;
    }

    public void setCodigo_departamento(Integer codigo_departamento) {
        this.codigo_departamento = codigo_departamento;
    }

    public Integer getSede_diaco_cercana() {
        return sede_diaco_cercana;
    }

    public void setSede_diaco_cercana(Integer sede_diaco_cercana) {
        this.sede_diaco_cercana = sede_diaco_cercana;
    }

    public String getHabilitado_notificacion_electronica() {
        return habilitado_notificacion_electronica;
    }

    public void setHabilitado_notificacion_electronica(String habilitado_notificacion_electronica) {
        this.habilitado_notificacion_electronica = habilitado_notificacion_electronica;
    }

    public Date getFecha_adicion() {
        return fecha_adicion;
    }

    public void setFecha_adicion(Date fecha_adicion) {
        this.fecha_adicion = fecha_adicion;
    }

    public String getUsuario_adiciono() {
        return usuario_adiciono;
    }

    public void setUsuario_adiciono(String usuario_adiciono) {
        this.usuario_adiciono = usuario_adiciono;
    }

    public String getUsuario_modifico() {
        return usuario_modifico;
    }

    public void setUsuario_modifico(String usuario_modifico) {
        this.usuario_modifico = usuario_modifico;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getApellido_casada() {
        return apellido_casada;
    }

    public void setApellido_casada(String apellido_casada) {
        this.apellido_casada = apellido_casada;
    }

    public String getNombreCompleto(){
       String nombrecompleto;
        if(getTipo_consumidor() == 7) 
        { 
          nombrecompleto=  this. getNombreCompletoJuridico();
        }
        else
        {
             nombrecompleto=this.nombre1+' '+this.nombre2+' '+this.nombre3+' '+this.apellido1+' '+this.apellido2+' '+(this.apellido_casada!=null?"De "+this.apellido_casada:""); 
        }
        return nombrecompleto.replaceAll("null", "").replaceAll("\\s+", " ").trim();
    }
    
    public String getNombreCompletoJuridico(){
      //  String nombrecompleto=this.nombre1+' '+this.nombre2+' '+this.nombre3+' '+this.apellido1+' '+this.apellido2+' '+(this.apellido_casada!=null?"De "+this.apellido_casada:"")+" PROPIETARIO DE "+this.getNombre_empresa();
        String nombrecompleto=this.getNombre_empresa();
        return nombrecompleto.replaceAll("null", "").replaceAll("\\s+", " ").trim();
    }

    public TipoDepartamento getTipoDepartamento() {
        return tipoDepartamento;
    }

    public void setTipoDepartamento(TipoDepartamento tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

    public TipoMunicipio getTipoMunicipio() {
        return tipoMunicipio;
    }

    public void setTipoMunicipio(TipoMunicipio tipoMunicipio) {
        this.tipoMunicipio = tipoMunicipio;
    }
    
    
    
        @Override
        public String toString() {
            JsonObject temp = new JsonObject();
            temp.addProperty("id_consumidor",this.id_consumidor);
            String nombrecompleto=this.nombre1+' '+this.nombre2+' '+this.nombre3+' '+this.apellido1+' '+this.apellido2+' '+this.apellido_casada;
           temp.addProperty("nombre1",this.nombre1);
           temp.addProperty("nombre2",this.nombre2);
           temp.addProperty("nombre3",this.nombre3);
           temp.addProperty("apellido1",this.apellido1);
           temp.addProperty("apellido2",this.apellido2);
           temp.addProperty("apellido_casada",this.apellido_casada);
            temp.addProperty("nombre_consumidor",nombrecompleto.replaceAll("null", "").replaceAll("\\s+", " ").trim());
            temp.addProperty("nit",this.nit_consumidor);
             temp.addProperty("nit_consumidor",this.nit_consumidor);
            temp.addProperty("doc_identificacion",this.documento_identificacion);
            temp.addProperty("documento_identificacion",this.documento_identificacion);
            temp.addProperty("direccion_avenida", this.direccion_avenida);
            temp.addProperty("direccion_calle",this.direccion_calle);
            temp.addProperty("direccion_zona",this.direccion_zona);
            temp.addProperty("genero",this.genero);
            temp.addProperty("habilitado_notificacion_electronica",this.habilitado_notificacion_electronica);
            
            temp.addProperty("codigo_municipio",this.codigo_municipio);
            temp.addProperty("codigo_departamento",this.codigo_departamento);
            temp.addProperty("sede_diaco_cercana",this.sede_diaco_cercana);
            temp.addProperty("nacionalidad", this.nacionalidad);
            temp.addProperty("id_motivo_queja",this.id_motivo_queja);
            temp.addProperty("autorizoPublicar",this.autorizoPublicar);
            temp.addProperty("tipo_consumidor",this.tipo_consumidor);
            temp.addProperty("id_etnia",this.id_etnia);
            temp.addProperty("id_pais",this.id_pais);
             temp.addProperty("tipo_documento",this.tipo_documento);
            return temp.toString()+",";
        }
        
        public JsonObject toJsonelement() {
            JsonObject temp = new JsonObject();
            temp.addProperty("id_consumidor",this.id_consumidor);
            String nombrecompleto=this.nombre1+' '+this.nombre2+' '+this.nombre3+' '+this.apellido1+' '+this.apellido2+' '+this.apellido_casada;
            temp.addProperty("nombre_consumidor",nombrecompleto.replaceAll("null", "").replaceAll("\\s+", " ").trim());
            return temp;
        }
}
