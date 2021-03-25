import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { DatePipe } from '@angular/common';
import { HttpClient, HttpHeaders, HttpErrorResponse, HttpParams } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';
import { FrmMainParam, FrmMainFD } from "../atencion-consumidor-const";
import { BASE_URL_REST, BASE_URL_REST_FILE } from '../atencion-consumidor-const'
import { SubmitFormService } from "../shared/submit-form.service";

@Injectable({
	providedIn: 'root'
})
export class RegistrosService {
	private baseUrl: string = BASE_URL_REST + 'tipos-registros';
	//private baseUrlRegistro:string=BASE_URL_REST_FILE+'registros-queja';
	private baseUrlRegistro: string = BASE_URL_REST + 'registros-queja';

	private httpOptions = {
		headers: new HttpHeaders({
			'content-type': 'application/json; charset=iso-8859-1'
		})
	};
	constructor(private _http: HttpClient, private datePipe: DatePipe, private _submitFormService: SubmitFormService) { }

	private extractData(res: Response) {
		let body = res;
		return body || {};
	}

	read_FormQueja(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/form_queja/' + idqueja + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}

	add_FormQueja(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/form_queja/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add(idqueja), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	read_ComCon(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/com_con/' + idqueja + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}

	add_ComCon(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/com_con/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add(idqueja), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	addGet_ActaConciliacion(idqueja): Observable<any> {
		console.log('entro al service de addGet_ActaConciliacion ');
		var LocalURL = this.baseUrl + '/acta_conciliacion-at/' + idqueja + '/' + this._submitFormService.Get_userid() + '/'+this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, { responseType: 'blob' });
	}

	addGet_ActaIncomparecencia(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/acta_incomparecencia-at/' + idqueja + '/' + this._submitFormService.Get_userid() + '/'+this._submitFormService.Get_token();;
		console.log(LocalURL);
		return this._http.get(LocalURL, { responseType: 'blob' });
		}


	read_FichaQueja(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/ficha_queja/' + idqueja + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}

	add_FichaQueja(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/ficha_queja/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add(idqueja), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	read_4Registros(id_audiencia): Observable<any> {
		var LocalURL = this.baseUrl + '/ced_2cit_2not/' + id_audiencia + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}

	add_4Registros(idqueja, idaudiencia): Observable<any> {
		var LocalURL = this.baseUrl + '/ced_2cit_2not/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add_2(idqueja, idaudiencia), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	read_4RegistrosJuridico(id_audiencia): Observable<any> {
		var LocalURL = this.baseUrl + '/ced_2cit_2not_juridico/' + id_audiencia + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}


	add_4RegistrosJuridico(idqueja, idaudiencia): Observable<any> {
		var LocalURL = this.baseUrl + '/ced_2cit_2not_juridico/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add_2(idqueja, idaudiencia), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	read_resvisitacampo(idqueja,idFLujo): Observable<any> {
		console.log('valor de flujo en service.ts '+ idFLujo);
		var LocalURL = this.baseUrl + '/res_visita_campo/' + idqueja + '/' + idFLujo+'/'+this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}

	add_resvisitacampo(idqueja,pIdFLujo): Observable<any> {
		var LocalURL = this.baseUrl + '/res_visita_campo/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add_visita_flujo(idqueja,pIdFLujo), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	read_ResArchivoConciliacion(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/res_archivo_conciliacion/' + idqueja + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}


	add_ResArchivoConciliacion(pIdQueja) {
		var LocalURL = this.baseUrl + '/res_archivo_conciliacion/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add(pIdQueja), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	read_ResArchUnAudConciliacion(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/res_archivo_un_aud_conc/' + idqueja + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}

	add_ResArchivoUnAudConciliacion(pIdQueja) {
		var LocalURL = this.baseUrl + '/res_archivo_un_aud_conc/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add(pIdQueja), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	getCedulaCitaCons(pIdAudiencia) {
		console.log('entro al service de getCedulaCitaCons ');
		var localURL = this.baseUrlRegistro + '/cedula-cita-cons/' + pIdAudiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}


	openCedulaCitaConJur(pIdAudiencia) {
		console.log('entro al service de openCedulaCitaConJur ');
		var localURL = this.baseUrlRegistro + '/ced_cit_con_jur/' + pIdAudiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}

	openCedulaCitaProJur(pIdAudiencia) {
		console.log('entro al service de openCedulaCitaProJur ');
		var localURL = this.baseUrlRegistro + '/ced_cit_pro_jur/' + pIdAudiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}

	openCedulaNotiProJur(pIdAudiencia) {
		console.log('entro al service de openCedulaNotiProJur ');
		var localURL = this.baseUrlRegistro + '/ced_noti_cit_pro_jur/' + pIdAudiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}

	openCedulaNotiConJur(pIdAudiencia) {
		console.log('entro al service de openCedulaNotiConJur ');
		var localURL = this.baseUrlRegistro + '/ced_noti_cit_con_jur/' + pIdAudiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}
	

	getCedulaCitaProv(pIdAudiencia) {
		console.log('entro al service de getCedulaCitaProv ');
		var localURL = this.baseUrlRegistro + '/cedula-cita-prov/' + pIdAudiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}

	openCedulaCitaNotiResJur(pIdAudiencia) {
		console.log('entro al service de getCedulaCitaProv ');
		var localURL = this.baseUrlRegistro + '/res_ced_noti_res_jur/' + pIdAudiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}

	openAperturaPrueba(pIdResultAudiencia) {
		console.log('entro al service de openAperturaPrueba ');
		var localURL = this.baseUrlRegistro + '/apertura-prueba/'+ this._submitFormService.Get_token();
		const params = new HttpParams()
		.set('pIdResultAudiencia', pIdResultAudiencia);

	return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);
	}

	openResolucionFinal(pIdResultAudiencia) {
		console.log('entro al service de openResolucionFinal ');
		var localURL = this.baseUrlRegistro + '/resolucion-final/'+ this._submitFormService.Get_token();
		const params = new HttpParams()
		.set('pIdResultAudiencia', pIdResultAudiencia);

	return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);
	}


	openDeclaracionRebeldia(pIdResultAudiencia) {
		console.log('entro al service de openDeclaracionRebeldia ');
		var localURL = this.baseUrlRegistro + '/declaracion-rebeldia/'+ this._submitFormService.Get_token();
		const params = new HttpParams()
		.set('pIdResultAudiencia', pIdResultAudiencia);

	return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);
	}
	

	openNotificacionJur(pIdQueja,es_CP,esResultadoResolucion) {
		console.log('entro al service de openNotificacionConsumidorJur ');
		var localURL = this.baseUrlRegistro + '/res_ced_noti_res_jur/'+ this._submitFormService.Get_token();
		const params = new HttpParams()
		.set('pIdQueja', pIdQueja)
		.set('es_CP',es_CP)
		.set('esResultadoResolucion',esResultadoResolucion);

	return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);
	}


	getCedulaNotiCons(pId_audiencia) {
		console.log('entro al service de getCedulaNotiCons ');
		var localURL = this.baseUrlRegistro + '/cedula-noti-cons/' + pId_audiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);
	}

