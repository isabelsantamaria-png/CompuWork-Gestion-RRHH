EmpleadoPermanente.java
public class EmpleadoPermanente extends Empleado {
    private double salarioBase;
    private double bonificacion;
    private int antiguedad;

    // CONSTRUCTOR
    public EmpleadoPermanente(int id, String nom, String car, double salario, double bono, int ant) {
        super(id, nom, car);
        this.salarioBase = salario;
        this.bonificacion = bono;
        this.antiguedad = ant;
    }

    @Override
    public double calcularDesempeño() {
       
 
        return Math.min(10.0, 5.0 + (antiguedad * 0.5));
    }

    public double calcularBonificacion() {
        return salarioBase + bonificacion;
    }
}
