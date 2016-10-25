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
public class ComentarioDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<Comentario> obtenerTodos(){
		return em.createNamedQuery("Comentario.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public Comentario obtener(Long id){
		return em.find(Comentario.class, id);
	}
	
	
	/**
	* @generated
	*/
	public Comentario guardar(Comentario entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(Comentario.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(Comentario entidad){
		em.merge(entidad);
	}
	
	
}
