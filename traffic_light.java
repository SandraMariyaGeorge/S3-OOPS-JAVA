import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class App implements ActionListener 
{
    JFrame jfrm;
    JLabel message;
    ButtonGroup btngroup;
    JRadioButton rbred, rbyellow, rbgreen;

    App() 
    {
        jfrm = new JFrame("Traffic Lights");
        message = new JLabel("Select Light");
        btngroup = new ButtonGroup();
        rbred = new JRadioButton("Red");
        rbyellow = new JRadioButton("Yellow");
        rbgreen = new JRadioButton("Green");
        jfrm.setLayout(new FlowLayout());
        rbred.setForeground(Color.RED);
        rbyellow.setForeground(Color.YELLOW);
        rbgreen.setForeground(Color.GREEN);
        btngroup.add(rbred);
        btngroup.add(rbyellow);
        btngroup.add(rbgreen);
        rbred.addActionListener(this);
        rbyellow.addActionListener(this);
        rbgreen.addActionListener(this);
        jfrm.add(message);
        jfrm.add(rbred);
        jfrm.add(rbyellow);
        jfrm.add(rbgreen);

        jfrm.setSize(300, 200);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ie) 
    {
        String txt = ie.getActionCommand();

        if (txt.equals("Red")) {
            message.setForeground(Color.RED);
            message.setText("STOP");

        } else if (txt.equals("Yellow")) {
            message.setForeground(Color.YELLOW);
            message.setText("READY");
        } else {
            message.setForeground(Color.GREEN);
            message.setText("GO");
        }
    }

}

public class traffic_light
{
    public static void main(String[] args) 
    {
        new App();
    }
}