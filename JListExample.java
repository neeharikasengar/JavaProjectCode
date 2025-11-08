import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");

        JList<String> myList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(myList); // For scrollability

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
