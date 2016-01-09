import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by Dante on 07.01.2016.
 */
public class ResultForm extends JFrame {
    private JPanel resultPanel;
    private JTextField szacunkowyRocznyPotencjałWzrostuTextField;
    private JTextField resultField;
    private JTextField potencjałWzrostuMięśniWTextField;
    private JTextField chestField;
    private JTextField heapField;
    private JTextField neckField;
    private JTextField armField;
    private JTextField kneeField;
    private JTextField forearmField;
    private JTextField biodraField;
    private JTextField talyField;


    public ResultForm(Vector answers) {
        super("Witam w mojej aplikacji!");
        PotencyLogic pl = new PotencyLogic(answers, this);
        pl.countCircuits();
        pl.chooseGain();
        //infoPane1.setContentType("Szacunkowy roczny potencjał wzrostu masy mięśniowej w zależności od wieku, stażu treningowego oraz typu budowy ciała");
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(resultPanel);
        setVisible(true);
        //resultField.setText("Tu wpisze ile kilogramow" + "kg");
    }

    private void createUIComponents() {
        resultField = new JTextField();
    }


    public void setBiodraField(double s) {
        this.biodraField.setText(""+s);
    }

    public void setTalyField(double s) {
        this.talyField.setText("" + s );
    }

    public void setResultField(double s) {
        this.resultField.setText("" + s );
    }

    public void setChestField(double s ) {
        this.chestField.setText("" + s );
    }

    public void setHeapField(double s ) {
        this.heapField.setText("" + s );
    }

    public void setNeckField(double s ) {
        this.neckField.setText("" + s );
    }

    public void setArmField(double s ) {
        this.armField.setText("" + s );
    }

    public void setKneeField(double s ) {
        this.kneeField.setText("" + s );
    }

    public void setForearmField(double s ) {
        this.forearmField.setText("" + s );
    }
}
