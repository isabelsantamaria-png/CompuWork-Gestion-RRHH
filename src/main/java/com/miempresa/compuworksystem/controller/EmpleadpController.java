package com.miempresa.compuworksystem.controller;

import com.miempresa.compuworksystem.model.*;

public class EmpleadoController {

    private Departamento dep;

    public EmpleadoController() {
        dep = new Departamento(1, "Operaciones");
    }

    public void agregarEmpleado(Empleado emp) throws Exception {
        dep.agregarEmpleado(emp);
    }

    public void eliminarEmpleado(int id) throws Exception {
        dep.eliminarEmpleado(id);
    }

    public void actualizarEmpleado(int id, String nombre, String cargo) throws Exception {
        dep.actualizarEmpleado(id, nombre, cargo);
    }

    public java.util.List<Empleado> listarEmpleados() {
        return dep.listarEmpleados();
    }

    public void reporteIndividual() {
        if (!dep.listarEmpleados().isEmpty()) {
            Empleado emp = dep.listarEmpleados().get(0);
            ReporteDesempeno r = new ReporteDesempeno(700);
            r.generarReporteIndividual(emp);
        }
    }

    public void reporteDepartamento() {
        ReporteDesempeno r = new ReporteDesempeno(700);
        r.generarReporteDepartamento(dep);
    }
}

