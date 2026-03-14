Empleado.java
public abstract class Empleado {
    private int idEmpleado;
    private String nombre;
    private String cargo;

    public Empleado(int idEmpleado, String nombre, String cargo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public abstract double calcularDesempeño();

    public String obtenerDatos() {
        return "ID: " + idEmpleado + " | Nombre: " + nombre + " | Cargo: " + cargo;
    }

    
    public int getIdEmpleado() { return idEmpleado; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }

   
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
