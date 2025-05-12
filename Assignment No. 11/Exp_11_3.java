import javax.swing.*;
import java.awt.*;

public class Exp_11_3 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Simple GridLayout");

        frame.setLayout(new GridLayout(2, 3));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
}
