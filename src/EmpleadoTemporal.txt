EmpleadoTemporal
package com.miempresa.compuworksystem.model;

import com.miempresa.compuworksystem.model.Empleado;
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
