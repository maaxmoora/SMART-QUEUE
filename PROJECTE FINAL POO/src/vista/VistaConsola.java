package vista;

public class VistaConsola {
    
    public void mostrarMenu() {
        System.out.println("\n MENU SMARTQUEUE ");
        System.out.println("1.Pedir turno");
        System.out.println("2.Llamar siguiente");
        System.out.println("3.Ver cola");
        System.out.println("4.Salir");
        System.out.print("Elige: ");
    }
    
    public void mostrarServicios() {
        System.out.println("\nServicios disponibles:");
        System.out.println("1.Atención al cliente (5 min)");
        System.out.println("2.Ventas (10 min)");
        System.out.println("3.Soporte técnico (15 min)");
        System.out.print("Elige servicio: ");
    }
    
    public void error(String msg) {
        System.out.println("ERROR: " + msg);
    }
    
    public void mensaje(String msg) {
        System.out.println(msg);
    }
}