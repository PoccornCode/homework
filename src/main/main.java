
package main;

import control.empleadoControl;
import javax.swing.SwingUtilities;
import vista.empleadoVista;

public class main {

    public static void main(String[] args) {
         SwingUtilities.invokeLater(()->{
             empleadoVista vista = new empleadoVista();
            empleadoControl control = new empleadoControl(vista);
            vista.setVisible(true);
        });
    }
    
}
