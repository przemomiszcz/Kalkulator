import javax.swing.*;
import java.awt.*;

/**
 * Created by Dante on 07.01.2016.
 */
public class ResultForm extends JFrame {
    private JEditorPane infoPane1;
    private JPanel resultPanel;
    private JTextField szacunkowyRocznyPotencjałWzrostuTextField;
    private JButton button1;

    public ResultForm() {
        super("Witam w mojej aplikacji!");
        //infoPane1.setContentType("Szacunkowy roczny potencjał wzrostu masy mięśniowej w zależności od wieku, stażu treningowego oraz typu budowy ciała");
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(resultPanel);
        setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
