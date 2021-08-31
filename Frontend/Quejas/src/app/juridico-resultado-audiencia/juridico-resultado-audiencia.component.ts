import { Component, OnInit, OnDestroy } from '@angular/core';
import { BaseCmbClass, FrmDetalle_Queja, CmbResultadoAudiencia, MSG_REGISTRO_DESHABILITADO, FormResponse } from '../atencion-consumidor-const'
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { timer } from 'rxjs';
import { trigger, state, style, animate, transition } from '@angular/animations';
import { Inject } from '@angular/core';
import { AudienciaService } from '../shared/audiencia.service';
import { QuejaService } from '../shared/queja.service';
import { CatalogoService } from '../shared/catalogo.service';
import { RegistrosService } from '../shared/registros.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';
import { DatePipe } from '@angular/common';
import { SeguridadService } from "../shared/seguridad.service";

@Component({
  selector: 'app-juridico-resultado-audiencia',
  templateUrl: './juridico-resultado-audiencia.component.html',
  styleUrls: ['./juridico-resultado-audiencia.component.css'],
  animations: [
		trigger('EnterLeave', [
	  state('flyIn', style({ transform: 'translateX(0)' })),
	  transition(':enter', [
		style({ transform: 'translateX(-100%)' }),
		animate('100ms 150ms ease-in')
	  ]),
	  transition(':leave', [
		animate('300ms ease-out', style({ transform: 'translateX(-100%)' }))
	  ])
	])]
})
export class JuridicoResultadoAudienciaComponent implements OnInit {
	ProgramarForm: FormGroup;
	tipoCtrl:FormControl;
	//fechaCtrl: FormControl;
	//horaCtrl: FormControl;
	fechanotifCtrl: FormControl;
	flagInsertInfo:boolean;
	flagDeleteInfo:boolean;
	flagInfoError:boolean;
	cmb_resultado:CmbResultadoAudiencia[];
	flagRegError:boolean;
	flagEdit:boolean;
	lst_queja:FrmDetalle_Queja[];
	flagformvisible;
	flagEditable:boolean;
	loaderror:boolean;
	flagMainUpdate:boolean;
	flagTimeError:boolean;
	flagValidadorRegistros: boolean;
	flagBoton: boolean;
	flagHabilitado: boolean;
	flagFechaNotif:boolean;
	msg_deshabilitado;
	loc_pagina;
	listresaudiencia;
	currentEditid;
	linkgrid;
	editresuadiencia; lbl_tipostr;
	clickMessage = 0;

  constructor(@Inject(MAT_DIALOG_DATA) public data: any, private _audienciaService:AudienciaService, private _quejaService: QuejaService, private _catalogoService: CatalogoService, public dialogRef: MatDialogRef<JuridicoResultadoAudienciaComponent>, private _registrosservice:RegistrosService, private datePipe: DatePipe, private _seguridadService:SeguridadService) { 
		this.flagInsertInfo=false;
		this.flagDeleteInfo=false;
		this.flagInfoError=false;
		this.flagEdit=false;
		this.flagEditable=false;
		this.loaderror=false;
		this.flagformvisible=0;
		this.flagMainUpdate=false;
		this.flagTimeError=false;
		this.flagRegError=false;
		this.flagValidadorRegistros=false;
		this.flagBoton=true;
		this.msg_deshabilitado=MSG_REGISTRO_DESHABILITADO;
		this.loc_pagina=0;
		this.currentEditid=0;
		this.flagHabilitado=true;
		this.flagFechaNotif=false;
		this.lbl_tipostr='';
  }

  ngOnInit() {
	this.tipoCtrl =  new FormControl('',Validators.required);
	//this.fechaCtrl =  new FormControl('',Validators.required);
	//this.horaCtrl =  new FormControl('',Validators.required);
	this.fechanotifCtrl =  new FormControl('');
	this.ProgramarForm = new FormGroup({
		tipo: this.tipoCtrl,
		//fecha: this.fechaCtrl,
		//hora: this.horaCtrl,
		fechanotif: this.fechanotifCtrl,
	});
	this.LoadCmb();
	console.log(this.data);
	this.GetQuejaList();
	this.SetSecTimerForm();
	this.ValidadorRegistros();
  }

  ValidadorRegistros(){
		let tempstr=null;
		this._seguridadService.ValidadorRegistros(this.data.NoQueja).subscribe((Data)=>{
			if(Data['reason'] == 'OK' || Data['reason'] == 'INVALID'){
				if(Data['reason'] == 'OK'){
					this.flagValidadorRegistros=true;
				}else{
					this.flagValidadorRegistros=false;
				}
				this.flagformvisible++;
			}else{
				console.log('Rest service response ERROR.');
				this.flagInfoError=true;
				this.SetSecTimerInfoError();
			}
		},(error)=>{
			console.log(error);
			this.flagInfoError=true;
			this.SetSecTimerInfoError();
		});
	}

