package controlador;

import modelo.GestorCola;
import modelo.Servicio;
import modelo.Turno;
import modelo.Usuario;
import vista.VistaConsola;
import java.util.Scanner;

public class Controlador {
    private VistaConsola vista;
    private GestorCola gestor;
    private Servicio[] servicios;
    private Scanner sc;
    
    public Controlador() {
        this.vista = new VistaConsola();
        this.gestor = new GestorCola();
        this.sc = new Scanner(System.in);
        cargarServicios();
    }
    
    private void cargarServicios() {
        servicios = new Servicio[3];
        servicios[0] = new Servicio(1, "Atención al cliente", 5);
        servicios[1] = new Servicio(2, "Ventas", 10);
        servicios[2] = new Servicio(3, "Soporte técnico", 15);
    }
    
    // Ia per fer lo del bucle de MVC
    public void empezar() {
        boolean salir = false;
        
        while (!salir) {
            vista.mostrarMenu();
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    pedirTurno();
                    break;
                case 2:
                    llamarSiguiente();
                    break;
                case 3:
                    verCola();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    vista.error("Opción no válida");
            }
        }
        
        sc.close();
    }
    
    // ia per la validacio de la entrada del usuari
    private void pedirTurno() {
        vista.mostrarServicios();
        int op = sc.nextInt() - 1;
        
        if (op < 0 || op > 2) {
            vista.error("Servicio no existe");
            return;
        }
        
        System.out.print("Tu nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        
        Usuario user = new Usuario(1, nombre);
        Turno t = user.pedirTurno(servicios[op], gestor);
        
        System.out.println("Turno " + t.numero + " asignado a " + nombre);
        System.out.println("Servicio: " + servicios[op].getNombre());
    }
    
    private void llamarSiguiente() {
        Turno t = gestor.llamarSiguiente();
        if (t != null) {
            System.out.println("ATENDIENDO: " + t.usuario.nombre + " - Turno " + t.numero);
            System.out.println("Servicio: " + t.servicio.getNombre());
        } else {
            System.out.println(" No hay turnos para llamar. Crea un turno primero.");
        }
    }
    
    private void verCola() {
        System.out.println("\n ESTADO DE LA COLA:");
        gestor.mostrarCola();
    }
}
