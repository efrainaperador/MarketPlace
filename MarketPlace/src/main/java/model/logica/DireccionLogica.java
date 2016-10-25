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
public class DireccionLogica {
	@EJB
    private DireccionDAO persistencia;


	
	/**
	* @generated
	*/
	public List<DireccionDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public DireccionDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public DireccionDTO guardar(DireccionDTO dto){
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
	public void actualizar(DireccionDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Direccion convertirDTO(DireccionDTO dto){
		if(dto==null)return null;
		Direccion entidad=new Direccion();
		entidad.setId(dto.getId());
			entidad.setDireccion(dto.getDireccion());
			entidad.setCiudad(dto.getCiudad());
			entidad.setDescripcion(dto.getDescripcion());
		
			if(dto.getCiudad()!=null){
				entidad.setCiudad(new Ciudad());
				entidad.getCiudad().setId(dto.getCiudad().getId());
			}
			if(dto.getCliente()!=null){
				entidad.setCliente(new Cliente());
				entidad.getCliente().setId(dto.getCliente().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Direccion> convertirDTO(List<DireccionDTO> dtos){
		List<Direccion> entidades=new ArrayList<Direccion>();
		for(DireccionDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private DireccionDTO convertirEntidad(Direccion entidad){
		DireccionDTO dto=new DireccionDTO();
		dto.setId(entidad.getId());
			dto.setDireccion(entidad.getDireccion());
			dto.setCiudad(entidad.getCiudad());
			dto.setDescripcion(entidad.getDescripcion());
		
			if(entidad.getCiudad()!=null){
				dto.setCiudad(
					new BaseDTO(
						entidad.getCiudad().getId(),
						entidad.getCiudad().getNombre()));
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
	private List<DireccionDTO> convertirEntidad(List<Direccion> entidades){
		List<DireccionDTO> dtos=new ArrayList<DireccionDTO>();
		for(Direccion entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
