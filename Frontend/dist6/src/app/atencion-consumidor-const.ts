
export const BASE_SERVER   = 'http://gestorquejas.diaco.gob.gt/';
//export const BASE_SERVER   = 'http://localhost:8080/';
//export const BASE_SERVER   = 'https://dev.mineco.gob.gt/';

 /*
 * Dev
 */
//export const BASE_SERVER   = 'http://desagestorquejas.diaco.gob.gt/';
export const BASE_URL_REST= BASE_SERVER + 'Quejas/rs/';
/*--------------------------------------------------------- */
 
/*
 * produccion
 */
// export const BASE_SERVER   = 'http://gestorquejas.diaco.gob.gt/';
// export const BASE_URL_REST= BASE_SERVER + 'diaco-int-web/rs/';
/*--------------------------------------------------------- */


//export const BASE_URL_REST= BASE_SERVER + 'diaco-int-web/rs/';
export const BASE_VERIFICACION_DATOS_LINK=BASE_URL_REST	
export const BASE_URL_REST_FILE=BASE_URL_REST;



export class List_Images {
  id_imagen_queja: number;
  id_tipo_imagen: number;
  imagen: string;
  id_queja: number;
}

export class BaseCmbClass {
  id: number;
  nombre: string;
}

export const LSTFILTRO_RESOLUCION: BaseCmbClass[] = [
	{ id: 1, nombre: 'No Aplica' },
	{ id: 2, nombre: 'Resuelto' },
	{ id: 3, nombre: 'Sin Resolución' }
];

export const LSTFILTRO_ATENCIONCONSUMIDOR: BaseCmbClass[] = [
	{ id: 999, nombre: 'Activos' },
	{ id: 101, nombre: 'Revisión de conciliación virtual' },
	{ id: 102, nombre: 'Pendiente verificación de datos' },
	{ id: 103, nombre: 'Pendiente de comunicación permanente' },
	{ id: 104, nombre: 'Pendiente audiencia de conciliación' },
	{ id: 105, nombre: 'Pendiente audiencia de ofrecimientos de medio de prueba' },
	{ id: 106, nombre: 'Audiencia completada' },
	{ id: 501, nombre: 'Archivado' },
	{ id: 201, nombre: 'Enviados a juridico' },
	{ id: 301, nombre: 'Enviados a verificacion y vigilancia' },
	{ id: 997, nombre: 'Pendiente de Confirmación' },
	{ id: 401, nombre: 'Con el Proveedor' },
	{ id: 402, nombre: 'Resuelto por el Proveedor' },
	{ id: 998, nombre: 'Todos (activos e inactivos)' }
  ];

export const LSTFILTRO_SERVICIOSPUBLICOS: BaseCmbClass[] = [
	{ id: 999, nombre: 'Activos' },
	{ id: 501, nombre: 'Archivado' },
	{ id: 996, nombre: 'En Atención al Consumidor'},
	{ id: 201, nombre: 'Enviados a juridico' },
	{ id: 301, nombre: 'Enviados a verificacion y vigilancia' },
	{ id: 997, nombre: 'Pendiente de Confirmación' },
	{ id: 401, nombre: 'Con el Proveedor' },
	{ id: 402, nombre: 'Resuelto por el Proveedor' },
	{ id: 998, nombre: 'Todos (activos e inactivos)' }
  ];

export const LSTFILTRO_VERIFICACIONVIGILANCIA: BaseCmbClass[] = [
	{ id: 999, nombre: 'Activos' },
	{ id: 301, nombre: 'Pendiente Comunicación Permanente' },
	{ id: 302, nombre: 'Pendiente Informe Final'},
	{ id: 303, nombre: 'Informe Final Completado' },
	{ id: 201, nombre: 'Enviados a Juridico' },
	{ id: 501, nombre: 'Enviados a Archivo' },
	{ id: 997, nombre: 'Pendiente de Confirmación' },
	{ id: 996, nombre: 'Enviado a Atención al Consumidor' },
	{ id: 998, nombre: 'Todos (activos e inactivos)' }
  ];

export const LSTCMB_FINALIZACION: BaseCmbClass[] = [
	{ id: 1, nombre: 'Improcedencia' },
	{ id: 2, nombre: 'Falta de Documentación' }
  ];

export const LSTCMB_PRIMERAAUDIENCIA: BaseCmbClass[] = [
	{ id: 1, nombre: 'Conciliación' },
	{ id: 2, nombre: 'Sin Acuerdo' },
	{ id: 3, nombre: 'Incomparecencia' },
	{ id: 4, nombre: 'Prórroga de Audiencia' }
  ];

export const LSTCMB_SEGUNDAAUDIENCIA: BaseCmbClass[] = [
	{ id: 1, nombre: 'Conciliación' },
	{ id: 2, nombre: 'Rebeldía' },
	{ id: 3, nombre: 'Apertura de Prueba' }
  ];

