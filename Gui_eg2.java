
//Create a GUI with following components to check whether a string is palindrome or not
//A label displaying”Enter a string”
//A textfield for entering a string
//A button labelled “check” . After clicking the check button,
//if the string entered in the textfield is a palindrome string, Display the message” The string is palindrome” 
//else Display the message” The string is not  palindrome”
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Gui_eg2 implements ActionListener {
    JFrame jf;
    JLabel jl1, jl2;
    JTextField jt;
    JButton jb;

    Gui_eg2() {
        jf = new JFrame("PALINDROME??");
        jl1 = new JLabel("Enter a String :");
        jb = new JButton("Check");
        jl2 = new JLabel("");
        jt = new JTextField(10);
        jf.setSize(250, 300);
        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jl1);
        jf.add(jt);
        jf.add(jb);
        jf.add(jl2);
        jb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String str, rstr = "";
        str = jt.getText();
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        }
        if (rstr.equals(str)) {
            jl2.setText(str + " String is Palindrome");
        } else {
            jl2.setText(str + " String is not Palindrome");
        }
    }

    public static void main(String[] args) {
        new Gui_eg2();
    }
}