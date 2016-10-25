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
public class DireccionDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Direccion> obtenerTodos(){
		return em.createNamedQuery("Direccion.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Direccion obtener(Long id){
		return em.find(Direccion.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Direccion guardar(Direccion entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Direccion.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Direccion entidad){
		em.merge(entidad);
	}
	
	
}
