(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _consumidor_consumidor_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./consumidor/consumidor.component */ "./src/app/consumidor/consumidor.component.ts");
/* harmony import */ var _proveedor_proveedor_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./proveedor/proveedor.component */ "./src/app/proveedor/proveedor.component.ts");
/* harmony import */ var _queja_queja_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./queja/queja.component */ "./src/app/queja/queja.component.ts");
/* harmony import */ var _revisionqueja_revisionqueja_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./revisionqueja/revisionqueja.component */ "./src/app/revisionqueja/revisionqueja.component.ts");
/* harmony import */ var _registropcv_registropcv_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./registropcv/registropcv.component */ "./src/app/registropcv/registropcv.component.ts");
/* harmony import */ var _confirmar_proveedor_confirnar_proveedor_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./confirmar-proveedor/confirnar-proveedor.component */ "./src/app/confirmar-proveedor/confirnar-proveedor.component.ts");
/* harmony import */ var _registronotprev_registronotprev_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./registronotprev/registronotprev.component */ "./src/app/registronotprev/registronotprev.component.ts");
/* harmony import */ var _pquejaini_pquejaini_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./pquejaini/pquejaini.component */ "./src/app/pquejaini/pquejaini.component.ts");
/* harmony import */ var _quejapr_quejapr_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./quejapr/quejapr.component */ "./src/app/quejapr/quejapr.component.ts");



//import { MainConcVirtualComponent }      from './main-conc-virtual/main-conc-virtual.component';
//import { LoginComponent } from './login/login.component';









var routes = [
    //{ path: '', redirectTo: '/consumidor', pathMatch: 'full' },
    //{ path: 'mainConcVirt', component: MainConcVirtualComponent },
    //{ path: 'Login', component: LoginComponent },
    //{ path: 'consumidor', component: ConsumidorComponent },
    { path: 'proveedor', component: _proveedor_proveedor_component__WEBPACK_IMPORTED_MODULE_4__["ProveedorComponent"] },
    { path: 'queja', component: _queja_queja_component__WEBPACK_IMPORTED_MODULE_5__["QuejaComponent"] },
    { path: 'revisionqueja', component: _revisionqueja_revisionqueja_component__WEBPACK_IMPORTED_MODULE_6__["RevisionquejaComponent"] },
    { path: 'registropcv', component: _registropcv_registropcv_component__WEBPACK_IMPORTED_MODULE_7__["RegistropcvComponent"] },
    { path: 'confirmar-proveedor/:clave', component: _confirmar_proveedor_confirnar_proveedor_component__WEBPACK_IMPORTED_MODULE_8__["ConfirmarProveedorComponent"] },
    { path: 'registronp', component: _registronotprev_registronotprev_component__WEBPACK_IMPORTED_MODULE_9__["RegistronotprevComponent"] },
    { path: 'consumidor/:dato/:id', component: _consumidor_consumidor_component__WEBPACK_IMPORTED_MODULE_3__["ConsumidorComponent"] },
    { path: 'consumidor/:dato/:id/:queja', component: _consumidor_consumidor_component__WEBPACK_IMPORTED_MODULE_3__["ConsumidorComponent"] },
    { path: 'pquejaini/:dato/:id', component: _pquejaini_pquejaini_component__WEBPACK_IMPORTED_MODULE_10__["PquejainiComponent"] },
    { path: 'quejapr/:dato', component: _quejapr_quejapr_component__WEBPACK_IMPORTED_MODULE_11__["QuejaprComponent"] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes, { useHash: true })],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");


var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'DIACOext';
    }
    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _angular_material_expansion__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/material/expansion */ "./node_modules/@angular/material/esm5/expansion.es5.js");
/* harmony import */ var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! @angular/platform-browser/animations */ "./node_modules/@angular/platform-browser/fesm5/animations.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm5/common.js");
/* harmony import */ var angular_datatables__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! angular-datatables */ "./node_modules/angular-datatables/index.js");
/* harmony import */ var _swimlane_ngx_datatable__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! @swimlane/ngx-datatable */ "./node_modules/@swimlane/ngx-datatable/release/index.js");
/* harmony import */ var _swimlane_ngx_datatable__WEBPACK_IMPORTED_MODULE_10___default = /*#__PURE__*/__webpack_require__.n(_swimlane_ngx_datatable__WEBPACK_IMPORTED_MODULE_10__);
/* harmony import */ var _angular_material_divider__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! @angular/material/divider */ "./node_modules/@angular/material/esm5/divider.es5.js");
/* harmony import */ var _angular_material_progress_bar__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! @angular/material/progress-bar */ "./node_modules/@angular/material/esm5/progress-bar.es5.js");
/* harmony import */ var _consumidor_consumidor_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./consumidor/consumidor.component */ "./src/app/consumidor/consumidor.component.ts");
/* harmony import */ var _proveedor_proveedor_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./proveedor/proveedor.component */ "./src/app/proveedor/proveedor.component.ts");
/* harmony import */ var _queja_queja_component__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ./queja/queja.component */ "./src/app/queja/queja.component.ts");
/* harmony import */ var ng2_file_upload__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! ng2-file-upload */ "./node_modules/ng2-file-upload/fesm5/ng2-file-upload.js");
/* harmony import */ var ngx_bootstrap_datepicker__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! ngx-bootstrap/datepicker */ "./node_modules/ngx-bootstrap/datepicker/fesm5/ngx-bootstrap-datepicker.js");
/* harmony import */ var ngx_bootstrap_chronos__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! ngx-bootstrap/chronos */ "./node_modules/ngx-bootstrap/chronos/fesm5/ngx-bootstrap-chronos.js");
/* harmony import */ var ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__ = __webpack_require__(/*! ngx-bootstrap/locale */ "./node_modules/ngx-bootstrap/locale/fesm5/ngx-bootstrap-locale.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_20__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _shared_soap_service__WEBPACK_IMPORTED_MODULE_21__ = __webpack_require__(/*! ./shared/soap.service */ "./src/app/shared/soap.service.ts");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_22__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var _registropcv_registropcv_component__WEBPACK_IMPORTED_MODULE_23__ = __webpack_require__(/*! ./registropcv/registropcv.component */ "./src/app/registropcv/registropcv.component.ts");
/* harmony import */ var _revisionqueja_revisionqueja_component__WEBPACK_IMPORTED_MODULE_24__ = __webpack_require__(/*! ./revisionqueja/revisionqueja.component */ "./src/app/revisionqueja/revisionqueja.component.ts");
/* harmony import */ var _registronotprev_registronotprev_component__WEBPACK_IMPORTED_MODULE_25__ = __webpack_require__(/*! ./registronotprev/registronotprev.component */ "./src/app/registronotprev/registronotprev.component.ts");
/* harmony import */ var _confirmar_proveedor_confirnar_proveedor_component__WEBPACK_IMPORTED_MODULE_26__ = __webpack_require__(/*! ./confirmar-proveedor/confirnar-proveedor.component */ "./src/app/confirmar-proveedor/confirnar-proveedor.component.ts");
/* harmony import */ var ngx_soap__WEBPACK_IMPORTED_MODULE_27__ = __webpack_require__(/*! ngx-soap */ "./node_modules/ngx-soap/fesm5/ngx-soap.js");
/* harmony import */ var _pquejaini_pquejaini_component__WEBPACK_IMPORTED_MODULE_28__ = __webpack_require__(/*! ./pquejaini/pquejaini.component */ "./src/app/pquejaini/pquejaini.component.ts");
/* harmony import */ var _buscaprov_buscaprov_component__WEBPACK_IMPORTED_MODULE_29__ = __webpack_require__(/*! ./buscaprov/buscaprov.component */ "./src/app/buscaprov/buscaprov.component.ts");
/* harmony import */ var ngx_captcha__WEBPACK_IMPORTED_MODULE_30__ = __webpack_require__(/*! ngx-captcha */ "./node_modules/ngx-captcha/fesm5/ngx-captcha.js");
/* harmony import */ var ng_recaptcha__WEBPACK_IMPORTED_MODULE_31__ = __webpack_require__(/*! ng-recaptcha */ "./node_modules/ng-recaptcha/fesm5/ng-recaptcha.js");
/* harmony import */ var _quejapr_quejapr_component__WEBPACK_IMPORTED_MODULE_32__ = __webpack_require__(/*! ./quejapr/quejapr.component */ "./src/app/quejapr/quejapr.component.ts");
/* harmony import */ var _angular_material_progress_spinner__WEBPACK_IMPORTED_MODULE_33__ = __webpack_require__(/*! @angular/material/progress-spinner */ "./node_modules/@angular/material/esm5/progress-spinner.es5.js");


//import { NgModule } from '@angular/core';



//import { MainConcVirtualComponent } from './main-conc-virtual/main-conc-virtual.component';
//import { TableConcVirtualComponent } from './table-conc-virtual/table-conc-virtual.component';

//import {MatDialogModule} from "@angular/material";








//import { DetalleConcVirtComponent } from './detalle-conc-virt/detalle-conc-virt.component';
//import { BitacoraConcVirtComponent } from './bitacora-conc-virt/bitacora-conc-virt.component';
//import { ResolverConcVirtComponent } from './resolver-conc-virt/resolver-conc-virt.component';
//import { FileReadUploadComponent } from './file-read-upload/file-read-upload.component';
//import { LoginComponent } from './login/login.component';








//import { WINDOW_PROVIDERS } from "./shared/window.service";






//import { FlexLayoutModule } from '@angular/flex-layout';

//import { InwhiteComponent } from './inwhite/inwhite.component';

//import { PconsumidorComponent } from './pconsumidor/pconsumidor.component';
//import { PproveedorComponent } from './pproveedor/pproveedor.component';
//import { PquejaComponent } from './pqueja/pqueja.component';


// recaptcha



//import { QuejainiComponent } from './quejaini/quejaini.component';
var locales = [
    ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["arLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["bgLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["csLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["daLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["deLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["enGbLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["esDoLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["esLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["esUsLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["frLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["heLocale"],
    ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["hiLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["fiLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["glLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["huLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["idLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["itLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["jaLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["koLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["ltLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["mnLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["nbLocale"],
    ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["nlBeLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["nlLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["plLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["ptBrLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["ruLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["roLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["skLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["slLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["svLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["thLocale"], ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["trLocale"],
    ngx_bootstrap_locale__WEBPACK_IMPORTED_MODULE_19__["zhCnLocale"]
];
locales.forEach(function (locale) {
    if (!locale.abbr) {
        return;
    }
    Object(ngx_bootstrap_chronos__WEBPACK_IMPORTED_MODULE_18__["defineLocale"])(locale.abbr, locale);
});
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_20__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"],
                //MainConcVirtualComponent,
                //TableConcVirtualComponent,
                //DetalleConcVirtComponent,
                //BitacoraConcVirtComponent,
                //ResolverConcVirtComponent,
                //FileReadUploadComponent,
                //LoginComponent,
                _consumidor_consumidor_component__WEBPACK_IMPORTED_MODULE_13__["ConsumidorComponent"],
                _proveedor_proveedor_component__WEBPACK_IMPORTED_MODULE_14__["ProveedorComponent"],
                _queja_queja_component__WEBPACK_IMPORTED_MODULE_15__["QuejaComponent"],
                _registropcv_registropcv_component__WEBPACK_IMPORTED_MODULE_23__["RegistropcvComponent"],
                _confirmar_proveedor_confirnar_proveedor_component__WEBPACK_IMPORTED_MODULE_26__["ConfirmarProveedorComponent"],
                _revisionqueja_revisionqueja_component__WEBPACK_IMPORTED_MODULE_24__["RevisionquejaComponent"],
                _registronotprev_registronotprev_component__WEBPACK_IMPORTED_MODULE_25__["RegistronotprevComponent"],
                //InwhiteComponent,
                _pquejaini_pquejaini_component__WEBPACK_IMPORTED_MODULE_28__["PquejainiComponent"],
                //PconsumidorComponent,
                //PproveedorComponent,
                //PquejaComponent,
                _buscaprov_buscaprov_component__WEBPACK_IMPORTED_MODULE_29__["BuscaprovComponent"],
                _quejapr_quejapr_component__WEBPACK_IMPORTED_MODULE_32__["QuejaprComponent"]
                //,QuejainiComponent
                //,FlexLayoutModule
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_1__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_3__["AppRoutingModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormsModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_2__["ReactiveFormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_5__["HttpClientModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatDialogModule"],
                _angular_material_expansion__WEBPACK_IMPORTED_MODULE_6__["MatExpansionModule"],
                _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_7__["BrowserAnimationsModule"],
                angular_datatables__WEBPACK_IMPORTED_MODULE_9__["DataTablesModule"],
                _swimlane_ngx_datatable__WEBPACK_IMPORTED_MODULE_10__["NgxDatatableModule"],
                _angular_material_divider__WEBPACK_IMPORTED_MODULE_11__["MatDividerModule"],
                _angular_material_progress_bar__WEBPACK_IMPORTED_MODULE_12__["MatProgressBarModule"],
                ng2_file_upload__WEBPACK_IMPORTED_MODULE_16__["FileUploadModule"],
                ngx_bootstrap_datepicker__WEBPACK_IMPORTED_MODULE_17__["BsDatepickerModule"].forRoot(),
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatTooltipModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatInputModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatButtonModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatSelectModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatIconModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatTableModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatPaginatorModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_22__["MatSortModule"],
                ngx_soap__WEBPACK_IMPORTED_MODULE_27__["NgxSoapModule"],
                ngx_captcha__WEBPACK_IMPORTED_MODULE_30__["NgxCaptchaModule"],
                _angular_material_progress_spinner__WEBPACK_IMPORTED_MODULE_33__["MatProgressSpinnerModule"],
                ng_recaptcha__WEBPACK_IMPORTED_MODULE_31__["RecaptchaModule"].forRoot()
            ],
            providers: [{ provide: _angular_common__WEBPACK_IMPORTED_MODULE_8__["LocationStrategy"], useClass: _angular_common__WEBPACK_IMPORTED_MODULE_8__["HashLocationStrategy"] }, _angular_common__WEBPACK_IMPORTED_MODULE_8__["DatePipe"], _shared_soap_service__WEBPACK_IMPORTED_MODULE_21__["SoapService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"]],
            //DetalleConcVirtComponent,BitacoraConcVirtComponent,ResolverConcVirtComponent,
            entryComponents: [_buscaprov_buscaprov_component__WEBPACK_IMPORTED_MODULE_29__["BuscaprovComponent"], _quejapr_quejapr_component__WEBPACK_IMPORTED_MODULE_32__["QuejaprComponent"]]
            //,QuejainiComponent]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/atencion-consumidor-const.ts":
/*!**********************************************!*\
  !*** ./src/app/atencion-consumidor-const.ts ***!
  \**********************************************/
/*! exports provided: BASE_SERVER, BASE_URL_REST, BASE_VERIFICACION_DATOS_LINK, BASE_URL_REST_FILE, List_Images, BaseCmbClass, LSTFILTRO_RESOLUCION, LSTFILTRO_ATENCIONCONSUMIDOR, LSTFILTRO_SERVICIOSPUBLICOS, LSTFILTRO_VERIFICACIONVIGILANCIA, LSTCMB_FINALIZACION, LSTCMB_PRIMERAAUDIENCIA, LSTCMB_SEGUNDAAUDIENCIA, LSTCMB_SEDES, LSTCMB_AREAS, LSTCMB_CONCILIADORES, LSTCMB_VISITAPOR, LSTCMB_MOTIVOPOA, LSTCMB_RAZONFIN, LSTCMB_CATEGORIAFIN, FrmMainParam, FrmRazonFin, FrmMainFD, FrmBitacora, CmbResultadoAudiencia, FrmDetalle_Queja, FrmSede, FrmDetalle_Telefono, FrmDetalle_Email, CmbCatalogo, CmbDptoInterno, LstQuejaSimple, CmbMotivoFinalizado, FrmConcVirt, FormResponse, FrmRegComCon, Frm4Registros, FrmAudiencia, FrmProgramaAudiencia, FrmVisitaCampo, FrmMovimExp, FrmBusqueda_Con, FrmMoviExpReg, FrmResArchivoConciliacion */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_SERVER", function() { return BASE_SERVER; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_REST", function() { return BASE_URL_REST; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_VERIFICACION_DATOS_LINK", function() { return BASE_VERIFICACION_DATOS_LINK; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_REST_FILE", function() { return BASE_URL_REST_FILE; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "List_Images", function() { return List_Images; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BaseCmbClass", function() { return BaseCmbClass; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTFILTRO_RESOLUCION", function() { return LSTFILTRO_RESOLUCION; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTFILTRO_ATENCIONCONSUMIDOR", function() { return LSTFILTRO_ATENCIONCONSUMIDOR; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTFILTRO_SERVICIOSPUBLICOS", function() { return LSTFILTRO_SERVICIOSPUBLICOS; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTFILTRO_VERIFICACIONVIGILANCIA", function() { return LSTFILTRO_VERIFICACIONVIGILANCIA; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_FINALIZACION", function() { return LSTCMB_FINALIZACION; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_PRIMERAAUDIENCIA", function() { return LSTCMB_PRIMERAAUDIENCIA; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_SEGUNDAAUDIENCIA", function() { return LSTCMB_SEGUNDAAUDIENCIA; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_SEDES", function() { return LSTCMB_SEDES; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_AREAS", function() { return LSTCMB_AREAS; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_CONCILIADORES", function() { return LSTCMB_CONCILIADORES; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_VISITAPOR", function() { return LSTCMB_VISITAPOR; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_MOTIVOPOA", function() { return LSTCMB_MOTIVOPOA; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_RAZONFIN", function() { return LSTCMB_RAZONFIN; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTCMB_CATEGORIAFIN", function() { return LSTCMB_CATEGORIAFIN; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmMainParam", function() { return FrmMainParam; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmRazonFin", function() { return FrmRazonFin; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmMainFD", function() { return FrmMainFD; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmBitacora", function() { return FrmBitacora; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CmbResultadoAudiencia", function() { return CmbResultadoAudiencia; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmDetalle_Queja", function() { return FrmDetalle_Queja; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmSede", function() { return FrmSede; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmDetalle_Telefono", function() { return FrmDetalle_Telefono; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmDetalle_Email", function() { return FrmDetalle_Email; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CmbCatalogo", function() { return CmbCatalogo; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CmbDptoInterno", function() { return CmbDptoInterno; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LstQuejaSimple", function() { return LstQuejaSimple; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CmbMotivoFinalizado", function() { return CmbMotivoFinalizado; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmConcVirt", function() { return FrmConcVirt; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FormResponse", function() { return FormResponse; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmRegComCon", function() { return FrmRegComCon; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Frm4Registros", function() { return Frm4Registros; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmAudiencia", function() { return FrmAudiencia; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmProgramaAudiencia", function() { return FrmProgramaAudiencia; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmVisitaCampo", function() { return FrmVisitaCampo; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmMovimExp", function() { return FrmMovimExp; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmBusqueda_Con", function() { return FrmBusqueda_Con; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmMoviExpReg", function() { return FrmMoviExpReg; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmResArchivoConciliacion", function() { return FrmResArchivoConciliacion; });
//export const BASE_SERVER   = 'http://gestorquejas.diaco.gob.gt/';
//export const BASE_SERVER   = 'http://localhost:8080/';
var BASE_SERVER = 'https://dev.mineco.gob.gt/';
/*
* Dev
*/
//export const BASE_SERVER   = 'http://desagestorquejas.diaco.gob.gt/';
var BASE_URL_REST = BASE_SERVER + 'Quejas/rs/';
/*--------------------------------------------------------- */
/*
 * produccion
 */
// export const BASE_SERVER   = 'http://gestorquejas.diaco.gob.gt/';
// export const BASE_URL_REST= BASE_SERVER + 'diaco-int-web/rs/';
/*--------------------------------------------------------- */
//export const BASE_URL_REST= BASE_SERVER + 'diaco-int-web/rs/';
var BASE_VERIFICACION_DATOS_LINK = BASE_URL_REST;
var BASE_URL_REST_FILE = BASE_URL_REST;
var List_Images = /** @class */ (function () {
    function List_Images() {
    }
    return List_Images;
}());

var BaseCmbClass = /** @class */ (function () {
    function BaseCmbClass() {
    }
    return BaseCmbClass;
}());

var LSTFILTRO_RESOLUCION = [
    { id: 1, nombre: 'No Aplica' },
    { id: 2, nombre: 'Resuelto' },
    { id: 3, nombre: 'Sin Resolución' }
];
var LSTFILTRO_ATENCIONCONSUMIDOR = [
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
var LSTFILTRO_SERVICIOSPUBLICOS = [
    { id: 999, nombre: 'Activos' },
    { id: 501, nombre: 'Archivado' },
    { id: 996, nombre: 'En Atención al Consumidor' },
    { id: 201, nombre: 'Enviados a juridico' },
    { id: 301, nombre: 'Enviados a verificacion y vigilancia' },
    { id: 997, nombre: 'Pendiente de Confirmación' },
    { id: 401, nombre: 'Con el Proveedor' },
    { id: 402, nombre: 'Resuelto por el Proveedor' },
    { id: 998, nombre: 'Todos (activos e inactivos)' }
];
var LSTFILTRO_VERIFICACIONVIGILANCIA = [
    { id: 999, nombre: 'Activos' },
    { id: 301, nombre: 'Pendiente Comunicación Permanente' },
    { id: 302, nombre: 'Pendiente Informe Final' },
    { id: 303, nombre: 'Informe Final Completado' },
    { id: 201, nombre: 'Enviados a Juridico' },
    { id: 501, nombre: 'Enviados a Archivo' },
    { id: 997, nombre: 'Pendiente de Confirmación' },
    { id: 996, nombre: 'Enviado a Atención al Consumidor' },
    { id: 998, nombre: 'Todos (activos e inactivos)' }
];
var LSTCMB_FINALIZACION = [
    { id: 1, nombre: 'Improcedencia' },
    { id: 2, nombre: 'Falta de Documentación' }
];
var LSTCMB_PRIMERAAUDIENCIA = [
    { id: 1, nombre: 'Conciliación' },
    { id: 2, nombre: 'Sin Acuerdo' },
    { id: 3, nombre: 'Incomparecencia' },
    { id: 4, nombre: 'Prórroga de Audiencia' }
];
var LSTCMB_SEGUNDAAUDIENCIA = [
    { id: 1, nombre: 'Conciliación' },
    { id: 2, nombre: 'Rebeldía' },
    { id: 3, nombre: 'Apertura de Prueba' }
];
var LSTCMB_SEDES = [
    { id: 1, nombre: 'Sede Guatemala Zona 9' },
    { id: 2, nombre: 'Sede Guatemala Zona X' },
    { id: 3, nombre: 'Sede Escuintla' }
];
var LSTCMB_AREAS = [
    { id: 1, nombre: 'Servicios al Consumidor' },
    { id: 2, nombre: 'Jurídico' },
    { id: 3, nombre: 'Verificación y Vigilancia' }
];
var LSTCMB_CONCILIADORES = [
    { id: 1, nombre: 'Conciliador A' },
    { id: 2, nombre: 'Conciliador B' },
    { id: 3, nombre: 'Conciliador C' }
];
var LSTCMB_VISITAPOR = [
    { id: 1, nombre: 'Empleado A' },
    { id: 2, nombre: 'Empleado B' },
    { id: 3, nombre: 'Empleado C' }
];
var LSTCMB_MOTIVOPOA = [
    { id: 1, nombre: 'Motivo A' },
    { id: 2, nombre: 'Motivo B' },
    { id: 3, nombre: 'Motivo C' }
];
var LSTCMB_RAZONFIN = [
    { id: 1, nombre: 'Razon A' },
    { id: 2, nombre: 'Razon B' },
    { id: 3, nombre: 'Razon C' }
];
var LSTCMB_CATEGORIAFIN = [
    { id: 1, nombre: 'Categoria A' },
    { id: 2, nombre: 'Categoria B' },
    { id: 3, nombre: 'Categoria C' }
];
var FrmMainParam = /** @class */ (function () {
    function FrmMainParam() {
    }
    return FrmMainParam;
}());

var FrmRazonFin = /** @class */ (function () {
    function FrmRazonFin() {
    }
    return FrmRazonFin;
}());

var FrmMainFD = /** @class */ (function () {
    function FrmMainFD() {
    }
    return FrmMainFD;
}());

var FrmBitacora = /** @class */ (function () {
    function FrmBitacora() {
    }
    return FrmBitacora;
}());

var CmbResultadoAudiencia = /** @class */ (function () {
    function CmbResultadoAudiencia() {
    }
    return CmbResultadoAudiencia;
}());

var FrmDetalle_Queja = /** @class */ (function () {
    function FrmDetalle_Queja() {
    }
    return FrmDetalle_Queja;
}());

var FrmSede = /** @class */ (function () {
    function FrmSede() {
    }
    return FrmSede;
}());

var FrmDetalle_Telefono = /** @class */ (function () {
    function FrmDetalle_Telefono() {
    }
    return FrmDetalle_Telefono;
}());

var FrmDetalle_Email = /** @class */ (function () {
    function FrmDetalle_Email() {
    }
    return FrmDetalle_Email;
}());

var CmbCatalogo = /** @class */ (function () {
    function CmbCatalogo() {
    }
    return CmbCatalogo;
}());

var CmbDptoInterno = /** @class */ (function () {
    function CmbDptoInterno() {
    }
    return CmbDptoInterno;
}());

var LstQuejaSimple = /** @class */ (function () {
    function LstQuejaSimple() {
    }
    return LstQuejaSimple;
}());

var CmbMotivoFinalizado = /** @class */ (function () {
    function CmbMotivoFinalizado() {
    }
    return CmbMotivoFinalizado;
}());

var FrmConcVirt = /** @class */ (function () {
    function FrmConcVirt() {
    }
    return FrmConcVirt;
}());

var FormResponse = /** @class */ (function () {
    function FormResponse() {
    }
    return FormResponse;
}());

var FrmRegComCon = /** @class */ (function () {
    function FrmRegComCon() {
    }
    return FrmRegComCon;
}());

var Frm4Registros = /** @class */ (function () {
    function Frm4Registros() {
    }
    return Frm4Registros;
}());

var FrmAudiencia = /** @class */ (function () {
    function FrmAudiencia() {
    }
    return FrmAudiencia;
}());

var FrmProgramaAudiencia = /** @class */ (function () {
    function FrmProgramaAudiencia() {
    }
    return FrmProgramaAudiencia;
}());

var FrmVisitaCampo = /** @class */ (function () {
    function FrmVisitaCampo() {
    }
    return FrmVisitaCampo;
}());

var FrmMovimExp = /** @class */ (function () {
    function FrmMovimExp() {
    }
    return FrmMovimExp;
}());

var FrmBusqueda_Con = /** @class */ (function () {
    function FrmBusqueda_Con() {
    }
    return FrmBusqueda_Con;
}());

var FrmMoviExpReg = /** @class */ (function () {
    function FrmMoviExpReg() {
    }
    return FrmMoviExpReg;
}());

var FrmResArchivoConciliacion = /** @class */ (function () {
    function FrmResArchivoConciliacion() {
    }
    return FrmResArchivoConciliacion;
}());



/***/ }),

/***/ "./src/app/buscaprov/api-usuarios.service.ts":
/*!***************************************************!*\
  !*** ./src/app/buscaprov/api-usuarios.service.ts ***!
  \***************************************************/
/*! exports provided: ApiUsuariosService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ApiUsuariosService", function() { return ApiUsuariosService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var ApiUsuariosService = /** @class */ (function () {
    function ApiUsuariosService(http) {
        this.http = http;
    }
    ApiUsuariosService.prototype.getUsuarios = function () {
        return this.http.get('http://apiuser.azurewebsites.net/api/usuarios');
    };
    ApiUsuariosService.prototype.fetchDataProv = function (nit, nombre) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'proveedores/busca?nit=' + nit + "&nombre=" + nombre);
    };
    ApiUsuariosService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], ApiUsuariosService);
    return ApiUsuariosService;
}());



/***/ }),

/***/ "./src/app/buscaprov/buscaprov.component.css":
/*!***************************************************!*\
  !*** ./src/app/buscaprov/buscaprov.component.css ***!
  \***************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".example-container {\n    display: flex;\n    flex-direction: column;\n    min-width: 300px;\n  }\n  \n  .example-header {\n    min-height: 64px;\n    padding: 8px 24px 0;\n  }\n  \n  mat-header-row{\n    font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;\n  }\n  \n  .mat-form-field {\n    font-size: 14px;\n    width: 100%;\n  }\n  \n  .mat-table {\n    overflow: auto;\n  }\n  \n  .mat-row:nth-child(even){\n    background-color:rgb(212, 239, 250)\n  }\n  \n  .mat-row:nth-child(odd){\n    background-color:rgb(247, 241, 241)\n}\n  \n  .encabezado{\n  background-color: rgb(94, 143, 216);\n}\n\n  \n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvYnVzY2Fwcm92L2J1c2NhcHJvdi5jb21wb25lbnQuY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0lBQ0ksYUFBYTtJQUNiLHNCQUFzQjtJQUN0QixnQkFBZ0I7RUFDbEI7O0VBRUE7SUFDRSxnQkFBZ0I7SUFDaEIsbUJBQW1CO0VBQ3JCOztFQUVBO0lBQ0Usc0VBQXNFO0VBQ3hFOztFQUVBO0lBQ0UsZUFBZTtJQUNmLFdBQVc7RUFDYjs7RUFFQTtJQUNFLGNBQWM7RUFDaEI7O0VBRUE7SUFDRTtFQUNGOztFQUVGO0lBQ0k7QUFDSjs7RUFFQTtFQUNFLG1DQUFtQztBQUNyQyIsImZpbGUiOiJzcmMvYXBwL2J1c2NhcHJvdi9idXNjYXByb3YuY29tcG9uZW50LmNzcyIsInNvdXJjZXNDb250ZW50IjpbIi5leGFtcGxlLWNvbnRhaW5lciB7XG4gICAgZGlzcGxheTogZmxleDtcbiAgICBmbGV4LWRpcmVjdGlvbjogY29sdW1uO1xuICAgIG1pbi13aWR0aDogMzAwcHg7XG4gIH1cbiAgXG4gIC5leGFtcGxlLWhlYWRlciB7XG4gICAgbWluLWhlaWdodDogNjRweDtcbiAgICBwYWRkaW5nOiA4cHggMjRweCAwO1xuICB9XG5cbiAgbWF0LWhlYWRlci1yb3d7XG4gICAgZm9udC1mYW1pbHk6IEltcGFjdCwgSGFldHRlbnNjaHdlaWxlciwgJ0FyaWFsIE5hcnJvdyBCb2xkJywgc2Fucy1zZXJpZjtcbiAgfVxuICBcbiAgLm1hdC1mb3JtLWZpZWxkIHtcbiAgICBmb250LXNpemU6IDE0cHg7XG4gICAgd2lkdGg6IDEwMCU7XG4gIH1cbiAgXG4gIC5tYXQtdGFibGUge1xuICAgIG92ZXJmbG93OiBhdXRvO1xuICB9XG5cbiAgLm1hdC1yb3c6bnRoLWNoaWxkKGV2ZW4pe1xuICAgIGJhY2tncm91bmQtY29sb3I6cmdiKDIxMiwgMjM5LCAyNTApXG4gIH1cblxuLm1hdC1yb3c6bnRoLWNoaWxkKG9kZCl7XG4gICAgYmFja2dyb3VuZC1jb2xvcjpyZ2IoMjQ3LCAyNDEsIDI0MSlcbn1cblxuLmVuY2FiZXphZG97XG4gIGJhY2tncm91bmQtY29sb3I6IHJnYig5NCwgMTQzLCAyMTYpO1xufVxuXG4gICJdfQ== */"

/***/ }),

/***/ "./src/app/buscaprov/buscaprov.component.html":
/*!****************************************************!*\
  !*** ./src/app/buscaprov/buscaprov.component.html ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<mat-dialog-content>\n <form [formGroup]=\"proveedorForm\" >\n<div class=\"form-group row\">\n          <label for=\"\" class=\"col-lg-12 col-form-label\">Ingrese parámetro de búsqueda, puede ser NIT o NOMBRE</label>\n\t\t<div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t  \n\t\t\t  <div class=\"form-group row\">\n\t\t\t\t  <label for=\"nitProveedor\" class=\"col-lg-2 col-form-label\">NIT</label>\n\t\t\t\t  <div class=\"col-lg-2\">\n\t\t\t\t\t<input \n\t\t\t\t\t  id=\"nitProveedor\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese NIT del proveedor\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  formControlName=\"nitProveedor\"\n\t\t\t\t\t  (change)=\"RenderDataTableProveedor()\"\n\t\t\t\t\t  placeholder=\"NIT\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t  <label for=\"nombrep\" class=\"col-lg-2 col-form-label\">Nombre</label>\n\t\t\t\t  <div class=\"col-lg-2\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombrep\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese Nombre del proveedor\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  formControlName=\"nombrep\"\n\t\t\t\t\t  (change)=\"RenderDataTableProveedor()\"\n\t\t\t\t\t  placeholder=\"Nombre\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t  \n\t\t\t\t  <button\n              class=\"btn btn-primary\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Busqueda proveedor.\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t  (click)=\"RenderDataTableProveedor()\"\n              >Buscar proveedor</button>\n\t\t\t</div>\n\t\t\t<div>\n\t\t\t\t<p> \n\t\t\t\t\t<strong>NOTA:</strong>\n\t\t\t\t\t \n\t\t\t\t\tSi no encuentra el proveedor, cerrar esta ventana y llenar los campos de NIT, Ubicación y factura ó Contrato.\n\t\t\t\t</p>\n\t\t\t</div>\n</div></div></div></div>\n<div class=\"example-header mat-elevation-z8\">\n  <mat-form-field>\n    <input matInput (keyup)=\"applyFilter($event.target.value)\" placeholder=\"Escriba algo para filtrar\">\n  </mat-form-field>\n</div>\n<br>\n<div class=\"example-container mat-elevation-z8\">\n  <mat-table [dataSource]=\"dataSource\" matSort>\n    <!--Columna ID-->\n    <ng-container matColumnDef=\"Id\">\n      <mat-header-cell *matHeaderCellDef mat-sort-header> Id </mat-header-cell>\n      <mat-cell *matCellDef=\"let row\"   > {{row.idProveedor}} </mat-cell>\n\t  \n    </ng-container>\n\n    <!-- Columna Documento -->\n    <ng-container matColumnDef=\"Nit\">\n      <mat-header-cell *matHeaderCellDef mat-sort-header> Nit </mat-header-cell>\n      <mat-cell *matCellDef=\"let row\"> {{row.nitProveedor}} </mat-cell>\n    </ng-container>\n\n    <!-- Columna Nombre-->\n    <ng-container matColumnDef=\"Nombre\">\n      <mat-header-cell *matHeaderCellDef mat-sort-header> Nombre </mat-header-cell>\n      <mat-cell *matCellDef=\"let row\"> {{row.nombre}} </mat-cell>\n    </ng-container>\n\n\t<!-- Columna Nombre Empresa-->\n    <ng-container matColumnDef=\"Nombre Empresa\">\n\t\t<mat-header-cell *matHeaderCellDef mat-sort-header> Nombre Empresa </mat-header-cell>\n\t\t<mat-cell *matCellDef=\"let row\"> {{row.nombreEmpresa}} </mat-cell>\n\t  </ng-container>\n\t  \n\n\t<!-- Columna Razón Social-->\n    <ng-container matColumnDef=\"Razón Social\">\n\t\t<mat-header-cell *matHeaderCellDef mat-sort-header> Razón Social </mat-header-cell>\n\t\t<mat-cell *matCellDef=\"let row\"> {{row.razonSocial}} </mat-cell>\n\t  </ng-container>\n\n\t<!-- Name Column -->\n    <ng-container matColumnDef=\"Seleccionar\">\n  <mat-header-cell  *matHeaderCellDef > Seleccionar </mat-header-cell>\n  <mat-cell *matCellDef=\"let row\" >\n       <!--button mat-button (click)=\"seleccionar(row.idProveedor,row.nombre)\">Seleccionar</button-->\n\t   <button [mat-dialog-close]=\"proveedorToInsert\" style=\"margin-left: 5%\" type=\"button\" (click)=\"seleccionar(row, row.idProveedor,row.nombre,row.nitProveedor)\">Seleccionar</button>\n  </mat-cell>\n</ng-container>\n\n    <mat-header-row *matHeaderRowDef=\"displayedColumns\" class=\"encabezado\"></mat-header-row>\n    <mat-row *matRowDef=\"let row; columns: displayedColumns;\">\n    </mat-row>\n  </mat-table>\n\n  <mat-paginator [pageSizeOptions]=\"[5, 10, 25, 50, 100]\" [pageSize]=\"10\" [showFirstLastButtons]=\"true\"></mat-paginator>\n</div>\n</form>\n\n</mat-dialog-content>\n\n<mat-dialog-actions>\n  <!--button type=\"button\" class=\"btn btn-light\" >Close</button-->\n  <button [mat-dialog-close]=\"courseToInsert\" style=\"margin-left: 5%\" type=\"button\" class=\"btn btn-dark\">Cerrar</button>\n  <!--button style=\"margin-left: 5%\" type=\"button\" class=\"btn btn-dark\">Cerrar</button-->\n</mat-dialog-actions>"

/***/ }),

/***/ "./src/app/buscaprov/buscaprov.component.ts":
/*!**************************************************!*\
  !*** ./src/app/buscaprov/buscaprov.component.ts ***!
  \**************************************************/
/*! exports provided: BuscaprovComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BuscaprovComponent", function() { return BuscaprovComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var _api_usuarios_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./api-usuarios.service */ "./src/app/buscaprov/api-usuarios.service.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _shared_proveedor_model__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/proveedor.model */ "./src/app/shared/proveedor.model.ts");







var BuscaprovComponent = /** @class */ (function () {
    function BuscaprovComponent(dataService, dialogRef) {
        this.dataService = dataService;
        this.dialogRef = dialogRef;
        this.displayedColumns = ['Id', 'Nit', 'Nombre', 'Nombre Empresa', 'Razón Social', 'Seleccionar'];
        this.habilitado = "0";
        //this.logService = new LogService(this.LOG_TAG);
    }
    BuscaprovComponent.prototype.ngOnInit = function () {
        this.initProveedorForm();
    };
    BuscaprovComponent.prototype.initProveedorForm = function () {
        this.proveedorForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_4__["FormGroup"]({
            'nombrep': new _angular_forms__WEBPACK_IMPORTED_MODULE_4__["FormControl"](''),
            'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_4__["FormControl"]('')
        });
        this.proveedorToInsert = new _shared_proveedor_model__WEBPACK_IMPORTED_MODULE_5__["Proveedor"]();
        this.proveedorToInsert.idProveedor = 0;
        this.proveedorToInsert.nombre = "";
        this.proveedorToInsert.nitProveedor = "";
        this.proveedorToInsert.habilitadoConciliacionPrevia = "0";
    };
    BuscaprovComponent.prototype.RenderDataTable = function () {
        var _this = this;
        this.dataService.getUsuarios()
            .subscribe(function (res) {
            _this.dataSource = new _angular_material__WEBPACK_IMPORTED_MODULE_2__["MatTableDataSource"]();
            _this.dataSource.data = res;
            ////console.log(this.dataSource.data);
            _this.dataSource.sort = _this.sort;
            _this.dataSource.paginator = _this.paginator;
        }, function (error) {
            //console.log('Se produjo un error mientras intentaba recuperar Usuarios!' + error);  
        });
    };
    BuscaprovComponent.prototype.RenderDataTableProveedor = function () {
        var _this = this;
        if (this.proveedorForm.value.nitProveedor == "" && this.proveedorForm.value.nombrep == "") {
            this.dataSource = null;
        }
        else {
            this.dataService.fetchDataProv(this.proveedorForm.value.nitProveedor, this.proveedorForm.value.nombrep)
                .subscribe(function (res) {
                _this.dataSource = new _angular_material__WEBPACK_IMPORTED_MODULE_2__["MatTableDataSource"]();
                _this.dataSource.data = res['value'];
                //console.log("RenderDataTableProveedor",this.dataSource.data);
                _this.dataSource.sort = _this.sort;
                _this.dataSource.paginator = _this.paginator;
            }, function (error) {
                //console.log('Se produjo un error mientras intentaba recuperar Usuarios!' + error);  
            });
        }
    };
    BuscaprovComponent.prototype.applyFilter = function (filterValue) {
        filterValue = filterValue.trim();
        filterValue = filterValue.toLowerCase();
        this.dataSource.filter = filterValue;
    };
    BuscaprovComponent.prototype.seleccionar = function (row, valor, nombre, nit) {
        this.proveedorToInsert.idProveedor = valor;
        this.proveedorToInsert.nombre = nombre;
        this.proveedorToInsert.nitProveedor = nit;
        //this.proveedorToInsert.habilitadoConciliacionPrevia = "222";
        //this.initProveedorForm();
        //this.dataSource = null;	
        //console.info(row);
        //console.info(this.proveedorToInsert.idProveedor);
        //console.info(this.proveedorToInsert.nombre);
    };
    BuscaprovComponent.prototype.courseToInsert = function () {
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ViewChild"])(_angular_material__WEBPACK_IMPORTED_MODULE_2__["MatPaginator"]),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", _angular_material__WEBPACK_IMPORTED_MODULE_2__["MatPaginator"])
    ], BuscaprovComponent.prototype, "paginator", void 0);
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ViewChild"])(_angular_material__WEBPACK_IMPORTED_MODULE_2__["MatSort"]),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", _angular_material__WEBPACK_IMPORTED_MODULE_2__["MatSort"])
    ], BuscaprovComponent.prototype, "sort", void 0);
    BuscaprovComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-buscaprov',
            template: __webpack_require__(/*! ./buscaprov.component.html */ "./src/app/buscaprov/buscaprov.component.html"),
            styles: [__webpack_require__(/*! ./buscaprov.component.css */ "./src/app/buscaprov/buscaprov.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_api_usuarios_service__WEBPACK_IMPORTED_MODULE_3__["ApiUsuariosService"], _angular_material__WEBPACK_IMPORTED_MODULE_2__["MatDialogRef"]])
    ], BuscaprovComponent);
    return BuscaprovComponent;
}());



/***/ }),

/***/ "./src/app/conc-virt-const.ts":
/*!************************************!*\
  !*** ./src/app/conc-virt-const.ts ***!
  \************************************/
/*! exports provided: BASE_SERVER, BASE_URL_REST, BASE_URL_FILE, BASE_URL_REST_FILE, BASE_URL_REST_FILE2, BASE_URL_REST_EXTER, BASE_URL_DYNAMIC_ASSIGNMENT, BaseCmbClass, CmbResolucion, FrmMainConcVirt, LSTFILTRO_ESTADOCONCVIRT, LSTFILTRO_RESOLUCION, FrmBitacora, FrmQueja, FrmDetalle_Queja, FrmDetalle_Telefono, FrmDetalle_Email, List_Images, FrmDepartamento, FrmMunicipio, FrmProveedor */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_SERVER", function() { return BASE_SERVER; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_REST", function() { return BASE_URL_REST; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_FILE", function() { return BASE_URL_FILE; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_REST_FILE", function() { return BASE_URL_REST_FILE; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_REST_FILE2", function() { return BASE_URL_REST_FILE2; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_REST_EXTER", function() { return BASE_URL_REST_EXTER; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BASE_URL_DYNAMIC_ASSIGNMENT", function() { return BASE_URL_DYNAMIC_ASSIGNMENT; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BaseCmbClass", function() { return BaseCmbClass; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CmbResolucion", function() { return CmbResolucion; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmMainConcVirt", function() { return FrmMainConcVirt; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTFILTRO_ESTADOCONCVIRT", function() { return LSTFILTRO_ESTADOCONCVIRT; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LSTFILTRO_RESOLUCION", function() { return LSTFILTRO_RESOLUCION; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmBitacora", function() { return FrmBitacora; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmQueja", function() { return FrmQueja; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmDetalle_Queja", function() { return FrmDetalle_Queja; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmDetalle_Telefono", function() { return FrmDetalle_Telefono; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmDetalle_Email", function() { return FrmDetalle_Email; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "List_Images", function() { return List_Images; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmDepartamento", function() { return FrmDepartamento; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmMunicipio", function() { return FrmMunicipio; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FrmProveedor", function() { return FrmProveedor; });
//export const BASE_SERVER   = 'http://gestorquejas.diaco.gob.gt/';
//export const BASE_SERVER   = 'http://desagestorquejas.diaco.gob.gt/';
//export const BASE_SERVER   = 'http://localhost:8080/';
var BASE_SERVER = 'https://dev.mineco.gob.gt/';
//para servicios de dist
// export const BASE_URL_REST=      BASE_SERVER + 'diaco-int-web/rs/'; 
var BASE_URL_REST = BASE_SERVER + 'Quejas/rs/';
var BASE_URL_FILE = BASE_URL_REST;
var BASE_URL_REST_FILE = BASE_URL_REST;
//para servicios de dist6
// export const BASE_URL_REST_FILE2=BASE_SERVER +  'file-web-quejaini/rs/';
var BASE_URL_REST_FILE2 = BASE_SERVER + 'web-quejaini/rs/';
var BASE_URL_REST_EXTER = BASE_URL_REST;
var BASE_URL_DYNAMIC_ASSIGNMENT = BASE_SERVER + 'Quejas/rs/tipos-confaccion/asignaAtCon/';
var BaseCmbClass = /** @class */ (function () {
    function BaseCmbClass() {
    }
    return BaseCmbClass;
}());

var CmbResolucion = /** @class */ (function () {
    function CmbResolucion() {
    }
    return CmbResolucion;
}());

var FrmMainConcVirt = /** @class */ (function () {
    function FrmMainConcVirt() {
    }
    return FrmMainConcVirt;
}());

var LSTFILTRO_ESTADOCONCVIRT = [
    { id: 401, nombre: 'Activo' },
    { id: 402, nombre: 'Resuelto Localmente' },
    { id: 999, nombre: 'Pendiente validar por DIACO' },
    { id: 107, nombre: 'Finalizado por DIACO' },
    { id: 108, nombre: 'Rechazado por DIACO' }
];
var LSTFILTRO_RESOLUCION = [
    { id: 1, nombre: 'No Aplica' },
    { id: 2, nombre: 'Resuelto' },
    { id: 3, nombre: 'Sin Resolución' }
];
var FrmBitacora = /** @class */ (function () {
    function FrmBitacora() {
    }
    return FrmBitacora;
}());

var FrmQueja = /** @class */ (function () {
    function FrmQueja() {
    }
    return FrmQueja;
}());

var FrmDetalle_Queja = /** @class */ (function () {
    function FrmDetalle_Queja() {
    }
    return FrmDetalle_Queja;
}());

var FrmDetalle_Telefono = /** @class */ (function () {
    function FrmDetalle_Telefono() {
    }
    return FrmDetalle_Telefono;
}());

var FrmDetalle_Email = /** @class */ (function () {
    function FrmDetalle_Email() {
    }
    return FrmDetalle_Email;
}());

var List_Images = /** @class */ (function () {
    function List_Images() {
    }
    return List_Images;
}());

var FrmDepartamento = /** @class */ (function () {
    function FrmDepartamento() {
    }
    return FrmDepartamento;
}());

var FrmMunicipio = /** @class */ (function () {
    function FrmMunicipio() {
    }
    return FrmMunicipio;
}());

var FrmProveedor = /** @class */ (function () {
    function FrmProveedor() {
    }
    return FrmProveedor;
}());



/***/ }),

/***/ "./src/app/confirmar-proveedor/confirmar-proveedor.component.html":
/*!************************************************************************!*\
  !*** ./src/app/confirmar-proveedor/confirmar-proveedor.component.html ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n\n<head>\n</head>\n\n<body>\n\n  <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n    <span class=\"navbar-text whitefont\">DIACO - Confirmación proveedor</span>\n \n  </nav>\n\n  <div class=\"container\">\n    <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\" *ngIf=\"success\">\n      <!--h4 class=\"alert-heading\">Solicitud registrada!</h4-->\n      <p>Su solicitud ha sido registrada exitosamente. </p>\n      \n    </div>\n    <div class=\"row\">\n      &nbsp;\n    </div>\n    <div class=\"row\">\n      <div class=\"col-sm-12\" *ngIf=\"!success\">\n        <form >\n          <div class=\"form-group row\">\n            <div class=\"col-sm-12\">\n              <div class=\"card\">\n                <div class=\"card-body\">\n                  <div class=\"form-group row\">\n                    <label for=\"\" class=\"col-sm-12 col-form-label\">Favor de confirmar su correo dando clic en el botón\n                      confirmar.</label>\n                    <div class=\"col-sm-1\">\n                      <div class=\"col-lg-12 text-center\">\n                        <button class=\"btn btn-primary row\" type=\"button\" [disabled]=\"completado\"\n                          (click)=\"confirmarCorreo()\" matTooltipPosition=\"after\" matTooltip=\"Buscar proveedor.\"\n                          matTooltipClass=\"custom-tooltip-blue\">Confirmar</button>\n                      </div>\n                    </div>\n                  </div>\n                </div>\n              </div>\n            </div>\n          </div>\n        </form>\n      </div>\n    </div>\n  \n  </div>\n\n\n\n\n</body>\n\n</html>"

/***/ }),

/***/ "./src/app/confirmar-proveedor/confirmar-proveedor.component.scss":
/*!************************************************************************!*\
  !*** ./src/app/confirmar-proveedor/confirmar-proveedor.component.scss ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "body {\n  background-image: url('/dist6/diacofade3.jpg'), url('/dist6/imagen-grdfade2.jpg');\n  background-repeat: no-repeat, no-repeat;\n  background-attachment: fixed, fixed;\n  background-size: auto auto, auto auto;\n  background-position: bottom right, bottom left;\n  min-height: 100vh; }\n\nnav.navbar {\n  background-color: #00284d !important;\n  padding-top: 3px !important;\n  padding-bottom: 3px !important;\n  min-height: 20px !important; }\n\n.whitefont {\n  color: white !important; }\n\n.whitelink {\n  color: white !important;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n.whitelink:hover {\n  color: white !important;\n  text-decoration: underline;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n@font-face {\n  font-family: ABeeZeeRegular;\n  src: url('ABeeZee-Regular.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: ABeeZeeItalic;\n  src: url('ABeeZee-Italic.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: LatoBold;\n  src: url('Lato-Bold.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: Lato;\n  src: url('Lato-Regular.ttf') format(\"truetype\"); }\n\ntextarea {\n  border: 1px solid #999999;\n  width: 100%;\n  margin: 5px 0;\n  padding: 3px;\n  font-family: ABeeZeeItalic, sans-serif; }\n\n* {\n  font-size: 100%;\n  font-family: ABeeZeeRegular, sans-serif; }\n\nh2 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: LatoBold, sans-serif; }\n\nh3 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: Lato, sans-serif;\n  text-decoration: underline; }\n\ninput {\n  font-family: ABeeZeeItalic, sans-serif; }\n\nselect {\n  font-family: ABeeZeeItalic, sans-serif; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvY29uZmlybWFyLXByb3ZlZWRvci9DOlxcVXNlcnNcXGpqYWd1aWxhbFxcRG9jdW1lbnRzXFxESUFDTyBBUFBcXFFVRUpBUy1ESUFDT1xcRnJvbnRlbmRcXGRpc3Q2L3NyY1xcYXBwXFxjb25maXJtYXItcHJvdmVlZG9yXFxjb25maXJtYXItcHJvdmVlZG9yLmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0MsaUZBQWlFO0VBQ2pFLHVDQUF1QztFQUN2QyxtQ0FBbUM7RUFDbkMscUNBQXFDO0VBQ3JDLDhDQUE4QztFQUM5QyxpQkFBZ0IsRUFBQTs7QUFHakI7RUFDQyxvQ0FBb0M7RUFDcEMsMkJBQTBCO0VBQzFCLDhCQUE2QjtFQUM3QiwyQkFDRCxFQUFBOztBQUVBO0VBQ0MsdUJBQXVCLEVBQUE7O0FBRXhCO0VBQ0MsdUJBQXVCO0VBQ3ZCLDJCQUEwQjtFQUFFLDhCQUE2QixFQUFBOztBQUUxRDtFQUNDLHVCQUF1QjtFQUN2QiwwQkFBMEI7RUFDMUIsMkJBQTBCO0VBQUUsOEJBQTZCLEVBQUE7O0FBRzFEO0VBQ0UsMkJBQTJCO0VBQzNCLGtEQUFxRSxFQUFBOztBQUd2RTtFQUNFLDBCQUEwQjtFQUMxQixpREFBb0UsRUFBQTs7QUFHdEU7RUFDRSxxQkFBcUI7RUFDckIsNENBQStELEVBQUE7O0FBR2pFO0VBQ0UsaUJBQWlCO0VBQ2pCLCtDQUFrRSxFQUFBOztBQUdwRTtFQUVFLHlCQUF3QjtFQUN4QixXQUFVO0VBQ1YsYUFBWTtFQUNaLFlBQVc7RUFDWCxzQ0FBdUMsRUFBQTs7QUFHekM7RUFDQyxlQUFlO0VBQ2YsdUNBQXdDLEVBQUE7O0FBR3pDO0VBQ0MsY0FBYTtFQUNiLGVBQWM7RUFDZCxpQ0FBa0MsRUFBQTs7QUFHbkM7RUFDQyxjQUFhO0VBQ2IsZUFBYztFQUNkLDZCQUE4QjtFQUM5QiwwQkFBMEIsRUFBQTs7QUFHM0I7RUFDQyxzQ0FBdUMsRUFBQTs7QUFHeEM7RUFDQyxzQ0FBdUMsRUFBQSIsImZpbGUiOiJzcmMvYXBwL2NvbmZpcm1hci1wcm92ZWVkb3IvY29uZmlybWFyLXByb3ZlZWRvci5jb21wb25lbnQuc2NzcyIsInNvdXJjZXNDb250ZW50IjpbImJvZHkge1xyXG5cdGJhY2tncm91bmQtaW1hZ2U6IHVybCgvZGlhY29mYWRlMy5qcGcpLCB1cmwoL2ltYWdlbi1ncmRmYWRlMi5qcGcpIDtcclxuXHRiYWNrZ3JvdW5kLXJlcGVhdDogbm8tcmVwZWF0LCBuby1yZXBlYXQ7XHJcblx0YmFja2dyb3VuZC1hdHRhY2htZW50OiBmaXhlZCwgZml4ZWQ7XHJcblx0YmFja2dyb3VuZC1zaXplOiBhdXRvIGF1dG8sIGF1dG8gYXV0bztcclxuXHRiYWNrZ3JvdW5kLXBvc2l0aW9uOiBib3R0b20gcmlnaHQsIGJvdHRvbSBsZWZ0O1xyXG5cdG1pbi1oZWlnaHQ6MTAwdmg7IFxyXG59XHJcblxyXG5uYXYubmF2YmFye1xyXG5cdGJhY2tncm91bmQtY29sb3I6ICMwMDI4NGQgIWltcG9ydGFudDtcclxuXHRwYWRkaW5nLXRvcDozcHggIWltcG9ydGFudDsgXHJcblx0cGFkZGluZy1ib3R0b206M3B4ICFpbXBvcnRhbnQ7XHJcblx0bWluLWhlaWdodDoyMHB4ICFpbXBvcnRhbnRcclxufVxyXG5cclxuLndoaXRlZm9udCB7XHJcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XHJcbn1cclxuLndoaXRlbGluayB7XHJcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XHJcblx0cGFkZGluZy10b3A6NXB4ICFpbXBvcnRhbnQ7IHBhZGRpbmctYm90dG9tOjVweCAhaW1wb3J0YW50O1xyXG59XHJcbi53aGl0ZWxpbms6aG92ZXIge1xyXG5cdGNvbG9yOiB3aGl0ZSAhaW1wb3J0YW50O1xyXG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xyXG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcclxufVxyXG5cclxuQGZvbnQtZmFjZSB7XHJcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVSZWd1bGFyO1xyXG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvQUJlZVplZS1SZWd1bGFyLnR0ZicpIGZvcm1hdCgndHJ1ZXR5cGUnKTtcclxufVxyXG5cclxuQGZvbnQtZmFjZSB7XHJcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWM7XHJcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9BQmVlWmVlLUl0YWxpYy50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XHJcbn1cclxuXHJcbkBmb250LWZhY2Uge1xyXG4gIGZvbnQtZmFtaWx5OiBMYXRvQm9sZDtcclxuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0xhdG8tQm9sZC50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XHJcbn1cclxuXHJcbkBmb250LWZhY2Uge1xyXG4gIGZvbnQtZmFtaWx5OiBMYXRvO1xyXG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvTGF0by1SZWd1bGFyLnR0ZicpIGZvcm1hdCgndHJ1ZXR5cGUnKTtcclxufVxyXG5cclxudGV4dGFyZWFcclxue1xyXG4gIGJvcmRlcjoxcHggc29saWQgIzk5OTk5OTtcclxuICB3aWR0aDoxMDAlO1xyXG4gIG1hcmdpbjo1cHggMDtcclxuICBwYWRkaW5nOjNweDtcclxuICBmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZiA7XHRcclxufVxyXG5cclxuKiB7XHJcblx0Zm9udC1zaXplOiAxMDAlO1xyXG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhciwgc2Fucy1zZXJpZiA7XHJcbn1cclxuXHJcbmgyIHtcclxuXHRjb2xvcjojMzM4NWZmO1xyXG5cdGZvbnQtc2l6ZToyMDAlO1xyXG5cdGZvbnQtZmFtaWx5OiBMYXRvQm9sZCwgc2Fucy1zZXJpZiA7XHJcbn1cclxuXHJcbmgzIHtcclxuXHRjb2xvcjojMzM4NWZmO1xyXG5cdGZvbnQtc2l6ZToyMDAlO1xyXG5cdGZvbnQtZmFtaWx5OiBMYXRvLCBzYW5zLXNlcmlmIDtcclxuXHR0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTtcclxufVxyXG5cclxuaW5wdXQge1xyXG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxyXG59XHJcblxyXG5zZWxlY3Qge1xyXG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxyXG59XHJcblxyXG4iXX0= */"

/***/ }),

/***/ "./src/app/confirmar-proveedor/confirnar-proveedor.component.ts":
/*!**********************************************************************!*\
  !*** ./src/app/confirmar-proveedor/confirnar-proveedor.component.ts ***!
  \**********************************************************************/
/*! exports provided: ConfirmarProveedorComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ConfirmarProveedorComponent", function() { return ConfirmarProveedorComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/departamentos.service */ "./src/app/shared/departamentos.service.ts");
/* harmony import */ var _shared_municipios_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../shared/municipios.service */ "./src/app/shared/municipios.service.ts");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var ngx_soap__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ngx-soap */ "./node_modules/ngx-soap/fesm5/ngx-soap.js");
/* harmony import */ var _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../shared/proveedores.service */ "./src/app/shared/proveedores.service.ts");
/* harmony import */ var _shared_confirmacion__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ../shared/confirmacion */ "./src/app/shared/confirmacion.ts");











//import { ReCaptchaV3Service } from 'ngx-captcha';
var ConfirmarProveedorComponent = /** @class */ (function () {
    function ConfirmarProveedorComponent(router, dialog, departamentosService, municipiosService, soap, http, proveedoresService
    //,private reCaptchaV3Service: ReCaptchaV3Service
    , formBuilder, _route) {
        this.router = router;
        this.dialog = dialog;
        this.departamentosService = departamentosService;
        this.municipiosService = municipiosService;
        this.soap = soap;
        this.http = http;
        this.proveedoresService = proveedoresService;
        this.formBuilder = formBuilder;
        this._route = _route;
        this.continua = "0";
        this.completado = false;
        this.vClave = "";
        this.success = false;
        this.mjsError = '';
        //captcha
        this.siteKey = '6LcvoUgUAAAAAJJbhcXvLn3KgG-pyULLusaU4mL1';
    }
    ConfirmarProveedorComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._route.params.subscribe(function (params) {
            _this.vClave = params.clave;
            console.log("clave " + _this.vClave);
        });
    };
    ConfirmarProveedorComponent.prototype.onSubmit = function () {
    };
    ConfirmarProveedorComponent.prototype.onDismissClicked = function () {
        this.success = false;
        this.continua = "0";
        this.paso = 0;
        this.completado = false;
        this.registropcvForm.reset();
    };
    ConfirmarProveedorComponent.prototype.onHomeClicked = function () {
        this.CerrarSesion();
        this.router.navigate(['/Login']);
    };
    ConfirmarProveedorComponent.prototype.CerrarSesion = function () {
        /*
          let loc_token=this._submitFormService.Get_token();
          console.log(loc_token);
          if(loc_token == '')
              this._seguridadService.RedireccionarLogin();
          this._seguridadService.Logout(loc_token).subscribe((retvalue)=>{
              console.log('cerrar sesion',retvalue);
              this._seguridadService.RedireccionarLogin();
          },(error)=>{
              this._seguridadService.RedireccionarLogin();
          });*/
    };
    ConfirmarProveedorComponent.prototype.confirmarCorreo = function () {
        var _this = this;
        console.log('confirmarCorreo ');
        var confirmacion = new _shared_confirmacion__WEBPACK_IMPORTED_MODULE_10__["Confirmacion"]();
        ;
        confirmacion.llave = this.vClave;
        this.proveedoresService.confirmarCorreoProveedor(confirmacion).subscribe(function (retvalue) {
            console.log(retvalue);
            if (retvalue["reason"] == 'OK') {
                console.log('Confirmación correcta');
                _this.success = true;
            }
            else {
                _this.success = false;
                console.log('Rest service response ERROR.');
            }
        });
        this.completado = true;
    };
    /***
      boton continuar
    ***/
    ConfirmarProveedorComponent.prototype.continuar = function () {
        this.paso = this.paso + 1;
        this.continua = this.paso.toString();
        console.info("continuar ", this.continua);
    };
    /***
      boton regresar
    ***/
    ConfirmarProveedorComponent.prototype.regresar = function () {
        this.paso = this.paso - 1;
        this.continua = this.paso.toString();
        console.info("continuar ", this.continua);
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ViewChild"])('filDpi'),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", _angular_core__WEBPACK_IMPORTED_MODULE_1__["ElementRef"])
    ], ConfirmarProveedorComponent.prototype, "filDpi", void 0);
    ConfirmarProveedorComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-confirmar-proveedor',
            template: __webpack_require__(/*! ./confirmar-proveedor.component.html */ "./src/app/confirmar-proveedor/confirmar-proveedor.component.html"),
            styles: [__webpack_require__(/*! ./confirmar-proveedor.component.scss */ "./src/app/confirmar-proveedor/confirmar-proveedor.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _angular_material__WEBPACK_IMPORTED_MODULE_7__["MatDialog"],
            _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_5__["DepartamentosService"],
            _shared_municipios_service__WEBPACK_IMPORTED_MODULE_6__["MunicipiosService"],
            ngx_soap__WEBPACK_IMPORTED_MODULE_8__["NgxSoapService"],
            _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClient"],
            _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_9__["ProveedoresService"]
            //,private reCaptchaV3Service: ReCaptchaV3Service
            ,
            _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormBuilder"],
            _angular_router__WEBPACK_IMPORTED_MODULE_3__["ActivatedRoute"]])
    ], ConfirmarProveedorComponent);
    return ConfirmarProveedorComponent;
}());



/***/ }),

/***/ "./src/app/consumidor/consumidor.component.html":
/*!******************************************************!*\
  !*** ./src/app/consumidor/consumidor.component.html ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n<head>\n\n</head>\n<body *ngIf=\"continuar=='1'\">\n\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <span class=\"navbar-text whitefont\">DIACO  \n    <span class=\"badge badge-secondary\"> {{str_queja}}</span> \n    - Datos de consumidor \n  </span>\n  <!--span class=\"navbar-text whitefont\">&nbsp;&nbsp;&nbsp;Consumidor: {{nombre_proveedor}}</span-->\n  <!---- <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>--->\n  <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n  <ul class=\"navbar-nav mr-auto\">\n   <!----     <li class=\"nav-item active\">\n        <a class=\"nav-link whitelink\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Features</a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Pricing</a>\n      </li>--->\n    </ul>  \n  </div>\n  <span class=\"navbar-text whitefont\">\n    {{str_usuario}} \n  </span>\n  <!--span class=\"navbar-text whitefont\">\n\t<a class=\"nav-link whitelink\" (click)=\"CerrarSesion()\" [routerLink]=\"\">Cerrar Sesi&oacute;n</a>\n  </span-->\n</nav>\n\n\n\n<div class=\"container\" *ngIf=\"continuar=='1'\">\n<div class=\"row\">\n\t <div class=\"col-lg-12\">\n\t\t&nbsp;\n\t </div>\n\t</div>\n<!--   <div class=\"row\">\n    <div class=\"col-lg-4 text-center\">\n      &nbsp;\n    </div>\n    <div class=\"col-lg-4 text-center\">\n      <img src=\"/assets/img/logo-diaco-ant.jpg\" class=\"headerimg\" alt=\"\">\n    </div>\n    <div class=\"col-lg-4 text-center\">\n      &nbsp;\n    </div>\n  </div> -->\n  <div class=\"row\">\n    <div class=\"col-sm-12\">\n      <form (ngSubmit)=\"onSubmit()\" [formGroup]=\"consumidorForm\" >\n        <div class=\"form-group row\">\n          <label for=\"tipoConsumidor\" class=\"col-sm-2 col-form-label\">(*) Tipo</label>\n          <div class=\"col-sm-10\">\n            <select\n              id=\"tipoConsumidor\"\n              class=\"form-control\"\n              formControlName=\"tipoConsumidor\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese tipo de consumidor\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Tipo consumidor\"\n\t\t\t\t\t  >\n              <option value=\"6\">Individual</option>\n              <option value=\"7\">Juridico</option>\n            </select>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"nacionalidad\" class=\"col-sm-6 col-form-label\">(*) Nacionalidad</label>\n              <div class=\"col-sm-6\">\n                <select\n                  id=\"nacionalidad\"\n                  class=\"form-control\"\n                  formControlName=\"nacionalidad\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nacionalidad\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nacionalidad\"\n\t\t\t\t\t  >\n                  <option value=\"G\">Guatemalteco</option>\n                  <option value=\"E\">Extranjero</option>\n                </select>\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"documentoIdentificacion\" class=\"col-sm-6 col-form-label\" *ngIf=\"consumidorForm.value.nacionalidad == 'G' && consumidorForm.value.tipoConsumidor == '6'\">(*) DPI</label>\n\t\t\t  <label for=\"documentoIdentificacion\" class=\"col-sm-6 col-form-label\" *ngIf=\"consumidorForm.value.nacionalidad == 'G' && consumidorForm.value.tipoConsumidor == '7'\">(*) Representante Legal</label>\n              <label for=\"documentoIdentificacion\" class=\"col-sm-6 col-form-label\" *ngIf=\"consumidorForm.value.nacionalidad == 'E'\">(*) Pasaporte</label>\n\n              <div class=\"col-sm-6\" *ngIf=\"consumidorForm.value.tipoConsumidor == '6' || consumidorForm.value.nacionalidad == 'E'\">\n                <input\n                  id=\"documentoIdentificacion\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"documentoIdentificacion\"\n                  (change)=\"onDocumentoIdentificacionChanged('documento')\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese documento de identificacion\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Documento\"\n\t\t\t\t\t  >\n              </div>\n\t\t\t  \n\t\t\t   <div class=\"col-sm-6\" *ngIf=\"consumidorForm.value.nacionalidad == 'G' && consumidorForm.value.tipoConsumidor == '7'\">\n                <input\n                  id=\"representanteLegal\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"representanteLegal\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nombre de representante legal\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nombre representante legal\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\" *ngIf=\"consumidorForm.value.nacionalidad == 'E'\">\n            <div class=\"row\">\n              <label for=\"pais\" class=\"col-sm-6 col-form-label\">(*) Extendido en</label>\n              <div class=\"col-sm-6\">\n                <select\n                  id=\"pais\"\n                  class=\"form-control\"\n                  formControlName=\"pais\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese pais donde se extendio  su documento\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Pais \"\n\t\t\t\t\t  >\n                  <option disabled selected>Escoger</option>\n                  <option value=\"{{pais.idPais}}\" *ngFor=\"let pais of paises\">{{pais.nombrePais}}</option>\n                </select>\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"nitConsumidor\" class=\"col-sm-2 col-form-label\">NIT</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"nitConsumidor\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  (change)=\"onDocumentoIdentificacionChanged('nit')\"\n              formControlName=\"nitConsumidor\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese NIT\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"NIT\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n\t\t<div  *ngIf=\"consumidorForm.value.tipoConsumidor == '6'\">\n\t\t\t<div class=\"form-group row\">\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"nombre1\" class=\"col-sm-6 col-form-label\">(*) Primer Nombre</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombre1\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"nombre1\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese primer nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Primer nombre\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"nombre2\" class=\"col-sm-6 col-form-label\">Segundo Nombre</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombre2\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"nombre2\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese segundo nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Segundo nombre\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"nombre3\" class=\"col-sm-6 col-form-label\">Tercer Nombre</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombre3\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"nombre3\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese tercer nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Tercer nombre\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t</div>\n\t\t\t<div class=\"form-group row\">\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"apellido1\" class=\"col-sm-6 col-form-label\">(*) Primer Apellido</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"apellido1\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"apellido1\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese primer apellido\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Primer apellido\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"apellido2\" class=\"col-sm-6 col-form-label\">Segundo Apellido</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"apellido2\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"apellido2\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese segundo apellido\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Segundo apellido\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"apellidoCasada\" class=\"col-sm-6 col-form-label\">Apellido Casada</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"apellidoCasada\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"apellidoCasada\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese apellido de casada\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Apellido de casada\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t</div>\n\t\t</div>\t\n\t\t\n\t\t<div class=\"form-group row\" *ngIf=\"consumidorForm.value.tipoConsumidor == '7'\">\n          <label for=\"nombreEmpresa\" class=\"col-sm-2 col-form-label\">(*) Nombre de la empresa</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"nombreEmpresa\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"nombreEmpresa\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nombre de la empresa\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nombre empresa\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n        <div class=\"form-group row\" *ngIf=\"consumidorForm.value.tipoConsumidor == '7'\">\n          <label for=\"razonSocial\" class=\"col-sm-2 col-form-label\">(*) Razón social</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"razonSocial\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"razonSocial\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese razon social\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Razon social\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n\t\t\n\t\t<!------------------------------------------------------------------------------>\n\t\t\n        <div class=\"form-group row\" *ngIf=\"consumidorForm.value.tipoConsumidor == '6'\">\n          <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t  <label for=\"genero\" class=\"col-sm-6 col-form-label\">(*) Género</label>\n          <div class=\"col-sm-6\">\n            <select\n              id=\"genero\"\n              class=\"form-control\"\n              formControlName=\"genero\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese genero\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Genero\"\n\t\t\t\t\t  >\n              <option disabled selected>Escoger</option>\n              <option value=\"M\">Masculino</option>\n              <option value=\"F\">Femenino</option>\n            </select>\n          </div>\n\t\t  </div>\n\t\t</div>\n\t\t\n\t\t<div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n          <label for=\"etnia\" class=\"col-sm-6 col-form-label\">(*) Etnia</label>\n          <div class=\"col-sm-6\">\n            <select\n              id=\"etnia\"\n              class=\"form-control\"\n              formControlName=\"etnia\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese Etnia\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Etnia\"\n\t\t\t\t\t  >\n              <option disabled selected>Escoger</option>\n              <option value=\"{{etnia.codigoEtnia}}\" *ngFor=\"let etnia of etnias\">{{etnia.descripcion}}</option>\n            </select>\n          </div>\n\t\t  </div>\n\t\t</div>\n\t\t\n        </div>\n\t\t\n\t\t<!------------------------------------------------------------------------------>\n\t\t\n        <div class=\"form-group row\">\n          <label for=\"motivoQueja\" class=\"col-sm-2 col-form-label\">(*) Motivo de Queja</label>\n          <div class=\"col-sm-10\">\n            <select\n              id=\"motivoQueja\"\n              class=\"form-control\"\n              formControlName=\"motivoQueja\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese motivo de queja\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Motivo queja\"\n\t\t\t\t\t  >\n              <option disabled selected>Escoger</option>\n              <option value=\"{{motivo.idMotivoQueja}}\" *ngFor=\"let motivo of motivosQueja\">{{motivo.motivo}}</option>\n            </select>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"\" class=\"col-sm-2 col-form-label\">(*) Dirección</label>\n          <div class=\"col-sm-10\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t  \n                <div class=\"form-group row\">\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"codigoDepartamento\" class=\"col-sm-4 col-form-label\">(*) Departamento</label>\n                      <div class=\"col-sm-8\">\n                        <select\n                          id=\"codigoDepartamento\"\n                          class=\"form-control\"\n                          formControlName=\"codigoDepartamento\"\n                          (change)=\"onDepartamentoChanged()\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t  matTooltip=\"Ingrese departamento\"\n\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  placeholder=\"Departamento\"\n\t\t\t\t\t\t  >\n                          <option disabled selected>Escoger</option>\n                          <option value=\"{{departamento.codigoDepartamento}}\" *ngFor=\"let departamento of departamentos\">{{departamento.nombreDepartamento}}</option>\n                        </select>\n                      </div>\n                    </div>\n                  </div>\n\t\t\t\t  \n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"codigoMunicipio\" class=\"col-sm-4 col-form-label\">(*) Municipio</label>\n                      <div class=\"col-sm-8\">\n                        <select\n\t\t\t\t\t\t\t  id=\"codigoMunicipio\"\n\t\t\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t\t\t  formControlName=\"codigoMunicipio\"\n\t\t\t\t\t\t\t  (change)=\"onMunicipioChanged()\"\n\t\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t  matTooltip=\"Ingrese municipio\"\n\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  placeholder=\"Municipio\"\n\t\t\t\t\t\t  >\n                          <option disabled selected>Escoger</option>\n                          <option value=\"{{municipio.codigoMunicipio}}\" *ngFor=\"let municipio of municipios\">{{municipio.nombreMunicipio}}</option>\n                        </select>\n                      </div>\n                    </div>\n                  </div>\n                </div>\n                \n\t\t\t\t\n\t\t\t\t\n\t\t\t\t\n\t\t\t\t\n                <div class=\"form-group row\">\n                  <label for=\"direccionDetalle\" class=\"col-sm-2 col-form-label\">(*) Direccion</label>\n                  <div class=\"col-sm-10\">\n                    <input\n                      id=\"direccionDetalle\"\n                      type=\"text\"\n                      class=\"form-control\"\n                      formControlName=\"direccionDetalle\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese direccion\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Direccion\"\n\t\t\t\t\t  >\n                  </div>\n                </div>\n\t\t\t\t\n                <div class=\"form-group row\">\n\t\t\t\t  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"direccionZona\" class=\"col-sm-4 col-form-label\">(*) zona</label>\n                      <div class=\"col-sm-4\">\n                        <input\n\t\t\t\t\t\t  id=\"direccionZona\"\n\t\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t\t  formControlName=\"direccionZona\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t  matTooltip=\"Ingrese zona\"\n\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  placeholder=\"zona\"\n\t\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n\t\t\t\t\n\t\t\t\t  <div class=\"col-sm-6\">\t\n\t\t\t\t  <div class=\"row\">\n                  <label for=\"sedeDiacoCercana\" class=\"col-sm-4 col-form-label\">(*) Sede DIACO mas cercana</label>\n                  <div class=\"col-sm-8\">\n                    <select\n                      id=\"sedeDiacoCercana\"\n                      class=\"form-control\"\n                      formControlName=\"sedeDiacoCercana\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese sede\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Sede\"\n\t\t\t\t\t  >\n                      <option disabled selected>Escoger</option>\n                      <option value=\"{{sede.idDiacoSede}}\" *ngFor=\"let sede of sedes\">{{sede.nombreSede}}</option>\n                    </select>\n                  </div>\n\t\t\t\t  </div>\n\t\t\t\t  </div>\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"\" class=\"col-sm-2 col-form-label\">Telefono</label>\n          <div class=\"col-sm-10\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <div class=\"form-group row\">\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"telefonoCelular\" class=\"col-sm-4 col-form-label\">(*) Personal (celular)</label>\n                      <div class=\"col-sm-8\">\n                        <input\n                          id=\"telefonoCelular\"\n                          type=\"text\"\n                          class=\"form-control\"\n                          formControlName=\"telefonoCelular\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese Telefono celular\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Telefono celular\"\n\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"telefonoDomicilio\" class=\"col-sm-4 col-form-label\">Domicilio</label>\n                      <div class=\"col-sm-8\">\n                        <input\n                          id=\"telefonoDomicilio\"\n                          type=\"text\"\n                          class=\"form-control\"\n                          formControlName=\"telefonoDomicilio\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese telefono domiciliio\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Telefono domicilio\"\n\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n                </div>\n                <div class=\"form-group row\">\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"telefonoReferencia\" class=\"col-sm-4 col-form-label\">Referencia</label>\n                      <div class=\"col-sm-8\">\n                        <input\n                          id=\"telefonoReferencia\"\n                          type=\"text\"\n                          class=\"form-control\"\n                          formControlName=\"telefonoReferencia\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese telefono referencia\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Telefono referencia\"\n\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"email\" class=\"col-sm-4 col-form-label\">(*) Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"email\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"email\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese correo electronico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Correo electronico\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"emailConfirmation\" class=\"col-sm-4 col-form-label\">(*) Confirmar Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"emailConfirmation\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"emailConfirmation\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese confirmacion de correo\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Confirmación de correo\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"email2\" class=\"col-sm-4 col-form-label\">2ndo Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"email2\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"email2\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese correo electronico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Correo electronico\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"email2Confirmation\" class=\"col-sm-4 col-form-label\">Confirmar 2ndo Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"email2Confirmation\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"email2Confirmation\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese correo electronico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Correo electronico\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col-sm-8\">Autorizo a Publicar la Informacion</div>\n          <div class=\"col-sm-10\">\n            <div class=\"form-check\">\n              <input type=\"checkbox\" class=\"form-check-input\" id=\"iCheck\"\n\t\t\t  formControlName=\"iCheck\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Confirme su autorizacion\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Confirmar\"\n\t\t\t  >\n              <label class=\"form-check-label\" for=\"iCheck\">Confirmar</label>\n            </div>\n          </div>\n        </div> \n        <div class=\"form-group row\">\n          \n          <div class=\"col-sm-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <p>Según la Constitución Política de Guatemala, usted tiene el derecho de proporcionar sus datos con garantía de confidencialidad para evitar su uso o publicación indebido.</p>\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col-lg-4 text-center\">\n            &nbsp;\n          </div>\n          <div class=\"col-lg-4 centrar\">\n            <div>\n            <button\n              class=\"btn btn-primary\"\n              type=\"submit\"\n\t\t\t  \n              >Guardar e Ir a Siguiente Pantalla</button>\n            </div>\n          </div>\n          <div class=\"col-lg-4 text-center\">\n            <img src=\"/assets/img/logo-diaco-ant.jpg\" class=\"headerimg\" alt=\"\">\n          </div>\n        </div>\n      </form>\n    </div>\n  </div>\n</div>\n\t<div *ngIf=\"flagInfoError\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tHubo un error al procesar esta acción, por favor intente de nuevo.\n\t</div>\n\n\n</body>\n</html>"

/***/ }),

/***/ "./src/app/consumidor/consumidor.component.scss":
/*!******************************************************!*\
  !*** ./src/app/consumidor/consumidor.component.scss ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "/* body {\n\tbackground-image: url(/assets/img/logo-diaco-ant.jpg);\n\t\n\tbackground-repeat: no-repeat, no-repeat;\n\tbackground-attachment: scroll, fixed;\n\tbackground-size: 10% auto, auto auto;\n\tbackground-position: bottom right, bottom left;\n\tmin-height:100vh; \n} */\n.centrar {\n  display: flex;\n  align-items: center; }\n.card-img {\n  background-image: url('/dist6/assets/img/logo-diaco-ant.jpg');\n  /* background-image: url(diacofade3.jpg), url(imagen-grdfade2.jpg) ; ORIGINAL*/\n  background-repeat: no-repeat, no-repeat;\n  background-attachment: scroll, fixed;\n  background-size: 10% auto, auto auto;\n  background-position: top right, bottom left; }\n.headerimg {\n  width: 40%;\n  height: auto; }\nnav.navbar {\n  background-color: #00284d !important;\n  padding-top: 3px !important;\n  padding-bottom: 3px !important;\n  min-height: 20px !important; }\n.whitefont {\n  color: white !important; }\n.whitelink {\n  color: white !important;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n.whitelink:hover {\n  color: white !important;\n  text-decoration: underline;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n@font-face {\n  font-family: ABeeZeeRegular;\n  src: url('ABeeZee-Regular.ttf') format(\"truetype\"); }\n@font-face {\n  font-family: ABeeZeeItalic;\n  src: url('ABeeZee-Italic.ttf') format(\"truetype\"); }\n@font-face {\n  font-family: LatoBold;\n  src: url('Lato-Bold.ttf') format(\"truetype\"); }\n@font-face {\n  font-family: Lato;\n  src: url('Lato-Regular.ttf') format(\"truetype\"); }\ntextarea {\n  border: 1px solid #999999;\n  width: 100%;\n  margin: 5px 0;\n  padding: 3px;\n  font-family: ABeeZeeItalic, sans-serif; }\n* {\n  font-size: 100%;\n  font-family: ABeeZeeRegular, sans-serif; }\nh2 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: LatoBold, sans-serif; }\nh3 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: Lato, sans-serif;\n  text-decoration: underline; }\ninput {\n  font-family: ABeeZeeItalic, sans-serif; }\nselect {\n  font-family: ABeeZeeItalic, sans-serif; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvY29uc3VtaWRvci9DOlxcVXNlcnNcXGpqYWd1aWxhbFxcRG9jdW1lbnRzXFxESUFDTyBBUFBcXFFVRUpBUy1ESUFDT1xcRnJvbnRlbmRcXGRpc3Q2L3NyY1xcYXBwXFxjb25zdW1pZG9yXFxjb25zdW1pZG9yLmNvbXBvbmVudC5zY3NzIiwic3JjL2FwcC9jb25zdW1pZG9yL2NvbnN1bWlkb3IuY29tcG9uZW50LnNjc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7Ozs7Ozs7O0dDUUc7QURFSDtFQUNDLGFBQWE7RUFDYixtQkFBbUIsRUFBQTtBQUdwQjtFQUNDLDZEQUFxRDtFQUNyRCw4RUFBQTtFQUNBLHVDQUF1QztFQUN2QyxvQ0FBb0M7RUFDcEMsb0NBQW9DO0VBQ3BDLDJDQUEyQyxFQUFBO0FBSTVDO0VBRUMsVUFBVTtFQUNWLFlBQVksRUFBQTtBQUdiO0VBQ0Msb0NBQW9DO0VBQ3BDLDJCQUEwQjtFQUMxQiw4QkFBNkI7RUFDN0IsMkJBQ0QsRUFBQTtBQUVBO0VBQ0MsdUJBQXVCLEVBQUE7QUFFeEI7RUFDQyx1QkFBdUI7RUFDdkIsMkJBQTBCO0VBQUUsOEJBQTZCLEVBQUE7QUFFMUQ7RUFDQyx1QkFBdUI7RUFDdkIsMEJBQTBCO0VBQzFCLDJCQUEwQjtFQUFFLDhCQUE2QixFQUFBO0FBRzFEO0VBQ0UsMkJBQTJCO0VBQzNCLGtEQUFxRSxFQUFBO0FBR3ZFO0VBQ0UsMEJBQTBCO0VBQzFCLGlEQUFvRSxFQUFBO0FBR3RFO0VBQ0UscUJBQXFCO0VBQ3JCLDRDQUErRCxFQUFBO0FBR2pFO0VBQ0UsaUJBQWlCO0VBQ2pCLCtDQUFrRSxFQUFBO0FBR3BFO0VBRUUseUJBQXdCO0VBQ3hCLFdBQVU7RUFDVixhQUFZO0VBQ1osWUFBVztFQUNYLHNDQUF1QyxFQUFBO0FBR3pDO0VBQ0MsZUFBZTtFQUNmLHVDQUF3QyxFQUFBO0FBR3pDO0VBQ0MsY0FBYTtFQUNiLGVBQWM7RUFDZCxpQ0FBa0MsRUFBQTtBQUduQztFQUNDLGNBQWE7RUFDYixlQUFjO0VBQ2QsNkJBQThCO0VBQzlCLDBCQUEwQixFQUFBO0FBRzNCO0VBQ0Msc0NBQXVDLEVBQUE7QUFHeEM7RUFDQyxzQ0FBdUMsRUFBQSIsImZpbGUiOiJzcmMvYXBwL2NvbnN1bWlkb3IvY29uc3VtaWRvci5jb21wb25lbnQuc2NzcyIsInNvdXJjZXNDb250ZW50IjpbIi8qIGJvZHkge1xuXHRiYWNrZ3JvdW5kLWltYWdlOiB1cmwoL2Fzc2V0cy9pbWcvbG9nby1kaWFjby1hbnQuanBnKTtcblx0XG5cdGJhY2tncm91bmQtcmVwZWF0OiBuby1yZXBlYXQsIG5vLXJlcGVhdDtcblx0YmFja2dyb3VuZC1hdHRhY2htZW50OiBzY3JvbGwsIGZpeGVkO1xuXHRiYWNrZ3JvdW5kLXNpemU6IDEwJSBhdXRvLCBhdXRvIGF1dG87XG5cdGJhY2tncm91bmQtcG9zaXRpb246IGJvdHRvbSByaWdodCwgYm90dG9tIGxlZnQ7XG5cdG1pbi1oZWlnaHQ6MTAwdmg7IFxufSAqL1xuXG4uY2VudHJhciB7XG5cdGRpc3BsYXk6IGZsZXg7XG5cdGFsaWduLWl0ZW1zOiBjZW50ZXI7XG4gfVxuXG4uY2FyZC1pbWcge1xuXHRiYWNrZ3JvdW5kLWltYWdlOiB1cmwoL2Fzc2V0cy9pbWcvbG9nby1kaWFjby1hbnQuanBnKTtcblx0LyogYmFja2dyb3VuZC1pbWFnZTogdXJsKGRpYWNvZmFkZTMuanBnKSwgdXJsKGltYWdlbi1ncmRmYWRlMi5qcGcpIDsgT1JJR0lOQUwqL1xuXHRiYWNrZ3JvdW5kLXJlcGVhdDogbm8tcmVwZWF0LCBuby1yZXBlYXQ7XG5cdGJhY2tncm91bmQtYXR0YWNobWVudDogc2Nyb2xsLCBmaXhlZDtcblx0YmFja2dyb3VuZC1zaXplOiAxMCUgYXV0bywgYXV0byBhdXRvO1xuXHRiYWNrZ3JvdW5kLXBvc2l0aW9uOiB0b3AgcmlnaHQsIGJvdHRvbSBsZWZ0O1xuXHRcbn1cblxuLmhlYWRlcmltZ3tcbiAgXG5cdHdpZHRoOiA0MCU7XG5cdGhlaWdodDogYXV0bztcbn1cblxubmF2Lm5hdmJhcntcblx0YmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZCAhaW1wb3J0YW50O1xuXHRwYWRkaW5nLXRvcDozcHggIWltcG9ydGFudDsgXG5cdHBhZGRpbmctYm90dG9tOjNweCAhaW1wb3J0YW50O1xuXHRtaW4taGVpZ2h0OjIwcHggIWltcG9ydGFudFxufVxuXG4ud2hpdGVmb250IHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG59XG4ud2hpdGVsaW5rIHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cbi53aGl0ZWxpbms6aG92ZXIge1xuXHRjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcblx0dGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhcjtcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9BQmVlWmVlLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWM7XG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvQUJlZVplZS1JdGFsaWMudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IExhdG9Cb2xkO1xuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0xhdG8tQm9sZC50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XG59XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogTGF0bztcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9MYXRvLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG50ZXh0YXJlYVxue1xuICBib3JkZXI6MXB4IHNvbGlkICM5OTk5OTk7XG4gIHdpZHRoOjEwMCU7XG4gIG1hcmdpbjo1cHggMDtcbiAgcGFkZGluZzozcHg7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG4qIHtcblx0Zm9udC1zaXplOiAxMDAlO1xuXHRmb250LWZhbWlseTogQUJlZVplZVJlZ3VsYXIsIHNhbnMtc2VyaWYgO1xufVxuXG5oMiB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0b0JvbGQsIHNhbnMtc2VyaWYgO1xufVxuXG5oMyB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0bywgc2Fucy1zZXJpZiA7XG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xufVxuXG5pbnB1dCB7XG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG5zZWxlY3Qge1xuXHRmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZiA7XHRcbn1cblxuIiwiLyogYm9keSB7XG5cdGJhY2tncm91bmQtaW1hZ2U6IHVybCgvYXNzZXRzL2ltZy9sb2dvLWRpYWNvLWFudC5qcGcpO1xuXHRcblx0YmFja2dyb3VuZC1yZXBlYXQ6IG5vLXJlcGVhdCwgbm8tcmVwZWF0O1xuXHRiYWNrZ3JvdW5kLWF0dGFjaG1lbnQ6IHNjcm9sbCwgZml4ZWQ7XG5cdGJhY2tncm91bmQtc2l6ZTogMTAlIGF1dG8sIGF1dG8gYXV0bztcblx0YmFja2dyb3VuZC1wb3NpdGlvbjogYm90dG9tIHJpZ2h0LCBib3R0b20gbGVmdDtcblx0bWluLWhlaWdodDoxMDB2aDsgXG59ICovXG4uY2VudHJhciB7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGFsaWduLWl0ZW1zOiBjZW50ZXI7IH1cblxuLmNhcmQtaW1nIHtcbiAgYmFja2dyb3VuZC1pbWFnZTogdXJsKC9hc3NldHMvaW1nL2xvZ28tZGlhY28tYW50LmpwZyk7XG4gIC8qIGJhY2tncm91bmQtaW1hZ2U6IHVybChkaWFjb2ZhZGUzLmpwZyksIHVybChpbWFnZW4tZ3JkZmFkZTIuanBnKSA7IE9SSUdJTkFMKi9cbiAgYmFja2dyb3VuZC1yZXBlYXQ6IG5vLXJlcGVhdCwgbm8tcmVwZWF0O1xuICBiYWNrZ3JvdW5kLWF0dGFjaG1lbnQ6IHNjcm9sbCwgZml4ZWQ7XG4gIGJhY2tncm91bmQtc2l6ZTogMTAlIGF1dG8sIGF1dG8gYXV0bztcbiAgYmFja2dyb3VuZC1wb3NpdGlvbjogdG9wIHJpZ2h0LCBib3R0b20gbGVmdDsgfVxuXG4uaGVhZGVyaW1nIHtcbiAgd2lkdGg6IDQwJTtcbiAgaGVpZ2h0OiBhdXRvOyB9XG5cbm5hdi5uYXZiYXIge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMDAyODRkICFpbXBvcnRhbnQ7XG4gIHBhZGRpbmctdG9wOiAzcHggIWltcG9ydGFudDtcbiAgcGFkZGluZy1ib3R0b206IDNweCAhaW1wb3J0YW50O1xuICBtaW4taGVpZ2h0OiAyMHB4ICFpbXBvcnRhbnQ7IH1cblxuLndoaXRlZm9udCB7XG4gIGNvbG9yOiB3aGl0ZSAhaW1wb3J0YW50OyB9XG5cbi53aGl0ZWxpbmsge1xuICBjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcbiAgcGFkZGluZy10b3A6IDVweCAhaW1wb3J0YW50O1xuICBwYWRkaW5nLWJvdHRvbTogNXB4ICFpbXBvcnRhbnQ7IH1cblxuLndoaXRlbGluazpob3ZlciB7XG4gIGNvbG9yOiB3aGl0ZSAhaW1wb3J0YW50O1xuICB0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTtcbiAgcGFkZGluZy10b3A6IDVweCAhaW1wb3J0YW50O1xuICBwYWRkaW5nLWJvdHRvbTogNXB4ICFpbXBvcnRhbnQ7IH1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhcjtcbiAgc3JjOiB1cmwoXCIuLi8uLi9hc3NldHMvZm9udHMvQUJlZVplZS1SZWd1bGFyLnR0ZlwiKSBmb3JtYXQoXCJ0cnVldHlwZVwiKTsgfVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWM7XG4gIHNyYzogdXJsKFwiLi4vLi4vYXNzZXRzL2ZvbnRzL0FCZWVaZWUtSXRhbGljLnR0ZlwiKSBmb3JtYXQoXCJ0cnVldHlwZVwiKTsgfVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IExhdG9Cb2xkO1xuICBzcmM6IHVybChcIi4uLy4uL2Fzc2V0cy9mb250cy9MYXRvLUJvbGQudHRmXCIpIGZvcm1hdChcInRydWV0eXBlXCIpOyB9XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogTGF0bztcbiAgc3JjOiB1cmwoXCIuLi8uLi9hc3NldHMvZm9udHMvTGF0by1SZWd1bGFyLnR0ZlwiKSBmb3JtYXQoXCJ0cnVldHlwZVwiKTsgfVxuXG50ZXh0YXJlYSB7XG4gIGJvcmRlcjogMXB4IHNvbGlkICM5OTk5OTk7XG4gIHdpZHRoOiAxMDAlO1xuICBtYXJnaW46IDVweCAwO1xuICBwYWRkaW5nOiAzcHg7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmOyB9XG5cbioge1xuICBmb250LXNpemU6IDEwMCU7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhciwgc2Fucy1zZXJpZjsgfVxuXG5oMiB7XG4gIGNvbG9yOiAjMzM4NWZmO1xuICBmb250LXNpemU6IDIwMCU7XG4gIGZvbnQtZmFtaWx5OiBMYXRvQm9sZCwgc2Fucy1zZXJpZjsgfVxuXG5oMyB7XG4gIGNvbG9yOiAjMzM4NWZmO1xuICBmb250LXNpemU6IDIwMCU7XG4gIGZvbnQtZmFtaWx5OiBMYXRvLCBzYW5zLXNlcmlmO1xuICB0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTsgfVxuXG5pbnB1dCB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmOyB9XG5cbnNlbGVjdCB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmOyB9XG4iXX0= */"

/***/ }),

/***/ "./src/app/consumidor/consumidor.component.ts":
/*!****************************************************!*\
  !*** ./src/app/consumidor/consumidor.component.ts ***!
  \****************************************************/
/*! exports provided: ConsumidorComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ConsumidorComponent", function() { return ConsumidorComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _shared_paises_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shared/paises.service */ "./src/app/shared/paises.service.ts");
/* harmony import */ var _shared_motivos_queja_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/motivos-queja.service */ "./src/app/shared/motivos-queja.service.ts");
/* harmony import */ var _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/departamentos.service */ "./src/app/shared/departamentos.service.ts");
/* harmony import */ var _shared_sedes_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../shared/sedes.service */ "./src/app/shared/sedes.service.ts");
/* harmony import */ var _shared_etnias_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../shared/etnias.service */ "./src/app/shared/etnias.service.ts");
/* harmony import */ var _shared_consumidor_model__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../shared/consumidor.model */ "./src/app/shared/consumidor.model.ts");
/* harmony import */ var _shared_municipios_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../shared/municipios.service */ "./src/app/shared/municipios.service.ts");
/* harmony import */ var _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ../shared/consumidores.service */ "./src/app/shared/consumidores.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_quejas_service__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ../shared/quejas.service */ "./src/app/shared/quejas.service.ts");
/* harmony import */ var _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ../shared/submit-form.service */ "./src/app/shared/submit-form.service.ts");
/* harmony import */ var _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ../shared/seguridad.service */ "./src/app/shared/seguridad.service.ts");















//import { WINDOW } from "../shared/window.service";
var ConsumidorComponent = /** @class */ (function () {
    function ConsumidorComponent(router, paisesService, motivosQuejaService, departamentosService, municipiosService, etniasService, sedesService, consumidoresService, quejasService, _submitFormService, _seguridadService, _route
    //,@Inject(WINDOW) public window: Window
    ) {
        this.router = router;
        this.paisesService = paisesService;
        this.motivosQuejaService = motivosQuejaService;
        this.departamentosService = departamentosService;
        this.municipiosService = municipiosService;
        this.etniasService = etniasService;
        this.sedesService = sedesService;
        this.consumidoresService = consumidoresService;
        this.quejasService = quejasService;
        this._submitFormService = _submitFormService;
        this._seguridadService = _seguridadService;
        this._route = _route;
        this.existingMode = false;
        this.mjsError = '';
        this.tipocon = '';
        this.str_usuario = '';
        //datos iniciales
        this.dato = '';
        this.vid = '';
        this.vqueja = '';
        this.continuar = '1';
        this.existeLink = '1';
        this.str_queja = '';
        //this.str_usuario="Usuario: "+this._submitFormService.Get_username();
        //console.info(this._route.snapshot.paramMap.get('dato'),this._route.snapshot.paramMap.get('id'));
        //console.info("constructor");
        //console.log(window);
    }
    ConsumidorComponent.prototype.ngOnInit = function () {
        //console.info("ngOnInit");
        //if (!this._submitFormService.Get_username()) {
        //  this.router.navigate(['/Login']);
        //}
        var _this = this;
        this._route.params.subscribe(function (params) {
            _this.dato = params.dato;
            _this.vid = params.id;
            _this.vqueja = params.queja;
        });
        //verificar parametros
        //console.info("--->>",this.dato,this.vid,this.vqueja);
        if (this.dato == 'externo' || this.dato == 'interno' || this.dato == 'presencial') {
            if (this.dato == 'externo' && this.vid != '') {
                //console.info(this.dato,this.vid,this.vqueja);
                this.quejasService.vdato = this.dato;
                this.quejasService.vid = this.vid;
                this.findByToken();
            }
            else {
                if ((this.dato == 'interno' || this.dato == 'presencial') && this.vid != '' && this.vqueja != '') {
                    //console.info(this.dato,this.vid,this.vqueja);
                    this.quejasService.vdato = this.dato;
                    this.quejasService.vid = this.vid;
                    this.quejasService.vqueja = this.vqueja;
                    this.findByQuejaById();
                }
                else {
                    alert('No puede ingresar al sistema, favor verifique.');
                    this.continuar = '0';
                    return;
                }
            }
        }
        else {
            alert('No puede ingresar al sistema, favor verifique.');
            this.continuar = '0';
            return;
        }
        //console.info("continuar");
        /*
        console.info("....",this.existeLink);
                if (this.existeLink == "0")  {
                    alert("Su acceso al sistema fue denegado, por favor verifique.");
                this.continuar = '0'
                return;
                }*/
        // cargar paises
        this.paisesSubscription = this.paisesService.fetchData().subscribe(function (res) {
            _this.paises = res.value;
        });
        // cargar motivos de queja
        this.motivosQuejaSubscription = this.motivosQuejaService.fetchData().subscribe(function (res) {
            _this.motivosQueja = res.value;
        });
        // cargar departamentos
        this.departamentosSubscription = this.departamentosService.fetchData().subscribe(function (res) {
            _this.departamentos = res.value;
        });
        // cargar etnias
        this.etniasSubscription = this.etniasService.fetchData().subscribe(function (res) {
            _this.etnias = res.value;
        });
        //cargar sedes
        this.sedesSubscription = this.sedesService.fetchData().subscribe(function (res) {
            _this.sedes = res.value;
        });
        // listener cuando finaliza la operacion de creacion
        this.consumidorOperationSubscription = this.consumidoresService.operation.subscribe(function (consumidor) {
            _this.nextStep(consumidor);
        });
        this.initConsumidorForm(null);
    };
    ConsumidorComponent.prototype.initConsumidorForm = function (consumidor) {
        //console.info("initConsumidorForm");
        var au = false;
        if (consumidor) {
            if (consumidor.autorizoPublicar != null && consumidor.autorizoPublicar != undefined) {
                if (consumidor.autorizoPublicar == '1') {
                    au = true;
                }
            }
        }
        var nac = (consumidor ? (consumidor.nacionalidad == 1 ? 'G' : 'E') : 'G');
        this.consumidorForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'idConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.idConsumidor : '0'),
            'nacionalidad': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](nac),
            'tipoDocumento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.tipoDocumento : ''),
            'tipoConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.tipoConsumidor : '6'),
            'documentoIdentificacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.documentoIdentificacion : ''),
            'pais': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nacionalidad : 1),
            'representanteLegal': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.representanteLegal : ''),
            'nitConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nitConsumidor : ''),
            'nombreEmpresa': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombreEmpresa : ''),
            'razonSocial': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.razonSocial : ''),
            'nombre1': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre1 : ''),
            'nombre2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre2 : ''),
            'nombre3': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre3 : ''),
            'apellido1': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellido1 : ''),
            'apellido2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellido2 : ''),
            'apellidoCasada': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellidoCasada : ''),
            'genero': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.genero : ''),
            'etnia': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.idEtnia : ''),
            'motivoQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.idMotivoQueja : ''),
            'codigoDepartamento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.codigoDepartamento : ''),
            'codigoMunicipio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            //'direccionAvenidaCalle': new FormControl(consumidor ? consumidor.direccionCalle : ''), // , Validators.required),
            //'tipoDireccion': new FormControl(''),
            //'direccionNumero': new FormControl(consumidor ? consumidor.direccionAvenida : ''), // , Validators.required),
            'direccionZona': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.direccionZona : ''),
            'direccionDetalle': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.direccionDetalle : ''),
            'sedeDiacoCercana': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'telefonoCelular': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefonoCelular : ''),
            'telefonoDomicilio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefonoDomicilio : ''),
            'telefonoReferencia': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefonoReferencia : ''),
            'email': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email : ''),
            'emailConfirmation': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email : ''),
            'email2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email2 : ''),
            'email2Confirmation': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email2 : ''),
            'iCheck': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? au : false),
            'habilitadoNotificacionElectronica': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.habilitadoNotificacionElectronica : '')
        });
        if (consumidor) {
            // seleccionar departamento
            this.onDepartamentoChanged();
            this.consumidorForm.patchValue({
                'codigoMunicipio': consumidor.codigoMunicipio
            });
            // seleccionar municipio
            this.onMunicipioChanged();
            this.consumidorForm.patchValue({
                'codigoMunicipio': consumidor.codigoMunicipio
            });
            //pais
            this.consumidorForm.patchValue({
                'pais': consumidor.pais
            });
            //genero
            this.consumidorForm.patchValue({
                'genero': consumidor.genero
            });
            //etnia
            this.consumidorForm.patchValue({
                'etnia': consumidor.idEtnia
            });
            //queja
            this.consumidorForm.patchValue({
                'motivoQueja': (consumidor.motivoQueja ? consumidor.motivoQueja : consumidor.idMotivoQueja)
            });
            //sedeDiacoCercana
            this.consumidorForm.patchValue({
                'sedeDiacoCercana': consumidor.sedeDiacoCercana
            });
        }
    };
    ConsumidorComponent.prototype.onDocumentoIdentificacionChanged = function (tipo) {
        var _this = this;
        if (tipo == 'documento') {
            this.tipocon = this.consumidorForm.value.documentoIdentificacion;
        }
        else {
            this.tipocon = this.consumidorForm.value.nitConsumidor;
        }
        this.consumidoresService.fetchData(tipo, this.tipocon).subscribe(function (response) {
            if (response.value) {
                // inicializar formulario con valores predeterminados
                _this.existingMode = true;
                _this.existingConsumidor = response.value;
                _this.initConsumidorForm(response.value);
            }
            else {
                _this.existingMode = false;
                _this.existingConsumidor = null;
            }
        });
    };
    ConsumidorComponent.prototype.onDepartamentoChanged = function () {
        var _this = this;
        // cargar municipios
        this.municipiosSubscription = this.departamentosService.fetchMunicipios(this.consumidorForm.value.codigoDepartamento).subscribe(function (res) {
            _this.municipios = res.value;
        });
    };
    ConsumidorComponent.prototype.onMunicipioChanged = function () {
        // cargar sedes
        /*
        this.municipiosSubscription = this.municipiosService.fetchSedes(this.consumidorForm.value.codigoMunicipio).subscribe(
          res => {
            this.sedes = res.value;
          }
        );
        */
    };
    ConsumidorComponent.prototype.valOnSummit = function () {
    };
    ConsumidorComponent.prototype.onSubmit = function () {
        //console.info("onSumit");
        // validar email y emailConfirmation
        var email = this.consumidorForm.value.email;
        var emailConfirmation = this.consumidorForm.value.emailConfirmation;
        var nacionalidad = this.consumidorForm.value.nacionalidad;
        var pais = this.consumidorForm.value.pais;
        var documentoIdentificacion = this.consumidorForm.value.documentoIdentificacion;
        var representanteLegal = this.consumidorForm.value.representanteLegal;
        var tipoConsumidor = this.consumidorForm.value.tipoConsumidor;
        var nombre1 = this.consumidorForm.value.nombre1;
        var apellido1 = this.consumidorForm.value.apellido1;
        var genero = this.consumidorForm.value.genero;
        var etnia = this.consumidorForm.value.etnia;
        var nombreEmpresa = this.consumidorForm.value.nombreEmpresa;
        var razonSocial = this.consumidorForm.value.razonSocial;
        var nitConsumidor = this.consumidorForm.value.nitConsumidor;
        var motivoQueja = this.consumidorForm.value.motivoQueja;
        var codigoDepartamento = this.consumidorForm.value.codigoDepartamento;
        var codigoMunicipio = this.consumidorForm.value.codigoMunicipio;
        var direccionDetalle = this.consumidorForm.value.direccionDetalle;
        var direccionZona = this.consumidorForm.value.direccionZona;
        var sedeDiacoCercana = this.consumidorForm.value.sedeDiacoCercana;
        var telefonoCelular = this.consumidorForm.value.telefonoCelular;
        var iCheck_ = this.consumidorForm.value.iCheck;
        var tipoDireccion = this.consumidorForm.value.tipoDireccion;
        var consumidor = new _shared_consumidor_model__WEBPACK_IMPORTED_MODULE_8__["Consumidor"]();
        if (nacionalidad == 'E') {
            consumidor.tipoDocumento = (this.consumidorForm.value.tipoDocumento == 'G' ? 1 : 2);
            if (documentoIdentificacion == '' || documentoIdentificacion == undefined) {
                this.mjsError += '- Ingrese documento de identificacion.  ' + '\r\n';
            }
            else {
                consumidor.documentoIdentificacion = this.consumidorForm.value.documentoIdentificacion;
            }
            if (pais == '' || pais == undefined) {
                this.mjsError += '- Seleccione pais.  ' + '\r\n';
            }
            else {
                consumidor.pais = this.consumidorForm.value.pais;
                consumidor.nacionalidad = this.consumidorForm.value.pais; //(this.consumidorForm.value.nacionalidad == "G"?1:2);
            }
        }
        else {
            consumidor.nacionalidad = (this.consumidorForm.value.nacionalidad == 'G' ? 1 : 2);
            consumidor.tipoDocumento = (this.consumidorForm.value.tipoDocumento == 'G' ? 1 : 2);
            if (tipoConsumidor == '6') {
                consumidor.tipoConsumidor = '6';
                if (documentoIdentificacion == '' || documentoIdentificacion == undefined) {
                    this.mjsError += '- Ingrese documento de identificacion.  ' + '\r\n';
                }
                else {
                    consumidor.documentoIdentificacion = this.consumidorForm.value.documentoIdentificacion;
                }
            }
            else {
                consumidor.tipoConsumidor = '7';
                if (representanteLegal == '' || representanteLegal == undefined) {
                    this.mjsError += '- Ingrese representante legal.  ' + '\r\n';
                }
                else {
                    consumidor.representanteLegal = this.consumidorForm.value.representanteLegal;
                }
                if (documentoIdentificacion == '' || documentoIdentificacion == undefined) {
                }
                else {
                    consumidor.documentoIdentificacion = this.consumidorForm.value.documentoIdentificacion;
                }
            }
        }
        //tipoConsumidor:  7 juridico, 6 individual
        if (tipoConsumidor == '6') {
            consumidor.tipoConsumidor = '6';
            if (nombre1 == '' || nombre1 == undefined) {
                this.mjsError += '- Ingrese primer nombre.  ' + '\r\n';
            }
            else {
                consumidor.nombre1 = this.consumidorForm.value.nombre1;
            }
            if (apellido1 == '' || apellido1 == undefined) {
                this.mjsError += '- Ingrese primer apellido.  ' + '\r\n';
            }
            else {
                consumidor.apellido1 = this.consumidorForm.value.apellido1;
            }
            if (genero == '' || genero == undefined) {
                this.mjsError += '- Seleccione genero.  ' + '\r\n';
            }
            else {
                consumidor.genero = this.consumidorForm.value.genero;
            }
            if (etnia > 0 || etnia != undefined) {
                consumidor.etnia = this.consumidorForm.value.etnia;
            }
            else {
                this.mjsError += '- Seccione etnia.  ' + '\r\n';
            }
        }
        else {
            consumidor.tipoConsumidor = '7';
            if (nombreEmpresa == '' || nombreEmpresa == undefined) {
                this.mjsError += '- Ingrese nombre de la empresa.  ' + '\r\n';
            }
            else {
                consumidor.nombreEmpresa = this.consumidorForm.value.nombreEmpresa;
            }
            if (razonSocial == '' || razonSocial == undefined) {
                this.mjsError += '- Ingrese razon social.  ' + '\r\n';
            }
            else {
                consumidor.razonSocial = this.consumidorForm.value.razonSocial;
            }
        }
        /*         if (nitConsumidor == '' || nitConsumidor == undefined) {
                    this.mjsError += '- Ingrese su NIT.  ' + '\r\n';
                } else {*/
        consumidor.nitConsumidor = this.consumidorForm.value.nitConsumidor;
        if (motivoQueja == '' || motivoQueja == null || motivoQueja == undefined) {
            this.mjsError += '- Seleccione motivo de queja.  ' + '\r\n';
        }
        else {
            consumidor.motivoQueja = this.consumidorForm.value.motivoQueja;
        }
        //console.info("Departamento:  ",codigoDepartamento);
        if (codigoDepartamento == '' || codigoDepartamento == null || codigoDepartamento == undefined) {
            this.mjsError += '- Seleccione departamento.  ' + '\r\n';
        }
        else {
            consumidor.codigoDepartamento = this.consumidorForm.value.codigoDepartamento;
        }
        //console.info("Municipio ",codigoMunicipio);
        if (codigoMunicipio == '' || codigoMunicipio == null || codigoMunicipio == undefined) {
            this.mjsError += '- Seleccione municipio.  ' + '\r\n';
        }
        else {
            consumidor.codigoMunicipio = this.consumidorForm.value.codigoMunicipio;
        }
        if (direccionDetalle == '' || direccionDetalle == undefined) {
            this.mjsError += '- Ingrese su dirección.  ' + this.consumidorForm.value.direccionDetalle + '\r\n';
        }
        else {
            consumidor.direccionDetalle = this.consumidorForm.value.direccionDetalle;
        }
        if (direccionZona == '' || direccionZona == undefined) {
            this.mjsError += '- Ingrese su Zona.  ' + this.consumidorForm.value.direccionZona + '\r\n';
        }
        else {
            consumidor.direccionZona = this.consumidorForm.value.direccionZona;
        }
        //alert(sedeDiacoCercana);
        if (sedeDiacoCercana == '' || sedeDiacoCercana == null || sedeDiacoCercana == undefined) {
            this.mjsError += '- Selecciones sede.  ' + '\r\n';
        }
        else {
            consumidor.sedeDiacoCercana = this.consumidorForm.value.sedeDiacoCercana;
        }
        if (telefonoCelular == '' || telefonoCelular == undefined) {
            this.mjsError += '- Ingrese su numero de telefono celular.  ' + this.consumidorForm.value.telefonoCelular + '\r\n';
        }
        else {
            consumidor.telefonoCelular = this.consumidorForm.value.telefonoCelular;
        }
        //if (iCheck == "") {
        //	this.mjsError +=  "- Verifique su autorizacion.  " + "\r\n";
        //} else {
        if (iCheck_) {
            consumidor.autorizoPublicar = '1';
        }
        else {
            consumidor.autorizoPublicar = '0';
        }
        //console.info("consumidor....",iCheck_,",  ",consumidor.autorizoPublicar,"...",consumidor);
        //}
        if (email == '' || email == undefined) {
            this.mjsError += '- Ingrese su correo electronico.  ' + '\r\n';
        }
        else {
            if (email !== emailConfirmation) {
                // TODO: utilizar libreria para mostrar alertas
                //alert('Los emails principales no coinciden');
                this.mjsError += '- Los emails principales no coinciden ' + '\r\n';
                //return false;
            }
            else {
                consumidor.email = this.consumidorForm.value.email;
            }
        }
        // validar email2 y email2Confirmation
        var email2 = this.consumidorForm.value.email2;
        var email2Confirmation = this.consumidorForm.value.email2Confirmation;
        if (email2) {
            if (email2 !== email2Confirmation) {
                //alert('Los emails secundarios no coinciden');
                this.mjsError += '- Los emails secundarios no coinciden ' + '\r\n';
                //return false;
            }
            else {
                consumidor.email2 = this.consumidorForm.value.email2;
            }
        }
        if (this.mjsError == '') {
        }
        else {
            alert(this.mjsError);
            this.mjsError = '';
            return false;
        }
        //consumidor.tipoConsumidor = (this.consumidorForm.value.tipoConsumidor=="6"?"6":"7");
        if (this.consumidorForm.value.nombre2 != '') {
            consumidor.nombre2 = this.consumidorForm.value.nombre2;
        }
        if (this.consumidorForm.value.nombre3 != '') {
            consumidor.nombre3 = this.consumidorForm.value.nombre3;
        }
        if (this.consumidorForm.value.apellido2 != '') {
            consumidor.apellido2 = this.consumidorForm.value.apellido2;
        }
        if (this.consumidorForm.value.apellidoCasada != '') {
            consumidor.apellidoCasada = this.consumidorForm.value.apellidoCasada;
        }
        if (this.consumidorForm.value.telefonoDomicilio != '') {
            consumidor.telefonoDomicilio = this.consumidorForm.value.telefonoDomicilio;
        }
        if (this.consumidorForm.value.telefonoReferencia != '') {
            consumidor.telefonoReferencia = this.consumidorForm.value.telefonoReferencia;
        }
        if (this.consumidorForm.value.email2 != '') {
            consumidor.email2 = this.consumidorForm.value.email2;
        }
        /*

        */
        //console.info("consumidor....",consumidor);
        if (this.existingMode) {
            //actualiza consumidor
            //consumidor.usuarioModifico = this.str_usuario;
            console.log('valor que trae la variable consumidor 2', consumidor);
            this.consumidoresService.createConsumidor(consumidor);
            this.nextStep(this.existingConsumidor);
        }
        else {
            //consumidor.usuarioAdiciono = this.str_usuario;
            console.log('valor que trae la variable consumidor', consumidor);
            this.consumidoresService.createConsumidor(consumidor);
        }
    };
    ConsumidorComponent.prototype.nextStep = function (consumidor) {
        this.consumidorForm.reset();
        // guardar el consumidor en sesion
        this.quejasService.consumidor = consumidor;
        // ir a pantalla de proveedor
        this.router.navigate(['/proveedor']);
    };
    ConsumidorComponent.prototype.CerrarSesion = function () {
        var _this = this;
        var loc_token = this._submitFormService.Get_token();
        //console.log(loc_token);
        if (loc_token == '') {
            this._seguridadService.RedireccionarLogin();
        }
        this._seguridadService.Logout(loc_token).subscribe(function (retvalue) {
            //console.log('cerrar sesion',retvalue);
            _this._seguridadService.RedireccionarLogin();
        }, function (error) {
            _this._seguridadService.RedireccionarLogin();
        });
    };
    /***
     * obtiene los datos de la queja externa por token
     ****/
    ConsumidorComponent.prototype.findByToken = function () {
        //console.info("findByToken init ",this.dato, this.vid);
        var _this = this;
        this.quejasService.fetchDataByToken(this.vid, this.dato).subscribe(function (response) {
            var tempstr = response.value;
            if (tempstr != null || tempstr != undefined) {
                //console.info("existe",tempstr);
                _this.quejasService.initQuejat(tempstr);
                if (_this.quejasService.initQuejat != null) {
                    _this.continuar = '1';
                    _this.initConsumidorForm(null);
                    _this.findByTokenConsumidor();
                }
                else {
                    _this.continuar = '0';
                }
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                _this.continuar = '0';
                alert('Su acceso al sistema fue denegado, por favor verifique.');
            }
        });
        //console.info("findByToken end ",this.quejasService.vdato, this.quejasService.vid);
    };
    /***
     * obtiene los datos del consumidor
     ***/
    ConsumidorComponent.prototype.findByTokenConsumidor = function () {
        var _this = this;
        var queja = this.quejasService.quejat;
        if (queja) {
            this.str_queja = '- Queja No. ' + queja.noQueja + '-' + queja.anio;
        }
        //console.info("findByTokenConsumidor init ",queja.idConsumidor);
        this.consumidoresService.fetchDataByTokenConsumidor(queja.idConsumidor).subscribe(function (response) {
            var tempstr = response.value;
            if (tempstr != null || tempstr != undefined) {
                //console.info("existe",tempstr);
                _this.initConsumidorForm(tempstr);
                _this.initConsumidorForm = tempstr;
                _this.quejasService.vexisteConsumidor = '1';
                _this.continuar = '1';
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                _this.continuar = '0';
                _this.quejasService.vexisteConsumidor = '0';
                _this.continuar = '1';
                alert('Su acceso al sistema fue denegado, por favor verifique.');
            }
        });
        //console.info("findByTokenConsumidor end ",this.quejasService.quejat);
    };
    /***
     * obtiene los datoa de la queja
     ***/
    ConsumidorComponent.prototype.findByQuejaById = function () {
        var _this = this;
        //console.info("findByQuejaById ini ",this.dato, this.vid, this.vqueja);
        this.quejasService.fetchDataQuejaById(this.dato, this.vid, this.vqueja).subscribe(function (response) {
            var tempstr = response.value;
            //console.info("findByQuejaById consumidor ",tempstr);
            if (tempstr != null || tempstr != undefined) {
                //console.info("existe",tempstr);
                _this.quejasService.initQuejat(tempstr);
                if (_this.quejasService.initQuejat != null) {
                    _this.continuar = '1';
                    _this.initConsumidorForm(null);
                    _this.findByTokenConsumidor();
                }
                else {
                    _this.continuar = '0';
                }
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                _this.continuar = '0';
                alert('Su acceso al sistema fue denegado, por favor verifique.');
            }
        });
        var queja = this.quejasService.quejat;
        if (queja) {
            this.str_queja = '- Queja No. ' + queja.noQueja + "-" + queja.anio;
        }
        //console.info("findByQuejaById end ",this.quejasService.quejat);
    };
    ConsumidorComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-consumidor',
            template: __webpack_require__(/*! ./consumidor.component.html */ "./src/app/consumidor/consumidor.component.html"),
            styles: [__webpack_require__(/*! ./consumidor.component.scss */ "./src/app/consumidor/consumidor.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_11__["Router"],
            _shared_paises_service__WEBPACK_IMPORTED_MODULE_3__["PaisesService"],
            _shared_motivos_queja_service__WEBPACK_IMPORTED_MODULE_4__["MotivosQuejaService"],
            _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_5__["DepartamentosService"],
            _shared_municipios_service__WEBPACK_IMPORTED_MODULE_9__["MunicipiosService"],
            _shared_etnias_service__WEBPACK_IMPORTED_MODULE_7__["EtniasService"],
            _shared_sedes_service__WEBPACK_IMPORTED_MODULE_6__["SedesService"],
            _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_10__["ConsumidoresService"],
            _shared_quejas_service__WEBPACK_IMPORTED_MODULE_12__["QuejasService"],
            _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_13__["SubmitFormService"],
            _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_14__["SeguridadService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_11__["ActivatedRoute"]
            //,@Inject(WINDOW) public window: Window
        ])
    ], ConsumidorComponent);
    return ConsumidorComponent;
}());



/***/ }),

/***/ "./src/app/pquejaini/pquejaini.component.html":
/*!****************************************************!*\
  !*** ./src/app/pquejaini/pquejaini.component.html ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n<head>\n\n</head>\n<body>\n    \n\t<div class=\"container\">\n\t\n\t\n\t<!--img src=\"imagen-grd2.png\" class=\"center\"/-->\n\t\t<div class=\"row\">\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t<img src=\"/assets/img/logo-diaco-ant.jpg\" class=\"headerimg\" alt=\"\">\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t</div>\n\t</div>\n\n<div class=\"container\" *ngIf=\"continuar=='1'\">\n\n \n  \n  <!--div class=\"row\">\n    <h2></h2>\n  </div-->\n  <div class=\"row\">\n    <div class=\"col-lg-12\">\n      <form [formGroup]=\"quejaForm\" (ngSubmit)=\"onSubmit()\" novalidate>\n\t\t<div class=\"form-group row\">\n          <label for=\"\" class=\"col-lg-3 col-form-label\">Datos Consumidor</label>\n\t\t   \n\t\t<div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t  \n\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\n\t\t\t\t<label for=\"et1\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t\t\t\t<label for=\"dpiPasaporte\" class=\"col-lg-2 col-form-label\" >DPI/pasaporte</label>\n          <div class=\"col-lg-3\">\n            <input\n              id=\"dpiPasaporte\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su DPI o Pasaporte\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"dpiPasaporte\"\n\t\t\t  (change)=\"onDocumentoIdentificacionChanged()\"\n\t\t\t  placeholder=\"Documento\"\n\t\t\t  maxLength=\"50\"\n\t\t\t  \n\t\t\t  >\n\t\t\t\t<div *ngIf=\"quejaForm.get('dpiPasaporte').errors && quejaForm.get('dpiPasaporte').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('dpiPasaporte').hasError('required')\" [ngStyle]=\"{color: 'red'}\">Ingrese su DPI o Pasaporte</p>\n\t\t\t  </div>\n\t\t\t  <div *ngIf=\"quejaForm.get('dpiPasaporte').errors && quejaForm.get('dpiPasaporte').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('dpiPasaporte').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">DPI solo admite 50 caracteres</p>\n\t\t\t  </div>\n          </div>\n\t\t\t\t  <label for=\"et2\" [ngStyle]=\"{color: 'red'}\" class=\"col-lg-1 col-form-label\"></label>\n\t\t\t\t  <label for=\"et2\" [ngStyle]=\"{color: 'red'}\" >(*)</label>\n\t\t\t\t  <label for=\"nombre\" class=\"col-lg-2 col-form-label\">Nombre(s)</label>\n\t\t\t\t  <div class=\"col-lg-3\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombre\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  formControlName=\"nombre\" \n\t\t\t\t\t  placeholder=\"Nombre(s)\"\n\t\t\t\t\t  maxLength=\"300\"\n\t\t\t\t\t  required>\n\t\t\t\t\t  <div *ngIf=\"quejaForm.get('nombre').errors && quejaForm.get('nombre').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('nombre').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Nombre solo admite 300 caracteres</p>\n\t\t\t  </div>\n\t\t\t\t\t  \n\t\t\t\t  </div>\n\t\t\t\t  \n\t\t\t\t  \n\t\t\t\t</div>\n\t\t\t\t\n\t\t\t\t\n\t\n\t\n\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\n\t\t\t\t<label for=\"et3\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t\t\t\t  <label for=\"apellido\" class=\"col-lg-2 col-form-label\">Apellido(s)</label>\n\t\t\t\t  <div class=\"col-lg-3\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"apellido\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su apellido\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  formControlName=\"apellido\" \n\t\t\t\t\t  placeholder=\"Apellido(s)\"\n\t\t\t\t\t  maxLength=\"300\"\n\t\t\t\t\t  required>\n\t\t\t\t\t  <div *ngIf=\"quejaForm.get('apellido').errors && quejaForm.get('apellido').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('apellido').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Apellido solo admite 300 caracteres</p>\n\t\t\t  </div>\n\t\t\t\t  </div>\n\t\t\t\t\t <label for=\"et2\" [ngStyle]=\"{color: 'red'}\" class=\"col-lg-1 col-form-label\"></label>\n\t\t <label for=\"et4\" [ngStyle]=\"{color: 'red'}\">(*)</label>\t\t\n          <label for=\"telefono\" class=\"col-lg-2 col-form-label\">Teléfono</label>\n          <div class=\"col-lg-3\">\n            <input\n              id=\"telefono\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su Número de teléfono\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"telefono\"\n\t\t\t  placeholder=\"Teléfono\"\n\t\t\t   pattern=\"^[0-9]{8}$\"\n\t\t\t  required>\n\t\t\t  <div *ngIf=\"quejaForm.get('telefono').errors && quejaForm.get('telefono').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('telefono').hasError('pattern')\" [ngStyle]=\"{color: 'red'}\" >Error en numero de telefono, solo admite números</p>\n\t\t\t  </div>\n          </div>\n\t\t  \n\t\t  \n\t\t  </div>\n\t\t  <div class=\"form-group row\">\n\t\t  <label for=\"et5\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t\t  <label for=\"correo\" class=\"col-lg-2 col-form-label\">Correo Electrónico</label>\n          <div class=\"col-lg-3\">\n            <input\n              id=\"correo\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su correo electrónico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"correo\"\n\t\t\t  placeholder=\"Correo\"\n\t\t\t  pattern=\"^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$\"\n\t\t\t  required>\n\t\t\t  <div *ngIf=\"quejaForm.get('correo').errors && quejaForm.get('correo').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('correo').hasError('pattern')\" [ngStyle]=\"{color: 'red'}\">Error en formato de correo</p>\n\t\t\t  </div>\n          </div>\n\t\t  \n        </div>\n\t\t\t\t\n\t\t\t\n\t\t<div class=\"form-group row\">\n\t\t  <label for=\"et6\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n          <label for=\"detalleQueja\" class=\"col-lg-2 col-form-label\">Detalle Queja (sea breve y conciso)</label>\n          <div class=\"col-lg-3\">\n            <textarea\n              id=\"detalleQueja\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su queja\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"detalleQueja\"\n\t\t\t  maxLength=\"1000\"\n\t\t\t  required\n\t\t\t  (keyup)=\"onKey($event)\"\n\t\t\t  ></textarea>\n\t\t\t  <small class=\"text-muted\">{{contador}} de 1000 caracteres.</small>\n\t\t\t  <div *ngIf=\"quejaForm.get('detalleQueja').errors && quejaForm.get('detalleQueja').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('detalleQueja').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Detalle de queda solo admite 250 caracteres</p>\n\t\t\t  </div>\t  \n\t\t </div>\n         <label for=\"et7\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n          <label for=\"solicitaQue\" class=\"col-lg-2 col-form-label\">Petición Queja (sea breve y conciso)</label>\n          <div class=\"col-lg-3\">\n            <textarea\n              id=\"solicitaQue\"\n\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su solicitud de la queja ingresada.\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"solicitaQue\"\n\t\t\t  maxLength=\"250\"\n\t\t\t  required\n\t\t\t  (keyup)=\"onKey1($event)\"\n\t\t\t  ></textarea>\n\t\t\t  <small class=\"text-muted\">{{contador1}} de 250 caracteres.</small>\n\t\t\t  <div *ngIf=\"quejaForm.get('solicitaQue').errors && quejaForm.get('solicitaQue').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('solicitaQue').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Solicitud de queja solo admite 250 caracteres</p>\n\t\t\t  </div>\n          </div>\n        </div>\n\t\t\t\t\n\t\t\t  </div>\n\t\t\t</div>\n\t\t</div>\n\t\t</div>\n\t\t\n\t\t\n\t\t\t \n\t\t\t\n\t\t\t  \n\t\t<div class=\"form-group row\">\n          <label for=\"\" class=\"col-lg-12 col-form-label\">Datos Proveedor (Ingrese el NIT sin guión)</label>\n\t\t\t<div class=\"col-lg-12\">\n\t\t\t\t<div class=\"card\">\n\t\t\t\t\t<div class=\"card-body\">\n\n\t\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\t\t<span>Seleccionar proveedor existente: </span>\n\t\t\t\t\t\t<div class=\"col-lg-1 ml-3\">\n\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary row button\" (click)=\"onProveedorChanged()\">Buscar</button>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<!-- <span>de lo contrario ingrese los siguientes campos: </span> -->\n\t\t\t\t\t</div>\n\t\t\t\t\t\n\t\t\t\t\t<div class=\"form-group row\" *ngIf=\"mostrarCamposProveedor\">\n\t\t\t\t\t\t<!-- <label for=\"et8\" [ngStyle]=\"{color: 'red'}\">(*)</label> -->\n\t\t\t\t\t\t<label for=\"nitProveedor\" class=\"col-lg-1 col-form-label\">NIT</label>\n\t\t\t\t\t\t<div class=\"col-lg-2\">\n\t\t\t\t\t\t\t<input\n\t\t\t\t\t\t\tid=\"nitProveedor\"\n\t\t\t\t\t\t\ttype=\"text\"\n\t\t\t\t\t\t\tclass=\"form-control\"\n\t\t\t\t\t\t\tmatTooltipPosition=\"after\"\n\t\t\t\t\t\t\tmatTooltip=\"Ingrese NIT del proveedor\"\n\t\t\t\t\t\t\tmatTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t\tformControlName=\"nitProveedor\"\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t\tplaceholder=\"NIT\"\n\t\t\t\t\t\t\tpattern=\"^[0-9]+([0-9]|[K]|[k]){1}$\"\n\t\t\t\t\t\t\t>\n\t\t\t\t\t\t\t<div *ngIf=\"quejaForm.get('nitProveedor').errors && quejaForm.get('nitProveedor').dirty\">\n\t\t\t\t\t\t\t\t<p *ngIf=\"quejaForm.get('nitProveedor').hasError('pattern')\" [ngStyle]=\"{color: 'red'}\">Error NIT incorrecto</p>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\n\t\t\t\t\t\t\n\t\t\t\t\t\t\n\t\t\t\t\t\t<label for=\"et2\" [ngStyle]=\"{color: 'red'}\" class=\"col-lg-1 col-form-label\"></label>\n\t\t\t\t\t\t<!-- <label for=\"et9\" [ngStyle]=\"{color: 'red'}\">(*)</label> -->\n\t\t\t\t\t\t<label for=\"ubicacion\" class=\"col-lg-2 col-form-label\">Ubicación</label>\n\t\t\t\t\t\t<div class=\"col-lg-3\">\n\t\t\t\t\t\t<input\n\t\t\t\t\t\t\tid=\"ubicacion\"\n\t\t\t\t\t\t\ttype=\"text\"\n\t\t\t\t\t\t\tclass=\"form-control\"\n\t\t\t\t\t\t\tmatTooltipPosition=\"after\"\n\t\t\t\t\t\t\tmatTooltip=\"Ingrese ubicacion\"\n\t\t\t\t\t\t\tmatTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t\tformControlName=\"ubicacion\"\n\t\t\t\t\t\t\tplaceholder=\"Ubicación\"\n\t\t\t\t\t\t>\n\t\t\t\t\t\t\t<div *ngIf=\"quejaForm.get('dpiPasaporte').errors && quejaForm.get('dpiPasaporte').dirty\">\n\t\t\t\t\t\t\t\t<p *ngIf=\"quejaForm.get('dpiPasaporte').hasError('required')\" [ngStyle]=\"{color: 'red'}\">Ingrese su ubicacion</p>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\n\t\t\t\t\t<div class=\"form-group row\" *ngIf=\"mostrarCamposProveedor\">\n\t\t\t\t\t\t<!-- <label for=\"et8\" [ngStyle]=\"{color: 'red'}\">(*)</label> -->\n\t\t\t\t\t\t<label for=\"serieNumeroFactura\" class=\"col-lg-4 col-form-label\">Número de Factura o Contrato</label>\n\t\t\t\t\t\t<div class=\"col-lg-4\">\n\t\t\t\t\t\t\t<input\n\t\t\t\t\t\t\tid=\"serieNumeroFactura\"\n\t\t\t\t\t\t\ttype=\"text\"\n\t\t\t\t\t\t\tclass=\"form-control\"\n\t\t\t\t\t\t\tmatTooltipPosition=\"after\"\n\t\t\t\t\t\t\tmatTooltip=\"Ingrese la Serie guión y número de Factura Ejemplo: A-25885\"\n\t\t\t\t\t\t\t[(ngModel)]=\"serieNumeroFactura\"\n\t\t\t\t\t\t\tmatTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t\t(change)=\"onFacturaChanged()\"\n\t\t\t\t\t\t\tformControlName=\"serieNumeroFactura\"\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t\tplaceholder=\"Serie-Número de Factura / Contrato\"\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t\tminlength=\"1\"\n\t\t\t\t\t\t\t\n\n\t\t\t\t\t\t\t>\n\t\t\t\t\t\t\t<!-- pattern=\"^[A-Z]{1,3}[0-9]?\\-[0-9]{1,9}$\"  -->\n\t\t\t\t\t\t\t<div *ngIf=\"quejaForm.get('serieNumeroFactura').errors && quejaForm.get('serieNumeroFactura').dirty\">\n\t\t\t\t\t\t\t\t<p *ngIf=\"quejaForm.get('serieNumeroFactura').hasError('minlength')\" [ngStyle]=\"{color: 'red'}\">Debe ser Serie-Número en el caso de factura Ejemplo: A-2555 o contrato</p>\n\t\t\t\t\t\t\t</div>\n\n\t\t\t\t\t\t\t<div *ngIf=\"factRepetida\">\n\t\t\t\t\t\t\t\t<p [ngStyle]=\"{color: 'red'}\">El número de factura ó contrato ya existe por lo que no se puede ingresar la queja.</p>\n\n\t\t\t\t\t\t\t</div>\n\n\t\t\t\t\t\t\t<div *ngIf=\"factNoRepetida\">\n\t\t\t\t\t\t\t\t<p [ngStyle]=\"{color: 'green'}\">Factura ó Contrato correcto</p>\n\n\t\t\t\t\t\t\t</div>\n\n\t\t\t\t\t\t\t<!-- <p *ngIf=\"quejaForm.get('serieNumeroFactura').hasError('pattern')\" [ngStyle]=\"{color: 'red'}\">Error Serie y número de Factura incorrecto</p> -->\n\t\t\t\t\t\t\t\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\n\t\t\t\t\t</div>\n\n\n\n\t\t\t\t\t\n\t\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\t<label for=\"nitProveedor\" class=\"col-lg-10 col-form-label\">{{nproveedor}}</label>\n\t\t\t\t\t\t\n\t\t\t\t\t</div>\n\t\t\t\t\t\n\t\t\t\t\t</div>\n\t\t\t\t</div>\n\t\t\t</div>\n\t\t  \n\t\t \n\t\t  \n\t\t</div>\n\t\t\n\t\t\n\t\t\n        <div class=\"form-group row\" *ngIf=\"vdato=='presencial'\">\n          <label for=\"\" class=\"col-lg-12 col-form-label font-weight-bold lead\">Datos Adjuntos</label>\n          <div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <div class=\"form-group row\">\n\t\t\t\t  <!-- <label for=\"et9\" [ngStyle]=\"{color: 'red'}\">(*)</label>  -->\n                  <label for=\"filFactura\" class=\"col-lg-2 col-form-label\">Factura o Contrato</label>\n                  <div class=\"col-lg-10\">\n                    <input\n                      #filFactura\n                      id=\"filFactura\"\n\t                      type=\"file\"\n                      ng2FileSelect\n                      [uploader]=\"uploader\"\n                      class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"above\"\n\t\t\t\t\t  matTooltip=\"Agrege copia de su documento.\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n                      (change)=\"onFileChanged('FAC')\"\n\t\t\t\t\t  \n\t\t\t\t\t  >\n                  </div>\n                </div>\n                <div class=\"form-group row\">\n\t\t\t\t  <!-- <label for=\"et9\" [ngStyle]=\"{color: 'red'}\">(*)</label> -->\n                  <label for=\"filDpi\" class=\"col-lg-2 col-form-label\">DPI o Pasaporte</label>\n                  <div class=\"col-lg-10\">\n                    <input\n                      #filDpi\n                      id=\"filDpi\"\n                      type=\"file\"\n                      ng2FileSelect\n                      [uploader]=\"uploader\"\n                      class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"above\"\n\t\t\t\t\t  matTooltip=\"Agrege su copia de DPI o Pasaporte\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n                      (change)=\"onFileChanged('DPI')\"\n\t\t\t\t\t  \n\t\t\t\t\t  >\n                  </div>\n                </div>\n                <div class=\"row\">\n                  <p>Estos documentos deben ir completos, por ejemplo el DPI debe ser escaneado a ambos lados.</p>\n                </div>\n\t\t\t\t\n\t\t\t\t\t\t<div class=\"form-group row\" >\n          <label for=\"filOtros\" class=\"col-sm-2 col-form-label\">Adjuntar otro documento</label>\n          <div class=\"col-sm-6\">\n            <input\n              #filOtros\n              id=\"filOtros\"\n              type=\"file\"\n              ng2FileSelect\n              [uploader]=\"uploader\"\n\t\t\t  (change)=\"onFileChanged('OTRO')\"\n              class=\"form-control\">\n          </div>\n          <!--div class=\"col-sm-4 text-left\">\n            <button\n              class=\"btn btn-primary\">Agregar Documento</button>\n          </div-->\n        </div>\n\t\t<div class=\"row\" >\n          <div class=\"container\">\n            <table class=\"table\">\n              <thead>\n                <tr>\n                  <th>Documentos adjuntos {{ uploader?.queue?.length }}</th>\n                  <th></th>\n                </tr>\n              </thead>\n              <tbody>\n                <tr *ngFor=\"let item of uploader.queue; let i = index\">\n                  <!--td>{{item.file.name}}</td>\n                  <td>\n                    <button\n                      class=\"btn btn-danger\"\n                      (click)=\"item.remove()\">Quitar</button>\n                  </td-->\n\t\t\t\t  \n\t\t\t\t  <td><strong>{{ item?.file?.name }}</strong></td>\n                    <td *ngIf=\"uploader.options.isHTML5\" nowrap>{{ item?.file?.size/1024/1024 | number:'.2' }} MB</td>\n                    <td *ngIf=\"uploader.options.isHTML5\">\n                        <div class=\"progress\" style=\"margin-bottom: 0;\">\n                            <div class=\"progress-bar\" role=\"progressbar\" [ngStyle]=\"{ 'width': item.progress + '%' }\"></div>\n                        </div>\n                    </td>\n                    <td class=\"text-center\">\n                        <span *ngIf=\"item.isSuccess\"><i class=\"glyphicon glyphicon-ok\"></i></span>\n                        <span *ngIf=\"item.isCancel\"><i class=\"glyphicon glyphicon-ban-circle\"></i></span>\n                        <span *ngIf=\"item.isError\"><i class=\"glyphicon glyphicon-remove\"></i></span>\n                    </td>\n\t\t\t\t\t<td nowrap>\n\n                        <button type=\"button\" class=\"btn btn-danger btn-xs\"\n                                (click)=\"item.remove()\">\n                            <span class=\"glyphicon glyphicon-trash\"></span> Quitar\n                        </button>\n                    </td>\n\t\t\t\t\t\n                </tr>\n              </tbody>\n            </table>\n          </div>\n        </div>\n\t\t\n              </div>\n            </div>\n          </div>\n\t\t  <label class=\"col-form-label\" >(Los campos marcados </label>\n\t\t  <label class=\"col-form-label\" [ngStyle]=\"{color: 'red'}\">  (*)  </label>\n\t\t  <label class=\"col-form-label\" > son obligatorios.)</label>\n       \n\n\t\t</div>\n\n\t\t\n\t\t\n\t\t\n        <div class=\"form-group row\">\n          <div class=\"col-lg-12 text-center\">\n            <button\n              class=\"btn btn-primary\"\n              type=\"submit\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Grabe su queja.\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t  [disabled]=\"quejaForm.invalid\"\n              >Guardar Queja</button>\n\t\t\t  \n          </div>\n\t\t  \n\t\t</div>\n\t\t<div class=\"d-flex justify-content-center mb-3\">\n\t\t\t<div class=\"spinner-border text-primary\" role=\"status\" *ngIf=\"showSpinner\">\n\t\t\t  <span class=\"sr-only\">Loading...</span>\n\t\t\t</div>\n\t\t</div>\n\t\t\n\t\t<div class=\"form-group row\">\n\t\t  <div class=\"col-lg-12 text-center\">\n            <button type=\"button\" class=\"btn btn-primary row\" (click)=\"onDismissClicked()\">{{cancelar}}</button>\n          </div>\n  \n        </div>\n      </form>\n\t<!--div *ngIf=\"showSpinner\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tFavor espere se grabe su queja..\n\t</div-->\n\t  \n  \n    </div>\n  </div>\n  \n  <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\" *ngIf=\"success\">\n    <!-- <strong>Queja registrada!</strong> Su queja ha sido registrada exitosamente. <h1 class=\"display-1\">{{vsecanio}}-{{vanio}} </h1> -->\n\t<div *ngIf=\"presencial==1\">\n\t\t<strong>Queja registrada! La queja fué enviada al proveedor y se debe esperar la respuesta del mismo.</strong>\n\t\t<!--button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\" (click)=\"onDismissClicked()\">\n\t\t  <span aria-hidden=\"true\">&times;</span>\n\t\t</button-->\n\t\t<strong>\n\t\t <button type=\"button\" class=\"btn btn-primary row\" (click)=\"onPrintQueja()\">Imprimir queja {{vsecanio}}-{{vanio}}</button>\n\t\t </strong>\n\t</div>\n\t<div *ngIf=\"presencial!=1\">\n\t\n\t<div class=\"form-group row\">\n          <div class=\"col-lg-12 text-center\">\n            <button\n              class=\"btn btn-primary\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingreso de datos presencial\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  (click)=\"continuarPresencial()\"\n               >Continuar con el ingreso de datos</button>\n          </div>\n    </div>\n\t\n\t</div>\n  </div>\n    \n</div>\n    <!--img src=\"diaco-grd.jpg\" class=\"center\"/-->\n\t<div class=\"container\">\n\t\t<div class=\"row\">\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t<img class=\"footerimg\" />\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t</div>\n\t</div>\n\n\n</body>\n</html>\n"

/***/ }),

/***/ "./src/app/pquejaini/pquejaini.component.scss":
/*!****************************************************!*\
  !*** ./src/app/pquejaini/pquejaini.component.scss ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "/* BASIC */\n.headerimg {\n  width: 70%;\n  height: auto; }\n.footerimg {\n  content: url('diaco-grd.jpg');\n  width: 70%;\n  height: auto; }\nbody {\n  /* background-image: url(diacofade3.jpg), url(imagen-grdfade2.jpg) ; ORIGINAL*/\n  /*   background-image: url(/assets/img/logo-diaco-ant.jpg);\n\tbackground-repeat: no-repeat, no-repeat;\n\tbackground-attachment: fixed, fixed;\n\tbackground-size: auto auto, auto auto;\n\tbackground-position: bottom right, bottom left;\n\tmin-height:100vh;  */ }\nhtml {\n  background-color: #56baed; }\nbody {\n  font-family: \"Poppins\", sans-serif;\n  height: 100vh; }\na.underlineHover {\n  color: #e68a00;\n  display: inline-block;\n  text-decoration: none;\n  font-weight: 400; }\nh2 {\n  text-align: center;\n  font-size: 16px;\n  font-weight: 600;\n  text-transform: uppercase;\n  display: inline-block;\n  margin: 40px 8px 10px 8px;\n  color: #cccccc; }\n/* STRUCTURE */\n.wrapper {\n  display: flex;\n  align-items: center;\n  flex-direction: column;\n  justify-content: center;\n  width: 100%;\n  min-height: 100%;\n  padding: 20px; }\n#formContent {\n  border-radius: 10px 10px 10px 10px;\n  background: #fff;\n  padding: 30px;\n  width: 90%;\n  max-width: 450px;\n  position: relative;\n  padding: 0px;\n  box-shadow: 0 30px 60px 0 rgba(0, 0, 0, 0.3);\n  text-align: center;\n  background-color: #00284d; }\n#formFooter {\n  background-color: #f6f6f7;\n  border-top: 1px solid #dce8f1;\n  padding: 25px;\n  text-align: center;\n  border-radius: 0 0 10px 10px; }\n/* TABS */\nh2.inactive {\n  color: #cccccc; }\nh2.active {\n  color: #0d0d0d;\n  border-bottom: 2px solid #5fbae9; }\n/* FORM TYPOGRAPHY*/\ninput[type=button], input[type=submit], input[type=reset] {\n  background-color: #1aa3ff;\n  border: none;\n  color: white;\n  padding: 15px 80px;\n  text-align: center;\n  text-decoration: none;\n  display: inline-block;\n  text-transform: uppercase;\n  font-size: 10px;\n  box-shadow: 0 10px 30px 0 rgba(95, 186, 233, 0.4);\n  border-radius: 5px 5px 5px 5px;\n  margin: 5px 20px 40px 20px;\n  transition: all 0.3s ease-in-out; }\ninput[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover {\n  background-color: #e68a00; }\ninput[type=button]:active, input[type=submit]:active, input[type=reset]:active {\n  transform: scale(0.95); }\ninput[type=text], input[type=password] {\n  background-color: #f6f6f6;\n  border: none;\n  color: #0d0d0d;\n  padding: 15px 32px;\n  text-align: center;\n  text-decoration: none;\n  display: inline-block;\n  font-size: 16px;\n  margin: 5px;\n  width: 110%;\n  border: 2px solid #f6f6f6;\n  transition: all 0.5s ease-in-out;\n  border-radius: 5px 5px 5px 5px; }\ninput[type=text]:focus, input[type=password]:focus {\n  background-color: #fff;\n  border-bottom: 2px solid #5fbae9; }\ninput[type=text]:placeholder {\n  color: #cccccc; }\n/* ANIMATIONS */\n/* Simple CSS3 Fade-in-down Animation */\n.fadeInDown {\n  -webkit-animation-name: fadeInDown;\n  animation-name: fadeInDown;\n  -webkit-animation-duration: 1s;\n  animation-duration: 1s;\n  -webkit-animation-fill-mode: both;\n  animation-fill-mode: both; }\n@-webkit-keyframes fadeInDown {\n  0% {\n    opacity: 0;\n    transform: translate3d(0, -100%, 0); }\n  100% {\n    opacity: 1;\n    transform: none; } }\n@keyframes fadeInDown {\n  0% {\n    opacity: 0;\n    transform: translate3d(-100%, 0, 0); }\n  100% {\n    opacity: 1;\n    transform: none; } }\n/* Simple CSS3 Fade-in Animation */\n@-webkit-keyframes fadeIn {\n  from {\n    opacity: 0; }\n  to {\n    opacity: 1; } }\n@keyframes fadeIn {\n  from {\n    opacity: 0; }\n  to {\n    opacity: 1; } }\n.fadeIn {\n  opacity: 0;\n  -webkit-animation: fadeIn ease-in 1;\n  animation: fadeIn ease-in 1;\n  -webkit-animation-fill-mode: forwards;\n  animation-fill-mode: forwards;\n  -webkit-animation-duration: 1s;\n  animation-duration: 1s; }\n.fadeIn.first {\n  -webkit-animation-delay: 0.4s;\n  animation-delay: 0.4s; }\n.fadeIn.second {\n  -webkit-animation-delay: 0.6s;\n  animation-delay: 0.6s; }\n.fadeIn.third {\n  -webkit-animation-delay: 0.8s;\n  animation-delay: 0.8s; }\n.fadeIn.fourth {\n  -webkit-animation-delay: 1s;\n  animation-delay: 1s; }\n/* Simple CSS3 Fade-in Animation */\n.underlineHover:after {\n  display: block;\n  left: 0;\n  bottom: -10px;\n  width: 0;\n  height: 2px;\n  background-color: #56baed;\n  content: \"\";\n  transition: width 0.2s; }\n.underlineHover:hover {\n  /*color: #1aa3ff;*/ }\n.underlineHover:hover:after {\n  width: 100%; }\n/* OTHERS */\n*:focus {\n  outline: none; }\n#icon {\n  width: 60%; }\nhtml, body {\n  height: 100%; }\n/*footer css*/\n#wrap {\n  min-height: 100%; }\n#main {\n  overflow: auto;\n  padding-bottom: 150px;\n  /* this needs to be bigger than footer height*/ }\n.page-footer {\n  background-color: #00284d;\n  color: white; }\n.footer-copyright {\n  color: white; }\n.footer-link {\n  color: white;\n  text-decoration: underline; }\n.footer-link:hover {\n  color: #e68a00;\n  text-decoration: underline; }\n.footer-margin {\n  position: fixed;\n  bottom: 0;\n  width: 100%;\n  /* Set the fixed height of the footer here */\n  height: 100px;\n  /*line-height: 100px;*/\n  /* Vertically center the text there */ }\n.center {\n  margin-left: auto;\n  margin-right: auto;\n  display: block; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvcHF1ZWphaW5pL0M6XFxVc2Vyc1xcamphZ3VpbGFsXFxEb2N1bWVudHNcXERJQUNPIEFQUFxcUVVFSkFTLURJQUNPXFxGcm9udGVuZFxcZGlzdDYvc3JjXFxhcHBcXHBxdWVqYWluaVxccHF1ZWphaW5pLmNvbXBvbmVudC5zY3NzIiwic3JjL2FwcC9wcXVlamFpbmkvcHF1ZWphaW5pLmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUNBLFVBQUE7QUFFQTtFQUVFLFVBQVU7RUFDVixZQUFZLEVBQUE7QUFFZDtFQUNLLDZCQUFnQztFQUNuQyxVQUFVO0VBQ1YsWUFBWSxFQUFBO0FBS2Q7RUFDQyw4RUFBQTtFQUNEOzs7OztxQkNEcUIsRURNQztBQUl0QjtFQUNFLHlCQUF5QixFQUFBO0FBRzNCO0VBQ0Usa0NBQWtDO0VBQ2xDLGFBQWEsRUFBQTtBQUdmO0VBQ0UsY0FBYztFQUNkLHFCQUFvQjtFQUNwQixxQkFBcUI7RUFDckIsZ0JBQWdCLEVBQUE7QUFHbEI7RUFDRSxrQkFBa0I7RUFDbEIsZUFBZTtFQUNmLGdCQUFnQjtFQUNoQix5QkFBeUI7RUFDekIscUJBQW9CO0VBQ3BCLHlCQUF5QjtFQUN6QixjQUFjLEVBQUE7QUFLaEIsY0FBQTtBQUVBO0VBQ0UsYUFBYTtFQUNiLG1CQUFtQjtFQUNuQixzQkFBc0I7RUFDdEIsdUJBQXVCO0VBQ3ZCLFdBQVc7RUFDWCxnQkFBZ0I7RUFDaEIsYUFBYSxFQUFBO0FBR2Y7RUFFRSxrQ0FBa0M7RUFDbEMsZ0JBQWdCO0VBQ2hCLGFBQWE7RUFDYixVQUFVO0VBQ1YsZ0JBQWdCO0VBQ2hCLGtCQUFrQjtFQUNsQixZQUFZO0VBRVosNENBQXlDO0VBQ3pDLGtCQUFrQjtFQUNsQix5QkFBeUIsRUFBQTtBQUczQjtFQUNFLHlCQUF5QjtFQUN6Qiw2QkFBNkI7RUFDN0IsYUFBYTtFQUNiLGtCQUFrQjtFQUVsQiw0QkFBNEIsRUFBQTtBQUs5QixTQUFBO0FBRUE7RUFDRSxjQUFjLEVBQUE7QUFHaEI7RUFDRSxjQUFjO0VBQ2QsZ0NBQWdDLEVBQUE7QUFLbEMsbUJBQUE7QUFFQTtFQUNFLHlCQUF5QjtFQUN6QixZQUFZO0VBQ1osWUFBWTtFQUNaLGtCQUFrQjtFQUNsQixrQkFBa0I7RUFDbEIscUJBQXFCO0VBQ3JCLHFCQUFxQjtFQUNyQix5QkFBeUI7RUFDekIsZUFBZTtFQUVmLGlEQUE4QztFQUU5Qyw4QkFBOEI7RUFDOUIsMEJBQTBCO0VBSzFCLGdDQUFnQyxFQUFBO0FBR2xDO0VBQ0UseUJBQXlCLEVBQUE7QUFHM0I7RUFLRSxzQkFBc0IsRUFBQTtBQUd4QjtFQUNFLHlCQUF5QjtFQUN6QixZQUFZO0VBQ1osY0FBYztFQUNkLGtCQUFrQjtFQUNsQixrQkFBa0I7RUFDbEIscUJBQXFCO0VBQ3JCLHFCQUFxQjtFQUNyQixlQUFlO0VBQ2YsV0FBVztFQUNYLFdBQVc7RUFDWCx5QkFBeUI7RUFLekIsZ0NBQWdDO0VBRWhDLDhCQUE4QixFQUFBO0FBR2hDO0VBQ0Usc0JBQXNCO0VBQ3RCLGdDQUFnQyxFQUFBO0FBR2xDO0VBQ0UsY0FBYyxFQUFBO0FBS2hCLGVBQUE7QUFFQSx1Q0FBQTtBQUNBO0VBQ0Usa0NBQWtDO0VBQ2xDLDBCQUEwQjtFQUMxQiw4QkFBOEI7RUFDOUIsc0JBQXNCO0VBQ3RCLGlDQUFpQztFQUNqQyx5QkFBeUIsRUFBQTtBQUczQjtFQUNFO0lBQ0UsVUFBVTtJQUVWLG1DQUFtQyxFQUFBO0VBRXJDO0lBQ0UsVUFBVTtJQUVWLGVBQWUsRUFBQSxFQUFBO0FBSW5CO0VBQ0U7SUFDRSxVQUFVO0lBRVYsbUNBQW1DLEVBQUE7RUFFckM7SUFDRSxVQUFVO0lBRVYsZUFBZSxFQUFBLEVBQUE7QUFJbkIsa0NBQUE7QUFDQTtFQUE0QjtJQUFPLFVBQVMsRUFBQTtFQUFJO0lBQUssVUFBUyxFQUFBLEVBQUE7QUFFOUQ7RUFBb0I7SUFBTyxVQUFTLEVBQUE7RUFBSTtJQUFLLFVBQVMsRUFBQSxFQUFBO0FBRXREO0VBQ0UsVUFBUztFQUNULG1DQUFrQztFQUVsQywyQkFBMEI7RUFFMUIscUNBQW9DO0VBRXBDLDZCQUE0QjtFQUU1Qiw4QkFBNkI7RUFFN0Isc0JBQXFCLEVBQUE7QUFHdkI7RUFDRSw2QkFBNkI7RUFFN0IscUJBQXFCLEVBQUE7QUFHdkI7RUFDRSw2QkFBNkI7RUFFN0IscUJBQXFCLEVBQUE7QUFHdkI7RUFDRSw2QkFBNkI7RUFFN0IscUJBQXFCLEVBQUE7QUFHdkI7RUFDRSwyQkFBMkI7RUFFM0IsbUJBQW1CLEVBQUE7QUFHckIsa0NBQUE7QUFDQTtFQUNFLGNBQWM7RUFDZCxPQUFPO0VBQ1AsYUFBYTtFQUNiLFFBQVE7RUFDUixXQUFXO0VBQ1gseUJBQXlCO0VBQ3pCLFdBQVc7RUFDWCxzQkFBc0IsRUFBQTtBQUd4QjtFQUNFLGtCQUFBLEVBQW1CO0FBR3JCO0VBQ0UsV0FBVyxFQUFBO0FBS2IsV0FBQTtBQUVBO0VBQ0ksYUFBYSxFQUFBO0FBR2pCO0VBQ0UsVUFBUyxFQUFBO0FBR1g7RUFDRSxZQUFZLEVBQUE7QUFHZCxhQUFBO0FBRUE7RUFDRSxnQkFBZ0IsRUFBQTtBQUdsQjtFQUNFLGNBQWE7RUFDYixxQkFBb0I7RUFBRSw4Q0FBQSxFQUErQztBQUd2RTtFQUNFLHlCQUF5QjtFQUN6QixZQUFXLEVBQUE7QUFHYjtFQUNDLFlBQVcsRUFBQTtBQUdaO0VBQ0MsWUFBVztFQUNYLDBCQUEwQixFQUFBO0FBRzNCO0VBQ0MsY0FBYTtFQUNiLDBCQUEwQixFQUFBO0FBRzNCO0VBQ0UsZUFBZTtFQUNmLFNBQVM7RUFDVCxXQUFXO0VBQ1gsNENBQUE7RUFDQSxhQUFhO0VBQ2Isc0JBQUE7RUFBd0IscUNBQUEsRUFBc0M7QUFHaEU7RUFDSSxpQkFBaUI7RUFDakIsa0JBQWtCO0VBQ2xCLGNBQWMsRUFBQSIsImZpbGUiOiJzcmMvYXBwL3BxdWVqYWluaS9wcXVlamFpbmkuY29tcG9uZW50LnNjc3MiLCJzb3VyY2VzQ29udGVudCI6WyJcbi8qIEJBU0lDICovXG5cbi5oZWFkZXJpbWd7XG4gIFxuXHQgd2lkdGg6IDcwJTtcblx0IGhlaWdodDogYXV0bztcbn1cbi5mb290ZXJpbWd7XG4gICAgIGNvbnRlbnQ6dXJsKFwiY3NzL2RpYWNvLWdyZC5qcGdcIik7XG5cdCB3aWR0aDogNzAlO1xuXHQgaGVpZ2h0OiBhdXRvO1xuICAgXG59XG4gXG4gXG5ib2R5IHtcblx0LyogYmFja2dyb3VuZC1pbWFnZTogdXJsKGRpYWNvZmFkZTMuanBnKSwgdXJsKGltYWdlbi1ncmRmYWRlMi5qcGcpIDsgT1JJR0lOQUwqL1xuLyogICBiYWNrZ3JvdW5kLWltYWdlOiB1cmwoL2Fzc2V0cy9pbWcvbG9nby1kaWFjby1hbnQuanBnKTtcblx0YmFja2dyb3VuZC1yZXBlYXQ6IG5vLXJlcGVhdCwgbm8tcmVwZWF0O1xuXHRiYWNrZ3JvdW5kLWF0dGFjaG1lbnQ6IGZpeGVkLCBmaXhlZDtcblx0YmFja2dyb3VuZC1zaXplOiBhdXRvIGF1dG8sIGF1dG8gYXV0bztcblx0YmFja2dyb3VuZC1wb3NpdGlvbjogYm90dG9tIHJpZ2h0LCBib3R0b20gbGVmdDtcblx0bWluLWhlaWdodDoxMDB2aDsgICovXG59XG5cbiBcbmh0bWwge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTZiYWVkO1xufVxuXG5ib2R5IHtcbiAgZm9udC1mYW1pbHk6IFwiUG9wcGluc1wiLCBzYW5zLXNlcmlmO1xuICBoZWlnaHQ6IDEwMHZoO1xufVxuXG5hLnVuZGVybGluZUhvdmVyIHtcbiAgY29sb3I6ICNlNjhhMDA7XG4gIGRpc3BsYXk6aW5saW5lLWJsb2NrO1xuICB0ZXh0LWRlY29yYXRpb246IG5vbmU7XG4gIGZvbnQtd2VpZ2h0OiA0MDA7XG59XG5cbmgyIHtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBmb250LXNpemU6IDE2cHg7XG4gIGZvbnQtd2VpZ2h0OiA2MDA7XG4gIHRleHQtdHJhbnNmb3JtOiB1cHBlcmNhc2U7XG4gIGRpc3BsYXk6aW5saW5lLWJsb2NrO1xuICBtYXJnaW46IDQwcHggOHB4IDEwcHggOHB4OyBcbiAgY29sb3I6ICNjY2NjY2M7XG59XG5cblxuXG4vKiBTVFJVQ1RVUkUgKi9cblxuLndyYXBwZXIge1xuICBkaXNwbGF5OiBmbGV4O1xuICBhbGlnbi1pdGVtczogY2VudGVyO1xuICBmbGV4LWRpcmVjdGlvbjogY29sdW1uOyBcbiAganVzdGlmeS1jb250ZW50OiBjZW50ZXI7XG4gIHdpZHRoOiAxMDAlO1xuICBtaW4taGVpZ2h0OiAxMDAlO1xuICBwYWRkaW5nOiAyMHB4O1xufVxuXG4jZm9ybUNvbnRlbnQge1xuICAtd2Via2l0LWJvcmRlci1yYWRpdXM6IDEwcHggMTBweCAxMHB4IDEwcHg7XG4gIGJvcmRlci1yYWRpdXM6IDEwcHggMTBweCAxMHB4IDEwcHg7XG4gIGJhY2tncm91bmQ6ICNmZmY7XG4gIHBhZGRpbmc6IDMwcHg7XG4gIHdpZHRoOiA5MCU7XG4gIG1heC13aWR0aDogNDUwcHg7XG4gIHBvc2l0aW9uOiByZWxhdGl2ZTtcbiAgcGFkZGluZzogMHB4O1xuICAtd2Via2l0LWJveC1zaGFkb3c6IDAgMzBweCA2MHB4IDAgcmdiYSgwLDAsMCwwLjMpO1xuICBib3gtc2hhZG93OiAwIDMwcHggNjBweCAwIHJnYmEoMCwwLDAsMC4zKTtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMDAyODRkO1xufVxuXG4jZm9ybUZvb3RlciB7XG4gIGJhY2tncm91bmQtY29sb3I6ICNmNmY2Zjc7XG4gIGJvcmRlci10b3A6IDFweCBzb2xpZCAjZGNlOGYxO1xuICBwYWRkaW5nOiAyNXB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIC13ZWJraXQtYm9yZGVyLXJhZGl1czogMCAwIDEwcHggMTBweDtcbiAgYm9yZGVyLXJhZGl1czogMCAwIDEwcHggMTBweDtcbn1cblxuXG5cbi8qIFRBQlMgKi9cblxuaDIuaW5hY3RpdmUge1xuICBjb2xvcjogI2NjY2NjYztcbn1cblxuaDIuYWN0aXZlIHtcbiAgY29sb3I6ICMwZDBkMGQ7XG4gIGJvcmRlci1ib3R0b206IDJweCBzb2xpZCAjNWZiYWU5O1xufVxuXG5cblxuLyogRk9STSBUWVBPR1JBUEhZKi9cblxuaW5wdXRbdHlwZT1idXR0b25dLCBpbnB1dFt0eXBlPXN1Ym1pdF0sIGlucHV0W3R5cGU9cmVzZXRdICB7XG4gIGJhY2tncm91bmQtY29sb3I6ICMxYWEzZmY7XG4gIGJvcmRlcjogbm9uZTtcbiAgY29sb3I6IHdoaXRlO1xuICBwYWRkaW5nOiAxNXB4IDgwcHg7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgdGV4dC1kZWNvcmF0aW9uOiBub25lO1xuICBkaXNwbGF5OiBpbmxpbmUtYmxvY2s7XG4gIHRleHQtdHJhbnNmb3JtOiB1cHBlcmNhc2U7IFxuICBmb250LXNpemU6IDEwcHg7XG4gIC13ZWJraXQtYm94LXNoYWRvdzogMCAxMHB4IDMwcHggMCByZ2JhKDk1LDE4NiwyMzMsMC40KTtcbiAgYm94LXNoYWRvdzogMCAxMHB4IDMwcHggMCByZ2JhKDk1LDE4NiwyMzMsMC40KTtcbiAgLXdlYmtpdC1ib3JkZXItcmFkaXVzOiA1cHggNXB4IDVweCA1cHg7XG4gIGJvcmRlci1yYWRpdXM6IDVweCA1cHggNXB4IDVweDtcbiAgbWFyZ2luOiA1cHggMjBweCA0MHB4IDIwcHg7XG4gIC13ZWJraXQtdHJhbnNpdGlvbjogYWxsIDAuM3MgZWFzZS1pbi1vdXQ7XG4gIC1tb3otdHJhbnNpdGlvbjogYWxsIDAuM3MgZWFzZS1pbi1vdXQ7XG4gIC1tcy10cmFuc2l0aW9uOiBhbGwgMC4zcyBlYXNlLWluLW91dDtcbiAgLW8tdHJhbnNpdGlvbjogYWxsIDAuM3MgZWFzZS1pbi1vdXQ7XG4gIHRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2UtaW4tb3V0O1xufVxuXG5pbnB1dFt0eXBlPWJ1dHRvbl06aG92ZXIsIGlucHV0W3R5cGU9c3VibWl0XTpob3ZlciwgaW5wdXRbdHlwZT1yZXNldF06aG92ZXIgIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogI2U2OGEwMDtcbn1cblxuaW5wdXRbdHlwZT1idXR0b25dOmFjdGl2ZSwgaW5wdXRbdHlwZT1zdWJtaXRdOmFjdGl2ZSwgaW5wdXRbdHlwZT1yZXNldF06YWN0aXZlICB7XG4gIC1tb3otdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTtcbiAgLXdlYmtpdC10cmFuc2Zvcm06IHNjYWxlKDAuOTUpO1xuICAtby10cmFuc2Zvcm06IHNjYWxlKDAuOTUpO1xuICAtbXMtdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTtcbiAgdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTtcbn1cblxuaW5wdXRbdHlwZT10ZXh0XSwgaW5wdXRbdHlwZT1wYXNzd29yZF0ge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjZjZmNmY2O1xuICBib3JkZXI6IG5vbmU7XG4gIGNvbG9yOiAjMGQwZDBkO1xuICBwYWRkaW5nOiAxNXB4IDMycHg7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgdGV4dC1kZWNvcmF0aW9uOiBub25lO1xuICBkaXNwbGF5OiBpbmxpbmUtYmxvY2s7XG4gIGZvbnQtc2l6ZTogMTZweDtcbiAgbWFyZ2luOiA1cHg7XG4gIHdpZHRoOiAxMTAlO1xuICBib3JkZXI6IDJweCBzb2xpZCAjZjZmNmY2O1xuICAtd2Via2l0LXRyYW5zaXRpb246IGFsbCAwLjVzIGVhc2UtaW4tb3V0O1xuICAtbW96LXRyYW5zaXRpb246IGFsbCAwLjVzIGVhc2UtaW4tb3V0O1xuICAtbXMtdHJhbnNpdGlvbjogYWxsIDAuNXMgZWFzZS1pbi1vdXQ7XG4gIC1vLXRyYW5zaXRpb246IGFsbCAwLjVzIGVhc2UtaW4tb3V0O1xuICB0cmFuc2l0aW9uOiBhbGwgMC41cyBlYXNlLWluLW91dDtcbiAgLXdlYmtpdC1ib3JkZXItcmFkaXVzOiA1cHggNXB4IDVweCA1cHg7XG4gIGJvcmRlci1yYWRpdXM6IDVweCA1cHggNXB4IDVweDtcbn1cblxuaW5wdXRbdHlwZT10ZXh0XTpmb2N1cywgaW5wdXRbdHlwZT1wYXNzd29yZF06Zm9jdXMge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjZmZmO1xuICBib3JkZXItYm90dG9tOiAycHggc29saWQgIzVmYmFlOTtcbn1cblxuaW5wdXRbdHlwZT10ZXh0XTpwbGFjZWhvbGRlciB7XG4gIGNvbG9yOiAjY2NjY2NjO1xufVxuXG5cblxuLyogQU5JTUFUSU9OUyAqL1xuXG4vKiBTaW1wbGUgQ1NTMyBGYWRlLWluLWRvd24gQW5pbWF0aW9uICovXG4uZmFkZUluRG93biB7XG4gIC13ZWJraXQtYW5pbWF0aW9uLW5hbWU6IGZhZGVJbkRvd247XG4gIGFuaW1hdGlvbi1uYW1lOiBmYWRlSW5Eb3duO1xuICAtd2Via2l0LWFuaW1hdGlvbi1kdXJhdGlvbjogMXM7XG4gIGFuaW1hdGlvbi1kdXJhdGlvbjogMXM7XG4gIC13ZWJraXQtYW5pbWF0aW9uLWZpbGwtbW9kZTogYm90aDtcbiAgYW5pbWF0aW9uLWZpbGwtbW9kZTogYm90aDtcbn1cblxuQC13ZWJraXQta2V5ZnJhbWVzIGZhZGVJbkRvd24ge1xuICAwJSB7XG4gICAgb3BhY2l0eTogMDtcbiAgICAtd2Via2l0LXRyYW5zZm9ybTogdHJhbnNsYXRlM2QoMCwgLTEwMCUsIDApO1xuICAgIHRyYW5zZm9ybTogdHJhbnNsYXRlM2QoMCwgLTEwMCUsIDApO1xuICB9XG4gIDEwMCUge1xuICAgIG9wYWNpdHk6IDE7XG4gICAgLXdlYmtpdC10cmFuc2Zvcm06IG5vbmU7XG4gICAgdHJhbnNmb3JtOiBub25lO1xuICB9XG59XG5cbkBrZXlmcmFtZXMgZmFkZUluRG93biB7XG4gIDAlIHtcbiAgICBvcGFjaXR5OiAwO1xuICAgIC13ZWJraXQtdHJhbnNmb3JtOiB0cmFuc2xhdGUzZCgtMTAwJSwgMCwgMCk7XG4gICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUzZCgtMTAwJSwgMCwgMCk7XG4gIH1cbiAgMTAwJSB7XG4gICAgb3BhY2l0eTogMTtcbiAgICAtd2Via2l0LXRyYW5zZm9ybTogbm9uZTtcbiAgICB0cmFuc2Zvcm06IG5vbmU7XG4gIH1cbn1cblxuLyogU2ltcGxlIENTUzMgRmFkZS1pbiBBbmltYXRpb24gKi9cbkAtd2Via2l0LWtleWZyYW1lcyBmYWRlSW4geyBmcm9tIHsgb3BhY2l0eTowOyB9IHRvIHsgb3BhY2l0eToxOyB9IH1cbkAtbW96LWtleWZyYW1lcyBmYWRlSW4geyBmcm9tIHsgb3BhY2l0eTowOyB9IHRvIHsgb3BhY2l0eToxOyB9IH1cbkBrZXlmcmFtZXMgZmFkZUluIHsgZnJvbSB7IG9wYWNpdHk6MDsgfSB0byB7IG9wYWNpdHk6MTsgfSB9XG5cbi5mYWRlSW4ge1xuICBvcGFjaXR5OjA7XG4gIC13ZWJraXQtYW5pbWF0aW9uOmZhZGVJbiBlYXNlLWluIDE7XG4gIC1tb3otYW5pbWF0aW9uOmZhZGVJbiBlYXNlLWluIDE7XG4gIGFuaW1hdGlvbjpmYWRlSW4gZWFzZS1pbiAxO1xuXG4gIC13ZWJraXQtYW5pbWF0aW9uLWZpbGwtbW9kZTpmb3J3YXJkcztcbiAgLW1vei1hbmltYXRpb24tZmlsbC1tb2RlOmZvcndhcmRzO1xuICBhbmltYXRpb24tZmlsbC1tb2RlOmZvcndhcmRzO1xuXG4gIC13ZWJraXQtYW5pbWF0aW9uLWR1cmF0aW9uOjFzO1xuICAtbW96LWFuaW1hdGlvbi1kdXJhdGlvbjoxcztcbiAgYW5pbWF0aW9uLWR1cmF0aW9uOjFzO1xufVxuXG4uZmFkZUluLmZpcnN0IHtcbiAgLXdlYmtpdC1hbmltYXRpb24tZGVsYXk6IDAuNHM7XG4gIC1tb3otYW5pbWF0aW9uLWRlbGF5OiAwLjRzO1xuICBhbmltYXRpb24tZGVsYXk6IDAuNHM7XG59XG5cbi5mYWRlSW4uc2Vjb25kIHtcbiAgLXdlYmtpdC1hbmltYXRpb24tZGVsYXk6IDAuNnM7XG4gIC1tb3otYW5pbWF0aW9uLWRlbGF5OiAwLjZzO1xuICBhbmltYXRpb24tZGVsYXk6IDAuNnM7XG59XG5cbi5mYWRlSW4udGhpcmQge1xuICAtd2Via2l0LWFuaW1hdGlvbi1kZWxheTogMC44cztcbiAgLW1vei1hbmltYXRpb24tZGVsYXk6IDAuOHM7XG4gIGFuaW1hdGlvbi1kZWxheTogMC44cztcbn1cblxuLmZhZGVJbi5mb3VydGgge1xuICAtd2Via2l0LWFuaW1hdGlvbi1kZWxheTogMXM7XG4gIC1tb3otYW5pbWF0aW9uLWRlbGF5OiAxcztcbiAgYW5pbWF0aW9uLWRlbGF5OiAxcztcbn1cblxuLyogU2ltcGxlIENTUzMgRmFkZS1pbiBBbmltYXRpb24gKi9cbi51bmRlcmxpbmVIb3ZlcjphZnRlciB7XG4gIGRpc3BsYXk6IGJsb2NrO1xuICBsZWZ0OiAwO1xuICBib3R0b206IC0xMHB4O1xuICB3aWR0aDogMDtcbiAgaGVpZ2h0OiAycHg7XG4gIGJhY2tncm91bmQtY29sb3I6ICM1NmJhZWQ7XG4gIGNvbnRlbnQ6IFwiXCI7XG4gIHRyYW5zaXRpb246IHdpZHRoIDAuMnM7XG59XG5cbi51bmRlcmxpbmVIb3Zlcjpob3ZlciB7XG4gIC8qY29sb3I6ICMxYWEzZmY7Ki9cbn1cblxuLnVuZGVybGluZUhvdmVyOmhvdmVyOmFmdGVye1xuICB3aWR0aDogMTAwJTtcbn1cblxuXG5cbi8qIE9USEVSUyAqL1xuXG4qOmZvY3VzIHtcbiAgICBvdXRsaW5lOiBub25lO1xufSBcblxuI2ljb24ge1xuICB3aWR0aDo2MCU7XG59XG5cbmh0bWwsIGJvZHkge1xuICBoZWlnaHQ6IDEwMCU7XG59XG5cbi8qZm9vdGVyIGNzcyovXG5cbiN3cmFwIHtcbiAgbWluLWhlaWdodDogMTAwJTtcbn1cblxuI21haW4ge1xuICBvdmVyZmxvdzphdXRvO1xuICBwYWRkaW5nLWJvdHRvbToxNTBweDsgLyogdGhpcyBuZWVkcyB0byBiZSBiaWdnZXIgdGhhbiBmb290ZXIgaGVpZ2h0Ki9cbn1cblxuLnBhZ2UtZm9vdGVyIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZDtcbiAgY29sb3I6d2hpdGU7XG59IFxuXG4uZm9vdGVyLWNvcHlyaWdodHtcblx0Y29sb3I6d2hpdGU7XG59XG5cbi5mb290ZXItbGlua3tcblx0Y29sb3I6d2hpdGU7XG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xufVxuXG4uZm9vdGVyLWxpbms6aG92ZXJ7XG5cdGNvbG9yOiNlNjhhMDA7XG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xufVxuXG4uZm9vdGVyLW1hcmdpbiB7XG4gIHBvc2l0aW9uOiBmaXhlZDtcbiAgYm90dG9tOiAwO1xuICB3aWR0aDogMTAwJTtcbiAgLyogU2V0IHRoZSBmaXhlZCBoZWlnaHQgb2YgdGhlIGZvb3RlciBoZXJlICovXG4gIGhlaWdodDogMTAwcHg7XG4gIC8qbGluZS1oZWlnaHQ6IDEwMHB4OyovIC8qIFZlcnRpY2FsbHkgY2VudGVyIHRoZSB0ZXh0IHRoZXJlICovXG59XG5cbi5jZW50ZXIge1xuICAgIG1hcmdpbi1sZWZ0OiBhdXRvO1xuICAgIG1hcmdpbi1yaWdodDogYXV0bztcbiAgICBkaXNwbGF5OiBibG9jaztcbn1cbiIsIi8qIEJBU0lDICovXG4uaGVhZGVyaW1nIHtcbiAgd2lkdGg6IDcwJTtcbiAgaGVpZ2h0OiBhdXRvOyB9XG5cbi5mb290ZXJpbWcge1xuICBjb250ZW50OiB1cmwoXCJjc3MvZGlhY28tZ3JkLmpwZ1wiKTtcbiAgd2lkdGg6IDcwJTtcbiAgaGVpZ2h0OiBhdXRvOyB9XG5cbmJvZHkge1xuICAvKiBiYWNrZ3JvdW5kLWltYWdlOiB1cmwoZGlhY29mYWRlMy5qcGcpLCB1cmwoaW1hZ2VuLWdyZGZhZGUyLmpwZykgOyBPUklHSU5BTCovXG4gIC8qICAgYmFja2dyb3VuZC1pbWFnZTogdXJsKC9hc3NldHMvaW1nL2xvZ28tZGlhY28tYW50LmpwZyk7XG5cdGJhY2tncm91bmQtcmVwZWF0OiBuby1yZXBlYXQsIG5vLXJlcGVhdDtcblx0YmFja2dyb3VuZC1hdHRhY2htZW50OiBmaXhlZCwgZml4ZWQ7XG5cdGJhY2tncm91bmQtc2l6ZTogYXV0byBhdXRvLCBhdXRvIGF1dG87XG5cdGJhY2tncm91bmQtcG9zaXRpb246IGJvdHRvbSByaWdodCwgYm90dG9tIGxlZnQ7XG5cdG1pbi1oZWlnaHQ6MTAwdmg7ICAqLyB9XG5cbmh0bWwge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTZiYWVkOyB9XG5cbmJvZHkge1xuICBmb250LWZhbWlseTogXCJQb3BwaW5zXCIsIHNhbnMtc2VyaWY7XG4gIGhlaWdodDogMTAwdmg7IH1cblxuYS51bmRlcmxpbmVIb3ZlciB7XG4gIGNvbG9yOiAjZTY4YTAwO1xuICBkaXNwbGF5OiBpbmxpbmUtYmxvY2s7XG4gIHRleHQtZGVjb3JhdGlvbjogbm9uZTtcbiAgZm9udC13ZWlnaHQ6IDQwMDsgfVxuXG5oMiB7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgZm9udC1zaXplOiAxNnB4O1xuICBmb250LXdlaWdodDogNjAwO1xuICB0ZXh0LXRyYW5zZm9ybTogdXBwZXJjYXNlO1xuICBkaXNwbGF5OiBpbmxpbmUtYmxvY2s7XG4gIG1hcmdpbjogNDBweCA4cHggMTBweCA4cHg7XG4gIGNvbG9yOiAjY2NjY2NjOyB9XG5cbi8qIFNUUlVDVFVSRSAqL1xuLndyYXBwZXIge1xuICBkaXNwbGF5OiBmbGV4O1xuICBhbGlnbi1pdGVtczogY2VudGVyO1xuICBmbGV4LWRpcmVjdGlvbjogY29sdW1uO1xuICBqdXN0aWZ5LWNvbnRlbnQ6IGNlbnRlcjtcbiAgd2lkdGg6IDEwMCU7XG4gIG1pbi1oZWlnaHQ6IDEwMCU7XG4gIHBhZGRpbmc6IDIwcHg7IH1cblxuI2Zvcm1Db250ZW50IHtcbiAgLXdlYmtpdC1ib3JkZXItcmFkaXVzOiAxMHB4IDEwcHggMTBweCAxMHB4O1xuICBib3JkZXItcmFkaXVzOiAxMHB4IDEwcHggMTBweCAxMHB4O1xuICBiYWNrZ3JvdW5kOiAjZmZmO1xuICBwYWRkaW5nOiAzMHB4O1xuICB3aWR0aDogOTAlO1xuICBtYXgtd2lkdGg6IDQ1MHB4O1xuICBwb3NpdGlvbjogcmVsYXRpdmU7XG4gIHBhZGRpbmc6IDBweDtcbiAgLXdlYmtpdC1ib3gtc2hhZG93OiAwIDMwcHggNjBweCAwIHJnYmEoMCwgMCwgMCwgMC4zKTtcbiAgYm94LXNoYWRvdzogMCAzMHB4IDYwcHggMCByZ2JhKDAsIDAsIDAsIDAuMyk7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZDsgfVxuXG4jZm9ybUZvb3RlciB7XG4gIGJhY2tncm91bmQtY29sb3I6ICNmNmY2Zjc7XG4gIGJvcmRlci10b3A6IDFweCBzb2xpZCAjZGNlOGYxO1xuICBwYWRkaW5nOiAyNXB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIC13ZWJraXQtYm9yZGVyLXJhZGl1czogMCAwIDEwcHggMTBweDtcbiAgYm9yZGVyLXJhZGl1czogMCAwIDEwcHggMTBweDsgfVxuXG4vKiBUQUJTICovXG5oMi5pbmFjdGl2ZSB7XG4gIGNvbG9yOiAjY2NjY2NjOyB9XG5cbmgyLmFjdGl2ZSB7XG4gIGNvbG9yOiAjMGQwZDBkO1xuICBib3JkZXItYm90dG9tOiAycHggc29saWQgIzVmYmFlOTsgfVxuXG4vKiBGT1JNIFRZUE9HUkFQSFkqL1xuaW5wdXRbdHlwZT1idXR0b25dLCBpbnB1dFt0eXBlPXN1Ym1pdF0sIGlucHV0W3R5cGU9cmVzZXRdIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzFhYTNmZjtcbiAgYm9yZGVyOiBub25lO1xuICBjb2xvcjogd2hpdGU7XG4gIHBhZGRpbmc6IDE1cHggODBweDtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICB0ZXh0LWRlY29yYXRpb246IG5vbmU7XG4gIGRpc3BsYXk6IGlubGluZS1ibG9jaztcbiAgdGV4dC10cmFuc2Zvcm06IHVwcGVyY2FzZTtcbiAgZm9udC1zaXplOiAxMHB4O1xuICAtd2Via2l0LWJveC1zaGFkb3c6IDAgMTBweCAzMHB4IDAgcmdiYSg5NSwgMTg2LCAyMzMsIDAuNCk7XG4gIGJveC1zaGFkb3c6IDAgMTBweCAzMHB4IDAgcmdiYSg5NSwgMTg2LCAyMzMsIDAuNCk7XG4gIC13ZWJraXQtYm9yZGVyLXJhZGl1czogNXB4IDVweCA1cHggNXB4O1xuICBib3JkZXItcmFkaXVzOiA1cHggNXB4IDVweCA1cHg7XG4gIG1hcmdpbjogNXB4IDIwcHggNDBweCAyMHB4O1xuICAtd2Via2l0LXRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2UtaW4tb3V0O1xuICAtbW96LXRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2UtaW4tb3V0O1xuICAtbXMtdHJhbnNpdGlvbjogYWxsIDAuM3MgZWFzZS1pbi1vdXQ7XG4gIC1vLXRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2UtaW4tb3V0O1xuICB0cmFuc2l0aW9uOiBhbGwgMC4zcyBlYXNlLWluLW91dDsgfVxuXG5pbnB1dFt0eXBlPWJ1dHRvbl06aG92ZXIsIGlucHV0W3R5cGU9c3VibWl0XTpob3ZlciwgaW5wdXRbdHlwZT1yZXNldF06aG92ZXIge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjZTY4YTAwOyB9XG5cbmlucHV0W3R5cGU9YnV0dG9uXTphY3RpdmUsIGlucHV0W3R5cGU9c3VibWl0XTphY3RpdmUsIGlucHV0W3R5cGU9cmVzZXRdOmFjdGl2ZSB7XG4gIC1tb3otdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTtcbiAgLXdlYmtpdC10cmFuc2Zvcm06IHNjYWxlKDAuOTUpO1xuICAtby10cmFuc2Zvcm06IHNjYWxlKDAuOTUpO1xuICAtbXMtdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTtcbiAgdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTsgfVxuXG5pbnB1dFt0eXBlPXRleHRdLCBpbnB1dFt0eXBlPXBhc3N3b3JkXSB7XG4gIGJhY2tncm91bmQtY29sb3I6ICNmNmY2ZjY7XG4gIGJvcmRlcjogbm9uZTtcbiAgY29sb3I6ICMwZDBkMGQ7XG4gIHBhZGRpbmc6IDE1cHggMzJweDtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICB0ZXh0LWRlY29yYXRpb246IG5vbmU7XG4gIGRpc3BsYXk6IGlubGluZS1ibG9jaztcbiAgZm9udC1zaXplOiAxNnB4O1xuICBtYXJnaW46IDVweDtcbiAgd2lkdGg6IDExMCU7XG4gIGJvcmRlcjogMnB4IHNvbGlkICNmNmY2ZjY7XG4gIC13ZWJraXQtdHJhbnNpdGlvbjogYWxsIDAuNXMgZWFzZS1pbi1vdXQ7XG4gIC1tb3otdHJhbnNpdGlvbjogYWxsIDAuNXMgZWFzZS1pbi1vdXQ7XG4gIC1tcy10cmFuc2l0aW9uOiBhbGwgMC41cyBlYXNlLWluLW91dDtcbiAgLW8tdHJhbnNpdGlvbjogYWxsIDAuNXMgZWFzZS1pbi1vdXQ7XG4gIHRyYW5zaXRpb246IGFsbCAwLjVzIGVhc2UtaW4tb3V0O1xuICAtd2Via2l0LWJvcmRlci1yYWRpdXM6IDVweCA1cHggNXB4IDVweDtcbiAgYm9yZGVyLXJhZGl1czogNXB4IDVweCA1cHggNXB4OyB9XG5cbmlucHV0W3R5cGU9dGV4dF06Zm9jdXMsIGlucHV0W3R5cGU9cGFzc3dvcmRdOmZvY3VzIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogI2ZmZjtcbiAgYm9yZGVyLWJvdHRvbTogMnB4IHNvbGlkICM1ZmJhZTk7IH1cblxuaW5wdXRbdHlwZT10ZXh0XTpwbGFjZWhvbGRlciB7XG4gIGNvbG9yOiAjY2NjY2NjOyB9XG5cbi8qIEFOSU1BVElPTlMgKi9cbi8qIFNpbXBsZSBDU1MzIEZhZGUtaW4tZG93biBBbmltYXRpb24gKi9cbi5mYWRlSW5Eb3duIHtcbiAgLXdlYmtpdC1hbmltYXRpb24tbmFtZTogZmFkZUluRG93bjtcbiAgYW5pbWF0aW9uLW5hbWU6IGZhZGVJbkRvd247XG4gIC13ZWJraXQtYW5pbWF0aW9uLWR1cmF0aW9uOiAxcztcbiAgYW5pbWF0aW9uLWR1cmF0aW9uOiAxcztcbiAgLXdlYmtpdC1hbmltYXRpb24tZmlsbC1tb2RlOiBib3RoO1xuICBhbmltYXRpb24tZmlsbC1tb2RlOiBib3RoOyB9XG5cbkAtd2Via2l0LWtleWZyYW1lcyBmYWRlSW5Eb3duIHtcbiAgMCUge1xuICAgIG9wYWNpdHk6IDA7XG4gICAgLXdlYmtpdC10cmFuc2Zvcm06IHRyYW5zbGF0ZTNkKDAsIC0xMDAlLCAwKTtcbiAgICB0cmFuc2Zvcm06IHRyYW5zbGF0ZTNkKDAsIC0xMDAlLCAwKTsgfVxuICAxMDAlIHtcbiAgICBvcGFjaXR5OiAxO1xuICAgIC13ZWJraXQtdHJhbnNmb3JtOiBub25lO1xuICAgIHRyYW5zZm9ybTogbm9uZTsgfSB9XG5cbkBrZXlmcmFtZXMgZmFkZUluRG93biB7XG4gIDAlIHtcbiAgICBvcGFjaXR5OiAwO1xuICAgIC13ZWJraXQtdHJhbnNmb3JtOiB0cmFuc2xhdGUzZCgtMTAwJSwgMCwgMCk7XG4gICAgdHJhbnNmb3JtOiB0cmFuc2xhdGUzZCgtMTAwJSwgMCwgMCk7IH1cbiAgMTAwJSB7XG4gICAgb3BhY2l0eTogMTtcbiAgICAtd2Via2l0LXRyYW5zZm9ybTogbm9uZTtcbiAgICB0cmFuc2Zvcm06IG5vbmU7IH0gfVxuXG4vKiBTaW1wbGUgQ1NTMyBGYWRlLWluIEFuaW1hdGlvbiAqL1xuQC13ZWJraXQta2V5ZnJhbWVzIGZhZGVJbiB7XG4gIGZyb20ge1xuICAgIG9wYWNpdHk6IDA7IH1cbiAgdG8ge1xuICAgIG9wYWNpdHk6IDE7IH0gfVxuXG5ALW1vei1rZXlmcmFtZXMgZmFkZUluIHtcbiAgZnJvbSB7XG4gICAgb3BhY2l0eTogMDsgfVxuICB0byB7XG4gICAgb3BhY2l0eTogMTsgfSB9XG5cbkBrZXlmcmFtZXMgZmFkZUluIHtcbiAgZnJvbSB7XG4gICAgb3BhY2l0eTogMDsgfVxuICB0byB7XG4gICAgb3BhY2l0eTogMTsgfSB9XG5cbi5mYWRlSW4ge1xuICBvcGFjaXR5OiAwO1xuICAtd2Via2l0LWFuaW1hdGlvbjogZmFkZUluIGVhc2UtaW4gMTtcbiAgLW1vei1hbmltYXRpb246IGZhZGVJbiBlYXNlLWluIDE7XG4gIGFuaW1hdGlvbjogZmFkZUluIGVhc2UtaW4gMTtcbiAgLXdlYmtpdC1hbmltYXRpb24tZmlsbC1tb2RlOiBmb3J3YXJkcztcbiAgLW1vei1hbmltYXRpb24tZmlsbC1tb2RlOiBmb3J3YXJkcztcbiAgYW5pbWF0aW9uLWZpbGwtbW9kZTogZm9yd2FyZHM7XG4gIC13ZWJraXQtYW5pbWF0aW9uLWR1cmF0aW9uOiAxcztcbiAgLW1vei1hbmltYXRpb24tZHVyYXRpb246IDFzO1xuICBhbmltYXRpb24tZHVyYXRpb246IDFzOyB9XG5cbi5mYWRlSW4uZmlyc3Qge1xuICAtd2Via2l0LWFuaW1hdGlvbi1kZWxheTogMC40cztcbiAgLW1vei1hbmltYXRpb24tZGVsYXk6IDAuNHM7XG4gIGFuaW1hdGlvbi1kZWxheTogMC40czsgfVxuXG4uZmFkZUluLnNlY29uZCB7XG4gIC13ZWJraXQtYW5pbWF0aW9uLWRlbGF5OiAwLjZzO1xuICAtbW96LWFuaW1hdGlvbi1kZWxheTogMC42cztcbiAgYW5pbWF0aW9uLWRlbGF5OiAwLjZzOyB9XG5cbi5mYWRlSW4udGhpcmQge1xuICAtd2Via2l0LWFuaW1hdGlvbi1kZWxheTogMC44cztcbiAgLW1vei1hbmltYXRpb24tZGVsYXk6IDAuOHM7XG4gIGFuaW1hdGlvbi1kZWxheTogMC44czsgfVxuXG4uZmFkZUluLmZvdXJ0aCB7XG4gIC13ZWJraXQtYW5pbWF0aW9uLWRlbGF5OiAxcztcbiAgLW1vei1hbmltYXRpb24tZGVsYXk6IDFzO1xuICBhbmltYXRpb24tZGVsYXk6IDFzOyB9XG5cbi8qIFNpbXBsZSBDU1MzIEZhZGUtaW4gQW5pbWF0aW9uICovXG4udW5kZXJsaW5lSG92ZXI6YWZ0ZXIge1xuICBkaXNwbGF5OiBibG9jaztcbiAgbGVmdDogMDtcbiAgYm90dG9tOiAtMTBweDtcbiAgd2lkdGg6IDA7XG4gIGhlaWdodDogMnB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTZiYWVkO1xuICBjb250ZW50OiBcIlwiO1xuICB0cmFuc2l0aW9uOiB3aWR0aCAwLjJzOyB9XG5cbi51bmRlcmxpbmVIb3Zlcjpob3ZlciB7XG4gIC8qY29sb3I6ICMxYWEzZmY7Ki8gfVxuXG4udW5kZXJsaW5lSG92ZXI6aG92ZXI6YWZ0ZXIge1xuICB3aWR0aDogMTAwJTsgfVxuXG4vKiBPVEhFUlMgKi9cbio6Zm9jdXMge1xuICBvdXRsaW5lOiBub25lOyB9XG5cbiNpY29uIHtcbiAgd2lkdGg6IDYwJTsgfVxuXG5odG1sLCBib2R5IHtcbiAgaGVpZ2h0OiAxMDAlOyB9XG5cbi8qZm9vdGVyIGNzcyovXG4jd3JhcCB7XG4gIG1pbi1oZWlnaHQ6IDEwMCU7IH1cblxuI21haW4ge1xuICBvdmVyZmxvdzogYXV0bztcbiAgcGFkZGluZy1ib3R0b206IDE1MHB4O1xuICAvKiB0aGlzIG5lZWRzIHRvIGJlIGJpZ2dlciB0aGFuIGZvb3RlciBoZWlnaHQqLyB9XG5cbi5wYWdlLWZvb3RlciB7XG4gIGJhY2tncm91bmQtY29sb3I6ICMwMDI4NGQ7XG4gIGNvbG9yOiB3aGl0ZTsgfVxuXG4uZm9vdGVyLWNvcHlyaWdodCB7XG4gIGNvbG9yOiB3aGl0ZTsgfVxuXG4uZm9vdGVyLWxpbmsge1xuICBjb2xvcjogd2hpdGU7XG4gIHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lOyB9XG5cbi5mb290ZXItbGluazpob3ZlciB7XG4gIGNvbG9yOiAjZTY4YTAwO1xuICB0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTsgfVxuXG4uZm9vdGVyLW1hcmdpbiB7XG4gIHBvc2l0aW9uOiBmaXhlZDtcbiAgYm90dG9tOiAwO1xuICB3aWR0aDogMTAwJTtcbiAgLyogU2V0IHRoZSBmaXhlZCBoZWlnaHQgb2YgdGhlIGZvb3RlciBoZXJlICovXG4gIGhlaWdodDogMTAwcHg7XG4gIC8qbGluZS1oZWlnaHQ6IDEwMHB4OyovXG4gIC8qIFZlcnRpY2FsbHkgY2VudGVyIHRoZSB0ZXh0IHRoZXJlICovIH1cblxuLmNlbnRlciB7XG4gIG1hcmdpbi1sZWZ0OiBhdXRvO1xuICBtYXJnaW4tcmlnaHQ6IGF1dG87XG4gIGRpc3BsYXk6IGJsb2NrOyB9XG4iXX0= */"

/***/ }),

/***/ "./src/app/pquejaini/pquejaini.component.ts":
/*!**************************************************!*\
  !*** ./src/app/pquejaini/pquejaini.component.ts ***!
  \**************************************************/
/*! exports provided: PquejainiComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PquejainiComponent", function() { return PquejainiComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_quejasini_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/quejasini.service */ "./src/app/shared/quejasini.service.ts");
/* harmony import */ var _shared_quejaini_model__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../shared/quejaini.model */ "./src/app/shared/quejaini.model.ts");
/* harmony import */ var ng2_file_upload__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ng2-file-upload */ "./node_modules/ng2-file-upload/fesm5/ng2-file-upload.js");
/* harmony import */ var _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../shared/consumidores.service */ "./src/app/shared/consumidores.service.ts");
/* harmony import */ var _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../shared/proveedores.service */ "./src/app/shared/proveedores.service.ts");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var _shared_usuario_model__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ../shared/usuario.model */ "./src/app/shared/usuario.model.ts");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var _buscaprov_buscaprov_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ../buscaprov/buscaprov.component */ "./src/app/buscaprov/buscaprov.component.ts");
/* harmony import */ var util__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! util */ "./node_modules/util/util.js");
/* harmony import */ var util__WEBPACK_IMPORTED_MODULE_14___default = /*#__PURE__*/__webpack_require__.n(util__WEBPACK_IMPORTED_MODULE_14__);
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! sweetalert2 */ "./node_modules/sweetalert2/dist/sweetalert2.all.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_15___default = /*#__PURE__*/__webpack_require__.n(sweetalert2__WEBPACK_IMPORTED_MODULE_15__);

//import { Component, OnInit } from '@angular/core';

//import { ormGroup,  FormControl } from '@angular/forms';










//import { MyCustomDialogService } from '../my-custom-dialog/my-custom-dialog.service';




var PquejainiComponent = /** @class */ (function () {
    //constructor() { }
    function PquejainiComponent(router, dialog, consumidoresService, proveedoresService, quejasService, _route, _compiler) {
        this.router = router;
        this.dialog = dialog;
        this.consumidoresService = consumidoresService;
        this.proveedoresService = proveedoresService;
        this.quejasService = quejasService;
        this._route = _route;
        this._compiler = _compiler;
        this.nproveedor = "";
        this.idproveedor = "";
        this.conciliacion = "";
        this.vanio = 0;
        this.vsecanio = 0;
        this.vsecuencia2 = "";
        this.vidqueja = 0;
        this.vidimagen = 2;
        this.presencial = "0";
        this.vdpi = -1;
        this.vfac = -1;
        this.vact = -1;
        this.contador = 0;
        this.contador1 = 0;
        this.existingModeConsumidor = false;
        this.existingModeProveedor = false;
        this.vsecuencia = "";
        this.vdato = "";
        this.vid = "";
        this.continuar = '1';
        this.cancelar = "Cancelar";
        this.uploader = new ng2_file_upload__WEBPACK_IMPORTED_MODULE_7__["FileUploader"]({
            url: _conc_virt_const__WEBPACK_IMPORTED_MODULE_10__["BASE_URL_REST_FILE2"],
            itemAlias: 'document'
        });
        this.success = false;
        this.successFile = true;
        this.showSpinner = false;
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.factRepetida = false;
        this.factNoRepetida = false;
        this.conteoRepetido = 0;
        this.serieNumeroFactura = "";
        this.mostrarCamposProveedor = false;
        //console.info(this._route.snapshot.paramMap.get('id'));
    }
    PquejainiComponent.prototype.onKey = function (event) {
        this.contador = event.target.value.length;
    };
    PquejainiComponent.prototype.onKey1 = function (event) {
        this.contador1 = event.target.value.length;
    };
    PquejainiComponent.prototype.ngOnDestroy = function () {
        ////console.log("finaliza");
    };
    PquejainiComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._route.params.subscribe(function (params) {
            _this.vdato = params.dato;
            _this.vid = params.id;
        });
        //verificar parametros
        //console.info("--->>",this.vdato,this.vid,this.vqueja);
        if ((this.vdato == "presencial" || this.vdato == "callcenter") && this.vid != "") {
            this.findByQuejaById();
        }
        else {
            alert("No puede ingresar al sistema, favor verifique.");
            this.continuar = '0';
            return;
        }
        // listener cuando finaliza la operacion de creacion
        this.quejaOperationSubscription = this.quejasService.operation.subscribe(function (queja) {
            // limpia sesion
            _this.quejaForm.reset();
            _this.success = true;
            _this.successFile = true;
            _this.nproveedor = "";
            _this.conciliacion = "";
        });
        /*
        this.customDialogForm = fb.group({
            dialogTitle: ['Title'],
            dialogMsg: [''],
            dialogType: ['alert'],
            okBtnColor: [''],
            okBtnLabel: [''],
            cancelBtnColor: [''],
            cancelBtnLabel: ['']
          });
          */
        //this._route.params.subscribe(
        //  (params: Params) => {
        //    this.vid = params.id;
        //  }
        //);
        this.initQuejaForm();
        //this.initConsumidorForm(null);
        //this.vid = this._route.snapshot.paramMap.get('id')
        //console.info(this.vid);
    };
    PquejainiComponent.prototype.initQuejaForm = function () {
        this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'nombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'apellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'dpiPasaporte': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'correo': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'serieNumeroFactura': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'ubicacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('')
            //,'ffactura': new FormControl('',Validators.required)
            //,'fdpi': new FormControl('',Validators.required)
        });
        this.nproveedor = "";
        this.conciliacion = "";
        this.dpiIndex = -1;
        this.facturaIndex = -1;
        ////console.log("inicializa");
    };
    PquejainiComponent.prototype.onFileChanged = function (type) {
        console.info(type);
        this.vact = this.uploader.queue.length - 1;
        console.info(this.factura);
        if (this.uploader.queue.length > 0) {
            if (type == 'FAC') {
                if (this.factura && this.facturaIndex > -1) {
                    var facturaItem = this.uploader.queue[this.facturaIndex];
                    this.uploader.removeFromQueue(facturaItem);
                }
                this.factura = this.uploader.queue[this.uploader.queue.length - 1];
                this.facturaIndex = this.uploader.queue.length - 1;
                if (this.dpiIndex == this.facturaIndex) {
                    this.dpiIndex = this.dpiIndex - 1;
                }
            }
            else if (type == 'DPI') {
                if (this.dpi && this.dpiIndex > -1) {
                    var dpiItem = this.uploader.queue[this.dpiIndex];
                    this.uploader.removeFromQueue(dpiItem);
                }
                this.dpi = this.uploader.queue[this.uploader.queue.length - 1];
                this.dpiIndex = this.uploader.queue.length - 1;
                if (this.dpiIndex == this.facturaIndex) {
                    this.facturaIndex = this.facturaIndex - 1;
                }
            }
            if (this.uploader.queue.length == 0) {
                this.dpiIndex = -1;
                this.facturaIndex = -1;
            }
            //console.info(this.factura);
            //console.info(this.dpi);
            //console.info(this.uploader.queue.length);
            //console.info(this.facturaIndex);
            //console.info(this.dpiIndex);
            if (this.uploader.queue.length == 2) {
                this.successFile = false;
            }
            else {
                this.successFile = true;
            }
            //console.info(this.uploader.queue.length);	
            //console.info(this.uploader);
        }
    };
    /*
      onRemoveClicked(index: number) {
        let removeItem = this.uploader.queue[index];
        this.uploader.removeFromQueue(removeItem);
        if (index == this.facturaIndex) {
          this.facturaIndex = null;
          this.factura = null;
        } else if (index == this.dpiIndex) {
          this.dpiIndex = null;
          this.dpi = null;
        }
      }*/
    PquejainiComponent.prototype.onSubmit = function () {
        var _this = this;
        this.showSpinner = true;
        var queja = new _shared_quejaini_model__WEBPACK_IMPORTED_MODULE_6__["Quejaini"]();
        queja.nombre = this.quejaForm.value.nombre;
        queja.apellido = this.quejaForm.value.apellido;
        queja.dpiPasaporte = this.quejaForm.value.dpiPasaporte;
        queja.telefono = this.quejaForm.value.telefono;
        queja.correo = this.quejaForm.value.correo;
        queja.detalleQueja = this.quejaForm.value.detalleQueja;
        queja.solicitaQue = this.quejaForm.value.solicitaQue;
        queja.nitProveedor = this.quejaForm.value.nitProveedor;
        queja.ubicacion = this.quejaForm.value.ubicacion;
        queja.anio = 0;
        queja.secuencia = 0;
        queja.facturaNumero = this.quejaForm.value.serieNumeroFactura;
        //existingModeConsumidor es true si el consumidor ya está en base de datos. existingConsumidor trae el objeto del registro.
        if (this.existingModeConsumidor) {
            queja.idConsumidor = this.existingConsumidor.idConsumidor;
        }
        else {
            queja.idConsumidor = 0;
        }
        //existingModeProveedor es true si el consumidor ya está en base de datos. existingProveedor trae el objeto del registro.
        if (this.existingModeProveedor) {
            queja.idProveedor = this.existingProveedor.idProveedor;
        }
        else {
            queja.idProveedor = 0;
        }
        console.log('el valor del tipo', this.vdato);
        if (this.vdato == "presencial") {
            queja.presencial = "1";
            queja.idFuente = "presentially";
            // verifica que esten ingresados los 2 archivos
            if (this.dpi == null || this.factura == null) {
                alert("Debe de ingresar Datos adjuntos requeridos.");
                this.showSpinner = false;
                return;
            }
        }
        else {
            queja.idFuente = "Call Center";
        }
        //coloca los archivos en orden.
        /*
         if (this.uploader.queue.length >= 2) {
            let removeItem = this.uploader.queue[1];
            this.uploader.removeFromQueue(removeItem);
            removeItem = this.uploader.queue[0];
            this.uploader.removeFromQueue(removeItem);
            this.uploader.queue.push(this.factura);
            this.uploader.queue.push(this.dpi);
            console.info(this.uploader.queue.length);
            }
        */
        //queja = this.quejasService.createQueja(queja, this.uploader).susbribe;
        this.quejasService.saveData(queja, '/noupload').subscribe(function (retvalue) {
            _this.showSpinner = true;
            if (retvalue) {
                var tempstr = retvalue['value'];
                if (tempstr != null && tempstr != '') {
                    //this.registrodata=JSON.parse('['+retvalue["value"].slice(0, -1) +']');
                    _this.vanio = tempstr.anio;
                    _this.vsecanio = tempstr.secuencia;
                    _this.vidqueja = tempstr.idQueja;
                    _this.presencial = tempstr.conciliacion;
                    if (_this.uploader.queue.length > 0 && _this.vdato == "presencial") {
                        var estado_1 = true;
                        _this.uploader.onBeforeUploadItem = function (removeItem) {
                            removeItem.withCredentials = false;
                            //removeItem.url = BASE_URL_REST_FILE + 'quejas/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen;
                            //BASE_URL_REST_FILE + 'quejasini/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen,
                            for (var i = 0; i < _this.uploader.queue.length; i++) {
                                console.log("modifica url - inicio");
                                console.log(i);
                                var removeItem_1 = _this.uploader.queue[i];
                                if (removeItem_1 == _this.dpi) {
                                    console.log("cambia url dpi");
                                    _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_10__["BASE_URL_REST_FILE2"] + 'quejasini/upload?id_queja=' + _this.vidqueja + "&id_categoria_imagen=" + 2 + "&correo=0&data=0";
                                    console.log(_this.uploader.queue[i].url);
                                    console.log(removeItem_1);
                                }
                                else {
                                    if (removeItem_1 == _this.factura) {
                                        console.log("cambia url factura");
                                        _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_10__["BASE_URL_REST_FILE2"] + 'quejasini/upload?id_queja=' + _this.vidqueja + "&id_categoria_imagen=" + 3 + "&correo=0&data=0";
                                        console.log(_this.uploader.queue[i].url);
                                        console.log(removeItem_1);
                                    }
                                    else {
                                        console.log("cambia url otro");
                                        _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_10__["BASE_URL_REST_FILE2"] + 'quejasini/upload?id_queja=' + _this.vidqueja + "&id_categoria_imagen=" + 1 + "&correo=0&data=0";
                                        console.log(_this.uploader.queue[i].url);
                                        console.log(removeItem_1);
                                    }
                                }
                                console.log("modifica url - fin");
                            }
                        };
                        _this.uploader.setOptions({
                            //url: BASE_URL_REST_FILE2 + 'quejasini/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen,
                            itemAlias: 'file'
                        });
                        _this.uploader.onCompleteAll = function () {
                            // finalizo la carga de todos los archivos
                            _this.operation.next(retvalue.value);
                            if (estado_1) {
                                _this.onDismissClicked();
                                _this.showSpinner = false;
                                _this.cancelar = "Nuevo";
                                _this.success = true;
                            }
                            else {
                                alert("Ocurrio un error al cargar sus archivos, por favor verifique.  Gracias.");
                            }
                        };
                        _this.uploader.onCompleteItem = function (item, uploadResponse, status, headers) {
                            // finalizo la carga de un archivo
                            _this.vidimagen = _this.vidimagen + 1;
                            if (status == 0) {
                                //this.success = false;
                                estado_1 = false;
                            }
                            else {
                                //this.success = true;
                            }
                        };
                        _this.uploader.uploadAll();
                    }
                    else {
                        _this.operation.next(retvalue.value);
                        _this.onDismissClicked();
                        _this.success = true;
                    }
                }
                else {
                    ////console.log('no llego');
                }
            }
            else {
                ////console.log('Rest service response ERROR.');
            }
        });
        //this.findSecuenciaId();
        //////console.info("onsSumiT");
        //this.vanio = queja.anio;
        //  this.vsecanio = queja.noQueja;
        ////console.info('-------------------');
        ////console.info(queja);
        ////console.info('-------------------');
    };
    PquejainiComponent.prototype.onDismissClicked = function () {
        this.success = true;
        this.successFile = false;
        this.factura = null;
        this.dpi = null;
        //this.initQuejaForm();
        console.info("ondismissclicked", this.uploader.queue.length);
        if (this.uploader.queue.length > 0) {
            var pItem = this.uploader.queue[0];
            this.uploader.removeFromQueue(pItem);
            this.uploader.clearQueue();
        }
        this.showSpinner = false;
        sweetalert2__WEBPACK_IMPORTED_MODULE_15___default.a.fire('Registro exitoso...', "Su n\u00FAmero de Queja es: <h1 class=\"display-1\">" + this.vsecanio + "-" + this.vanio + "</h1>", 'success');
        this.quejaForm.reset();
        this._compiler.clearCache();
        ////console.info("onDismm");
    };
    PquejainiComponent.prototype.initConsumidor = function (consumidor, tipo) {
        if (tipo == 0) {
            this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
                'nombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre1 +
                    (consumidor ? ' ' + (consumidor.nombre2 == null ? '' : consumidor.nombre2) +
                        (consumidor != null ? ' ' + (consumidor.nombre3 == null ? '' : consumidor.nombre3) : '') : '') : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'apellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellido1 + (consumidor ? ' ' + (consumidor.apellido2 == null ? '' : consumidor.apellido2) : '') : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'apellidoCasada': new FormControl(consumidor ? consumidor.apellidoCasada : ''),
                'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefono : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'telefonoDomicilio': new FormControl(consumidor ? consumidor.domicilio : ''),
                'correo': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.correoElectronico1 : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].email),
                'dpiPasaporte': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.documentoIdentificacion : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.detalleQueja, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.solicitaQue, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.nitProveedor),
                'serieNumeroFactura': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.serieNumeroFactura, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'ubicacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.ubicacion)
            });
        }
        else {
            this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
                'nombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre1 +
                    (consumidor ? ' ' + (consumidor.nombre2 == null ? '' : consumidor.nombre2) +
                        (consumidor != null ? ' ' + (consumidor.nombre3 == null ? '' : consumidor.nombre3) : '') : '') : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'apellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellido1 + (consumidor ? ' ' + (consumidor.apellido2 == null ? '' : consumidor.apellido2) : '') : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'apellidoCasada': new FormControl(consumidor ? consumidor.apellidoCasada : ''),
                'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefono : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'telefonoDomicilio': new FormControl(consumidor ? consumidor.domicilio : ''),
                'correo': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.correoElectronico1 : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].email),
                'dpiPasaporte': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.dpiPasaporte, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.detalleQueja, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.solicitaQue, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.nitProveedor),
                'serieNumeroFactura': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.serieNumeroFactura, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'ubicacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.ubicacion)
            });
        }
        this.findBySecuencia();
        //////console.log("inicializa consumidor");
    };
    PquejainiComponent.prototype.initProveedor = function (nit) {
        this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'nombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.nombre, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'apellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.apellido, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.telefono, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'correo': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.correo, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].email),
            'dpiPasaporte': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.dpiPasaporte, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.detalleQueja, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.solicitaQue, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](nit),
            /*
            'primerNombre': new FormControl(proveedor ? proveedor.primerNombre : ''),
            'segundoNombre': new FormControl(proveedor ? proveedor.segundoNombre : ''),
            'tercerNombre': new FormControl(proveedor ? proveedor.tercerNombre : ''),
            'primerApellido': new FormControl(proveedor ? proveedor.primerApellido : ''),
            'segundoApellido': new FormControl(proveedor ? proveedor.segundoApellido : ''),
            'apellidoCasada': new FormControl(proveedor ? proveedor.apellidoCasada : ''),
            'nombreEmpresa': new FormControl(proveedor ? proveedor.nombreEmpresa : ''),
            'razonSocial': new FormControl(proveedor ? proveedor.razonSocial : ''),
            */
            'serieNumeroFactura': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.serieNumeroFactura, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'ubicacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.ubicacion)
        });
        //////console.log("inicializa consumidor");
    };
    PquejainiComponent.prototype.onDocumentoIdentificacionChanged = function () {
        var _this = this;
        //////console.log(this.quejaForm.value.dpiPasaporte);
        this.consumidoresService.fetchDataI(this.quejaForm.value.dpiPasaporte).subscribe(function (response) {
            if (response.value) {
                // inicializar formulario con valores predeterminados
                _this.existingModeConsumidor = true;
                _this.existingConsumidor = response.value;
                _this.initConsumidor(response.value, 0);
                //queja.dpiPasaporte = this.quejaForm.value.dpiPasaporte;
            }
            else {
                _this.existingModeConsumidor = false;
                _this.existingConsumidor = null;
                _this.initConsumidor(null, 1);
            }
        });
        //////console.log("ingreso al onDocumentoIdentificacionChanged");
    };
    PquejainiComponent.prototype.onFacturaChanged = function () {
        var _this = this;
        console.log('Factura Changed');
        this.conteoRepetido = 0;
        this.factRepetida = false;
        this.quejasService.fetchDataFact(this.idproveedor).subscribe(function (response) {
            if (response["reason"] == 'OK') {
                var tempstr = response['value'];
                if (tempstr != null && tempstr != '') {
                    console.log('Cantidad de Objetos en Array: ' + tempstr.length);
                    for (var i = 0; i < tempstr.length; i++) {
                        console.log('Valor de respuesta: ' + tempstr[i].idQueja);
                        console.log('Valor de serieNumeroFactura: ' + _this.quejaForm.value.serieNumeroFactura);
                        if (tempstr[i].facturaNumero == _this.quejaForm.value.serieNumeroFactura) {
                            console.log('Es igual');
                            _this.conteoRepetido++;
                        }
                        else {
                            console.log('No es igual');
                        }
                        if (_this.conteoRepetido > 0) {
                            /* this.factRepetida=true; */
                            _this.factNoRepetida = false;
                            sweetalert2__WEBPACK_IMPORTED_MODULE_15___default.a.fire({
                                title: 'Factura ó Contrato existente',
                                text: "La serie y n\u00FAmero de Factura \u00F3 contrato: " + _this.quejaForm.value.serieNumeroFactura + " ya se encuentra en base de datos.",
                                icon: 'error',
                                confirmButtonText: "Regresar",
                                showConfirmButton: true,
                            }); /* .then((result) => {
                                
                                if (result.isConfirmed) {
                                  Swal.fire('Saved!', '', 'success')
                                }
                            }) */
                            _this.serieNumeroFactura = "";
                        }
                        else {
                            _this.factNoRepetida = true;
                        }
                    }
                    /* this.confacc_list=JSON.parse('['+retvalue["value"].slice(0, -1) +']');
                    this.addCheckboxes();
                    console.log(this.confacc_list);
                    this.btnvisible=true; */
                }
                else {
                    /* this.confacc_list='';
                    this.tabledata=false; */
                }
                /* this.flagformvisible++; */
            }
            else {
                console.log('Rest service response ERROR.');
                /* this.flagInfoError=true;
                this.SetSecTimerInfoError(); */
            }
        });
    };
    PquejainiComponent.prototype.onProveedorChanged = function () {
        var _this = this;
        var dialogConfig = new _angular_material__WEBPACK_IMPORTED_MODULE_12__["MatDialogConfig"]();
        this.mostrarCamposProveedor = true;
        dialogConfig.disableClose = false;
        dialogConfig.autoFocus = true;
        var dialogRef = this.dialog.open(_buscaprov_buscaprov_component__WEBPACK_IMPORTED_MODULE_13__["BuscaprovComponent"], dialogConfig);
        dialogRef.afterClosed().subscribe(function (data) {
            if (!Object(util__WEBPACK_IMPORTED_MODULE_14__["isUndefined"])(data)) {
                console.info(data);
                // inicializar formulario con valores predeterminados
                _this.existingModeProveedor = true;
                _this.existingProveedor = data;
                _this.initProveedor(data.nitProveedor);
                _this.nproveedor = data.nombre;
                _this.idproveedor = data.idProveedor;
                _this.conciliacion = data.habilitadoConciliacionPrevia;
            }
            else {
                _this.existingModeProveedor = false;
                _this.existingProveedor = null;
                _this.nproveedor = "";
                _this.conciliacion = "";
            }
        }, function (error) { return console.info('Undefined data. No will insert 2'); }); //this.logService.print(error, LogService.ERROR_MSG));
        /*
        //////console.log(this.quejaForm.value.nitProveedor);
      this.proveedoresService.fetchData(this.quejaForm.value.nitProveedor).subscribe(
        (response) => {
          if (response.value) {
            // inicializar formulario con valores predeterminados
            this.existingModeProveedor = true;
            this.existingProveedor = response.value;
            this.initProveedor(response.value);
            this.nproveedor = response.value.nombre;
          } else {
            this.existingModeProveedor = false;
            this.existingProveedor = null;
            this.nproveedor = "";
          }
        }
      );
      //////console.log("ingreso al onProveedorChanged");
      */
    };
    PquejainiComponent.prototype.initNoQueja = function (queja) {
        this.vanio = (queja ? queja.anio : 0);
        this.vsecanio = (queja ? queja.noQueja : 0);
        ////console.info('initNoQueja|');
        ////console.info(this.vanio);
        ////console.info(this.vsecanio);
    };
    PquejainiComponent.prototype.findSecuenciaId = function () {
        var _this = this;
        if (this.vsecuencia = "") {
        }
        else {
            this.quejasService.fetchDataSecId(this.vsecuencia).subscribe(function (response) {
                if (response.value) {
                    // inicializar formulario con valores predeterminados
                    ////console.info("findSecuenc");
                    _this.initNoQueja(response.value);
                }
            });
        }
    };
    PquejainiComponent.prototype.findBySecuencia = function () {
        var _this = this;
        this.quejasService.fetchDataSecuencia().subscribe(function (response) {
            if (response.value) {
                // inicializar formulario con valores predeterminados
                //
                _this.vsecuencia2 = response.value;
                _this.vsecuencia = response.value;
            }
        });
    };
    PquejainiComponent.prototype.openCustomDialog = function () {
        console.log("this.customDialogForm.value");
        //this.customDialog.openAlertDialog(this.customDialogForm.value);
        this.success = false;
    };
    /***
    * obtiene los datoa de la queja
    ***/
    PquejainiComponent.prototype.findByQuejaById = function () {
        var _this = this;
        //console.info("findByQuejaById ini ",this.vdato, this.vid, this.vqueja);
        //this.quejasService.fetchDataQuejaById(this.vdato+'I', this.vid, "0000000").subscribe(
        this.quejasService.fetchDataQuejaById("presencial" + 'I', this.vid, "0000000").subscribe(function (response) {
            var tempstr = response.value;
            //console.info("findByQuejaById consumidor ",tempstr);
            console.log(tempstr);
            if (tempstr != null || tempstr != undefined) {
                console.info("existe", tempstr);
                _this._usuario = new _shared_usuario_model__WEBPACK_IMPORTED_MODULE_11__["Usuario"]();
                _this._usuario.username = tempstr.login;
                _this._usuario.userid = tempstr.idUsuario;
                _this._usuario.code = tempstr.nombre;
                /*
                this.quejasService.initQuejat(tempstr);
                   if (this.quejasService.initQuejat != null) {
                        this.continuar = "1";
                        this.initConsumidorForm(null);
                        this.findByTokenConsumidor();
                   } else
                        this.continuar = "0";
                    */
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                _this.continuar = "0";
                alert("Su acceso al sistema fue denegado, por favor verifique.");
            }
        });
    };
    PquejainiComponent.prototype.continuarPresencial = function () {
        //se agrega ruta para llamar a la consulta de 30-40 campos
        //this.router.navigate(['/consumidor/'+this.vdato+'/'+this.vid+'/'+this.vidqueja]);
        this.router.navigate(['/consumidor/' + "presencial" + '/' + this.vid + '/' + this.vidqueja]);
    };
    //graba datos para imprimir la queja
    PquejainiComponent.prototype.onPrintQueja = function () {
        var _this = this;
        this.quejasService.add_FormQueja(this.vidqueja, this._usuario.userid, this.vid).subscribe(function (response) {
            var tempstr = response;
            console.info("findByQuejaById consumidor ", tempstr);
            if (tempstr != null || tempstr != undefined) {
                console.info("existe", tempstr);
                if (tempstr.reason = "OK") {
                    console.log('entro a getFormularioQuejaRegistro');
                    var tempresponse = tempstr['value'];
                    var registrodata = JSON.parse('[' + response["value"].slice(0, -1) + ']');
                    console.log('entro a getFormularioQuejaRegistro', registrodata[0]['id'], tempresponse, tempstr.value["id"], tempresponse["id"], tempresponse['id'], tempresponse.id, tempstr['value']['id']);
                    //this.quejasService.getFormularioQuejaRegistro(registrodata[0]['id'],this.vid).subscribe((Data)=>{
                    _this.quejasService.getFormularioQuejaRegistro(_this.vidqueja, _this.vid).subscribe(function (Data) {
                        console.log('entro a openRegisto');
                        //this._registrosservice.FileDownLoadChoose(Data,1);
                        var blob = new Blob([Data], { type: 'application/pdf' });
                        var url = window.URL.createObjectURL(blob);
                        var pwa = window.open(url);
                        if (!pwa || pwa.closed || typeof pwa.closed == 'undefined') {
                            alert('Por favor deshabilite su bloqueador de Pop-ups e intente de nuevo.');
                        }
                        //this.flagInfoError=false;
                    }, function (error) {
                        console.log(error);
                        //this.flagInfoError=true;
                        //this.SetSecTimerInfoError();
                    });
                }
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                alert("Error no se logró imprimir su solicitud por favor ingrese al sistema para reimpresión, gracias.");
            }
        });
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ViewChild"])('filDpi'),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", _angular_core__WEBPACK_IMPORTED_MODULE_1__["ElementRef"])
    ], PquejainiComponent.prototype, "filDpi", void 0);
    PquejainiComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-pquejaini',
            template: __webpack_require__(/*! ./pquejaini.component.html */ "./src/app/pquejaini/pquejaini.component.html"),
            styles: [__webpack_require__(/*! ./pquejaini.component.scss */ "./src/app/pquejaini/pquejaini.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"],
            _angular_material__WEBPACK_IMPORTED_MODULE_12__["MatDialog"],
            _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_8__["ConsumidoresService"],
            _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_9__["ProveedoresService"],
            _shared_quejasini_service__WEBPACK_IMPORTED_MODULE_5__["QuejasIniService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_4__["ActivatedRoute"],
            _angular_core__WEBPACK_IMPORTED_MODULE_1__["Compiler"]])
    ], PquejainiComponent);
    return PquejainiComponent;
}());



/***/ }),

/***/ "./src/app/proveedor/proveedor.component.html":
/*!****************************************************!*\
  !*** ./src/app/proveedor/proveedor.component.html ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n<head>\n</head>\n<body>\n\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <span class=\"navbar-text whitefont\">DIACO  \n    <span class=\"badge badge-secondary\"> {{str_queja}}</span> \n    - Datos de proveedor \n  </span>\n  <!--span class=\"navbar-text whitefont\">&nbsp;&nbsp;&nbsp;Proveedor: {{nombre_proveedor}}</span-->\n  <!---- <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>--->\n  <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n  <ul class=\"navbar-nav mr-auto\">\n   <!----     <li class=\"nav-item active\">\n        <a class=\"nav-link whitelink\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Features</a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Pricing</a>\n      </li>--->\n    </ul>  \n  </div>\n  <span class=\"navbar-text whitefont\">\n   {{str_usuario}}  \n  </span>\n  <!--span class=\"navbar-text whitefont\">\n    <a class=\"nav-link whitelink\" [routerLink]=\"['/Login']\">Cerrar Sesi&oacute;n</a>\n  </span-->\n</nav>\n\n<div class=\"container\">\n<div class=\"row\">\n\t <div class=\"col-lg-12\">\n\t\t&nbsp;\n\t </div>\n\t</div>\n  <div class=\"row\">\n    \n    <div class=\"col-sm-12\">\n      <form (ngSubmit)=\"onSubmit()\" [formGroup]=\"proveedorForm\">\n        <div class=\"form-group row\">\n          <label for=\"proveedorComun\" class=\"col-sm-2 col-form-label\">Proveedores comunes</label>\n          <div class=\"col-sm-10\">\n            <select\n              id=\"proveedorComun\"\n              class=\"form-control\"\n\t\t\t  formControlName=\"proveedorComun\"\n\t\t\t  (change)=\"onProveedoresComunesChanged()\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Seleccione proveedor\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  >\n              <option disabled select>Escoger</option>\n\t\t\t  <option value=\"{{proveedorComun.id_proveedor}}\" *ngFor=\"let proveedorComun of proveedoresComunes\">\n\t\t\t  {{proveedorComun.proveedor}}</option>\n            </select>\n\t\t\t\n\t\t\t\t\n          </div>\n        </div>\n        <div class=\"row\">\n          <p>Si el proveedor no está en el listado por favor ingrese el NIT del proveedor</p>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"nitProveedor\" class=\"col-sm-2 col-form-label\">NIT</label>\n          <div class=\"col-sm-5\">\n            <input\n              id=\"nitProveedor\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"nitProveedor\"\n\t\t\t        (change)=\"onBuscarProveedorClicked()\">\n          </div>\n          <!--div class=\"col-sm-5\">\n            <button type=\"button\" class=\"btn btn-primary\" (click)=\"onBuscarProveedorClicked()\">Buscar datos</button>\n          </div-->\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"tipoProveedor\" class=\"col-sm-2 col-form-label\">(*) Tipo de proveedor</label>\n          <div class=\"col-sm-10\">\n            <select\n              id=\"tipoProveedor\"\n              class=\"form-control\"\n              formControlName=\"tipoProveedor\">\n              <option value=\"6\">Individual</option>\n              <option value=\"7\">Juridico</option>\n            </select>\n          </div>\n        </div>\n        <div class=\"form-group row\" *ngIf=\"proveedorForm.value.tipoProveedor == '6'\">\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"primerNombre\" class=\"col-sm-6 col-form-label\">(*) Primer Nombre</label>\n              <div class=\"col-sm-6\">\n                <input\n                  id=\"primerNombre\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"primerNombre\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese primer nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"primer nombre\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"segundoNombre\" class=\"col-sm-6 col-form-label\">Segundo Nombre</label>\n              <div class=\"col-sm-6\">\n                <input\n                  id=\"segundoNombre\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"segundoNombre\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese segundo nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Segundo nombre\"\n\t\t\t\t\t  \n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"tercerNombre\" class=\"col-sm-6 col-form-label\">Tercer Nombre</label>\n              <div class=\"col-sm-6\">\n                <input\n                  id=\"tercerNombre\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"tercerNombre\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese tercer nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Tercer nombre\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\" *ngIf=\"proveedorForm.value.tipoProveedor == '6'\">\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"primerApellido\" class=\"col-sm-6 col-form-label\">(*) Primer Apellido</label>\n              <div class=\"col-sm-6\">\n                <input\n                  id=\"primerApellido\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"primerApellido\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese primer apellido\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Primer apellido\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"segundoApellido\" class=\"col-sm-6 col-form-label\">Segundo Apellido</label>\n              <div class=\"col-sm-6\">\n                <input\n                  id=\"segundoApellido\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"segundoApellido\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese segundo nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Segundo nombre\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"apellidoCasada\" class=\"col-sm-6 col-form-label\">Apellido Casada</label>\n              <div class=\"col-sm-6\">\n                <input\n                  id=\"apellidoCasada\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"apellidoCasada\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese apellido de casada\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Apellido de casada\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"nombreEmpresa\" class=\"col-sm-2 col-form-label\">(*) Nombre de la empresa</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"nombreEmpresa\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"nombreEmpresa\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nombre de la empresa\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nombre empresa\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n        <div class=\"form-group row\" *ngIf=\"proveedorForm.value.tipoProveedor == '7'\">\n          <label for=\"razonSocial\" class=\"col-sm-2 col-form-label\">(*) Razón social</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"razonSocial\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"razonSocial\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese razon social\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Razon social\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col sm-6\">\n            <div class=\"row\">\n              <label for=\"actividadEconomica\" class=\"col-sm-4 col-form-label\">(*) Actividad económica</label>\n              <div class=\"col-sm-8\">\n                <select\n                  id=\"actividadEconomica\"\n                  class=\"form-control\"\n                  formControlName=\"actividadEconomica\"\n                  (change)=\"onActividadEconomicaChanged()\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese actividad economica\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Actividad economica\"\n\t\t\t\t\t  >\n                  <option disabled selected>Escoger</option>\n                  <option value=\"{{actividadEconomica.idActividadEconomica}}\" *ngFor=\"let actividadEconomica of actividadesEconomicas\">{{actividadEconomica.nombreActividadEconomica}}</option>\n                </select>\n              </div>\n            </div>\n          </div>\n          <div class=\"col sm-6\">\n            <div class=\"row\">\n              <label for=\"tipoComercio\" class=\"col-sm-2 col-form-label\">Tipo comercio</label>\n              <div class=\"col-sm-10\">\n                <select\n                  id=\"tipoComercio\"\n                  class=\"form-control\"\n                  formControlName=\"tipoComercio\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese tipo de comercio\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Tipo de comercio\"\n\t\t\t\t\t  >\n                  <option disabled selected>Escoger</option>\n                  <option value=\"{{tipoComercio.idTipoComercio}}\" *ngFor=\"let tipoComercio of tiposComercio\">{{tipoComercio.tipoComercio}}</option>\n                </select>\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"row\">\n          <p>Datos de Contacto (para recibir notificaciones)</p>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col sm-6\">\n            <div class=\"row\">\n              <label for=\"telefono\" class=\"col-sm-4 col-form-label\">(*) Teléfono</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"telefono\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"telefono\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese numero de telefono\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Numero de telefono\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col sm-6\">\n            <div class=\"row\">\n              <label for=\"email\" class=\"col-sm-2 col-form-label\">(*) E-mail</label>\n              <div class=\"col-sm-10\">\n                <input\n                  id=\"email\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"email\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese correo electronico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Correo electronico\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n        </div>\n\t\t\n\t\t\n        <div class=\"form-group row\">\n          <label for=\"\" class=\"col-sm-2 col-form-label\">Dirección</label>\n          <div class=\"col-sm-10\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <div class=\"form-group row\">\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"codigoDepartamento\" class=\"col-sm-5 col-form-label\">(*) Departamento</label>\n                      <div class=\"col-sm-7\">\n                        <select\n                          id=\"codigoDepartamento\"\n                          class=\"form-control\"\n                          formControlName=\"codigoDepartamento\"\n                          (change)=\"onDepartamentoChanged(1)\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese departamento\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Departamento\"\n\t\t\t\t\t  >\n                          <option disabled selected>Escoger</option>\n                          <option value=\"{{departamento.codigoDepartamento}}\" *ngFor=\"let departamento of departamentos\">{{departamento.nombreDepartamento}}</option>\n                        </select>\n                      </div>\n                    </div>\n                  </div>\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"codigoMunicipio\" class=\"col-sm-4 col-form-label\">(*) Municipio</label>\n                      <div class=\"col-sm-8\">\n                        <select\n                          id=\"codigoMunicipio\"\n                          class=\"form-control\"\n                          formControlName=\"codigoMunicipio\"\n                          \n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese municipio\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Municipio\"\n\t\t\t\t\t  >\n                          <option disabled selected>Escoger</option>\n                          <option value=\"{{municipio.codigoMunicipio}}\" *ngFor=\"let municipio of municipios\">{{municipio.nombreMunicipio}}</option>\n                        </select>\n                      </div>\n                    </div>\n                  </div>\n                </div>\n                \n\t\t\t\t\n\t\t\t\t\n                <div class=\"form-group row\">\n                  <label for=\"direccionDetalle\" class=\"col-sm-2 col-form-label\">(*) Direccion</label>\n                  <div class=\"col-sm-10\">\n                    <input\n                      id=\"direccionDetalle\"\n                      type=\"text\"\n                      class=\"form-control\"\n                      formControlName=\"direccionDetalle\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese direccion\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Direccion\"\n\t\t\t\t\t  >\n                  </div>\n                </div>\n\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t<div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"direccionZona\" class=\"col-sm-4 col-form-label\">(*) zona</label>\n                      <div class=\"col-sm-4\">\n                        <input\n\t\t\t\t\t\t  id=\"direccionZona\"\n\t\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t\t  formControlName=\"direccionZona\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t  matTooltip=\"Ingrese zona\"\n\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  placeholder=\"zona\"\n\t\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n\t\t\t\t  </div>\n              </div>\n            </div>\n          </div>\n        </div>\n\t\t<!-- SE ELIMINA ESTA PARTE PARA SUCURSALES DE FORMA TEMPORAL-->\n\t\t<div class=\"form-group row\">\n          <label for=\"\" class=\"col-sm-2 col-form-label\">Sucursal</label>\n          <div class=\"col-sm-10\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t  \n\t\t\t  <div class=\"form-group row\">\n                  <label for=\"sucursales\" class=\"col-sm-2 col-form-label\">Sucursales</label>\n                  <div class=\"col-sm-10\">\n\t\t\t\t\t<select\n\t\t\t\t\t  id=\"sucursales\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"sucursales\"\n\t\t\t\t\t  (change)=\"onSucursalChanged()\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t\t  matTooltip=\"Seleccione sucursal\"\n\t\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t\t  >\n\t\t\t\t\t  <option disabled select>Escoger</option>\n\t\t\t\t\t  <option value=\"{{sucursales.idEstablecimiento}}\" *ngFor=\"let sucursales of sucursalesNit\">\n\t\t\t\t\t  {{sucursales.nombreComercial}} - {{sucursales.direccion}}-(zona: {{sucursales.zona}})</option>\n\t\t\t\t\t</select>\n\t\t\t\t  </div>\n                </div>\n\t\t\t\t\n\t\t\t\t<div class=\"form-group row\" *ngIf=\"nuevasucursal == '0'\">\n                  <label for=\"btn\" class=\"col-sm-2 col-form-label\"></label>\n                  <div class=\"col-sm-10\">\n\t\t\t\t\t<button\n\t\t\t\t\t  class=\"btn btn-primary\"\n\t\t\t\t\t  (click)=\"onSucursalClicked('1')\"\n\t\t\t\t\t  type=\"button\"\n\t\t\t\t\t  >Nueva sucursal</button>\n\t\t\t\t  </div>\n                </div>\n\t\t\t\t\n                <div class=\"form-group row\" *ngIf=\"nuevasucursal == '1'\">\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"codigoDepartamentoS\" class=\"col-sm-4 col-form-label\">(*) Departamento</label>\n                      <div class=\"col-sm-8\">\n                        <select\n                          id=\"codigoDepartamentoS\"\n                          class=\"form-control\"\n                          formControlName=\"codigoDepartamentoS\"\n                          (change)=\"onDepartamentoChanged(2)\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese departamento\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Departamento\"\n\t\t\t\t\t  >\n                          <option disabled selected>Escoger</option>\n                          <option value=\"{{departamentoss.codigoDepartamento}}\" *ngFor=\"let departamentoss of departamentos\">{{departamentoss.nombreDepartamento}}</option>\n                        </select>\n                      </div>\n                    </div>\n                  </div>\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"codigoMunicipioS\" class=\"col-sm-4 col-form-label\">(*) Municipio</label>\n                      <div class=\"col-sm-8\">\n                        <select\n                          id=\"codigoMunicipioS\"\n                          class=\"form-control\"\n                          formControlName=\"codigoMunicipioS\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese municipio\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Municipio\"\n\t\t\t\t\t  >\n                          <option disabled selected>Escoger</option>\n                          <option value=\"{{municipioss.codigoMunicipio}}\" *ngFor=\"let municipioss of municipiossuc\">{{municipioss.nombreMunicipio}}</option>\n                        </select>\n                      </div>\n                    </div>\n                  </div>\n                </div>\n                \n\t\t\t\t<div class=\"form-group row\" *ngIf=\"nuevasucursal == '1'\">\n                  <label for=\"nombreS\" class=\"col-sm-2 col-form-label\">(*) Nombre sucursal</label>\n                  <div class=\"col-sm-10\">\n                    <input\n                      id=\"nombreS\"\n                      type=\"text\"\n                      class=\"form-control\"\n                      formControlName=\"nombreS\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nombre sucursal\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nombre sucursal\"\n\t\t\t\t\t  >\n                  </div>\n                </div>\n\t\t\t\t\n                <div class=\"form-group row\" *ngIf=\"nuevasucursal == '1'\">\n                  <label for=\"direccionDetalleS\" class=\"col-sm-2 col-form-label\">(*) Direccion</label>\n                  <div class=\"col-sm-10\">\n                    <input\n                      id=\"direccionDetalleS\"\n                      type=\"text\"\n                      class=\"form-control\"\n                      formControlName=\"direccionDetalleS\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese direccion\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Direccion sucursal\"\n\t\t\t\t\t  >\n                  </div>\n\t\t\t\t  </div>\n\t\t\t\t  <div class=\"form-group row\" *ngIf=\"nuevasucursal == '1'\">\n\t\t\t\t\t\n\t\t\t\t\t\t\n\t\t\t\t\t\t  <label for=\"zonaS\" class=\"col-sm-2 col-form-label\">(*) zona</label>\n\t\t\t\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t\t\t\t<input\n\t\t\t\t\t\t\t  id=\"zonaS\"\n\t\t\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t\t\t  formControlName=\"zonaS\"\n\t\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t\t  matTooltip=\"Ingrese zona\"\n\t\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t\t  placeholder=\"zona\"\n\t\t\t\t\t\t\t  >\n\t\t\t\t\t\t  </div>\n\t\t\t\t\t\t\n\t\t\t\t\t  \n\t\t\t\t  </div>\n\t\t\t\t  \n               \n\t\t\t\t\n\t\t\t\t<div class=\"form-group row\" *ngIf=\"nuevasucursal == '1'\">\n                  <label for=\"btn\" class=\"col-sm-2 col-form-label\"></label>\n                  <div class=\"col-sm-10\">\n\t\t\t\t\t<button\n\t\t\t\t\t  class=\"btn btn-primary\"\n\t\t\t\t\t  (click)=\"onSucursalClicked('0')\"\n\t\t\t\t\t  type=\"button\"\n\t\t\t\t\t  >Cancelar nueva sucursal</button>\n\t\t\t\t  </div>\n                </div>\n\t\t\t\t\n              </div>\n            </div>\n          </div>\n        </div>\n\t\t\n        <div class=\"form-group row\">\n          <div class=\"col-lg-4 text-center\">\n            &nbsp;\n          </div>\n          <div class=\"col-lg-4 centrar\">\n            <button\n              class=\"btn btn-primary\"\n              type=\"submit\"\n              >Guardar e Ir a Siguiente Pantalla</button>\n          </div>\n          <div class=\"col-lg-4 text-center\">\n            <img src=\"/assets/img/logo-diaco-ant.jpg\" class=\"headerimg\" alt=\"\">\n          </div>\n        </div>\n      </form>\n    </div>\n  </div>\n</div>\n\n\t<!--div *ngIf=\"flagInfoError\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tHubo un error al procesar esta acción, por favor intente de nuevo.\n\t</div-->\n\n\t\n</body>\n</html>"

/***/ }),

/***/ "./src/app/proveedor/proveedor.component.scss":
/*!****************************************************!*\
  !*** ./src/app/proveedor/proveedor.component.scss ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "/* body {\n\tbackground-image: url(/diaco-grd.jpg);\n\tbackground-repeat: no-repeat, no-repeat;\n\tbackground-attachment: fixed, fixed;\n\tbackground-size: auto auto, auto auto;\n\tbackground-position: bottom right, bottom left;\n\tmin-height:100vh; \n} */\n.centrar {\n  display: flex;\n  align-items: center; }\n.headerimg {\n  width: 40%;\n  height: auto; }\nnav.navbar {\n  background-color: #00284d !important;\n  padding-top: 3px !important;\n  padding-bottom: 3px !important;\n  min-height: 20px !important; }\n.whitefont {\n  color: white !important; }\n.whitelink {\n  color: white !important;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n.whitelink:hover {\n  color: white !important;\n  text-decoration: underline;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n@font-face {\n  font-family: ABeeZeeRegular;\n  src: url('ABeeZee-Regular.ttf') format(\"truetype\"); }\n@font-face {\n  font-family: ABeeZeeItalic;\n  src: url('ABeeZee-Italic.ttf') format(\"truetype\"); }\n@font-face {\n  font-family: LatoBold;\n  src: url('Lato-Bold.ttf') format(\"truetype\"); }\n@font-face {\n  font-family: Lato;\n  src: url('Lato-Regular.ttf') format(\"truetype\"); }\ntextarea {\n  border: 1px solid #999999;\n  width: 100%;\n  margin: 5px 0;\n  padding: 3px;\n  font-family: ABeeZeeItalic, sans-serif; }\n* {\n  font-size: 100%;\n  font-family: ABeeZeeRegular, sans-serif; }\nh2 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: LatoBold, sans-serif; }\nh3 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: Lato, sans-serif;\n  text-decoration: underline; }\ninput {\n  font-family: ABeeZeeItalic, sans-serif; }\nselect {\n  font-family: ABeeZeeItalic, sans-serif; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvcHJvdmVlZG9yL0M6XFxVc2Vyc1xcamphZ3VpbGFsXFxEb2N1bWVudHNcXERJQUNPIEFQUFxcUVVFSkFTLURJQUNPXFxGcm9udGVuZFxcZGlzdDYvc3JjXFxhcHBcXHByb3ZlZWRvclxccHJvdmVlZG9yLmNvbXBvbmVudC5zY3NzIiwic3JjL2FwcC9wcm92ZWVkb3IvcHJvdmVlZG9yLmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBOzs7Ozs7O0dDT0c7QURFSDtFQUNDLGFBQWE7RUFDYixtQkFBbUIsRUFBQTtBQUdwQjtFQUVDLFVBQVU7RUFDVixZQUFZLEVBQUE7QUFHYjtFQUNDLG9DQUFvQztFQUNwQywyQkFBMEI7RUFDMUIsOEJBQTZCO0VBQzdCLDJCQUNELEVBQUE7QUFFQTtFQUNDLHVCQUF1QixFQUFBO0FBRXhCO0VBQ0MsdUJBQXVCO0VBQ3ZCLDJCQUEwQjtFQUFFLDhCQUE2QixFQUFBO0FBRTFEO0VBQ0MsdUJBQXVCO0VBQ3ZCLDBCQUEwQjtFQUMxQiwyQkFBMEI7RUFBRSw4QkFBNkIsRUFBQTtBQUcxRDtFQUNFLDJCQUEyQjtFQUMzQixrREFBcUUsRUFBQTtBQUd2RTtFQUNFLDBCQUEwQjtFQUMxQixpREFBb0UsRUFBQTtBQUd0RTtFQUNFLHFCQUFxQjtFQUNyQiw0Q0FBK0QsRUFBQTtBQUdqRTtFQUNFLGlCQUFpQjtFQUNqQiwrQ0FBa0UsRUFBQTtBQUdwRTtFQUVFLHlCQUF3QjtFQUN4QixXQUFVO0VBQ1YsYUFBWTtFQUNaLFlBQVc7RUFDWCxzQ0FBdUMsRUFBQTtBQUd6QztFQUNDLGVBQWU7RUFDZix1Q0FBd0MsRUFBQTtBQUd6QztFQUNDLGNBQWE7RUFDYixlQUFjO0VBQ2QsaUNBQWtDLEVBQUE7QUFHbkM7RUFDQyxjQUFhO0VBQ2IsZUFBYztFQUNkLDZCQUE4QjtFQUM5QiwwQkFBMEIsRUFBQTtBQUczQjtFQUNDLHNDQUF1QyxFQUFBO0FBR3hDO0VBQ0Msc0NBQXVDLEVBQUEiLCJmaWxlIjoic3JjL2FwcC9wcm92ZWVkb3IvcHJvdmVlZG9yLmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLyogYm9keSB7XG5cdGJhY2tncm91bmQtaW1hZ2U6IHVybCgvZGlhY28tZ3JkLmpwZyk7XG5cdGJhY2tncm91bmQtcmVwZWF0OiBuby1yZXBlYXQsIG5vLXJlcGVhdDtcblx0YmFja2dyb3VuZC1hdHRhY2htZW50OiBmaXhlZCwgZml4ZWQ7XG5cdGJhY2tncm91bmQtc2l6ZTogYXV0byBhdXRvLCBhdXRvIGF1dG87XG5cdGJhY2tncm91bmQtcG9zaXRpb246IGJvdHRvbSByaWdodCwgYm90dG9tIGxlZnQ7XG5cdG1pbi1oZWlnaHQ6MTAwdmg7IFxufSAqL1xuXG4uY2VudHJhciB7XG5cdGRpc3BsYXk6IGZsZXg7XG5cdGFsaWduLWl0ZW1zOiBjZW50ZXI7XG4gfVxuXG4uaGVhZGVyaW1ne1xuICBcblx0d2lkdGg6IDQwJTtcblx0aGVpZ2h0OiBhdXRvO1xufVxuXG5uYXYubmF2YmFye1xuXHRiYWNrZ3JvdW5kLWNvbG9yOiAjMDAyODRkICFpbXBvcnRhbnQ7XG5cdHBhZGRpbmctdG9wOjNweCAhaW1wb3J0YW50OyBcblx0cGFkZGluZy1ib3R0b206M3B4ICFpbXBvcnRhbnQ7XG5cdG1pbi1oZWlnaHQ6MjBweCAhaW1wb3J0YW50XG59XG5cbi53aGl0ZWZvbnQge1xuXHRjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcbn1cbi53aGl0ZWxpbmsge1xuXHRjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcblx0cGFkZGluZy10b3A6NXB4ICFpbXBvcnRhbnQ7IHBhZGRpbmctYm90dG9tOjVweCAhaW1wb3J0YW50O1xufVxuLndoaXRlbGluazpob3ZlciB7XG5cdGNvbG9yOiB3aGl0ZSAhaW1wb3J0YW50O1xuXHR0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTtcblx0cGFkZGluZy10b3A6NXB4ICFpbXBvcnRhbnQ7IHBhZGRpbmctYm90dG9tOjVweCAhaW1wb3J0YW50O1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVSZWd1bGFyO1xuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0FCZWVaZWUtUmVndWxhci50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XG59XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogQUJlZVplZUl0YWxpYztcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9BQmVlWmVlLUl0YWxpYy50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XG59XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogTGF0b0JvbGQ7XG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvTGF0by1Cb2xkLnR0ZicpIGZvcm1hdCgndHJ1ZXR5cGUnKTtcbn1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBMYXRvO1xuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0xhdG8tUmVndWxhci50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XG59XG5cbnRleHRhcmVhXG57XG4gIGJvcmRlcjoxcHggc29saWQgIzk5OTk5OTtcbiAgd2lkdGg6MTAwJTtcbiAgbWFyZ2luOjVweCAwO1xuICBwYWRkaW5nOjNweDtcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWMsIHNhbnMtc2VyaWYgO1x0XG59XG5cbioge1xuXHRmb250LXNpemU6IDEwMCU7XG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhciwgc2Fucy1zZXJpZiA7XG59XG5cbmgyIHtcblx0Y29sb3I6IzMzODVmZjtcblx0Zm9udC1zaXplOjIwMCU7XG5cdGZvbnQtZmFtaWx5OiBMYXRvQm9sZCwgc2Fucy1zZXJpZiA7XG59XG5cbmgzIHtcblx0Y29sb3I6IzMzODVmZjtcblx0Zm9udC1zaXplOjIwMCU7XG5cdGZvbnQtZmFtaWx5OiBMYXRvLCBzYW5zLXNlcmlmIDtcblx0dGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7XG59XG5cbmlucHV0IHtcblx0Zm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWMsIHNhbnMtc2VyaWYgO1x0XG59XG5cbnNlbGVjdCB7XG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG4iLCIvKiBib2R5IHtcblx0YmFja2dyb3VuZC1pbWFnZTogdXJsKC9kaWFjby1ncmQuanBnKTtcblx0YmFja2dyb3VuZC1yZXBlYXQ6IG5vLXJlcGVhdCwgbm8tcmVwZWF0O1xuXHRiYWNrZ3JvdW5kLWF0dGFjaG1lbnQ6IGZpeGVkLCBmaXhlZDtcblx0YmFja2dyb3VuZC1zaXplOiBhdXRvIGF1dG8sIGF1dG8gYXV0bztcblx0YmFja2dyb3VuZC1wb3NpdGlvbjogYm90dG9tIHJpZ2h0LCBib3R0b20gbGVmdDtcblx0bWluLWhlaWdodDoxMDB2aDsgXG59ICovXG4uY2VudHJhciB7XG4gIGRpc3BsYXk6IGZsZXg7XG4gIGFsaWduLWl0ZW1zOiBjZW50ZXI7IH1cblxuLmhlYWRlcmltZyB7XG4gIHdpZHRoOiA0MCU7XG4gIGhlaWdodDogYXV0bzsgfVxuXG5uYXYubmF2YmFyIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZCAhaW1wb3J0YW50O1xuICBwYWRkaW5nLXRvcDogM3B4ICFpbXBvcnRhbnQ7XG4gIHBhZGRpbmctYm90dG9tOiAzcHggIWltcG9ydGFudDtcbiAgbWluLWhlaWdodDogMjBweCAhaW1wb3J0YW50OyB9XG5cbi53aGl0ZWZvbnQge1xuICBjb2xvcjogd2hpdGUgIWltcG9ydGFudDsgfVxuXG4ud2hpdGVsaW5rIHtcbiAgY29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG4gIHBhZGRpbmctdG9wOiA1cHggIWltcG9ydGFudDtcbiAgcGFkZGluZy1ib3R0b206IDVweCAhaW1wb3J0YW50OyB9XG5cbi53aGl0ZWxpbms6aG92ZXIge1xuICBjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcbiAgdGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7XG4gIHBhZGRpbmctdG9wOiA1cHggIWltcG9ydGFudDtcbiAgcGFkZGluZy1ib3R0b206IDVweCAhaW1wb3J0YW50OyB9XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogQUJlZVplZVJlZ3VsYXI7XG4gIHNyYzogdXJsKFwiLi4vLi4vYXNzZXRzL2ZvbnRzL0FCZWVaZWUtUmVndWxhci50dGZcIikgZm9ybWF0KFwidHJ1ZXR5cGVcIik7IH1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljO1xuICBzcmM6IHVybChcIi4uLy4uL2Fzc2V0cy9mb250cy9BQmVlWmVlLUl0YWxpYy50dGZcIikgZm9ybWF0KFwidHJ1ZXR5cGVcIik7IH1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBMYXRvQm9sZDtcbiAgc3JjOiB1cmwoXCIuLi8uLi9hc3NldHMvZm9udHMvTGF0by1Cb2xkLnR0ZlwiKSBmb3JtYXQoXCJ0cnVldHlwZVwiKTsgfVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IExhdG87XG4gIHNyYzogdXJsKFwiLi4vLi4vYXNzZXRzL2ZvbnRzL0xhdG8tUmVndWxhci50dGZcIikgZm9ybWF0KFwidHJ1ZXR5cGVcIik7IH1cblxudGV4dGFyZWEge1xuICBib3JkZXI6IDFweCBzb2xpZCAjOTk5OTk5O1xuICB3aWR0aDogMTAwJTtcbiAgbWFyZ2luOiA1cHggMDtcbiAgcGFkZGluZzogM3B4O1xuICBmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZjsgfVxuXG4qIHtcbiAgZm9udC1zaXplOiAxMDAlO1xuICBmb250LWZhbWlseTogQUJlZVplZVJlZ3VsYXIsIHNhbnMtc2VyaWY7IH1cblxuaDIge1xuICBjb2xvcjogIzMzODVmZjtcbiAgZm9udC1zaXplOiAyMDAlO1xuICBmb250LWZhbWlseTogTGF0b0JvbGQsIHNhbnMtc2VyaWY7IH1cblxuaDMge1xuICBjb2xvcjogIzMzODVmZjtcbiAgZm9udC1zaXplOiAyMDAlO1xuICBmb250LWZhbWlseTogTGF0bywgc2Fucy1zZXJpZjtcbiAgdGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7IH1cblxuaW5wdXQge1xuICBmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZjsgfVxuXG5zZWxlY3Qge1xuICBmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZjsgfVxuIl19 */"

/***/ }),

/***/ "./src/app/proveedor/proveedor.component.ts":
/*!**************************************************!*\
  !*** ./src/app/proveedor/proveedor.component.ts ***!
  \**************************************************/
/*! exports provided: ProveedorComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProveedorComponent", function() { return ProveedorComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shared/departamentos.service */ "./src/app/shared/departamentos.service.ts");
/* harmony import */ var _shared_proveedores_comunes_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/proveedores-comunes.service */ "./src/app/shared/proveedores-comunes.service.ts");
/* harmony import */ var _shared_sucursales_nit_model__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/sucursales-nit.model */ "./src/app/shared/sucursales-nit.model.ts");
/* harmony import */ var _shared_actividades_economicas_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../shared/actividades-economicas.service */ "./src/app/shared/actividades-economicas.service.ts");
/* harmony import */ var _shared_municipios_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../shared/municipios.service */ "./src/app/shared/municipios.service.ts");
/* harmony import */ var _shared_proveedor_model__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../shared/proveedor.model */ "./src/app/shared/proveedor.model.ts");
/* harmony import */ var _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../shared/proveedores.service */ "./src/app/shared/proveedores.service.ts");
/* harmony import */ var _shared_quejas_service__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ../shared/quejas.service */ "./src/app/shared/quejas.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ../shared/submit-form.service */ "./src/app/shared/submit-form.service.ts");
/* harmony import */ var _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ../shared/seguridad.service */ "./src/app/shared/seguridad.service.ts");














var ProveedorComponent = /** @class */ (function () {
    //addsucursal : SucursalesNit; 
    function ProveedorComponent(router, proveedoresComunesService, departamentosService, municipiosService, actividadesEconomicasService, proveedoresService, quejasService, _submitFormService, _seguridadService) {
        this.router = router;
        this.proveedoresComunesService = proveedoresComunesService;
        this.departamentosService = departamentosService;
        this.municipiosService = municipiosService;
        this.actividadesEconomicasService = actividadesEconomicasService;
        this.proveedoresService = proveedoresService;
        this.quejasService = quejasService;
        this._submitFormService = _submitFormService;
        this._seguridadService = _seguridadService;
        this.existingMode = false;
        this.mjsError = '';
        this.str_usuario = '';
        this.str_queja = "";
        this.continuarp = '1';
        this.nuevasucursal = '0';
        this.nitProveedorSeleccionado = '';
        //this.str_usuario= "Usuario: " + this._submitFormService.Get_username();		
    }
    ProveedorComponent.prototype.ngOnInit = function () {
        var _this = this;
        // validar que haya un consumidor en sesion
        //////console.info(this.quejasService.quejat);
        if (this.quejasService.quejat == undefined) {
            //////console.info("quejat",this.quejasService.quejat);
            this.continuarp = "0";
            this.router.navigate(['/consumidor/./.']);
            //return;
        }
        //////console.info(this.quejasService.consumidor, this.quejasService.vexisteConsumidor);
        if (!this.quejasService.consumidor || !this.quejasService.quejat) {
            //continuar: string = '0';
            //////console.info("consumidor",this.quejasService.quejat);
            this.router.navigate(['/consumidor/./.']);
        }
        // cargar proveedores comunes
        this.proveedoresComunesSubscription = this.proveedoresComunesService.fetchData().subscribe(function (res) {
            _this.proveedoresComunes = res.value;
        });
        // cargar departamentos
        this.departamentosSubscription = this.departamentosService.fetchData().subscribe(function (res) {
            _this.departamentos = res.value;
        });
        // cargar actividades economicas
        this.actividadesEconomicasSubscription = this.actividadesEconomicasService.fetchData().subscribe(function (res) {
            _this.actividadesEconomicas = res.value;
        });
        // listener cuando finaliza la operacion de creacion
        this.proveedorOperationSubscription = this.proveedoresService.operation.subscribe(function (proveedor) {
            _this.nextStep(proveedor);
        });
        // listener cuando finaliza la operacion de creacion
        this.sucursalOperationSubscription = this.proveedoresService.operations.subscribe(function (sucursal) {
            _this.nextSteps(sucursal);
        });
        this.initProveedorForm(null);
        this.findByTokenProveedor();
    };
    ProveedorComponent.prototype.initProveedorForm = function (proveedor) {
        var _this = this;
        //////console.info(proveedor);
        var correo;
        if (proveedor != null) {
            if (proveedor.email == '' || proveedor.email == undefined) {
                correo = proveedor.email1;
            }
            else {
                correo = proveedor.email;
            }
        }
        var tel;
        if (proveedor != null) {
            if (proveedor.telefono == '' || proveedor.telefono == undefined) {
                tel = proveedor.telefono1;
            }
            else {
                tel = proveedor.telefono;
            }
        }
        this.proveedorForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            // 'tipoConsumidor': new FormControl(proveedor ? proveedor.tipoConsumidor : '1', Validators.required),
            'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.nitProveedor : ''),
            'tipoProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.tipoProveedor : '6'),
            'primerNombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.primerNombre : ''),
            'segundoNombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.segundoNombre : ''),
            'tercerNombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.tercerNombre : ''),
            'primerApellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.primerApellido : ''),
            'segundoApellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.segundoApellido : ''),
            'apellidoCasada': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.apellidoCasada : ''),
            'nombreEmpresa': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.nombreEmpresa : ''),
            'razonSocial': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.razonSocial : ''),
            'actividadEconomica': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.idActividadEconomica : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'tipoComercio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? tel : ''),
            'email': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? correo : ''),
            'codigoDepartamento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.codigoDepartamento : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'codigoMunicipio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.codigoMunicipio : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            //'direccionAvenidaCalle': new FormControl(proveedor ? proveedor.direccionCalle : '', Validators.required),
            //'tipoDireccion': new FormControl(''),
            //'direccionNumero': new FormControl(proveedor ? proveedor.direccionAvenida : '', Validators.required),
            'direccionZona': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.direccionZona : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'direccionDetalle': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.direccionDetalle : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'proveedorComun': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'sucursales': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'codigoDepartamentoS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'codigoMunicipioS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'direccionDetalleS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'nombreS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'zonaS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('')
        });
        if (proveedor) {
            // seleccionar departamento
            this.onDepartamentoChanged(1);
            this.proveedorForm.patchValue({
                'codigoDepartamento': proveedor.codigoDepartamento
            });
            // seleccionar municipio
            this.onMunicipioChanged();
            this.proveedorForm.patchValue({
                'codigoMunicipio': proveedor.codigoMunicipio
            });
            // seleccionar actividad economica
            // this.onActividadEconomicaChanged();
            this.proveedorForm.patchValue({
                'tipoComercio': 'proveedor.idTipoComercio'
            });
            //actividad economica
            this.proveedorForm.patchValue({
                'actividadEconomica': proveedor.idActividadEconomica
            });
            //tipo comercio
            this.onActividadEconomicaChanged();
            this.proveedorForm.patchValue({
                'tipoComercio': proveedor.idTipoComercio
            });
            // cargar sucursales
            this.sucursalesNitSubscription = this.proveedoresService.fetchDataSucursal(proveedor.nitProveedor).subscribe(function (res) {
                ////console.log('existen sucursales ',res);
                //console.log(res);
                _this.sucursalesNit = res.value;
            });
        }
    };
    ProveedorComponent.prototype.onBuscarProveedorClicked = function () {
        var _this = this;
        //////console.info(this.proveedorForm.value.nitProveedor);
        this.proveedoresService.fetchData(this.proveedorForm.value.nitProveedor).subscribe(function (response) {
            if (response.value) {
                // inicializar formulario con valores predeterminados
                _this.existingMode = true;
                _this.existingProveedor = response.value;
                _this.initProveedorForm(response.value);
            }
            else {
                _this.existingMode = false;
                _this.existingProveedor = null;
            }
        });
    };
    ProveedorComponent.prototype.onProveedoresComunesChanged = function () {
        var _this = this;
        //alert(this.proveedorForm.value.proveedorComun+'1');
        this.proveedoresService.fetchDataId(this.proveedorForm.value.proveedorComun).subscribe(function (response) {
            if (response.value) {
                // inicializar formulario con valores predeterminados
                _this.existingMode = true;
                _this.existingProveedor = response.value;
                _this.initProveedorForm(response.value);
            }
            else {
                _this.existingMode = false;
                _this.existingProveedor = null;
            }
        });
    };
    ProveedorComponent.prototype.onActividadEconomicaChanged = function () {
        var _this = this;
        // cargar tipos de comercio
        this.tiposComercioSubscription = this.actividadesEconomicasService.fetchTiposComercio(this.proveedorForm.value.actividadEconomica).subscribe(function (res) {
            _this.tiposComercio = res.value;
        });
    };
    ProveedorComponent.prototype.onDepartamentoChanged = function (tipo) {
        var _this = this;
        var depto = (tipo == 1 ? this.proveedorForm.value.codigoDepartamento : this.proveedorForm.value.codigoDepartamentoS);
        // cargar municipios
        this.municipiosSubscription = this.departamentosService.fetchMunicipios(depto).subscribe(function (res) {
            if (tipo == 1) {
                _this.municipios = res.value;
            }
            else {
                _this.municipiossuc = res.value;
            }
        });
    };
    ProveedorComponent.prototype.onMunicipioChanged = function () {
        var _this = this;
        // cargar sedes
        this.municipiosSubscription = this.municipiosService.fetchSedes(this.proveedorForm.value.codigoMunicipio).subscribe(function (res) {
            _this.sedes = res.value;
        });
    };
    ProveedorComponent.prototype.onSubmit = function () {
        var _this = this;
        //let tipoDireccion = this.proveedorForm.value.tipoDireccion;
        var proveedor = new _shared_proveedor_model__WEBPACK_IMPORTED_MODULE_8__["Proveedor"]();
        var addsucursal = new _shared_sucursales_nit_model__WEBPACK_IMPORTED_MODULE_5__["SucursalesNit"]();
        //proveedor.nombre = this.proveedorForm.value.nombre;
        if (this.proveedorForm.value.nitProveedor == "" || this.proveedorForm.value.nitProveedor == undefined) {
            /* this.mjsError +=  "- Ingrese NIT.  " + "\r\n"; */
            proveedor.nitProveedor = this.proveedorForm.value.nitProveedor; //+ POR JJ
        }
        else {
            proveedor.nitProveedor = this.proveedorForm.value.nitProveedor;
        }
        if (this.proveedorForm.value.tipoProveedor == 6) {
            proveedor.tipoProveedor = 6;
            if (this.proveedorForm.value.primerNombre == "" || this.proveedorForm.value.primerNombre == undefined) {
                this.mjsError += "- Ingrese primer nombre.  " + "\r\n";
            }
            else {
                proveedor.primerNombre = this.proveedorForm.value.primerNombre;
            }
            proveedor.segundoNombre = this.proveedorForm.value.segundoNombre;
            proveedor.tercerNombre = this.proveedorForm.value.tercerNombre;
            if (this.proveedorForm.value.primerApellido == "" || this.proveedorForm.value.primerApellido == undefined) {
                this.mjsError += "- Ingrese primer apellido.  " + "\r\n";
            }
            else {
                proveedor.primerApellido = this.proveedorForm.value.primerApellido;
            }
            proveedor.segundoApellido = this.proveedorForm.value.segundoApellido;
            proveedor.apellidoCasada = this.proveedorForm.value.apellidoCasada;
        }
        else {
            //juridico
            proveedor.tipoProveedor = 7;
            if (this.proveedorForm.value.razonSocial == "" || this.proveedorForm.value.razonSocial == undefined) {
                this.mjsError += "- Ingrese razon social.  " + "\r\n";
            }
            else {
                proveedor.razonSocial = this.proveedorForm.value.razonSocial;
            }
        }
        if (this.proveedorForm.value.nombreEmpresa == "" || this.proveedorForm.value.nombreEmpresa == undefined) {
            this.mjsError += "- Ingrese nombre de la empresa.  " + "\r\n";
        }
        else {
            proveedor.nombreEmpresa = this.proveedorForm.value.nombreEmpresa;
        }
        if (this.proveedorForm.value.actividadEconomica > 0) {
            proveedor.idActividadEconomica = this.proveedorForm.value.actividadEconomica;
        }
        else {
            this.mjsError += "- Seleccione actividad economica.  " + "\r\n";
        }
        if (this.proveedorForm.value.tipoComercio > 0) {
            proveedor.idTipoComercio = this.proveedorForm.value.tipoComercio;
        }
        else {
            this.mjsError += "- Seleccione tipo de comercio.  " + "\r\n";
        }
        if (this.proveedorForm.value.telefono == "" || this.proveedorForm.value.telefono == undefined) {
            this.mjsError += "- Ingrese telefono.  " + "\r\n";
        }
        else {
            proveedor.telefono = this.proveedorForm.value.telefono;
        }
        if (this.proveedorForm.value.email == "" || this.proveedorForm.value.email == undefined) {
            this.mjsError += "- Ingrese correo electronico.  " + "\r\n";
        }
        else {
            proveedor.email = this.proveedorForm.value.email;
        }
        if (this.proveedorForm.value.codigoDepartamento > 0) {
            proveedor.codigoDepartamento = this.proveedorForm.value.codigoDepartamento;
        }
        else {
            this.mjsError += "- Seleccione departamento.  " + "\r\n";
        }
        if (this.proveedorForm.value.codigoMunicipio > 0) {
            proveedor.codigoMunicipio = this.proveedorForm.value.codigoMunicipio;
        }
        else {
            this.mjsError += "- Seleccione municipio.  " + "\r\n";
        }
        if (this.proveedorForm.value.direccionDetalle == "" || this.proveedorForm.value.direccionDetalle == undefined) {
            this.mjsError += "- Ingrese direccion.  " + "\r\n";
        }
        else {
            proveedor.direccionDetalle = this.proveedorForm.value.direccionDetalle;
        }
        if (this.proveedorForm.value.direccionZona == "" || this.proveedorForm.value.direccionZona == undefined) {
            this.mjsError += "- Ingrese Zona.  " + "\r\n";
        }
        else {
            proveedor.direccionZona = this.proveedorForm.value.direccionZona;
        }
        //proveedor.direccionCalle = (tipoDireccion == 'C' ? this.proveedorForm.value.direccionAvenidaCalle : this.proveedorForm.value.direccionNumero);
        //proveedor.direccionAvenida = (tipoDireccion == 'A' ? this.proveedorForm.value.direccionAvenidaCalle : this.proveedorForm.value.direccionNumero);
        //proveedor.direccionZona = this.proveedorForm.value.direccionZona;
        //6 individual, 2 juridico
        //proveedor.tipoProveedor = this.proveedorForm.value.tipoProveedor;
        //proveedor.idActividadEconomica = this.proveedorForm.value.actividadEconomica;
        //proveedor.idTipoComercio = this.proveedorForm.value.tipoComercio;
        // TODO: obtener usuario de sesion
        if (this.existingProveedor) {
            proveedor.direccion = this.existingProveedor.direccion;
            proveedor.habilitadoConciliacionPrevia = this.existingProveedor.habilitadoConciliacionPrevia;
            proveedor.habilitadoNotificacionElectronica = this.existingProveedor.habilitadoNotificacionElectronica;
            proveedor.habilitado = "1";
            //proveedor.fechaRegistroConciliacionPrevia = this.existingProveedor.fechaRegistroConciliacionPrevia;
            //proveedor.fechaAdicion = this.existingProveedor.fechaAdicion;
            //proveedor.fechaModificacion = this.existingProveedor.fechaModificacion;
            proveedor.usuarioAdiciono = this.existingProveedor.usuarioAdiciono;
            proveedor.usuarioModifico = this.existingProveedor.usuarioModifico;
            proveedor.idProveedor = this.existingProveedor.idProveedor;
        }
        //hay una nueva sucursal, hay que grabarla
        if (this.nuevasucursal == '1') {
            if (this.proveedorForm.value.codigoDepartamentoS > 0) {
                addsucursal.idDepartamento = this.proveedorForm.value.codigoDepartamentoS;
            }
            else {
                this.mjsError += "- Seleccione departamento de la sucursal.  " + "\r\n";
            }
            if (this.proveedorForm.value.codigoMunicipioS > 0) {
                addsucursal.idMunicipio = this.proveedorForm.value.codigoMunicipioS;
            }
            else {
                this.mjsError += "- Seleccione municipio de la sucursal.  " + "\r\n";
            }
            if (this.proveedorForm.value.direccionDetalleS == "" || this.proveedorForm.value.direccionDetalleS == undefined) {
                this.mjsError += "- Ingrese direccion de la sucursal.  " + "\r\n";
            }
            else {
                addsucursal.direccion = this.proveedorForm.value.direccionDetalleS;
            }
            if (this.proveedorForm.value.nombreS == "" || this.proveedorForm.value.nombreS == undefined) {
                this.mjsError += "- Ingrese nombre de la sucursal.  " + "\r\n";
            }
            else {
                addsucursal.nombreComercial = this.proveedorForm.value.nombreS;
            }
            if (this.proveedorForm.value.zonaS == "" || this.proveedorForm.value.zonaS == undefined) {
                this.mjsError += "- Ingrese Zona de sucursal.  " + "\r\n";
            }
            else {
                addsucursal.zona = this.proveedorForm.value.zonaS;
            }
            addsucursal.nit = this.proveedorForm.value.nitProveedor;
            addsucursal.habilitado = '1';
        }
        if (this.mjsError == '') {
        }
        else {
            alert(this.mjsError);
            this.mjsError = "";
            return false;
        }
        if (this.proveedorForm.value.sucursales > 0) {
            this.quejasService.idsucursal = this.proveedorForm.value.sucursales;
            //console.info("onaummir sucursal seleccionada ",this.proveedorForm.value.sucursales,this.quejasService.idsucursal);
            //busca la sucursal 
            this.proveedoresService.fetchSucursalProveedor(this.proveedorForm.value.sucursales).subscribe(function (response) {
                var tempstr = response.value;
                if (tempstr != null || tempstr != undefined) {
                    addsucursal.direccion = tempstr.direccion;
                    addsucursal.idDepartamento = tempstr.idDepartamento;
                    addsucursal.idMunicipio = tempstr.idMunicipio;
                    addsucursal.zona = tempstr.zona;
                    addsucursal.idEstablecimiento = tempstr.idEstablecimiento;
                    addsucursal.nit = tempstr.nit;
                    //console.info("addsucursal ",addsucursal);
                    _this.nextSteps(addsucursal);
                }
            });
        }
        if (this.nuevasucursal == '1') {
            this.proveedoresService.createSucursal(addsucursal);
            this.nextSteps(addsucursal);
            //this.quejasService.sucursal = addsucursal;
        }
        else {
        }
        if (this.existingMode) {
            //actualiza proveedor
            proveedor.usuarioModifico = this.str_usuario;
            this.proveedoresService.createProveedor(proveedor);
            this.nextStep(this.existingProveedor);
        }
        else {
            proveedor.usuarioAdiciono = this.str_usuario;
            this.proveedoresService.createProveedor(proveedor);
        }
    };
    ProveedorComponent.prototype.nextStep = function (proveedor) {
        //////console.info("nextStep");
        this.proveedorForm.reset();
        // guardar el proveedor en sesion
        this.quejasService.proveedor = proveedor;
        // ir a pantalla de queja
        this.router.navigate(['/queja']);
    };
    ProveedorComponent.prototype.nextSteps = function (addsucursal) {
        //////console.info("nextStep");
        //this.proveedorForm.reset();
        // guardar el proveedor en sesion
        this.quejasService.sucursal = addsucursal;
        if (this.proveedorForm.value.sucursales > 0) {
            this.quejasService.idsucursal = this.proveedorForm.value.sucursales;
            //console.info("sucursal seleccionada ",this.proveedorForm.value.sucursales,this.quejasService.idsucursal);
        }
        // ir a pantalla de queja
        //this.router.navigate(['/queja']);
    };
    ProveedorComponent.prototype.CerrarSesion = function () {
        var _this = this;
        var loc_token = this._submitFormService.Get_token();
        //////console.log(loc_token);
        if (loc_token == '')
            this._seguridadService.RedireccionarLogin();
        this._seguridadService.Logout(loc_token).subscribe(function (retvalue) {
            //////console.log('cerrar sesion',retvalue);
            _this._seguridadService.RedireccionarLogin();
        }, function (error) {
            _this._seguridadService.RedireccionarLogin();
        });
    };
    ProveedorComponent.prototype.findByTokenProveedor = function () {
        var _this = this;
        var queja = this.quejasService.quejat;
        if (queja) {
            this.str_queja = "- Queja No. " + queja.noQueja + "-" + queja.anio;
        }
        //////console.info("findByTokenProveedor consumidor ",queja);
        this.proveedoresService.fetchDataByTokenProveedor(queja.idProveedor).subscribe(function (response) {
            var tempstr = response.value;
            if (tempstr != null || tempstr != undefined) {
                //////console.info("existe",tempstr);
                _this.initProveedorForm(tempstr);
                _this.existingProveedor = tempstr;
                _this.quejasService.vexisteProveedor = "1";
                /*this.quejasService.initQuejat(tempstr);
                if (this.quejasService.initQuejat != null) {
                     this.continuar = "1";
                     this.initConsumidorForm(null);
                } else
                     this.continuar = "0";
                 */
            }
            else {
                _this.quejasService.vexisteProveedor = "0";
                //this.existingData = false;
                //////console.info("no existe",response.value);
                //this.continuar = "0";
                //alert("Su acceso al sistema fue denegado, por favor verifique.");	
            }
        });
        //////console.info("findByTokenProveedor end ",this.quejasService.quejat);
    };
    ProveedorComponent.prototype.onSucursalChanged = function () {
        ////console.info("sucursal seleccionada ",this.proveedorForm.value.sucursales);
    };
    //nueva sucursal
    ProveedorComponent.prototype.onSucursalClicked = function (tipo) {
        this.nuevasucursal = tipo;
        if (tipo == "0") {
            this.proveedorForm.value.nombreS = "";
            this.proveedorForm.value.direccionDetalleS = "";
        }
    };
    ProveedorComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-proveedor',
            template: __webpack_require__(/*! ./proveedor.component.html */ "./src/app/proveedor/proveedor.component.html"),
            styles: [__webpack_require__(/*! ./proveedor.component.scss */ "./src/app/proveedor/proveedor.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_11__["Router"],
            _shared_proveedores_comunes_service__WEBPACK_IMPORTED_MODULE_4__["ProveedoresComunesService"],
            _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_3__["DepartamentosService"],
            _shared_municipios_service__WEBPACK_IMPORTED_MODULE_7__["MunicipiosService"],
            _shared_actividades_economicas_service__WEBPACK_IMPORTED_MODULE_6__["ActividadesEconomicasService"],
            _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_9__["ProveedoresService"],
            _shared_quejas_service__WEBPACK_IMPORTED_MODULE_10__["QuejasService"],
            _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_12__["SubmitFormService"],
            _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_13__["SeguridadService"]])
    ], ProveedorComponent);
    return ProveedorComponent;
}());



/***/ }),

/***/ "./src/app/queja/queja.component.html":
/*!********************************************!*\
  !*** ./src/app/queja/queja.component.html ***!
  \********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n<head>\n</head>\n<body>\n\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <span class=\"navbar-text whitefont\">DIACO  \n    <span class=\"badge badge-secondary\"> {{str_queja}}</span> \n    - Datos de consumidor \n  </span>\n  <span class=\"navbar-text whitefont\">&nbsp;&nbsp;&nbsp;</span>\n  <!---- <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>--->\n  <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n  <ul class=\"navbar-nav mr-auto\">\n   <!----     <li class=\"nav-item active\">\n        <a class=\"nav-link whitelink\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Features</a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Pricing</a>\n      </li>--->\n    </ul>  \n  </div>\n  <span class=\"navbar-text whitefont\">\n    {{str_usuario}}  \n  </span>\n  <span class=\"navbar-text whitefont\">\n    <!--a class=\"nav-link whitelink\" [routerLink]=\"['/Login']\">Cerrar Sesi&oacute;n</a-->\n\t<!--button class=\"btn btn-primary row\" (click)=\"onDismissClicked()\">Cancelar</button-->\n  </span>\n</nav>\n<div class=\"container-fluid center-h center-v\" *ngIf=\"cerrar_=='si'\" layout-align=\"start center\" flex>\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n<span class=\"navbar-text whitefont\">\nGracias por utilizar el sistema de registro DIACO.<br>\nOficinas: 7a av. 7-61 Zona 4, 3er. Nivel Edificio del Registro Mercantil <br>\nTeléfono: 2501-9898 <br><br>\nCentro de Atención de Quejas: 6av. 0-35 Zona 4 centro comercial Plaza Zona 4 <br>\nÁrea de Restaurantes 3er. Nivel Tel: 2501-9600. <br>\n<br>\nPuede cerrar esta ventana.\n\n\n</span>\n</nav>\n</div>\n\n\n<div class=\"container-fluid\" *ngIf=\"cerrar_=='no'\" >\n  <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\" *ngIf=\"success\">\n    <h4 class=\"alert-heading\">Queja registrada!</h4>\n    <p>Su queja ha sido registrada exitosamente.  {{vsecuencia}}-{{vanio}}</p>\n    <hr>\n    <button class=\"btn btn-primary\" (click)=\"onHomeClicked()\">Cerrar ventana</button>\n    <!--button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\" (click)=\"onDismissClicked()\">\n      <span aria-hidden=\"true\">&times;</span>\n    </button-->\n\t<p> </p>\n\t<p>\n\t<strong>\n\t\t <button type=\"button\" class=\"btn btn-primary row\" (click)=\"onPrintQueja()\">Imprimir queja {{vsecuencia}}-{{vanio}}</button>\n\t</strong>\n\t</p>\n  </div>\n  <div class=\"row\">\n    &nbsp;\n  </div>\n  <div class=\"row\">\n    <div class=\"col-sm-12\">\n      <form (ngSubmit)=\"onSubmit()\" [formGroup]=\"quejaForm\">\n        <div class=\"form-group row\">\n          <label for=\"facturaNumero\" class=\"col-sm-2 col-form-label\">Número de Factura o Contrato</label>\n          <div class=\"col-sm-6\">\n            <input\n              id=\"facturaNumero\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"facturaNumero\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t  matTooltip=\"Ingrese Numero de factura\"\n\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t  placeholder=\"Factura\"\n\t\t\t  required\n        disabled\n\t\t\t  >\n          </div>\n        </div>\n\n  \n        <div class=\"form-group row\">\n          <label for=\"fechaFactura\" class=\"col-sm-2 col-form-label\">Fecha Documento</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"fechaFactura\"\n              type=\"text\"\n              class=\"form-control\"\n              bsDatepicker #dp=\"bsDatepicker\"\n              formControlName=\"fechaFactura\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t  matTooltip=\"Ingrese fecha de factura\"\n\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t  placeholder=\"Fecha factura\"\n\t\t\t  required\n\t\t\t  >\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"detalleQueja\" class=\"col-sm-2 col-form-label\">(*) Detalle Queja (sea breve y conciso)</label>\n          <div class=\"col-sm-10\">\n            <textarea\n              id=\"detalleQueja\"\n              class=\"form-control\"\n              formControlName=\"detalleQueja\"\n              matTooltipPosition=\"after\"\n              matTooltip=\"Ingrese detalle de la queja\"\n              matTooltipClass=\"custom-tooltip-blue\"\n              placeholder=\"Detalle de la queja\"\n              maxLength=\"1000\"\n              required\n\t\t\t  ></textarea>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"solicitaQue\" class=\"col-sm-2 col-form-label\">(*) Solicito que (sea breve y conciso)</label>\n          <div class=\"col-sm-10\">\n            <textarea\n              id=\"solicitaQue\"\n              class=\"form-control\"\n              formControlName=\"solicitaQue\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t  matTooltip=\"Ingrese solicitud de la queja\"\n\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t  placeholder=\"Solicitud de la queja\"\n\t\t\t  maxLength=\"250\"\n\t\t\t  required\n\t\t\t\t></textarea>\n          </div>\n        </div>\n\t\t\n\t\t<div *ngIf=\"quejaForm.get('facturaNumero').errors && quejaForm.get('facturaNumero').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('facturaNumero').hasError('required')\" [ngStyle]=\"{color: 'red'}\">Ingrese su Número de Factura o Contrato</p>\n\t\t\t  </div>\n\t\t<div *ngIf=\"quejaForm.get('fechaFactura').errors && quejaForm.get('fechaFactura').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('fechaFactura').hasError('required')\" [ngStyle]=\"{color: 'red'}\" >Ingrese su Fecha Documento</p>\n\t\t\t  </div>\n\t\t<div *ngIf=\"quejaForm.get('detalleQueja').errors && quejaForm.get('detalleQueja').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('detalleQueja').hasError('required')\" [ngStyle]=\"{color: 'red'}\">Ingrese su Detalle Queja</p>\n\t\t\t  </div>\t \n\t\t<div *ngIf=\"quejaForm.get('detalleQueja').errors && quejaForm.get('detalleQueja').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('detalleQueja').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Detalle de queda solo admite 1000 caracteres</p>\n\t\t\t\t<p *ngIf=\"quejaForm.get('detalleQueja').hasError('required')\" [ngStyle]=\"{color: 'red'}\">Ingrese su Detalle Queja</p>\n\t\t\t  </div>\t  \n\t\t<div *ngIf=\"quejaForm.get('solicitaQue').errors && quejaForm.get('solicitaQue').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('solicitaQue').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Solicitud de queja solo admite 250 caracteres</p>\n\t\t\t\t<p *ngIf=\"quejaForm.get('detalleQueja').hasError('required')\" [ngStyle]=\"{color: 'red'}\">Ingrese su Solicitud Queja</p>\n\t\t</div>\n\t\t\n        <div class=\"form-group row\"   *ngIf=\"presencial != 'presencial'\">\n\t\t<div *ngIf=\"_existenUploads=='0'\">\n          <label for=\"\" class=\"col-sm-2 col-form-label\">Adjuntos Obligatorios</label>\n          <div class=\"col-sm-10\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <div class=\"form-group row\">\n                  <label for=\"filFactura\" class=\"col-sm-2 col-form-label\">(*) Factura o Contrato</label>\n                  <div class=\"col-sm-10\">\n                    <input\n                      #filFactura\n                      id=\"filFactura\"\n                      type=\"file\"\n                      ng2FileSelect\n                      [uploader]=\"uploader\"\n                      class=\"form-control\"\n                      (change)=\"onFileChanged('FAC')\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su factura\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Factura\"\n\t\t\t\t\t  \n\t\t\t\t>\n                  </div>\n                </div>\n                <div class=\"form-group row\">\n                  <label for=\"filDpi\" class=\"col-sm-2 col-form-label\">(*) DPI o Pasaporte</label>\n                  <div class=\"col-sm-10\">\n                    <input\n                      #filDpi\n                      id=\"filDpi\"\n                      type=\"file\"\n                      ng2FileSelect\n                      [uploader]=\"uploader\"\n                      class=\"form-control\"\n                      (change)=\"onFileChanged('DPI')\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese DPI\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"DPI\"\n\t\t\t\t\t  \n\t\t\t\t\t\t>\n                  </div>\n                </div>\n                <div class=\"row\">\n                  <p>Estos documentos deben ir completos, por ejemplo el DPI debe ser escaneado a ambos lados.</p>\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n\t\t</div>\n        \n\t\t<div class=\"form-group row\" *ngIf=\"_existenUploads=='0'\">\n          <label for=\"filOtros\" class=\"col-sm-2 col-form-label\">Adjuntar otro documento</label>\n          <div class=\"col-sm-6\">\n            <input\n              #filOtros\n              id=\"filOtros\"\n              type=\"file\"\n              ng2FileSelect\n              [uploader]=\"uploader\"\n\t\t\t  (change)=\"onFileChanged('OTRO')\"\n              class=\"form-control\">\n          </div>\n          <!--div class=\"col-sm-4 text-left\">\n            <button\n              class=\"btn btn-primary\">Agregar Documento</button>\n          </div-->\n        </div>\n        <div class=\"row\"  *ngIf=\"_existenUploads=='0'\">\n          <div class=\"container\">\n            <table class=\"table\">\n              <thead>\n                <tr>\n                  <th>Documentos adjuntos {{ uploader?.queue?.length }}</th>\n                  <th></th>\n                </tr>\n              </thead>\n              <tbody>\n                <tr *ngFor=\"let item of uploader.queue; let i = index\">\n                  <td>{{item.file.name}}</td>\n                  <td>\n                    <button\n                      class=\"btn btn-danger\"\n                      (click)=\"onRemoveClicked(i)\">Quitar</button>\n                  </td>\n                </tr>\n              </tbody>\n            </table>\n          </div>\n        </div>\n\t\t\n\t\t<div class=\"form-group row\" *ngIf=\"_existenUploads=='1'\">\n          <div class=\"col sm-6\">\n            <div class=\"row\">\n              <label for=\"documento\" class=\"col-sm-4 col-form-label\">(*) Documentos adjuntos</label>\n              <div class=\"col-sm-8\">\n                <!--select\n                  id=\"documento\"\n                  class=\"form-control\"\n                  formControlName=\"documento\"\n                  (change)=\"onActividadEconomicaChanged()\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese actividad economica\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Actividad economica\"\n\t\t\t\t\t  >\n                  <option disabled selected>Escoger</option>\n                  <option value=\"{{documento.id_imagen_queja}}\" *ngFor=\"let documento of documentosAdjuntos\">{{documento.imagen}}</option>\n                </select-->\n\t\t\t\t<div class=\"reglist\">\n\t\t\t\t<table class=\"table table-striped\">\n\t\t\t\t  <thead>\n\t\t\t\t\t<tr>\n\t\t\t\t\t  <th>documento adjunto</th>\n\t\t\t\t\t</tr>\n\t\t\t\t  </thead>\n\t\t\t\t  <tbody>\n\t\t\t\t\t<tr *ngFor=\"let documento of documentosAdjuntos\">\n\t\t\t\t\t  <th scope=\"row\"></th>\n\t\t\t\t\t  <td>{{ documento.descripcion_imagen_otros }}</td>\n\t\t\t\t\t</tr>\n\t\t\t\t  </tbody>\n\t\t\t\t</table>\n\t\t\t  </div>\n\t\t\t\t\t  \n              </div>\n            </div>\n          </div>\n        </div>\n\t\t\n        <div class=\"form-group row\">\n          <div class=\"col-sm-12 text-center\">\n            <button\n              class=\"btn btn-primary\"\n              type=\"submit\"\n\t\t\t  [disabled]=\"completado \"\n              >Guardar y Cerrar Queja</button>\n          </div>\n        </div>\n      </form>\n    </div>\n  </div>\n</div>\n\n\n\t<!--div *ngIf=\"flagInfoError\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tHubo un error al procesar esta acción, por favor intente de nuevo.\n\t</div-->\n\n\n\t\n</body>\n</html>"

/***/ }),

/***/ "./src/app/queja/queja.component.scss":
/*!********************************************!*\
  !*** ./src/app/queja/queja.component.scss ***!
  \********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "body {\n  background-image: url('/dist6/assets/img/logo-diaco-ant.jpg');\n  /* background-image: url(diacofade3.jpg), url(imagen-grdfade2.jpg) ; ORIGINAL*/\n  background-repeat: no-repeat, no-repeat;\n  background-attachment: fixed, fixed;\n  background-size: 10% auto, auto auto;\n  background-position: bottom right, bottom left;\n  min-height: 100vh; }\n\nnav.navbar {\n  background-color: #00284d !important;\n  padding-top: 3px !important;\n  padding-bottom: 3px !important;\n  min-height: 20px !important; }\n\n.whitefont {\n  color: white !important; }\n\n.whitelink {\n  color: white !important;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n.whitelink:hover {\n  color: white !important;\n  text-decoration: underline;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n@font-face {\n  font-family: ABeeZeeRegular;\n  src: url('ABeeZee-Regular.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: ABeeZeeItalic;\n  src: url('ABeeZee-Italic.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: LatoBold;\n  src: url('Lato-Bold.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: Lato;\n  src: url('Lato-Regular.ttf') format(\"truetype\"); }\n\ntextarea {\n  border: 1px solid #999999;\n  width: 100%;\n  margin: 5px 0;\n  padding: 3px;\n  font-family: ABeeZeeItalic, sans-serif; }\n\n* {\n  font-size: 100%;\n  font-family: ABeeZeeRegular, sans-serif; }\n\nh2 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: LatoBold, sans-serif; }\n\nh3 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: Lato, sans-serif;\n  text-decoration: underline; }\n\ninput {\n  font-family: ABeeZeeItalic, sans-serif; }\n\nselect {\n  font-family: ABeeZeeItalic, sans-serif; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvcXVlamEvQzpcXFVzZXJzXFxqamFndWlsYWxcXERvY3VtZW50c1xcRElBQ08gQVBQXFxRVUVKQVMtRElBQ09cXEZyb250ZW5kXFxkaXN0Ni9zcmNcXGFwcFxccXVlamFcXHF1ZWphLmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0MsNkRBQXFEO0VBQ3JELDhFQUFBO0VBQ0EsdUNBQXVDO0VBQ3ZDLG1DQUFtQztFQUNuQyxvQ0FBb0M7RUFDcEMsOENBQThDO0VBQzlDLGlCQUFnQixFQUFBOztBQUdqQjtFQUNDLG9DQUFvQztFQUNwQywyQkFBMEI7RUFDMUIsOEJBQTZCO0VBQzdCLDJCQUNELEVBQUE7O0FBRUE7RUFDQyx1QkFBdUIsRUFBQTs7QUFFeEI7RUFDQyx1QkFBdUI7RUFDdkIsMkJBQTBCO0VBQUUsOEJBQTZCLEVBQUE7O0FBRTFEO0VBQ0MsdUJBQXVCO0VBQ3ZCLDBCQUEwQjtFQUMxQiwyQkFBMEI7RUFBRSw4QkFBNkIsRUFBQTs7QUFHMUQ7RUFDRSwyQkFBMkI7RUFDM0Isa0RBQXFFLEVBQUE7O0FBR3ZFO0VBQ0UsMEJBQTBCO0VBQzFCLGlEQUFvRSxFQUFBOztBQUd0RTtFQUNFLHFCQUFxQjtFQUNyQiw0Q0FBK0QsRUFBQTs7QUFHakU7RUFDRSxpQkFBaUI7RUFDakIsK0NBQWtFLEVBQUE7O0FBR3BFO0VBRUUseUJBQXdCO0VBQ3hCLFdBQVU7RUFDVixhQUFZO0VBQ1osWUFBVztFQUNYLHNDQUF1QyxFQUFBOztBQUd6QztFQUNDLGVBQWU7RUFDZix1Q0FBd0MsRUFBQTs7QUFHekM7RUFDQyxjQUFhO0VBQ2IsZUFBYztFQUNkLGlDQUFrQyxFQUFBOztBQUduQztFQUNDLGNBQWE7RUFDYixlQUFjO0VBQ2QsNkJBQThCO0VBQzlCLDBCQUEwQixFQUFBOztBQUczQjtFQUNDLHNDQUF1QyxFQUFBOztBQUd4QztFQUNDLHNDQUF1QyxFQUFBIiwiZmlsZSI6InNyYy9hcHAvcXVlamEvcXVlamEuY29tcG9uZW50LnNjc3MiLCJzb3VyY2VzQ29udGVudCI6WyJib2R5IHtcblx0YmFja2dyb3VuZC1pbWFnZTogdXJsKC9hc3NldHMvaW1nL2xvZ28tZGlhY28tYW50LmpwZyk7XG5cdC8qIGJhY2tncm91bmQtaW1hZ2U6IHVybChkaWFjb2ZhZGUzLmpwZyksIHVybChpbWFnZW4tZ3JkZmFkZTIuanBnKSA7IE9SSUdJTkFMKi9cblx0YmFja2dyb3VuZC1yZXBlYXQ6IG5vLXJlcGVhdCwgbm8tcmVwZWF0O1xuXHRiYWNrZ3JvdW5kLWF0dGFjaG1lbnQ6IGZpeGVkLCBmaXhlZDtcblx0YmFja2dyb3VuZC1zaXplOiAxMCUgYXV0bywgYXV0byBhdXRvO1xuXHRiYWNrZ3JvdW5kLXBvc2l0aW9uOiBib3R0b20gcmlnaHQsIGJvdHRvbSBsZWZ0O1xuXHRtaW4taGVpZ2h0OjEwMHZoOyBcbn1cblxubmF2Lm5hdmJhcntcblx0YmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZCAhaW1wb3J0YW50O1xuXHRwYWRkaW5nLXRvcDozcHggIWltcG9ydGFudDsgXG5cdHBhZGRpbmctYm90dG9tOjNweCAhaW1wb3J0YW50O1xuXHRtaW4taGVpZ2h0OjIwcHggIWltcG9ydGFudFxufVxuXG4ud2hpdGVmb250IHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG59XG4ud2hpdGVsaW5rIHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cbi53aGl0ZWxpbms6aG92ZXIge1xuXHRjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcblx0dGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhcjtcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9BQmVlWmVlLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWM7XG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvQUJlZVplZS1JdGFsaWMudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IExhdG9Cb2xkO1xuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0xhdG8tQm9sZC50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XG59XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogTGF0bztcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9MYXRvLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG50ZXh0YXJlYVxue1xuICBib3JkZXI6MXB4IHNvbGlkICM5OTk5OTk7XG4gIHdpZHRoOjEwMCU7XG4gIG1hcmdpbjo1cHggMDtcbiAgcGFkZGluZzozcHg7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG4qIHtcblx0Zm9udC1zaXplOiAxMDAlO1xuXHRmb250LWZhbWlseTogQUJlZVplZVJlZ3VsYXIsIHNhbnMtc2VyaWYgO1xufVxuXG5oMiB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0b0JvbGQsIHNhbnMtc2VyaWYgO1xufVxuXG5oMyB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0bywgc2Fucy1zZXJpZiA7XG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xufVxuXG5pbnB1dCB7XG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG5zZWxlY3Qge1xuXHRmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZiA7XHRcbn1cblxuIl19 */"

/***/ }),

/***/ "./src/app/queja/queja.component.ts":
/*!******************************************!*\
  !*** ./src/app/queja/queja.component.ts ***!
  \******************************************/
/*! exports provided: QuejaComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "QuejaComponent", function() { return QuejaComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_quejas_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/quejas.service */ "./src/app/shared/quejas.service.ts");
/* harmony import */ var _shared_queja_model__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/queja.model */ "./src/app/shared/queja.model.ts");
/* harmony import */ var ng2_file_upload__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ng2-file-upload */ "./node_modules/ng2-file-upload/fesm5/ng2-file-upload.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../shared/submit-form.service */ "./src/app/shared/submit-form.service.ts");
/* harmony import */ var _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../shared/seguridad.service */ "./src/app/shared/seguridad.service.ts");
/* harmony import */ var ngx_bootstrap_datepicker__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ngx-bootstrap/datepicker */ "./node_modules/ngx-bootstrap/datepicker/fesm5/ngx-bootstrap-datepicker.js");
/* harmony import */ var ngx_bootstrap_chronos__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ngx-bootstrap/chronos */ "./node_modules/ngx-bootstrap/chronos/fesm5/ngx-bootstrap-chronos.js");












var QuejaComponent = /** @class */ (function () {
    function QuejaComponent(router, quejasService, _submitFormService, _seguridadService, localeService) {
        this.router = router;
        this.quejasService = quejasService;
        this._submitFormService = _submitFormService;
        this._seguridadService = _seguridadService;
        this.localeService = localeService;
        this.uploader = new ng2_file_upload__WEBPACK_IMPORTED_MODULE_6__["FileUploader"]({
            itemAlias: 'document'
        });
        this.success = false;
        this.completado = false;
        this.mjsError = '';
        this.vidimagen = 3;
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_7__["Subject"]();
        this.str_usuario = '';
        this.locale = 'es';
        this.locales = Object(ngx_bootstrap_chronos__WEBPACK_IMPORTED_MODULE_11__["listLocales"])();
        this.str_queja = '';
        this.cerrar_ = 'no';
        this.presencial = '';
        this._existenUploads = '0';
        //,public dialogRef: MatDialogRef<QuejaComponent>) {
        //this.str_usuario="Usuario: "+this._submitFormService.Get_username();
        this.localeService.use(this.locale);
    }
    QuejaComponent.prototype.applyLocale = function (pop) {
        this.localeService.use(this.locale);
        pop.hide();
        pop.show();
    };
    QuejaComponent.prototype.ngOnInit = function () {
        var _this = this;
        // validar que haya un consumidor en sesion
        if (!this.quejasService.consumidor || this.quejasService.vexisteConsumidor == '0') {
            this.router.navigate(['/consumidor']);
        }
        // validar que haya un proveedor en sesion
        if (!this.quejasService.proveedor || this.quejasService.vexisteProveedor == '0') {
            this.router.navigate(['/proveedor']);
        }
        // listener cuando finaliza la operacion de creacion
        this.quejaOperationSubscription = this.quejasService.operation.subscribe(function (queja) {
            // limpia sesion
            _this.quejasService.consumidor = null;
            _this.quejasService.proveedor = null;
            _this.quejaForm.reset();
            _this.success = true;
        });
        this.initQuejaForm(null);
        this.localeService.use(this.locale);
        var _queja = this.quejasService.quejat;
        if (_queja) {
            this.initQuejaForm(_queja);
            this.str_queja = '- Queja No. ' + _queja.noQueja + '-' + _queja.anio;
        }
        this.presencial = this.quejasService.vdato;
    };
    QuejaComponent.prototype.initQuejaForm = function (_queja) {
        var _this = this;
        var fecha_;
        if (_queja) {
            //console.info('fecha fechaFactura ',_queja.fechaFactura);
            //console.info('fecha fechaFactura_',_queja.fechaFactura_);
            if (_queja.fechaFactura_ != undefined || _queja.fechaFactura_ != '') {
                fecha_ = new Date(_queja.fechaFactura_);
            }
            else {
                fecha_ = _queja.fechaFactura;
            }
        }
        this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'facturaNumero': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.facturaNumero : ''),
            'fechaFactura': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.fechaFactura : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.detalleQueja : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.solicitaQue : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'documento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('')
        });
        console.info('existe', _queja);
        if (_queja) {
            //busca archivos adjuntos
            this.quejasService.getfilesUpload(_queja.idQueja).subscribe(function (response) {
                var tempstr = response.value;
                if (tempstr != null || tempstr != undefined) {
                    _this._existenUploads = '1';
                    console.info('existe', tempstr);
                    _this.documentosAdjuntos = tempstr;
                    //this.dpi = tempstr;
                }
                else {
                    //this.quejasService.vexisteProveedor = "0";
                    //this.existingData = false;
                    //console.info("no existe",response.value);
                    //this.continuar = "0";
                    //alert("Su acceso al sistema fue denegado, por favor verifique.");
                }
            });
        }
    };
    QuejaComponent.prototype.onFileChanged = function (type) {
        if (type == 'FAC') {
            if (this.factura) {
                var facturaItem = this.uploader.queue[this.facturaIndex];
                this.uploader.removeFromQueue(facturaItem);
            }
            this.factura = this.uploader.queue[this.uploader.queue.length - 1];
            this.facturaIndex = this.uploader.queue.length - 1;
        }
        else if (type == 'DPI') {
            if (this.dpi) {
                var dpiItem = this.uploader.queue[this.dpiIndex];
                this.uploader.removeFromQueue(dpiItem);
            }
            this.dpi = this.uploader.queue[this.uploader.queue.length - 1];
            this.dpiIndex = this.uploader.queue.length - 1;
        }
        /*	if (this.uploader.queue.length > 0) {
            console.info(this.factura);
            console.info(this.dpi);
        }*/
    };
    QuejaComponent.prototype.onRemoveClicked = function (index) {
        var removeItem = this.uploader.queue[index];
        this.uploader.removeFromQueue(removeItem);
        if (index == this.facturaIndex) {
            this.facturaIndex = null;
            this.factura = null;
        }
        else if (index == this.dpiIndex) {
            this.dpiIndex = null;
            this.dpi = null;
        }
    };
    QuejaComponent.prototype.onSubmit = function () {
        var _this = this;
        var queja = new _shared_queja_model__WEBPACK_IMPORTED_MODULE_5__["Queja"]();
        if (this.quejaForm.value.facturaNumero == '' || this.quejaForm.value.facturaNumero == undefined) {
            //this.mjsError += '- Ingrese numero de factura o documento.  ' + '\r\n';
            queja.facturaNumero = this.quejaForm.value.facturaNumero;
        }
        else {
            queja.facturaNumero = this.quejaForm.value.facturaNumero;
        }
        if (this.quejaForm.value.fechaFactura == '' || this.quejaForm.value.fechaFactura == undefined) {
            this.mjsError += '- Ingrese fecha del documento.  ' + '\r\n';
        }
        else {
            queja.fechaFactura = this.quejaForm.value.fechaFactura;
        }
        if (this.quejaForm.value.detalleQueja == '' || this.quejaForm.value.detalleQueja == undefined) {
            this.mjsError += '- Ingrese detalle de la queja.  ' + '\r\n';
        }
        else {
            queja.detalleQueja = this.quejaForm.value.detalleQueja;
        }
        if (this.quejaForm.value.solicitaQue == '' || this.quejaForm.value.solicitaQue == undefined) {
            this.mjsError += '- Ingrese su solicitud de queja.  ' + '\r\n';
        }
        else {
            queja.solicitaQue = this.quejaForm.value.solicitaQue;
        }
        queja.idConsumidor = this.quejasService.consumidor.idConsumidor;
        queja.idProveedor = this.quejasService.proveedor.idProveedor;
        if (this.mjsError == '') {
        }
        else {
            alert(this.mjsError);
            this.mjsError = '';
            return false;
        }
        /*
        if (this.factura == null || this.dpi == null) {
            alert("Debe de ingresar  copia de factura y dpi.");
            return;
        }*/
        /*
        this.quejasService.createQueja(queja, this.uploader);
        this.vanio = this.quejasService.vsecanio;
        this.vsecuencia = this.quejasService.vsecanio;
        */
        var _queja = this.quejasService.quejat;
        var _proveedor = this.quejasService.proveedor;
        if (_queja) {
            queja.idQueja = _queja.idQueja;
            queja.noQueja = _queja.noQueja;
            queja.anio = _queja.anio;
            queja.direccionProveedor = _proveedor.direccionDetalle;
            queja.idDepartamentoProveedor = _proveedor.codigoDepartamento;
            queja.idMunicipioProveedor = _proveedor.codigoMunicipio;
            queja.idDepartamento = _proveedor.codigoDepartamento;
            queja.idMunicipio = _proveedor.codigoMunicipio;
            queja.zonaProveedor = _proveedor.direccionZona;
            //datos no modificables
            queja.idEstadoQueja = _queja.idEstadoQueja;
            queja.idSubActividadEconomica = _queja.idSubActividadEconomica;
            queja.procedeQueja = _queja.procedeQueja;
            queja.razonNoProcede = _queja.razonNoProcede;
            queja.datosVerificados = _queja.datosVerificados;
            queja.fechaQueja = _queja.fechaQueja;
            queja.motivo = _queja.motivo;
            queja.usuarioAsignado = _queja.usuarioAsignado;
            queja.idDiacoSede = _queja.idDiacoSede;
            queja.fuente = _queja.fuente;
            queja.idfuente = _queja.idfuente;
            queja.ubicacion = _queja.ubicacion;
            queja.documentado = _queja.documentado;
            queja.expiradomail = _queja.expiradomail;
            queja.flagalerta = _queja.flagalerta;
            queja.idEstablecimiento = _queja.idEstablecimiento;
        }
        var _sucursal = this.quejasService.sucursal;
        var _idsucursal = this.quejasService.idsucursal;
        console.info('queja', queja);
        if (_sucursal != null && _sucursal != undefined) {
            queja.idEstablecimiento = _sucursal.idEstablecimiento;
            console.info('queja_sucursal', _sucursal, _idsucursal);
            queja.direccionProveedor = _sucursal.direccion;
            queja.idDepartamentoProveedor = _sucursal.idDepartamento;
            queja.idMunicipioProveedor = _sucursal.idMunicipio;
            queja.zonaProveedor = _sucursal.zona;
        }
        else {
            if (_idsucursal != null && _idsucursal != undefined) {
                queja.idEstablecimiento = _idsucursal;
                //busca la sucursal
                this.quejasService.fetchSucursalProveedor(_idsucursal).subscribe(function (response) {
                    var tempstr = response.value;
                    if (tempstr != null || tempstr != undefined) {
                        queja.direccionProveedor = tempstr.direccion;
                        queja.idDepartamentoProveedor = tempstr.idDepartamento;
                        queja.idMunicipioProveedor = tempstr.idMunicipio;
                        queja.zonaProveedor = tempstr.zona;
                    }
                });
                console.info('queja_id queja', queja);
            }
        }
        //queja = this.quejasService.createQueja(queja, this.uploader).susbribe;
        this.quejasService.saveData(queja).subscribe(function (retvalue) {
            if (retvalue) {
                var tempstr = retvalue['value'];
                if (tempstr != null && tempstr != '') {
                    //this.registrodata=JSON.parse('['+retvalue["value"].slice(0, -1) +']');
                    _this.vanio = tempstr.anio;
                    _this.vsecuencia = tempstr.noQueja;
                    _this.vidqueja = tempstr.idQueja;
                    _this.completado = true;
                    _this.success = true;
                }
                else {
                    ////console.log('no llego');
                }
            }
            else {
                ////console.log('Rest service response ERROR.');
            }
            _this.quejasService.dynamicAssignment(queja).subscribe(function (response) {
                console.log('respuesta de asignacion: ', response);
            });
        });
        this.quejasService.consumidor = null;
        this.quejasService.proveedor = null;
        this.quejasService.quejat = null;
        this.quejasService.sucursal = null;
        this.quejasService.idsucursal = null;
    };
    QuejaComponent.prototype.onDismissClicked = function () {
        this.success = false;
        this.otro = null;
        this.factura = null;
        this.dpi = null;
        this.quejaForm.reset();
    };
    QuejaComponent.prototype.onHomeClicked = function () {
        this.CerrarSesion();
        //this.router.navigate(['/Login']);
        this.cerrar_ = 'si';
        //let localresp: QuejaComponent= new QuejaComponent();
        //	this.dialogRef.close(this);
    };
    QuejaComponent.prototype.CerrarSesion = function () {
        /*
          let loc_token=this._submitFormService.Get_token();
          //console.log(loc_token);
          if(loc_token == '')
              this._seguridadService.RedireccionarLogin();
          this._seguridadService.Logout(loc_token).subscribe((retvalue)=>{
              //console.log('cerrar sesion',retvalue);
              this._seguridadService.RedireccionarLogin();
          },(error)=>{
              this._seguridadService.RedireccionarLogin();
          });
          */
    };
    //graba datos para imprimir la queja
    QuejaComponent.prototype.onPrintQueja = function () {
        var _this = this;
        this.quejasService.add_FormQueja(this.vidqueja, '1', 'this.vid').subscribe(function (response) {
            var tempstr = response;
            //console.info("findByQuejaById consumidor ",tempstr);
            if (tempstr != null || tempstr != undefined) {
                //console.info("existe",tempstr);
                if (tempstr.reason = 'OK') {
                    //console.log('entro a getFormularioQuejaRegistro');
                    var tempresponse = tempstr['value'];
                    var registrodata = JSON.parse('[' + response['value'].slice(0, -1) + ']');
                    //console.log('entro a getFormularioQuejaRegistro',registrodata[0]['id'],tempresponse,tempstr.value["id"],tempresponse["id"],tempresponse['id'], tempresponse.id,tempstr['value']['id']);
                    //this.quejasService.getFormularioQuejaRegistro(registrodata[0]['id'],this.vid).subscribe((Data)=>{
                    _this.quejasService.getFormularioQuejaRegistro(_this.vidqueja, 'this.vid').subscribe(function (Data) {
                        console.log('entro a openRegisto');
                        //this._registrosservice.FileDownLoadChoose(Data,1);
                        var blob = new Blob([Data], { type: 'application/pdf' });
                        var url = window.URL.createObjectURL(blob);
                        var pwa = window.open(url);
                        if (!pwa || pwa.closed || typeof pwa.closed == 'undefined') {
                            alert('Por favor deshabilite su bloqueador de Pop-ups e intente de nuevo.');
                        }
                        //this.flagInfoError=false;
                    }, function (error) {
                        console.log(error);
                        //this.flagInfoError=true;
                        //this.SetSecTimerInfoError();
                    });
                }
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                alert('Error no se logró imprimir su solicitud por favor ingrese al sistema para reimpresión, gracias.');
            }
        });
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ViewChild"])('filDpi'),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", _angular_core__WEBPACK_IMPORTED_MODULE_1__["ElementRef"])
    ], QuejaComponent.prototype, "filDpi", void 0);
    QuejaComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-queja',
            template: __webpack_require__(/*! ./queja.component.html */ "./src/app/queja/queja.component.html"),
            styles: [__webpack_require__(/*! ./queja.component.scss */ "./src/app/queja/queja.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _shared_quejas_service__WEBPACK_IMPORTED_MODULE_4__["QuejasService"],
            _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_8__["SubmitFormService"],
            _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_9__["SeguridadService"],
            ngx_bootstrap_datepicker__WEBPACK_IMPORTED_MODULE_10__["BsLocaleService"]])
    ], QuejaComponent);
    return QuejaComponent;
}());



/***/ }),

/***/ "./src/app/quejapr/quejapr.component.html":
/*!************************************************!*\
  !*** ./src/app/quejapr/quejapr.component.html ***!
  \************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n<head>\n\n</head>\n<body>\n    \n\t<div class=\"container\">\n\t\n\t\n\t<!--img src=\"imagen-grd2.png\" class=\"center\"/-->\n\t\t<div class=\"row\">\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t<img src=\"/assets/img/logo-diaco-ant.jpg\" class=\"headerimg\" />\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t</div>\n\t</div>\n\n<div class=\"container\" *ngIf=\"continuar=='1'\">\n\n \n  \n  <!--div class=\"row\">\n    <h2></h2>\n  </div-->\n  <div class=\"row\">\n    <div class=\"col-lg-12\">\n      <form [formGroup]=\"quejaForm\" (ngSubmit)=\"onSubmit()\" novalidate>\n\t   \t<div class=\"form-group row\">\n        <label for=\"\" class=\"col-lg-8 col-form-label\">Consulta/Solicitud de parte del <strong>Proveedor.</strong></label>\n\t\t\n\t\t<div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t  <label for=\"detalleQueja\"  class=\"col-lg-12 col-form-label\" [ngStyle]=\"{color: 'blue'}\"></label>\n\t\t\t\t  <div class=\"col-lg\">\n\t\t\t\t\t{{_vConsulta}}\n\t\t\t\t  </div>\n\t\t\t\t</div>  \n\t\t\t  </div>\n\t\t\t</div>\n\t\t</div>\n\t\t</div>\n\n\t\t<div class=\"form-group row\">\n\t\t\t<label for=\"\" class=\"col-lg-2 col-form-label\"><strong>Respuesta</strong></label>\n\t\t\t<div class=\"col-lg-12\">\n\t\t\t\t<div class=\"card\">\n\t\t\t\t  <div class=\"card-body\">\n\t\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\t  <label for=\"respuesta\"  class=\"col-lg-12 col-form-label\" [ngStyle]=\"{color: 'blue'}\"></label>\n\t\t\t\t\t  <div class=\"col-lg\">\n\t\t\t\t\t\t<textarea\n\t\t\t\t\t\t  id=\"respuesta\"\n\t\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t\t\t  matTooltip=\"Ingrese su respuesta\"\n\t\t\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  formControlName=\"respuesta\"\n\t\t\t\t\t\t  maxLength=\"200\"\n\t\t\t\t\t\t  required\n\t\t\t\t\t\t  placeholder=\"Escribe aquí tu respuesta\"\n\t\t\t\t\t\t  ></textarea>\n\t\t\t\t\t  </div>\n\t\t\t\t\t</div>  \n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t</div>\n\t\t\t</div>\n\t  \n\t  \n\t  \n\t\t<div class=\"form-group row\">\n          <label for=\"\" class=\"col-lg-3 col-form-label\">Datos Consumidor</label>\n\t\t   \n\t\t<div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t  \n\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\n\t\t\t\t<label for=\"et1\" >(-)</label>\n\t\t\t\t<label for=\"dpiPasaporte\" class=\"col-lg-2 col-form-label\" >DPI o pasaporte</label>\n          <div class=\"col-lg-3\">\n            <input\n              id=\"dpiPasaporte\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su DPI o Pasaporte\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"dpiPasaporte\"\n\t\t\t  (change)=\"onDocumentoIdentificacionChanged()\"\n\t\t\t  placeholder=\"Documento\"\n\t\t\t  required\n\t\t\t  >\n\n          </div>\n\t\t  <label for=\"et2\" [ngStyle]=\"{color: 'red'}\" class=\"col-lg-1 col-form-label\"></label>\n\t\t  <label for=\"et2\" [ngStyle]=\"{color: 'red'}\" >(*)</label>\n\t\t  <label for=\"nombre\" class=\"col-lg-2 col-form-label\">Nombre(s)</label>\n\t\t  <div class=\"col-lg-3\" *ngIf=\"_vdatos == '10'\">\n\t\t\t<input\n\t\t\t  id=\"nombre\"\n\t\t\t  type=\"text\"\n\t\t\t  class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t  matTooltip=\"Ingrese su nombre\"\n\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t  formControlName=\"nombre\" \n\t\t\t  placeholder=\"Nombre(s)\"\n\t\t\t  required>\n\t\t  </div>\n\t\t  <div class=\"col-lg-3\"   >\n\t\t\t<label [ngStyle]=\"{color: 'blue'}\">{{_pnombre}}</label>\n\t\t</div>\n\t\t\t\t  \n\t\t\t\t</div>\n\t\t\t\t\n\t\t\t\t\n\t\n\t\n\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\n\t<label for=\"et3\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t  <label for=\"apellido\" class=\"col-lg-2 col-form-label\">Apellido(s)</label>\n\t  <div class=\"col-lg-3\" *ngIf=\"_vdatos == '1O'\">\n\t\t<input\n\t\t  id=\"apellido\"\n\t\t  type=\"text\"\n\t\t  class=\"form-control\"\n\t\t  matTooltipPosition=\"after\"\n\t\t  matTooltip=\"Ingrese su apellido\"\n\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t  formControlName=\"apellido\" \n\t\t  placeholder=\"Apellido(s)\"\n\t\t  required>\n\t  </div>\n\t   <div class=\"col-lg-3\"   >\n\t\t\t<label [ngStyle]=\"{color: 'blue'}\">{{_papellido}}</label>\n\t\t</div>\n\t\t\t\t\t <label for=\"et2\" [ngStyle]=\"{color: 'red'}\" class=\"col-lg-1 col-form-label\"></label>\n\t\t <label for=\"et4\" [ngStyle]=\"{color: 'red'}\">(*)</label>\t\t\n          <label for=\"telefono\" class=\"col-lg-2 col-form-label\">telefono</label>\n          <div class=\"col-lg-3\" *ngIf=\"_vdatos == '10'\">\n            <input\n              id=\"telefono\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su Número de teléfono\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"telefono\"\n\t\t\t  placeholder=\"Teléfono\"\n\t\t\t   pattern=\"^[0-9]{8}$\"\n\t\t\t  required>\n          </div>\n\t\t  <div class=\"col-lg-3\"   >\n\t\t\t<label [ngStyle]=\"{color: 'blue'}\">{{_ptelefono}}</label>\n\t\t</div>\n\t\t  </div>\n\t\t  <div class=\"form-group row\">\n\t\t  <label for=\"et5\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t\t  <label for=\"correo\" class=\"col-lg-2 col-form-label\">Correo Electronico</label>\n          <div class=\"col-lg-3\" *ngIf=\"_vdatos == '10'\" >\n            <input\n              id=\"correo\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su correo electrónico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"correo\"\n\t\t\t  placeholder=\"Correo\"\n\t\t\t  pattern=\"^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$\"\n\t\t\t  required>\n          </div>\n\t\t  <div class=\"col-lg-3\"  >\n\t\t\t<label [ngStyle]=\"{color: 'blue'}\">{{_pcorreo}}</label>\n\t\t</div>\n        </div>\n\t\t\t\t\n\t\t\t\n\t\t<div class=\"form-group row\">\n\t\t  <label for=\"et6\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n          <label for=\"detalleQueja\" class=\"col-lg-2 col-form-label\">Detalle Queja (sea breve y conciso)</label>\n          <div class=\"col-lg-3\" *ngIf=\"_vdatos == '1'\">\n            <textarea\n              id=\"detalleQueja\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su queja\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"detalleQueja\"\n\t\t\t  maxLength=\"1000\"\n\t\t\t  required\n\t\t\t  ></textarea>\n          </div>\n\t\t<div class=\"col-lg-3\" *ngIf=\"_vdatos == '0'\"  >\n\t\t\t<label [ngStyle]=\"{color: 'blue'}\">{{_detalle}}</label>\n\t\t</div>\n         <label for=\"et7\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n          <label for=\"solicitaQue\" class=\"col-lg-2 col-form-label\">Petición Queja (sea breve y conciso)</label>\n          <div class=\"col-lg-3\" *ngIf=\"_vdatos == '1'\">\n            <textarea\n              id=\"solicitaQue\"\n              class=\"form-control\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su solicitud de la queja ingresada.\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              formControlName=\"solicitaQue\"\n\t\t\t  maxLength=\"250\"\n\t\t\t  required\n\t\t\t  ></textarea>\n          </div>\n\t\t\t<div class=\"col-lg-3\" *ngIf=\"_vdatos == '0'\"  >\n\t\t\t\t<label [ngStyle]=\"{color: 'blue'}\">{{_solicitud}}</label>\n\t\t\t</div>\n        </div>\n\t\t\t\t\n\t\t\t  </div>\n\t\t\t</div>\n\t\t</div>\n\t\t</div>\n\t\t<!--div *ngIf=\"quejaForm.get('dpiPasaporte').errors && quejaForm.get('dpiPasaporte').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('dpiPasaporte').hasError('required')\" [ngStyle]=\"{color: 'red'}\">Ingrese su DPI o Pasaporte</p>\n\t\t\t  </div>\n\t\t<div *ngIf=\"quejaForm.get('telefono').errors && quejaForm.get('telefono').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('telefono').hasError('pattern')\" [ngStyle]=\"{color: 'red'}\" >Error en numero de telefono</p>\n\t\t\t  </div>\n\t\t<div *ngIf=\"quejaForm.get('correo').errors && quejaForm.get('correo').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('correo').hasError('pattern')\" [ngStyle]=\"{color: 'red'}\">Error en formato de correo</p>\n\t\t\t  </div>\t \n\t\t<div *ngIf=\"quejaForm.get('detalleQueja').errors && quejaForm.get('detalleQueja').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('detalleQueja').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Detalle de queda solo admite 250 caracteres</p>\n\t\t\t  </div>\t  \n\t\t<div *ngIf=\"quejaForm.get('solicitaQue').errors && quejaForm.get('solicitaQue').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('solicitaQue').hasError('maxLength')\" [ngStyle]=\"{color: 'red'}\">Solicitud de queja solo admite 250 caracteres</p>\n\t\t\t  </div-->\t\n\t\t\t  \n\t\t<div class=\"form-group row\">\n          <label for=\"\" class=\"col-lg-2 col-form-label\">Datos Proveedor</label>\n\t\t<div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t  \n\t\t\t  <div class=\"form-group row\">\n\t\t\t      <label for=\"et8\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t\t\t\t  <label for=\"nitProveedor\" class=\"col-lg-2 col-form-label\">NIT</label>\n\t\t\t\t  <div class=\"col-lg-3\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nitProveedor\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese NIT del proveedor\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  formControlName=\"nitProveedor\"\n\t\t\t\t\t  (click)=\"onProveedorChanged()\"\n\t\t\t\t\t  placeholder=\"NIT\"\n\t\t\t\t\t  pattern=\"^[0-9]+([0-9]|[K]|[k]){1}$\"\n\t\t\t\t\t  required>\n\t\t\t\t\t  \n\t\t\t\t\t  \n\t\t\t\t  </div>\n\t\t\t\t   <label for=\"et2\" [ngStyle]=\"{color: 'red'}\" class=\"col-lg-1 col-form-label\"></label>\n\t\t\t\t  <label for=\"et9\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t\t\t\t  <label for=\"ubicacion\" class=\"col-lg-2 col-form-label\">Ubicacion</label>\n\t\t\t\t  <div class=\"col-lg-3\" *ngIf=\"_vdatos == '1'\"  >\n\t\t\t\t  <input\n\t\t\t\t\t  id=\"ubicacion\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese ubicacion\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  formControlName=\"ubicacion\"\n\t\t\t\t\t  placeholder=\"Ubicación\"\n\t\t\t\t\t  required>\n\t\t\t\t </div>\n\t\t\t\t <div class=\"col-lg-3\" *ngIf=\"_vdatos == '0'\"  >\n\t\t\t\t\t<label [ngStyle]=\"{color: 'blue'}\">{{_ubicacion}}</label>\n\t\t\t\t</div>\n\t\t\t</div>\n\t\t\t\n\t\t\t<div class=\"form-group row\">\n\t\t\t<label for=\"nitProveedor\" class=\"col-lg-10 col-form-label\" [ngStyle]=\"{color: 'blue'}\" >{{nproveedor}}</label>\n\t\t\t\t\n\t\t\t</div>\n\t\t\t\n\t\t\t  </div>\n\t\t\t</div>\n\t\t</div>\n\t\t  \n\t\t \n\t\t  \n\t\t</div>\n\t\t<div *ngIf=\"quejaForm.get('nitProveedor').errors && quejaForm.get('nitProveedor').dirty\">\n\t\t\t\t<p *ngIf=\"quejaForm.get('nitProveedor').hasError('pattern')\" [ngStyle]=\"{color: 'red'}\">Error NIT incorrecto</p>\n\t\t\t  </div>\n\t\t\n\t\t\n        <div class=\"form-group row\" *ngIf=\"_varchivos=='1'\">\n          <label for=\"\" class=\"col-lg-12 col-form-label\">Datos Adjuntos</label>\n          <div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <div class=\"form-group row\">\n\t\t\t\t  <label for=\"et9\" [ngStyle]=\"{color: 'red'}\">(*)</label> \n                  <label for=\"filFactura\" class=\"col-lg-2 col-form-label\">Factura o Contrato</label>\n                  <div class=\"col-lg-10\">\n                    <input\n                      #filFactura\n                      id=\"filFactura\"\n\t                      type=\"file\"\n                      ng2FileSelect\n                      [uploader]=\"uploader\"\n                      class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"above\"\n\t\t\t\t\t  matTooltip=\"Agrege copia de su documento.\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n                      (change)=\"onFileChanged('FAC')\"\n\t\t\t\t\t  required>\n                  </div>\n                </div>\n                <div class=\"form-group row\">\n\t\t\t\t  <label for=\"et9\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n                  <label for=\"filDpi\" class=\"col-lg-2 col-form-label\">DPI o Pasaporte</label>\n                  <div class=\"col-lg-10\">\n                    <input\n                      #filDpi\n                      id=\"filDpi\"\n                      type=\"file\"\n                      ng2FileSelect\n                      [uploader]=\"uploader\"\n                      class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"above\"\n\t\t\t\t\t  matTooltip=\"Agrege su copia de DPI o Pasaporte\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n                      (change)=\"onFileChanged('DPI')\"\n\t\t\t\t\t  required>\n                  </div>\n                </div>\n                <div class=\"row\">\n                  <p>Estos documentos deben ir completos, por ejemplo el DPI debe ser escaneado a ambos lados.</p>\n                </div>\n              </div>\n            </div>\n          </div>\n\t\t  <label class=\"col-form-label\" >(Los campos marcados </label>\n\t\t  <label class=\"col-form-label\" [ngStyle]=\"{color: 'red'}\">  (*)  </label>\n\t\t  <label class=\"col-form-label\" > son obligatorios.)</label>\n        </div>\n\t\t\n\n\t\t\n\t\t\n        <div class=\"form-group row\" *ngIf=\"success==false\">\n          <div class=\"col-lg-12 text-center\">\n            <button\n              class=\"btn btn-primary\"\n              type=\"submit\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Grabe su queja.\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n              >Guardar Queja</button>\n          </div>\n\t\t</div>  \n\t\t<!--div class=\"form-group row\">\n\t\t  <div class=\"col-lg-12 text-center\">\n            <button type=\"button\" class=\"btn btn-primary row\" (click)=\"onDismissClicked()\">{{cancelar}}</button>\n          </div>\n  \n        </div-->\n      </form>\n\t<div *ngIf=\"showSpinner\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tFavor espere se grabe su queja..\n\t</div>\n\t  \n  \n    </div>\n  </div>\n  \n  <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\" *ngIf=\"success\">\n    <strong>Queja registrada!</strong> La solicitud de actualización de su queja ha sido registrada exitosamente. {{vsecanio}}-{{vanio}} \n\n  </div>\n    \n</div>\n    <!--img src=\"diaco-grd.jpg\" class=\"center\"/-->\n\t<div class=\"container\">\n\t\t<div class=\"row\">\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t<!-- <img class=\"footerimg\" /> -->\n\t\t\t</div>\n\t\t\t<div class=\"col-lg-4 text-center\">\n\t\t\t\t&nbsp;\n\t\t\t</div>\n\t\t</div>\n\t</div>\n\n\n</body>\n</html>\n"

/***/ }),

/***/ "./src/app/quejapr/quejapr.component.scss":
/*!************************************************!*\
  !*** ./src/app/quejapr/quejapr.component.scss ***!
  \************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "/* BASIC */\n.headerimg {\n  width: 100%;\n  height: auto; }\n.footerimg {\n  content: url('diaco-grd.jpg');\n  width: 100%;\n  height: auto; }\nbody {\n  background-image: url('/dist6/assets/img/logo-diaco-ant-bn.jpg');\n  background-repeat: no-repeat, no-repeat;\n  background-attachment: fixed, fixed;\n  background-size: auto auto, auto auto;\n  background-position: bottom right, bottom left;\n  min-height: 100vh; }\nhtml {\n  background-color: #56baed; }\nbody {\n  font-family: \"Poppins\", sans-serif;\n  height: 100vh; }\na.underlineHover {\n  color: #e68a00;\n  display: inline-block;\n  text-decoration: none;\n  font-weight: 400; }\nh2 {\n  text-align: center;\n  font-size: 16px;\n  font-weight: 600;\n  text-transform: uppercase;\n  display: inline-block;\n  margin: 40px 8px 10px 8px;\n  color: #cccccc; }\n/* STRUCTURE */\n.wrapper {\n  display: flex;\n  align-items: center;\n  flex-direction: column;\n  justify-content: center;\n  width: 100%;\n  min-height: 100%;\n  padding: 20px; }\n#formContent {\n  border-radius: 10px 10px 10px 10px;\n  background: #fff;\n  padding: 30px;\n  width: 90%;\n  max-width: 450px;\n  position: relative;\n  padding: 0px;\n  box-shadow: 0 30px 60px 0 rgba(0, 0, 0, 0.3);\n  text-align: center;\n  background-color: #00284d; }\n#formFooter {\n  background-color: #f6f6f7;\n  border-top: 1px solid #dce8f1;\n  padding: 25px;\n  text-align: center;\n  border-radius: 0 0 10px 10px; }\n/* TABS */\nh2.inactive {\n  color: #cccccc; }\nh2.active {\n  color: #0d0d0d;\n  border-bottom: 2px solid #5fbae9; }\n/* FORM TYPOGRAPHY*/\ninput[type=button], input[type=submit], input[type=reset] {\n  background-color: #1aa3ff;\n  border: none;\n  color: white;\n  padding: 15px 80px;\n  text-align: center;\n  text-decoration: none;\n  display: inline-block;\n  text-transform: uppercase;\n  font-size: 10px;\n  box-shadow: 0 10px 30px 0 rgba(95, 186, 233, 0.4);\n  border-radius: 5px 5px 5px 5px;\n  margin: 5px 20px 40px 20px;\n  transition: all 0.3s ease-in-out; }\ninput[type=button]:hover, input[type=submit]:hover, input[type=reset]:hover {\n  background-color: #e68a00; }\ninput[type=button]:active, input[type=submit]:active, input[type=reset]:active {\n  transform: scale(0.95); }\ninput[type=text], input[type=password] {\n  background-color: #f6f6f6;\n  border: none;\n  color: #0d0d0d;\n  padding: 15px 32px;\n  text-align: center;\n  text-decoration: none;\n  display: inline-block;\n  font-size: 16px;\n  margin: 5px;\n  width: 110%;\n  border: 2px solid #f6f6f6;\n  transition: all 0.5s ease-in-out;\n  border-radius: 5px 5px 5px 5px; }\ninput[type=text]:focus, input[type=password]:focus {\n  background-color: #fff;\n  border-bottom: 2px solid #5fbae9; }\ninput[type=text]:placeholder {\n  color: #cccccc; }\n/* ANIMATIONS */\n/* Simple CSS3 Fade-in-down Animation */\n.fadeInDown {\n  -webkit-animation-name: fadeInDown;\n  animation-name: fadeInDown;\n  -webkit-animation-duration: 1s;\n  animation-duration: 1s;\n  -webkit-animation-fill-mode: both;\n  animation-fill-mode: both; }\n@-webkit-keyframes fadeInDown {\n  0% {\n    opacity: 0;\n    transform: translate3d(0, -100%, 0); }\n  100% {\n    opacity: 1;\n    transform: none; } }\n@keyframes fadeInDown {\n  0% {\n    opacity: 0;\n    transform: translate3d(-100%, 0, 0); }\n  100% {\n    opacity: 1;\n    transform: none; } }\n/* Simple CSS3 Fade-in Animation */\n@-webkit-keyframes fadeIn {\n  from {\n    opacity: 0; }\n  to {\n    opacity: 1; } }\n@keyframes fadeIn {\n  from {\n    opacity: 0; }\n  to {\n    opacity: 1; } }\n.fadeIn {\n  opacity: 0;\n  -webkit-animation: fadeIn ease-in 1;\n  animation: fadeIn ease-in 1;\n  -webkit-animation-fill-mode: forwards;\n  animation-fill-mode: forwards;\n  -webkit-animation-duration: 1s;\n  animation-duration: 1s; }\n.fadeIn.first {\n  -webkit-animation-delay: 0.4s;\n  animation-delay: 0.4s; }\n.fadeIn.second {\n  -webkit-animation-delay: 0.6s;\n  animation-delay: 0.6s; }\n.fadeIn.third {\n  -webkit-animation-delay: 0.8s;\n  animation-delay: 0.8s; }\n.fadeIn.fourth {\n  -webkit-animation-delay: 1s;\n  animation-delay: 1s; }\n/* Simple CSS3 Fade-in Animation */\n.underlineHover:after {\n  display: block;\n  left: 0;\n  bottom: -10px;\n  width: 0;\n  height: 2px;\n  background-color: #56baed;\n  content: \"\";\n  transition: width 0.2s; }\n.underlineHover:hover {\n  /*color: #1aa3ff;*/ }\n.underlineHover:hover:after {\n  width: 100%; }\n/* OTHERS */\n*:focus {\n  outline: none; }\n#icon {\n  width: 60%; }\nhtml, body {\n  height: 100%; }\n/*footer css*/\n#wrap {\n  min-height: 100%; }\n#main {\n  overflow: auto;\n  padding-bottom: 150px;\n  /* this needs to be bigger than footer height*/ }\n.page-footer {\n  background-color: #00284d;\n  color: white; }\n.footer-copyright {\n  color: white; }\n.footer-link {\n  color: white;\n  text-decoration: underline; }\n.footer-link:hover {\n  color: #e68a00;\n  text-decoration: underline; }\n.footer-margin {\n  position: fixed;\n  bottom: 0;\n  width: 100%;\n  /* Set the fixed height of the footer here */\n  height: 100px;\n  /*line-height: 100px;*/\n  /* Vertically center the text there */ }\n.center {\n  margin-left: auto;\n  margin-right: auto;\n  display: block; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvcXVlamFwci9DOlxcVXNlcnNcXGpqYWd1aWxhbFxcRG9jdW1lbnRzXFxESUFDTyBBUFBcXFFVRUpBUy1ESUFDT1xcRnJvbnRlbmRcXGRpc3Q2L3NyY1xcYXBwXFxxdWVqYXByXFxxdWVqYXByLmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUNBLFVBQUE7QUFFQTtFQUVFLFdBQVc7RUFDWCxZQUFZLEVBQUE7QUFFZDtFQUNLLDZCQUFnQztFQUNuQyxXQUFXO0VBQ1gsWUFBWSxFQUFBO0FBSWQ7RUFDQyxnRUFBd0Q7RUFDeEQsdUNBQXVDO0VBQ3ZDLG1DQUFtQztFQUNuQyxxQ0FBcUM7RUFDckMsOENBQThDO0VBQzlDLGlCQUFnQixFQUFBO0FBSWpCO0VBQ0UseUJBQXlCLEVBQUE7QUFHM0I7RUFDRSxrQ0FBa0M7RUFDbEMsYUFBYSxFQUFBO0FBR2Y7RUFDRSxjQUFjO0VBQ2QscUJBQW9CO0VBQ3BCLHFCQUFxQjtFQUNyQixnQkFBZ0IsRUFBQTtBQUdsQjtFQUNFLGtCQUFrQjtFQUNsQixlQUFlO0VBQ2YsZ0JBQWdCO0VBQ2hCLHlCQUF5QjtFQUN6QixxQkFBb0I7RUFDcEIseUJBQXlCO0VBQ3pCLGNBQWMsRUFBQTtBQUtoQixjQUFBO0FBRUE7RUFDRSxhQUFhO0VBQ2IsbUJBQW1CO0VBQ25CLHNCQUFzQjtFQUN0Qix1QkFBdUI7RUFDdkIsV0FBVztFQUNYLGdCQUFnQjtFQUNoQixhQUFhLEVBQUE7QUFHZjtFQUVFLGtDQUFrQztFQUNsQyxnQkFBZ0I7RUFDaEIsYUFBYTtFQUNiLFVBQVU7RUFDVixnQkFBZ0I7RUFDaEIsa0JBQWtCO0VBQ2xCLFlBQVk7RUFFWiw0Q0FBeUM7RUFDekMsa0JBQWtCO0VBQ2xCLHlCQUF5QixFQUFBO0FBRzNCO0VBQ0UseUJBQXlCO0VBQ3pCLDZCQUE2QjtFQUM3QixhQUFhO0VBQ2Isa0JBQWtCO0VBRWxCLDRCQUE0QixFQUFBO0FBSzlCLFNBQUE7QUFFQTtFQUNFLGNBQWMsRUFBQTtBQUdoQjtFQUNFLGNBQWM7RUFDZCxnQ0FBZ0MsRUFBQTtBQUtsQyxtQkFBQTtBQUVBO0VBQ0UseUJBQXlCO0VBQ3pCLFlBQVk7RUFDWixZQUFZO0VBQ1osa0JBQWtCO0VBQ2xCLGtCQUFrQjtFQUNsQixxQkFBcUI7RUFDckIscUJBQXFCO0VBQ3JCLHlCQUF5QjtFQUN6QixlQUFlO0VBRWYsaURBQThDO0VBRTlDLDhCQUE4QjtFQUM5QiwwQkFBMEI7RUFLMUIsZ0NBQWdDLEVBQUE7QUFHbEM7RUFDRSx5QkFBeUIsRUFBQTtBQUczQjtFQUtFLHNCQUFzQixFQUFBO0FBR3hCO0VBQ0UseUJBQXlCO0VBQ3pCLFlBQVk7RUFDWixjQUFjO0VBQ2Qsa0JBQWtCO0VBQ2xCLGtCQUFrQjtFQUNsQixxQkFBcUI7RUFDckIscUJBQXFCO0VBQ3JCLGVBQWU7RUFDZixXQUFXO0VBQ1gsV0FBVztFQUNYLHlCQUF5QjtFQUt6QixnQ0FBZ0M7RUFFaEMsOEJBQThCLEVBQUE7QUFHaEM7RUFDRSxzQkFBc0I7RUFDdEIsZ0NBQWdDLEVBQUE7QUFHbEM7RUFDRSxjQUFjLEVBQUE7QUFLaEIsZUFBQTtBQUVBLHVDQUFBO0FBQ0E7RUFDRSxrQ0FBa0M7RUFDbEMsMEJBQTBCO0VBQzFCLDhCQUE4QjtFQUM5QixzQkFBc0I7RUFDdEIsaUNBQWlDO0VBQ2pDLHlCQUF5QixFQUFBO0FBRzNCO0VBQ0U7SUFDRSxVQUFVO0lBRVYsbUNBQW1DLEVBQUE7RUFFckM7SUFDRSxVQUFVO0lBRVYsZUFBZSxFQUFBLEVBQUE7QUFJbkI7RUFDRTtJQUNFLFVBQVU7SUFFVixtQ0FBbUMsRUFBQTtFQUVyQztJQUNFLFVBQVU7SUFFVixlQUFlLEVBQUEsRUFBQTtBQUluQixrQ0FBQTtBQUNBO0VBQTRCO0lBQU8sVUFBUyxFQUFBO0VBQUk7SUFBSyxVQUFTLEVBQUEsRUFBQTtBQUU5RDtFQUFvQjtJQUFPLFVBQVMsRUFBQTtFQUFJO0lBQUssVUFBUyxFQUFBLEVBQUE7QUFFdEQ7RUFDRSxVQUFTO0VBQ1QsbUNBQWtDO0VBRWxDLDJCQUEwQjtFQUUxQixxQ0FBb0M7RUFFcEMsNkJBQTRCO0VBRTVCLDhCQUE2QjtFQUU3QixzQkFBcUIsRUFBQTtBQUd2QjtFQUNFLDZCQUE2QjtFQUU3QixxQkFBcUIsRUFBQTtBQUd2QjtFQUNFLDZCQUE2QjtFQUU3QixxQkFBcUIsRUFBQTtBQUd2QjtFQUNFLDZCQUE2QjtFQUU3QixxQkFBcUIsRUFBQTtBQUd2QjtFQUNFLDJCQUEyQjtFQUUzQixtQkFBbUIsRUFBQTtBQUdyQixrQ0FBQTtBQUNBO0VBQ0UsY0FBYztFQUNkLE9BQU87RUFDUCxhQUFhO0VBQ2IsUUFBUTtFQUNSLFdBQVc7RUFDWCx5QkFBeUI7RUFDekIsV0FBVztFQUNYLHNCQUFzQixFQUFBO0FBR3hCO0VBQ0Usa0JBQUEsRUFBbUI7QUFHckI7RUFDRSxXQUFXLEVBQUE7QUFLYixXQUFBO0FBRUE7RUFDSSxhQUFhLEVBQUE7QUFHakI7RUFDRSxVQUFTLEVBQUE7QUFHWDtFQUNFLFlBQVksRUFBQTtBQUdkLGFBQUE7QUFFQTtFQUNFLGdCQUFnQixFQUFBO0FBR2xCO0VBQ0UsY0FBYTtFQUNiLHFCQUFvQjtFQUFFLDhDQUFBLEVBQStDO0FBR3ZFO0VBQ0UseUJBQXlCO0VBQ3pCLFlBQVcsRUFBQTtBQUdiO0VBQ0MsWUFBVyxFQUFBO0FBR1o7RUFDQyxZQUFXO0VBQ1gsMEJBQTBCLEVBQUE7QUFHM0I7RUFDQyxjQUFhO0VBQ2IsMEJBQTBCLEVBQUE7QUFHM0I7RUFDRSxlQUFlO0VBQ2YsU0FBUztFQUNULFdBQVc7RUFDWCw0Q0FBQTtFQUNBLGFBQWE7RUFDYixzQkFBQTtFQUF3QixxQ0FBQSxFQUFzQztBQUdoRTtFQUNJLGlCQUFpQjtFQUNqQixrQkFBa0I7RUFDbEIsY0FBYyxFQUFBIiwiZmlsZSI6InNyYy9hcHAvcXVlamFwci9xdWVqYXByLmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsiXG4vKiBCQVNJQyAqL1xuXG4uaGVhZGVyaW1ne1xuICAgIFxuXHQgd2lkdGg6IDEwMCU7XG5cdCBoZWlnaHQ6IGF1dG87XG59XG4uZm9vdGVyaW1ne1xuICAgICBjb250ZW50OnVybChcImNzcy9kaWFjby1ncmQuanBnXCIpO1xuXHQgd2lkdGg6IDEwMCU7XG5cdCBoZWlnaHQ6IGF1dG87XG59XG4gXG4gXG5ib2R5IHtcblx0YmFja2dyb3VuZC1pbWFnZTogdXJsKC9hc3NldHMvaW1nL2xvZ28tZGlhY28tYW50LWJuLmpwZyk7XG5cdGJhY2tncm91bmQtcmVwZWF0OiBuby1yZXBlYXQsIG5vLXJlcGVhdDtcblx0YmFja2dyb3VuZC1hdHRhY2htZW50OiBmaXhlZCwgZml4ZWQ7XG5cdGJhY2tncm91bmQtc2l6ZTogYXV0byBhdXRvLCBhdXRvIGF1dG87XG5cdGJhY2tncm91bmQtcG9zaXRpb246IGJvdHRvbSByaWdodCwgYm90dG9tIGxlZnQ7XG5cdG1pbi1oZWlnaHQ6MTAwdmg7IFxufVxuXG4gXG5odG1sIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzU2YmFlZDtcbn1cblxuYm9keSB7XG4gIGZvbnQtZmFtaWx5OiBcIlBvcHBpbnNcIiwgc2Fucy1zZXJpZjtcbiAgaGVpZ2h0OiAxMDB2aDtcbn1cblxuYS51bmRlcmxpbmVIb3ZlciB7XG4gIGNvbG9yOiAjZTY4YTAwO1xuICBkaXNwbGF5OmlubGluZS1ibG9jaztcbiAgdGV4dC1kZWNvcmF0aW9uOiBub25lO1xuICBmb250LXdlaWdodDogNDAwO1xufVxuXG5oMiB7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgZm9udC1zaXplOiAxNnB4O1xuICBmb250LXdlaWdodDogNjAwO1xuICB0ZXh0LXRyYW5zZm9ybTogdXBwZXJjYXNlO1xuICBkaXNwbGF5OmlubGluZS1ibG9jaztcbiAgbWFyZ2luOiA0MHB4IDhweCAxMHB4IDhweDsgXG4gIGNvbG9yOiAjY2NjY2NjO1xufVxuXG5cblxuLyogU1RSVUNUVVJFICovXG5cbi53cmFwcGVyIHtcbiAgZGlzcGxheTogZmxleDtcbiAgYWxpZ24taXRlbXM6IGNlbnRlcjtcbiAgZmxleC1kaXJlY3Rpb246IGNvbHVtbjsgXG4gIGp1c3RpZnktY29udGVudDogY2VudGVyO1xuICB3aWR0aDogMTAwJTtcbiAgbWluLWhlaWdodDogMTAwJTtcbiAgcGFkZGluZzogMjBweDtcbn1cblxuI2Zvcm1Db250ZW50IHtcbiAgLXdlYmtpdC1ib3JkZXItcmFkaXVzOiAxMHB4IDEwcHggMTBweCAxMHB4O1xuICBib3JkZXItcmFkaXVzOiAxMHB4IDEwcHggMTBweCAxMHB4O1xuICBiYWNrZ3JvdW5kOiAjZmZmO1xuICBwYWRkaW5nOiAzMHB4O1xuICB3aWR0aDogOTAlO1xuICBtYXgtd2lkdGg6IDQ1MHB4O1xuICBwb3NpdGlvbjogcmVsYXRpdmU7XG4gIHBhZGRpbmc6IDBweDtcbiAgLXdlYmtpdC1ib3gtc2hhZG93OiAwIDMwcHggNjBweCAwIHJnYmEoMCwwLDAsMC4zKTtcbiAgYm94LXNoYWRvdzogMCAzMHB4IDYwcHggMCByZ2JhKDAsMCwwLDAuMyk7XG4gIHRleHQtYWxpZ246IGNlbnRlcjtcbiAgYmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZDtcbn1cblxuI2Zvcm1Gb290ZXIge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjZjZmNmY3O1xuICBib3JkZXItdG9wOiAxcHggc29saWQgI2RjZThmMTtcbiAgcGFkZGluZzogMjVweDtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xuICAtd2Via2l0LWJvcmRlci1yYWRpdXM6IDAgMCAxMHB4IDEwcHg7XG4gIGJvcmRlci1yYWRpdXM6IDAgMCAxMHB4IDEwcHg7XG59XG5cblxuXG4vKiBUQUJTICovXG5cbmgyLmluYWN0aXZlIHtcbiAgY29sb3I6ICNjY2NjY2M7XG59XG5cbmgyLmFjdGl2ZSB7XG4gIGNvbG9yOiAjMGQwZDBkO1xuICBib3JkZXItYm90dG9tOiAycHggc29saWQgIzVmYmFlOTtcbn1cblxuXG5cbi8qIEZPUk0gVFlQT0dSQVBIWSovXG5cbmlucHV0W3R5cGU9YnV0dG9uXSwgaW5wdXRbdHlwZT1zdWJtaXRdLCBpbnB1dFt0eXBlPXJlc2V0XSAge1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjMWFhM2ZmO1xuICBib3JkZXI6IG5vbmU7XG4gIGNvbG9yOiB3aGl0ZTtcbiAgcGFkZGluZzogMTVweCA4MHB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIHRleHQtZGVjb3JhdGlvbjogbm9uZTtcbiAgZGlzcGxheTogaW5saW5lLWJsb2NrO1xuICB0ZXh0LXRyYW5zZm9ybTogdXBwZXJjYXNlOyBcbiAgZm9udC1zaXplOiAxMHB4O1xuICAtd2Via2l0LWJveC1zaGFkb3c6IDAgMTBweCAzMHB4IDAgcmdiYSg5NSwxODYsMjMzLDAuNCk7XG4gIGJveC1zaGFkb3c6IDAgMTBweCAzMHB4IDAgcmdiYSg5NSwxODYsMjMzLDAuNCk7XG4gIC13ZWJraXQtYm9yZGVyLXJhZGl1czogNXB4IDVweCA1cHggNXB4O1xuICBib3JkZXItcmFkaXVzOiA1cHggNXB4IDVweCA1cHg7XG4gIG1hcmdpbjogNXB4IDIwcHggNDBweCAyMHB4O1xuICAtd2Via2l0LXRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2UtaW4tb3V0O1xuICAtbW96LXRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2UtaW4tb3V0O1xuICAtbXMtdHJhbnNpdGlvbjogYWxsIDAuM3MgZWFzZS1pbi1vdXQ7XG4gIC1vLXRyYW5zaXRpb246IGFsbCAwLjNzIGVhc2UtaW4tb3V0O1xuICB0cmFuc2l0aW9uOiBhbGwgMC4zcyBlYXNlLWluLW91dDtcbn1cblxuaW5wdXRbdHlwZT1idXR0b25dOmhvdmVyLCBpbnB1dFt0eXBlPXN1Ym1pdF06aG92ZXIsIGlucHV0W3R5cGU9cmVzZXRdOmhvdmVyICB7XG4gIGJhY2tncm91bmQtY29sb3I6ICNlNjhhMDA7XG59XG5cbmlucHV0W3R5cGU9YnV0dG9uXTphY3RpdmUsIGlucHV0W3R5cGU9c3VibWl0XTphY3RpdmUsIGlucHV0W3R5cGU9cmVzZXRdOmFjdGl2ZSAge1xuICAtbW96LXRyYW5zZm9ybTogc2NhbGUoMC45NSk7XG4gIC13ZWJraXQtdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTtcbiAgLW8tdHJhbnNmb3JtOiBzY2FsZSgwLjk1KTtcbiAgLW1zLXRyYW5zZm9ybTogc2NhbGUoMC45NSk7XG4gIHRyYW5zZm9ybTogc2NhbGUoMC45NSk7XG59XG5cbmlucHV0W3R5cGU9dGV4dF0sIGlucHV0W3R5cGU9cGFzc3dvcmRdIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogI2Y2ZjZmNjtcbiAgYm9yZGVyOiBub25lO1xuICBjb2xvcjogIzBkMGQwZDtcbiAgcGFkZGluZzogMTVweCAzMnB4O1xuICB0ZXh0LWFsaWduOiBjZW50ZXI7XG4gIHRleHQtZGVjb3JhdGlvbjogbm9uZTtcbiAgZGlzcGxheTogaW5saW5lLWJsb2NrO1xuICBmb250LXNpemU6IDE2cHg7XG4gIG1hcmdpbjogNXB4O1xuICB3aWR0aDogMTEwJTtcbiAgYm9yZGVyOiAycHggc29saWQgI2Y2ZjZmNjtcbiAgLXdlYmtpdC10cmFuc2l0aW9uOiBhbGwgMC41cyBlYXNlLWluLW91dDtcbiAgLW1vei10cmFuc2l0aW9uOiBhbGwgMC41cyBlYXNlLWluLW91dDtcbiAgLW1zLXRyYW5zaXRpb246IGFsbCAwLjVzIGVhc2UtaW4tb3V0O1xuICAtby10cmFuc2l0aW9uOiBhbGwgMC41cyBlYXNlLWluLW91dDtcbiAgdHJhbnNpdGlvbjogYWxsIDAuNXMgZWFzZS1pbi1vdXQ7XG4gIC13ZWJraXQtYm9yZGVyLXJhZGl1czogNXB4IDVweCA1cHggNXB4O1xuICBib3JkZXItcmFkaXVzOiA1cHggNXB4IDVweCA1cHg7XG59XG5cbmlucHV0W3R5cGU9dGV4dF06Zm9jdXMsIGlucHV0W3R5cGU9cGFzc3dvcmRdOmZvY3VzIHtcbiAgYmFja2dyb3VuZC1jb2xvcjogI2ZmZjtcbiAgYm9yZGVyLWJvdHRvbTogMnB4IHNvbGlkICM1ZmJhZTk7XG59XG5cbmlucHV0W3R5cGU9dGV4dF06cGxhY2Vob2xkZXIge1xuICBjb2xvcjogI2NjY2NjYztcbn1cblxuXG5cbi8qIEFOSU1BVElPTlMgKi9cblxuLyogU2ltcGxlIENTUzMgRmFkZS1pbi1kb3duIEFuaW1hdGlvbiAqL1xuLmZhZGVJbkRvd24ge1xuICAtd2Via2l0LWFuaW1hdGlvbi1uYW1lOiBmYWRlSW5Eb3duO1xuICBhbmltYXRpb24tbmFtZTogZmFkZUluRG93bjtcbiAgLXdlYmtpdC1hbmltYXRpb24tZHVyYXRpb246IDFzO1xuICBhbmltYXRpb24tZHVyYXRpb246IDFzO1xuICAtd2Via2l0LWFuaW1hdGlvbi1maWxsLW1vZGU6IGJvdGg7XG4gIGFuaW1hdGlvbi1maWxsLW1vZGU6IGJvdGg7XG59XG5cbkAtd2Via2l0LWtleWZyYW1lcyBmYWRlSW5Eb3duIHtcbiAgMCUge1xuICAgIG9wYWNpdHk6IDA7XG4gICAgLXdlYmtpdC10cmFuc2Zvcm06IHRyYW5zbGF0ZTNkKDAsIC0xMDAlLCAwKTtcbiAgICB0cmFuc2Zvcm06IHRyYW5zbGF0ZTNkKDAsIC0xMDAlLCAwKTtcbiAgfVxuICAxMDAlIHtcbiAgICBvcGFjaXR5OiAxO1xuICAgIC13ZWJraXQtdHJhbnNmb3JtOiBub25lO1xuICAgIHRyYW5zZm9ybTogbm9uZTtcbiAgfVxufVxuXG5Aa2V5ZnJhbWVzIGZhZGVJbkRvd24ge1xuICAwJSB7XG4gICAgb3BhY2l0eTogMDtcbiAgICAtd2Via2l0LXRyYW5zZm9ybTogdHJhbnNsYXRlM2QoLTEwMCUsIDAsIDApO1xuICAgIHRyYW5zZm9ybTogdHJhbnNsYXRlM2QoLTEwMCUsIDAsIDApO1xuICB9XG4gIDEwMCUge1xuICAgIG9wYWNpdHk6IDE7XG4gICAgLXdlYmtpdC10cmFuc2Zvcm06IG5vbmU7XG4gICAgdHJhbnNmb3JtOiBub25lO1xuICB9XG59XG5cbi8qIFNpbXBsZSBDU1MzIEZhZGUtaW4gQW5pbWF0aW9uICovXG5ALXdlYmtpdC1rZXlmcmFtZXMgZmFkZUluIHsgZnJvbSB7IG9wYWNpdHk6MDsgfSB0byB7IG9wYWNpdHk6MTsgfSB9XG5ALW1vei1rZXlmcmFtZXMgZmFkZUluIHsgZnJvbSB7IG9wYWNpdHk6MDsgfSB0byB7IG9wYWNpdHk6MTsgfSB9XG5Aa2V5ZnJhbWVzIGZhZGVJbiB7IGZyb20geyBvcGFjaXR5OjA7IH0gdG8geyBvcGFjaXR5OjE7IH0gfVxuXG4uZmFkZUluIHtcbiAgb3BhY2l0eTowO1xuICAtd2Via2l0LWFuaW1hdGlvbjpmYWRlSW4gZWFzZS1pbiAxO1xuICAtbW96LWFuaW1hdGlvbjpmYWRlSW4gZWFzZS1pbiAxO1xuICBhbmltYXRpb246ZmFkZUluIGVhc2UtaW4gMTtcblxuICAtd2Via2l0LWFuaW1hdGlvbi1maWxsLW1vZGU6Zm9yd2FyZHM7XG4gIC1tb3otYW5pbWF0aW9uLWZpbGwtbW9kZTpmb3J3YXJkcztcbiAgYW5pbWF0aW9uLWZpbGwtbW9kZTpmb3J3YXJkcztcblxuICAtd2Via2l0LWFuaW1hdGlvbi1kdXJhdGlvbjoxcztcbiAgLW1vei1hbmltYXRpb24tZHVyYXRpb246MXM7XG4gIGFuaW1hdGlvbi1kdXJhdGlvbjoxcztcbn1cblxuLmZhZGVJbi5maXJzdCB7XG4gIC13ZWJraXQtYW5pbWF0aW9uLWRlbGF5OiAwLjRzO1xuICAtbW96LWFuaW1hdGlvbi1kZWxheTogMC40cztcbiAgYW5pbWF0aW9uLWRlbGF5OiAwLjRzO1xufVxuXG4uZmFkZUluLnNlY29uZCB7XG4gIC13ZWJraXQtYW5pbWF0aW9uLWRlbGF5OiAwLjZzO1xuICAtbW96LWFuaW1hdGlvbi1kZWxheTogMC42cztcbiAgYW5pbWF0aW9uLWRlbGF5OiAwLjZzO1xufVxuXG4uZmFkZUluLnRoaXJkIHtcbiAgLXdlYmtpdC1hbmltYXRpb24tZGVsYXk6IDAuOHM7XG4gIC1tb3otYW5pbWF0aW9uLWRlbGF5OiAwLjhzO1xuICBhbmltYXRpb24tZGVsYXk6IDAuOHM7XG59XG5cbi5mYWRlSW4uZm91cnRoIHtcbiAgLXdlYmtpdC1hbmltYXRpb24tZGVsYXk6IDFzO1xuICAtbW96LWFuaW1hdGlvbi1kZWxheTogMXM7XG4gIGFuaW1hdGlvbi1kZWxheTogMXM7XG59XG5cbi8qIFNpbXBsZSBDU1MzIEZhZGUtaW4gQW5pbWF0aW9uICovXG4udW5kZXJsaW5lSG92ZXI6YWZ0ZXIge1xuICBkaXNwbGF5OiBibG9jaztcbiAgbGVmdDogMDtcbiAgYm90dG9tOiAtMTBweDtcbiAgd2lkdGg6IDA7XG4gIGhlaWdodDogMnB4O1xuICBiYWNrZ3JvdW5kLWNvbG9yOiAjNTZiYWVkO1xuICBjb250ZW50OiBcIlwiO1xuICB0cmFuc2l0aW9uOiB3aWR0aCAwLjJzO1xufVxuXG4udW5kZXJsaW5lSG92ZXI6aG92ZXIge1xuICAvKmNvbG9yOiAjMWFhM2ZmOyovXG59XG5cbi51bmRlcmxpbmVIb3Zlcjpob3ZlcjphZnRlcntcbiAgd2lkdGg6IDEwMCU7XG59XG5cblxuXG4vKiBPVEhFUlMgKi9cblxuKjpmb2N1cyB7XG4gICAgb3V0bGluZTogbm9uZTtcbn0gXG5cbiNpY29uIHtcbiAgd2lkdGg6NjAlO1xufVxuXG5odG1sLCBib2R5IHtcbiAgaGVpZ2h0OiAxMDAlO1xufVxuXG4vKmZvb3RlciBjc3MqL1xuXG4jd3JhcCB7XG4gIG1pbi1oZWlnaHQ6IDEwMCU7XG59XG5cbiNtYWluIHtcbiAgb3ZlcmZsb3c6YXV0bztcbiAgcGFkZGluZy1ib3R0b206MTUwcHg7IC8qIHRoaXMgbmVlZHMgdG8gYmUgYmlnZ2VyIHRoYW4gZm9vdGVyIGhlaWdodCovXG59XG5cbi5wYWdlLWZvb3RlciB7XG4gIGJhY2tncm91bmQtY29sb3I6ICMwMDI4NGQ7XG4gIGNvbG9yOndoaXRlO1xufSBcblxuLmZvb3Rlci1jb3B5cmlnaHR7XG5cdGNvbG9yOndoaXRlO1xufVxuXG4uZm9vdGVyLWxpbmt7XG5cdGNvbG9yOndoaXRlO1xuXHR0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTtcbn1cblxuLmZvb3Rlci1saW5rOmhvdmVye1xuXHRjb2xvcjojZTY4YTAwO1xuXHR0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTtcbn1cblxuLmZvb3Rlci1tYXJnaW4ge1xuICBwb3NpdGlvbjogZml4ZWQ7XG4gIGJvdHRvbTogMDtcbiAgd2lkdGg6IDEwMCU7XG4gIC8qIFNldCB0aGUgZml4ZWQgaGVpZ2h0IG9mIHRoZSBmb290ZXIgaGVyZSAqL1xuICBoZWlnaHQ6IDEwMHB4O1xuICAvKmxpbmUtaGVpZ2h0OiAxMDBweDsqLyAvKiBWZXJ0aWNhbGx5IGNlbnRlciB0aGUgdGV4dCB0aGVyZSAqL1xufVxuXG4uY2VudGVyIHtcbiAgICBtYXJnaW4tbGVmdDogYXV0bztcbiAgICBtYXJnaW4tcmlnaHQ6IGF1dG87XG4gICAgZGlzcGxheTogYmxvY2s7XG59XG4iXX0= */"

/***/ }),

/***/ "./src/app/quejapr/quejapr.component.ts":
/*!**********************************************!*\
  !*** ./src/app/quejapr/quejapr.component.ts ***!
  \**********************************************/
/*! exports provided: QuejaprComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "QuejaprComponent", function() { return QuejaprComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_quejasini_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/quejasini.service */ "./src/app/shared/quejasini.service.ts");
/* harmony import */ var ng2_file_upload__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ng2-file-upload */ "./node_modules/ng2-file-upload/fesm5/ng2-file-upload.js");
/* harmony import */ var _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../shared/consumidores.service */ "./src/app/shared/consumidores.service.ts");
/* harmony import */ var _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../shared/proveedores.service */ "./src/app/shared/proveedores.service.ts");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var _buscaprov_buscaprov_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ../buscaprov/buscaprov.component */ "./src/app/buscaprov/buscaprov.component.ts");
/* harmony import */ var util__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! util */ "./node_modules/util/util.js");
/* harmony import */ var util__WEBPACK_IMPORTED_MODULE_12___default = /*#__PURE__*/__webpack_require__.n(util__WEBPACK_IMPORTED_MODULE_12__);

//import { Component, OnInit } from '@angular/core';

//import { ormGroup,  FormControl } from '@angular/forms';








//import { MyCustomDialogService } from '../my-custom-dialog/my-custom-dialog.service';



var QuejaprComponent = /** @class */ (function () {
    //constructor() { }
    function QuejaprComponent(router, dialog, consumidoresService, proveedoresService, quejasService, _route) {
        this.router = router;
        this.dialog = dialog;
        this.consumidoresService = consumidoresService;
        this.proveedoresService = proveedoresService;
        this.quejasService = quejasService;
        this._route = _route;
        this.nproveedor = "";
        this.conciliacion = "";
        this.vanio = 0;
        this.vsecanio = 0;
        this.vsecuencia2 = "";
        this.vidqueja = 0;
        this.vidimagen = 2;
        this.presencial = "0";
        this.vdpi = -1;
        this.vfac = -1;
        this.vact = -1;
        this.existingModeConsumidor = false;
        this.existingModeProveedor = false;
        this.vsecuencia = "";
        this.vdato = "";
        this.vid = "";
        this.continuar = '1';
        this.cancelar = "Cancelar";
        this.uploader = new ng2_file_upload__WEBPACK_IMPORTED_MODULE_6__["FileUploader"]({
            url: _conc_virt_const__WEBPACK_IMPORTED_MODULE_9__["BASE_URL_REST_FILE2"],
            itemAlias: 'document'
        });
        this.success = false;
        this.successFile = true;
        this.showSpinner = false;
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this._vConsulta = "";
        this._varchivos = "0";
        this._vdatos = "0";
        this._ubicacion = "";
        this._detalle = "";
        this._solicitud = "";
        this._pdocumento = "";
        this._pnombre = "";
        this._papellido = "";
        this._ptelefono = "";
        this._pcorreo = "";
        this._pnit = "";
        //console.info(this._route.snapshot.paramMap.get('id'));
    }
    QuejaprComponent.prototype.ngOnDestroy = function () {
        ////console.log("finaliza");
    };
    QuejaprComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._route.params.subscribe(function (params) {
            _this.vdato = params.dato;
            //this.vid = params.id;
        });
        //verificar parametros
        //console.info("--->>",this.vdato,this.vid,this.vqueja);
        if (this.vdato != "" && this.vdato != undefined) {
            this.findByQuejaById();
        }
        else {
            alert("No puede ingresar al sistema, favor verifique.");
            this.continuar = '0';
            return;
        }
        // listener cuando finaliza la operacion de creacion
        this.quejaOperationSubscription = this.quejasService.operation.subscribe(function (queja) {
            // limpia sesion
            _this.quejaForm.reset();
            _this.success = true;
            _this.successFile = true;
            _this.nproveedor = "";
            _this.conciliacion = "";
        });
        /*
        this.customDialogForm = fb.group({
            dialogTitle: ['Title'],
            dialogMsg: [''],
            dialogType: ['alert'],
            okBtnColor: [''],
            okBtnLabel: [''],
            cancelBtnColor: [''],
            cancelBtnLabel: ['']
          });
          */
        //this._route.params.subscribe(
        //  (params: Params) => {
        //    this.vid = params.id;
        //  }
        //);
        this.initQuejaForm(null);
        //this.initConsumidorForm(null);
        //this.vid = this._route.snapshot.paramMap.get('id')
        //console.info(this.vid);
    };
    QuejaprComponent.prototype.initQuejaForm = function (_queja) {
        this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'nombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'apellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'dpiPasaporte': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.docc : ''),
            'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'correo': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.detalleQueja : ''),
            'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.solicitaQue : ''),
            'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.docp : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'ubicacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.ubicacion : ''),
            'respuesta': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](_queja ? _queja.respuesta : ''),
        });
        this.nproveedor = "";
        this.conciliacion = "";
        this.dpiIndex = -1;
        this.facturaIndex = -1;
        this.quejaForm.get('nitProveedor').disable();
        this.quejaForm.get('dpiPasaporte').disable();
        /*
        this.quejaForm.get('nombre').disable();
        this.quejaForm.get('apellido').disable();
        this.quejaForm.get('dpiPasaporte').disable();
        this.quejaForm.get('telefono').disable();
        this.quejaForm.get('correo').disable();
        this.quejaForm.get('detalleQueja').disable();
        this.quejaForm.get('solicitaQue').disable();
        this.quejaForm.get('ubicacion').disable();
        */
        if (_queja) {
            this._vConsulta = _queja.pregunta;
            this._varchivos = _queja.carchivos;
            this._vdatos = _queja.cdatos;
            this._ubicacion = _queja.ubicacion;
            this._detalle = _queja.detalleQueja;
            this._solicitud = _queja.solicitaQue;
            this._pdocumento = _queja.docc;
            //this._pnombre = _queja
            //this._papellido = _queja.
            //this._ptelefono = _queja.
            //this._pcorreo = _queja.
            this._pnit = _queja.docp;
            this.nproveedor = _queja.nomp;
            if (_queja.docc != null && _queja.docc != undefined) {
                this.onDocumentoIdentificacionChanged();
            }
            console.info("datos", this._vdatos, _queja.cdatos, "archivos", this._varchivos, _queja.carchivos);
        }
        ////console.log("inicializa");
    };
    QuejaprComponent.prototype.onFileChanged = function (type) {
        console.info(type);
        this.vact = this.uploader.queue.length - 1;
        console.info(this.factura);
        if (this.uploader.queue.length > 0) {
            if (type == 'FAC') {
                if (this.factura && this.facturaIndex > -1) {
                    var facturaItem = this.uploader.queue[this.facturaIndex];
                    this.uploader.removeFromQueue(facturaItem);
                }
                this.factura = this.uploader.queue[this.uploader.queue.length - 1];
                this.facturaIndex = this.uploader.queue.length - 1;
                if (this.dpiIndex == this.facturaIndex) {
                    this.dpiIndex = this.dpiIndex - 1;
                }
            }
            else if (type == 'DPI') {
                if (this.dpi && this.dpiIndex > -1) {
                    var dpiItem = this.uploader.queue[this.dpiIndex];
                    this.uploader.removeFromQueue(dpiItem);
                }
                this.dpi = this.uploader.queue[this.uploader.queue.length - 1];
                this.dpiIndex = this.uploader.queue.length - 1;
                if (this.dpiIndex == this.facturaIndex) {
                    this.facturaIndex = this.facturaIndex - 1;
                }
            }
            if (this.uploader.queue.length == 0) {
                this.dpiIndex = -1;
                this.facturaIndex = -1;
            }
            //console.info(this.factura);
            //console.info(this.dpi);
            //console.info(this.uploader.queue.length);
            //console.info(this.facturaIndex);
            //console.info(this.dpiIndex);
            if (this.uploader.queue.length == 2) {
                this.successFile = false;
            }
            else {
                this.successFile = true;
            }
            //console.info(this.uploader.queue.length);	
            //console.info(this.uploader);
        }
    };
    /*
      onRemoveClicked(index: number) {
        let removeItem = this.uploader.queue[index];
        this.uploader.removeFromQueue(removeItem);
        if (index == this.facturaIndex) {
          this.facturaIndex = null;
          this.factura = null;
        } else if (index == this.dpiIndex) {
          this.dpiIndex = null;
          this.dpi = null;
        }
      }*/
    QuejaprComponent.prototype.onSubmit = function () {
        var _this = this;
        var resp = this.quejaForm.value.respuesta;
        var xqueja = this.quejaForm.value.detalleQueja;
        var xsolicitud = this.quejaForm.value.solicitaQue;
        var xubicacion = this.quejaForm.value.ubicacion;
        var mjsError = "";
        if (resp == "" || resp == undefined) {
            mjsError += "- Ingrese su respuesta.  " + "\r\n";
        }
        if (this._vdatos == "1") {
            if (xqueja == null || xqueja == undefined) {
                mjsError += "- Ingrese detalle de la queja.  " + "\r\n";
            }
            if (xsolicitud == null || xsolicitud == undefined) {
                mjsError += "- Ingrese peticion de la queja.  " + "\r\n";
            }
            if (xubicacion == null || xubicacion == undefined) {
                mjsError += "- Ingrese ubicacion.  " + "\r\n";
            }
        }
        if (this._varchivos == "1") {
            if (this.uploader.queue.length != 2) {
                alert("Debe de ingresar Datos adjuntos requeridos.");
                this.showSpinner = false;
                return;
            }
        }
        if (mjsError == '') {
        }
        else {
            alert(mjsError);
            mjsError = "";
            return false;
        }
        //coloca los archivos en orden.
        if (this._varchivos == "1") {
            if (this.uploader.queue.length >= 2) {
                var removeItem = this.uploader.queue[1];
                this.uploader.removeFromQueue(removeItem);
                removeItem = this.uploader.queue[0];
                this.uploader.removeFromQueue(removeItem);
                this.uploader.queue.push(this.factura);
                this.uploader.queue.push(this.dpi);
                console.info(this.uploader.queue.length);
            }
        }
        //queja = this.quejasService.createQueja(queja, this.uploader).susbribe;
        this.quejasService.add_FormQuejaUpdate(this.existingQueja.idQueja, resp, xqueja, xsolicitud, xubicacion, this._varchivos, this._vdatos, this.vdato).subscribe(function (retvalue) {
            if (retvalue) {
                var tempstr = retvalue['value'];
                if (tempstr != null && tempstr != '') {
                    //this.registrodata=JSON.parse('['+retvalue["value"].slice(0, -1) +']');
                    console.info("resultado ", tempstr);
                    _this.vanio = tempstr.anio;
                    _this.vsecanio = tempstr.noQueja;
                    _this.vidqueja = tempstr.idQueja;
                    if (_this._varchivos == "1") {
                        if (_this.uploader.queue.length > 0) {
                            //console.log(this.vidqueja);
                            _this.uploader.onBeforeUploadItem = function (removeItem) {
                                //removeItem.withCredentials = false;
                                //removeItem.url = BASE_URL_REST_FILE + 'quejas/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen;
                                //BASE_URL_REST_FILE + 'quejasini/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen,
                                for (var i = 0; i < _this.uploader.queue.length; i++) {
                                    console.log("modifica url - inicio");
                                    console.log(i);
                                    var removeItem_1 = _this.uploader.queue[i];
                                    if (removeItem_1 == _this.dpi) {
                                        console.log("cambia url dpi");
                                        _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_9__["BASE_URL_REST_FILE2"] + 'quejasini/upload?id_queja=' + _this.vidqueja + "&id_categoria_imagen=" + 2 + "&correo=0&data=0";
                                        console.log(_this.uploader.queue[i].url);
                                        console.log(removeItem_1);
                                    }
                                    else {
                                        if (removeItem_1 == _this.factura) {
                                            console.log("cambia url factura");
                                            _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_9__["BASE_URL_REST_FILE2"] + 'quejasini/upload?id_queja=' + _this.vidqueja + "&id_categoria_imagen=" + 3 + "&correo=0&data=0";
                                            console.log(_this.uploader.queue[i].url);
                                            console.log(removeItem_1);
                                        }
                                        else {
                                            console.log("cambia url otro");
                                            _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_9__["BASE_URL_REST_FILE2"] + 'quejasini/upload?id_queja=' + _this.vidqueja + "&id_categoria_imagen=" + 1 + "&correo=0&data=0";
                                            console.log(_this.uploader.queue[i].url);
                                            console.log(removeItem_1);
                                        }
                                    }
                                    console.log("modifica url - fin");
                                }
                            };
                            _this.uploader.setOptions({
                                url: _conc_virt_const__WEBPACK_IMPORTED_MODULE_9__["BASE_URL_REST_FILE2"] + 'quejasini/upload?id_queja=' + _this.vidqueja + "&id_categoria_imagen=" + _this.vidimagen,
                                itemAlias: 'file'
                            });
                            _this.uploader.onCompleteAll = function () {
                                // finalizo la carga de todos los archivos
                                _this.operation.next(retvalue.value);
                            };
                            _this.uploader.onCompleteItem = function (item, uploadResponse, status, headers) {
                                // finalizo la carga de un archivo
                                _this.vidimagen = _this.vidimagen + 1;
                            };
                            _this.uploader.uploadAll();
                        }
                        else {
                            _this.operation.next(retvalue.value);
                        }
                    }
                    _this.success = true;
                }
                else {
                    ////console.log('no llego');
                }
            }
            else {
                ////console.log('Rest service response ERROR.');
            }
        });
        this.onDismissClicked();
        this.showSpinner = false;
        this.cancelar = "Nuevo";
        //this.findSecuenciaId();
        //////console.info("onsSumiT");
        //this.vanio = queja.anio;
        //  this.vsecanio = queja.noQueja;
        ////console.info('-------------------');
        ////console.info(queja);
        ////console.info('-------------------');
    };
    QuejaprComponent.prototype.onDismissClicked = function () {
        this.success = false;
        this.successFile = false;
        //this.initQuejaForm(null);
        this._ubicacion = "";
        this._detalle = "";
        this._solicitud = "";
        this._pdocumento = "";
        this._pnombre = "";
        this._papellido = "";
        this._ptelefono = "";
        this._pcorreo = "";
        this._pnit = "";
        this._vConsulta = "";
        this.nproveedor = "";
        this.quejaForm.reset();
        ////console.info("onDismm");
    };
    QuejaprComponent.prototype.initConsumidor = function (consumidor, tipo) {
        if (tipo == 0) {
            /*
          this.quejaForm = new FormGroup({
            'nombre': new FormControl(consumidor ? consumidor.nombre1+
            (consumidor ? ' '+(consumidor.nombre2==null?'':consumidor.nombre2)+
            (consumidor!=null ? ' '+(consumidor.nombre3==null?'':consumidor.nombre3 ): '') : '') : '', Validators.required),
            'apellido': new FormControl(consumidor ? consumidor.apellido1+(consumidor ? ' '+(consumidor.apellido2==null?'':consumidor.apellido2) : '' ) : '', Validators.required),
            //'apellidoCasada': new FormControl(consumidor ? consumidor.apellidoCasada : ''),
            'telefono': new FormControl(consumidor ? consumidor.telefono : '', Validators.required),
            //'telefonoDomicilio': new FormControl(consumidor ? consumidor.domicilio : ''),
            'correo': new FormControl(consumidor ? consumidor.correoElectronico1 : '', Validators.email),
            //'dpiPasaporte': new FormControl(consumidor ? consumidor.documentoIdentificacion : '', Validators.required),
            //'detalleQueja': new FormControl( this.quejaForm.value.detalleQueja, Validators.required),
            //'solicitaQue': new FormControl( this.quejaForm.value.solicitaQue, Validators.required),
            //'nitProveedor': new FormControl(this.quejaForm.value.nitProveedor, Validators.required),
            //'ubicacion': new FormControl(this.quejaForm.value.ubicacion, Validators.required)

          });*/
            this._pnombre = (consumidor ? consumidor.nombre1 +
                (consumidor ? ' ' + (consumidor.nombre2 == null ? '' : consumidor.nombre2) +
                    (consumidor != null ? ' ' + (consumidor.nombre3 == null ? '' : consumidor.nombre3) : '') : '') : '');
            this._papellido = (consumidor ? consumidor.apellido1 + (consumidor ? ' ' + (consumidor.apellido2 == null ? '' : consumidor.apellido2) : '') : '');
            this._ptelefono = consumidor.telefono;
            this._pcorreo = consumidor.correoElectronico1;
        }
        else {
            this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
                'nombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre1 +
                    (consumidor ? ' ' + (consumidor.nombre2 == null ? '' : consumidor.nombre2) +
                        (consumidor != null ? ' ' + (consumidor.nombre3 == null ? '' : consumidor.nombre3) : '') : '') : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'apellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellido1 + (consumidor ? ' ' + (consumidor.apellido2 == null ? '' : consumidor.apellido2) : '') : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'apellidoCasada': new FormControl(consumidor ? consumidor.apellidoCasada : ''),
                'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefono : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'telefonoDomicilio': new FormControl(consumidor ? consumidor.domicilio : ''),
                'correo': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.correoElectronico1 : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].email),
                'dpiPasaporte': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.dpiPasaporte, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.detalleQueja, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.solicitaQue, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.nitProveedor, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'ubicacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.ubicacion, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required)
            });
        }
        this.findBySecuencia();
        //////console.log("inicializa consumidor");
    };
    QuejaprComponent.prototype.initProveedor = function (nit) {
        this.quejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'nombre': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.nombre, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'apellido': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.apellido, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.telefono, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'correo': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.correo, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].email),
            'dpiPasaporte': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.dpiPasaporte, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'detalleQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.detalleQueja, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'solicitaQue': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.solicitaQue, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'nitProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](nit, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            /*
            'primerNombre': new FormControl(proveedor ? proveedor.primerNombre : ''),
            'segundoNombre': new FormControl(proveedor ? proveedor.segundoNombre : ''),
            'tercerNombre': new FormControl(proveedor ? proveedor.tercerNombre : ''),
            'primerApellido': new FormControl(proveedor ? proveedor.primerApellido : ''),
            'segundoApellido': new FormControl(proveedor ? proveedor.segundoApellido : ''),
            'apellidoCasada': new FormControl(proveedor ? proveedor.apellidoCasada : ''),
            'nombreEmpresa': new FormControl(proveedor ? proveedor.nombreEmpresa : ''),
            'razonSocial': new FormControl(proveedor ? proveedor.razonSocial : ''),
            */
            'ubicacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this.quejaForm.value.ubicacion, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required)
        });
        //////console.log("inicializa consumidor");
    };
    QuejaprComponent.prototype.onDocumentoIdentificacionChanged = function () {
        var _this = this;
        //////console.log(this.quejaForm.value.dpiPasaporte);
        var docto = this.quejaForm.value.dpiPasaporte != "" && this.quejaForm.value.dpiPasaporte != undefined ? this.quejaForm.value.dpiPasaporte : this._pdocumento;
        console.info("consumidor ", this.quejaForm.value.dpiPasaporte, this._pdocumento, docto);
        this.consumidoresService.fetchDataI(docto).subscribe(function (response) {
            if (response.value) {
                // inicializar formulario con valores predeterminados
                _this.existingModeConsumidor = true;
                //this.existingConsumidor = response.value;
                _this.initConsumidor(response.value, 0);
                //queja.dpiPasaporte = this.quejaForm.value.dpiPasaporte;
            }
            else {
                _this.existingModeConsumidor = false;
                _this.existingConsumidor = null;
                _this.initConsumidor(null, 1);
            }
        });
        //////console.log("ingreso al onDocumentoIdentificacionChanged");
    };
    QuejaprComponent.prototype.onProveedorChanged = function () {
        var _this = this;
        var dialogConfig = new _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatDialogConfig"]();
        dialogConfig.disableClose = false;
        dialogConfig.autoFocus = true;
        var dialogRef = this.dialog.open(_buscaprov_buscaprov_component__WEBPACK_IMPORTED_MODULE_11__["BuscaprovComponent"], dialogConfig);
        dialogRef.afterClosed().subscribe(function (data) {
            if (!Object(util__WEBPACK_IMPORTED_MODULE_12__["isUndefined"])(data)) {
                console.info(data);
                // inicializar formulario con valores predeterminados
                _this.existingModeProveedor = true;
                _this.existingProveedor = data;
                _this.initProveedor(data.nitProveedor);
                _this.nproveedor = data.nombre;
                _this.conciliacion = data.habilitadoConciliacionPrevia;
            }
            else {
                _this.existingModeProveedor = false;
                _this.existingProveedor = null;
                _this.nproveedor = "";
                _this.conciliacion = "";
            }
        }, function (error) { return console.info('Undefined data. No will insert 2'); }); //this.logService.print(error, LogService.ERROR_MSG));
        /*
        //////console.log(this.quejaForm.value.nitProveedor);
      this.proveedoresService.fetchData(this.quejaForm.value.nitProveedor).subscribe(
        (response) => {
          if (response.value) {
            // inicializar formulario con valores predeterminados
            this.existingModeProveedor = true;
            this.existingProveedor = response.value;
            this.initProveedor(response.value);
            this.nproveedor = response.value.nombre;
          } else {
            this.existingModeProveedor = false;
            this.existingProveedor = null;
            this.nproveedor = "";
          }
        }
      );
      //////console.log("ingreso al onProveedorChanged");
      */
    };
    QuejaprComponent.prototype.initNoQueja = function (queja) {
        this.vanio = (queja ? queja.anio : 0);
        this.vsecanio = (queja ? queja.noQueja : 0);
        ////console.info('initNoQueja|');
        ////console.info(this.vanio);
        ////console.info(this.vsecanio);
    };
    QuejaprComponent.prototype.findSecuenciaId = function () {
        var _this = this;
        if (this.vsecuencia = "") {
        }
        else {
            this.quejasService.fetchDataSecId(this.vsecuencia).subscribe(function (response) {
                if (response.value) {
                    // inicializar formulario con valores predeterminados
                    ////console.info("findSecuenc");
                    _this.initNoQueja(response.value);
                }
            });
        }
    };
    QuejaprComponent.prototype.findBySecuencia = function () {
        var _this = this;
        this.quejasService.fetchDataSecuencia().subscribe(function (response) {
            if (response.value) {
                // inicializar formulario con valores predeterminados
                //
                _this.vsecuencia2 = response.value;
                _this.vsecuencia = response.value;
            }
        });
    };
    QuejaprComponent.prototype.openCustomDialog = function () {
        console.log("this.customDialogForm.value");
        //this.customDialog.openAlertDialog(this.customDialogForm.value);
        this.success = false;
    };
    /***
    * obtiene los datoa de la queja
    ***/
    QuejaprComponent.prototype.findByQuejaById = function () {
        var _this = this;
        //console.info("findByQuejaById ini ",this.vdato, this.vid, this.vqueja);
        this.quejasService.fetchQuejaByLinkMagic('pr', this.vdato, "0000000").subscribe(function (response) {
            var tempstr = response.value;
            //console.info("findByQuejaById consumidor ",tempstr);
            if (tempstr != null || tempstr != undefined) {
                console.info("existe", tempstr);
                _this.existingQueja = tempstr;
                _this.initQuejaForm(tempstr);
                /*
                this._usuario = new Usuario();
                this._usuario.username = tempstr.login;
                this._usuario.userid = tempstr.idUsuario;
                this._usuario.code = tempstr.nombre;
                */
                /*
                this.quejasService.initQuejat(tempstr);
                   if (this.quejasService.initQuejat != null) {
                        this.continuar = "1";
                        //this.initConsumidorForm(null);
                        //this.findByTokenConsumidor();
                   } else
                        this.continuar = "0";
                    */
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                _this.continuar = "0";
                alert("Su acceso al sistema fue denegado, por favor verifique.");
            }
        });
    };
    /*
    continuarPresencial() {
        //se agrega ruta para llamar a la consulta de 30-40 campos
        this.router.navigate(['/consumidor/'+this.vdato+'/'+this.vid+'/'+this.vidqueja]);
    }
    */
    //graba datos para imprimir la queja
    QuejaprComponent.prototype.onPrintQueja = function () {
        var _this = this;
        this.quejasService.add_FormQueja(this.vidqueja, this._usuario.userid, this.vid).subscribe(function (response) {
            var tempstr = response;
            //console.info("findByQuejaById consumidor ",tempstr);
            if (tempstr != null || tempstr != undefined) {
                //console.info("existe",tempstr);
                if (tempstr.reason = "OK") {
                    //console.log('entro a getFormularioQuejaRegistro');
                    var tempresponse = tempstr['value'];
                    var registrodata = JSON.parse('[' + response["value"].slice(0, -1) + ']');
                    console.log('entro a getFormularioQuejaRegistro', registrodata[0]['id'], tempresponse, tempstr.value["id"], tempresponse["id"], tempresponse['id'], tempresponse.id, tempstr['value']['id']);
                    //this.quejasService.getFormularioQuejaRegistro(registrodata[0]['id'],this.vid).subscribe((Data)=>{
                    _this.quejasService.getFormularioQuejaRegistro(_this.vidqueja, _this.vid).subscribe(function (Data) {
                        console.log('entro a openRegisto');
                        //this._registrosservice.FileDownLoadChoose(Data,1);
                        var blob = new Blob([Data], { type: 'application/pdf' });
                        var url = window.URL.createObjectURL(blob);
                        var pwa = window.open(url);
                        if (!pwa || pwa.closed || typeof pwa.closed == 'undefined') {
                            alert('Por favor deshabilite su bloqueador de Pop-ups e intente de nuevo.');
                        }
                        //this.flagInfoError=false;
                    }, function (error) {
                        console.log(error);
                        //this.flagInfoError=true;
                        //this.SetSecTimerInfoError();
                    });
                }
            }
            else {
                //this.existingData = false;
                //console.info("no existe",response.value);
                alert("Error no se logró imprimir su solicitud por favor ingrese al sistema para reimpresión, gracias.");
            }
        });
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ViewChild"])('filDpi'),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", _angular_core__WEBPACK_IMPORTED_MODULE_1__["ElementRef"])
    ], QuejaprComponent.prototype, "filDpi", void 0);
    QuejaprComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-quejapr',
            template: __webpack_require__(/*! ./quejapr.component.html */ "./src/app/quejapr/quejapr.component.html"),
            styles: [__webpack_require__(/*! ./quejapr.component.scss */ "./src/app/quejapr/quejapr.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"],
            _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatDialog"],
            _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_7__["ConsumidoresService"],
            _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_8__["ProveedoresService"],
            _shared_quejasini_service__WEBPACK_IMPORTED_MODULE_5__["QuejasIniService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_4__["ActivatedRoute"]])
    ], QuejaprComponent);
    return QuejaprComponent;
}());



/***/ }),

/***/ "./src/app/registronotprev/registronotprev.component.html":
/*!****************************************************************!*\
  !*** ./src/app/registronotprev/registronotprev.component.html ***!
  \****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n<head>\n</head>\n<body>\n\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <span class=\"navbar-text whitefont\">DIACO - Inscripción a notificación electrónica</span>\n  <!--span class=\"navbar-text whitefont\">&nbsp;&nbsp;&nbsp;Proveedor: {{nombre_proveedor}}</span-->\n  <!---- <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>--->\n  <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n  <ul class=\"navbar-nav mr-auto\">\n   <!----     <li class=\"nav-item active\">\n        <a class=\"nav-link whitelink\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Features</a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Pricing</a>\n      </li>--->\n    </ul>  \n  </div>\n  <!--span class=\"navbar-text whitefont\">\n   Usuario: {{str_usuario}}  \n  </span-->\n  <!--span class=\"navbar-text whitefont\">\n    <a class=\"nav-link whitelink\" [routerLink]=\"['/Login']\">Cerrar Sesion</a>\n  </span-->\n    <span class=\"navbar-text whitefont\">\n    <!--a class=\"nav-link whitelink\" [routerLink]=\"['/Login']\">Cerrar Sesi&oacute;n</a-->\n\t<button class=\"btn btn-primary row\" (click)=\"onChangeconprov()\">Cancelar</button>\n  </span>\n</nav>\n\n\n<div class=\"container\">\n\t<div class=\"row\">\n\t <div class=\"col-lg-12\">\n\t\t&nbsp;\n\t </div>\n\t</div>\n  <div class=\"row\">\n    <div class=\"col-sm-12\">\n      <form (ngSubmit)=\"onSubmit()\" [formGroup]=\"registronotprev\" >\n\t\t<div class=\"form-group row\">\n          <label for=\"tipoConsumidorProv\" class=\"col-sm-2 col-form-label\">(*) Tipo</label>\n          <div class=\"col-sm-10\">\n            <select\n              id=\"tipoConsumidorProv\"\n              class=\"form-control\"\n              formControlName=\"tipoConsumidorProv\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Seleccion consumidor/proveedor\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"consumidor/proveedor\"\n\t\t\t\t\t  (change) = \"onChangeconprov()\"\n\t\t\t\t\t  >\n              <option value=\"1\">Consumidor</option>\n              <option value=\"2\">Proveedor</option>\n            </select>\n          </div>\n        </div>\n\t  \n\t  \n        <div class=\"form-group row\">\n          <label for=\"tipoConsumidor\" class=\"col-sm-2 col-form-label\">(*) Personeria</label>\n          <div class=\"col-sm-10\">\n            <select\n              id=\"tipoConsumidor\"\n              class=\"form-control\"\n              formControlName=\"tipoConsumidor\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese tipo de consumidor\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Tipo consumidor\"\n\t\t\t\t\t  >\n              <option value=\"6\">Individual</option>\n              <option value=\"7\">Juridico</option>\n            </select>\n          </div>\n        </div>\n        <div class=\"form-group row\" *ngIf=\"registronotprev.value.tipoConsumidorProv=='1'\" >\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"nacionalidad\" class=\"col-sm-6 col-form-label\">(*) Nacionalidad</label>\n              <div class=\"col-sm-6\">\n                <select\n                  id=\"nacionalidad\"\n                  class=\"form-control\"\n                  formControlName=\"nacionalidad\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nacionalidad\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nacionalidad\"\n\t\t\t\t\t  >\n                  <option value=\"G\">Guatemalteco</option>\n                  <option value=\"E\">Extranjero</option>\n                </select>\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\">\n            <div class=\"row\">\n              <label for=\"documentoIdentificacion\" class=\"col-sm-6 col-form-label\" *ngIf=\"registronotprev.value.nacionalidad == 'G' && registronotprev.value.tipoConsumidor == '6'\">(*) DPI</label>\n\t\t\t  <label for=\"documentoIdentificacion\" class=\"col-sm-6 col-form-label\" *ngIf=\"registronotprev.value.nacionalidad == 'G' && registronotprev.value.tipoConsumidor == '7'\">(*) Representante Legal</label>\n              <label for=\"documentoIdentificacion\" class=\"col-sm-6 col-form-label\" *ngIf=\"registronotprev.value.nacionalidad == 'E'\">(*) Pasaporte</label>\n\n              <div class=\"col-sm-6\" *ngIf=\"registronotprev.value.tipoConsumidor == '6' || registronotprev.value.nacionalidad == 'E'\">\n                <input\n                  id=\"documentoIdentificacion\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"documentoIdentificacion\"\n                  (change)=\"onDocumentoIdentificacionChanged('documento')\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese documento de identificacion\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Documento\"\n\t\t\t\t\t  >\n              </div>\n\t\t\t  \n\t\t\t   <div class=\"col-sm-6\" *ngIf=\"registronotprev.value.nacionalidad == 'G' && registronotprev.value.tipoConsumidor == '7'\">\n                <input\n                  id=\"representanteLegal\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"representanteLegal\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nombre de representante legal\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nombre representante legal\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-4\" *ngIf=\"registronotprev.value.nacionalidad == 'E'\">\n            <div class=\"row\">\n              <label for=\"pais\" class=\"col-sm-6 col-form-label\">(*) Extendido en</label>\n              <div class=\"col-sm-6\">\n                <select\n                  id=\"pais\"\n                  class=\"form-control\"\n                  formControlName=\"pais\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese pais donde se extendio  su documento\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Pais \"\n\t\t\t\t\t  >\n                  <option disabled selected>Escoger</option>\n                  <option value=\"{{pais.idPais}}\" *ngFor=\"let pais of paises\">{{pais.nombrePais}}</option>\n                </select>\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <label for=\"nitConsumidor\" class=\"col-sm-2 col-form-label\">(*) NIT</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"nitConsumidor\"\n              type=\"text\"\n              class=\"form-control\"\n\t\t\t  (change)=\"onDocumentoIdentificacionChanged('nit')\"\n              formControlName=\"nitConsumidor\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese NIT\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"NIT\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n\t\t\n\t\t\n\t\t<div class=\"form-group row\" *ngIf=\"_existe == '0'\">\n          <div class=\"col-sm-12 text-center\">\n            <button\n              class=\"btn btn-primary\"\n              type=\"button\"\n\t\t\t  (click)=\"btnIdentificacionChanged()\" \n              >Buscar</button>\n          </div>\n        </div>\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t\n\t\t<div *ngIf=\"_existe == '1'\">\n\t\t<div  *ngIf=\"registronotprev.value.tipoConsumidor== '6'\">\n\t\t\t<div class=\"form-group row\">\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"nombre1\" class=\"col-sm-6 col-form-label\">(*) Primer Nombre</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombre1\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"nombre1\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese primer nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Primer nombre\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"nombre2\" class=\"col-sm-6 col-form-label\">Segundo Nombre</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombre2\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"nombre2\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese segundo nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Segundo nombre\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"nombre3\" class=\"col-sm-6 col-form-label\">Tercer Nombre</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"nombre3\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"nombre3\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese tercer nombre\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Tercer nombre\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t</div>\n\t\t\t<div class=\"form-group row\">\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"apellido1\" class=\"col-sm-6 col-form-label\">(*) Primer Apellido</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"apellido1\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"apellido1\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese primer apellido\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Primer apellido\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"apellido2\" class=\"col-sm-6 col-form-label\">Segundo Apellido</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"apellido2\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"apellido2\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese segundo apellido\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Segundo apellido\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t<div class=\"row\">\n\t\t\t\t  <label for=\"apellidoCasada\" class=\"col-sm-6 col-form-label\">Apellido Casada</label>\n\t\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"apellidoCasada\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  formControlName=\"apellidoCasada\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese apellido de casada\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Apellido de casada\"\n\t\t\t\t\t  >\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t  </div>\n\t\t\t</div>\n\t\t</div>\t\n\t\t\n\t\t<div class=\"form-group row\" *ngIf=\"registronotprev.value.tipoConsumidor == '7'\">\n          <label for=\"nombreEmpresa\" class=\"col-sm-2 col-form-label\">(*) Nombre de la empresa</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"nombreEmpresa\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"nombreEmpresa\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese nombre de la empresa\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Nombre empresa\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n        <div class=\"form-group row\" *ngIf=\"registronotprev.value.tipoConsumidor == '7'\">\n          <label for=\"razonSocial\" class=\"col-sm-2 col-form-label\">(*) Razón social</label>\n          <div class=\"col-sm-10\">\n            <input\n              id=\"razonSocial\"\n              type=\"text\"\n              class=\"form-control\"\n              formControlName=\"razonSocial\"\n\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese razon social\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Razon social\"\n\t\t\t\t\t  >\n          </div>\n        </div>\n\t\t\n\t\t<!------------------------------------------------------------------------------>\n\t\t<div *ngIf=\"registronotprev.value.tipoConsumidorProv=='1'\"> \n\t\t\t<div class=\"form-group row\" *ngIf=\"registronotprev.value.tipoConsumidor == '6'\">\n\t\t\t  <div class=\"col-sm-4\">\n\t\t\t\t\t<div class=\"row\">\n\t\t\t  <label for=\"genero\" class=\"col-sm-6 col-form-label\">(*) Género</label>\n\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t<select\n\t\t\t\t  id=\"genero\"\n\t\t\t\t  class=\"form-control\"\n\t\t\t\t  formControlName=\"genero\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t  matTooltip=\"Ingrese genero\"\n\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  placeholder=\"Genero\"\n\t\t\t\t\t\t  >\n\t\t\t\t  <option disabled selected>Escoger</option>\n\t\t\t\t  <option value=\"M\">Masculino</option>\n\t\t\t\t  <option value=\"F\">Femenino</option>\n\t\t\t\t</select>\n\t\t\t  </div>\n\t\t\t  </div>\n\t\t\t</div>\n\t\t\t\n\t\t\t<div class=\"col-sm-4\">\n\t\t\t\t\t<div class=\"row\">\n\t\t\t  <label for=\"etnia\" class=\"col-sm-6 col-form-label\">(*) Etnia</label>\n\t\t\t  <div class=\"col-sm-6\">\n\t\t\t\t<select\n\t\t\t\t  id=\"etnia\"\n\t\t\t\t  class=\"form-control\"\n\t\t\t\t  formControlName=\"etnia\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t  matTooltip=\"Ingrese Etnia\"\n\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  placeholder=\"Etnia\"\n\t\t\t\t\t\t  >\n\t\t\t\t  <option disabled selected>Escoger</option>\n\t\t\t\t  <option value=\"{{etnia.codigoEtnia}}\" *ngFor=\"let etnia of etnias\">{{etnia.descripcion}}</option>\n\t\t\t\t</select>\n\t\t\t  </div>\n\t\t\t  </div>\n\t\t\t</div>\n\t\t\t\n\t\t\t</div>\n\t\t</div>\n\t\t<!------------------------------------------------------------------------------>\n\t\t\n\n\n        <div class=\"form-group row\">\n          <label for=\"\" class=\"col-sm-2 col-form-label\">Telefono</label>\n          <div class=\"col-sm-10\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <div class=\"form-group row\">\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"telefonoCelular\" class=\"col-sm-4 col-form-label\">(*) Personal (celular)</label>\n                      <div class=\"col-sm-8\">\n                        <input\n                          id=\"telefonoCelular\"\n                          type=\"text\"\n                          class=\"form-control\"\n                          formControlName=\"telefonoCelular\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese Telefono celular\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Telefono celular\"\n\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n                  <div class=\"col-sm-6\" *ngIf=\"registronotprev.value.tipoConsumidorProv=='2'\">\n                    <div class=\"row\">\n                      <label for=\"telefonoDomicilio\" class=\"col-sm-4 col-form-label\">Domicilio</label>\n                      <div class=\"col-sm-8\">\n                        <input\n                          id=\"telefonoDomicilio\"\n                          type=\"text\"\n                          class=\"form-control\"\n                          formControlName=\"telefonoDomicilio\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese telefono domiciliio\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Telefono domicilio\"\n\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n                </div>\n                <div class=\"form-group row\" *ngIf=\"registronotprev.value.tipoConsumidorProv=='2'\">\n                  <div class=\"col-sm-6\">\n                    <div class=\"row\">\n                      <label for=\"telefonoReferencia\" class=\"col-sm-4 col-form-label\">Referencia</label>\n                      <div class=\"col-sm-8\">\n                        <input\n                          id=\"telefonoReferencia\"\n                          type=\"text\"\n                          class=\"form-control\"\n                          formControlName=\"telefonoReferencia\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese telefono referencia\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Telefono referencia\"\n\t\t\t\t\t  >\n                      </div>\n                    </div>\n                  </div>\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"email\" class=\"col-sm-4 col-form-label\">(*) Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"email\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"email\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese correo electronico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Correo electronico\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"emailConfirmation\" class=\"col-sm-4 col-form-label\">(*) Confirmar Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"emailConfirmation\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"emailConfirmation\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese confirmacion de correo\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Confirmación de correo\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n        </div>\n        <div class=\"form-group row\">\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"email2\" class=\"col-sm-4 col-form-label\">2ndo Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"email2\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"email2\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese correo electronico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Correo electronico\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n          <div class=\"col-sm-6\">\n            <div class=\"row\">\n              <label for=\"email2Confirmation\" class=\"col-sm-4 col-form-label\">Confirmar 2ndo Email</label>\n              <div class=\"col-sm-8\">\n                <input\n                  id=\"email2Confirmation\"\n                  type=\"text\"\n                  class=\"form-control\"\n                  formControlName=\"email2Confirmation\"\n\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese correo electronico\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Correo electronico\"\n\t\t\t\t\t  >\n              </div>\n            </div>\n          </div>\n        </div>\n\n\n\n\t\t<div class=\"form-group row\">\n          <label for=\"\" class=\"col-sm-2 col-form-label\">Adjuntos Obligatorios</label>\n          <div class=\"col-sm-10\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n                <div class=\"form-group row\">\n                  <label for=\"filFormulario\" class=\"col-sm-4 col-form-label\">(*) Declaración jurada</label>\n                  <div class=\"col-sm-5\">\n                    <input\n                      #filFormulario\n                      id=\"filFormulario\"\n                      type=\"file\"\n                      ng2FileSelect\n                      [uploader]=\"uploader\"\n                      class=\"form-control\"\n                      (change)=\"onFileChanged('DECLA')\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t  matTooltip=\"Ingrese su formulario de registro\"\n\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  placeholder=\"Formulario de registro\"\n\t\t\t\t\t  \n\t\t\t\t>\n                  </div>\n                </div>\n               </div>\n            </div>\n          </div>\n        </div>\n\n<!--div nbRecaptcha key=\"public key\" formControlName=\"captcha\"></div-->\n\n        <div class=\"form-group row\">\n          <div class=\"col-sm-12 text-center\">\n            <button\n              class=\"btn btn-primary\"\n              type=\"submit\"\n\t\t\t  \n              >Guardar</button>\n          </div>\n        </div>\n\t\t</div>\n      </form>\n    </div>\n  </div>\n</div>\n\n\n \n\t<!--div *ngIf=\"flagInfoError\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tHubo un error al procesar esta acción, por favor intente de nuevo.\n\t</div-->\n\n\t\n</body>\n</html>"

/***/ }),

/***/ "./src/app/registronotprev/registronotprev.component.scss":
/*!****************************************************************!*\
  !*** ./src/app/registronotprev/registronotprev.component.scss ***!
  \****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "body {\n  background-image: url(diacofade3.jpg), url(imagen-grdfade2.jpg);\n  background-repeat: no-repeat, no-repeat;\n  background-attachment: fixed, fixed;\n  background-size: auto auto, auto auto;\n  background-position: bottom right, bottom left;\n  min-height: 100vh; }\n\nnav.navbar {\n  background-color: #00284d !important;\n  padding-top: 3px !important;\n  padding-bottom: 3px !important;\n  min-height: 20px !important; }\n\n.whitefont {\n  color: white !important; }\n\n.whitelink {\n  color: white !important;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n.whitelink:hover {\n  color: white !important;\n  text-decoration: underline;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n@font-face {\n  font-family: ABeeZeeRegular;\n  src: url('ABeeZee-Regular.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: ABeeZeeItalic;\n  src: url('ABeeZee-Italic.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: LatoBold;\n  src: url('Lato-Bold.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: Lato;\n  src: url('Lato-Regular.ttf') format(\"truetype\"); }\n\ntextarea {\n  border: 1px solid #999999;\n  width: 100%;\n  margin: 5px 0;\n  padding: 3px;\n  font-family: ABeeZeeItalic, sans-serif; }\n\n* {\n  font-size: 100%;\n  font-family: ABeeZeeRegular, sans-serif; }\n\nh2 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: LatoBold, sans-serif; }\n\nh3 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: Lato, sans-serif;\n  text-decoration: underline; }\n\ninput {\n  font-family: ABeeZeeItalic, sans-serif; }\n\nselect {\n  font-family: ABeeZeeItalic, sans-serif; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvcmVnaXN0cm9ub3RwcmV2L0M6XFxVc2Vyc1xcamphZ3VpbGFsXFxEb2N1bWVudHNcXERJQUNPIEFQUFxcUVVFSkFTLURJQUNPXFxGcm9udGVuZFxcZGlzdDYvc3JjXFxhcHBcXHJlZ2lzdHJvbm90cHJldlxccmVnaXN0cm9ub3RwcmV2LmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0MsK0RBQStEO0VBQy9ELHVDQUF1QztFQUN2QyxtQ0FBbUM7RUFDbkMscUNBQXFDO0VBQ3JDLDhDQUE4QztFQUM5QyxpQkFBZ0IsRUFBQTs7QUFHakI7RUFDQyxvQ0FBb0M7RUFDcEMsMkJBQTBCO0VBQzFCLDhCQUE2QjtFQUM3QiwyQkFDRCxFQUFBOztBQUVBO0VBQ0MsdUJBQXVCLEVBQUE7O0FBRXhCO0VBQ0MsdUJBQXVCO0VBQ3ZCLDJCQUEwQjtFQUFFLDhCQUE2QixFQUFBOztBQUUxRDtFQUNDLHVCQUF1QjtFQUN2QiwwQkFBMEI7RUFDMUIsMkJBQTBCO0VBQUUsOEJBQTZCLEVBQUE7O0FBRzFEO0VBQ0UsMkJBQTJCO0VBQzNCLGtEQUFxRSxFQUFBOztBQUd2RTtFQUNFLDBCQUEwQjtFQUMxQixpREFBb0UsRUFBQTs7QUFHdEU7RUFDRSxxQkFBcUI7RUFDckIsNENBQStELEVBQUE7O0FBR2pFO0VBQ0UsaUJBQWlCO0VBQ2pCLCtDQUFrRSxFQUFBOztBQUdwRTtFQUVFLHlCQUF3QjtFQUN4QixXQUFVO0VBQ1YsYUFBWTtFQUNaLFlBQVc7RUFDWCxzQ0FBdUMsRUFBQTs7QUFHekM7RUFDQyxlQUFlO0VBQ2YsdUNBQXdDLEVBQUE7O0FBR3pDO0VBQ0MsY0FBYTtFQUNiLGVBQWM7RUFDZCxpQ0FBa0MsRUFBQTs7QUFHbkM7RUFDQyxjQUFhO0VBQ2IsZUFBYztFQUNkLDZCQUE4QjtFQUM5QiwwQkFBMEIsRUFBQTs7QUFHM0I7RUFDQyxzQ0FBdUMsRUFBQTs7QUFHeEM7RUFDQyxzQ0FBdUMsRUFBQSIsImZpbGUiOiJzcmMvYXBwL3JlZ2lzdHJvbm90cHJldi9yZWdpc3Ryb25vdHByZXYuY29tcG9uZW50LnNjc3MiLCJzb3VyY2VzQ29udGVudCI6WyJib2R5IHtcblx0YmFja2dyb3VuZC1pbWFnZTogdXJsKGRpYWNvZmFkZTMuanBnKSwgdXJsKGltYWdlbi1ncmRmYWRlMi5qcGcpIDtcblx0YmFja2dyb3VuZC1yZXBlYXQ6IG5vLXJlcGVhdCwgbm8tcmVwZWF0O1xuXHRiYWNrZ3JvdW5kLWF0dGFjaG1lbnQ6IGZpeGVkLCBmaXhlZDtcblx0YmFja2dyb3VuZC1zaXplOiBhdXRvIGF1dG8sIGF1dG8gYXV0bztcblx0YmFja2dyb3VuZC1wb3NpdGlvbjogYm90dG9tIHJpZ2h0LCBib3R0b20gbGVmdDtcblx0bWluLWhlaWdodDoxMDB2aDsgXG59XG5cbm5hdi5uYXZiYXJ7XG5cdGJhY2tncm91bmQtY29sb3I6ICMwMDI4NGQgIWltcG9ydGFudDtcblx0cGFkZGluZy10b3A6M3B4ICFpbXBvcnRhbnQ7IFxuXHRwYWRkaW5nLWJvdHRvbTozcHggIWltcG9ydGFudDtcblx0bWluLWhlaWdodDoyMHB4ICFpbXBvcnRhbnRcbn1cblxuLndoaXRlZm9udCB7XG5cdGNvbG9yOiB3aGl0ZSAhaW1wb3J0YW50O1xufVxuLndoaXRlbGluayB7XG5cdGNvbG9yOiB3aGl0ZSAhaW1wb3J0YW50O1xuXHRwYWRkaW5nLXRvcDo1cHggIWltcG9ydGFudDsgcGFkZGluZy1ib3R0b206NXB4ICFpbXBvcnRhbnQ7XG59XG4ud2hpdGVsaW5rOmhvdmVyIHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xuXHRwYWRkaW5nLXRvcDo1cHggIWltcG9ydGFudDsgcGFkZGluZy1ib3R0b206NXB4ICFpbXBvcnRhbnQ7XG59XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogQUJlZVplZVJlZ3VsYXI7XG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvQUJlZVplZS1SZWd1bGFyLnR0ZicpIGZvcm1hdCgndHJ1ZXR5cGUnKTtcbn1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljO1xuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0FCZWVaZWUtSXRhbGljLnR0ZicpIGZvcm1hdCgndHJ1ZXR5cGUnKTtcbn1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBMYXRvQm9sZDtcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9MYXRvLUJvbGQudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IExhdG87XG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvTGF0by1SZWd1bGFyLnR0ZicpIGZvcm1hdCgndHJ1ZXR5cGUnKTtcbn1cblxudGV4dGFyZWFcbntcbiAgYm9yZGVyOjFweCBzb2xpZCAjOTk5OTk5O1xuICB3aWR0aDoxMDAlO1xuICBtYXJnaW46NXB4IDA7XG4gIHBhZGRpbmc6M3B4O1xuICBmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZiA7XHRcbn1cblxuKiB7XG5cdGZvbnQtc2l6ZTogMTAwJTtcblx0Zm9udC1mYW1pbHk6IEFCZWVaZWVSZWd1bGFyLCBzYW5zLXNlcmlmIDtcbn1cblxuaDIge1xuXHRjb2xvcjojMzM4NWZmO1xuXHRmb250LXNpemU6MjAwJTtcblx0Zm9udC1mYW1pbHk6IExhdG9Cb2xkLCBzYW5zLXNlcmlmIDtcbn1cblxuaDMge1xuXHRjb2xvcjojMzM4NWZmO1xuXHRmb250LXNpemU6MjAwJTtcblx0Zm9udC1mYW1pbHk6IExhdG8sIHNhbnMtc2VyaWYgO1xuXHR0ZXh0LWRlY29yYXRpb246IHVuZGVybGluZTtcbn1cblxuaW5wdXQge1xuXHRmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZiA7XHRcbn1cblxuc2VsZWN0IHtcblx0Zm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWMsIHNhbnMtc2VyaWYgO1x0XG59XG5cbiJdfQ== */"

/***/ }),

/***/ "./src/app/registronotprev/registronotprev.component.ts":
/*!**************************************************************!*\
  !*** ./src/app/registronotprev/registronotprev.component.ts ***!
  \**************************************************************/
/*! exports provided: RegistronotprevComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RegistronotprevComponent", function() { return RegistronotprevComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _shared_paises_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shared/paises.service */ "./src/app/shared/paises.service.ts");
/* harmony import */ var _shared_etnias_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/etnias.service */ "./src/app/shared/etnias.service.ts");
/* harmony import */ var _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/consumidores.service */ "./src/app/shared/consumidores.service.ts");
/* harmony import */ var _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../shared/proveedores.service */ "./src/app/shared/proveedores.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../shared/submit-form.service */ "./src/app/shared/submit-form.service.ts");
/* harmony import */ var _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../shared/seguridad.service */ "./src/app/shared/seguridad.service.ts");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var ng2_file_upload__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ng2-file-upload */ "./node_modules/ng2-file-upload/fesm5/ng2-file-upload.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




//import { SedesService } from '../shared/sedes.service';

//import { Sede } from '../shared/sede.model';
//import { MunicipiosService } from '../shared/municipios.service';



//import { QuejasService } from '../shared/quejas.service';






var RegistronotprevComponent = /** @class */ (function () {
    function RegistronotprevComponent(router, paisesService, 
    //private motivosQuejaService: MotivosQuejaService,
    //private departamentosService: DepartamentosService,
    //private municipiosService: MunicipiosService,
    etniasService, 
    //private sedesService: SedesService,
    dialog, consumidoresService, proveedoresService, 
    //private quejasService: QuejasService,
    _submitFormService, _seguridadService) {
        this.router = router;
        this.paisesService = paisesService;
        this.etniasService = etniasService;
        this.dialog = dialog;
        this.consumidoresService = consumidoresService;
        this.proveedoresService = proveedoresService;
        this._submitFormService = _submitFormService;
        this._seguridadService = _seguridadService;
        //municipios: Municipio[];
        //municipiosSubscription: Subscription;
        //sedes: Sede[];
        //sedesSubscription: Subscription;
        //consumidorOperationSubscription: Subscription;
        this.existingMode = false;
        this.mjsError = '';
        this.tipocon = '';
        this.str_usuario = '';
        this._conprov = '1';
        this._existe = '0';
        this.operationc = new rxjs__WEBPACK_IMPORTED_MODULE_12__["Subject"]();
        this.operationp = new rxjs__WEBPACK_IMPORTED_MODULE_12__["Subject"]();
        this.uploader = new ng2_file_upload__WEBPACK_IMPORTED_MODULE_11__["FileUploader"]({
            url: _conc_virt_const__WEBPACK_IMPORTED_MODULE_13__["BASE_URL_REST_FILE2"],
            itemAlias: 'document'
        });
        this.success = false;
        this.successFile = true;
        //this.str_usuario=this._submitFormService.Get_username();		
    }
    RegistronotprevComponent.prototype.ngOnInit = function () {
        var _this = this;
        // cargar paises
        this.paisesSubscription = this.paisesService.fetchData().subscribe(function (res) {
            _this.paises = res.value;
        });
        /*
        // cargar motivos de queja
        this.motivosQuejaSubscription = this.motivosQuejaService.fetchData().subscribe(
          res => {
            this.motivosQueja = res.value;
          }
        );
        // cargar departamentos
        this.departamentosSubscription = this.departamentosService.fetchData().subscribe(
          res => {
            this.departamentos = res.value;
          }
        );*/
        // cargar etnias
        this.etniasSubscription = this.etniasService.fetchData().subscribe(function (res) {
            _this.etnias = res.value;
        });
        /*
        //cargar sedes
        this.sedesSubscription = this.sedesService.fetchData().subscribe(
          res => {
            this.sedes = res.value;
          }
        );
        // listener cuando finaliza la operacion de creacion
        this.consumidorOperationSubscription = this.consumidoresService.operation.subscribe(
          (consumidor: Consumidor) => {
            this.nextStep(consumidor);
          }
        );*/
        this.initregistronotprev(null, null);
    };
    RegistronotprevComponent.prototype.initregistronotprev = function (consumidor, proveedor) {
        if (proveedor != null) {
            var correo = void 0;
            if (proveedor != null) {
                if (proveedor.email == '' || proveedor.email == undefined) {
                    correo = proveedor.email1;
                }
                else {
                    correo = proveedor.email;
                }
            }
            var tel = void 0;
            if (proveedor != null) {
                if (proveedor.telefono == '' || proveedor.telefono == undefined) {
                    tel = proveedor.telefono1;
                }
                else {
                    tel = proveedor.telefono;
                }
            }
            this.registronotprev = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
                // 'tipoConsumidor': new FormControl(proveedor ? proveedor.tipoConsumidor : '1', Validators.required),
                'tipoConsumidorProv': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this._conprov),
                'nitConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.nitProveedor : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'tipoConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.tipoProveedor : '6'),
                'documentoIdentificacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'nombre1': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.primerNombre : ''),
                'nombre2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.segundoNombre : ''),
                'nombre3': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.tercerNombre : ''),
                'apellido1': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.primerApellido : ''),
                'apellido2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.segundoApellido : ''),
                'apellidoCasada': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.apellidoCasada : ''),
                'nombreEmpresa': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.nombreEmpresa : ''),
                'razonSocial': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.razonSocial : ''),
                'representanteLegal': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'actividadEconomica': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.idActividadEconomica : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'tipoComercio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'telefonoCelular': new FormControl(proveedor ? tel : ''),
                'telefonoCelular': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.telefono1 : ''),
                'telefonoDomicilio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.telefono2 : ''),
                'telefonoReferencia': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.telefono3 : ''),
                //'email': new FormControl(proveedor ? correo : ''),
                'email': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.email : ''),
                'emailConfirmation': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.email : ''),
                'email2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.email1 : ''),
                'email2Confirmation': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.email1 : ''),
                'codigoDepartamento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.codigoDepartamento : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'codigoMunicipio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.codigoMunicipio : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                //'direccionAvenidaCalle': new FormControl(proveedor ? proveedor.direccionCalle : '', Validators.required),
                //'tipoDireccion': new FormControl(''),
                //'direccionNumero': new FormControl(proveedor ? proveedor.direccionAvenida : '', Validators.required),
                //'direccionZona': new FormControl(proveedor ? proveedor.direccionZona : '', Validators.required),
                'direccionDetalle': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.direccionDetalle : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
                'proveedorComun': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'sucursales': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'codigoDepartamentoS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'codigoMunicipioS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'direccionDetalleS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'nombreS': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'genero': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'etnia': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
            });
        }
        else {
            //if (consumidor != null) {  
            this.registronotprev = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
                'idConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.idConsumidor : '0'),
                'nacionalidad': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('G'),
                'tipoConsumidorProv': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](this._conprov),
                'tipoDocumento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.tipoDocumento : ''),
                'tipoConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.tipoConsumidor : '6'),
                //'tipoConsumidorProv': new FormControl(consumidor ? consumidor.tipoConsumidor : '1'),
                'documentoIdentificacion': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.documentoIdentificacion : ''),
                'pais': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nacionalidad : 1),
                'representanteLegal': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.representanteLegal : ''),
                'nitConsumidor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nitConsumidor : ''),
                'nombreEmpresa': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombreEmpresa : ''),
                'razonSocial': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.razonSocial : ''),
                'nombre1': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre1 : ''),
                'nombre2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre2 : ''),
                'nombre3': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.nombre3 : ''),
                'apellido1': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellido1 : ''),
                'apellido2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellido2 : ''),
                'apellidoCasada': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.apellidoCasada : ''),
                'genero': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.genero : ''),
                'etnia': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.etnia : ''),
                'motivoQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'codigoDepartamento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.codigoDepartamento : ''),
                'codigoMunicipio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                //'direccionAvenidaCalle': new FormControl(consumidor ? consumidor.direccionCalle : ''),
                //'tipoDireccion': new FormControl(''),
                //'direccionNumero': new FormControl(consumidor ? consumidor.direccionAvenida : ''),
                //'direccionZona': new FormControl(consumidor ? consumidor.direccionZona : ''),
                'direccionDetalle': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.direccionDetalle : ''),
                'sedeDiacoCercana': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](''),
                'telefonoCelular': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefonoCelular : ''),
                'telefonoDomicilio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefonoDomicilio : ''),
                'telefonoReferencia': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.telefonoReferencia : ''),
                'email': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email : ''),
                'emailConfirmation': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email : ''),
                'email2': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email2 : ''),
                'email2Confirmation': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.email2 : ''),
                'iCheck': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.iCheck : ''),
                'habilitadoNotificacionElectronica': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](consumidor ? consumidor.habilitadoNotificacionElectronica : '')
            });
        }
        if (consumidor) {
            /*
            // seleccionar departamento
            this.onDepartamentoChanged();
            this.registronotprev.patchValue({
              'codigoMunicipio': consumidor.codigoMunicipio
            });
            // seleccionar municipio
            this.onMunicipioChanged();
            this.registronotprev.patchValue({
              'codigoMunicipio': consumidor.codigoMunicipio
            });
            */
            //pais
            this.registronotprev.patchValue({
                'pais': consumidor.pais
            });
            //genero
            this.registronotprev.patchValue({
                'genero': consumidor.genero
            });
            //etnia
            this.registronotprev.patchValue({
                'etnia': consumidor.etnia
            });
            /*
            //queja
            this.registronotprev.patchValue({
              'motivoQueja': consumidor.motivoQueja
            });
            //sedeDiacoCercana
            this.registronotprev.patchValue({
              'sedeDiacoCercana': consumidor.sedeDiacoCercana
            });*/
        }
        this.registronotprev.get('nombre1').disable();
        this.registronotprev.get('nombre2').disable();
        this.registronotprev.get('nombre3').disable();
        this.registronotprev.get('apellido1').disable();
        this.registronotprev.get('apellido2').disable();
        this.registronotprev.get('apellidoCasada').disable();
        this.registronotprev.get('representanteLegal').disable();
        this.registronotprev.get('nombreEmpresa').disable();
        this.registronotprev.get('razonSocial').disable();
        this.registronotprev.get('genero').disable();
        this.registronotprev.get('etnia').disable();
        this.registronotprev.get('telefonoCelular').disable();
        this.registronotprev.get('telefonoDomicilio').disable();
        this.registronotprev.get('telefonoReferencia').disable();
        this.registronotprev.get('email').disable();
        this.registronotprev.get('emailConfirmation').disable();
        this.registronotprev.get('email2').disable();
        this.registronotprev.get('email2Confirmation').disable();
    };
    RegistronotprevComponent.prototype.onDocumentoIdentificacionChanged = function (tipo) {
        this._tipodocumento = tipo;
    };
    RegistronotprevComponent.prototype.btnIdentificacionChanged = function () {
        var _this = this;
        var tipo = this._tipodocumento;
        if (tipo == 'documento') {
            this.tipocon = this.registronotprev.value.documentoIdentificacion;
        }
        else {
            this.tipocon = this.registronotprev.value.nitConsumidor;
        }
        if (this.registronotprev.value.tipoConsumidorProv == '1') {
            // busca datos consumidor 
            this.consumidoresService.fetchData(tipo, this.tipocon).subscribe(function (response) {
                if (response.value) {
                    // inicializar formulario con valores predeterminados
                    var _nacionalidad = (response.value.nacionalidad == 1 ? 'G' : 'E');
                    if (response.value.tipoConsumidor == _this.registronotprev.value.tipoConsumidor &&
                        _nacionalidad == _this.registronotprev.value.nacionalidad) {
                        _this.existingMode = true;
                        _this.existingConsumidor = response.value;
                        _this.initregistronotprev(response.value, null);
                        _this._existe = '1';
                    }
                    else {
                        _this.existingMode = false;
                        _this.existingConsumidor = null;
                        _this._existe = '0';
                        _this.onChangeconprov();
                        alert("No existe información para el consumidor seleccionado");
                    }
                }
                else {
                    _this.existingMode = false;
                    _this.existingConsumidor = null;
                    _this._existe = '0';
                    _this.onChangeconprov();
                    alert("No existe información para el consumidor seleccionado");
                }
            });
        }
        else {
            //busca proveedor
            this.proveedoresService.fetchData(this.registronotprev.value.nitConsumidor).subscribe(function (response) {
                if (response.value) {
                    // inicializar formulario con valores predeterminados
                    console.log("data ", response.value.tipoProveedor, _this.registronotprev.value.tipoConsumidorProv);
                    if (response.value.tipoProveedor == _this.registronotprev.value.tipoConsumidor) {
                        _this.existingMode = true;
                        _this.existingProveedor = response.value;
                        _this.initregistronotprev(null, response.value);
                        _this._existe = '1';
                    }
                    else {
                        _this.existingMode = false;
                        _this.existingProveedor = null;
                        _this._existe = '0';
                        _this.onChangeconprov();
                        alert("No existe información para el proveedor seleccionado");
                    }
                }
                else {
                    _this.existingMode = false;
                    _this.existingProveedor = null;
                    _this._existe = '0';
                    _this.onChangeconprov();
                    alert("No existe información para el proveedor seleccionado");
                }
            });
        }
        //this._declaracion = null;
    };
    RegistronotprevComponent.prototype.onDepartamentoChanged = function () {
        // cargar municipios
        /*this.municipiosSubscription = this.departamentosService.fetchMunicipios(this.registronotprev.value.codigoDepartamento).subscribe(
          res => {
            this.municipios = res.value;
          }
        );*/
    };
    RegistronotprevComponent.prototype.onMunicipioChanged = function () {
        // cargar sedes
        /*
        this.municipiosSubscription = this.municipiosService.fetchSedes(this.registronotprev.value.codigoMunicipio).subscribe(
          res => {
            this.sedes = res.value;
          }
        );
        */
    };
    RegistronotprevComponent.prototype.valOnSummit = function () {
    };
    RegistronotprevComponent.prototype.onSubmit = function () {
        var _this = this;
        // verifica que esten ingresados los 2 archivos
        if (this.uploader.queue.length <= 0) {
            alert("Debe de ingresar Declaración jurada.");
            //this.showSpinner = false;
            return;
        }
        //______________________________________________________
        var url = "";
        var idcp;
        if (this.registronotprev.value.tipoConsumidorProv == 1) { //consumidor
            url = 'consumidores/ins_not_elect';
            idcp = this.existingConsumidor.idConsumidor;
        }
        else {
            url = 'proveedores/ins_not_elect';
            idcp = this.existingProveedor.idProveedor;
        }
        this.consumidoresService.saveDataCP(url, idcp, this.registronotprev.value.tipoConsumidorProv).subscribe(function (retvalue) {
            if (retvalue) {
                var tempstr = retvalue['value'];
                if (tempstr != null && tempstr != '') {
                    //this.registrodata=JSON.parse('['+retvalue["value"].slice(0, -1) +']');
                    //this.vanio = tempstr.anio;
                    //this.vsecanio = tempstr.secuencia;
                    //this.vidqueja = tempstr.idQueja;
                    //this.presencial = tempstr.conciliacion;
                    //*************************************************************************************
                    console.info("total datos", _this.uploader.queue.length);
                    if (_this.uploader.queue.length > 0) {
                        //console.log(this.vidqueja);
                        _this.uploader.onBeforeUploadItem = function (removeItem) {
                            //removeItem.withCredentials = false;
                            //removeItem.url = BASE_URL_REST_FILE + 'quejas/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen;
                            //BASE_URL_REST_FILE + 'quejasini/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen,
                            for (var i = 0; i < _this.uploader.queue.length; i++) {
                                //console.log("modifica url - inicio");
                                //console.log(i);
                                var removeItem_1 = _this.uploader.queue[i];
                                if (removeItem_1 == _this._declaracion) {
                                    //console.log("cambia url ");
                                    //this.uploader.queue[i].url = BASE_URL_REST_FILE2 + 'quejasini/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+2+"&correo=0&data=0";
                                    _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_13__["BASE_URL_REST_FILE2"] + 'proveedores/upload?id_proveedor=' + idcp + "&id_categoria_imagen=" + 21 + "&correo=0&data=" + _this.registronotprev.value.tipoConsumidorProv;
                                    //console.log(this.uploader.queue[i].url);
                                    //console.log(this.uploader.queue[i].url);
                                    //console.log(removeItem);
                                }
                                //console.log("modifica url - fin");	 
                            }
                        };
                        _this.uploader.setOptions({
                            //url: BASE_URL_REST_FILE2 + 'quejasini/upload?id_queja='+this.vidqueja+"&id_categoria_imagen="+this.vidimagen,
                            itemAlias: 'file'
                        });
                        _this.uploader.onCompleteAll = function () {
                            // finalizo la carga de todos los archivos
                            if (_this.registronotprev.value.tipoConsumidorProv == 1) {
                                _this.operationc.next(retvalue.value);
                            }
                            else {
                                _this.operationp.next(retvalue.value);
                            }
                        };
                        _this.uploader.onCompleteItem = function (item, uploadResponse, status, headers) {
                            // finalizo la carga de un archivo
                            // this.vidimagen = this.vidimagen + 1;
                        };
                        _this.uploader.uploadAll();
                    }
                    else {
                        if (_this.registronotprev.value.tipoConsumidorProv == 1) {
                            _this.operationc.next(retvalue.value);
                        }
                        else {
                            _this.operationp.next(retvalue.value);
                        }
                        //this.operation.next(retvalue.value);
                    }
                    //*************************************************************************************
                    _this.success = true;
                    alert("Se ha registrado con éxito su solicitud.");
                }
                else {
                    ////console.log('no llego');
                }
            }
            else {
                ////console.log('Rest service response ERROR.');
            }
        });
        this.onChangeconprov();
    };
    RegistronotprevComponent.prototype.nextStep = function (consumidor) {
        //this.registronotprev.reset();
        // guardar el consumidor en sesion
        //this.quejasService.consumidor = consumidor;
        // ir a pantalla de proveedor
        //this.router.navigate(['/proveedor']);
    };
    RegistronotprevComponent.prototype.CerrarSesion = function () {
        /*
          let loc_token=this._submitFormService.Get_token();
          console.log(loc_token);
          if(loc_token == '')
              this._seguridadService.RedireccionarLogin();
          this._seguridadService.Logout(loc_token).subscribe((retvalue)=>{
              console.log('cerrar sesion',retvalue);
              this._seguridadService.RedireccionarLogin();
          },(error)=>{
              this._seguridadService.RedireccionarLogin();
          });*/
    };
    RegistronotprevComponent.prototype.onChangeconprov = function () {
        this._conprov = this.registronotprev.value.tipoConsumidorProv;
        this.registronotprev.reset();
        this.initregistronotprev(null, null);
        this._existe = '0';
    };
    // manejo de archivo
    RegistronotprevComponent.prototype.onFileChanged = function (type) {
        //console.info(type);	
        this._declaIndex = this.uploader.queue.length - 1;
        console.info(this._declaracion);
        if (this.uploader.queue.length > 0) {
            if (type == 'DECLA') {
                if (this._declaracion && this._declaIndex > -1) {
                    var item = this.uploader.queue[this._declaIndex];
                    this.uploader.removeFromQueue(item);
                }
                this._declaracion = this.uploader.queue[this.uploader.queue.length - 1];
                this._declaIndex = this.uploader.queue.length - 1;
            }
            if (this.uploader.queue.length == 0) {
                this._declaIndex = -1;
            }
            if (this.uploader.queue.length == 2) {
                this.successFile = false;
            }
            else {
                this.successFile = true;
            }
            console.info("onFileChange ", this._declaracion);
        }
    };
    RegistronotprevComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-registronotprev',
            template: __webpack_require__(/*! ./registronotprev.component.html */ "./src/app/registronotprev/registronotprev.component.html"),
            styles: [__webpack_require__(/*! ./registronotprev.component.scss */ "./src/app/registronotprev/registronotprev.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_7__["Router"],
            _shared_paises_service__WEBPACK_IMPORTED_MODULE_3__["PaisesService"],
            _shared_etnias_service__WEBPACK_IMPORTED_MODULE_4__["EtniasService"],
            _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatDialog"],
            _shared_consumidores_service__WEBPACK_IMPORTED_MODULE_5__["ConsumidoresService"],
            _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_6__["ProveedoresService"],
            _shared_submit_form_service__WEBPACK_IMPORTED_MODULE_8__["SubmitFormService"],
            _shared_seguridad_service__WEBPACK_IMPORTED_MODULE_9__["SeguridadService"]])
    ], RegistronotprevComponent);
    return RegistronotprevComponent;
}());



/***/ }),

/***/ "./src/app/registropcv/registropcv.component.html":
/*!********************************************************!*\
  !*** ./src/app/registropcv/registropcv.component.html ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n\n<head>\n</head>\n\n<body>\n\n  <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n    <span class=\"navbar-text whitefont\">DIACO - Registro de proveedores a conciliación virtual</span>\n    <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n      <ul class=\"navbar-nav mr-auto\">\n      </ul>\n    </div>\n\n    <span class=\"navbar-text whitefont\">\n      <!--a class=\"nav-link whitelink\" [routerLink]=\"['/Login']\">Cerrar Sesi&oacute;n</a-->\n      <button class=\"btn btn-primary row\" (click)=\"onReload()\">Cancelar</button>\n    </span>\n  </nav>\n\n\n\n\n  <div class=\"container\">\n    <div class=\"row\">\n      <!--re captcha-->\n      <div class=\"col-sm-12\" *ngIf=\"!isValid\">\n        <form>\n          <div class=\"form-group row\">\n            <div class=\"col-sm-10\">\n              <div class=\"card\">\n                <div class=\"card-body\">\n                  <div class=\"form-group row\">\n                  </div>\n                  <p>Seleccione el botón de reCaptcha “No soy un robot” </p>\n                  <re-captcha (resolved)=\"resolved($event)\" siteKey=\"6LeCJqsaAAAAALo4on7TTz-uKediysRf3eAJdibo\">\n                    <!-- 6LeCJqsaAAAAALo4on7TTz-uKediysRf3eAJdibo -->\n                    <!-- 6LeEM20UAAAAAEW2TvlDa5_v5gCrEBFXrGfsRIHq -->  <!-- ORIGINAL INICIAL FUNCIONAL EN LOCAL HOST -->\n\n                  </re-captcha>\n                </div>\n              </div>\n            </div>\n          </div>\n        </form>\n      </div>\n\n      <!--re captcha-->\n    </div>\n    <div class=\"row\" *ngIf=\"isValid\">\n      <div class=\"col-sm-12\">\n        <form (ngSubmit)=\"onSubmit()\" [formGroup]=\"registropcvForm\">\n          <div class=\"form-group row\">\n            <label for=\"\" class=\"col-sm-2 col-form-label\">Datos proveedor</label>\n            <div class=\"col-sm-10\">\n              <div class=\"card\">\n                <div class=\"card-body\">\n                  <div class=\"form-group row\">\n\n                    <label for=\"et1\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n                    <label for=\"nit\" class=\"col-lg-1 col-form-label\">NIT</label>\n                    <div class=\"col-lg-4\">\n                      <input id=\"nit\" type=\"text\" class=\"form-control\" matTooltipPosition=\"after\"\n                        matTooltip=\"Ingrese su número de identificación tributaria\"\n                        matTooltipClass=\"custom-tooltip-blue\" formControlName=\"nit\" placeholder=\"NIT\" required>                        \n                    </div>\n                    <div class=\"col-sm-1\" *ngIf=\"continua=='0'\">\n                      <div class=\"col-lg-12 text-center\">\n                        <button class=\"btn btn-primary row\" type=\"button\" [disabled]=\"completado\"\n                          (click)=\"findByNITtoSAT()\" matTooltipPosition=\"after\" matTooltip=\"Buscar proveedor.\"\n                          matTooltipClass=\"custom-tooltip-blue\">Buscar</button>\n                      </div>\n                    </div>\n\n                  </div>\n                  <div class=\"form-group row\">\n\n                    <div class=\"col-sm-5\">\n                      {{nombre_}}\n                    </div>\n                  </div>\n                  <div class=\"form-group row\">\n\n                    <div class=\"col-sm-5\">\n                      {{telefono_}}\n                    </div>\n                  </div>\n                  <div class=\"form-group row\">\n\n                    <div class=\"col-sm-5\" *ngIf=\"continua=='1'\">\n                      <input id=\"email\" type=\"text\" class=\"form-control\" formControlName=\"email\"\n                          matTooltipPosition=\"after\" matTooltip=\"Ingrese direccion\"\n                          matTooltipClass=\"custom-tooltip-blue\" placeholder=\"Correo\">\n                      \n                      <!-- {{correo_}} -->\n                    </div>\n                  </div>\n                </div>\n              </div>\n            </div>\n          </div>\n\n          <div *ngIf=\"continua=='1' && !success\">\n            <div class=\"form-group row\">\n              <label for=\"\" class=\"col-sm-2 col-form-label\">Adjuntos Obligatorios</label>\n              <div class=\"col-sm-10\">\n                <div class=\"card\">\n                  <div class=\"card-body\">\n\n                    <div class=\"form-group row\">\n                      <label for=\"tipoProveedor\" class=\"col-sm-2 col-form-label\">(*) Tipo de proveedor</label>\n                      <div class=\"col-sm-10\">\n                        <select id=\"tipoProveedor\" class=\"form-control\" formControlName=\"tipoProveedor\">\n                          <option value=\"1\">Pequeño contribuyente</option>\n                          <option value=\"2\">Empresa Individual</option>\n                          <option value=\"3\">Sociendad Anonima</option>\n                        </select>\n                      </div>\n                    </div>\n\n                    <div class=\"form-group row\" >\n                      <label for=\"filFormulario\" class=\"col-sm-4 col-form-label\">(*) Formulario de registro</label>\n                      <div class=\"col-sm-5\">\n                        <input #filFormulario id=\"filFormulario\" type=\"file\" ng2FileSelect [uploader]=\"uploader\"\n                          class=\"form-control\" (change)=\"onFileChanged('FORM')\" matTooltipPosition=\"after\"\n                          matTooltip=\"Ingrese su formulario de registro\" matTooltipClass=\"custom-tooltip-blue\"\n                          placeholder=\"Formulario de registro\" accept=\"image/jpg,application/pdf,image/jpeg\">\n                      </div> \n                      <a download=\"formulario\" target=\"_blank\" href=\"formulario.pdf\">\n                        Descargar formulario\n                       </a>       \n                                    \n                    </div>\n                    <div class=\"form-group row\" *ngIf=\"registropcvForm.value.tipoProveedor=='3'\">\n                      <label for=\"filNombramiento\" class=\"col-sm-4 col-form-label\">(*) Nombramiento de representante\n                        legal</label>\n                      <div class=\"col-sm-5\">\n                        <input #filNombramiento id=\"filNombramiento\" type=\"file\" ng2FileSelect [uploader]=\"uploader\"\n                          class=\"form-control\" (change)=\"onFileChanged('NOMB')\" matTooltipPosition=\"after\"\n                          matTooltip=\"Ingrese Nombramiento de representante\" matTooltipClass=\"custom-tooltip-blue\"\n                          placeholder=\"Nombramiento\" accept=\"image/jpg,application/pdf,image/jpeg\">\n                      </div>\n                    </div>\n\n                    <div class=\"form-group row\"\n                      *ngIf=\"registropcvForm.value.tipoProveedor=='1' || registropcvForm.value.tipoProveedor=='2' || registropcvForm.value.tipoProveedor=='3'\">\n                      <label for=\"filDpi\" class=\"col-sm-4 col-form-label\">(*) DPI dueño o Representante legal </label>\n                      <div class=\"col-sm-5\">\n                        <input #filDpi id=\"filDpi\" type=\"file\" ng2FileSelect [uploader]=\"uploader\" class=\"form-control\"\n                          (change)=\"onFileChanged('DPI')\" matTooltipPosition=\"after\" matTooltip=\"Ingrese DPI\"\n                          matTooltipClass=\"custom-tooltip-blue\" placeholder=\"DPI\"\n                          accept=\"image/jpg,application/pdf,image/jpeg\">\n                      </div>\n                    </div>\n                    <div class=\"form-group row\"\n                      *ngIf=\"registropcvForm.value.tipoProveedor=='2' || registropcvForm.value.tipoProveedor=='3'\">\n                      <label for=\"filPatente\" class=\"col-sm-4 col-form-label\">(*) Patente de sociedad y empresa</label>\n                      <div class=\"col-sm-5\">\n                        <input #filPatente id=\"filPatente\" type=\"file\" ng2FileSelect [uploader]=\"uploader\"\n                          class=\"form-control\" (change)=\"onFileChanged('PATE')\" matTooltipPosition=\"after\"\n                          matTooltip=\"Ingrese Patente\" matTooltipClass=\"custom-tooltip-blue\" placeholder=\"Patente\"\n                          accept=\"image/jpg,application/pdf,image/jpeg\">\n                      </div>\n                    </div>\n\n                    <div class=\"form-group row\"\n                      *ngIf=\"registropcvForm.value.tipoProveedor=='1' || registropcvForm.value.tipoProveedor=='2' || registropcvForm.value.tipoProveedor=='3'\">\n                      <label for=\"filRtu\" class=\"col-sm-4 col-form-label\">(*) Constancia de inscripcion y modificacion\n                        al registro tributario unificado</label>\n                      <div class=\"col-sm-5\">\n                        <input #filRtu id=\"filRtu\" type=\"file\" ng2FileSelect [uploader]=\"uploader\" class=\"form-control\"\n                          (change)=\"onFileChanged('RTU')\" matTooltipPosition=\"after\" matTooltip=\"Ingrese RTU\"\n                          matTooltipClass=\"custom-tooltip-blue\" placeholder=\"Patente\"\n                          accept=\"image/jpg,application/pdf,image/jpeg\">\n                      </div>\n                    </div>\n\n                    <div class=\"row\">\n                      <p>Estos documentos deben ir completos, por ejemplo el DPI debe ser escaneado a ambos lados.</p>\n                    </div>\n                    <div class=\"form-group row\">\n\n                      <div class=\"col-sm-2\">\n                        <div class=\"col-lg-12 text-center\">\n                          <button class=\"btn btn-primary row\" type=\"button\" (click)=\"continuar()\"\n                            matTooltipPosition=\"after\" matTooltip=\"Continuar.\"\n                            matTooltipClass=\"custom-tooltip-blue\">Continuar</button>\n                        </div>\n                      </div>\n                    </div>\n\n\n                  </div>\n                </div>\n              </div>\n            </div>\n          </div>\n\n          <div *ngIf=\"continua=='2'  && !success\">\n            <div class=\"form-group row\">\n              <label for=\"filOtros\" class=\"col-sm-2 col-form-label\">Adjuntar otro documento</label>\n              <div class=\"col-sm-10\">\n                <div class=\"card\">\n                  <div class=\"card-body\">\n                    <div class=\"form-group row\">\n                      <div class=\"col-sm-6\">\n                        <input #filOtros id=\"filOtros\" type=\"file\" ng2FileSelect [uploader]=\"uploader\"\n                          accept=\"image/jpg,application/pdf,image/jpeg\" (change)=\"onFileChanged('OTRO')\"\n                          class=\"form-control\">\n                      </div>\n                    </div>\n                    <!--div class=\"col-sm-4 text-left\">\n          <button\n            class=\"btn btn-primary\">Agregar Documento</button>\n          </div-->\n                    <div class=\"form-group row\">\n                      <div class=\"row\">\n                        <div class=\"container\">\n                          <table class=\"table\">\n                            <thead>\n                              <tr>\n                                <th>Documentos adjuntos {{ uploader?.queue?.length }}</th>\n                                <th></th>\n                              </tr>\n                            </thead>\n                            <tbody>\n                              <tr *ngFor=\"let item of uploader.queue; let i = index\">\n                                <td>{{item.file.name}}</td>\n                                <td>\n                                  <button class=\"btn btn-danger\" (click)=\"onRemoveClicked(i)\">Quitar</button>\n                                </td>\n                              </tr>\n                            </tbody>\n                          </table>\n                        </div>\n                      </div>\n                    </div>\n\n                    <div class=\"form-group row\">\n                      <div class=\"col-sm-2\">\n                        <div class=\"col-lg-12 text-center\">\n                          <button class=\"btn btn-primary row\" type=\"button\" (click)=\"regresar()\"\n                            matTooltipPosition=\"after\" matTooltip=\"Regresar.\"\n                            matTooltipClass=\"custom-tooltip-blue\">Regresar</button>\n                        </div>\n                      </div>\n                      <div class=\"col-sm-2\">\n                        <div class=\"col-lg-12 text-center\">\n                          <button class=\"btn btn-primary row\" type=\"button\" (click)=\"continuar()\"\n                            matTooltipPosition=\"after\" matTooltip=\"Continuar.\"\n                            matTooltipClass=\"custom-tooltip-blue\">Continuar</button>\n                        </div>\n                      </div>\n                    </div>\n                  </div>\n                </div>\n\n\n              </div>\n\n            </div>\n          </div>\n\n          <div *ngIf=\"continua=='3'  && !success\">\n\n            <div class=\"form-group row\">\n              <label for=\"filOtros\" class=\"col-sm-2 col-form-label\">Datos para creación de usuario del portal de\n                Proveedores</label>\n              <div class=\"col-sm-10\">\n                <div class=\"card\">\n                  <div class=\"card-body\">\n\n                    <div class=\"form-group row\">\n                      <div class=\"col sm-6\">\n                        <div class=\"row\">\n                          <label for=\"cui\" class=\"col-sm-4 col-form-label\">(*) DPI </label>\n                          <div class=\"col-sm-8\">\n                            <input id=\"cui\" type=\"text\" class=\"form-control\" formControlName=\"cui\" value=\"cui\"\n                              [(ngModel)]=\"cui\" matTooltipPosition=\"after\" matTooltip=\"Ingrese DPI\"\n                              matTooltipClass=\"custom-tooltip-blue\" placeholder=\"DPI\">\n                          </div>\n                        </div>\n                      </div>\n\n                    </div>\n\n                    <div class=\"form-group row\">\n                      <div class=\"col-sm-6\">\n                        <div class=\"row\">\n                          <div class=\"col-lg-6 text-center\">\n                            <button class=\"btn btn-primary row\" type=\"button\" (click)=\"regresar()\"\n                              matTooltipPosition=\"after\" matTooltip=\"Regresar.\"\n                              matTooltipClass=\"custom-tooltip-blue\">Regresar</button>\n                          </div>\n                          <div class=\"col-lg-6 text-center\">\n                            <button class=\"btn btn-primary row\" type=\"button\" (click)=\"continuar()\"\n                              matTooltipPosition=\"after\" matTooltip=\"Continuar.\"\n                              matTooltipClass=\"custom-tooltip-blue\">Continuar</button>\n                          </div>\n                        </div>\n\n                      </div>\n\n                    </div>\n\n                  </div>\n                </div>\n              </div>\n\n            </div>\n\n\n\n          </div>\n\n\n          <div *ngIf=\"continua=='4'  && !success\">\n\n\n            <div class=\"form-group row\">\n              <label for=\"\" class=\"col-sm-2 col-form-label\">Dirección</label>\n              <div class=\"col-sm-10\">\n                <div class=\"card\">\n                  <div class=\"card-body\">\n                    <div class=\"form-group row\">\n                      <div class=\"col-sm-6\">\n                        <div class=\"row\">\n                          <label for=\"codigoDepartamento\" class=\"col-sm-4 col-form-label\">(*) Departamento</label>\n                          <div class=\"col-sm-8\">\n                            <select id=\"codigoDepartamento\" class=\"form-control\" formControlName=\"codigoDepartamento\"\n                              (change)=\"onDepartamentoChanged(codigoDepartamento)\" matTooltipPosition=\"after\"\n                              matTooltip=\"Ingrese departamento\" matTooltipClass=\"custom-tooltip-blue\"\n                              placeholder=\"Departamento\">\n                              <option disabled selected>Escoger</option>\n                              <option value=\"{{departamento.codigoDepartamento}}\"\n                                *ngFor=\"let departamento of departamentos\">{{departamento.nombreDepartamento}}</option>\n                            </select>\n                          </div>\n                        </div>\n                      </div>\n                      <div class=\"col-sm-6\">\n                        <div class=\"row\">\n                          <label for=\"codigoMunicipio\" class=\"col-sm-4 col-form-label\">(*) Municipio</label>\n                          <div class=\"col-sm-8\">\n                            <select id=\"codigoMunicipio\" class=\"form-control\" formControlName=\"codigoMunicipio\"\n                              matTooltipPosition=\"after\" matTooltip=\"Ingrese municipio\"\n                              matTooltipClass=\"custom-tooltip-blue\" placeholder=\"Municipio\">\n                              <option disabled selected>Escoger</option>\n                              <option value=\"{{municipio.codigoMunicipio}}\" *ngFor=\"let municipio of municipios\">\n                                {{municipio.nombreMunicipio}}</option>\n                            </select>\n                          </div>\n                        </div>\n                      </div>\n                    </div>\n\n\n\n                    <div class=\"form-group row\">\n                      <label for=\"direccionDetalle\" class=\"col-sm-2 col-form-label\">(*) Direccion</label>\n                      <div class=\"col-sm-10\">\n                        <input id=\"direccionDetalle\" type=\"text\" class=\"form-control\" formControlName=\"direccionDetalle\"\n                          matTooltipPosition=\"after\" matTooltip=\"Ingrese direccion\"\n                          matTooltipClass=\"custom-tooltip-blue\" placeholder=\"Direccion\">\n                      </div>\n                    </div>\n\n                    <div class=\"form-group row\">\n                      <div class=\"col-sm-6\">\n                        <div class=\"col-lg-12 text-center\">\n                          <button class=\"btn btn-primary row\" type=\"button\" (click)=\"regresar()\" matTooltipPosition=\"after\"\n                            matTooltip=\"Regresar.\" matTooltipClass=\"custom-tooltip-blue\">Regresar</button>\n                        </div>\n                      </div>\n                      <div class=\"col-sm-6\" *ngIf=\"completado\">\n                        <div class=\"col-lg-12 text-center\">\n                          <button class=\"btn btn-primary\" type=\"submit\">Enviar solicitud</button>\n                          <mat-spinner style=\"margin:0 auto;\" *ngIf=\"cargando\"></mat-spinner>\n                        </div>\n      \n                      </div>\n                    </div>\n\n                  </div>\n                </div>\n              </div>\n\n\n             \n            </div>\n          </div>\n\n        </form>\n\n      </div>\n    </div>\n  </div>\n\n\n  <!--div *ngIf=\"flagInfoError\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tHubo un error al procesar esta acción, por favor intente de nuevo.\n\t</div-->\n\n\n</body>\n\n</html>"

/***/ }),

/***/ "./src/app/registropcv/registropcv.component.scss":
/*!********************************************************!*\
  !*** ./src/app/registropcv/registropcv.component.scss ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "body {\n  background-image: url('/dist6/assets/img/logo-diaco-ant-bn.jpg');\n  background-repeat: no-repeat, no-repeat;\n  background-attachment: fixed, fixed;\n  background-size: auto auto, auto auto;\n  background-position: bottom right, bottom left;\n  min-height: 100vh; }\n\nnav.navbar {\n  background-color: #00284d !important;\n  padding-top: 3px !important;\n  padding-bottom: 3px !important;\n  min-height: 20px !important; }\n\n.whitefont {\n  color: white !important; }\n\n.whitelink {\n  color: white !important;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n.whitelink:hover {\n  color: white !important;\n  text-decoration: underline;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n@font-face {\n  font-family: ABeeZeeRegular;\n  src: url('ABeeZee-Regular.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: ABeeZeeItalic;\n  src: url('ABeeZee-Italic.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: LatoBold;\n  src: url('Lato-Bold.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: Lato;\n  src: url('Lato-Regular.ttf') format(\"truetype\"); }\n\ntextarea {\n  border: 1px solid #999999;\n  width: 100%;\n  margin: 5px 0;\n  padding: 3px;\n  font-family: ABeeZeeItalic, sans-serif; }\n\n* {\n  font-size: 100%;\n  font-family: ABeeZeeRegular, sans-serif; }\n\nh2 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: LatoBold, sans-serif; }\n\nh3 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: Lato, sans-serif;\n  text-decoration: underline; }\n\ninput {\n  font-family: ABeeZeeItalic, sans-serif; }\n\nselect {\n  font-family: ABeeZeeItalic, sans-serif; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvcmVnaXN0cm9wY3YvQzpcXFVzZXJzXFxqamFndWlsYWxcXERvY3VtZW50c1xcRElBQ08gQVBQXFxRVUVKQVMtRElBQ09cXEZyb250ZW5kXFxkaXN0Ni9zcmNcXGFwcFxccmVnaXN0cm9wY3ZcXHJlZ2lzdHJvcGN2LmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0MsZ0VBQXdEO0VBQ3hELHVDQUF1QztFQUN2QyxtQ0FBbUM7RUFDbkMscUNBQXFDO0VBQ3JDLDhDQUE4QztFQUM5QyxpQkFBZ0IsRUFBQTs7QUFHakI7RUFDQyxvQ0FBb0M7RUFDcEMsMkJBQTBCO0VBQzFCLDhCQUE2QjtFQUM3QiwyQkFDRCxFQUFBOztBQUVBO0VBQ0MsdUJBQXVCLEVBQUE7O0FBRXhCO0VBQ0MsdUJBQXVCO0VBQ3ZCLDJCQUEwQjtFQUFFLDhCQUE2QixFQUFBOztBQUUxRDtFQUNDLHVCQUF1QjtFQUN2QiwwQkFBMEI7RUFDMUIsMkJBQTBCO0VBQUUsOEJBQTZCLEVBQUE7O0FBRzFEO0VBQ0UsMkJBQTJCO0VBQzNCLGtEQUFxRSxFQUFBOztBQUd2RTtFQUNFLDBCQUEwQjtFQUMxQixpREFBb0UsRUFBQTs7QUFHdEU7RUFDRSxxQkFBcUI7RUFDckIsNENBQStELEVBQUE7O0FBR2pFO0VBQ0UsaUJBQWlCO0VBQ2pCLCtDQUFrRSxFQUFBOztBQUdwRTtFQUVFLHlCQUF3QjtFQUN4QixXQUFVO0VBQ1YsYUFBWTtFQUNaLFlBQVc7RUFDWCxzQ0FBdUMsRUFBQTs7QUFHekM7RUFDQyxlQUFlO0VBQ2YsdUNBQXdDLEVBQUE7O0FBR3pDO0VBQ0MsY0FBYTtFQUNiLGVBQWM7RUFDZCxpQ0FBa0MsRUFBQTs7QUFHbkM7RUFDQyxjQUFhO0VBQ2IsZUFBYztFQUNkLDZCQUE4QjtFQUM5QiwwQkFBMEIsRUFBQTs7QUFHM0I7RUFDQyxzQ0FBdUMsRUFBQTs7QUFHeEM7RUFDQyxzQ0FBdUMsRUFBQSIsImZpbGUiOiJzcmMvYXBwL3JlZ2lzdHJvcGN2L3JlZ2lzdHJvcGN2LmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsiYm9keSB7XG5cdGJhY2tncm91bmQtaW1hZ2U6IHVybCgvYXNzZXRzL2ltZy9sb2dvLWRpYWNvLWFudC1ibi5qcGcpO1xuXHRiYWNrZ3JvdW5kLXJlcGVhdDogbm8tcmVwZWF0LCBuby1yZXBlYXQ7XG5cdGJhY2tncm91bmQtYXR0YWNobWVudDogZml4ZWQsIGZpeGVkO1xuXHRiYWNrZ3JvdW5kLXNpemU6IGF1dG8gYXV0bywgYXV0byBhdXRvO1xuXHRiYWNrZ3JvdW5kLXBvc2l0aW9uOiBib3R0b20gcmlnaHQsIGJvdHRvbSBsZWZ0O1xuXHRtaW4taGVpZ2h0OjEwMHZoOyBcbn1cblxubmF2Lm5hdmJhcntcblx0YmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZCAhaW1wb3J0YW50O1xuXHRwYWRkaW5nLXRvcDozcHggIWltcG9ydGFudDsgXG5cdHBhZGRpbmctYm90dG9tOjNweCAhaW1wb3J0YW50O1xuXHRtaW4taGVpZ2h0OjIwcHggIWltcG9ydGFudFxufVxuXG4ud2hpdGVmb250IHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG59XG4ud2hpdGVsaW5rIHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cbi53aGl0ZWxpbms6aG92ZXIge1xuXHRjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcblx0dGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhcjtcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9BQmVlWmVlLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWM7XG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvQUJlZVplZS1JdGFsaWMudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IExhdG9Cb2xkO1xuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0xhdG8tQm9sZC50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XG59XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogTGF0bztcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9MYXRvLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG50ZXh0YXJlYVxue1xuICBib3JkZXI6MXB4IHNvbGlkICM5OTk5OTk7XG4gIHdpZHRoOjEwMCU7XG4gIG1hcmdpbjo1cHggMDtcbiAgcGFkZGluZzozcHg7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG4qIHtcblx0Zm9udC1zaXplOiAxMDAlO1xuXHRmb250LWZhbWlseTogQUJlZVplZVJlZ3VsYXIsIHNhbnMtc2VyaWYgO1xufVxuXG5oMiB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0b0JvbGQsIHNhbnMtc2VyaWYgO1xufVxuXG5oMyB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0bywgc2Fucy1zZXJpZiA7XG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xufVxuXG5pbnB1dCB7XG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG5zZWxlY3Qge1xuXHRmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZiA7XHRcbn1cblxuIl19 */"

/***/ }),

/***/ "./src/app/registropcv/registropcv.component.ts":
/*!******************************************************!*\
  !*** ./src/app/registropcv/registropcv.component.ts ***!
  \******************************************************/
/*! exports provided: RegistropcvComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RegistropcvComponent", function() { return RegistropcvComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var ng2_file_upload__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ng2-file-upload */ "./node_modules/ng2-file-upload/fesm5/ng2-file-upload.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../shared/departamentos.service */ "./src/app/shared/departamentos.service.ts");
/* harmony import */ var _shared_municipios_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../shared/municipios.service */ "./src/app/shared/municipios.service.ts");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var ngx_soap__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ngx-soap */ "./node_modules/ngx-soap/fesm5/ngx-soap.js");
/* harmony import */ var _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ../shared/proveedores.service */ "./src/app/shared/proveedores.service.ts");
/* harmony import */ var _shared_proveedorpcv_model__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ../shared/proveedorpcv.model */ "./src/app/shared/proveedorpcv.model.ts");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! sweetalert2 */ "./node_modules/sweetalert2/dist/sweetalert2.all.js");
/* harmony import */ var sweetalert2__WEBPACK_IMPORTED_MODULE_14___default = /*#__PURE__*/__webpack_require__.n(sweetalert2__WEBPACK_IMPORTED_MODULE_14__);















//import * as jsPDF from 'jspdf';
//import * as html2canvas from 'html2canvas';
//import { ReCaptchaV3Service } from 'ngx-captcha';
var RegistropcvComponent = /** @class */ (function () {
    function RegistropcvComponent(router, dialog, departamentosService, municipiosService, soap, http, proveedoresService
    //,private reCaptchaV3Service: ReCaptchaV3Service
    , formBuilder) {
        this.router = router;
        this.dialog = dialog;
        this.departamentosService = departamentosService;
        this.municipiosService = municipiosService;
        this.soap = soap;
        this.http = http;
        this.proveedoresService = proveedoresService;
        this.formBuilder = formBuilder;
        this.continua = "0";
        this.completado = false;
        this.uploader = new ng2_file_upload__WEBPACK_IMPORTED_MODULE_4__["FileUploader"]({
            itemAlias: 'document',
            allowedMimeType: ['image/jpg', 'application/pdf', 'image/jpeg'],
            maxFileSize: 5 * 1024 * 1024 // 5 MB
        });
        this.success = false;
        this.mjsError = '';
        this.str_usuario = '';
        //variable que contiene la validación del captcha
        this.isValid = true;
        this.isValidTmp = false;
        //variable de validacion de correo en SAT
        this.errorCorreo = false;
        //variable de validacion de telefono en SAT
        this.errorTelefono = false;
        //variable de validacion de telefono en SAT
        this.cargando = false;
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_7__["Subject"]();
    }
    /**
     * alruanoe
     * Metodo que valida que se ingrese el captcha
     * @param captchaResponse resultado del captcha
     */
    RegistropcvComponent.prototype.resolved = function (captchaResponse) {
        console.log("Resolved captcha with response " + captchaResponse + ":");
        this.$valorCaptcha = captchaResponse;
        if (captchaResponse) {
            this.isValid = true;
            this.isValidTmp = true;
        }
        else {
            this.isValid = false;
        }
        console.log("isValid " + this.isValid + ":");
    };
    RegistropcvComponent.prototype.ngOnInit = function () {
        var _this = this;
        // cargar departamentos
        this.departamentosSubscription = this.departamentosService.fetchData().subscribe(function (res) {
            _this.departamentos = res.value;
        });
        this.initregistropcvForm(null);
    };
    RegistropcvComponent.prototype.initregistropcvForm = function (proveedor) {
        console.log("cui initRegistro " + this.cui);
        if (proveedor) {
            this.nombre_ = proveedor.nombre;
            this.telefono_ = proveedor.telefono;
            if (proveedor.correo) {
                /* 				var caracteres = proveedor.correo.split('',2);
                                for (let index = 0; index < caracteres.length; index++) {
                                    const element = caracteres[index];
                                    console.log(element);
                                } */
                if (proveedor.correo.includes('F#')) {
                    proveedor.correo = proveedor.correo.replace('F#', '');
                }
            }
            ;
            this.correo_ = proveedor.correo;
            this.cui = proveedor.cui;
        }
        this.registropcvForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'nit': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.nit : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'telefono': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? this.telefono_ : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'email': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? this.correo_ : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'codigoDepartamento': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.idDepartamento : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'codigoMunicipio': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.idMunicipio : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'direccionDetalle': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? proveedor.direccion : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required)
            //,'nombre' : new FormControl(proveedor ? proveedor.nombre : '', Validators.required)
            //,'razonSocial' : new FormControl(proveedor ? proveedor.razonSocial : '', Validators.required)
            ,
            'cui': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](proveedor ? this.cui : '', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'tipoProveedor': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"](1, _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
            'recaptcha': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required)
        });
        if (proveedor) {
            // seleccionar departamento
            this.onDepartamentoChanged(proveedor.idDepartamento != undefined ? proveedor.idDepartamento : 0);
            this.registropcvForm.patchValue({
                'codigoDepartamento': proveedor.idDepartamento
            });
            // seleccionar municipio
            this.onMunicipioChanged();
            this.registropcvForm.patchValue({
                'codigoMunicipio': proveedor.idMunicipio
            });
        }
    };
    RegistropcvComponent.prototype.onFileChanged = function (type) {
        if (type == 'FORM') {
            console.log('this.uploader.queue.length ' + this.uploader.queue.length);
            if (this.formulario) {
                var formularioItem = this.uploader.queue[this.formularioIndex];
                this.uploader.removeFromQueue(formularioItem);
            }
            this.formulario = this.uploader.queue[this.uploader.queue.length - 1];
            this.formularioIndex = this.uploader.queue.length - 1;
        }
        else if (type == 'DPI') {
            if (this.dpi) {
                var dpiItem = this.uploader.queue[this.dpiIndex];
                this.uploader.removeFromQueue(dpiItem);
            }
            this.dpi = this.uploader.queue[this.uploader.queue.length - 1];
            this.dpiIndex = this.uploader.queue.length - 1;
        }
        else if (type == 'NOMB') {
            if (this.nombramiento) {
                var nombramientoItem = this.uploader.queue[this.nombramientoIndex];
                this.uploader.removeFromQueue(nombramientoItem);
            }
            this.nombramiento = this.uploader.queue[this.uploader.queue.length - 1];
            this.nombramientoIndex = this.uploader.queue.length - 1;
        }
        else if (type == 'PATE') {
            if (this.patente) {
                var patenteItem = this.uploader.queue[this.patenteIndex];
                this.uploader.removeFromQueue(patenteItem);
            }
            this.patente = this.uploader.queue[this.uploader.queue.length - 1];
            this.patenteIndex = this.uploader.queue.length - 1;
        }
        else if (type == 'RTU') {
            if (this.rtu) {
                var rtuItem = this.uploader.queue[this.rtuIndex];
                this.uploader.removeFromQueue(rtuItem);
            }
            this.rtu = this.uploader.queue[this.uploader.queue.length - 1];
            this.rtuIndex = this.uploader.queue.length - 1;
        }
    };
    RegistropcvComponent.prototype.onRemoveClicked = function (index) {
        var removeItem = this.uploader.queue[index];
        this.uploader.removeFromQueue(removeItem);
        if (index == this.formularioIndex) {
            this.formularioIndex = null;
            this.formulario = null;
        }
        else if (index == this.dpiIndex) {
            this.dpiIndex = null;
            this.dpi = null;
        }
        else if (index == this.nombramientoIndex) {
            this.nombramientoIndex = null;
            this.nombramiento = null;
        }
        else if (index == this.patenteIndex) {
            this.patenteIndex = null;
            this.patente = null;
        }
        else if (index == this.rtuIndex) {
            this.rtuIndex = null;
            this.rtu = null;
        }
    };
    RegistropcvComponent.prototype.onSubmit = function () {
        var _this = this;
        console.log("submit " + this.cui);
        var proveedor = new _shared_proveedorpcv_model__WEBPACK_IMPORTED_MODULE_13__["Proveedorpcv"]();
        if (this.registropcvForm.value.nit == "" || this.registropcvForm.value.nit == undefined) {
            this.mjsError += "- Ingrese NIT.  " + "\r\n";
        }
        else {
            proveedor.nit = this.registropcvForm.value.nit;
        }
        if (this.registropcvForm.value.telefono == "" || this.registropcvForm.value.telefono == undefined) {
            this.mjsError += "- Ingrese numero de telefono.  " + "\r\n";
        }
        else {
            proveedor.telefonoNotif = this.telefono_;
        }
        if (this.registropcvForm.value.email == "" || this.registropcvForm.value.email == undefined) {
            this.mjsError += "- Ingrese correo.  " + "\r\n";
        }
        else {
            /* proveedor.correoNotif = this.correo_; */
            proveedor.correoNotif = this.registropcvForm.value.email;
        }
        if (this.cui == "" || this.cui == undefined) {
            this.mjsError += "- Ingrese CUI del dueño o Representante legal.  " + "\r\n";
        }
        else {
            console.log("this.cui " + this.cui);
            console.log("this.existingProveedor.cui " + this.existingProveedor.cui);
            if (this.existingProveedor.cui != undefined || this.existingProveedor.cui != null) {
                proveedor.cui = this.existingProveedor.cui;
            }
            else {
                proveedor.cui = this.cui;
            }
        }
        if (this.registropcvForm.value.direccionDetalle == "" || this.registropcvForm.value.direccionDetalle == undefined) {
            this.mjsError += "- Ingrese su direccion.  " + "\r\n";
        }
        else {
            proveedor.direccion = this.registropcvForm.value.direccionDetalle;
        }
        if (this.registropcvForm.value.codigoDepartamento > 0) {
            proveedor.idDepartamento = this.registropcvForm.value.codigoDepartamento;
        }
        else {
            this.mjsError += "- Seleccione departamento.  " + "\r\n";
        }
        if (this.registropcvForm.value.codigoMunicipio > 0) {
            proveedor.idMunicipio = this.registropcvForm.value.codigoMunicipio;
        }
        else {
            this.mjsError += "- Seleccione municipio.  " + "\r\n";
        }
        if (this.registropcvForm.value.tipoProveedor == '1') {
            if (this.dpi != null) {
            }
            else {
                this.mjsError += "- Ingrese DPI dueño o Representante legal.  " + "\r\n";
            }
            if (this.rtu != null) {
            }
            else {
                this.mjsError += "- Ingrese Constancia de Registro de Inscripción Tributaria (RTU).  " + "\r\n";
            }
        }
        if (this.registropcvForm.value.tipoProveedor == '2') {
            if (this.dpi != null) {
            }
            else {
                this.mjsError += "- Ingrese DPI dueño o Representante legal.  " + "\r\n";
            }
            if (this.rtu != null) {
            }
            else {
                this.mjsError += "- Ingrese Constancia de Registro de Inscripción Tributaria (RTU).  " + "\r\n";
            }
            if (this.patente != null) {
            }
            else {
                this.mjsError += "- Ingrese Patente de sociedad y empresa.  " + "\r\n";
            }
        }
        if (this.registropcvForm.value.tipoProveedor == '3') {
            if (this.formulario != null) {
            }
            else {
                this.mjsError += "- Ingrese Formulario de registro.  " + "\r\n";
            }
            if (this.nombramiento != null) {
            }
            else {
                this.mjsError += "- Ingrese Nombramiento de representante legal.  " + "\r\n";
            }
            if (this.dpi != null) {
            }
            else {
                this.mjsError += "- Ingrese DPI dueño o Representante legal.  " + "\r\n";
            }
            if (this.patente != null) {
            }
            else {
                this.mjsError += "- Ingrese Patente de sociedad y empresa.  " + "\r\n";
            }
            if (this.rtu != null) {
            }
            else {
                this.mjsError += "- Ingrese Constancia de Registro de Inscripción Tributaria (RTU).  " + "\r\n";
            }
        }
        if (this.mjsError == '') {
        }
        else {
            //alert(this.mjsError);
            //aalruanoe - 16.02.2020
            //se cambia el manejo de mensajes de error
            this.Alerta("Advertencia", this.mjsError);
            this.mjsError = "";
            return false;
        }
        proveedor.nombre = this.existingProveedor.nombre;
        proveedor.id = this.existingProveedor.id;
        proveedor.razonSocial = this.existingProveedor.razonSocial;
        proveedor.telefono = this.existingProveedor.telefono;
        /* proveedor.correo = this.existingProveedor.correo; */
        proveedor.correo = this.registropcvForm.value.email;
        proveedor.notaRechazo = this.existingProveedor.notaRechazo;
        proveedor.estado = (this.existingProveedor.estado ? this.existingProveedor.estado : 'P');
        proveedor.tipo_proveedor = this.registropcvForm.value.tipoProveedor;
        console.log('a grabar proveedor ');
        console.log(proveedor);
        this.cargando = true;
        this.proveedoresService.saveDataPCV(proveedor).subscribe(function (retvalue) {
            if (retvalue) {
                var tempstr = retvalue['value'];
                if (tempstr != null && tempstr != '') {
                    //this.registrodata=JSON.parse('['+retvalue["value"].slice(0, -1) +']');
                    //this.vanio = tempstr.anio;
                    //this.vsecuencia = tempstr.noQueja;
                    _this.vidproveedor = tempstr.id;
                    if (_this.uploader.queue.length > 0) {
                        var estado_1 = true;
                        // this.success = true;
                        _this.uploader.onBeforeUploadItem = function (removeItem) {
                            for (var i = 0; i < _this.uploader.queue.length; i++) {
                                //console.log("modifica url - inicio");
                                //console.log(i);
                                var removeItem_1 = _this.uploader.queue[i];
                                if (removeItem_1 == _this.dpi) {
                                    //console.log("cambia url dpi");
                                    _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_6__["BASE_URL_REST_FILE2"] + 'proveedores/upload?id_proveedor=' + _this.vidproveedor + "&id_categoria_imagen=" + 16 + "&correo=0&data=0";
                                    //console.log(this.uploader.queue[i].url);
                                    //console.log(removeItem);
                                }
                                else {
                                    if (removeItem_1 == _this.formulario) {
                                        //console.log("cambia url formulario");
                                        _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_6__["BASE_URL_REST_FILE2"] + 'proveedores/upload?id_proveedor=' + _this.vidproveedor + "&id_categoria_imagen=" + 14 + "&correo=0&data=0";
                                        //console.log(this.uploader.queue[i].url);	
                                        //console.log(removeItem);
                                    }
                                    else {
                                        if (removeItem_1 == _this.nombramiento) {
                                            //console.log("cambia url nombramiento");
                                            _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_6__["BASE_URL_REST_FILE2"] + 'proveedores/upload?id_proveedor=' + _this.vidproveedor + "&id_categoria_imagen=" + 15 + "&correo=0&data=0";
                                            //console.log(this.uploader.queue[i].url);	
                                            //console.log(removeItem);
                                        }
                                        else {
                                            if (removeItem_1 == _this.patente) {
                                                //console.log("cambia url patente");
                                                _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_6__["BASE_URL_REST_FILE2"] + 'proveedores/upload?id_proveedor=' + _this.vidproveedor + "&id_categoria_imagen=" + 17 + "&correo=0&data=0";
                                                //console.log(this.uploader.queue[i].url);	
                                                //console.log(removeItem);
                                            }
                                            else {
                                                if (removeItem_1 == _this.rtu) {
                                                    //console.log("cambia url patente");
                                                    _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_6__["BASE_URL_REST_FILE2"] + 'proveedores/upload?id_proveedor=' + _this.vidproveedor + "&id_categoria_imagen=" + 22 + "&correo=0&data=0";
                                                    //console.log(this.uploader.queue[i].url);	
                                                    //console.log(removeItem);
                                                }
                                                else {
                                                    //console.log("cambia url otro");
                                                    _this.uploader.queue[i].url = _conc_virt_const__WEBPACK_IMPORTED_MODULE_6__["BASE_URL_REST_FILE2"] + 'proveedores/upload?id_proveedor=' + _this.vidproveedor + "&id_categoria_imagen=" + 1 + "&correo=0&data=0";
                                                    //console.log(this.uploader.queue[i].url);
                                                    //console.log(removeItem);
                                                }
                                            } // remove patente
                                        } // remove nombramiento
                                    } // remove formulario
                                } //remove dpi
                                //console.log("modifica url - fin");	
                            }
                        };
                        //console.info("ingreso files");
                        _this.uploader.setOptions({
                            itemAlias: 'file'
                        });
                        _this.uploader.onCompleteAll = function () {
                            // finalizo la carga de todos los archivos
                            ///this.vidimagen = this.vidimagen - 1;
                            _this.operation.next(retvalue.value);
                            console.info("ingreso files onclomplete", estado_1);
                            if (estado_1) {
                                _this.success = true;
                                _this.completado = false;
                                _this.initregistropcvForm(null);
                                while (_this.uploader.queue.length) {
                                    _this.uploader.queue[0].remove();
                                }
                                _this.Alerta("exito", null);
                            }
                            else {
                                //this.success = false;									
                                //alert("Ocurrio un error al cargar sus archivos, por favor verifique.  Gracias.");
                                //aalruanoe 18.02.2020
                                //se cambia la forma de presentar los mensajes de error
                                _this.cargando = false;
                                _this.Alerta("Error", "Ocurrio un error al cargar sus archivos, por favor verifique.  Gracias.");
                            }
                        };
                        _this.uploader.onCompleteItem = function (item, uploadResponse, status, headers) {
                            // finalizo la carga de un archivo
                            //this.vidimagen = this.vidimagen - 1;
                            //console.info("ingreso files oncompleteitem",status);
                            if (status == 0) {
                                //this.success = false;
                                estado_1 = false;
                            }
                            else {
                                //this.success = true;
                            }
                        };
                        _this.uploader.uploadAll();
                        //console.info("ingreso files uploadall");
                    }
                    else {
                        _this.operation.next(retvalue.value);
                    }
                }
                else {
                    ////console.log('no llego');
                    _this.cargando = false;
                }
            }
            else {
                _this.cargando = false;
                console.log('Rest service response ERROR.');
            }
        });
        //console.info(this.vsecuencia);
        //console.info(this.vanio);
    };
    /**
     * alruanoe
     * 03.02.2020
     * Metodo para refrescar la página
     */
    RegistropcvComponent.prototype.onReload = function () {
        window.location.reload();
    };
    RegistropcvComponent.prototype.onDismissClicked = function () {
        this.success = false;
        this.continua = "0";
        this.paso = 0;
        this.nombre_ = "";
        this.telefono_ = "";
        this.correo_ = "";
        this.dpi = null;
        this.otro = null;
        this.formulario = null;
        this.nombramiento = null;
        this.patente = null;
        this.completado = false;
        this.errorCorreo = false;
        this.errorTelefono = false;
        this.cargando = false;
        //variable que valida el captcha
        this.isValid = false;
        //variable que guarda el cui del representate legal o propietario
        this.cui = "";
        //this.uploader.queue = null;
        if (this.uploader.queue.length > 0) {
            var pItem = this.uploader.queue[0];
            this.uploader.removeFromQueue(pItem);
        }
        this.registropcvForm.reset();
    };
    RegistropcvComponent.prototype.onHomeClicked = function () {
        this.CerrarSesion();
        this.router.navigate(['/Login']);
    };
    RegistropcvComponent.prototype.CerrarSesion = function () {
        /*
          let loc_token=this._submitFormService.Get_token();
          console.log(loc_token);
          if(loc_token == '')
              this._seguridadService.RedireccionarLogin();
          this._seguridadService.Logout(loc_token).subscribe((retvalue)=>{
              console.log('cerrar sesion',retvalue);
              this._seguridadService.RedireccionarLogin();
          },(error)=>{
              this._seguridadService.RedireccionarLogin();
          });*/
    };
    RegistropcvComponent.prototype.onDepartamentoChanged = function (_departamento) {
        var _this = this;
        // cargar municipios
        //console.log("depto ",_departamento);
        this.municipiosSubscription = this.departamentosService.fetchMunicipios(_departamento != undefined ? _departamento : this.registropcvForm.value.codigoDepartamento).subscribe(function (res) {
            _this.municipios = res.value;
        });
    };
    RegistropcvComponent.prototype.onMunicipioChanged = function () {
        // cargar sedes
        /*
        this.municipiosSubscription = this.municipiosService.fetchSedes(this.registropcvForm.value.idMunicipio).subscribe(
          res => {
            this.sedes = res.value;
          }
        );
        */
    };
    /**Obtener pdf instructivo */
    /*	generarPdf(seccion: string) {
       
            var data = document.getElementById(seccion);
            html2canvas(data).then(canvas => {
              // Few necessary setting options
              var imgWidth = 208;
              var pageHeight = 295;
              var imgHeight = canvas.height * imgWidth / canvas.width;
              var heightLeft = imgHeight;
              const contentDataURL = canvas.toDataURL('image/png')
              let pdf = new jsPDF('p', 'mm', 'a4'); // A4 size page of PDF
              var position = 0;
              pdf.addImage(contentDataURL, 'PNG', 0, position, imgWidth, imgHeight)
              pdf.save('instructivo_'+seccion+'.pdf'); // Generated PDF
            });
        
          }*/
    /***
      busca nit en servicio de SAT
    ***/
    RegistropcvComponent.prototype.findByNITtoSAT = function () {
        var _this = this;
        console.log('findByNITtoSAT ');
        var pnit = this.registropcvForm.value.nit;
        this.completado = true;
        pnit = pnit.replace('-', '').toUpperCase();
        console.log('nit modificado ' + pnit);
        this.proveedoresService.fetchDataByWsProveedor(pnit).subscribe(function (response) {
            console.log("response ");
            console.log(response);
            var tempstr = response['value'];
            console.log("tempstr ");
            console.log(tempstr);
            if (tempstr != null || tempstr != undefined) {
                console.info("existe", tempstr);
                _this.initregistropcvForm(tempstr);
                _this.existingProveedor = tempstr;
                if (_this.existingProveedor.telefono == null || _this.existingProveedor.telefono == undefined || _this.existingProveedor.telefono == " ") {
                    _this.errorTelefono = true;
                    _this.Alerta("ErrorTelefono", null);
                }
                else {
                    if (_this.existingProveedor.correo == null || _this.existingProveedor.correo == undefined || _this.existingProveedor.correo == " ") {
                        _this.errorCorreo = true;
                        _this.Alerta("ErrorCorreo", null);
                    }
                    else {
                        _this.continua = "1";
                        console.log('this.continua ' + _this.continua);
                        _this.paso = 1;
                        _this.completado = true;
                    }
                }
            }
            else {
                //aalruanoe 18.02.2020
                //se cambia la forma de presentar el error.
                _this.Alerta("Error", "No existe información para el NIT ingresado, por favor verifique. Gracias");
                _this.registropcvForm.reset();
                _this.completado = false;
            }
        });
        //console.info("findByTokenProveedor end ",this.quejasService.quejat);
    };
    /***
     * alruanoe
     * boton continuar
    ***/
    RegistropcvComponent.prototype.continuar = function () {
        this.paso = this.paso + 1;
        this.continua = this.paso.toString();
        console.info("continuar ", this.continua);
    };
    /***
     * aalruanoe
     * boton regresar
    ***/
    RegistropcvComponent.prototype.regresar = function () {
        this.paso = this.paso - 1;
        this.continua = this.paso.toString();
        console.info("continuar ", this.continua);
    };
    /**
     * alruanoe
     * Metodo de mostrar alertas */
    RegistropcvComponent.prototype.Alerta = function (tipo, mensaje) {
        if (mensaje == undefined || mensaje == null) {
            if (tipo == 'ErrorCorreo') {
                sweetalert2__WEBPACK_IMPORTED_MODULE_14___default.a.fire({
                    icon: 'error',
                    title: 'Error datos obtenidos.',
                    text: 'No tiene configurado su correo electrónico en SAT, por favor actualice sus datos en Agencia Virtual de SAT. Gracias.',
                });
            }
            if (tipo == 'ErrorTelefono') {
                sweetalert2__WEBPACK_IMPORTED_MODULE_14___default.a.fire({
                    icon: 'error',
                    title: 'Error datos obtenidos.',
                    text: 'No tiene configurado su número telefónico en SAT, por favor actualice sus datos en Agencia Virtual de SAT. Gracias.',
                });
            }
            if (tipo == 'exito') {
                sweetalert2__WEBPACK_IMPORTED_MODULE_14___default.a.fire({
                    icon: 'success',
                    title: 'Su solicitud ha sido registrada exitosamente.',
                    showConfirmButton: false,
                    timer: 1500
                });
            }
        }
        else {
            if (tipo == 'Error') {
                sweetalert2__WEBPACK_IMPORTED_MODULE_14___default.a.fire({
                    icon: 'error',
                    title: 'Error.',
                    text: mensaje,
                });
            }
            if (tipo == 'Advertencia') {
                sweetalert2__WEBPACK_IMPORTED_MODULE_14___default.a.fire({
                    icon: 'warning',
                    title: 'Advertencia.',
                    text: mensaje,
                });
            }
        }
    };
    tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["ViewChild"])('filDpi'),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:type", _angular_core__WEBPACK_IMPORTED_MODULE_1__["ElementRef"])
    ], RegistropcvComponent.prototype, "filDpi", void 0);
    RegistropcvComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-registropcv',
            template: __webpack_require__(/*! ./registropcv.component.html */ "./src/app/registropcv/registropcv.component.html"),
            styles: [__webpack_require__(/*! ./registropcv.component.scss */ "./src/app/registropcv/registropcv.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatDialog"],
            _shared_departamentos_service__WEBPACK_IMPORTED_MODULE_8__["DepartamentosService"],
            _shared_municipios_service__WEBPACK_IMPORTED_MODULE_9__["MunicipiosService"],
            ngx_soap__WEBPACK_IMPORTED_MODULE_11__["NgxSoapService"],
            _angular_common_http__WEBPACK_IMPORTED_MODULE_5__["HttpClient"],
            _shared_proveedores_service__WEBPACK_IMPORTED_MODULE_12__["ProveedoresService"]
            //,private reCaptchaV3Service: ReCaptchaV3Service
            ,
            _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormBuilder"]])
    ], RegistropcvComponent);
    return RegistropcvComponent;
}());



/***/ }),

/***/ "./src/app/revisionqueja/revisionqueja.component.html":
/*!************************************************************!*\
  !*** ./src/app/revisionqueja/revisionqueja.component.html ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<html>\n<head>\n</head>\n<body>\n\n<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <span class=\"navbar-text whitefont\">DIACO - Revisar queja</span>\n  <!--span class=\"navbar-text whitefont\">&nbsp;&nbsp;&nbsp;Proveedor: {{nombre_proveedor}}</span-->\n  <!---- <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>--->\n  <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n  <ul class=\"navbar-nav mr-auto\">\n   <!----     <li class=\"nav-item active\">\n        <a class=\"nav-link whitelink\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Features</a>\n      </li>\n      <li class=\"nav-item\">\n        <a class=\"nav-link whitelink\" href=\"#\">Pricing</a>\n      </li>--->\n    </ul>  \n  </div>\n  <!--span class=\"navbar-text whitefont\">\n   Usuario: {{str_usuario}}  \n  </span>\n  <span class=\"navbar-text whitefont\">\n    <a class=\"nav-link whitelink\" [routerLink]=\"['/Login']\">Cerrar Sesi&oacute;n</a>\n  </span-->\n    <span class=\"navbar-text whitefont\">\n    <!--a class=\"nav-link whitelink\" [routerLink]=\"['/Login']\">Cerrar Sesi&oacute;n</a-->\n\t<button class=\"btn btn-primary row\" (click)=\"onDismissClicked()\">Cancelar</button>\n  </span>\n</nav>\n<div class=\"container\">\n\n \n  \n  <!--div class=\"row\">\n    <h2></h2>\n  </div-->\n  <div class=\"row\">\n    <div class=\"col-lg-12\">\n      <form [formGroup]=\"revisionQuejaForm\" (ngSubmit)=\"onSubmit()\" novalidate>\n\t\t<div class=\"form-group row\">\n          <label for=\"\" class=\"col-lg-13 col-form-label\">Seguimiento de queja para consumidor</label>\n\t\t   \n\t\t<div class=\"col-lg-12\">\n            <div class=\"card\">\n              <div class=\"card-body\">\n\t\t\t  \n\t\t\t\t<div class=\"form-group row\">\n\t\t\t\t\n\t\t\t\t\t<label for=\"et1\" [ngStyle]=\"{color: 'red'}\">(*)</label>\n\t\t\t\t\t<label for=\"noQueja\" class=\"col-lg-3 col-form-label\" >Número de queja</label>\n\t\t\t\t\t<div class=\"col-lg-4\">\n\t\t\t\t\t<input\n\t\t\t\t\t  id=\"noQueja\"\n\t\t\t\t\t  type=\"text\"\n\t\t\t\t\t  class=\"form-control\"\n\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t\t  matTooltip=\"Ingrese su número de queja\"\n\t\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t  formControlName=\"noQueja\"\n\t\t  \t\t\t  placeholder=\"No. queja\"\n\t\t\t\t\t  pattern=\"^[0-9]+-[0-9]{4}$\"\n\t\t\t\t\t  (change)=\"onDocumentoChanged()\"\n\t\t\t\t\t  required\n\t\t\t\t\t  >\n\t\t\t\t\t</div>\n\t\t\t\t   <div class=\"form-group row\">\n\t\t\t\t\t  <div class=\"col-lg-12 text-center\">\n\t\t\t\t\t\t<button\n\t\t\t\t\t\t  class=\"btn btn-primary\"\n\t\t\t\t\t\t  matTooltipPosition=\"after\"\n\t\t\t\t\t\t\t\t  matTooltip=\"Buscar queja.\"\n\t\t\t\t\t\t\t\t  matTooltipClass=\"custom-tooltip-blue\"\n\t\t\t\t\t\t  >Buscar</button>\n\t\t\t\t\t  </div>\n\t\t\t\t\t</div>\n\t\t\t\t\t\n\t\t\t\t\t<div *ngIf=\"revisionQuejaForm.get('noQueja').errors && revisionQuejaForm.get('noQueja').dirty\" class=\"col-lg-12\">\n\t\t\t\t\t  <p *ngIf=\"revisionQuejaForm.get('noQueja').hasError('pattern')\"  class=\"highlight\">Debe ingresar un número de queja válido (correlativo-año).</p>\n\t\t\t\t\t</div>\n\t\t\t\t\t\n\t\t\t\t\t<div class=\"container\" *ngIf=\"revisionQuejaForm.valid\">\n\t\t\t\t\t<label for=\"\" class=\"col-lg-3 col-form-label\" >Queja no. {{pnoQueja}}</label>\n\t\t\t\t\t<div class=\"reglist\">\n                        <table class=\"table table-striped\">\n                          <thead>\n                            <tr>\n                              <th>Fecha</th>\n                              <th>descripción</th>\n                            </tr>\n                          </thead>\n                          <tbody>\n                            <tr *ngFor=\"let queja of quejas\">\n                              <th scope=\"row\">{{ queja[0] }}</th>\n                              <td>{{ queja[1] }}</td>\n                            </tr>\n                          </tbody>\n                        </table>\n                      </div>\n\t\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t</div>\n\t\t</div>\n\t</div>\n\t</div>\n\t</form>\n\t</div>\n\t\t\n \n    </div>\n  </div>\n  \n \n\t<!--div *ngIf=\"flagInfoError\" class=\"alert alert-alert col-lg-12\" [@EnterLeave]=\"'flyIn'\">\n\t\tHubo un error al procesar esta acción, por favor intente de nuevo.\n\t</div-->\n\n\t\n</body>\n</html>"

/***/ }),

/***/ "./src/app/revisionqueja/revisionqueja.component.scss":
/*!************************************************************!*\
  !*** ./src/app/revisionqueja/revisionqueja.component.scss ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "body {\n  background-image: url(diacofade3.jpg), url(imagen-grdfade2.jpg);\n  background-repeat: no-repeat, no-repeat;\n  background-attachment: fixed, fixed;\n  background-size: auto auto, auto auto;\n  background-position: bottom right, bottom left;\n  min-height: 100vh; }\n\nnav.navbar {\n  background-color: #00284d !important;\n  padding-top: 3px !important;\n  padding-bottom: 3px !important;\n  min-height: 20px !important; }\n\n.whitefont {\n  color: white !important; }\n\n.whitelink {\n  color: white !important;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n.whitelink:hover {\n  color: white !important;\n  text-decoration: underline;\n  padding-top: 5px !important;\n  padding-bottom: 5px !important; }\n\n@font-face {\n  font-family: ABeeZeeRegular;\n  src: url('ABeeZee-Regular.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: ABeeZeeItalic;\n  src: url('ABeeZee-Italic.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: LatoBold;\n  src: url('Lato-Bold.ttf') format(\"truetype\"); }\n\n@font-face {\n  font-family: Lato;\n  src: url('Lato-Regular.ttf') format(\"truetype\"); }\n\ntextarea {\n  border: 1px solid #999999;\n  width: 100%;\n  margin: 5px 0;\n  padding: 3px;\n  font-family: ABeeZeeItalic, sans-serif; }\n\n* {\n  font-size: 100%;\n  font-family: ABeeZeeRegular, sans-serif; }\n\nh2 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: LatoBold, sans-serif; }\n\nh3 {\n  color: #3385ff;\n  font-size: 200%;\n  font-family: Lato, sans-serif;\n  text-decoration: underline; }\n\ninput {\n  font-family: ABeeZeeItalic, sans-serif; }\n\nselect {\n  font-family: ABeeZeeItalic, sans-serif; }\n\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNyYy9hcHAvcmV2aXNpb25xdWVqYS9DOlxcVXNlcnNcXGpqYWd1aWxhbFxcRG9jdW1lbnRzXFxESUFDTyBBUFBcXFFVRUpBUy1ESUFDT1xcRnJvbnRlbmRcXGRpc3Q2L3NyY1xcYXBwXFxyZXZpc2lvbnF1ZWphXFxyZXZpc2lvbnF1ZWphLmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0VBQ0MsK0RBQStEO0VBQy9ELHVDQUF1QztFQUN2QyxtQ0FBbUM7RUFDbkMscUNBQXFDO0VBQ3JDLDhDQUE4QztFQUM5QyxpQkFBZ0IsRUFBQTs7QUFHakI7RUFDQyxvQ0FBb0M7RUFDcEMsMkJBQTBCO0VBQzFCLDhCQUE2QjtFQUM3QiwyQkFDRCxFQUFBOztBQUVBO0VBQ0MsdUJBQXVCLEVBQUE7O0FBRXhCO0VBQ0MsdUJBQXVCO0VBQ3ZCLDJCQUEwQjtFQUFFLDhCQUE2QixFQUFBOztBQUUxRDtFQUNDLHVCQUF1QjtFQUN2QiwwQkFBMEI7RUFDMUIsMkJBQTBCO0VBQUUsOEJBQTZCLEVBQUE7O0FBRzFEO0VBQ0UsMkJBQTJCO0VBQzNCLGtEQUFxRSxFQUFBOztBQUd2RTtFQUNFLDBCQUEwQjtFQUMxQixpREFBb0UsRUFBQTs7QUFHdEU7RUFDRSxxQkFBcUI7RUFDckIsNENBQStELEVBQUE7O0FBR2pFO0VBQ0UsaUJBQWlCO0VBQ2pCLCtDQUFrRSxFQUFBOztBQUdwRTtFQUVFLHlCQUF3QjtFQUN4QixXQUFVO0VBQ1YsYUFBWTtFQUNaLFlBQVc7RUFDWCxzQ0FBdUMsRUFBQTs7QUFHekM7RUFDQyxlQUFlO0VBQ2YsdUNBQXdDLEVBQUE7O0FBR3pDO0VBQ0MsY0FBYTtFQUNiLGVBQWM7RUFDZCxpQ0FBa0MsRUFBQTs7QUFHbkM7RUFDQyxjQUFhO0VBQ2IsZUFBYztFQUNkLDZCQUE4QjtFQUM5QiwwQkFBMEIsRUFBQTs7QUFHM0I7RUFDQyxzQ0FBdUMsRUFBQTs7QUFHeEM7RUFDQyxzQ0FBdUMsRUFBQSIsImZpbGUiOiJzcmMvYXBwL3JldmlzaW9ucXVlamEvcmV2aXNpb25xdWVqYS5jb21wb25lbnQuc2NzcyIsInNvdXJjZXNDb250ZW50IjpbImJvZHkge1xuXHRiYWNrZ3JvdW5kLWltYWdlOiB1cmwoZGlhY29mYWRlMy5qcGcpLCB1cmwoaW1hZ2VuLWdyZGZhZGUyLmpwZykgO1xuXHRiYWNrZ3JvdW5kLXJlcGVhdDogbm8tcmVwZWF0LCBuby1yZXBlYXQ7XG5cdGJhY2tncm91bmQtYXR0YWNobWVudDogZml4ZWQsIGZpeGVkO1xuXHRiYWNrZ3JvdW5kLXNpemU6IGF1dG8gYXV0bywgYXV0byBhdXRvO1xuXHRiYWNrZ3JvdW5kLXBvc2l0aW9uOiBib3R0b20gcmlnaHQsIGJvdHRvbSBsZWZ0O1xuXHRtaW4taGVpZ2h0OjEwMHZoOyBcbn1cblxubmF2Lm5hdmJhcntcblx0YmFja2dyb3VuZC1jb2xvcjogIzAwMjg0ZCAhaW1wb3J0YW50O1xuXHRwYWRkaW5nLXRvcDozcHggIWltcG9ydGFudDsgXG5cdHBhZGRpbmctYm90dG9tOjNweCAhaW1wb3J0YW50O1xuXHRtaW4taGVpZ2h0OjIwcHggIWltcG9ydGFudFxufVxuXG4ud2hpdGVmb250IHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG59XG4ud2hpdGVsaW5rIHtcblx0Y29sb3I6IHdoaXRlICFpbXBvcnRhbnQ7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cbi53aGl0ZWxpbms6aG92ZXIge1xuXHRjb2xvcjogd2hpdGUgIWltcG9ydGFudDtcblx0dGV4dC1kZWNvcmF0aW9uOiB1bmRlcmxpbmU7XG5cdHBhZGRpbmctdG9wOjVweCAhaW1wb3J0YW50OyBwYWRkaW5nLWJvdHRvbTo1cHggIWltcG9ydGFudDtcbn1cblxuQGZvbnQtZmFjZSB7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlUmVndWxhcjtcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9BQmVlWmVlLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IEFCZWVaZWVJdGFsaWM7XG4gIHNyYzogdXJsKCcuLi8uLi9hc3NldHMvZm9udHMvQUJlZVplZS1JdGFsaWMudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG5AZm9udC1mYWNlIHtcbiAgZm9udC1mYW1pbHk6IExhdG9Cb2xkO1xuICBzcmM6IHVybCgnLi4vLi4vYXNzZXRzL2ZvbnRzL0xhdG8tQm9sZC50dGYnKSBmb3JtYXQoJ3RydWV0eXBlJyk7XG59XG5cbkBmb250LWZhY2Uge1xuICBmb250LWZhbWlseTogTGF0bztcbiAgc3JjOiB1cmwoJy4uLy4uL2Fzc2V0cy9mb250cy9MYXRvLVJlZ3VsYXIudHRmJykgZm9ybWF0KCd0cnVldHlwZScpO1xufVxuXG50ZXh0YXJlYVxue1xuICBib3JkZXI6MXB4IHNvbGlkICM5OTk5OTk7XG4gIHdpZHRoOjEwMCU7XG4gIG1hcmdpbjo1cHggMDtcbiAgcGFkZGluZzozcHg7XG4gIGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG4qIHtcblx0Zm9udC1zaXplOiAxMDAlO1xuXHRmb250LWZhbWlseTogQUJlZVplZVJlZ3VsYXIsIHNhbnMtc2VyaWYgO1xufVxuXG5oMiB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0b0JvbGQsIHNhbnMtc2VyaWYgO1xufVxuXG5oMyB7XG5cdGNvbG9yOiMzMzg1ZmY7XG5cdGZvbnQtc2l6ZToyMDAlO1xuXHRmb250LWZhbWlseTogTGF0bywgc2Fucy1zZXJpZiA7XG5cdHRleHQtZGVjb3JhdGlvbjogdW5kZXJsaW5lO1xufVxuXG5pbnB1dCB7XG5cdGZvbnQtZmFtaWx5OiBBQmVlWmVlSXRhbGljLCBzYW5zLXNlcmlmIDtcdFxufVxuXG5zZWxlY3Qge1xuXHRmb250LWZhbWlseTogQUJlZVplZUl0YWxpYywgc2Fucy1zZXJpZiA7XHRcbn1cblxuIl19 */"

/***/ }),

/***/ "./src/app/revisionqueja/revisionqueja.component.ts":
/*!**********************************************************!*\
  !*** ./src/app/revisionqueja/revisionqueja.component.ts ***!
  \**********************************************************/
/*! exports provided: RevisionquejaComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RevisionquejaComponent", function() { return RevisionquejaComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _shared_revisionquejas_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/revisionquejas.service */ "./src/app/shared/revisionquejas.service.ts");
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");






var RevisionquejaComponent = /** @class */ (function () {
    //operation = new Subject<Quejaini>();
    //constructor() { }
    function RevisionquejaComponent(router, dialog, revisionQuejasService) {
        this.router = router;
        this.dialog = dialog;
        this.revisionQuejasService = revisionQuejasService;
        this.success = false;
        this.successFile = true;
        this.pnoQueja = "";
    }
    RevisionquejaComponent.prototype.ngOnDestroy = function () {
    };
    RevisionquejaComponent.prototype.ngOnInit = function () {
        this.initrevisionQuejaForm();
    };
    RevisionquejaComponent.prototype.initrevisionQuejaForm = function () {
        this.revisionQuejaForm = new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormGroup"]({
            'noQueja': new _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormControl"]('', _angular_forms__WEBPACK_IMPORTED_MODULE_2__["Validators"].required),
        });
    };
    RevisionquejaComponent.prototype.onSubmit = function () {
        var _this = this;
        if (this.revisionQuejaForm.valid) {
            this.pnoQueja = this.revisionQuejaForm.value.noQueja;
            this.onDocumentoChanged();
            this.revisionQuejasService.fetchData(this.revisionQuejaForm.value.noQueja).subscribe(function (response) {
                //console.log(response);
                if (response.value) {
                    // inicializar formulario con valores predeterminados
                    _this.quejas = response.value;
                    //console.log(response.value);
                    //console.log(this.quejas);
                }
            });
        }
    };
    RevisionquejaComponent.prototype.onDismissClicked = function () {
        this.success = false;
        this.initrevisionQuejaForm();
    };
    RevisionquejaComponent.prototype.onDocumentoChanged = function () {
        this.quejas = null;
    };
    RevisionquejaComponent.prototype.openCustomDialog = function () {
        //console.log("this.customDialogForm.value");
        this.success = false;
    };
    RevisionquejaComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-revisionqueja',
            template: __webpack_require__(/*! ./revisionqueja.component.html */ "./src/app/revisionqueja/revisionqueja.component.html"),
            styles: [__webpack_require__(/*! ./revisionqueja.component.scss */ "./src/app/revisionqueja/revisionqueja.component.scss")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_3__["Router"],
            _angular_material__WEBPACK_IMPORTED_MODULE_5__["MatDialog"],
            _shared_revisionquejas_service__WEBPACK_IMPORTED_MODULE_4__["RevisionQuejasService"]])
    ], RevisionquejaComponent);
    return RevisionquejaComponent;
}());



/***/ }),

/***/ "./src/app/shared/actividades-economicas.service.ts":
/*!**********************************************************!*\
  !*** ./src/app/shared/actividades-economicas.service.ts ***!
  \**********************************************************/
/*! exports provided: ActividadesEconomicasService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ActividadesEconomicasService", function() { return ActividadesEconomicasService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var ActividadesEconomicasService = /** @class */ (function () {
    function ActividadesEconomicasService(http) {
        this.http = http;
    }
    ActividadesEconomicasService.prototype.fetchData = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'actividades-economicas');
    };
    ActividadesEconomicasService.prototype.fetchTiposComercio = function (idActividadEconomica) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'actividades-economicas/' + idActividadEconomica + '/tipos-comercio');
    };
    ActividadesEconomicasService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], ActividadesEconomicasService);
    return ActividadesEconomicasService;
}());



/***/ }),

/***/ "./src/app/shared/confirmacion.ts":
/*!****************************************!*\
  !*** ./src/app/shared/confirmacion.ts ***!
  \****************************************/
/*! exports provided: Confirmacion */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Confirmacion", function() { return Confirmacion; });
var Confirmacion = /** @class */ (function () {
    function Confirmacion() {
    }
    return Confirmacion;
}());



/***/ }),

/***/ "./src/app/shared/consumidor.model.ts":
/*!********************************************!*\
  !*** ./src/app/shared/consumidor.model.ts ***!
  \********************************************/
/*! exports provided: Consumidor */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Consumidor", function() { return Consumidor; });
var Consumidor = /** @class */ (function () {
    function Consumidor() {
    }
    return Consumidor;
}());



/***/ }),

/***/ "./src/app/shared/consumidores.service.ts":
/*!************************************************!*\
  !*** ./src/app/shared/consumidores.service.ts ***!
  \************************************************/
/*! exports provided: ConsumidoresService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ConsumidoresService", function() { return ConsumidoresService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");






//import { ConsoleReporter } from 'jasmine';
var ConsumidoresService = /** @class */ (function () {
    function ConsumidoresService(http) {
        this.http = http;
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.operationc = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.operationp = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.httpOptions = {
            headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpHeaders"]({
                'content-type': 'application/json; charset=iso-8859-1',
            })
        };
    }
    ConsumidoresService.prototype.createConsumidor = function (consumidor) {
        var _this = this;
        this.saveData(consumidor).subscribe(function (response) {
            _this.operation.next(response.value);
        });
    };
    ConsumidoresService.prototype.fetchData = function (tipo, docid) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'consumidores/' + tipo + '?docid=' + docid);
    };
    ConsumidoresService.prototype.fetchDataI = function (docid) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'consumidores?docid=' + docid);
    };
    ConsumidoresService.prototype.saveData = function (consumidor) {
        //let headers = new HttpHeaders().set('Access-Control-Allow-Origin','*'); //AÑADIDO
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'consumidores', consumidor); //AÑADIDO tercer parámetro, {headers: headers}
        /* return this.http.post<any>(BASE_URL_REST_FILE2 + 'consumidores', consumidor, this.httpOptions).pipe(
            tap((item) => console.log('Guardando consumidor')), catchError(this.handleError<any>('error en grabar '))
        ); */
    };
    /* EJEMPLO::::  saveData(queja: Quejaini, id: string) {
        return this.http.post<any>(BASE_URL_REST_FILE2 + 'quejasini'+id, queja, this.httpOptions).pipe(
            tap((item) => console.log('grabada la queja prueba')),catchError(this.handleError<any>('error en grabar '))
        );
      } */
    ConsumidoresService.prototype.fetchDataByTokenConsumidor = function (id) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'consumidores/consumidor?id=' + id;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    ConsumidoresService.prototype.handleError = function (operation, result) {
        if (operation === void 0) { operation = 'operation'; }
        return function (error) {
            // TODO: send the error to remote logging infrastructure
            //console.error(error); // log to //console instead
            // TODO: better job of transforming error for user consumption
            //console.log('${operation} failed: ${error.message}');
            // Let the app keep running by returning an empty result.
            return Object(rxjs__WEBPACK_IMPORTED_MODULE_3__["of"])(result);
        };
    };
    ConsumidoresService.prototype.createCP = function (consumidor, proveedor, tipo) {
        var _this = this;
        if (tipo == 1) {
            this.saveDataC(consumidor).subscribe(function (response) {
                _this.operationc.next(response.value);
            });
        }
        else {
            this.saveDataP(proveedor).subscribe(function (response) {
                _this.operationp.next(response.value);
            });
        }
    };
    ConsumidoresService.prototype.saveDataC = function (consumidor) {
        //    return this.http.post<ResponseRs>(BASE_URL_REST_FILE2 + 'consumidores/ins_not_elect', consumidor);
        //}
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'consumidores/ins_not_elect', consumidor, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('consumidor actualizado'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('error en actualizar')));
    };
    ConsumidoresService.prototype.saveDataP = function (proveedor) {
        //  return this.http.post<ResponseRs>(BASE_URL_REST_FILE2 + 'proveedores/ins_not_elect', proveedor);
        //}
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/ins_not_elect', proveedor, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('proveedor actualizado'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('error en actualizar')));
    };
    ConsumidoresService.prototype.saveDataCP = function (url, id, tipo) {
        //  return this.http.post<ResponseRs>(BASE_URL_REST_FILE2 + 'proveedores/ins_not_elect', proveedor);
        //}
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + url, this.ObjaJSON_add(tipo, id), this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('proveedor actualizado'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('error en actualizar')));
    };
    ConsumidoresService.prototype.ObjaJSON_add = function (tipo, id) {
        if (tipo == 1) {
            var locarrayc = { idConsumidor: id };
            return JSON.stringify(locarrayc);
        }
        else {
            var locarrayp = { idProveedor: id };
            return JSON.stringify(locarrayp);
        }
    };
    ConsumidoresService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClient"]])
    ], ConsumidoresService);
    return ConsumidoresService;
}());



/***/ }),

/***/ "./src/app/shared/departamentos.service.ts":
/*!*************************************************!*\
  !*** ./src/app/shared/departamentos.service.ts ***!
  \*************************************************/
/*! exports provided: DepartamentosService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DepartamentosService", function() { return DepartamentosService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var DepartamentosService = /** @class */ (function () {
    function DepartamentosService(http) {
        this.http = http;
    }
    DepartamentosService.prototype.fetchData = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'departamentos');
    };
    DepartamentosService.prototype.fetchMunicipios = function (codigoDepartamento) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'departamentos/' + codigoDepartamento + '/municipios');
    };
    DepartamentosService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], DepartamentosService);
    return DepartamentosService;
}());



/***/ }),

/***/ "./src/app/shared/etnias.service.ts":
/*!******************************************!*\
  !*** ./src/app/shared/etnias.service.ts ***!
  \******************************************/
/*! exports provided: EtniasService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EtniasService", function() { return EtniasService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var EtniasService = /** @class */ (function () {
    function EtniasService(http) {
        this.http = http;
    }
    EtniasService.prototype.fetchData = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'etnias');
    };
    EtniasService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], EtniasService);
    return EtniasService;
}());



/***/ }),

/***/ "./src/app/shared/motivos-queja.service.ts":
/*!*************************************************!*\
  !*** ./src/app/shared/motivos-queja.service.ts ***!
  \*************************************************/
/*! exports provided: MotivosQuejaService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MotivosQuejaService", function() { return MotivosQuejaService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var MotivosQuejaService = /** @class */ (function () {
    function MotivosQuejaService(http) {
        this.http = http;
    }
    MotivosQuejaService.prototype.fetchData = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'motivos-queja');
    };
    MotivosQuejaService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], MotivosQuejaService);
    return MotivosQuejaService;
}());



/***/ }),

/***/ "./src/app/shared/municipios.service.ts":
/*!**********************************************!*\
  !*** ./src/app/shared/municipios.service.ts ***!
  \**********************************************/
/*! exports provided: MunicipiosService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "MunicipiosService", function() { return MunicipiosService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var MunicipiosService = /** @class */ (function () {
    function MunicipiosService(http) {
        this.http = http;
    }
    MunicipiosService.prototype.fetchSedes = function (codigoMunicipio) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'municipios/' + codigoMunicipio + '/sedes');
    };
    MunicipiosService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], MunicipiosService);
    return MunicipiosService;
}());



/***/ }),

/***/ "./src/app/shared/paises.service.ts":
/*!******************************************!*\
  !*** ./src/app/shared/paises.service.ts ***!
  \******************************************/
/*! exports provided: PaisesService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PaisesService", function() { return PaisesService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var PaisesService = /** @class */ (function () {
    function PaisesService(http) {
        this.http = http;
    }
    PaisesService.prototype.fetchData = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'paises');
    };
    PaisesService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], PaisesService);
    return PaisesService;
}());



/***/ }),

/***/ "./src/app/shared/proveedor.model.ts":
/*!*******************************************!*\
  !*** ./src/app/shared/proveedor.model.ts ***!
  \*******************************************/
/*! exports provided: Proveedor */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Proveedor", function() { return Proveedor; });
var Proveedor = /** @class */ (function () {
    function Proveedor() {
    }
    return Proveedor;
}());



/***/ }),

/***/ "./src/app/shared/proveedores-comunes.service.ts":
/*!*******************************************************!*\
  !*** ./src/app/shared/proveedores-comunes.service.ts ***!
  \*******************************************************/
/*! exports provided: ProveedoresComunesService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProveedoresComunesService", function() { return ProveedoresComunesService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var ProveedoresComunesService = /** @class */ (function () {
    function ProveedoresComunesService(http) {
        this.http = http;
    }
    ProveedoresComunesService.prototype.fetchData = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'proveedores-comunes');
    };
    ProveedoresComunesService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], ProveedoresComunesService);
    return ProveedoresComunesService;
}());



/***/ }),

/***/ "./src/app/shared/proveedores.service.ts":
/*!***********************************************!*\
  !*** ./src/app/shared/proveedores.service.ts ***!
  \***********************************************/
/*! exports provided: ProveedoresService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProveedoresService", function() { return ProveedoresService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");






var ProveedoresService = /** @class */ (function () {
    function ProveedoresService(http) {
        this.http = http;
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.operations = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
        this.httpOptions = {
            headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpHeaders"]({
                'content-type': 'application/json; charset=iso-8859-1'
            })
        };
    }
    ProveedoresService.prototype.createProveedor = function (proveedor) {
        var _this = this;
        this.saveData(proveedor).subscribe(function (response) {
            _this.operation.next(response.value);
        });
    };
    ProveedoresService.prototype.fetchData = function (nit) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores?nit=' + nit);
    };
    ProveedoresService.prototype.fetchDataId = function (id) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/id?id=' + id);
    };
    ProveedoresService.prototype.saveData = function (proveedor) {
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores', proveedor);
    };
    ProveedoresService.prototype.saveDataPCV = function (proveedor) {
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/aprobar', proveedor, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('grabada la proveedor'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('error en grabar ')));
    };
    ProveedoresService.prototype.confirmarCorreoProveedor = function (confirmacion) {
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/confirmarproveedor', confirmacion, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('confirmando el proveedor'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('error en confirmacion ')));
    };
    ProveedoresService.prototype.createSucursal = function (sucursal) {
        var _this = this;
        this.createSucursal2(sucursal).subscribe(function (response) {
            _this.operations.next(response.value);
        });
    };
    ProveedoresService.prototype.createSucursal2 = function (sucursal) {
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/sucursales', sucursal);
        //return this.http.post<any>(BASE_URL_REST_FILE2 + 'proveedores/sucursales', sucursal, this.httpOptions).pipe(
        //	tap((item) => console.log('grabada la sucursales')),catchError(this.handleError<any>('error en grabar '))
        //);
    };
    ProveedoresService.prototype.fetchDataByWsProveedor = function (pnit) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));		
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/aprobar?nit=' + pnit;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    ProveedoresService.prototype.fetchDataByTokenProveedor = function (id) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/proveedor?id=' + id;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    ProveedoresService.prototype.handleError = function (operation, result) {
        if (operation === void 0) { operation = 'operation'; }
        return function (error) {
            // TODO: send the error to remote logging infrastructure
            //console.error(error); // log to //console instead
            // TODO: better job of transforming error for user consumption
            //console.log('${operation} failed: ${error.message}');
            // Let the app keep running by returning an empty result.
            return Object(rxjs__WEBPACK_IMPORTED_MODULE_3__["of"])(result);
        };
    };
    ProveedoresService.prototype.fetchDataSucursal = function (pnit) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/sucursales/' + pnit;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    ProveedoresService.prototype.fetchSucursalProveedor = function (id) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        //var localURL=BASE_URL_REST_FILE2 + 'quejasini/'+id;
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/sucursales/id/' + id;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    ProveedoresService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClient"]])
    ], ProveedoresService);
    return ProveedoresService;
}());



/***/ }),

/***/ "./src/app/shared/proveedorpcv.model.ts":
/*!**********************************************!*\
  !*** ./src/app/shared/proveedorpcv.model.ts ***!
  \**********************************************/
/*! exports provided: Proveedorpcv */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Proveedorpcv", function() { return Proveedorpcv; });
var Proveedorpcv = /** @class */ (function () {
    function Proveedorpcv() {
    }
    return Proveedorpcv;
}());



/***/ }),

/***/ "./src/app/shared/queja.model.ts":
/*!***************************************!*\
  !*** ./src/app/shared/queja.model.ts ***!
  \***************************************/
/*! exports provided: Queja */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Queja", function() { return Queja; });
var Queja = /** @class */ (function () {
    function Queja() {
    }
    return Queja;
}());



/***/ }),

/***/ "./src/app/shared/quejaini.model.ts":
/*!******************************************!*\
  !*** ./src/app/shared/quejaini.model.ts ***!
  \******************************************/
/*! exports provided: Quejaini */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Quejaini", function() { return Quejaini; });
var Quejaini = /** @class */ (function () {
    function Quejaini() {
    }
    return Quejaini;
}());



/***/ }),

/***/ "./src/app/shared/quejas.service.ts":
/*!******************************************!*\
  !*** ./src/app/shared/quejas.service.ts ***!
  \******************************************/
/*! exports provided: QuejasService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "QuejasService", function() { return QuejasService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var _queja_model__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./queja.model */ "./src/app/shared/queja.model.ts");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");







var QuejasService = /** @class */ (function () {
    function QuejasService(http) {
        this.http = http;
        this.vexisteConsumidor = '0';
        this.vexisteProveedor = '0';
        this.vexisteQueja = '0';
        this.httpOptions = {
            headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_5__["HttpHeaders"]({
                'content-type': 'application/json; charset=iso-8859-1'
            })
        };
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_4__["Subject"]();
    }
    QuejasService.prototype.initQuejat = function (quejap) {
        this.quejat = new _queja_model__WEBPACK_IMPORTED_MODULE_3__["Queja"]();
        //console.info("servicio ",quejap['idQueja']);
        //consumidor.idConsumidor = response.value.idConsumidor;
        //proveedor.idProveedor = response.value.idProveedor;
        this.quejat.idQueja = quejap.idQueja;
        this.quejat.idConsumidor = quejap.idConsumidor;
        this.quejat.idProveedor = quejap.idProveedor;
        this.quejat.idEstadoQueja = quejap.idEstadoQueja;
        //this.quejat.idSubActividadEconomica: number;
        this.quejat.facturaNumero = quejap.facturaNumero;
        this.quejat.fechaFactura = quejap.fechaFactura;
        this.quejat.detalleQueja = quejap.detalleQueja;
        this.quejat.solicitaQue = quejap.solicitaQue;
        //this.quejat.procedeQueja: string;
        //this.quejat.razonNoProcede: string;
        //this.quejat.datosVerificados: string;
        this.quejat.fechaQueja = quejap.fechaQueja;
        //this.quejat.motivo: string;
        this.quejat.idDepartamento = quejap.idDepartamento;
        this.quejat.idMunicipio = quejap.idMunicipio;
        this.quejat.usuarioAsignado = quejap.usuarioAsignado;
        this.quejat.idDiacoSede = quejap.idDiacoSede;
        this.quejat.anio = quejap.anio;
        this.quejat.noQueja = quejap.noQueja;
        this.quejat.fechaFactura_ = quejap.fechaFactura_;
        //datos no modificables
        this.quejat.idEstadoQueja = quejap.idEstadoQueja;
        this.quejat.idSubActividadEconomica = quejap.idSubActividadEconomica;
        this.quejat.procedeQueja = quejap.procedeQueja;
        this.quejat.razonNoProcede = quejap.razonNoProcede;
        this.quejat.datosVerificados = quejap.datosVerificados;
        this.quejat.fechaQueja = quejap.fechaQueja;
        this.quejat.motivo = quejap.motivo;
        this.quejat.idDepartamento = quejap.idDepartamento;
        this.quejat.idMunicipio = quejap.idMunicipio;
        this.quejat.usuarioAsignado = quejap.usuarioAsignado;
        this.quejat.idDiacoSede = quejap.idDiacoSede;
        this.quejat.fuente = quejap.fuente;
        this.quejat.idfuente = quejap.idfuente;
        this.quejat.ubicacion = quejap.ubicacion;
        this.quejat.documentado = quejap.documentado;
        this.quejat.expiradomail = quejap.expiradomail;
        this.quejat.flagalerta = quejap.flagalerta;
        //direccion  de  proveedor
        this.quejat.direccionProveedor = quejap.direccionProveedor;
        this.quejat.idDepartamentoProveedor = quejap.idDepartamentoProveedor;
        this.quejat.idMunicipioProveedor = quejap.idMunicipioProveedor;
        this.quejat.idEstablecimiento = quejap.idEstablecimiento;
        this.quejat.zonaProveedor = quejap.zonaProveedor;
        if (quejap.idQueja != null || quejap.idQueja != undefined) {
            this.vexisteQueja = '1';
        }
    };
    /*
    createQueja(queja: Queja, uploader: FileUploader) {
      this.saveData(queja).subscribe(
        (response) => {
          this.vanio = response.value.anio;
          this.vsecanio = response.value.secuencia;
          this.vidqueja = response.value.idQueja;
          this.vidqueja = response.value.idQueja;
          if (uploader.queue.length > 0) {
            uploader.setOptions({
              url: BASE_URL_REST_FILE2_ + 'quejas/upload',
              itemAlias: 'file'
            });
            uploader.onCompleteAll = () => {
              // finalizo la carga de todos los archivos
              this.operation.next(response.value);
              this.vanio = response.value.anio;
          this.vsecanio = response.value.secuencia;
          this.vidqueja = response.value.idQueja;
            };
            uploader.onCompleteItem = (item, uploadResponse, status, headers) => {
              // finalizo la carga de un archivo
            };

            uploader.uploadAll();
          } else {
            this.operation.next(response.value);
              this.vanio = response.value.anio;
              this.vsecanio = response.value.secuencia;
              this.vidqueja = response.value.idQueja;
          }
        }
      );
    }
  */
    /*
      saveData1(queja: Queja) {
        return this.http.post<ResponseRs>(BASE_URL_REST_FILE2_ + 'quejas', queja);
      }*/
    QuejasService.prototype.saveData = function (queja) {
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejas', queja, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["tap"])(function (item) { return console.log('asignacion 1'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["catchError"])(this.handleError('error en grabar ')));
    };
    QuejasService.prototype.dynamicAssignment = function (queja) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_DYNAMIC_ASSIGNMENT"] + queja.idQueja, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["tap"])(function (item) { return console.log('Asignacion Automatica correcta', queja.idQueja, item); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["catchError"])(this.handleError('no se pudo asignar')));
    };
    // this.http.post<any>(BASE_URL_DYNAMIC_ASSIGNMENT,)
    // saveData(queja: Queja) {
    // 	return this.http.post<any>(BASE_URL_REST_FILE2 + 'quejas', queja, this.httpOptions).pipe(
    // 		tap((item) => console.log('grabada la queja')), catchError(this.handleError<any>('error en grabar '))
    // 	);
    // }
    //
    QuejasService.prototype.handleError = function (operation, result) {
        if (operation === void 0) { operation = 'operation'; }
        return function (error) {
            // TODO: send the error to remote logging infrastructure
            //console.error(error); // log to //console instead
            // TODO: better job of transforming error for user consumption
            //console.log('${operation} failed: ${error.message}');
            // Let the app keep running by returning an empty result.
            return Object(rxjs__WEBPACK_IMPORTED_MODULE_4__["of"])(result);
        };
    };
    /*
      fetchDataByToken(id: string,dato: string) {
      return this.http.get<ResponseRs>(BASE_URL_REST_FILE2 + 'quejasini/quejacon/'+dato+'/'+id);
    }*/
    QuejasService.prototype.fetchDataByToken = function (id, dato) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/quejacon/' + dato + '/' + id;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["catchError"])(this.handleError('Add Data')));
    };
    QuejasService.prototype.fetchDataQuejaById = function (dato, token, idqueja) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        //var localURL=BASE_URL_REST_FILE2 + 'quejasini/'+id;
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/quejacon/' + dato + '/' + token + '?queja=' + idqueja;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["catchError"])(this.handleError('Add Data')));
    };
    QuejasService.prototype.fetchSucursalProveedor = function (id) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        //var localURL=BASE_URL_REST_FILE2 + 'quejasini/'+id;
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'proveedores/sucursales/id/' + id;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["catchError"])(this.handleError('Add Data')));
    };
    QuejasService.prototype.getfilesUpload = function (id) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        //var localURL=BASE_URL_REST_FILE2 + 'quejasini/'+id;
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/archivos/' + id;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["catchError"])(this.handleError('Add Data')));
    };
    QuejasService.prototype.getfile = function (id, categoria) {
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/download/' + id + '/' + categoria;
        //console.log(localURL);
        return this.http.get(localURL, { responseType: 'blob' });
    };
    //graba datos para imprimir la queja
    QuejasService.prototype.add_FormQueja = function (idqueja, iduser, idtoken) {
        var LocalURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_EXTER"] + 'tipos-registros/form_queja';
        return this.http.post(LocalURL, this.ObjaJSON_add(idqueja, iduser, this.vid), this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["tap"])(function (item) { return console.log('Registro Guardado'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_6__["catchError"])(this.handleError('Registro Guardado')));
    };
    QuejasService.prototype.ObjaJSON_add = function (idqueja, iduser, idtoken) {
        var locarray = { id_queja: idqueja, creado_por: iduser, token: this.vid };
        return JSON.stringify(locarray);
    };
    //servicio para obtener el pdf de la queja
    QuejasService.prototype.getFormularioQuejaRegistro = function (id, idtoken) {
        //console.log('entro al service de getFormularioQuejaRegistro ');
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_EXTER"] + 'registros-queja/form-queja/' + id + '/' + this.vid;
        console.log(localURL);
        return this.http.get(localURL, { responseType: 'blob' }
        //,this.httpOptionsFile
        );
    };
    QuejasService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_5__["HttpClient"]])
    ], QuejasService);
    return QuejasService;
}());



/***/ }),

/***/ "./src/app/shared/quejasini.service.ts":
/*!*********************************************!*\
  !*** ./src/app/shared/quejasini.service.ts ***!
  \*********************************************/
/*! exports provided: QuejasIniService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "QuejasIniService", function() { return QuejasIniService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");






var QuejasIniService = /** @class */ (function () {
    function QuejasIniService(http) {
        this.http = http;
        this.httpOptions = {
            headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpHeaders"]({
                'content-type': 'application/json; charset=iso-8859-1'
            })
        };
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
    }
    QuejasIniService.prototype.createQueja = function (queja, uploader) {
        return this.saveData(queja, '').subscribe(function (retvalue) {
            //console.info('-------------------');
            //console.info(retvalue);
            //console.info('-------------------');
            if (retvalue) {
                var tempstr = retvalue['value'];
                if (tempstr != null && tempstr != '') {
                    //console.log('llego');
                }
                else {
                    //console.log('no llego');
                }
            }
            else {
                //console.log('Rest service response ERROR.');
            }
            if (uploader.queue.length > 0) {
                uploader.setOptions({
                    url: _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/upload',
                    itemAlias: 'file'
                });
                uploader.onCompleteAll = function () {
                    // finalizo la carga de todos los archivos
                    // this.operation.next(response.value);
                };
                uploader.onCompleteItem = function (item, uploadResponse, status, headers) {
                    // finalizo la carga de un archivo
                };
                uploader.uploadAll();
            }
            else {
                //this.operation.next(response.value);
            }
        });
        //this.fetchDataSecId(queja.idFlujo);
    };
    QuejasIniService.prototype.saveData = function (queja, id) {
        return this.http.post(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini' + id, queja, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('grabada la queja prueba'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('error en grabar ')));
    };
    QuejasIniService.prototype.fetchDataSecId = function (id) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/secuencia/' + id);
    };
    QuejasIniService.prototype.fetchDataSecuencia = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/secuencia');
    };
    /*
      fetchDataByToken(id: string,dato: string) {
        return this.http.get<ResponseRs>(BASE_URL_REST_FILE2_ + 'quejasini/quejacon/'+dato+'/'+id);
      }
    */
    QuejasIniService.prototype.fetchDataFact = function (proveedor) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini?proveedor=' + proveedor);
    };
    QuejasIniService.prototype.handleError = function (operation, result) {
        if (operation === void 0) { operation = 'operation'; }
        return function (error) {
            // TODO: send the error to remote logging infrastructure
            //console.error(error); // log to //console instead
            // TODO: better job of transforming error for user consumption
            //console.log('${operation} failed: ${error.message}');
            // Let the app keep running by returning an empty result.
            return Object(rxjs__WEBPACK_IMPORTED_MODULE_3__["of"])(result);
        };
    };
    QuejasIniService.prototype.fetchDataByToken = function (id, dato) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/quejacon/' + dato + '/' + id;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    QuejasIniService.prototype.fetchDataQuejaById = function (dato, token, idqueja) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        //var localURL=BASE_URL_REST_FILE2 + 'quejasini/'+id;
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/quejacon/' + dato + '/' + token + '?queja=' + idqueja;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    QuejasIniService.prototype.fetchQuejaByLinkMagic = function (dato, token, idqueja) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        //var localURL=BASE_URL_REST_FILE2 + 'quejasini/'+id;
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/quejacon/' + dato + '/' + token + '?queja=' + idqueja;
        return this.http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Add Data')));
    };
    //graba datos para imprimir la queja
    QuejasIniService.prototype.add_FormQueja = function (idqueja, iduser, idtoken) {
        var LocalURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_EXTER"] + 'tipos-registros/form_queja';
        return this.http.post(LocalURL, this.ObjaJSON_add(idqueja, iduser, idtoken), this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Registro Guardado'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Registro Guardado')));
    };
    QuejasIniService.prototype.ObjaJSON_add = function (idqueja, iduser, idtoken) {
        var locarray = { id_queja: idqueja, creado_por: iduser, token: idtoken };
        return JSON.stringify(locarray);
    };
    //servicio para obtener el pdf de la queja
    QuejasIniService.prototype.getFormularioQuejaRegistro = function (id, idtoken) {
        //console.log('entro al service de getFormularioQuejaRegistro ');
        var localURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_EXTER"] + 'registros-queja/form-queja/' + id + '/' + idtoken;
        console.log(localURL);
        return this.http.get(localURL, { responseType: 'blob' }
        //,this.httpOptionsFile
        );
    };
    //graba datos para actualizar la queja
    QuejasIniService.prototype.add_FormQuejaUpdate = function (_idQueja, _resp, _xqueja, _xsolicitud, _xubicacion, _varchivos, _vdatos, _vdato) {
        var LocalURL = _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejasini/updatequejacon';
        return this.http.post(LocalURL, this.ObjaJSON_update(_idQueja, _resp, _xqueja, _xsolicitud, _xubicacion, _varchivos, _vdatos, _vdato), this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["tap"])(function (item) { return console.log('Registro Guardado'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_5__["catchError"])(this.handleError('Registro Guardado')));
    };
    QuejasIniService.prototype.ObjaJSON_update = function (_idQueja, _resp, _xqueja, _xsolicitud, _xubicacion, _varchivos, _vdatos, _vdato) {
        var locarray = { idQueja: _idQueja, resp: _resp, xqueja: _xqueja, xsolicitud: _xsolicitud, xubicacion: _xubicacion, varchivos: _varchivos, vdatos: _vdatos, token: _vdato };
        return JSON.stringify(locarray);
    };
    QuejasIniService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClient"]])
    ], QuejasIniService);
    return QuejasIniService;
}());



/***/ }),

/***/ "./src/app/shared/revisionquejas.service.ts":
/*!**************************************************!*\
  !*** ./src/app/shared/revisionquejas.service.ts ***!
  \**************************************************/
/*! exports provided: RevisionQuejasService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RevisionQuejasService", function() { return RevisionQuejasService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");





var RevisionQuejasService = /** @class */ (function () {
    function RevisionQuejasService(http) {
        this.http = http;
        this.httpOptions = {
            headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpHeaders"]({
                'content-type': 'application/json; charset=iso-8859-1'
            })
        };
        this.operation = new rxjs__WEBPACK_IMPORTED_MODULE_3__["Subject"]();
    }
    RevisionQuejasService.prototype.fetchData = function (noqueja) {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_2__["BASE_URL_REST_FILE2"] + 'quejas/' + noqueja);
    };
    RevisionQuejasService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClient"]])
    ], RevisionQuejasService);
    return RevisionQuejasService;
}());



/***/ }),

/***/ "./src/app/shared/sedes.service.ts":
/*!*****************************************!*\
  !*** ./src/app/shared/sedes.service.ts ***!
  \*****************************************/
/*! exports provided: SedesService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SedesService", function() { return SedesService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _conc_virt_const__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../conc-virt-const */ "./src/app/conc-virt-const.ts");




var SedesService = /** @class */ (function () {
    function SedesService(http) {
        this.http = http;
    }
    SedesService.prototype.fetchData = function () {
        return this.http.get(_conc_virt_const__WEBPACK_IMPORTED_MODULE_3__["BASE_URL_REST_FILE2"] + 'sedes');
    };
    SedesService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], SedesService);
    return SedesService;
}());



/***/ }),

/***/ "./src/app/shared/seguridad.service.ts":
/*!*********************************************!*\
  !*** ./src/app/shared/seguridad.service.ts ***!
  \*********************************************/
/*! exports provided: SeguridadService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SeguridadService", function() { return SeguridadService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
/* harmony import */ var _atencion_consumidor_const__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../atencion-consumidor-const */ "./src/app/atencion-consumidor-const.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _submit_form_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./submit-form.service */ "./src/app/shared/submit-form.service.ts");








var SeguridadService = /** @class */ (function () {
    function SeguridadService(_http, router, _submitFormService) {
        this._http = _http;
        this.router = router;
        this._submitFormService = _submitFormService;
        this.baseUrl = _atencion_consumidor_const__WEBPACK_IMPORTED_MODULE_5__["BASE_URL_REST"] + 'users';
        this.httpOptions = {
            headers: new _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpHeaders"]({
                'content-type': 'application/json; charset=iso-8859-1'
            })
        };
    }
    SeguridadService.prototype.extractData = function (res) {
        var body = res;
        return body || {};
    };
    SeguridadService.prototype.handleError = function (operation, result) {
        if (operation === void 0) { operation = 'operation'; }
        return function (error) {
            console.error(error); // log to console instead
            console.log('${operation} failed: ${error.message}');
            return Object(rxjs__WEBPACK_IMPORTED_MODULE_3__["of"])(result);
        };
    };
    SeguridadService.prototype.Login = function (str_username, str_password) {
        //console.log(this.ObjaJSON_usrpass(str_username, str_password));
        var localURL = this.baseUrl + '/login';
        return this._http.post(localURL, this.ObjaJSON_usrpass(str_username, str_password), this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["catchError"])(this.handleError('Add Data')));
    };
    SeguridadService.prototype.Logout = function (token) {
        this._submitFormService.Limpiar();
        //console.log(this.ObjaJSON_token(token));
        var localURL = this.baseUrl + '/logout';
        return this._http.post(localURL, this.ObjaJSON_token(token), this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["catchError"])(this.handleError('Add Data')));
    };
    SeguridadService.prototype.VerifyToken = function (token) {
        //console.log(this.ObjaJSON_token(token));
        var localURL = this.baseUrl + '/token';
        return this._http.post(localURL, this.ObjaJSON_token(token), this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["tap"])(function (item) { return console.log('Added item'); }), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["catchError"])(this.handleError('Add Data')));
    };
    SeguridadService.prototype.EmailPassword = function (email) {
        var localURL = this.baseUrl + '/emailr/' + email;
        console.log(localURL);
        return this._http.get(localURL, this.httpOptions).pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_4__["map"])(this.extractData));
    };
    SeguridadService.prototype.ObjaJSON_usrpass = function (str_username, str_password) {
        var locarray = { username: this.TrimandCut(str_username, 100), password: str_password };
        return JSON.stringify(locarray);
    };
    SeguridadService.prototype.ObjaJSON_token = function (token) {
        var locarray = { token: token };
        return JSON.stringify(locarray);
    };
    SeguridadService.prototype.TrimandCut = function (string, maxlen) {
        string = string.trim();
        if (string.length > maxlen)
            string = string.substring(0, maxlen);
        return string;
    };
    SeguridadService.prototype.SesionVencida = function () {
        alert('Su sesión ha vencido, se va a cargar la página de ingreso.');
        this._submitFormService.Limpiar();
        this.router.navigate(['/Login']);
    };
    SeguridadService.prototype.RedireccionarLogin = function () {
        this._submitFormService.Limpiar();
        this.router.navigate(['/Login']);
    };
    SeguridadService.prototype.EditableporFlujo = function (flujo, estado) {
        if (flujo == 1) {
            if (estado >= 101 && estado <= 106)
                return true;
        }
        else if (flujo == 6) {
            if (estado == 601)
                return true;
        }
        else if (flujo == 3) {
            if (estado >= 301 && estado <= 303)
                return true;
        }
        return false;
    };
    SeguridadService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"], _angular_router__WEBPACK_IMPORTED_MODULE_6__["Router"], _submit_form_service__WEBPACK_IMPORTED_MODULE_7__["SubmitFormService"]])
    ], SeguridadService);
    return SeguridadService;
}());



/***/ }),

/***/ "./src/app/shared/soap.service.ts":
/*!****************************************!*\
  !*** ./src/app/shared/soap.service.ts ***!
  \****************************************/
/*! exports provided: SoapService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SoapService", function() { return SoapService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");



var SoapService = /** @class */ (function () {
    // subject: Subject<any> = new Subject();
    function SoapService(http) {
        this.http = http;
    }
    SoapService.prototype.getSoapData = function () {
    };
    // TOCO: In practice, may want to use an HttpInterceptor:
    //       https://angular.io/guide/http#intercepting-requests-and-responses
    //       https://blog.angularindepth.com/the-new-angular-httpclient-api-9e5c85fe3361
    /*
      xmlStringToJson(xml: string)
      {
        // Convert the XML string to an XML Document.
        const oParser = new DOMParser();
        const oDOM = oParser.parseFromString(xml, "application/xml");
        // Convert the XML Document to a JSON Object.
        return this.xmlToJson(oDOM);
      }
      */
    /**
     * REF: https://davidwalsh.name/convert-xml-json
     */
    /*
    xmlToJson(xml)
    {
      // Create the return object
      var obj = {};
  
      if (xml.nodeType == 1) { // element
        // do attributes
        if (xml.attributes.length > 0) {
        obj["@attributes"] = {};
          for (var j = 0; j < xml.attributes.length; j++) {
            var attribute = xml.attributes.item(j);
            obj["@attributes"][attribute.nodeName] = attribute.nodeValue;
          }
        }
      } else if (xml.nodeType == 3) { // text
        obj = xml.nodeValue;
      }
  
      // do children
      if (xml.hasChildNodes()) {
        for(var i = 0; i < xml.childNodes.length; i++) {
          var item = xml.childNodes.item(i);
          var nodeName = item.nodeName;
          if (typeof(obj[nodeName]) == "undefined") {
            obj[nodeName] = this.xmlToJson(item);
          } else {
            if (typeof(obj[nodeName].push) == "undefined") {
              var old = obj[nodeName];
              obj[nodeName] = [];
              obj[nodeName].push(old);
            }
            obj[nodeName].push(this.xmlToJson(item));
          }
        }
      }
      return obj;
    }
  */
    SoapService.prototype.getJsonData = function () {
        return this.http.get('assets/testdata.json');
        /*
        Proper practice:
        this.http.get('./testdata.json')
        .subscribe((data) => {
          this.subject.next(data);
        },
        (err) => {
          console.warn('Erroneous! Error:', err);
        });
        */
    };
    SoapService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])(),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], SoapService);
    return SoapService;
}());



/***/ }),

/***/ "./src/app/shared/submit-form.service.ts":
/*!***********************************************!*\
  !*** ./src/app/shared/submit-form.service.ts ***!
  \***********************************************/
/*! exports provided: SubmitFormService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SubmitFormService", function() { return SubmitFormService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");



var SubmitFormService = /** @class */ (function () {
    function SubmitFormService(router) {
        this.router = router;
        this.Limpiar();
    }
    SubmitFormService.prototype.Limpiar = function () {
        this.srv_username = '';
        this.srv_token = '*';
        this.srv_userid = 0;
        this.srv_atencion_consumidor = 0;
        this.srv_verificacion_vigilancia = 0;
        this.srv_juridico = 0;
        this.srv_conciliacion_virtual = 0;
        this.srv_servicios_publicos = 0;
        this.srv_proveedor = 0;
    };
    SubmitFormService.prototype.SetInitial = function (formsubmit) {
        console.log(formsubmit);
        this.Limpiar();
        this.srv_username = formsubmit['username'];
        this.srv_token = formsubmit['token'];
        this.srv_proveedor = formsubmit['id_proveedor'];
        this.LoadAtCon(formsubmit);
        this.LoadServPub(formsubmit);
        this.LoadVyV(formsubmit);
        this.LoadUserid(formsubmit);
        //redirect
        if (this.srv_proveedor != 0) {
            this.router.navigate(['/consumidor']);
            return true;
        }
        /*
        if(this.srv_atencion_consumidor !=0){
          this.router.navigate(['/mainAtCon']);
          return true;
        }
        else if(this.srv_servicios_publicos !=0){
              this.router.navigate(['/mainServPub']);
              return true;
        }
        else if(this.srv_verificacion_vigilancia !=0){
              this.router.navigate(['/mainVyV']);
              return true;
              
        }*/
        else {
            this.Limpiar();
            return false;
        }
    };
    SubmitFormService.prototype.Get_userid = function () {
        return this.srv_userid;
    };
    SubmitFormService.prototype.Get_username = function () {
        return this.srv_username;
    };
    SubmitFormService.prototype.Get_token = function () {
        return this.srv_token;
    };
    SubmitFormService.prototype.Get_Atencion_Consumidor = function () {
        return this.srv_atencion_consumidor;
    };
    SubmitFormService.prototype.Get_Servicios_Publicos = function () {
        return this.srv_servicios_publicos;
    };
    SubmitFormService.prototype.Get_Verificacion_Vigilancia = function () {
        return this.srv_verificacion_vigilancia;
    };
    SubmitFormService.prototype.LoadUserid = function (formsubmit) {
        this.srv_userid = parseInt(formsubmit['userid'], 10);
        console.log('userid: ', this.srv_userid);
    };
    SubmitFormService.prototype.LoadAtCon = function (formsubmit) {
        /*0-ninguno  1-normal  2-revisor  3-administrador*/
        var str_queja_list = '';
        var i = 0;
        var rol = 0;
        for (var _i = 0, _a = formsubmit['roles']; _i < _a.length; _i++) {
            var thisitem = _a[_i];
            if (thisitem['id_flujo'] == 1) {
                rol = 0;
                if (thisitem['perfil'] == 'Normal') {
                    rol = 1;
                }
                else if (thisitem['perfil'] == 'Revisor') {
                    rol = 2;
                }
                else if (thisitem['perfil'] == 'Administrador') {
                    rol = 3;
                }
                if (this.srv_atencion_consumidor < rol)
                    this.srv_atencion_consumidor = rol;
            }
        }
        console.log('rol at con: ', this.srv_atencion_consumidor);
    };
    SubmitFormService.prototype.LoadServPub = function (formsubmit) {
        /*0-ninguno  1-normal  2-revisor  3-administrador*/
        var str_queja_list = '';
        var i = 0;
        var rol = 0;
        for (var _i = 0, _a = formsubmit['roles']; _i < _a.length; _i++) {
            var thisitem = _a[_i];
            if (thisitem['id_flujo'] == 6) {
                rol = 0;
                if (thisitem['perfil'] == 'Normal') {
                    rol = 1;
                }
                else if (thisitem['perfil'] == 'Revisor') {
                    rol = 2;
                }
                else if (thisitem['perfil'] == 'Administrador') {
                    rol = 3;
                }
                if (this.srv_servicios_publicos < rol)
                    this.srv_servicios_publicos = rol;
            }
        }
        console.log('rol serv pub: ', this.srv_servicios_publicos);
    };
    SubmitFormService.prototype.LoadVyV = function (formsubmit) {
        /*0-ninguno  1-normal  2-revisor  3-administrador*/
        var str_queja_list = '';
        var i = 0;
        var rol = 0;
        for (var _i = 0, _a = formsubmit['roles']; _i < _a.length; _i++) {
            var thisitem = _a[_i];
            if (thisitem['id_flujo'] == 3) {
                rol = 0;
                if (thisitem['perfil'] == 'Normal') {
                    rol = 1;
                }
                else if (thisitem['perfil'] == 'Revisor') {
                    rol = 2;
                }
                else if (thisitem['perfil'] == 'Administrador') {
                    rol = 3;
                }
                if (this.srv_verificacion_vigilancia < rol)
                    this.srv_verificacion_vigilancia = rol;
            }
        }
        console.log('rol v y v: ', this.srv_verificacion_vigilancia);
    };
    SubmitFormService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], SubmitFormService);
    return SubmitFormService;
}());



/***/ }),

/***/ "./src/app/shared/sucursales-nit.model.ts":
/*!************************************************!*\
  !*** ./src/app/shared/sucursales-nit.model.ts ***!
  \************************************************/
/*! exports provided: SucursalesNit */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SucursalesNit", function() { return SucursalesNit; });
var SucursalesNit = /** @class */ (function () {
    function SucursalesNit() {
    }
    return SucursalesNit;
}());



/***/ }),

/***/ "./src/app/shared/usuario.model.ts":
/*!*****************************************!*\
  !*** ./src/app/shared/usuario.model.ts ***!
  \*****************************************/
/*! exports provided: Usuario */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Usuario", function() { return Usuario; });
var Usuario = /** @class */ (function () {
    function Usuario() {
    }
    return Usuario;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
    if (window) {
        window.console.log = function () { };
    }
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! C:\Users\jjaguilal\Documents\DIACO APP\QUEJAS-DIACO\Frontend\dist6\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map