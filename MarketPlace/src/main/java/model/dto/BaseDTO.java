
package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseDTO {

    private Long id;
	private String nombre;

	public BaseDTO(){
	}

	public BaseDTO(Long id, String nombre){
		this.id=id;
		this.nombre=nombre;
	}

	public Long getId(){
		return this.id;
	}
    
	public void setId(Long id){
		this.id=id;
	}

	public String getNombre(){
		return this.nombre;
	}
    
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
}
