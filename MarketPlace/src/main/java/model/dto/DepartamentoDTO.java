package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartamentoDTO {

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
    private String nombre_depto;
    
    
    
    
    /**
    * @generated
    */
    /*private List<CiudadDTO> ciudad;
    
    public List<CiudadDTO> getCiudad(){
    	if(this.ciudad==null){
    		ciudad=new ArrayList<CiudadDTO>();
    	}
    	return ciudad;
    }
    
    public void setCiudad(List<CiudadDTO> ciudad){
    	this.ciudad=ciudad;
    }
    */
    
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
    public String getNombre_depto() {
        return this.nombre_depto;
    }
    
    /**
    * @generated
    */
    public void setNombre_depto(String nombre_depto) {
        this.nombre_depto = nombre_depto;
    }
    
	
}
