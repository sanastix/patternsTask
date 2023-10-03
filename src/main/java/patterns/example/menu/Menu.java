package patterns.example.menu;

import patterns.example.commands.*;

import javax.swing.*;
import java.awt.*;

public class Menu {

    /*
    GUI: convenient menu for functions access
     */

    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init(){
        JFrame frame = new JFrame();
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addMovie = new JButton("Add movie to the catalogue");
        JButton watchCatalogue = new JButton("Watch catalogue");
        JButton addCustomer = new JButton("Add customer");
        JButton watchCustomers = new JButton("Watch customers");

        //search: customer and movie

        Menu menu = this;

        //actionlistener

        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

}
