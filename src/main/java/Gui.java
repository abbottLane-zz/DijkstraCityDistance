import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wlane on 8/11/14.
 */
public class Gui implements ActionListener {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JComboBox comboBox2;
    private JButton calculateDistanceButton;
    private JTextArea distanceTextArea;

    public Gui()  {
        calculateDistanceButton.addActionListener(new ActionListener() {
        });
    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Button pushed!");
    }


}
