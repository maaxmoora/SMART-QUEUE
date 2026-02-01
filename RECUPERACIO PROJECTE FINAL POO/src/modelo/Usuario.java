package modelo;


public class Usuario extends Persona {
    private String telefono;
    
    public Usuario(int id, String nombre, String telefono) {
        super(id, nombre); 
        this.telefono = telefono;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Telefono: " + telefono);
    }
    
    
    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + getNombre() + ": " + mensaje);
    }
}