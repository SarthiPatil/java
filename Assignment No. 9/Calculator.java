import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField tf;
    double num1 = 0, num2 = 0;
    String op = "";

    public Calculator() {
        tf = new JTextField();
        tf.setBounds(30, 40, 230, 30);
        tf.setEditable(false);
        add(tf);

        String[] btns = { "1", "2", "3", "+", 
                          "4", "5", "6", "-", 
                          "7", "8", "9", "*", 
                          "0", "C", "=", "/" };

        int x = 30, y = 80;
        for (int i = 0; i < btns.length; i++) {
            JButton b = new JButton(btns[i]);
            b.setBounds(x, y, 50, 40);
            b.addActionListener(this);
            add(b);
            x += 60;
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        setLayout(null);
        setSize(300, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.matches("[0-9]")) {
            tf.setText(tf.getText() + s);
        } else if (s.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(tf.getText());
            op = s;
            tf.setText("");
        } else if (s.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (op) {
                case "+": tf.setText("" + (num1 + num2)); break;
                case "-": tf.setText("" + (num1 - num2)); break;
                case "*": tf.setText("" + (num1 * num2)); break;
                case "/": tf.setText("" + (num1 / num2)); break;
            }
        } else if (s.equals("C")) {
            tf.setText("");
            num1 = num2 = 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}