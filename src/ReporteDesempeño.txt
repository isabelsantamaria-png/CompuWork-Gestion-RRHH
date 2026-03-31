 ReporteDesempeno
package com.miempresa.compuworksystem.model;


import com.miempresa.compuworksystem.model.Departamento;
import com.miempresa.compuworksystem.model.Empleado;
import java.util.Date;

public class ReporteDesempeno {
    private int idReporte;
    private Date fecha;

    public ReporteDesempeno(int idReporte) {
        this.idReporte = idReporte;
        this.fecha = new Date();
    }

    public void generarReporteIndividual(Empleado e) {
        try {
            double puntaje = e.calcularDesempeño();
            System.out.println("\n--- REPORTE INDIVIDUAL ---");
            System.out.println("Empleado: " + e.getNombre() + " | Puntaje: " + puntaje);
            System.out.println("Resultado: " + (puntaje >= 8.0 ? "Sobresaliente" : "Promedio"));
        } catch (Exception ex) {
            System.out.println("Error al generar reporte: " + ex.getMessage());
        }
    }

    public void generarReporteDepartamento(Departamento depto) {
        double suma = 0;
        if (depto.listarEmpleados().isEmpty()) return;

        for (Empleado e : depto.listarEmpleados()) {
            suma += e.calcularDesempeño();
        }
        double promedio = suma / depto.listarEmpleados().size();
        System.out.println("\n--- REPORTE DEPARTAMENTAL ---");
        System.out.println("Promedio de desempeño grupal: " + promedio);
    }
}
