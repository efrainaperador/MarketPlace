'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminDireccion', [
  'ngRoute',
  'adminDireccion.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Direccion.html', controller: 'DireccionCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
