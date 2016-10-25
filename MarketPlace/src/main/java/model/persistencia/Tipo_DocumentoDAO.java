package model.persistencia;

import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
  *  @generated
  */
@Stateless
public class Tipo_DocumentoDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Tipo_Documento> obtenerTodos(){
		return em.createNamedQuery("Tipo_Documento.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Tipo_Documento obtener(Long id){
		return em.find(Tipo_Documento.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Tipo_Documento guardar(Tipo_Documento entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Tipo_Documento.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Tipo_Documento entidad){
		em.merge(entidad);
	}
	
	
}
