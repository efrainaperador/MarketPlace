package model.persistencia.entity;


import javax.persistence.*;

/**
  *  @generated
  */
@Entity
@Table(name="Tipo_Documento")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Tipo_Documento.obtenerTodos", query="select e from Tipo_Documento e")
})
public class Tipo_Documento {

	@Id
    //@Column(name = "Tipo_Documento_id")
    @GeneratedValue(generator = "Tipo_DocumentoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Tipo_DocumentoGen", sequenceName = "Tipo_Documento_SEQ",allocationSize = 1)
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
    
    //@Column(name = "tipo_documento")
    private String tipo_documento;
    
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Cliente cliente;
    
    
    /**
    * @generated
    */
    public String getTipo_documento() {
        return this.tipo_documento;
    }
    
    /**
    * @generated
    */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
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
