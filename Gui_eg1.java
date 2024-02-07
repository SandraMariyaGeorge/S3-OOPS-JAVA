
//Create a GUI with following components 
//Two labels  displaying “Enter  Number”and “Result”
//Two  textfields  for  entering number   and for showing the result of the operation.Three buttons labelled fact,square and cube .
//On clicking fact button ,  show the factorial in the second  textfield. On clicking square,
//show the square in the t textfield. On clicking cube  button ,  show the cube in the  textfield. 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Gui_eg1 implements ActionListener {
    JFrame jf;
    JLabel jl1, jl2;
    JTextField jt1, jt2;
    JButton fact, squr, cube;

    Gui_eg1() {
        jf = new JFrame("GUI eg1");
        jf.setLayout(new FlowLayout());
        jl1 = new JLabel("Enter the Number:");
        jt1 = new JTextField(20);
        jl2 = new JLabel("Result:");
        jt2 = new JTextField(20);
        fact = new JButton("Factorial");
        squr = new JButton("Square");
        cube = new JButton("Cube");
        jf.setVisible(true);
        jf.setSize(250, 300);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jl2);
        jf.add(jt2);
        jf.add(fact);
        jf.add(squr);
        jf.add(cube);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fact.addActionListener(this);
        squr.addActionListener(this);
        cube.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fact) {
            String str = jt1.getText();
            int a = Integer.parseInt(str);
            int fact = 1, i = 1;
            while (i <= a) {
                fact = fact * i;
                i++;
            }
            String str2 = String.valueOf(fact);
            jt2.setText(str2);
        }

        if (e.getSource() == squr) {
            String str = jt1.getText();
            int a = Integer.parseInt(str);
            String str2 = String.valueOf(a * a);
            jt2.setText(str2);
        }

        if (e.getSource() == cube) {
            String str = jt1.getText();
            int a = Integer.parseInt(str);
            String str2 = String.valueOf(a * a * a);
            jt2.setText(str2);
        }
    }

    public static void main(String args[]) {
        new Gui_eg1();
    }
}
