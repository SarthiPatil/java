import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCoordinates extends JFrame {
    JLabel coordinatesLabel;

    public MouseCoordinates() {
        setTitle("Mouse Coordinate Tracker");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        coordinatesLabel = new JLabel("Move the mouse inside the window");
        add(coordinatesLabel);

        // Mouse motion listener for real-time tracking
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                coordinatesLabel.setText("X: " + e.getX() + "  Y: " + e.getY());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseCoordinates();
    }
}
