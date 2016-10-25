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
public class ProductoLogica {
	@EJB
    private ProductoDAO persistencia;


	
	/**
	* @generated
	*/
	public List<ProductoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public ProductoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public ProductoDTO guardar(ProductoDTO dto){
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
	public void actualizar(ProductoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Producto convertirDTO(ProductoDTO dto){
		if(dto==null)return null;
		Producto entidad=new Producto();
		entidad.setId(dto.getId());
			entidad.setNombre_producto(dto.getNombre_producto());
			entidad.setDescripcion(dto.getDescripcion());
			entidad.setCantidad(dto.getCantidad());
			entidad.setPrecio(dto.getPrecio());
		
			if(dto.getCarroCompra()!=null){
				entidad.setCarroCompra(new CarroCompra());
				entidad.getCarroCompra().setId(dto.getCarroCompra().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Producto> convertirDTO(List<ProductoDTO> dtos){
		List<Producto> entidades=new ArrayList<Producto>();
		for(ProductoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private ProductoDTO convertirEntidad(Producto entidad){
		ProductoDTO dto=new ProductoDTO();
		dto.setId(entidad.getId());
			dto.setNombre_producto(entidad.getNombre_producto());
			dto.setDescripcion(entidad.getDescripcion());
			dto.setCantidad(entidad.getCantidad());
			dto.setPrecio(entidad.getPrecio());
		
			if(entidad.getCarroCompra()!=null){
				dto.setCarroCompra(
					new BaseDTO(
						entidad.getCarroCompra().getId(),
						entidad.getCarroCompra().getNombre()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<ProductoDTO> convertirEntidad(List<Producto> entidades){
		List<ProductoDTO> dtos=new ArrayList<ProductoDTO>();
		for(Producto entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
