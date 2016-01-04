import javax.swing.*;
import java.awt.*;

/**
 * Created by Dante on 04.01.2016.
 */
public class Potency extends JFrame {

    private JPanel panelik;
    private JLabel age;
    private JComboBox comboAge;
    private JComboBox comboTraining;
    private JFormattedTextField wristCircuit;
    private JComboBox comboHead;
    private JComboBox comboBaldness;
    private JComboBox comboNeck;
    private JButton goButton;
    private JLabel errorLabel;
    private JPanel errorPanel;

    public Potency() {
        super("Witam w mojej aplikacji!");
        setSize(new Dimension(500 , 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(panelik);
        errorPanel.setVisible(false);
        setVisible(true);
    }
}
