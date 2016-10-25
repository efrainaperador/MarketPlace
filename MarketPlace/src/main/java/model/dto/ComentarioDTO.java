package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComentarioDTO {

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
    private String comentario;
    
    
    /**
    * @generated
    */
    private BaseDTO cliente;
    
    /**
    * @generated
    */
    private BaseDTO producto;
    
    /**
    * @generated
    */
    public String getComentario() {
        return this.comentario;
    }
    
    /**
    * @generated
    */
    public void setComentario(String comentario) {
        this.comentario = comentario;
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
