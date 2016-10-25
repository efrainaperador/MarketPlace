'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminTipo_Documento', [
  'ngRoute',
  'adminTipo_Documento.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Tipo_Documento.html', controller: 'Tipo_DocumentoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
