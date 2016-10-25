package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductoDTO {

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
    private String nombre_producto;
    
    /**
    * @generated
    */
    private String descripcion;
    
    /**
    * @generated
    */
    private Integer cantidad;
    
    /**
    * @generated
    */
    private Integer precio;
    
    
    
    
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
    private BaseDTO carroCompra;
    
    
    
    /**
    * @generated
    */
    /*private List<CategoriaDTO> categoria;
    
    public List<CategoriaDTO> getCategoria(){
    	if(this.categoria==null){
    		categoria=new ArrayList<CategoriaDTO>();
    	}
    	return categoria;
    }
    
    public void setCategoria(List<CategoriaDTO> categoria){
    	this.categoria=categoria;
    }
    */
    
    /**
    * @generated
    */
    public String getNombre_producto() {
        return this.nombre_producto;
    }
    
    /**
    * @generated
    */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
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
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    /**
    * @generated
    */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    /**
    * @generated
    */
    public Integer getPrecio() {
        return this.precio;
    }
    
    /**
    * @generated
    */
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
	/**
	* @generated
	*/
	public BaseDTO getCarroCompra() {
	    return this.carroCompra;
	}
	
	/**
	* @generated
	*/
	public void setCarroCompra(BaseDTO carroCompra) {
	    this.carroCompra = carroCompra;
	}
	
}
