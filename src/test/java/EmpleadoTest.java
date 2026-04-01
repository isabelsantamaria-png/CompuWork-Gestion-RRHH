package com.miempresa.compuworksystem;


import com.miempresa.compuworksystem.model.Departamento;
import com.miempresa.compuworksystem.model.EmpleadoTemporal;
import com.miempresa.compuworksystem.model.EmpleadoPermanente;
import com.miempresa.compuworksystem.model.Empleado;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    @Test
    public void testNombreEmpleado() {

        Empleado emp = new EmpleadoPermanente(
                1, "Lucas Ramirez", "Tecnico", 600, 200, 9
        );

        assertEquals("Lucas Ramirez", emp.getNombre());
    }

    @Test
    public void testAgregarEmpleado() throws Exception {

        Departamento dep = new Departamento(1, "Operaciones");

        Empleado emp = new EmpleadoTemporal(
                2, "Adriana Ocampo", "Auxiliar", 100
        );

        dep.agregarEmpleado(emp);

        assertEquals(1, dep.listarEmpleados().size());
        
        
    }
    @Test
public void testActualizarEmpleado() throws Exception {

    Departamento dep = new Departamento(1, "Operaciones");

    Empleado emp = new EmpleadoPermanente(
            1, "Lucas Ramirez", "Tecnico", 600, 200, 9
    );

    dep.agregarEmpleado(emp);

    // Actualizar
    dep.actualizarEmpleado(1, "Lucas Ramirez", "Supervisor");

    // Verificar cambio
    Empleado actualizado = dep.listarEmpleados().get(0);

    assertEquals("Supervisor", actualizado.getCargo());
  }
@Test
public void testEliminarEmpleado() throws Exception {

    Departamento dep = new Departamento(1, "Operaciones");

    Empleado emp = new EmpleadoTemporal(
            2, "Adriana Ocampo", "Auxiliar", 100
    );

    dep.agregarEmpleado(emp);
    dep.eliminarEmpleado(2);

    assertEquals(0, dep.listarEmpleados().size());
}
 }
