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
@Path("/Ciudad")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CiudadServicio {
	@EJB
    private CiudadLogica logica;

	
	/**
	* @generated
	*/
	@GET
	public List<CiudadDTO> obtenerTodosCiudads(){
		return logica.obtenerTodos();
	}
	
	/**
	* @generated
	*/
	@GET
	@Path("/{id}")
	public CiudadDTO obtenerCiudad(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	* @generated
	*/
	@POST
	public CiudadDTO guardarCiudad(CiudadDTO dto){
		return logica.guardar(dto);
	}
	
	
	/**
	* @generated
	*/
	@DELETE
	@Path("/{id}")
	public void borrarCiudad(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
	/**
	* @generated
	*/
	@PUT
	public void actualizarCiudad(CiudadDTO dto){
		logica.actualizar(dto);
	}
	
	
}
