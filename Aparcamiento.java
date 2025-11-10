import java.util.concurrent.Semaphore;

/**
 * Clase Aparcamiento
 * -------------------
 * Representa un aparcamiento con un número limitado de plazas.
 * Utiliza un objeto Semaphore para controlar el acceso concurrente
 * de varios coches al mismo tiempo.
 */
public class Aparcamiento {
    // Semáforo que controla el número de plazas disponibles
    private final Semaphore plazas;

    /**
     * Constructor de la clase Aparcamiento.
     * @param numeroPlazas Número máximo de coches que pueden aparcar simultáneamente.
     */
    public Aparcamiento(int numeroPlazas) {
        plazas = new Semaphore(numeroPlazas);
    }

    /**
     * Método que simula que un coche intenta aparcar.
     * Si hay plazas disponibles, el coche puede entrar.
     * Si no, debe esperar hasta que quede una libre.
     * @param idCoche Identificador del coche.
     */
    public void entrar(int idCoche) {
        try {
            System.out.println("Coche " + idCoche + " intenta aparcar...");
            plazas.acquire(); // Solicita permiso para entrar
            System.out.println("🚗 Coche " + idCoche + " ha aparcado. Plazas libres: " + plazas.availablePermits());
        } catch (InterruptedException e) {
            System.out.println("Coche " + idCoche + " fue interrumpido mientras esperaba plaza.");
        }
    }

    /**
     * Método que simula que un coche sale del aparcamiento y libera una plaza.
     * @param idCoche Identificador del coche.
     */
    public void salir(int idCoche) {
        System.out.println("🚙 Coche " + idCoche + " sale del aparcamiento.");
        plazas.release(); // Libera una plaza
        System.out.println("Plazas libres ahora: " + plazas.availablePermits());
    }
}
