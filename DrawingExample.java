import javax.swing.*;
import java.awt.*;

public class DrawingExample extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call superclass method for proper painting

        // Set color to blue and draw a filled rectangle
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 75);

        // Set color to red and draw a line
        g.setColor(Color.RED);
        g.drawLine(20, 20, 180, 150);

        // Set color to green and draw some text
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello Graphics!", 60, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Graphics Example");
        DrawingExample panel = new DrawingExample();
        frame.add(panel);
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
