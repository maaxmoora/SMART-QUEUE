package modelo;

public class Servicio {
    public int id;
    public String nombre;
    public int tiempo;
    
    public Servicio(int id, String nombre, int tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public String getNombre() {
        return nombre;
    }
}