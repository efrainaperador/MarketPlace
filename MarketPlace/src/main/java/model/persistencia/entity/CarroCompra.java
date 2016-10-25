package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="CarroCompra")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="CarroCompra.obtenerTodos", query="select e from CarroCompra e")
})
public class CarroCompra {

	@Id
    //@Column(name = "CarroCompra_id")
    @GeneratedValue(generator = "CarroCompraGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CarroCompraGen", sequenceName = "CarroCompra_SEQ",allocationSize = 1)
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
    
    //@Column(name = "valor_total")
    private Integer valor_total;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "cantidad_producto")
    private Integer cantidad_producto;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fecha_compra")
    private Date fecha_compra;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "estado_compra")
    private String estado_compra;
    
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Cliente cliente;
    
    /**
    * @generated
    * 1--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Producto> producto;
    
    
    /**
    * @generated
    */
    public Integer getValor_total() {
        return this.valor_total;
    }
    
    /**
    * @generated
    */
    public void setValor_total(Integer valor_total) {
        this.valor_total = valor_total;
    }
    
    /**
    * @generated
    */
    public Integer getCantidad_producto() {
        return this.cantidad_producto;
    }
    
    /**
    * @generated
    */
    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }
    
    /**
    * @generated
    */
    public Date getFecha_compra() {
        return this.fecha_compra;
    }
    
    /**
    * @generated
    */
    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
    /**
    * @generated
    */
    public String getEstado_compra() {
        return this.estado_compra;
    }
    
    /**
    * @generated
    */
    public void setEstado_compra(String estado_compra) {
        this.estado_compra = estado_compra;
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
	
	/*public List<Producto> getProducto(){
		if(producto!=null){
			producto=new ArrayList<Producto>(); 
		}
		return this.producto;
	}
	
	public void setProducto(List<Producto> producto){
		this.producto=producto;
	}*/
	
}
