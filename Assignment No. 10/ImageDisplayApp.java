import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ImageDisplayApp {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        // Create JComboBox with image names
        String[] imageNames = {"Image1", "Image2", "Image3"};
        JComboBox<String> comboBox = new JComboBox<>(imageNames);
        frame.add(comboBox, BorderLayout.NORTH);

        // Create JLabel to display images
        JLabel imageLabel = new JLabel("", SwingConstants.CENTER);
        frame.add(imageLabel, BorderLayout.CENTER);

        // Define a method to load an image based on selection
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String selectedImage = (String) e.getItem();
                ImageIcon imageIcon = null;

                // Load corresponding image based on selected item
                switch (selectedImage) {
                    case "Image1":
                        imageIcon = new ImageIcon("C:\\Users\\Parvej\\OneDrive\\Hình ảnh\\ganesha5.png");
                        break;
                    case "Image2":
                        imageIcon = new ImageIcon("C:\\Users\\Parvej\\OneDrive\\Hình ảnh\\lab1.png");
                        break;
                    case "Image3":
                        imageIcon = new ImageIcon("C:\\Users\\Parvej\\OneDrive\\Hình ảnh\\Stayhub.jpg");
                        break;
                }

                // Set the image in the label
                if (imageIcon != null) {
                    imageLabel.setIcon(imageIcon);
                }
            }
        };

        // Add the ItemListener to the JComboBox
        comboBox.addItemListener(itemListener);

        // Display the frame
        frame.setVisible(true);
    }
}

