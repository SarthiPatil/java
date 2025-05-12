import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationaryPurchaseSystem extends JFrame implements ActionListener {
    JCheckBox notebookBox, penBox, pencilBox;
    JButton orderButton;

    public StationaryPurchaseSystem() {
        setTitle("Stationary Purchase System");
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        notebookBox = new JCheckBox("Notebook @ 50");
        penBox = new JCheckBox("Pen @ 30");
        pencilBox = new JCheckBox("Pencil @ 10");

        notebookBox.setBounds(50, 40, 150, 30);
        penBox.setBounds(50, 80, 150, 30);
        pencilBox.setBounds(50, 120, 150, 30);

        orderButton = new JButton("Order");
        orderButton.setBounds(100, 170, 100, 30);
        orderButton.addActionListener(this);

        add(notebookBox);
        add(penBox);
        add(pencilBox);
        add(orderButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double total = 0;
        StringBuilder details = new StringBuilder();

        if (notebookBox.isSelected()) {
            String input = JOptionPane.showInputDialog(this, "Enter Quantity for Notebook:");
            int qty = Integer.parseInt(input);
            double cost = qty * 50;
            total += cost;
            details.append("Notebook Quantity: ").append(qty).append("  Total:").append(cost).append("\n");
        }

        if (penBox.isSelected()) {
            String input = JOptionPane.showInputDialog(this, "Enter Quantity for Pen:");
            int qty = Integer.parseInt(input);
            double cost = qty * 30;
            total += cost;
            details.append("Pen Quantity: ").append(qty).append("  Total:").append(cost).append("\n");
        }

        if (pencilBox.isSelected()) {
            String input = JOptionPane.showInputDialog(this, "Enter Quantity for Pencil:");
            int qty = Integer.parseInt(input);
            double cost = qty * 10;
            total += cost;
            details.append("Pencil Quantity: ").append(qty).append("  Total:").append(cost).append("\n");
        }

        if (details.length() > 0) {
            details.append("\nTotal: ").append(total);
            JOptionPane.showMessageDialog(this, details.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Successfully Ordered.", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select at least one item.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new StationaryPurchaseSystem();
    }
}