  LoadCmb(){
		let tempstr='';
		this._catalogoService.getData('resultado_audiencia').subscribe((Data)=>{
			if(Data['reason'] == 'OK'){
				tempstr=Data['value'];
				if(tempstr != null)	{
					this.cmb_resultado=JSON.parse('['+tempstr.slice(0, -1) +']');
					this.flagformvisible++;
					//this.MoverHaciaCtrl.setValue(this.cmb_hacia[0].id_catalogo);
				}else{
					this.cmb_resultado=[];
				}
				this.LoadAllResAudiencia();
				console.log(this.cmb_resultado);
				this.flagInfoError=false;
			}else{
				console.log('Rest service response ERROR.');
				this.flagInfoError=true;
				this.SetSecTimerInfoError();
			}
		},(error)=>{
			console.log(error);
			this.flagInfoError=true;
			this.SetSecTimerInfoError();
		});
  }

  LoadAllResAudiencia(){
		let tempstr='';
		this._audienciaService.getallResAudiencia(this.data.NoQueja).subscribe((Data)=>{
			if(Data['reason'] == 'OK'){
				tempstr=Data['value'];
				if(tempstr != null)	{
					this.listresaudiencia=JSON.parse('['+tempstr.slice(0, -1) +']');
					this.flagformvisible++;
					//this.MoverHaciaCtrl.setValue(this.cmb_hacia[0].id_catalogo);
				}else{
					this.listresaudiencia=[];
				}
				this.loadTipoStr();
				console.log(this.listresaudiencia);
				this.flagInfoError=false;
			}else{
				console.log('Rest service response ERROR.');
				this.flagInfoError=true;
				this.SetSecTimerInfoError();
			}
		},(error)=>{
			console.log(error);
			this.flagInfoError=true;
			this.SetSecTimerInfoError();
		});
  }


	GetQuejaList(){
	  let tempstr='';
	  this._quejaService.getDataQueja(this.data.NoQueja).subscribe((retvalue)=>{
			if(retvalue["reason"] == 'OK'){
				tempstr=retvalue['value'];
				if(tempstr != null)	{
					this.lst_queja=JSON.parse('['+retvalue["value"].slice(0, -1) +']');
					console.log(this.lst_queja);
					this.flagformvisible++;
					if(this._seguridadService.EditableporFlujo(2,this.lst_queja[0]['id_estado_queja']))
						//si es rol 3 administrador, puede editar
						if(this.data.Rol == 3)
							this.flagEditable=true;
						else{
							//si es otro rol, revisar si la queja esta asignada a este usuario
							if(this.lst_queja[0]['usuario_asignado'] == this.data.Usuario)
								this.flagEditable=true;
							else
								this.flagEditable=false;
						}
					else
						this.flagEditable=false;
				}else{
					console.log('Información de queja no pudo ser obtenida.');
					this.flagInfoError=true;
					this.SetSecTimerInfoError();
				}				
			}else{
				console.log('Rest service response ERROR.');
				this.flagInfoError=true;
				this.SetSecTimerInfoError();
			}		
		},(error)=>{
			console.log(error);
			this.flagInfoError=true;
			this.SetSecTimerInfoError();
		});
	}

	/*convertDate(){
		var date=this.fechaCtrl.value;
		var time=this.horaCtrl.value;
		var hour, min;
		if(time.length ==5){
			hour=time.substring(0, 2);
			min=time.substring(3, 5);
		}else{	
			hour="00";
			min="00";
		}
		var temp=this.datePipe.transform(date,"yyyy-MM-dd")+'T'+hour+":"+min+":00";
		return temp;  
	}*/

	onClickMe() {
		if(this.clickMessage == 0){
			this.clickMessage=1;
		}else{
			this.clickMessage=0;
		}
	  }

	SaveEdit(){
		if(this.flagEdit){
			this.UpdResAudiencia();
		}else{
			this.SaveResAudiencia();
		}
	}

