package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Direccion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Direccion.obtenerTodos", query="select e from Direccion e")
})
public class Direccion {

	@Id
    //@Column(name = "Direccion_id")
    @GeneratedValue(generator = "DireccionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DireccionGen", sequenceName = "Direccion_SEQ",allocationSize = 1)
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
    
    //@Column(name = "direccion")
    private String direccion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "ciudad")
    private Ciudad ciudad;
    
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
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Ciudad ciudad;
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Cliente cliente;
    
    
    /**
    * @generated
    */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @generated
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
    * @generated
    */
    public Ciudad getCiudad() {
        return this.ciudad;
    }
    
    /**
    * @generated
    */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
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
	public Cliente getCliente() {
	    return this.cliente;
	}
	
	/**
	* @generated
	*/
	public void setCliente(Cliente cliente) {
	    this.cliente = cliente;
	}
	
	/**
	* @generated
	*/
	public Ciudad getCiudad() {
	    return this.ciudad;
	}
	
	/**
	* @generated
	*/
	public void setCiudad(Ciudad ciudad) {
	    this.ciudad = ciudad;
	}
	
}
