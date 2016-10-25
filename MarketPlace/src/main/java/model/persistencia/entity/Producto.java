package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Producto")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Producto.obtenerTodos", query="select e from Producto e")
})
public class Producto {

	@Id
    //@Column(name = "Producto_id")
    @GeneratedValue(generator = "ProductoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ProductoGen", sequenceName = "Producto_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre_producto")
    private String nombre_producto;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "descripcion")
    private String descripcion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidad")
    private Integer cantidad;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "precio")
    private Integer precio;
    
    
    /**
    * @generated
    * 1--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Categoria> categoria;
    
    /**
    * @generated
    * 0--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Comentario> comentario;
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private CarroCompra carroCompra;
    
    
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
    
	
	/*public List<Categoria> getCategoria(){
		if(categoria!=null){
			categoria=new ArrayList<Categoria>(); 
		}
		return this.categoria;
	}
	
	public void setCategoria(List<Categoria> categoria){
		this.categoria=categoria;
	}*/
	
	/**
	* @generated
	*/
	public CarroCompra getCarroCompra() {
	    return this.carroCompra;
	}
	
	/**
	* @generated
	*/
	public void setCarroCompra(CarroCompra carroCompra) {
	    this.carroCompra = carroCompra;
	}
	
	/*public List<Comentario> getComentario(){
		if(comentario!=null){
			comentario=new ArrayList<Comentario>(); 
		}
		return this.comentario;
	}
	
	public void setComentario(List<Comentario> comentario){
		this.comentario=comentario;
	}*/
	
}
