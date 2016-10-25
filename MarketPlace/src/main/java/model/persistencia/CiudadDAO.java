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
public class CiudadDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Ciudad> obtenerTodos(){
		return em.createNamedQuery("Ciudad.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Ciudad obtener(Long id){
		return em.find(Ciudad.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Ciudad guardar(Ciudad entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Ciudad.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Ciudad entidad){
		em.merge(entidad);
	}
	
	
}
