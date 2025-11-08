import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {

    Choice colorChoice;
    Label label;

    public ChoiceDemo() {
        setTitle("Choice Control Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Create a label
        label = new Label("Select a Color:");
        add(label);

        // Create a Choice (dropdown)
        colorChoice = new Choice();

        // Add items to Choice
        colorChoice.add("Red");
        colorChoice.add("Green");
        colorChoice.add("Blue");
        colorChoice.add("Yellow");
        colorChoice.add("Cyan");

        // Add the choice control to the frame
        add(colorChoice);

        // Register listener
        colorChoice.addItemListener(this);

        // Label to show selected color
        label = new Label("You selected: None");
        add(label);

        setVisible(true);
    }

    // Handle item selection
    public void itemStateChanged(ItemEvent e) {
        String selected = colorChoice.getSelectedItem();
        label.setText("You selected: " + selected);
    }

    public static void main(String[] args) {
        new ChoiceDemo();
    }
}
