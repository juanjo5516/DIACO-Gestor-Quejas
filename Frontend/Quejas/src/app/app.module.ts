import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { MainAtencionConsumidorComponent } from './main-atencion-consumidor/main-atencion-consumidor.component';
import { AppRoutingModule } from './/app-routing.module';
import { TablaMainAtConComponent } from './tabla-main-at-con/tabla-main-at-con.component';
import { VerifConcicliacionVirtComponent } from './verif-concicliacion-virt/verif-concicliacion-virt.component';
import { HttpClientModule }    from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { ComunicacionPermanenteComponent } from './comunicacion-permanente/comunicacion-permanente.component';
import { MatDialogModule, MatTreeModule, MatIconModule} from "@angular/material";
import {MatExpansionModule} from '@angular/material/expansion';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { BitacoraACComponent } from './bitacora-ac/bitacora-ac.component';
import { DepartamentotestComponent } from './departamentotest/departamentotest.component';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { DatePipe } from '@angular/common';
import { DataTablesModule } from 'angular-datatables';
import { NgxDatatableModule } from '@swimlane/ngx-datatable';
import { PrimeraAudienciaComponent } from './primera-audiencia/primera-audiencia.component';
import {MatDividerModule} from '@angular/material/divider';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import { SegundaAudienciaComponent } from './segunda-audiencia/segunda-audiencia.component';
import { ConciliacionComponent } from './conciliacion/conciliacion.component';
import { IncomparecenciaComponent } from './incomparecencia/incomparecencia.component';
import { VisitaCampoComponent } from './visita-campo/visita-campo.component';
import { ArchivarQuejaComponent } from './archivar-queja/archivar-queja.component';
import { MovimientoExpedienteComponent } from './movimiento-expediente/movimiento-expediente.component';
import { FileReadUploadComponent } from './file-read-upload/file-read-upload.component';
import { MuestraRegistroComponent } from './muestra-registro/muestra-registro.component';
import { GuiaRegistrosComponent } from './guia-registros/guia-registros.component';
import { ResumenQuejasComponent } from './resumen-quejas/resumen-quejas.component';
import { VerifDatosComponent } from './verif-datos/verif-datos.component';
import { QuejaFinalizadaComponent } from './queja-finalizada/queja-finalizada.component';
import { ConfirmarAccionComponent } from './confirmar-accion/confirmar-accion.component';
import { BusquedaComponent } from './busqueda/busqueda.component';
import { LoginComponent } from './login/login.component';
import { MovimientoConfirmarComponent } from './movimiento-confirmar/movimiento-confirmar.component';
import { MainServiciosPublicosComponent } from './main-servicios-publicos/main-servicios-publicos.component';
import { TablaMainServPubComponent } from './tabla-main-serv-pub/tabla-main-serv-pub.component';
import { SubirArchivosComponent } from './subir-archivos/subir-archivos.component';
import { MovimientoServPubComponent } from './movimiento-serv-pub/movimiento-serv-pub.component';
import { MainVerificacionVigilanciaComponent } from './main-verificacion-vigilancia/main-verificacion-vigilancia.component';
import { TablaMainVerificacionComponent } from './tabla-main-verificacion/tabla-main-verificacion.component';
import { ArchivarServPubComponent } from './archivar-serv-pub/archivar-serv-pub.component';
import { ActaVerificacionComponent } from './acta-verificacion/acta-verificacion.component';
import { InformeFinalVerificacionComponent } from './informe-final-verificacion/informe-final-verificacion.component';
import { ArchivarVerificacionComponent } from './archivar-verificacion/archivar-verificacion.component';
import { MovimientoVerificacionComponent } from './movimiento-verificacion/movimiento-verificacion.component';
import { MovimientoConfVerificacionComponent } from './movimiento-conf-verificacion/movimiento-conf-verificacion.component';
import { TablaMainJuridicoComponent } from './tabla-main-juridico/tabla-main-juridico.component';
import { MainJuridicoComponent } from './main-juridico/main-juridico.component';
import { DocumentarComponent } from './documentar/documentar.component';
import { ConciliacionJuridicoComponent } from './conciliacion-juridico/conciliacion-juridico.component';
import { MovimientoConfJuridicoComponent } from './movimiento-conf-juridico/movimiento-conf-juridico.component';
import { MovimientoJuridicoComponent } from './movimiento-juridico/movimiento-juridico.component';
import { ArchivarJuridicoComponent } from './archivar-juridico/archivar-juridico.component';
import { ReasignarReactivarComponent } from './reasignar-reactivar/reasignar-reactivar.component';
import { ParamGeneralesComponent } from './param-generales/param-generales.component';
import { ConfUsuarioComponent } from './conf-usuario/conf-usuario.component';
import { UsuarioDetalleComponent } from './usuario-detalle/usuario-detalle.component';
import { ConfiguracionSistemaComponent } from './configuracion-sistema/configuracion-sistema.component';
import { ConfUsuarioConcPreviaComponent } from './conf-usuario-conc-previa/conf-usuario-conc-previa.component';
import { UsuarioDetalleConcPreviaComponent } from './usuario-detalle-conc-previa/usuario-detalle-conc-previa.component';
import { CatDepartamentoComponent } from './cat-departamento/cat-departamento.component';
import { CatPaisesComponent } from './cat-paises/cat-paises.component';
import { CatDepartamentoInternoComponent } from './cat-departamento-interno/cat-departamento-interno.component';
import { CatMotivoQuejaComponent } from './cat-motivo-queja/cat-motivo-queja.component';
import { CatMunicipioComponent } from './cat-municipio/cat-municipio.component';
import { CatSedesComponent } from './cat-sedes/cat-sedes.component';
import { CatDiaInhabilComponent } from './cat-dia-inhabil/cat-dia-inhabil.component';
import { CatProveedorComponent } from './cat-proveedor/cat-proveedor.component';
import { AsignarColaComponent } from './asignar-cola/asignar-cola.component';
import { AprobarConcPreviaComponent } from './aprobar-conc-previa/aprobar-conc-previa.component';
import { JuridicoResultadoAudienciaComponent } from './juridico-resultado-audiencia/juridico-resultado-audiencia.component';
import { JuridicoResolucionFinalComponent } from './juridico-resolucion-final/juridico-resolucion-final.component';
import { CambiarPasswordComponent } from './cambiar-password/cambiar-password.component';
import { VyvAsignaColaComponent } from './vyv-asigna-cola/vyv-asigna-cola.component';
import { CatPuestoComponent } from './cat-puesto/cat-puesto.component';
import { CatTipoColaComponent } from './cat-tipo-cola/cat-tipo-cola.component';
import { CatConsumidorComponent } from './cat-consumidor/cat-consumidor.component';
import { CatTipoConsumidorComponent } from './cat-tipo-consumidor/cat-tipo-consumidor.component';
import { CatAreaComponent } from './cat-area/cat-area.component';
import { CatFinalizacionComponent } from './cat-finalizacion/cat-finalizacion.component';
import { CatActividadEconomicaComponent } from './cat-actividad-economica/cat-actividad-economica.component';
import { CatTipoComercioComponent } from './cat-tipo-comercio/cat-tipo-comercio.component';

