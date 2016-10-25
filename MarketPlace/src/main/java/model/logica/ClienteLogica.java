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
public class ClienteLogica {
	@EJB
    private ClienteDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* @generated
	*/
	public List<ClienteDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* @generated
	*/
	public ClienteDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	* @generated
	*/
	public ClienteDTO guardar(ClienteDTO dto){
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
	public void actualizar(ClienteDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* @generated
	*/
	private Cliente convertirDTO(ClienteDTO dto){
		if(dto==null)return null;
		Cliente entidad=new Cliente();
		entidad.setId(dto.getId());
			entidad.setUsuario(dto.getUsuario());
			entidad.setPassword(dto.getPassword());
			entidad.setNombre(dto.getNombre());
			entidad.setApellido(dto.getApellido());
			if(dto.getFecha_nacimiento()!=null){
				try {
					entidad.setFecha_nacimiento(fecha.parse(dto.getFecha_nacimiento()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha Fecha_nacimiento " + dto.getFecha_nacimiento());
		        }
			}
			entidad.setEmail(dto.getEmail());
		
			if(dto.getDocumento()!=null){
				entidad.setDocumento(new Tipo_Documento());
				entidad.getDocumento().setId(dto.getDocumento().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* @generated
	*/
	private List<Cliente> convertirDTO(List<ClienteDTO> dtos){
		List<Cliente> entidades=new ArrayList<Cliente>();
		for(ClienteDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* @generated
	*/
	private ClienteDTO convertirEntidad(Cliente entidad){
		ClienteDTO dto=new ClienteDTO();
		dto.setId(entidad.getId());
			dto.setUsuario(entidad.getUsuario());
			dto.setPassword(entidad.getPassword());
			dto.setNombre(entidad.getNombre());
			dto.setApellido(entidad.getApellido());
			if(entidad.getFecha_nacimiento()!=null){
				dto.setFecha_nacimiento(fecha.format(entidad.getFecha_nacimiento()));
			}
			dto.setEmail(entidad.getEmail());
		
			if(entidad.getDocumento()!=null){
				dto.setDocumento(
					new BaseDTO(
						entidad.getDocumento().getId(),
						entidad.getDocumento().getNombre()));
			}
		
		return dto;
	}
	
	
	/**
	* @generated
	*/
	private List<ClienteDTO> convertirEntidad(List<Cliente> entidades){
		List<ClienteDTO> dtos=new ArrayList<ClienteDTO>();
		for(Cliente entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
