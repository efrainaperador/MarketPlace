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
public class AdministradorLogica {
	@EJB
    private AdministradorDAO persistencia;


	
	/**
	* @generated
	*/
	public List<AdministradorDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public AdministradorDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public AdministradorDTO guardar(AdministradorDTO dto){
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
	public void actualizar(AdministradorDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Administrador convertirDTO(AdministradorDTO dto){
		if(dto==null)return null;
		Administrador entidad=new Administrador();
		entidad.setId(dto.getId());
			entidad.setUsuario(dto.getUsuario());
			entidad.setPassword(dto.getPassword());
		
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Administrador> convertirDTO(List<AdministradorDTO> dtos){
		List<Administrador> entidades=new ArrayList<Administrador>();
		for(AdministradorDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private AdministradorDTO convertirEntidad(Administrador entidad){
		AdministradorDTO dto=new AdministradorDTO();
		dto.setId(entidad.getId());
			dto.setUsuario(entidad.getUsuario());
			dto.setPassword(entidad.getPassword());
		
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<AdministradorDTO> convertirEntidad(List<Administrador> entidades){
		List<AdministradorDTO> dtos=new ArrayList<AdministradorDTO>();
		for(Administrador entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
