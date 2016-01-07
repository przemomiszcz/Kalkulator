import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


/**
 * Created by Dante on 04.01.2016.
 */
public class Potency extends JFrame {

    private JPanel panelik;
    private JLabel age;
    private JComboBox comboAge;
    private JComboBox comboTraining;
    private JButton goButton;
    private JLabel errorLabel;
    private JPanel errorPanel;
    private JComboBox comboType;
    private JSlider wristCircuit;
    private JComboBox comboSex;
    private JButton wristResult;

    public Potency() {
        super("Witam w mojej aplikacji!");
        setSize(new Dimension(500 , 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(panelik);
        errorPanel.setVisible(false);
        setVisible(true);
        this.addFunctionality();
    }

    public void addFunctionality() {

        comboAge.addItem("");
        comboAge.addItem("18-25");
        comboAge.addItem("26-35");
        comboAge.addItem("36-45");
        comboAge.addItem("46-...");

        comboTraining.addItem("");
        comboTraining.addItem("<1");
        comboTraining.addItem("1-3");
        comboTraining.addItem("3-6");
        comboTraining.addItem(">6");

        comboType.addItem("");
        comboType.addItem("Ektomorfik");
        comboType.addItem("Mezomorfik");
        comboType.addItem("Endomorfik");

        comboSex.addItem("");
        comboSex.addItem("Mężczyzna");
        comboSex.addItem("Kobieta");

        Vector res = new Vector();
        res = this.getAnswers();
    }

    public Vector getAnswers() {
        Vector vector = new Vector();

        comboSex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sexAnswer = (String)comboSex.getSelectedItem();
                int s = comboSex.getSelectedIndex();
                //System.out.println(s);
            }
        });

        wristCircuit.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Integer s = wristCircuit.getValue();
                System.out.println(s);
                String str = s.toString();
                wristResult.setText(str);
            }
        });


        comboAge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ageAnswer = (String)comboAge.getSelectedItem();
                int s = comboSex.getSelectedIndex();
                //System.out.println(s);
            }
        });

        comboTraining.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String trainingAnswer = (String)comboTraining.getSelectedItem();
                int s = comboSex.getSelectedIndex();
                //System.out.println(s);
            }
        });

        comboType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String typeAnswer = (String)comboType.getSelectedItem();
                int s = comboSex.getSelectedIndex();
                //System.out.println(s);
            }
        });

        return vector;
    }
}
