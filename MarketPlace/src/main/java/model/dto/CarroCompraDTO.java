package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
* @generated
*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarroCompraDTO {

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private Integer valor_total;
    
    /**
    * @generated
    */
    private Integer cantidad_producto;
    
    /**
    * @generated
    */
    private String fecha_compra;
    
    /**
    * @generated
    */
    private String estado_compra;
    
    
    /**
    * @generated
    */
    private BaseDTO cliente;
    
    
    
    /**
    * @generated
    */
    /*private List<ProductoDTO> producto;
    
    public List<ProductoDTO> getProducto(){
    	if(this.producto==null){
    		producto=new ArrayList<ProductoDTO>();
    	}
    	return producto;
    }
    
    public void setProducto(List<ProductoDTO> producto){
    	this.producto=producto;
    }
    */
    
    /**
    * @generated
    */
    public Integer getValor_total() {
        return this.valor_total;
    }
    
    /**
    * @generated
    */
    public void setValor_total(Integer valor_total) {
        this.valor_total = valor_total;
    }
    /**
    * @generated
    */
    public Integer getCantidad_producto() {
        return this.cantidad_producto;
    }
    
    /**
    * @generated
    */
    public void setCantidad_producto(Integer cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }
    /**
    * @generated
    */
    public String getFecha_compra() {
        return this.fecha_compra;
    }
    
    /**
    * @generated
    */
    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    /**
    * @generated
    */
    public String getEstado_compra() {
        return this.estado_compra;
    }
    
    /**
    * @generated
    */
    public void setEstado_compra(String estado_compra) {
        this.estado_compra = estado_compra;
    }
    
	/**
	* @generated
	*/
	public BaseDTO getCliente() {
	    return this.cliente;
	}
	
	/**
	* @generated
	*/
	public void setCliente(BaseDTO cliente) {
	    this.cliente = cliente;
	}
	
}
