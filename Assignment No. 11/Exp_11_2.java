import javax.swing.*;
import java.awt.*;

public class Exp_11_2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout with Checkboxes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        JCheckBox javaBox = new JCheckBox("Java");
        JCheckBox pythonBox = new JCheckBox("Python");
        JCheckBox cppBox = new JCheckBox("C++");
        frame.add(javaBox);
        frame.add(pythonBox);
        frame.add(cppBox);

        frame.setVisible(true);
    }
}
