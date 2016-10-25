package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class DireccionDTO {

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
    private String direccion;
    
    /**
    * @generated
    */
    private Ciudad ciudad;
    
    /**
    * @generated
    */
    private String descripcion;
    
    
    /**
    * @generated
    */
    private BaseDTO cliente;
    
    /**
    * @generated
    */
    private BaseDTO ciudad;
    
    /**
    * @generated
    */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @generated
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
    * @generated
    */
    public Ciudad getCiudad() {
        return this.ciudad;
    }
    
    /**
    * @generated
    */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    /**
    * @generated
    */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
    * @generated
    */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
	/**
	* @generated
	*/
	public BaseDTO getCliente() {
	    return this.cliente;
	}
	
	/**
	* @generated
	*/
	public void setCliente(BaseDTO cliente) {
	    this.cliente = cliente;
	}
	/**
	* @generated
	*/
	public BaseDTO getCiudad() {
	    return this.ciudad;
	}
	
	/**
	* @generated
	*/
	public void setCiudad(BaseDTO ciudad) {
	    this.ciudad = ciudad;
	}
	
}
