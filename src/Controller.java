public class Controller {

    /**
     * Llama al metodo view() de la clase View
     * @param args
     */
    public static void main(String[] args) {
        View.View();
    }

    /**
     * Metodo que llama al metodo crearCoche() de la clase Model
     * @param modelo del coche
     * @param matricula del coche
     */
    public static void crearButton(String modelo, String matricula) {
        Coche aux = Model.crearCoche(modelo, matricula);
        if (aux != null) View.muestraVelocidad(aux.matricula, aux.velocidad);
    }

    /**
     * Metodo que llama al metodo subirVelocidad() de la clase Model
     * @param matricula del coche
     * @param v velocidad del coche
     * @return un objeto Integer que indica la velocidad
     */
    public static Integer subirButton(String matricula, Integer v) {
        Integer aux = Model.subirVelocidad(matricula, v);
        if (aux != null) View.muestraVelocidad(matricula, aux);
        return aux;
    }

    /**
     * Metodo que llama al metodo bajarVelocidad() de la clase Model
     * @param matricula del coche
     * @param v velocidad del coche
     * @return un objeto Integer que indica la velocidad
     */
    public static Integer bajarButton(String matricula, Integer v) {
        Integer aux = Model.bajarVelocidad(matricula, v);
        if (aux != null) View.muestraVelocidad(matricula, aux);
        return aux;
    }


        /*
        Model miModelo = new Model();
        View miVista = new View();

        // Crear tres coches

        miModelo.crearCoche("LaFerrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = miModelo.getCoche("SBC 1234");
        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 30);
        //subir velocidad
        miModelo.subirVelocidad("SBC 1234", 30);
        //bajar velocidad
        miModelo.bajarVelocidad("SBC 1234", 10);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miVista.muestraVelocidad("SBC 1234", miModelo.getVelocidad("SBC 1234"));

        System.out.println(hecho);
        */
}