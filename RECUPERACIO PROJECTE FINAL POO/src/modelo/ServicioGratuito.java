package modelo;


public class ServicioGratuito extends Servicio {
    
    public ServicioGratuito(int id, String nombre, int tiempoEstimado) {
        super(id, nombre, tiempoEstimado);
    }
    
    
    @Override
    public double calcularCosto() {
        return 0.0; 
    }
    
    @Override
    public void mostrarInfo() {
        System.out.print("[GRATIS] ");
        super.mostrarInfo();
    }
}