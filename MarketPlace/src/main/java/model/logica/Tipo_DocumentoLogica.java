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
public class Tipo_DocumentoLogica {
	@EJB
    private Tipo_DocumentoDAO persistencia;


	
	/**
	* @generated
	*/
	public List<Tipo_DocumentoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public Tipo_DocumentoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public Tipo_DocumentoDTO guardar(Tipo_DocumentoDTO dto){
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
	public void actualizar(Tipo_DocumentoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Tipo_Documento convertirDTO(Tipo_DocumentoDTO dto){
		if(dto==null)return null;
		Tipo_Documento entidad=new Tipo_Documento();
		entidad.setId(dto.getId());
			entidad.setTipo_documento(dto.getTipo_documento());
		
			if(dto.getCliente()!=null){
				entidad.setCliente(new Cliente());
				entidad.getCliente().setId(dto.getCliente().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Tipo_Documento> convertirDTO(List<Tipo_DocumentoDTO> dtos){
		List<Tipo_Documento> entidades=new ArrayList<Tipo_Documento>();
		for(Tipo_DocumentoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private Tipo_DocumentoDTO convertirEntidad(Tipo_Documento entidad){
		Tipo_DocumentoDTO dto=new Tipo_DocumentoDTO();
		dto.setId(entidad.getId());
			dto.setTipo_documento(entidad.getTipo_documento());
		
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
	private List<Tipo_DocumentoDTO> convertirEntidad(List<Tipo_Documento> entidades){
		List<Tipo_DocumentoDTO> dtos=new ArrayList<Tipo_DocumentoDTO>();
		for(Tipo_Documento entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
