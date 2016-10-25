'use strict';

/* Controllers */
var module = angular.module('adminAdministrador.controllers', []);

module.controller('AdministradorCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
	//listar
	$scope.lista = {};
    $scope.datosFormulario = {};
	$scope.panelEditar = false;
	$scope.listar=function(){
		$http.get('./webresources/Administrador', {})
		    .success(function (data, status, headers, config) {
		        $scope.lista = data;
		    }).error(function (data, status, headers, config) {
		        alert('Error al consultar la informaci\xf3n, por favor intente m�s tarde');
	    });    
	};

	

	$scope.listar();
	//guardar
	$scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
		$scope.nuevoRegistro=true;
    };
    
    $scope.guardar = function () {
		$scope.errores = {};
		var error = false;
		
        if (error)
            return;
        if ($scope.nuevoRegistro) {

            $http.post('./webresources/Administrador', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
				$scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci�n, por favor intente m�s tarde');
            });
        } else {

            $http.put('./webresources/Administrador', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al actualizar la informaci�n, por favor intente m�s tarde');
            });
        }
    };
	$scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

	//editar
	$scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.nuevoRegistro = false;
        $scope.datosFormulario = data;
    };
	//eliminar
	$scope.eliminar = function (data){
		$http.delete('./webresources/Administrador/'+data.id, {})
		    .success(function (data, status, headers, config) {
		        $scope.listar();
		    }).error(function (data, status, headers, config) {
		        alert('Error al eliminar la informaci\xf3n del Estudiante, por favor intente mas tarde');
	    });   
	};
}]);
