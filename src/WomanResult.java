import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by Dante on 10.01.2016.
 */
public class WomanResult extends JFrame{
    private JPanel womanPanel;
    private JTextField boobsField;
    private JTextField heapField;
    private JTextField waistField;
    private JTextField armsField;
    private JTextField neckField;
    private JTextField thighField;
    private JTextField kneeField;
    private JTextField culfField;
    private JTextField ancleField;
    private JTextField legField;
    private Double[] answer;

    public WomanResult(Vector answers) {
        super("Kobieto, powinnaś mieć takie wymiary");
        IdealLogic il = new IdealLogic(answers, this);
        answer = il.countWomenIdeal();
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(womanPanel);
        setVisible(true);
        setAnswers();
    }

    public void setAnswers() {
        boobsField.setText(answer[0].toString());
        heapField.setText(answer[1].toString());
        waistField.setText(answer[2].toString());
        armsField.setText(answer[3].toString());
        neckField.setText(answer[4].toString());
        thighField.setText(answer[5].toString());
        kneeField.setText(answer[6].toString());
        culfField.setText(answer[7].toString());
        ancleField.setText(answer[8].toString());
        legField.setText(answer[9].toString());
    }
}
