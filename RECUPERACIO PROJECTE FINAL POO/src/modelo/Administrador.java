package modelo;


public class Administrador extends Persona {
    private String codigoEmpleado;
    
    public Administrador(int id, String nombre, String codigoEmpleado) {
        super(id, nombre);
        this.codigoEmpleado = codigoEmpleado;
    }
    
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }
    
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Código empleado: " + codigoEmpleado);
    }
    
    
    public void gestionarSistema() {
        System.out.println(getNombre() + " está gestionando el sistema...");
    }
}