	SaveResAudiencia(){
	  if (this.ProgramarForm.valid) {	
			this.flagBoton=false;
			//this._audienciaService.saveResAudiencia(this.tipoCtrl.value,this.fechaCtrl.value,this.horaCtrl.value,this.fechanotifCtrl.value,'',this.data.NoQueja).subscribe((retvalue)=>{
			this._audienciaService.saveResAudiencia(this.tipoCtrl.value,this.fechanotifCtrl.value,'',this.data.NoQueja).subscribe((retvalue)=>{
				if(retvalue["reason"] == 'OK'){
					console.log(retvalue);
					this.SetSecTimerUpdateList();
					this.flagInsertInfo=true;
					this.SetSecTimerInsert();
					this.flagMainUpdate=true;
					this.ProgramarForm.reset();
					this.flagFechaNotif=false;
				}else{
					console.log('Rest service response ERROR.');
					this.flagInfoError=true;
					this.SetSecTimerInfoError();
				}	
				this.flagBoton=true;
			},(error)=>{
				console.log(error);
				this.flagInfoError=true;
				this.flagBoton=true;
			});
	  }
	}
	
	UpdResAudiencia(){
	  if (this.ProgramarForm.valid) {	
			this.flagBoton=false;
			//this._audienciaService.updResAudiencia(this.tipoCtrl.value,this.fechaCtrl.value,this.horaCtrl.value,this.fechanotifCtrl.value,'',this.data.NoQueja,this.currentEditid).subscribe((retvalue)=>{
			this._audienciaService.updResAudiencia(this.tipoCtrl.value,this.fechanotifCtrl.value,'',this.data.NoQueja,this.currentEditid).subscribe((retvalue)=>{	
				if(retvalue["reason"] == 'OK'){
					console.log(retvalue);
					this.SetSecTimerUpdateList();
					this.flagInsertInfo=true;
					this.SetSecTimerInsert();
					this.flagEdit=false;
					this.currentEditid=0;
					this.ProgramarForm.reset();
					this.flagFechaNotif=false;
				}else{
					console.log('Rest service response ERROR.');
					this.flagInfoError=true;
					this.SetSecTimerInfoError();
				}	
				this.flagBoton=true;
			},(error)=>{
				console.log(error);
				this.flagInfoError=true;
				this.flagBoton=true;
			});
	  }
	}
	
	DelResAudiencia(id){
	  if (confirm('¿Está seguro que desea eliminar este elemento?')) {	
			this._audienciaService.DelResAudiencia(id,this.data.NoQueja).subscribe((retvalue)=>{
				if(retvalue["reason"] == 'OK'){
					console.log(retvalue);
					this.SetSecTimerUpdateList();
					this.flagDeleteInfo=true;
					this.SetSecTimerDelete();
					this.flagMainUpdate=true;
				}else{
					console.log('Rest service response ERROR.');
					this.flagInfoError=true;
					this.SetSecTimerInfoError();
				}	
			},(error)=>{
				console.log(error);
				this.flagInfoError=true;
			});
	  }
	}

	GetResAudiencia(id,pos){
		this.flagEdit=true;
		this.currentEditid=id; 
		this.tipoCtrl.setValue(this.listresaudiencia[pos]['tipo']);	
		this.CheckFechaNotif();
		/*this.fechaCtrl.setValue(this.TranslateDate(this.listresaudiencia[pos]['fechahora']));
		this.horaCtrl.setValue(this.TranslateTime(this.listresaudiencia[pos]['fechahora']));*/
		this.fechanotifCtrl.setValue(this.TranslateDate(this.listresaudiencia[pos]['fechanotificacion']));
		this.lbl_tipostr=this.Getresultado(this.listresaudiencia[pos]['tipo']);
	}

	CheckFechaNotif(){
		if(this.tipoCtrl.value == 24){
			this.flagFechaNotif=true;
		}else{
			this.flagFechaNotif=false;
		}
	}

	TranslateDate(date){
		if(date!=''){
			return this.datePipe.transform(date,"yyyy-MM-dd");
		}else{
			return '';
		}
	}
	TranslateTime(time){
		if(time!=''){
			return this.datePipe.transform(time,"HH:mm");
		}else{
			return '';
		}
		
	}

	SetSecTimerInsert(){
		const source = timer(5000);
		const subscribe = source.subscribe(val => this.flagInsertInfo=false);
	}
	SetSecTimerDelete(){
		const source = timer(5000);
		const subscribe = source.subscribe(val => this.flagDeleteInfo=false);
	}
	SetSecTimerInfoError(){
		const source = timer(5000);
		const subscribe = source.subscribe(val => this.flagInfoError=false);
	}
	SetSecTimerUpdateList(){
		const source = timer(1000);
		const subscribe = source.subscribe(val => this.LoadAllResAudiencia());
	}
	SetSecTimerTimeError(){
		const source = timer(3000);
		const subscribe = source.subscribe(val => this.flagTimeError=false);
	}
	SetSecTimerRegistro(){
		const source = timer(5000);
		const subscribe = source.subscribe(val => this.flagRegError=false);
	}
	SetSecTimerForm(){
		const source = timer(15000);
		const subscribe = source.subscribe(val => this.TimerForm() );
	}
	TimerForm(){
		console.log(this.flagformvisible);
		if(this.flagformvisible<4){
			this.loaderror=true;	
			this.flagformvisible=-1;
		}
	}
	
