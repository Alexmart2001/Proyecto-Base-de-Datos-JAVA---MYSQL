package co.edu.usbbog.dbd.fiesteroAndante.model;

import java.sql.Date;
import java.util.Objects;

public class ProductoDTO {

    private SucursalDTO sucursal;
    private int cod_producto;
    private String calidad_producto;
    private double precio_producto;
    private Date fecha_caducidad;
    private Date aniejamiento_producto;
    private int cantidad_producto;
    private String tipo;
    private String comida;
    private String orquesta;

    public ProductoDTO() {
    }

    public ProductoDTO(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public ProductoDTO(int cod_producto, String calidad_producto, double precio_producto, Date fecha_caducidad, int cantidad_producto, String comida, String orquesta) {
        this.cod_producto = cod_producto;
        this.calidad_producto = calidad_producto;
        this.precio_producto = precio_producto;
        this.fecha_caducidad = fecha_caducidad;
        this.cantidad_producto = cantidad_producto;
        this.comida = comida;
        this.orquesta = orquesta;
    }

    public ProductoDTO(int cod_producto, String calidad_producto, double precio_producto, Date fecha_caducidad, Date aniejamiento_producto, int cantidad_producto, String tipo, String comida, String orquesta) {
        this.cod_producto = cod_producto;
        this.calidad_producto = calidad_producto;
        this.precio_producto = precio_producto;
        this.fecha_caducidad = fecha_caducidad;
        this.aniejamiento_producto = aniejamiento_producto;
        this.cantidad_producto = cantidad_producto;
        this.tipo = tipo;
        this.comida = comida;
        this.orquesta = orquesta;
    }

    public ProductoDTO( int cod_producto, String calidad_producto, double precio_producto, Date fecha_caducidad, Date aniejamiento_producto, int cantidad_producto, String tipo, String comida, String orquesta,SucursalDTO sucursal) {
        this.cod_producto = cod_producto;
        this.calidad_producto = calidad_producto;
        this.precio_producto = precio_producto;
        this.fecha_caducidad = fecha_caducidad;
        this.aniejamiento_producto = aniejamiento_producto;
        this.cantidad_producto = cantidad_producto;
        this.tipo = tipo;
        this.comida = comida;
        this.orquesta = orquesta;
         this.sucursal = sucursal;
    }

    public SucursalDTO getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalDTO sucursal) {
        this.sucursal = sucursal;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getCalidad_producto() {
        return calidad_producto;
    }

    public void setCalidad_producto(String calidad_producto) {
        this.calidad_producto = calidad_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Date getAniejamiento_producto() {
        return aniejamiento_producto;
    }

    public void setAniejamiento_producto(Date aniejamiento_producto) {
        this.aniejamiento_producto = aniejamiento_producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getOrquesta() {
        return orquesta;
    }

    public void setOrquesta(String orquesta) {
        this.orquesta = orquesta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.sucursal);
        hash = 79 * hash + this.cod_producto;
        hash = 79 * hash + Objects.hashCode(this.calidad_producto);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.precio_producto) ^ (Double.doubleToLongBits(this.precio_producto) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.fecha_caducidad);
        hash = 79 * hash + Objects.hashCode(this.aniejamiento_producto);
        hash = 79 * hash + this.cantidad_producto;
        hash = 79 * hash + Objects.hashCode(this.tipo);
        hash = 79 * hash + Objects.hashCode(this.comida);
        hash = 79 * hash + Objects.hashCode(this.orquesta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        if (this.cod_producto != other.cod_producto) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio_producto) != Double.doubleToLongBits(other.precio_producto)) {
            return false;
        }
        if (this.cantidad_producto != other.cantidad_producto) {
            return false;
        }
        if (!Objects.equals(this.calidad_producto, other.calidad_producto)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.comida, other.comida)) {
            return false;
        }
        if (!Objects.equals(this.orquesta, other.orquesta)) {
            return false;
        }
        if (!Objects.equals(this.sucursal, other.sucursal)) {
            return false;
        }
        if (!Objects.equals(this.fecha_caducidad, other.fecha_caducidad)) {
            return false;
        }
        if (!Objects.equals(this.aniejamiento_producto, other.aniejamiento_producto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductoDTO" 
                +   "Sucursal=" + sucursal 
                + "\nCod_producto=" + cod_producto 
                + "\nCalidad_producto=" + calidad_producto 
                + "\nPrecio_producto=" + precio_producto 
                + "\nFecha_caducidad=" + fecha_caducidad 
                + "\nAniejamiento_producto=" + aniejamiento_producto 
                + "\nCantidad_producto=" + cantidad_producto 
                + "\nTipo=" + tipo 
                + "\nComida=" + comida 
                + "\nOrquesta=" + orquesta ;
    }

         
    
    
    
    
    
}


