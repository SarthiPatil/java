//Border Layout: Implement following Example of Border Layout.
import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
             JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("Enter the Number:");
        JTextField textField = new JTextField(15);
        topPanel.add(label);
        topPanel.add(textField);
        frame.add(topPanel, BorderLayout.NORTH);
		JPanel BottomPanel = new JPanel();
        BottomPanel.setLayout(new FlowLayout());  

        JLabel label1 = new JLabel("Result:");
        JTextField textField1 = new JTextField(15);

        BottomPanel.add(label1);
        BottomPanel.add(textField1);
        frame.add(BottomPanel, BorderLayout.SOUTH);
		JPanel middlePanel = new JPanel(new GridLayout(1, 3));

        middlePanel.add(new JButton("Binary"));
        middlePanel.add(new JButton("Octal"));
        middlePanel.add(new JButton("Hex"));
        frame.add(middlePanel, BorderLayout.CENTER);
       // frame.add(new JButton("Binary"), BorderLayout.EAST);
        //frame.add(new JButton("Octal"), BorderLayout.WEST);
        //frame.add(new JButton("Hex"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
