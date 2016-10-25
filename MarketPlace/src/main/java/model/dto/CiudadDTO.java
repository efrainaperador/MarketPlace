package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class CiudadDTO {

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private String cod_dane;
    
    /**
    * @generated
    */
    private String nombre_ciudad;
    
    
    /**
    * @generated
    */
    private BaseDTO direccion;
    
    /**
    * @generated
    */
    private BaseDTO departamento;
    
    /**
    * @generated
    */
    public String getCod_dane() {
        return this.cod_dane;
    }
    
    /**
    * @generated
    */
    public void setCod_dane(String cod_dane) {
        this.cod_dane = cod_dane;
    }
    /**
    * @generated
    */
    public String getNombre_ciudad() {
        return this.nombre_ciudad;
    }
    
    /**
    * @generated
    */
    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
	/**
	* @generated
	*/
	public BaseDTO getDireccion() {
	    return this.direccion;
	}
	
	/**
	* @generated
	*/
	public void setDireccion(BaseDTO direccion) {
	    this.direccion = direccion;
	}
	/**
	* @generated
	*/
	public BaseDTO getDepartamento() {
	    return this.departamento;
	}
	
	/**
	* @generated
	*/
	public void setDepartamento(BaseDTO departamento) {
	    this.departamento = departamento;
	}
	
}
