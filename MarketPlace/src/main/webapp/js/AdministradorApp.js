'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminAdministrador', [
  'ngRoute',
  'adminAdministrador.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Administrador.html', controller: 'AdministradorCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
