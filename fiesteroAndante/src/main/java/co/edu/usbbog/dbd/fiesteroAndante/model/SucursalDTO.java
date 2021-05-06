package co.edu.usbbog.dbd.fiesteroAndante.model;

import java.sql.Timestamp;
import java.util.Objects;

public class SucursalDTO {

    private Integer id_sucursal;
    private String nombre_sucursal;
    private Integer seguridad_sucursal;
    private String atencion_presencial_sucursal;
    private Timestamp tiempo_espera_consultas_sucursal;
    private Timestamp reporte_tiempo_espera_sucursal;
    private String soporte;

    public SucursalDTO() {
        this.id_sucursal = 0;
        this.nombre_sucursal = "";
        this.seguridad_sucursal = 0;
        this.atencion_presencial_sucursal = "";
        this.tiempo_espera_consultas_sucursal = null;
        this.reporte_tiempo_espera_sucursal = null;
        this.soporte = "";
    }

    public SucursalDTO(Integer id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public SucursalDTO(Integer id_sucursal, String nombre_sucursal, Integer seguridad_sucursal, String atencion_presencial_sucursal, Timestamp tiempo_espera_consultas_sucursal, String soporte) {
        this.id_sucursal = id_sucursal;
        this.nombre_sucursal = nombre_sucursal;
        this.seguridad_sucursal = seguridad_sucursal;
        this.atencion_presencial_sucursal = atencion_presencial_sucursal;
        this.tiempo_espera_consultas_sucursal = tiempo_espera_consultas_sucursal;
        this.soporte = soporte;
    }

    public SucursalDTO(Integer id_sucursal, String nombre_sucursal, Integer seguridad_sucursal, String atencion_presencial_sucursal, Timestamp tiempo_espera_consultas_sucursal, Timestamp reporte_tiempo_espera_sucursal, String soporte) {
        this.id_sucursal = id_sucursal;
        this.nombre_sucursal = nombre_sucursal;
        this.seguridad_sucursal = seguridad_sucursal;
        this.atencion_presencial_sucursal = atencion_presencial_sucursal;
        this.tiempo_espera_consultas_sucursal = tiempo_espera_consultas_sucursal;
        this.reporte_tiempo_espera_sucursal = reporte_tiempo_espera_sucursal;
        this.soporte = soporte;
    }

    public Integer getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Integer id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getNombre_sucursal() {
        return nombre_sucursal;
    }

    public void setNombre_sucursal(String nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }

    public Integer getSeguridad_sucursal() {
        return seguridad_sucursal;
    }

    public void setSeguridad_sucursal(Integer seguridad_sucursal) {
        this.seguridad_sucursal = seguridad_sucursal;
    }

    public String getAtencion_presencial_sucursal() {
        return atencion_presencial_sucursal;
    }

    public void setAtencion_presencial_sucursal(String atencion_presencial_sucursal) {
        this.atencion_presencial_sucursal = atencion_presencial_sucursal;
    }

    public Timestamp getTiempo_espera_consultas_sucursal() {
        return tiempo_espera_consultas_sucursal;
    }

    public void setTiempo_espera_consultas_sucursal(Timestamp tiempo_espera_consultas_sucursal) {
        this.tiempo_espera_consultas_sucursal = tiempo_espera_consultas_sucursal;
    }

    public Timestamp getReporte_tiempo_espera_sucursal() {
        return reporte_tiempo_espera_sucursal;
    }

    public void setReporte_tiempo_espera_sucursal(Timestamp reporte_tiempo_espera_sucursal) {
        this.reporte_tiempo_espera_sucursal = reporte_tiempo_espera_sucursal;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id_sucursal);
        hash = 29 * hash + Objects.hashCode(this.nombre_sucursal);
        hash = 29 * hash + Objects.hashCode(this.seguridad_sucursal);
        hash = 29 * hash + Objects.hashCode(this.atencion_presencial_sucursal);
        hash = 29 * hash + Objects.hashCode(this.tiempo_espera_consultas_sucursal);
        hash = 29 * hash + Objects.hashCode(this.reporte_tiempo_espera_sucursal);
        hash = 29 * hash + Objects.hashCode(this.soporte);
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
        final SucursalDTO other = (SucursalDTO) obj;
        if (!Objects.equals(this.nombre_sucursal, other.nombre_sucursal)) {
            return false;
        }
        if (!Objects.equals(this.atencion_presencial_sucursal, other.atencion_presencial_sucursal)) {
            return false;
        }
        if (!Objects.equals(this.soporte, other.soporte)) {
            return false;
        }
        if (!Objects.equals(this.id_sucursal, other.id_sucursal)) {
            return false;
        }
        if (!Objects.equals(this.seguridad_sucursal, other.seguridad_sucursal)) {
            return false;
        }
        if (!Objects.equals(this.tiempo_espera_consultas_sucursal, other.tiempo_espera_consultas_sucursal)) {
            return false;
        }
        if (!Objects.equals(this.reporte_tiempo_espera_sucursal, other.reporte_tiempo_espera_sucursal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SucursalDTO" 
        + "id_sucursal = " + id_sucursal 
        + ", nombre_sucursal = " + nombre_sucursal 
        + ", seguridad_sucursal = " + seguridad_sucursal 
        + ", atencion_presencial_sucursal = " + atencion_presencial_sucursal 
        + ", tiempo_espera_consultas_sucursal = " + tiempo_espera_consultas_sucursal 
        + ", reporte_tiempo_espera_sucursal = " + reporte_tiempo_espera_sucursal 
        + ", soporte = " + soporte;
    }

}
