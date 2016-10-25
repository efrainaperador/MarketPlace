'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminCarroCompra', [
  'ngRoute',
  'adminCarroCompra.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/CarroCompra.html', controller: 'CarroCompraCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
