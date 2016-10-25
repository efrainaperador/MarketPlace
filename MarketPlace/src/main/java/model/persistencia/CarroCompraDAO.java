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
public class CarroCompraDAO {
	@PersistenceContext
    private EntityManager em;

	
	/**
	* @generated
	*/
	public List<CarroCompra> obtenerTodos(){
		return em.createNamedQuery("CarroCompra.obtenerTodos").getResultList();
	}
	
	/**
	* @generated
	*/
	public CarroCompra obtener(Long id){
		return em.find(CarroCompra.class, id);
	}
	
	
	/**
	* @generated
	*/
	public CarroCompra guardar(CarroCompra entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		em.remove(em.find(CarroCompra.class, id));
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(CarroCompra entidad){
		em.merge(entidad);
	}
	
	
}
