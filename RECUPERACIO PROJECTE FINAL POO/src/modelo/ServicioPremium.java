package modelo;


public class ServicioPremium extends Servicio {
    private double precio;
    
    public ServicioPremium(int id, String nombre, int tiempoEstimado, double precio) {
        super(id, nombre, tiempoEstimado);
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    
    @Override
    public double calcularCosto() {
        return precio;
    }
    
    
    public double calcularCosto(boolean conDescuento) {
        if (conDescuento) {
            return precio * 0.8; 
        }
        return precio;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.print("[PREMIUM " + precio + "euros] ");
        super.mostrarInfo();
    }
}