package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  */
@Stateless
public class ComentarioLogica {
	@EJB
    private ComentarioDAO persistencia;


	
	/**
	* @generated
	*/
	public List<ComentarioDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public ComentarioDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public ComentarioDTO guardar(ComentarioDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	* @generated
	*/
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	* @generated
	*/
	public void actualizar(ComentarioDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Comentario convertirDTO(ComentarioDTO dto){
		if(dto==null)return null;
		Comentario entidad=new Comentario();
		entidad.setId(dto.getId());
			entidad.setComentario(dto.getComentario());
		
			if(dto.getCliente()!=null){
				entidad.setCliente(new Cliente());
				entidad.getCliente().setId(dto.getCliente().getId());
			}
			if(dto.getProducto()!=null){
				entidad.setProducto(new Producto());
				entidad.getProducto().setId(dto.getProducto().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Comentario> convertirDTO(List<ComentarioDTO> dtos){
		List<Comentario> entidades=new ArrayList<Comentario>();
		for(ComentarioDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private ComentarioDTO convertirEntidad(Comentario entidad){
		ComentarioDTO dto=new ComentarioDTO();
		dto.setId(entidad.getId());
			dto.setComentario(entidad.getComentario());
		
			if(entidad.getProducto()!=null){
				dto.setProducto(
					new BaseDTO(
						entidad.getProducto().getId(),
						entidad.getProducto().getNombre()));
			}
			if(entidad.getCliente()!=null){
				dto.setCliente(
					new BaseDTO(
						entidad.getCliente().getId(),
						entidad.getCliente().getNombre()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<ComentarioDTO> convertirEntidad(List<Comentario> entidades){
		List<ComentarioDTO> dtos=new ArrayList<ComentarioDTO>();
		for(Comentario entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
