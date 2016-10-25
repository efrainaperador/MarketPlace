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
public class CategoriaLogica {
	@EJB
    private CategoriaDAO persistencia;


	
	/**
	* @generated
	*/
	public List<CategoriaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public CategoriaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public CategoriaDTO guardar(CategoriaDTO dto){
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
	public void actualizar(CategoriaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Categoria convertirDTO(CategoriaDTO dto){
		if(dto==null)return null;
		Categoria entidad=new Categoria();
		entidad.setId(dto.getId());
			entidad.setNombre_categoria(dto.getNombre_categoria());
		
			if(dto.getProducto()!=null){
				entidad.setProducto(new Producto());
				entidad.getProducto().setId(dto.getProducto().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Categoria> convertirDTO(List<CategoriaDTO> dtos){
		List<Categoria> entidades=new ArrayList<Categoria>();
		for(CategoriaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private CategoriaDTO convertirEntidad(Categoria entidad){
		CategoriaDTO dto=new CategoriaDTO();
		dto.setId(entidad.getId());
			dto.setNombre_categoria(entidad.getNombre_categoria());
		
			if(entidad.getProducto()!=null){
				dto.setProducto(
					new BaseDTO(
						entidad.getProducto().getId(),
						entidad.getProducto().getNombre()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<CategoriaDTO> convertirEntidad(List<Categoria> entidades){
		List<CategoriaDTO> dtos=new ArrayList<CategoriaDTO>();
		for(Categoria entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
