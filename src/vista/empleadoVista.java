
package vista;

import java.awt.*;
import javax.swing.*;

public class empleadoVista extends JFrame{
    private JTextField txtDui;
    private JTextField txtNombreEmpleado;
    private JTextField txtEmail;
    private JRadioButton rbTemp;
    private JRadioButton rbPerm;
    private JComboBox<String> combProfesion;
    private JSpinner spinnerFecha;
    
    public empleadoVista(){
        setTitle("EmpleadoLayaoutFormulario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        txtDui = new JTextField(20);
        txtEmail = new JTextField(20);
        txtNombreEmpleado = new JTextField(20);
        rbPerm = new JRadioButton("Permanente");
        rbTemp = new JRadioButton("Temporal");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbTemp);
        buttonGroup.add(rbPerm);
        combProfesion = new JComboBox<>(new String[]{
            "Ingeniero","Licenciado","tecnico"
        });
        spinnerFecha = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinnerFecha,"dd/MM/yyyy");
        spinnerFecha.setEditor(editor);
        
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));
        panel.setBorder(BorderFactory.createTitledBorder("Datos del empleado"));
        panel.setBackground(new Color(230,230,230));
        
        panel.add(new JLabel("Dui del Empleado"));
        panel.add(txtDui);
        panel.add(new JLabel("Nombre del Empleado"));
        panel.add(txtNombreEmpleado);
        panel.add(new JLabel("Email del Empleado"));
        panel.add(txtEmail);
        panel.add(new JLabel("Tipo de Contrato"));
        panel.add(rbPerm);
        panel.add(rbTemp);
        panel.add(new JLabel("Profesion"));
        panel.add(combProfesion);
        panel.add(new JLabel("Fecha de Contrato"));
        panel.add(spinnerFecha);
        add(panel);
        pack();
    }
}
