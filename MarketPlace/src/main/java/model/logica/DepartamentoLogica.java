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
public class DepartamentoLogica {
	@EJB
    private DepartamentoDAO persistencia;


	
	/**
	* @generated
	*/
	public List<DepartamentoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public DepartamentoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public DepartamentoDTO guardar(DepartamentoDTO dto){
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
	public void actualizar(DepartamentoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Departamento convertirDTO(DepartamentoDTO dto){
		if(dto==null)return null;
		Departamento entidad=new Departamento();
		entidad.setId(dto.getId());
			entidad.setCod_dane(dto.getCod_dane());
			entidad.setNombre_depto(dto.getNombre_depto());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Departamento> convertirDTO(List<DepartamentoDTO> dtos){
		List<Departamento> entidades=new ArrayList<Departamento>();
		for(DepartamentoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private DepartamentoDTO convertirEntidad(Departamento entidad){
		DepartamentoDTO dto=new DepartamentoDTO();
		dto.setId(entidad.getId());
			dto.setCod_dane(entidad.getCod_dane());
			dto.setNombre_depto(entidad.getNombre_depto());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<DepartamentoDTO> convertirEntidad(List<Departamento> entidades){
		List<DepartamentoDTO> dtos=new ArrayList<DepartamentoDTO>();
		for(Departamento entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
