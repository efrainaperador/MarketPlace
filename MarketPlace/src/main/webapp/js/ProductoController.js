'use strict';

/* Controllers */
var module = angular.module('adminProducto.controllers', []);

module.controller('ProductoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
	//listar
	$scope.lista = {};
    $scope.datosFormulario = {};
	$scope.panelEditar = false;
	$scope.listar=function(){
		$http.get('./webresources/Producto', {})
		    .success(function (data, status, headers, config) {
		        $scope.lista = data;
		    }).error(function (data, status, headers, config) {
		        alert('Error al consultar la informaci\xf3n, por favor intente m�s tarde');
	    });    
	};

		$scope.listarComentario=function(){
			$http.get('./webresources/Comentario', {})
			    .success(function (data, status, headers, config) {
			        $scope.listaComentario = data;
			    }).error(function (data, status, headers, config) {
			        alert('Error al consultar la informaci\xf3n, por favor intente m�s tarde');
		    });    
		};
		$scope.listarComentario();
			$scope.listarCarroCompra=function(){
			$http.get('./webresources/CarroCompra', {})
			    .success(function (data, status, headers, config) {
			        $scope.listaCarroCompra = data;
			    }).error(function (data, status, headers, config) {
			        alert('Error al consultar la informaci\xf3n, por favor intente m�s tarde');
		    });    
		};
		$scope.listarCarroCompra();
			$scope.listarCategoria=function(){
			$http.get('./webresources/Categoria', {})
			    .success(function (data, status, headers, config) {
			        $scope.listaCategoria = data;
			    }).error(function (data, status, headers, config) {
			        alert('Error al consultar la informaci\xf3n, por favor intente m�s tarde');
		    });    
		};
		$scope.listarCategoria();
		

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

            $http.post('./webresources/Producto', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
				$scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci�n, por favor intente m�s tarde');
            });
        } else {

            $http.put('./webresources/Producto', JSON.stringify($scope.datosFormulario), {}
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
		$http.delete('./webresources/Producto/'+data.id, {})
		    .success(function (data, status, headers, config) {
		        $scope.listar();
		    }).error(function (data, status, headers, config) {
		        alert('Error al eliminar la informaci\xf3n del Estudiante, por favor intente mas tarde');
	    });   
	};
}]);
