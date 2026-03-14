import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private int idDepartamento;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(int idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // Agregar empleado
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // Eliminar empleado
    public void eliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    // Listar empleados
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    // Mostrar información
    public void mostrarDepartamento() {
        System.out.println("Departamento: " + nombre);
        for (Empleado e : empleados) {
            System.out.println(e.obtenerDatos());
        }
    }
}