import java.util.ArrayList;
import java.util.*;

public class Model extends Observable {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public static Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     *
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public Integer cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        setChanged();
        //notificamos a los observadores
        notifyObservers(getCoche(matricula));
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Sube la velocidad que queramos
     * @param matricula del coche
     * @param v velocidad a aumentar
     * @return velocidad actualizada
     */
    public static Integer subirVelocidad(String matricula, Integer v){
        /*getCoche(matricula).velocidad = v + getCoche(matricula).velocidad;
        return getCoche(matricula).velocidad;
        */
        Coche coche = getCoche(matricula);
        int nuevaVelocidad = coche.velocidad + v;
        coche.velocidad = nuevaVelocidad;

        ObsExceso.verificarVelocidad(coche, nuevaVelocidad);

        return nuevaVelocidad;
    }

    /**
     * Baja la velocidad que queramos
     * @param matricula del coche
     * @param v velocidad a reducir
     * @return velocidad actualizada
     */
    public static Integer bajarVelocidad(String matricula, Integer v){
        /*
        getCoche(matricula).velocidad = getCoche(matricula).velocidad - v;
        return getCoche(matricula).velocidad;
        */
        Coche coche = getCoche(matricula);
        int nuevaVelocidad = coche.velocidad - v;
        coche.velocidad = nuevaVelocidad;

        ObsExceso.verificarVelocidad(coche, nuevaVelocidad);

        return nuevaVelocidad;
    }

    /**
     * Devuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