	openCedulaCitaNotiCitCorreo(pId_audiencia) {
		console.log('entro al service de getCedulaNotiCons ');
		var localURL = this.baseUrlRegistro + '/cedula-noti-cit-correo/' + pId_audiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);
	}

	getCedulaNotiProv(pId_audiencia) {
		console.log('entro al service de getCedulaNotiProv');
		var localURL = this.baseUrlRegistro + '/cedula-noti-prov/' + pId_audiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);
	}

	openCedulaCitaNotiResCorreo(pId_audiencia) {
		console.log('entro al service de openCedulaCitaNotiResCorreo');
		var localURL = this.baseUrlRegistro + '/cedula-noti-res-correo/' + pId_audiencia + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);
	}



	getFormularioQuejaRegistro(id) {
		console.log('entro al service de getFormularioQuejaRegistro ');
		var localURL = this.baseUrlRegistro + '/form-queja/' + id + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}

	getFichaQueja(pIdQueja, pRazon, pDetalle) {
		console.log('entro al service de getFichaQueja ');
		var localURL = this.baseUrlRegistro + '/ficha-queja/' + this._submitFormService.Get_token();
		console.log(localURL);
		const params = new HttpParams()
			.set('pIdQueja', pIdQueja)
			.set('pRazon', pRazon)
			.set('pDetalle', pDetalle);

		return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);

	}



	getResArchivoConciliacion(pId_queja) {
		var localURL = this.baseUrlRegistro + '/res_arch_conci/' + this._submitFormService.Get_token();
		console.log('dir ' + localURL);
		const params = new HttpParams()
			.set('pIdQueja', pId_queja);

		return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);

	}

	getResArchivoUnicaAudConciliacion(pId_queja) {
		console.log('entro al service de getResArchivoUnicaAudConciliacion ');
		var localURL = this.baseUrlRegistro + '/res_arch_un_aud_con/' + this._submitFormService.Get_token();
		console.log(localURL);
		const params = new HttpParams()
			.set('pIdQueja', pId_queja);

		return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);

	}


	getResArchivoVisitaCampo(pIdQueja, pFechaResolucion) {
		console.log('entro al service de getResArchivoVisitaCampo ');
		var localURL = this.baseUrlRegistro + '/resolucion-archivo-visita-campo/' + this._submitFormService.Get_token();
		console.log(localURL);
		const params = new HttpParams()
			.set('pIdQueja', pIdQueja)
			.set('pFechaResolucion', pFechaResolucion);

		return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);
	}


	getResArchivoVisitaCampoVerif(pIdQueja) {
		console.log('entro al service de getResArchivoVisitaCampoVerif ');
		var localURL = this.baseUrlRegistro + '/res-archivo-visita-campo_verif/' + this._submitFormService.Get_token();
		console.log(localURL);
		const params = new HttpParams()
			.set('pIdQueja', pIdQueja);

		return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);
	}

	getComPermanente(pIdRegistro) {
		console.log('entro al service de getComPermanente ');
		var localURL = this.baseUrlRegistro + '/com-perm/' + pIdRegistro + '/' + this._submitFormService.Get_token();
		console.log(localURL);
		return this._http.get(localURL, { responseType: 'blob' }
			//,this.httpOptionsFile
		);

	}

	getMovExpedienteReg(pId) {
		console.log('entro al service de getMovExpedienteReg ');
		var localURL = this.baseUrlRegistro + '/res_mov_expediente/' + this._submitFormService.Get_token();
		console.log(localURL);

		const params = new HttpParams()
			.set('pId', pId);
		return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);
	}

	getCaratula(pId_queja) {
		var localURL = this.baseUrlRegistro + '/caratula/' + this._submitFormService.Get_token();
		console.log('dir ' + localURL);
		const params = new HttpParams()
			.set('pIdQueja', pId_queja);

		return this._http.get(localURL, { responseType: 'blob', params }
			//,this.httpOptionsFile
		);

	}


	addGetActaConciliacionCorrelativo(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/acta-juridico-corr/';
		return this._http.post<any>(LocalURL, this.ObjaJSON_add(idqueja), this.httpOptions).pipe(
			tap((item) => console.log('Registro Guardado')),
			catchError(this.handleError<any>('Registro Guardado'))
		);
	}

	read_ActaConciliacionCorrelativo(idqueja): Observable<any> {
		var LocalURL = this.baseUrl + '/acta-juridico-corr/' + idqueja + '/' + this._submitFormService.Get_token();
		console.log(LocalURL);
		return this._http.get(LocalURL, this.httpOptions).pipe(map(this.extractData));
	}

	FileDownLoadChoose(data, id_tipo_imagen) {
		if (id_tipo_imagen == 1) {
			this.downloadPDFFile(data);
		} else if(id_tipo_imagen == 5){
			this.downloadDOCFile(data);
		} else if(id_tipo_imagen == 6){
			this.downloadDOCnoXFile(data);
		  }
		

	}

	downloadDOCnoXFile(data) {
		const blob = new Blob([data], { type: 'application/msword' });
		//const blob = new Blob([data], { type: 'application/x-zip-compressed' });
		const url= window.URL.createObjectURL(blob);
		var pwa = window.open(url);
		if (!pwa || pwa.closed || typeof pwa.closed == 'undefined') {
			alert('Por favor deshabilite su bloqueador de Pop-ups e intente de nuevo.');
		}
	  }

	downloadDOCFile(data) {
		const blob = new Blob([data], { type: 'application/vnd.openxmlformats-officedocument.wordprocessingml.document' });
		//const blob = new Blob([data], { type: 'application/x-zip-compressed' });
		const url= window.URL.createObjectURL(blob);
		var pwa = window.open(url);
		if (!pwa || pwa.closed || typeof pwa.closed == 'undefined') {
			alert('Por favor deshabilite su bloqueador de Pop-ups e intente de nuevo.');
		}
	  }

	downloadPDFFile(data) {
		const blob = new Blob([data], { type: 'application/pdf' });
		const url = window.URL.createObjectURL(blob);
		var pwa = window.open(url);
		if (!pwa || pwa.closed || typeof pwa.closed == 'undefined') {
			alert('Por favor deshabilite su bloqueador de Pop-ups e intente de nuevo.');
		}
	}

	private handleError<T>(operation = 'operation', result?: T) {
		return (error: any): Observable<T> => {
			// TODO: send the error to remote logging infrastructure
			console.error(error); // log to console instead
			// TODO: better job of transforming error for user consumption
			console.log('${operation} failed: ${error.message}');
			// Let the app keep running by returning an empty result.
			return of(result as T);
		};
	}

	convertDate(date) {
		return this.datePipe.transform(date, "yyyy-MM-dd");
	}

	ObjaJSON_add(idqueja) {
		var locarray = { id_queja: idqueja, creado_por: this._submitFormService.Get_userid(), token: this._submitFormService.Get_token() };
		return JSON.stringify(locarray);
	}

	ObjaJSON_add_2(idqueja, idaudiencia) {
		var locarray = { id_queja: idqueja, id_audiencia: idaudiencia, creado_por: this._submitFormService.Get_userid(), token: this._submitFormService.Get_token() };
		return JSON.stringify(locarray);
	}

	ObjaJSON_add_visita_flujo(idqueja, pIdFLujo) {
		var locarray = { id_queja: idqueja, id_flujo: pIdFLujo, creado_por: this._submitFormService.Get_userid(), token: this._submitFormService.Get_token() };
		return JSON.stringify(locarray);
	}

	TrimandCut(string, maxlen) {
		string = string.trim();
		if (string.length > maxlen)
			string = string.substring(0, maxlen);

		return string;
	}

	/*WhiteListChars(input) {
  
	  var NumbersAlphabetAndWhiteSpace = /[A-Za-z áéíóúÁÉÍÓÚÑñ1234567890-_+*]/g;   
	  // Retrieving the key from the char code passed in event.which
	  // For more info on even.which, look here: http://stackoverflow.com/q/3050984/114029
	  var key = String.fromCharCode(event.which);
	  
	  //alert(event.keyCode);
	  
	  // For the keyCodes, look here: http://stackoverflow.com/a/3781360/114029
	  // keyCode == 8  is backspace
	  // keyCode == 37 is left arrow
	  // keyCode == 39 is right arrow
	  // englishAlphabetAndWhiteSpace.test(key) does the matching, that is, test the key just typed against the regex pattern
	  if (event.keyCode == 8 || event.keyCode == 37 || event.keyCode == 39 || englishAlphabetAndWhiteSpace.test(key)) {
		  return true;
	  }
  
	  // If we got this far, just return false because a disallowed key was typed.
	  return false;
	  });*/


}

