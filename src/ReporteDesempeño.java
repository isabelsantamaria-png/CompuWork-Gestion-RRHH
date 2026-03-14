import java.util.Date;

public class ReporteDesempeño {

    private int idReporte;
    private Date fecha;
    private String resultado;

    public ReporteDesempeño(int idReporte, Date fecha, String resultado) {
        this.idReporte = idReporte;
        this.fecha = fecha;
        this.resultado = resultado;
    }

    // Generar reporte
    public void generarReporte() {
        System.out.println("Reporte ID: " + idReporte);
        System.out.println("Fecha: " + fecha);
        System.out.println("Resultado: " + resultado);
    }

    // Calcular métricas (ejemplo simple)
    public double calcularMetricas() {
        return Math.random() * 100;
    }
}