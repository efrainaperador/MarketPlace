package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteDTO {

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
    private String usuario;
    
    /**
    * @generated
    */
    private String password;
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private String apellido;
    
    /**
    * @generated
    */
    private String fecha_nacimiento;
    
    /**
    * @generated
    */
    private String email;
    
    
    
    
    /**
    * @generated
    */
    /*private List<CarroCompraDTO> carroCompra;
    
    public List<CarroCompraDTO> getCarroCompra(){
    	if(this.carroCompra==null){
    		carroCompra=new ArrayList<CarroCompraDTO>();
    	}
    	return carroCompra;
    }
    
    public void setCarroCompra(List<CarroCompraDTO> carroCompra){
    	this.carroCompra=carroCompra;
    }
    */
    
    /**
    * @generated
    */
    private BaseDTO documento;
    
    
    
    /**
    * @generated
    */
    /*private List<DireccionDTO> direccion;
    
    public List<DireccionDTO> getDireccion(){
    	if(this.direccion==null){
    		direccion=new ArrayList<DireccionDTO>();
    	}
    	return direccion;
    }
    
    public void setDireccion(List<DireccionDTO> direccion){
    	this.direccion=direccion;
    }
    */
    
    
    
    /**
    * @generated
    */
    /*private List<ComentarioDTO> comentario;
    
    public List<ComentarioDTO> getComentario(){
    	if(this.comentario==null){
    		comentario=new ArrayList<ComentarioDTO>();
    	}
    	return comentario;
    }
    
    public void setComentario(List<ComentarioDTO> comentario){
    	this.comentario=comentario;
    }
    */
    
    /**
    * @generated
    */
    public String getUsuario() {
        return this.usuario;
    }
    
    /**
    * @generated
    */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
    * @generated
    */
    public String getPassword() {
        return this.password;
    }
    
    /**
    * @generated
    */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * @generated
    */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
    * @generated
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
    * @generated
    */
    public String getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }
    
    /**
    * @generated
    */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    /**
    * @generated
    */
    public String getEmail() {
        return this.email;
    }
    
    /**
    * @generated
    */
    public void setEmail(String email) {
        this.email = email;
    }
    
	/**
	* @generated
	*/
	public BaseDTO getDocumento() {
	    return this.documento;
	}
	
	/**
	* @generated
	*/
	public void setDocumento(BaseDTO documento) {
	    this.documento = documento;
	}
	
}
