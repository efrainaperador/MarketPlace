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
@Path("/Cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteServicio {
	@EJB
    private ClienteLogica logica;

	
	/**
	* @generated
	*/
	@GET
	public List<ClienteDTO> obtenerTodosClientes(){
		return logica.obtenerTodos();
	}
	
	/**
	* @generated
	*/
	@GET
	@Path("/{id}")
	public ClienteDTO obtenerCliente(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	* @generated
	*/
	@POST
	public ClienteDTO guardarCliente(ClienteDTO dto){
		return logica.guardar(dto);
	}
	
	
	/**
	* @generated
	*/
	@DELETE
	@Path("/{id}")
	public void borrarCliente(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
	/**
	* @generated
	*/
	@PUT
	public void actualizarCliente(ClienteDTO dto){
		logica.actualizar(dto);
	}
	
	
}
