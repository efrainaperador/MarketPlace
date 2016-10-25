package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Cliente")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Cliente.obtenerTodos", query="select e from Cliente e")
})
public class Cliente {

	@Id
    //@Column(name = "Cliente_id")
    @GeneratedValue(generator = "ClienteGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ClienteGen", sequenceName = "Cliente_SEQ",allocationSize = 1)
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
    
    //@Column(name = "usuario")
    private String usuario;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "password")
    private String password;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre")
    private String nombre;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "apellido")
    private String apellido;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "email")
    private String email;
    
    
    /**
    * @generated
    * 0--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Direccion> direccion;
    
    /**
    * @generated
    * 0--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Comentario> comentario;
    
    /**
    * @generated
    * 0--1-true 
    */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<CarroCompra> carroCompra;
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Tipo_Documento documento;
    
    
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
    public Date getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }
    
    /**
    * @generated
    */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
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
    
	
	/*public List<Comentario> getComentario(){
		if(comentario!=null){
			comentario=new ArrayList<Comentario>(); 
		}
		return this.comentario;
	}
	
	public void setComentario(List<Comentario> comentario){
		this.comentario=comentario;
	}*/
	
	/*public List<CarroCompra> getCarroCompra(){
		if(carroCompra!=null){
			carroCompra=new ArrayList<CarroCompra>(); 
		}
		return this.carroCompra;
	}
	
	public void setCarroCompra(List<CarroCompra> carroCompra){
		this.carroCompra=carroCompra;
	}*/
	
	/*public List<Direccion> getDireccion(){
		if(direccion!=null){
			direccion=new ArrayList<Direccion>(); 
		}
		return this.direccion;
	}
	
	public void setDireccion(List<Direccion> direccion){
		this.direccion=direccion;
	}*/
	
	/**
	* @generated
	*/
	public Tipo_Documento getDocumento() {
	    return this.documento;
	}
	
	/**
	* @generated
	*/
	public void setDocumento(Tipo_Documento documento) {
	    this.documento = documento;
	}
	
}
