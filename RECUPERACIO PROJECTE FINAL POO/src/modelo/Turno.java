package modelo;

import java.util.Date;

public class Turno {
    private static int contador = 1;
    
    private int numero;
    private String estado; 
    private Usuario usuario;
    private Servicio servicio;
    private Date fechaCreacion;
    
    public Turno(Usuario usuario, Servicio servicio) {
        this.numero = contador++;
        this.usuario = usuario;
        this.servicio = servicio;
        this.estado = "PENDIENTE";
        this.fechaCreacion = new Date();
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public Servicio getServicio() {
        return servicio;
    }
    
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void llamar() {
        if (estado.equals("PENDIENTE")) {
            estado = "LLAMADO";
            usuario.recibirNotificacion("Turno #" + numero + " llamado. Venga al mostrador.");
        }
    }
    
    public void atender() {
        if (estado.equals("LLAMADO")) {
            estado = "ATENDIDO";
        }
    }
    
    public void cancelar() {
        estado = "CANCELADO";
    }
    
    public void mostrarInfo() {
        System.out.println("Turno #" + numero + 
                         " - " + usuario.getNombre() +
                         " - " + servicio.getNombre() +
                         " [" + estado + "]");
    }
}