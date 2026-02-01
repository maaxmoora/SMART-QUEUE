package controlador;

import java.util.Scanner;
import modelo.*;
import vista.MenuConsola;

public class Sistema {
    private MenuConsola vista;
    private GestorCola gestor;
    private Scanner scanner;
    
    
    private Servicio[] servicios;
    
    public Sistema() {
        this.vista = new MenuConsola();
        this.gestor = new GestorCola();
        this.scanner = new Scanner(System.in);
        inicializarServicios();
    }
    
    private void inicializarServicios() {
        servicios = new Servicio[4];
        servicios[0] = new ServicioGratuito(1, "Atencion al cliente", 10);
        servicios[1] = new ServicioGratuito(2, "Ventas", 15);
        servicios[2] = new ServicioPremium(3, "Soporte tecnico", 30, 25.0);
        servicios[3] = new ServicioPremium(4, "Consulta", 20, 15.0);
    }
    
    public void iniciar() {
        boolean salir = false;
        
        while (!salir) {
            vista.mostrarMenuPrincipal();
            int opcion = leerEntero();
            
            switch (opcion) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuAdministrador();
                    break;
                case 3:
                    salir = true;
                    vista.mostrarMensaje("Gracias por usar SmartQueue");
                    break;
                default:
                    vista.mostrarError("Opcion no valida");
            }
        }
        
        scanner.close();
    }
    
    private void menuCliente() {
        boolean volver = false;
        
        while (!volver) {
            vista.mostrarMenuCliente();
            int opcion = leerEntero();
            
            if (opcion == 5) {
                volver = true;
                continue;
            }
            
            if (opcion < 1 || opcion > 4) {
                vista.mostrarError("Servicio no valido");
                continue;
            }
            
            
            System.out.print("Ingrese su nombre: ");
            scanner.nextLine(); 
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese su telefono: ");
            String telefono = scanner.nextLine();
            
            //ayuda de la ia para explicarnos como usar el poliformismo,ya que es lo que nos faltaba del otro proyecto, trantando a ServicioGratuito y 
            // ServicioPremium como Servicio accediendo a sus metodos comunes
            Usuario cliente = new Usuario(1, nombre, telefono);
            Servicio servicioSeleccionado = servicios[opcion - 1];
            
            Turno nuevoTurno = gestor.crearTurno(cliente, servicioSeleccionado);
            
            vista.mostrarEncabezado("TURNO ASIGNADO");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Telefono: " + cliente.getTelefono());
            System.out.println("Servicio: " + servicioSeleccionado.getNombre());
            System.out.println("Numero de turno: " + nuevoTurno.getNumero());
            System.out.println("Tiempo estimado: " + servicioSeleccionado.getTiempoEstimado() + " min");
            System.out.println("Precio: " + servicioSeleccionado.calcularCosto() + "euros");
            System.out.println("\nEspere a ser llamado. Gracias!\n");
            
            volver = true;
        }
    }
    
    private void menuAdministrador() {
        boolean volver = false;
        
        
        Administrador admin = new Administrador(1, "Admin", "ADM001");
        admin.mostrarInfo();
        
        while (!volver) {
            vista.mostrarMenuAdmin();
            int opcion = leerEntero();
            
            switch (opcion) {
                case 1:
                    Turno turnoLlamado = gestor.llamarSiguiente();
                    if (turnoLlamado != null) {
                        vista.mostrarEncabezado("TURNO LLAMADO");
                        turnoLlamado.mostrarInfo();
                    }
                    break;
                    
                case 2:
                    gestor.mostrarCola();
                    break;
                    
                case 3:
                    gestor.mostrarEstadisticas();
                    break;
                    
                case 4:
                    System.out.print("Ingrese numero de turno a cancelar: ");
                    int numTurno = leerEntero();
                    gestor.cancelarTurno(numTurno);
                    break;
                    
                case 5:
                    volver = true;
                    break;
                    
                default:
                    vista.mostrarError("Opción no valida");
            }
        }
    }
    
    private int leerEntero() {
        while (!scanner.hasNextInt()) {
            vista.mostrarError("Por favor ingrese un numero");
            scanner.next(); 
        }
        int valor = scanner.nextInt();
        return valor;
    }
}