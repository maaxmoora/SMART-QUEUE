package modelo;

public class Turno {
    public int numero;
    public String estado;
    public Usuario usuario;
    public Servicio servicio;
    
    public Turno(int num, Usuario u, Servicio s) {
        this.numero = num;
        this.usuario = u;
        this.servicio = s;
        this.estado = "PENDIENTE";
    }
    
    // hem fet servir la IA per saber fer la transicio dels estats y misatges
    public void llamar() {
        this.estado = "LLAMADO";
        System.out.println("\n ATENCIÓN " + usuario.nombre + "!");
        System.out.println("   Tu turno " + numero + " ha sido llamado");
        System.out.println("   Dirígete al mostrador por favor");
    }
    
    public void finalizar() {
        this.estado = "ATENDIDO";
    }
    
    public int getNumero() {
        return numero;
    }
}
