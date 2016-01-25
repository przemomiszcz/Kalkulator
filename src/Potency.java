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
    private JComboBox comboType;
    private JSlider wristCircuit;
    private JButton wristResult;
    private Vector answers;
    private int[] tmpTable = new int[4];

    public Potency() {
        super("Powiedz mi coś o sobie a powiem Ci do czego jesteś zdolny");
        setSize(new Dimension(500 , 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(panelik);
        setVisible(true);
        this.answers = new Vector();
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

        this.getAnswers();
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboAge.getSelectedIndex() == 0 || comboTraining.getSelectedIndex() == 0 ||
                        comboType.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Wypełnij wszystkie pola!", "Błąd!", JOptionPane.ERROR_MESSAGE);
                } else {
                    for(int i = 0; i < 4; i++) {
                        answers.add(tmpTable[i]);
                    }
                    System.out.print(answers);
                    ResultForm resform = new ResultForm(answers);
                    dispose();
                }
            }
        });

    }

    public void getAnswers() {


        wristCircuit.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int s = wristCircuit.getValue();
                Integer i = (Integer) s;
                String str = i.toString();
                wristResult.setText(str);
                tmpTable[3] = s;
            }
        });


        comboAge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int s = comboAge.getSelectedIndex();
                tmpTable[0] = s;
            }
        });

        comboTraining.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int s = comboTraining.getSelectedIndex();
                tmpTable[1] = s;
            }
        });

        comboType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int s = comboType.getSelectedIndex();
                tmpTable[2] = s;
            }
        });

    }
}
