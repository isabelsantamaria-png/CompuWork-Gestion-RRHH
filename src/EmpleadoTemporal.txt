EmpleadoTemporal.java

import java.util.Date;

public class EmpleadoTemporal extends Empleado {
    private Date fechaInicio;
    private Date fechaFin;
    private int horasTrabajadas;

    // CONSTRUCTOR
    public EmpleadoTemporal(int id, String nom, String car, int horas) {
        super(id, nom, car);
        this.horasTrabajadas = horas;
        this.fechaInicio = new Date(); 
    }

    @Override
    public double calcularDesempeño() {
        // Cumplimiento de horas
        return horasTrabajadas >= 160 ? 10.0 : 7.0;
    }

    public double calcularPagoTemporal() {
        return horasTrabajadas * 30.0; 
    }
}
