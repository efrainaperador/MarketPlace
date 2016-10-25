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
public class ClienteDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Cliente> obtenerTodos(){
		return em.createNamedQuery("Cliente.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Cliente obtener(Long id){
		return em.find(Cliente.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Cliente guardar(Cliente entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Cliente.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Cliente entidad){
		em.merge(entidad);
	}
	
	
}
