import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dante on 04.01.2016.
 */
public class Ideal extends JFrame{
    private JButton button1;
    private JPanel panel1;

    public Ideal() {
        super("some");
        //pack();
        setSize(new Dimension(500 , 500));
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setContentPane(panel1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Ideal ideal = new Ideal();
            }

        });
        setVisible(true);
    }
}
