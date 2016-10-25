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
@Path("/Departamento")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepartamentoServicio {
	@EJB
    private DepartamentoLogica logica;

	
	/**
	* @generated
	*/
	@GET
	public List<DepartamentoDTO> obtenerTodosDepartamentos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @generated
	*/
	@GET
	@Path("/{id}")
	public DepartamentoDTO obtenerDepartamento(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	* @generated
	*/
	@POST
	public DepartamentoDTO guardarDepartamento(DepartamentoDTO dto){
		return logica.guardar(dto);
	}
	
	
	/**
	* @generated
	*/
	@DELETE
	@Path("/{id}")
	public void borrarDepartamento(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
	/**
	* @generated
	*/
	@PUT
	public void actualizarDepartamento(DepartamentoDTO dto){
		logica.actualizar(dto);
	}
	
	
}
