package gt.gob.mineco.diaco.rs;

import gt.gob.mineco.diaco.service.TipoAreaComunService;
import gt.gob.mineco.diaco.util.FormConfColas;
import gt.gob.mineco.diaco.util.FormConfGeneral;
import gt.gob.mineco.diaco.util.FormConfUsuario;
import gt.gob.mineco.diaco.util.FormParamGeneral;
import gt.gob.mineco.diaco.util.FormSimple;
import gt.gob.mineco.diaco.util.ResponseRs;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tipos-configuracion")
@RequestScoped
public class TipoConfiguracionRs {

    @Inject
    private TipoAreaComunService areaComunService;

    @GET
    @Path("/paramgenerales/{token}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs getTipoComConsumidor(@PathParam("token") String token) {
        return areaComunService.getParamGenerales(token);
    }

    @POST
    @Path("/paramgenerales")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs addParamGenerales(FormParamGeneral formParamGeneral) {
        return areaComunService.saveParamGenerales(formParamGeneral);
    }

    @POST
    @Path("/confusuario")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs addConfUsuario(FormConfUsuario formConfUsuario) {
        return areaComunService.saveConfUsuario(formConfUsuario);
    }

    @POST
    @Path("/confusuariopp")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs addConfUsuarioPP(FormConfUsuario formConfUsuario) {
        return areaComunService.saveConfUsuarioPP(formConfUsuario);
    }

    @GET
    @Path("/confgeneral/{token}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs getConfiguracionGeneral(@PathParam("token") String token) {
        return areaComunService.getConfiguracionGeneral(token);
    }

    @POST
    @Path("/confgeneral")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs addConfUsuario(FormConfGeneral formConfGeneral) {
        return areaComunService.saveConfiguracionGeneral(formConfGeneral);
    }

    @GET
    @Path("/asignacola/{token}/{tipocola}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs getAsignaCola(@PathParam("token") String token, @PathParam("tipocola") Integer tipocola) {
        return areaComunService.getAllAsignaColaxTipo(token, tipocola);
    }

    @GET
    @Path("/asignacola/get/{token}/{id_flujo}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs getColasEspecialxFlujo(@PathParam("token") String token, @PathParam("id_flujo") Integer id_flujo) {
        return areaComunService.getEspecialxFlujo(token, id_flujo);
    }

    @POST
    @Path("/asignacola")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs saveAsignaCola(FormConfColas formConfColas) {
        return areaComunService.saveAsignaCola(formConfColas);
    }

    @POST
    @Path("/asignacolanew")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs saveAsignaColaNew(FormConfColas formConfColas) {
        return areaComunService.saveAsignaColaNew(formConfColas);
    }

    @POST
    @Path("/asignacola_del")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs delAsignaCola(FormConfColas formConfColas) {
        return areaComunService.delAsignaCola(formConfColas);
    }

    @POST
    @Path("/cambioPW")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs savecambioPW(FormSimple formulario) {
        return areaComunService.SetNewPassword(formulario);
    }

    //vyv asigna inicialmente cola
    @GET
    @Path("/asignavyv/{token}/{id_queja}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs getVyvAsignaInicial(@PathParam("token") String token, @PathParam("id_queja") Integer id_queja) {
        return areaComunService.GetxidquejaVyvColaInicial(id_queja, token);
    }

    @POST
    @Path("/asignavyv")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs saveVyvAsignaInicial(FormSimple formulario) {
        return areaComunService.saveVyvColaInicial(formulario);
    }

    //path qr
    @GET
    @Path("/qrpath/")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRs getVyvAsignaInicial() {
        return areaComunService.GetQRpath();
    }
}
