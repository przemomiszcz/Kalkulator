import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dante on 04.01.2016.
 */
public class Form extends JFrame{
    private JButton button2;
    private JPanel rootPanel;
    private JButton potency;
    private JButton ideal;

    public Form() {
        super("Witam w mojej aplikacji!");
        setSize(new Dimension(500 , 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(rootPanel);

        ideal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ideal idealForm = new Ideal();
            }

        });

        potency.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Potency potencyForm = new Potency();
            }
        });
        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
