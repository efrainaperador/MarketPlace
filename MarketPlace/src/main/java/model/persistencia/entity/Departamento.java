package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Departamento")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Departamento.obtenerTodos", query="select e from Departamento e")
})
public class Departamento {

	@Id
    //@Column(name = "Departamento_id")
    @GeneratedValue(generator = "DepartamentoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DepartamentoGen", sequenceName = "Departamento_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nombre_depto")
    private String nombre_depto;
    
    
    /**
    * @generated
    * 1--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Ciudad> ciudad;
    
    
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
    
	
	/*public List<Ciudad> getCiudad(){
		if(ciudad!=null){
			ciudad=new ArrayList<Ciudad>(); 
		}
		return this.ciudad;
	}
	
	public void setCiudad(List<Ciudad> ciudad){
		this.ciudad=ciudad;
	}*/
	
}
