package co.edu.usbbog.dbd.fiesteroAndante.controller.logic;

import co.edu.usbbog.dbd.fiesteroAndante.controller.dao.EmpleadoDAO;
import co.edu.usbbog.dbd.fiesteroAndante.controller.dao.EmpleadoDAOImpl;
import co.edu.usbbog.dbd.fiesteroAndante.model.SucursalDTO;
import co.edu.usbbog.dbd.fiesteroAndante.model.EmpleadoDTO;
import java.util.List;

public class EmpleadoBO {

    private final EmpleadoDAO empleadoDAO;

    public EmpleadoBO() {
        this.empleadoDAO = new EmpleadoDAOImpl();
    }

    public String crearEmpleado(Integer id_empleado, String nombre_empleado, String profesion_empleado, Integer telefono_empleado, String correo_empleado, Double salario_empleado, String cargo, SucursalDTO sucursal) {
        return empleadoDAO.create(new EmpleadoDTO(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)) ? "Creado" : "No se creó";
    }

    public String modificarEmpleado(Integer id_empleado, String nombre_empleado, String profesion_empleado, Integer telefono_empleado, String correo_empleado, Double salario_empleado, String cargo, SucursalDTO sucursal) {
        return empleadoDAO.edit(new EmpleadoDTO(id_empleado, nombre_empleado, profesion_empleado, telefono_empleado, correo_empleado, salario_empleado, cargo, sucursal)) ? "Modificado" : "No se modificó";
    }

    public String eliminarEmpleado(Integer id_empleado) {
        return empleadoDAO.remove(id_empleado) ? "Eliminado" : "No se eliminó";
    }

    public EmpleadoDTO buscarEmpleado(Integer id_empleado) {
        return empleadoDAO.find(id_empleado);
    }

    public List<EmpleadoDTO> mostrarEmpleados() {
        return empleadoDAO.findAll();
    }
}