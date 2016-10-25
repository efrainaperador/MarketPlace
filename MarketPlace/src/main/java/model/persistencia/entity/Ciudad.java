package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Ciudad")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Ciudad.obtenerTodos", query="select e from Ciudad e")
})
public class Ciudad {

	@Id
    //@Column(name = "Ciudad_id")
    @GeneratedValue(generator = "CiudadGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CiudadGen", sequenceName = "Ciudad_SEQ",allocationSize = 1)
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
    
    //@Column(name = "cod_dane")
    private String cod_dane;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre_ciudad")
    private String nombre_ciudad;
    
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Direccion direccion;
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Departamento departamento;
    
    
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
    public String getNombre_ciudad() {
        return this.nombre_ciudad;
    }
    
    /**
    * @generated
    */
    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
    
	
	/**
	* @generated
	*/
	public Departamento getDepartamento() {
	    return this.departamento;
	}
	
	/**
	* @generated
	*/
	public void setDepartamento(Departamento departamento) {
	    this.departamento = departamento;
	}
	
	/**
	* @generated
	*/
	public Direccion getDireccion() {
	    return this.direccion;
	}
	
	/**
	* @generated
	*/
	public void setDireccion(Direccion direccion) {
	    this.direccion = direccion;
	}
	
}
