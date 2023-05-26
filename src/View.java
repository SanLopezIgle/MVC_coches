public class View {

    public static void View(){
        GUI.createUIComponents();
    }

    /**
     * Muestra velocidad del coche
     * @param matricula del coche
     * @param v velocidad del coche
     * @return true cuando es correcto
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/hr";
        System.out.println(mensaje);
        Dialogo.main(mensaje);
        return true;
    }

    public static void mostrarDialogo(Coche coche) {
        String mensaje = "Alerta: ¡Velocidad excedida! Velocidad actual: " +  coche.velocidad + " km/hr";
        Dialogo.main(mensaje);
    }
}
