package patterns.example.commands;

import patterns.example.menu.Menu;

public class WatchCustomersCommand extends Command {

    public WatchCustomersCommand(Menu menu){
        super(menu);
    }

    @Override
    public boolean execute() {
        //iterator
        return false;
    }
}
