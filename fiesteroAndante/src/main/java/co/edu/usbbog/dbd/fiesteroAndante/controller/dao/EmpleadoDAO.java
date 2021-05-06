package co.edu.usbbog.dbd.fiesteroAndante.controller.dao;

import co.edu.usbbog.dbd.fiesteroAndante.model.EmpleadoDTO;
import java.util.List;

public interface EmpleadoDAO {

    public boolean create(EmpleadoDTO empleado);
    public boolean edit(EmpleadoDTO empleado);
    public boolean remove(Integer cedula);
    public EmpleadoDTO find(Integer cedula);
    public List<EmpleadoDTO> findAll();
    public int count();
}
