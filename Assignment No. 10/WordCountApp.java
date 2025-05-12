import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordCountApp {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Word and Character Count");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create JTextArea for input
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create JLabel to display counts
        JLabel label = new JLabel("Characters: 0 | Words: 0");
        frame.add(label, BorderLayout.SOUTH);

        // KeyListener to update the character and word count in real-time
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();

                // Count characters
                int charCount = text.length();

                // Count words
                String[] words = text.trim().split("\\s+");
                int wordCount = (words.length > 0 && !words[0].isEmpty()) ? words.length : 0;

                // Update the label with the new counts
                label.setText("Characters: " + charCount + " | Words: " + wordCount);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
