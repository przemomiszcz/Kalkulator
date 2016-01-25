import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by Dante on 10.01.2016.
 */
public class ManResult extends JFrame{
    private JPanel manPanel;
    private JTextField armField;
    private JTextField forearmField;
    private JTextField chestField;
    private JTextField waistField;
    private JTextField heapField;
    private JTextField thighField;
    private JTextField calfField;
    private JTextField napeField;
    Double[] answer = new Double[8];

    public ManResult(Vector answers) {
        super("Stary, tak powinieneś wyglądać");
        IdealLogic il = new IdealLogic(answers, this);
        answer = il.returnManData();
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(manPanel);
        setVisible(true);
        setAnswers();
    }

    public void setAnswers() {
        napeField.setText(answer[0].toString());
        armField.setText(answer[1].toString());
        forearmField.setText(answer[2].toString());
        chestField.setText(answer[3].toString());
        waistField.setText(answer[4].toString());
        heapField.setText(answer[5].toString());
        thighField.setText(answer[6].toString());
        calfField.setText(answer[7].toString());
    }
}
