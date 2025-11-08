import javax.swing.*;
import java.awt.*;
public class MYFORM {
   /* private JPanel mainPanel; // If using a GUI Form

    public MYFORM() {
        // Initialize components if not using a GUI Form directly
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Swing App");
        // If using a GUI Form:
        frame.setContentPane(new MYFORM().mainPanel);
        // If not using a GUI Form, create and add components directly

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // Or setSize()
        frame.setVisible(true);
    }*/
   public static void main(String[] args) {
       JFrame frame = new JFrame("My Form");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400, 300);

       // ✅ Create a panel instead of setting null
       JPanel panel = new JPanel();
       panel.setBackground(Color.CYAN);

       // Add components to panel
       panel.add(new JLabel("Hello, Swing!"));
       panel.add(new JButton("Click Me"));

       // ✅ Set panel as the content pane
       frame.setContentPane(panel);

       // ✅ Make frame visible
       frame.setVisible(true);
   }
}
