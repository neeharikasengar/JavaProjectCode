import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddRemoveDemo extends JFrame implements ActionListener {

    // Declare components
    private JPanel panel;
    private JButton addButton, removeButton;
    private int labelCount = 0;  // To track added labels

    public AddRemoveDemo() {
        setTitle("Adding and Removing Controls Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with FlowLayout
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create buttons
        addButton = new JButton("Add Label");
        removeButton = new JButton("Remove Label");

        // Add ActionListeners
        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        // Add buttons to panel
        panel.add(addButton);
        panel.add(removeButton);

        // Add panel to frame
        add(panel);

        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            labelCount++;
            JLabel label = new JLabel("Hello!!How are you");
            panel.add(label);  // ✅ Add new control
        }
        else if (e.getSource() == removeButton) {
            if (panel.getComponentCount() > 2) { // First 2 are buttons
                panel.remove(panel.getComponentCount() - 1);  // ✅ Remove last added label
                labelCount--;
            } else {
                JOptionPane.showMessageDialog(this, "No labels to remove!");
            }
        }

        // Refresh the panel to show updated controls
        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        new AddRemoveDemo();
    }
}