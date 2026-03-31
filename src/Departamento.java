DEPARTAMENTO

import com.miempresa.compuworksystem.model.Empleado;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
   
    private int idDepartamento;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(int id, String nombre) {
        this.idDepartamento = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) throws Exception {
        if (e == null) throw new Exception("Empleado no válido.");
        this.empleados.add(e);
        System.out.println("Empleado " + e.getNombre() + " asignado a " + this.nombre);
    }

    // Actualización de registros
    public void actualizarEmpleado(int id, String nuevoNombre, String nuevoCargo) {
        for (Empleado e : empleados) {
            if (e.getIdEmpleado() == id) {
                e.setNombre(nuevoNombre);
                e.setCargo(nuevoCargo);
                System.out.println("Registro ID " + id + " actualizado con éxito.");
                return;
            }
        }
        System.out.println("No se encontró el empleado con ID: " + id);
    }

    //  Eliminación de registros
    public void eliminarEmpleado(int id) {
        boolean eliminado = empleados.removeIf(e -> e.getIdEmpleado() == id);
        if (eliminado) {
            System.out.println("Empleado ID " + id + " eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar: ID no encontrado.");
        }
    }

    // Visualización de empleados asignados
    public void mostrarNomina() {
        System.out.println("\n--- NÓMINA DE " + nombre.toUpperCase() + " ---");
        for (Empleado e : empleados) {
            System.out.println(e.obtenerDatos());
        }
    }

    public List<Empleado> listarEmpleados() { return empleados; }
}
