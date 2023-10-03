package patterns.example.commands;

import patterns.example.menu.Menu;

public abstract class Command {

    public Menu menu;
    private String backup;

    Command(Menu menu){
        this.menu = menu;
    }

    void backup() {
        backup = menu.textField.getText();
    }

    public void undo() {
        menu.textField.setText(backup);
    }

    public abstract boolean execute();

}
