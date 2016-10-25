package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Comentario")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Comentario.obtenerTodos", query="select e from Comentario e")
})
public class Comentario {

	@Id
    //@Column(name = "Comentario_id")
    @GeneratedValue(generator = "ComentarioGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ComentarioGen", sequenceName = "Comentario_SEQ",allocationSize = 1)
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
    
    //@Column(name = "comentario")
    private String comentario;
    
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Cliente cliente;
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Producto producto;
    
    
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
	public Producto getProducto() {
	    return this.producto;
	}
	
	/**
	* @generated
	*/
	public void setProducto(Producto producto) {
	    this.producto = producto;
	}
	
	/**
	* @generated
	*/
	public Cliente getCliente() {
	    return this.cliente;
	}
	
	/**
	* @generated
	*/
	public void setCliente(Cliente cliente) {
	    this.cliente = cliente;
	}
	
}