export const LSTCMB_SEDES: BaseCmbClass[] = [
	{ id: 1, nombre: 'Sede Guatemala Zona 9' },
	{ id: 2, nombre: 'Sede Guatemala Zona X' },
	{ id: 3, nombre: 'Sede Escuintla' }
  ];
  
  export const LSTCMB_AREAS: BaseCmbClass[] = [
	{ id: 1, nombre: 'Servicios al Consumidor' },
	{ id: 2, nombre: 'Jurídico' },
	{ id: 3, nombre: 'Verificación y Vigilancia' }
  ];
  
  export const LSTCMB_CONCILIADORES: BaseCmbClass[] = [
	{ id: 1, nombre: 'Conciliador A' },
	{ id: 2, nombre: 'Conciliador B' },
	{ id: 3, nombre: 'Conciliador C' }
  ];
  
  export const LSTCMB_VISITAPOR: BaseCmbClass[] = [
	{ id: 1, nombre: 'Empleado A' },
	{ id: 2, nombre: 'Empleado B' },
	{ id: 3, nombre: 'Empleado C' }
  ];

  export const LSTCMB_MOTIVOPOA: BaseCmbClass[] = [
	{ id: 1, nombre: 'Motivo A' },
	{ id: 2, nombre: 'Motivo B' },
	{ id: 3, nombre: 'Motivo C' }
  ];
  
  export const LSTCMB_RAZONFIN: BaseCmbClass[] = [
	{ id: 1, nombre: 'Razon A' },
	{ id: 2, nombre: 'Razon B' },
	{ id: 3, nombre: 'Razon C' }
  ];
  
  export const LSTCMB_CATEGORIAFIN: BaseCmbClass[] = [
	{ id: 1, nombre: 'Categoria A' },
	{ id: 2, nombre: 'Categoria B' },
	{ id: 3, nombre: 'Categoria C' }
  ];  
  
  export class FrmMainParam {
    selectedFiltro:number;
	SelectedFDesde:Date;
	SelectedFHasta:Date;
	SelectedNo:string;
	selectedNoqueja:string;
  }  
  
export class FrmRazonFin {
    id_motivo_queja_finalizada:number;
	detalles:string;
  }   
  
  export class FrmMainFD {
	id_queja: number;
	fecha_queja: Date;
	nombre_consumidor: string;
	nombre_proveedor: string;
	id_estado_queja: number;
}

export class FrmBitacora {
	id: number;
	correlativo: number;
	No: number;
	Fecha: Date;
	Bitacora: string;
	Consumidor: string;
}

export class CmbResultadoAudiencia {
	id_resultado_audiencia: number;
	descripcion: string;
}

export class FrmDetalle_Queja {
  id_queja: number;
  id_flujo: number;
  motivo: string;
  detalle_queja: string;
  fecha_queja: Date;
  solicita_que: string;
  id_consumidor: string;
  id_proveedor: string;
  nombre_consumidor: string;
  tipotelefono:FrmDetalle_Telefono[];
  tipoemail:FrmDetalle_Email[];
  id_diaco_sede:number;
  quejanumero: string;
  nombre_flujo: string;
  nombre_sede: string;
  nombre_departamento: string;
  nombre_municipio: string;
}

export class FrmSede{
	id_diaco_sede: number;
	nombre_sede: string;
	direccion_sede: string;
	id_sede: number;
	nombre: string;
}

export class FrmDetalle_Telefono {
  id_telefono: number;
  telefono: string;
  tipo_telefono: number;
}

export class FrmDetalle_Email {
  id_email: number;
  correo_electronico: string;
}

export class CmbCatalogo {
  id_catalogo: number;
  descripcion_catalogo: string;
}

export class CmbDptoInterno {
  id_departamento_interno: number;
  nombre: string;
}

export class LstQuejaSimple {
  id_queja: number;
  quejanumero: number;
  id_estado_queja: number;
}

export class CmbMotivoFinalizado {
  id_motivo_queja_finalizada: number;
  descripcion: string;
}

export class FrmConcVirt {
  id_verif_conciliacion_previa: number;
  id_queja: number;
  queja_resuelta: string;
  razon_prop_provee_rechazada: string;
  id_tipo_registro: number;
  notas: string;
  resolucion: number;
  resolucion_str: string;
  quejanumero: string;
  respuesta_con: string;
}

export class FormResponse {
	NoQueja: number;
	changes: boolean;
	quejanumero: string;
	pagina: number;
}

export class FrmRegComCon {
  id: number;
}

export class Frm4Registros {
  id_audiencia: number;
  cedula_citacion_con_id: number;
  cedula_citacion_pro_id: number;
  cedula_notificacion_con_id: number;
  cedula_notificacion_pro_id: number;
  cedula_citacion_con_codigo: string;
  cedula_citacion_pro_codigo: string;
  cedula_notificacion_con_codigo: string;
  cedula_notificacion_pro_codigo: string;
}

export class FrmAudiencia {
  id_audiencia: number;
  fecha_finalizada: Date;
  es_primera_seg_audiencia: string;
  fecha_firma_direccion: Date;
  aprobado_jefe_juridico: string;
  ced_cita_consumidor: number;
  ced_cita_proveedor: number;
  ced_notif_consumidor: number;
  ced_notif_proveedor: number;
  id_queja: number;
  ProgramaAudiencia:FrmProgramaAudiencia[];
}

export class FrmProgramaAudiencia {
  id_progra_aud: number;
  fecha_programada: Date;
  activo: boolean;
  id_resultado_audiencia: string;
  conclusion: string;
  comentario: string;
}

export class FrmVisitaCampo {
	id_visita_campo: number;
	correlativo: number;
	fecha_visita: Date;
	observaciones: string;
	hecha_por: string;
}

export class FrmMovimExp {
	id_cambio_exp: number;
	dpto_interno_desde: string;
	dpto_interno_hasta: string;
	sede_desde: string;
	sede_hasta: string;
	nombre_proveedor: string;
	display: string;
	fecha:Date;
}

export class FrmBusqueda_Con {
	id_consumidor: number;
	nombre_consumidor: string;
	nit: string;
	doc_identificacion: string;
}

export class FrmMoviExpReg
{
  id: number;
  id_queja: number;
  id_registro: number;
  id_tipo_registro: number;
  id_cambio_exp: number;
  no:  number;
}

export class FrmResArchivoConciliacion
{
  id: number;
  idCorrelativo: number;
  idQueja: number;
 }
