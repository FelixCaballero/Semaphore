/**
 * Clase Coche
 * -----------
 * Representa un coche que intenta acceder al aparcamiento.
 * Cada coche se ejecuta como un hilo independiente.
 */
public class Coche extends Thread {
    private final int idCoche;
    private final Aparcamiento aparcamiento;

    /**
     * Constructor del coche.
     * @param idCoche Identificador único del coche.
     * @param aparcamiento Aparcamiento al que intentará acceder.
     */
    public Coche(int idCoche, Aparcamiento aparcamiento) {
        this.idCoche = idCoche;
        this.aparcamiento = aparcamiento;
    }

    /**
     * Método run()
     * -------------
     * Define el comportamiento del coche cuando se ejecuta como hilo.
     * Intenta aparcar, permanece un tiempo aleatorio y luego sale.
     */
    @Override
    public void run() {
        aparcamiento.entrar(idCoche);

        try {
            // Simula el tiempo que el coche pasa aparcado (entre 1 y 5 segundos)
            int tiempo = (int) (Math.random() * 5000) + 1000;
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        aparcamiento.salir(idCoche);
    }
}
