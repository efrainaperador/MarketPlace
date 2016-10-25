package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tipo_DocumentoDTO {

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
    private String tipo_documento;
    
    
    /**
    * @generated
    */
    private BaseDTO cliente;
    
    /**
    * @generated
    */
    public String getTipo_documento() {
        return this.tipo_documento;
    }
    
    /**
    * @generated
    */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
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
	
}
