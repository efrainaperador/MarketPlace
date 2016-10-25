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
@Path("/Tipo_Documento")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Tipo_DocumentoServicio {
	@EJB
    private Tipo_DocumentoLogica logica;

	
	/**
	* @generated
	*/
	@GET
	public List<Tipo_DocumentoDTO> obtenerTodosTipo_Documentos(){
		return logica.obtenerTodos();
	}
	
	/**
	* @generated
	*/
	@GET
	@Path("/{id}")
	public Tipo_DocumentoDTO obtenerTipo_Documento(@PathParam("id") Long id){
		return logica.obtener(id);
	}
	
	
	/**
	* @generated
	*/
	@POST
	public Tipo_DocumentoDTO guardarTipo_Documento(Tipo_DocumentoDTO dto){
		return logica.guardar(dto);
	}
	
	
	/**
	* @generated
	*/
	@DELETE
	@Path("/{id}")
	public void borrarTipo_Documento(@PathParam("id") Long id){
		logica.borrar(id);
	}
	
	
	/**
	* @generated
	*/
	@PUT
	public void actualizarTipo_Documento(Tipo_DocumentoDTO dto){
		logica.actualizar(dto);
	}
	
	
}
