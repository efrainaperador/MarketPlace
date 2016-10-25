package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoriaDTO {

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
    private String nombre_categoria;
    
    
    /**
    * @generated
    */
    private BaseDTO producto;
    
    /**
    * @generated
    */
    public String getNombre_categoria() {
        return this.nombre_categoria;
    }
    
    /**
    * @generated
    */
    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    
	/**
	* @generated
	*/
	public BaseDTO getProducto() {
	    return this.producto;
	}
	
	/**
	* @generated
	*/
	public void setProducto(BaseDTO producto) {
	    this.producto = producto;
	}
	
}
