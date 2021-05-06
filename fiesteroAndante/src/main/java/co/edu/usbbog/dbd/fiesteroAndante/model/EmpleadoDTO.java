package co.edu.usbbog.dbd.fiesteroAndante.model;

import java.util.Objects;

public class EmpleadoDTO {
    
    private Integer id_empleado;
    private String nombre_empleado;
    private String profesion_empleado;
    private Integer telefono_empleado;
    private String correo_empleado;
    private Double salario_empleado;
    private String cargo;
    //relacion
    private SucursalDTO sucursal;

    public EmpleadoDTO() {
        this.id_empleado = 0;
        this.nombre_empleado = "";
        this.profesion_empleado = "";
        this.telefono_empleado = 0;
        this.correo_empleado = "";
        this.salario_empleado = 0.0;
        this.cargo = "";
        this.sucursal = new SucursalDTO();
    }

    public EmpleadoDTO(Integer id_empleado) {
        this.id_empleado = id_empleado;
        this.nombre_empleado = "";
        this.profesion_empleado = "";
        this.telefono_empleado = 0;
        this.correo_empleado = "";
        this.salario_empleado = 0.0;
        this.cargo = "";
        this.sucursal = new SucursalDTO();
    }

    public EmpleadoDTO(Integer id_empleado, String nombre_empleado, String profesion_empleado, Integer telefono_empleado, String correo_empleado, Double salario_empleado, String cargo) {
        this.id_empleado = id_empleado;
        this.nombre_empleado = nombre_empleado;
        this.profesion_empleado = profesion_empleado;
        this.telefono_empleado = telefono_empleado;
        this.correo_empleado = correo_empleado;
        this.salario_empleado = salario_empleado;
        this.cargo = cargo;
        this.sucursal = new SucursalDTO();
        
    }  
    
    public EmpleadoDTO(Integer id_empleado, String nombre_empleado, String profesion_empleado, Integer telefono_empleado, String correo_empleado, Double salario_empleado, String cargo, SucursalDTO sucursal) {
        this.id_empleado = id_empleado;
        this.nombre_empleado = nombre_empleado;
        this.profesion_empleado = profesion_empleado;
        this.telefono_empleado = telefono_empleado;
        this.correo_empleado = correo_empleado;
        this.salario_empleado = salario_empleado;
        this.cargo = cargo;
        this.sucursal = sucursal;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getProfesion_empleado() {
        return profesion_empleado;
    }

    public void setProfesion_empleado(String profesion_empleado) {
        this.profesion_empleado = profesion_empleado;
    }

    public Integer getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(Integer telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    public String getCorreo_empleado() {
        return correo_empleado;
    }

    public void setCorreo_empleado(String correo_empleado) {
        this.correo_empleado = correo_empleado;
    }

    public Double getSalario_empleado() {
        return salario_empleado;
    }

    public void setSalario_empleado(Double salario_empleado) {
        this.salario_empleado = salario_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
       
     public SucursalDTO getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalDTO sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id_empleado);
        hash = 67 * hash + Objects.hashCode(this.nombre_empleado);
        hash = 67 * hash + Objects.hashCode(this.profesion_empleado);
        hash = 67 * hash + Objects.hashCode(this.telefono_empleado);
        hash = 67 * hash + Objects.hashCode(this.correo_empleado);
        hash = 67 * hash + Objects.hashCode(this.salario_empleado);
        hash = 67 * hash + Objects.hashCode(this.cargo);
        hash = 67 * hash + Objects.hashCode(this.sucursal);
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
        final EmpleadoDTO other = (EmpleadoDTO) obj;
        if (!Objects.equals(this.nombre_empleado, other.nombre_empleado)) {
            return false;
        }
        if (!Objects.equals(this.profesion_empleado, other.profesion_empleado)) {
            return false;
        }
        if (!Objects.equals(this.correo_empleado, other.correo_empleado)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.id_empleado, other.id_empleado)) {
            return false;
        }
        if (!Objects.equals(this.telefono_empleado, other.telefono_empleado)) {
            return false;
        }
        if (!Objects.equals(this.salario_empleado, other.salario_empleado)) {
            return false;
        }
        if (!Objects.equals(this.sucursal, other.sucursal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO{" + "id_empleado=" + id_empleado + ", nombre_empleado=" + nombre_empleado + ", profesion_empleado=" + profesion_empleado + ", telefono_empleado=" + telefono_empleado + ", correo_empleado=" + correo_empleado + ", salario_empleado=" + salario_empleado + ", cargo=" + cargo + '}';
    }

        
}