	closeDialog(){
		this.loc_pagina=0;
		this.ngOnDestroy();
	}

	ngOnDestroy() {
		let localresp: FormResponse= new FormResponse();
		localresp.NoQueja = this.data.NoQueja;
		localresp.quejanumero = this.data.quejanumero;
		localresp.pagina = this.loc_pagina;
		localresp.changes = this.flagMainUpdate;
		this.dialogRef.close(localresp);
	}	

	Getresultado(idd:number){
  	  var id=+idd;
	  if (id === null)
		  return null;
	  var found=null;
	  for (var me of this.cmb_resultado) {
		  if (me['id_catalogo'] === id) { 
				found=me['descripcion_catalogo'];
		  }
   	  }	  
	  if (found != null){
		  return found;
	  }else{
		  return null;
	  }
	}

	/*openCedulaCitaCons(){
		console.log('entro a openCedulaCitaCons con id reporte: ');
		this._registrosservice.getCedulaCitaCons(this.registros[0]['id_audiencia']).subscribe((Data)=>{
			this._registrosservice.FileDownLoadChoose(Data,1);
		//	this.flagDBError=false;
		},(error)=>{
			console.log(error);
		//	this.flagDBError=true;
			this.SetSecTimerInfoError();
		});
	}*/

	/*txtTrim(pos){
		switch(pos){
			case 1:
				let varnit=this.ccitacionCtrl.value;
				this.ccitacionCtrl.setValue(varnit.substring(0, 99));
				break;
		}
	}*/
	
	loadTipoStr(){
	  var leng=this.listresaudiencia.length-1;
	  this.linkgrid=[];
	  for (var pos=0;pos<=leng;pos++) {
		this.listresaudiencia[pos]['tipo_str']=this.Getresultado(this.listresaudiencia[pos]['tipo']);  
		this.linkgrid[pos]=[];
 	  }
		if(this.listresaudiencia.length>0){
			this.flagHabilitado=false;
		}else{
			this.flagHabilitado=true;
		}
	}
	
	reportclick(x,y){
		this.linkgrid[x][y]='1234';
	}
	
	reportclick1(pos){
		if(this.listresaudiencia[pos]['tipo']=='19') {
		this.openAperturaPrueba(this.listresaudiencia[pos]['id']);
		}
        if(this.listresaudiencia[pos]['tipo']=='24') {
			this.openDeclaracionRebeldia(this.listresaudiencia[pos]['id']);
		}
	}

	reportclick2(pos){
		this.openNotificacionJur('P','resultadoAudiencia');
	}

    reportclick3(pos){
		this.openNotificacionJur('C','resultadoAudiencia');
	}

	openAperturaPrueba(pIdResultAudiencia){
		console.log('entro a openAperturaPrueba');
		this._registrosservice.openAperturaPrueba(pIdResultAudiencia).subscribe((Data)=>{
			this._registrosservice.FileDownLoadChoose(Data,1);
		//	this.flagDBError=false;
		},(error)=>{
			console.log(error);
		//	this.flagDBError=true;
			this.SetSecTimerInfoError();
		});
	}

	openDeclaracionRebeldia(pIdResultAudiencia){
		console.log('entro a openDeclaracionRebeldia');
		this._registrosservice.openDeclaracionRebeldia(pIdResultAudiencia).subscribe((Data)=>{
			this._registrosservice.FileDownLoadChoose(Data,1);
		//	this.flagDBError=false;
		},(error)=>{
			console.log(error);
		//	this.flagDBError=true;
			this.SetSecTimerInfoError();
		});
	}

	openNotificacionJur(es_CP,esResultado){
		console.log('entro a openNotificacionConsumidor');
		this._registrosservice.openNotificacionJur(this.data.NoQueja,es_CP,esResultado).subscribe((Data)=>{
			this._registrosservice.FileDownLoadChoose(Data,1);
		//	this.flagDBError=false;
		},(error)=>{
			console.log(error);
		//	this.flagDBError=true;
			this.SetSecTimerInfoError();
		});
	}


	Nothing(){
		
	}
	
	closeMoveDialog(pagina) {
		this.loc_pagina= pagina;
		this.ngOnDestroy();
	}
	
	CancelEdit(){
		this.flagEdit=false;
		this.currentEditid=0;
		this.ProgramarForm.reset();
		this.flagFechaNotif=false;
	}
	
}