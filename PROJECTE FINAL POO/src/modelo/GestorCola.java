package modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorCola {
    public List<Turno> cola;
    public int contador;
    
    public GestorCola() {
        this.cola = new ArrayList<>();
        this.contador = 1;
    }
    // IA per la implementacio de la creacio de torns
    public Turno crearTurno(Usuario u, Servicio s) {
        Turno t = new Turno(contador, u, s);
        contador++;
        cola.add(t);
        return t;
    }
    
    // Ia per ajudar a fer la logica fifo
    public Turno llamarSiguiente() {
        if (cola.isEmpty()) {
            return null;
        }
        
        Turno siguiente = cola.get(0);
        cola.remove(0);
        siguiente.llamar();
        siguiente.usuario.avisar();
        return siguiente;
    }
    
    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
            System.out.println("Prueba a crear un turno primero (Opción 1)");
            return;
        }
        
        System.out.println("Hay " + cola.size() + " turno(s) en espera:");
        for (Turno t : cola) {
            System.out.println("  Turno " + t.numero + " - " + t.usuario.nombre + 
                             " [" + t.estado + "] - " + t.servicio.getNombre());
        }
    }
}
