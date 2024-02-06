import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SimpleCalculator implements ActionListener {
    JFrame jf;
    JTextField tf1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    String s1, s2, s4;
    int x, y, z;
    int sum;

    SimpleCalculator() {
        jf = new JFrame("Simple Calculator");
        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setLayout(new GridLayout(6, 3));
        tf1 = new JTextField(20);
        b1 = new JButton("AC");
        b2 = new JButton("=");
        b3 = new JButton("+");
        b4 = new JButton("-");
        b5 = new JButton("*");
        b6 = new JButton("/");
        b7 = new JButton("1");
        b8 = new JButton("2");
        b9 = new JButton("3");
        b10 = new JButton("4");
        b11 = new JButton("5");
        b12 = new JButton("6");
        b13 = new JButton("7");
        b14 = new JButton("8");
        b15 = new JButton("9");
        b16 = new JButton("0");
        jf.add(tf1);
        jf.add(b1);
        jf.add(b2);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.add(b10);
        jf.add(b11);
        jf.add(b12);
        jf.add(b13);
        jf.add(b14);
        jf.add(b15);
        jf.add(b16);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s3 = "";
        JButton jb1;
        Object o1 = ae.getSource();
        jb1 = (JButton) o1;
        if (b7 == jb1)
            tf1.setText(tf1.getText() + "1");
        else if (b8 == jb1)
            tf1.setText(tf1.getText() + "2");
        else if (b9 == jb1)
            tf1.setText(tf1.getText() + "3");
        else if (b10 == jb1)
            tf1.setText(tf1.getText() + "4");
        else if (b11 == jb1)
            tf1.setText(tf1.getText() + "5");
        else if (b12 == jb1)
            tf1.setText(tf1.getText() + "6");
        else if (b13 == jb1)
            tf1.setText(tf1.getText() + "7");
        else if (b14 == jb1)
            tf1.setText(tf1.getText() + "8");
        else if (b15 == jb1)
            tf1.setText(tf1.getText() + "9");
        else if (b16 == jb1)
            tf1.setText(tf1.getText() + "0");
        else if (b3 == jb1) {
            s1 = tf1.getText();
            tf1.setText("");
            s4 = "+";
        } else if (b4 == jb1) {
            s1 = tf1.getText();
            tf1.setText("");
            s4 = "-";
        } else if (b5 == jb1) {
            s1 = tf1.getText();
            tf1.setText("");
            s4 = "*";
        } else if (b6 == jb1) {
            s1 = tf1.getText();
            tf1.setText("");
            s4 = "/";
        } else if (b1 == jb1) {
            s1 = "";
            s2 = "";
            z = 0;
            tf1.setText("");
        } else if (b2 == jb1) {
            s2 = tf1.getText();
            y = Integer.parseInt(s2);
            x = Integer.parseInt(s1);
            if (s4.equals("+"))
                z = x + y;
            else if (s4.equals("-"))
                z = x - y;
            else if (s4.equals("*"))
                z = x * y;
            else if (s4.equals("/"))
                z = x / y;
            s3 = String.valueOf(z);
            tf1.setText(s3);
        }
    }
}

public class Calculator {
    public static void main(String args[]) {
        SimpleCalculator e = new SimpleCalculator();
    }
}
