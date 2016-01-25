import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * Created by Dante on 04.01.2016.
 */
public class Ideal extends JFrame{
    private JButton goButton;
    private JPanel panelik;
    private JComboBox comboType;
    private JComboBox comboSex;
    private JTextField heightField;
    private JTextField weightField;
    private Vector answers;
    private int[] tmpTable = new int[4];

    public Ideal() {
        super("Obliczanie idealnych wymiarów");
        setSize(new Dimension(500 , 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(panelik);
        setVisible(true);
        this.answers = new Vector();
        this.addFunctionality();
    }

    public void addFunctionality() {
        comboSex.addItem("");
        comboSex.addItem("Mężczyzna");
        comboSex.addItem("Kobieta");

        comboType.addItem("");
        comboType.addItem("Ektomorfik");
        comboType.addItem("Mezomorfik");
        comboType.addItem("Endomorfik");

        this.getAnswers();
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String weight = weightField.getText();
                String height = heightField.getText();

                if(!ifNumber(weight) || !ifNumber(height)) {
                    JOptionPane.showMessageDialog(new JFrame(), "Wpisz cyfry!", "Błąd!", JOptionPane.ERROR_MESSAGE);
                } else if(heightField.getText().equals("") || weightField.getText().equals("") ||
                        comboSex.getSelectedIndex() == 0 || comboType.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Wypełnij wszystkie pola!", "Błąd!", JOptionPane.ERROR_MESSAGE);
                } else {
                    String heightAnswer = heightField.getText();
                    int s = Integer.parseInt(heightAnswer);
                    tmpTable[0] = s;

                    String weightAnswer = weightField.getText();
                    int d = Integer.parseInt(weightAnswer);
                    tmpTable[1] = d;

                    for(int i = 0; i < 4; i++) {
                        answers.add(tmpTable[i]);
                    }
                    System.out.println(answers);

                    if(comboSex.getSelectedIndex() == 1) {
                        ManResult mr = new ManResult(answers);
                        dispose();
                    }
                    if (comboSex.getSelectedIndex() == 2) {
                        if(Integer.parseInt(height) > 178 || Integer.parseInt(height) < 156) {
                            JOptionPane.showMessageDialog(new JFrame(), "Podaj wzrost w dopuszczalnym zakresie(156-178)", "Błąd", JOptionPane.ERROR_MESSAGE);
                            answers.clear();
                        } else {
                            WomanResult wr = new WomanResult(answers);
                            dispose();
                        }
                    }
                }
            }
        });

    }

    public boolean ifNumber(String toCheck) {
        boolean result = true;
        for(int i = 0; i <toCheck.length(); i++) {
            if((int)toCheck.charAt(i) < 48 || (int)toCheck.charAt(i) > 57) {
                result = false;
            }
        }

        return result;
    }

    public void getAnswers() {

        comboType.addActionListener(e -> {
            int s = comboType.getSelectedIndex();
            tmpTable[2] = s;
        });

        comboSex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int s = comboSex.getSelectedIndex();
                tmpTable[3] = s;
            }
        });

    }
}
