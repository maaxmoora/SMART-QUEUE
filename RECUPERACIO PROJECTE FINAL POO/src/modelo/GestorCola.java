package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorCola {
    private List<Turno> cola;
    private List<Turno> historial;
    
    public GestorCola() {
        this.cola = new ArrayList<>();
        this.historial = new ArrayList<>();
    }
    
    public Turno crearTurno(Usuario usuario, Servicio servicio) {
        Turno nuevoTurno = new Turno(usuario, servicio);
        cola.add(nuevoTurno);
        historial.add(nuevoTurno);
        System.out.println("Turno #" + nuevoTurno.getNumero() + " creado para " + usuario.getNombre());
        return nuevoTurno;
    }
     // ayuda de la ia para hacer lo de la logica dcel fifo con arraylist, es decir, que el primer turno en entrar sea el primero en irse
    public Turno llamarSiguiente() {
        if (cola.isEmpty()) {
            System.out.println("No hay turnos en la cola");
            return null;
        }
        
        Turno siguiente = cola.get(0);
        cola.remove(0);
        siguiente.llamar();
        return siguiente;
    }
    
    public void cancelarTurno(int numeroTurno) {
        for (Turno turno : cola) {
            if (turno.getNumero() == numeroTurno) {
                turno.cancelar();
                cola.remove(turno);
                System.out.println("Turno #" + numeroTurno + " cancelado");
                return;
            }
        }
        System.out.println("Turno #" + numeroTurno + " no encontrado");
    }
    
    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
            return;
        }
        
        System.out.println("\n COLA DE ESPERA ");
        for (Turno turno : cola) {
            turno.mostrarInfo();
        }
        System.out.println("Total: " + cola.size() + " turnos\n");
    }
    
    public void mostrarEstadisticas() {
        System.out.println("\n ESTADÍSTICAS ");
        System.out.println("Turnos en cola: " + cola.size());
        System.out.println("Turnos totales: " + historial.size());
        
        int atendidos = 0;
        int cancelados = 0;
        
        for (Turno turno : historial) {
            if (turno.getEstado().equals("ATENDIDO")) {
                atendidos++;
            } else if (turno.getEstado().equals("CANCELADO")) {
                cancelados++;
            }
        }
        
        System.out.println("Turnos atendidos: " + atendidos);
        System.out.println("Turnos cancelados: " + cancelados + "\n");
    }
    
    public List<Turno> getCola() {
        return new ArrayList<>(cola);
    }
}