import { NoDblClickDirective } from './no-dbl-click.directive';
import { CatSucursalComponent } from './cat-sucursal/cat-sucursal.component';
import {FullCalendarModule} from 'primeng/fullcalendar';

@NgModule({
  declarations: [
    AppComponent,
    MainAtencionConsumidorComponent,
    TablaMainAtConComponent,
    VerifConcicliacionVirtComponent,
    ComunicacionPermanenteComponent,
    BitacoraACComponent,
    DepartamentotestComponent,
    PrimeraAudienciaComponent,
    SegundaAudienciaComponent,
    ConciliacionComponent,
    IncomparecenciaComponent,
    VisitaCampoComponent,
    ArchivarQuejaComponent,
    MovimientoExpedienteComponent,
	FileReadUploadComponent,
	MuestraRegistroComponent,
	GuiaRegistrosComponent,
	ResumenQuejasComponent,
	VerifDatosComponent,
	QuejaFinalizadaComponent,
	ConfirmarAccionComponent,
	BusquedaComponent,
	LoginComponent,
	MovimientoConfirmarComponent,
	MainServiciosPublicosComponent,
	TablaMainServPubComponent,
	SubirArchivosComponent,
	MovimientoServPubComponent,
	MainVerificacionVigilanciaComponent,
	TablaMainVerificacionComponent,
	ArchivarServPubComponent,
	ActaVerificacionComponent,
	InformeFinalVerificacionComponent,
	ArchivarVerificacionComponent,
	MovimientoVerificacionComponent,
	MovimientoConfVerificacionComponent,
	TablaMainJuridicoComponent,
	MainJuridicoComponent,
	DocumentarComponent,
	ConciliacionJuridicoComponent,
	MovimientoConfJuridicoComponent,
	MovimientoJuridicoComponent,
	ArchivarJuridicoComponent,
	ReasignarReactivarComponent,
	ParamGeneralesComponent,
	ConfUsuarioComponent,
	UsuarioDetalleComponent,
	ConfiguracionSistemaComponent,
	ConfUsuarioConcPreviaComponent,
	UsuarioDetalleConcPreviaComponent,
	AsignarColaComponent,
	AprobarConcPreviaComponent,
		CatDepartamentoComponent,
	CatPaisesComponent,
	CatDepartamentoInternoComponent,
	CatMotivoQuejaComponent,
	CatMunicipioComponent,
	CatSedesComponent,
	CatDiaInhabilComponent,
	CatProveedorComponent,
	JuridicoResultadoAudienciaComponent,
	JuridicoResolucionFinalComponent,
	CambiarPasswordComponent,
	VyvAsignaColaComponent,
	NoDblClickDirective,
	CatPuestoComponent,
		CatTipoColaComponent,
		CatConsumidorComponent,
		CatTipoConsumidorComponent,
		CatAreaComponent,
		CatFinalizacionComponent,
		CatActividadEconomicaComponent,
		CatTipoComercioComponent,
		CatSucursalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	FormsModule,
	ReactiveFormsModule,
	HttpClientModule,
	HttpModule,
	MatDialogModule,
	MatExpansionModule,
	BrowserAnimationsModule,
	DataTablesModule,
	NgxDatatableModule,
	MatDividerModule,
	MatProgressBarModule,
	MatTreeModule,
	MatIconModule,
	FullCalendarModule //<-- calendario modulo
  ],
providers: [{provide: LocationStrategy, useClass: HashLocationStrategy}, DatePipe],
  bootstrap: [AppComponent],
  entryComponents: [ComunicacionPermanenteComponent, VerifConcicliacionVirtComponent, BitacoraACComponent, PrimeraAudienciaComponent, SegundaAudienciaComponent, ConciliacionComponent, IncomparecenciaComponent, VisitaCampoComponent, ArchivarQuejaComponent, MovimientoExpedienteComponent, GuiaRegistrosComponent, ResumenQuejasComponent, VerifDatosComponent, ConfirmarAccionComponent, BusquedaComponent, MovimientoConfirmarComponent, SubirArchivosComponent, MovimientoServPubComponent, ArchivarServPubComponent, ActaVerificacionComponent, InformeFinalVerificacionComponent, ArchivarVerificacionComponent, MovimientoVerificacionComponent, MovimientoConfVerificacionComponent, DocumentarComponent, ConciliacionJuridicoComponent, MovimientoConfJuridicoComponent, MovimientoJuridicoComponent, ArchivarJuridicoComponent, ReasignarReactivarComponent, ParamGeneralesComponent, ConfUsuarioComponent, UsuarioDetalleComponent, ConfiguracionSistemaComponent, ConfUsuarioConcPreviaComponent, UsuarioDetalleConcPreviaComponent, AsignarColaComponent, AprobarConcPreviaComponent,CatDepartamentoComponent,CatPaisesComponent,CatDepartamentoInternoComponent,CatMotivoQuejaComponent,CatMunicipioComponent,CatSedesComponent,CatDiaInhabilComponent,CatProveedorComponent,JuridicoResultadoAudienciaComponent, JuridicoResolucionFinalComponent,CambiarPasswordComponent, VyvAsignaColaComponent,CatPuestoComponent,CatTipoColaComponent,CatConsumidorComponent,CatTipoConsumidorComponent,CatAreaComponent,CatFinalizacionComponent ,CatActividadEconomicaComponent,CatTipoComercioComponent,CatSucursalComponent ]
})
export class AppModule { }
