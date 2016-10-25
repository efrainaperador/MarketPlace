package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
  *  @generated
  */
@Stateless
public class CarroCompraLogica {
	@EJB
    private CarroCompraDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* @generated
	*/
	public List<CarroCompraDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public CarroCompraDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public CarroCompraDTO guardar(CarroCompraDTO dto){
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
	public void actualizar(CarroCompraDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private CarroCompra convertirDTO(CarroCompraDTO dto){
		if(dto==null)return null;
		CarroCompra entidad=new CarroCompra();
		entidad.setId(dto.getId());
			entidad.setValor_total(dto.getValor_total());
			entidad.setCantidad_producto(dto.getCantidad_producto());
			if(dto.getFecha_compra()!=null){
				try {
					entidad.setFecha_compra(fecha.parse(dto.getFecha_compra()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha Fecha_compra " + dto.getFecha_compra());
		        }
			}
			entidad.setEstado_compra(dto.getEstado_compra());
		
			if(dto.getCliente()!=null){
				entidad.setCliente(new Cliente());
				entidad.getCliente().setId(dto.getCliente().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<CarroCompra> convertirDTO(List<CarroCompraDTO> dtos){
		List<CarroCompra> entidades=new ArrayList<CarroCompra>();
		for(CarroCompraDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private CarroCompraDTO convertirEntidad(CarroCompra entidad){
		CarroCompraDTO dto=new CarroCompraDTO();
		dto.setId(entidad.getId());
			dto.setValor_total(entidad.getValor_total());
			dto.setCantidad_producto(entidad.getCantidad_producto());
			if(entidad.getFecha_compra()!=null){
				dto.setFecha_compra(fecha.format(entidad.getFecha_compra()));
			}
			dto.setEstado_compra(entidad.getEstado_compra());
		
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
	private List<CarroCompraDTO> convertirEntidad(List<CarroCompra> entidades){
		List<CarroCompraDTO> dtos=new ArrayList<CarroCompraDTO>();
		for(CarroCompra entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
