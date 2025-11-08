import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Example");
        JTextField textField = new JTextField("Enter text here", 20); // 20 columns wide

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Text entered: " + textField.getText());
            }
        });

        frame.add(textField);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

