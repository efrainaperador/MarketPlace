'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminComentario', [
  'ngRoute',
  'adminComentario.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Comentario.html', controller: 'ComentarioCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
