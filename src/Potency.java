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

    public Potency() {
        super("Witam w mojej aplikacji!");
        setSize(new Dimension(500 , 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(panelik);
        setVisible(true);
        this.answers = new Vector();
        for(int i = 0; i < 4; i++) {
            answers.add(0);
        }
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

        //comboSex.addItem("");
        //comboSex.addItem("Mężczyzna");
        //comboSex.addItem("Kobieta");

        //Vector res = new Vector();
        answers = this.getAnswers();
        //System.out.print(answers);

        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboAge.getSelectedIndex() == 0 || comboTraining.getSelectedIndex() == 0 ||
                        comboType.getSelectedIndex() == 0) {
                    //errorPanel.setVisible(true);
                    JOptionPane.showMessageDialog(new JFrame(), "Wypełnij wszystkie pola!", "Błąd!", JOptionPane.ERROR_MESSAGE);
                } else {
                    Integer s = wristCircuit.getValue();
                    //Integer d = (Integer)s;
                    String str = s.toString();
                    wristResult.setText(str);
                    answers.insertElementAt(s, 3);
                    System.out.print(answers);
                    ResultForm resform = new ResultForm(answers);
                    dispose();
                }
            }
        });

    }

    public Vector getAnswers() {
        //Vector answers = new Vector();

        /*comboSex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sexAnswer = (String)comboSex.getSelectedItem();
                int s = comboSex.getSelectedIndex();
                //System.out.println(s);
            }
        });*/

        wristCircuit.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int s = wristCircuit.getValue();
                //System.out.println(s);
                Integer i = (Integer) s;
                String str = i.toString();
                wristResult.setText(str);
                //answers.add(s);
            }
        });


        comboAge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ageAnswer = (String)comboAge.getSelectedItem();
                int s = comboAge.getSelectedIndex();
                //System.out.println(s);
                answers.add(s);
            }
        });

        comboTraining.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String trainingAnswer = (String)comboTraining.getSelectedItem();
                int s = comboTraining.getSelectedIndex();
                //System.out.println(s);
                answers.add(s);
            }
        });

        comboType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String typeAnswer = (String)comboType.getSelectedItem();
                int s = comboType.getSelectedIndex();
                //System.out.println(s);
                answers.add(s);
            }
        });


        //System.out.print(answers);
        return answers;
    }
}
