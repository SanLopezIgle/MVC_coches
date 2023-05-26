import java.util.Observable;
import java.util.Observer;

public class ObsExceso {
    private static final int LIMITE_VELOCIDAD = 120;

    /**
     * Verifica si la velocidad excede el limite y muestra un dialogo de alerta
     * @param coche observado
     * @param velocidad actual del coche
     */
    public static void verificarVelocidad(Coche coche, int velocidad) {
        if (velocidad > LIMITE_VELOCIDAD) {
            String mensaje = "Alerta: ¡Velocidad excedida! Velocidad actual: " + velocidad + " km/hr";
            View.mostrarDialogo(coche);
        }
    }
}
