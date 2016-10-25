'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminCategoria', [
  'ngRoute',
  'adminCategoria.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Categoria.html', controller: 'CategoriaCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
