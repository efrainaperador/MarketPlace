package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Categoria")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Categoria.obtenerTodos", query="select e from Categoria e")
})
public class Categoria {

	@Id
    //@Column(name = "Categoria_id")
    @GeneratedValue(generator = "CategoriaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CategoriaGen", sequenceName = "Categoria_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombre_categoria")
    private String nombre_categoria;
    
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Producto producto;
    
    
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
	public Producto getProducto() {
	    return this.producto;
	}
	
	/**
	* @generated
	*/
	public void setProducto(Producto producto) {
	    this.producto = producto;
	}
	
}
