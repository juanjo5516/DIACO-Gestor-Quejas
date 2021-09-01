package gt.gob.mineco.diaco.model;

import com.google.gson.JsonObject;
import gt.gob.mineco.diaco.util.CheckNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.persistence.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * The persistent class for the diaco.dbo.diaco_res_final database table.
 * 
 */
@Entity
@Table(name="diaco_res_final")
@NamedQuery( name = "TipoResFinal.findAll", query = "SELECT t FROM TipoResFinal t inner join t.tipopasoqueja og where og.id_queja = :id_queja")
public class TipoResFinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", precision=0) 
        private Integer id;
        @Column(name="tipo")
        private Integer tipo;
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name="fecha_actualizado")        
        private Date fecha_actualizado;
        @Column(name="usuario_actualizado")
        private Integer usuario_actualizado;
	@Column(name="id_tipo_registro")
        private Integer id_tipo_registro;
        @Column(name="correlativo")
        private Integer correlativo;
        @Column(name="corr_notif_cons")
        private Integer corr_notif_cons;
        @Column(name="corr_notif_prov")
        private Integer corr_notif_prov;
        @Column(name="id_notif_cons")
        private Integer id_notif_cons;
        @Column(name="id_notif_prov")
        private Integer id_notif_prov;
        @Column(name="id_imagen_acta")
        private Integer id_imagen_acta;
        @JoinColumn(name = "id_queja_paso", referencedColumnName = "id_queja_paso")
        @OneToOne
        private TipoPasoQueja tipopasoqueja;
        
        @Column(name="motivo_archivo")
        private Integer motivo_archivo;
        @Column(name="monto")
        private Integer monto;
        @Column(name="monto_recuperado")
        private float monto_recuperado;
        
        public TipoResFinal() {
	}

    public Integer getCorr_notif_cons() {
        return corr_notif_cons;
    }

    public void setCorr_notif_cons(Integer corr_notif_cons) {
        this.corr_notif_cons = corr_notif_cons;
    }

    public Integer getCorr_notif_prov() {
        return corr_notif_prov;
    }

    public void setCorr_notif_prov(Integer corr_notif_prov) {
        this.corr_notif_prov = corr_notif_prov;
    }

    public Integer getId_imagen_acta() {
        return id_imagen_acta;
    }

    public void setId_imagen_acta(Integer id_imagen_acta) {
        this.id_imagen_acta = id_imagen_acta;
    }

    public Integer getId_notif_cons() {
        return id_notif_cons;
    }

    public void setId_notif_cons(Integer id_notif_cons) {
        this.id_notif_cons = id_notif_cons;
    }

    public Integer getId_notif_prov() {
        return id_notif_prov;
    }

    public void setId_notif_prov(Integer id_notif_prov) {
        this.id_notif_prov = id_notif_prov;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_actualizado() {
        return fecha_actualizado;
    }

    public void setFecha_actualizado(Date fecha_actualizado) {
        this.fecha_actualizado = fecha_actualizado;
    }

    public Integer getUsuario_actualizado() {
        return usuario_actualizado;
    }

    public void setUsuario_actualizado(Integer usuario_actualizado) {
        this.usuario_actualizado = usuario_actualizado;
    }

    public Integer getId_tipo_registro() {
        return id_tipo_registro;
    }

    public void setId_tipo_registro(Integer id_tipo_registro) {
        this.id_tipo_registro = id_tipo_registro;
    }

    public TipoPasoQueja getTipopasoqueja() {
        return tipopasoqueja;
    }

    public void setTipopasoqueja(TipoPasoQueja tipopasoqueja) {
        this.tipopasoqueja = tipopasoqueja;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

        
        
        @Override
        public String toString() {
            JsonObject temp = new JsonObject();
            CheckNull checknull = new CheckNull();
            temp.addProperty("id",this.id);
            temp.addProperty("tipo",checknull.cknull(this.tipo));
            temp.addProperty("correlativo",checknull.cknull(this.correlativo)+"-"+convertToLocalDateViaInstant(fecha_actualizado).getYear());
            temp.addProperty("corr_notif_cons",checknull.cknull(this.corr_notif_cons));
            temp.addProperty("corr_notif_prov",checknull.cknull(this.corr_notif_prov));
            temp.addProperty("id_notif_cons",checknull.cknull(this.id_notif_cons));
            temp.addProperty("id_notif_prov",checknull.cknull(this.id_notif_prov));
            temp.addProperty("id_imagen_acta",checknull.cknull(this.id_imagen_acta));
            return temp.toString()+",";
        }
        
         
 private LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    /**
     * @return the motivo_archivo
     */
    public Integer getMotivo_archivo() {
        return motivo_archivo;
    }

    /**
     * @param motivo_archivo the motivo_archivo to set
     */
    public void setMotivo_archivo(Integer motivo_archivo) {
        this.motivo_archivo = motivo_archivo;
    }

    /**
     * @return the monto
     */
    public Integer getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    /**
     * @return the monto_recuperado
     */
    public float getMonto_recuperado() {
        return monto_recuperado;
    }

    /**
     * @param monto_recuperado the monto_recuperado to set
     */
    public void setMonto_recuperado(float monto_recuperado) {
        this.monto_recuperado = monto_recuperado;
    }
        
}
