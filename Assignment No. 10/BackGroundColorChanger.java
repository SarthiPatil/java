import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackGroundColorChanger {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Change Background Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create a JComboBox with color options
        String[] colors = {"Red", "Green", "Blue", "Yellow", "White", "Black"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        frame.add(colorComboBox);

        // Add a JLabel to display a message
        JLabel label = new JLabel("Select a color to change the background.");
        frame.add(label);

        // Add an ItemListener to handle color change
        colorComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Get the selected color
                String selectedColor = (String) colorComboBox.getSelectedItem();

                // Change background color based on the selected item
                switch (selectedColor) {
                    case "Red":
                        frame.getContentPane().setBackground(Color.RED);
                        break;
                    case "Green":
                        frame.getContentPane().setBackground(Color.GREEN);
                        break;
                    case "Blue":
                        frame.getContentPane().setBackground(Color.BLUE);
                        break;
                    case "Yellow":
                        frame.getContentPane().setBackground(Color.YELLOW);
                        break;
                    case "White":
                        frame.getContentPane().setBackground(Color.WHITE);
                        break;
                    case "Black":
                        frame.getContentPane().setBackground(Color.BLACK);
                        break;
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
