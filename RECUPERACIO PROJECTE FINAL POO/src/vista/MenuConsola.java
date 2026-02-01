package vista;

public class MenuConsola {
    
    public void mostrarMenuPrincipal() {
        System.out.println("\n SMARTQUEUE ");
        System.out.println("1. Soy cliente (pedir turno)");
        System.out.println("2. Soy administrador");
        System.out.println("3. Salir");
        System.out.print("Seleccione: ");
    }
    
    public void mostrarMenuCliente() {
        System.out.println("\n SERVICIOS DISPONIBLES ");
        System.out.println("1. Atención al cliente (Gratis - 10 min)");
        System.out.println("2. Ventas (Gratis - 15 min)");
        System.out.println("3. Soporte técnico (Premium 25 euros - 30 min)");
        System.out.println("4. Consulta (Premium 15 euros - 20 min)");
        System.out.println("5. Volver atrás");
        System.out.print("Seleccione servicio: ");
    }
    
    public void mostrarMenuAdmin() {
        System.out.println("\n PANEL ADMINISTRADOR ");
        System.out.println("1. Llamar siguiente turno");
        System.out.println("2. Ver cola actual");
        System.out.println("3. Ver estadisticas");
        System.out.println("4. Cancelar un turno");
        System.out.println("5. Volver atras");
        System.out.print("Seleccione: ");
    }
    
    public void mostrarEncabezado(String titulo) {
        System.out.println("\n " + titulo + " ");
    }
    
    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}