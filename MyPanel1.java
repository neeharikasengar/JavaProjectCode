import javax.swing.*;
import java.awt.*;

public class MyPanel1 extends JPanel {

    // paintComponent() is called automatically when the panel is drawn
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        this.setBackground(Color.WHITE);

        // Draw rectangles with different colors
        g.setColor(Color.RED);
        g.fillRect(20, 20, 100, 50);

        g.setColor(Color.GREEN);
        g.fillRect(140, 20, 100, 50);

        g.setColor(Color.BLUE);
        g.fillRect(260, 20, 100, 50);

        // Custom color using RGB
        Color myColor = new Color(255, 200, 0); // orange-like
        g.setColor(myColor);
        g.fillRect(20, 100, 100, 50);

        // Draw text with color
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Color Demo in Swing", 100, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Working with Colors Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ✅ Use MyPanel1 instead of ColorDemo
        MyPanel1 panel = new MyPanel1();
        frame.add(panel);

        frame.setVisible(true);
    }
}