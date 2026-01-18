package modelo;

public class Usuario {
    public int id;
    public String nombre;
    
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    // hem fet servir la IA aquí per ajudarnos per fer la relació
    public Turno pedirTurno(Servicio s, GestorCola g) {
        return g.crearTurno(this, s);
    }
    
    public void avisar() {
        System.out.println("    " + nombre + ", por favor acércate al mostrador");
    }
}
