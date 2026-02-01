package modelo;


public class Servicio {
    private int id;
    private String nombre;
    private int tiempoEstimado; 
    
    public Servicio(int id, String nombre, int tiempoEstimado) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoEstimado = tiempoEstimado;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }
    
    
    public double calcularCosto() {
        return 0.0; 
    }
    
    public void mostrarInfo() {
        System.out.println(nombre + " - " + tiempoEstimado + " minutos");
    }
}