import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Crear departamento
        Departamento departamento = new Departamento(1, "Desarrollo");

        // Crear empleados
        EmpleadoPermanente emp1 = new EmpleadoPermanente(
                1, "Carlos López", "Programador",
                2000, 300, 5);

        EmpleadoTemporal emp2 = new EmpleadoTemporal(
                2, "Ana Torres", "Tester",
                new Date(), new Date(), 160);

        // Agregar empleados al departamento
        departamento.agregarEmpleado(emp1);
        departamento.agregarEmpleado(emp2);

        // Mostrar empleados
        departamento.mostrarDepartamento();

        // Crear reporte de desempeño
        ReporteDesempeño reporte = new ReporteDesempeño(
                1, new Date(), "Buen rendimiento");

        reporte.generarReporte();

        double metricas = reporte.calcularMetricas();
        System.out.println("Métricas calculadas: " + metricas);
    }
}