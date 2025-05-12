import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JPanel implements Runnable, MouseListener {
    private int x = 50;
    private int y = 50;
    private int diameter = 30;
    private int dx = 2;
    private int dy = 2;
    private boolean moving = false;
    private Thread animator;

    public BouncingBall() {
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
    }

    @Override
    public void run() {
        while (true) {
            if (moving) {
                x += dx;
                y += dy;

                if (x < 0) {
                    x = 0;
                    dx = -dx;
                } else if (x + diameter > getWidth()) {
                    x = getWidth() - diameter;
                    dx = -dx;
                }

                if (y < 0) {
                    y = 0;
                    dy = -dy;
                } else if (y + diameter > getHeight()) {
                    y = getHeight() - diameter;
                    dy = -dy;
                }

                repaint();
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (!moving) {
            moving = true;
            if (animator == null) {
                animator = new Thread(this);
                animator.start();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // No action needed
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // No action needed
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // No action needed
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // No action needed
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Blue Ball");
        BouncingBall ballPanel = new BouncingBall();
        frame.add(ballPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
