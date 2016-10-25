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
public class CiudadLogica {
	@EJB
    private CiudadDAO persistencia;


	
	/**
	* @generated
	*/
	public List<CiudadDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public CiudadDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public CiudadDTO guardar(CiudadDTO dto){
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
	public void actualizar(CiudadDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Ciudad convertirDTO(CiudadDTO dto){
		if(dto==null)return null;
		Ciudad entidad=new Ciudad();
		entidad.setId(dto.getId());
			entidad.setCod_dane(dto.getCod_dane());
			entidad.setNombre_ciudad(dto.getNombre_ciudad());
		
			if(dto.getDireccion()!=null){
				entidad.setDireccion(new Direccion());
				entidad.getDireccion().setId(dto.getDireccion().getId());
			}
			if(dto.getDepartamento()!=null){
				entidad.setDepartamento(new Departamento());
				entidad.getDepartamento().setId(dto.getDepartamento().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Ciudad> convertirDTO(List<CiudadDTO> dtos){
		List<Ciudad> entidades=new ArrayList<Ciudad>();
		for(CiudadDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private CiudadDTO convertirEntidad(Ciudad entidad){
		CiudadDTO dto=new CiudadDTO();
		dto.setId(entidad.getId());
			dto.setCod_dane(entidad.getCod_dane());
			dto.setNombre_ciudad(entidad.getNombre_ciudad());
		
			if(entidad.getDireccion()!=null){
				dto.setDireccion(
					new BaseDTO(
						entidad.getDireccion().getId(),
						entidad.getDireccion().getNombre()));
			}
			if(entidad.getDepartamento()!=null){
				dto.setDepartamento(
					new BaseDTO(
						entidad.getDepartamento().getId(),
						entidad.getDepartamento().getNombre()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<CiudadDTO> convertirEntidad(List<Ciudad> entidades){
		List<CiudadDTO> dtos=new ArrayList<CiudadDTO>();
		for(Ciudad entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
