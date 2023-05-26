import javax.swing.*;
import java.awt.event.*;

public class Dialogo extends JDialog {
    private JPanel contentPane;
    private JLabel mensaje;
    private JLabel Label;

    public Dialogo() {
        setContentPane(contentPane);
        setModal(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public static void main(String mensaje) {
        Dialogo dialog = new Dialogo();
        dialog.pack();
        dialog.mensaje.setText(mensaje);
        dialog.setVisible(true);
    }

    public static void mostrarDialogo(String mensaje){
        Dialogo dialog = new Dialogo();
        dialog.pack();
        dialog.mensaje.setText(mensaje);
        dialog.setVisible(true);
    }
}