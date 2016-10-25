package model.servicio;

import model.dto.*;
import model.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
  *  @generated
  */
@Stateless
@Path("/Producto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductoServicio {
	@EJB
    private ProductoLogica logica;

	
	/**
	* @generated
	*/
	@GET
	public List<ProductoDTO> obtenerTodosProductos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @generated
	*/
	@GET
	@Path("/{id}")
	public ProductoDTO obtenerProducto(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	* @generated
	*/
	@POST
	public ProductoDTO guardarProducto(ProductoDTO dto){
		return logica.guardar(dto);
	}
	
	
	/**
	* @generated
	*/
	@DELETE
	@Path("/{id}")
	public void borrarProducto(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
	/**
	* @generated
	*/
	@PUT
	public void actualizarProducto(ProductoDTO dto){
		logica.actualizar(dto);
	}
	
	
}
