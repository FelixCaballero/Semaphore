/**
 * Clase PrincipalParking
 * -----------------------
 * Punto de entrada del programa.
 * Crea el aparcamiento y lanza varios hilos (coches)
 * para simular el acceso concurrente.
 */
public class PrincipalParking {

    public static void main(String[] args) {
        final int NUM_PLAZAS = 3;
        final int NUM_COCHES = 7;

        // Crea un aparcamiento con 3 plazas disponibles
        Aparcamiento aparcamiento = new Aparcamiento(NUM_PLAZAS);

        // Crea y lanza 7 coches (hilos)
        for (int i = 1; i <= NUM_COCHES; i++) {
            Coche coche = new Coche(i, aparcamiento);
            coche.start();
        }
    }
}
