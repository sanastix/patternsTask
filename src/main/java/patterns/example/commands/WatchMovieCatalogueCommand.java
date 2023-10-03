package patterns.example.commands;

import patterns.example.menu.Menu;

public class WatchMovieCatalogueCommand extends Command {

    public WatchMovieCatalogueCommand(Menu menu){
        super(menu);
    }

    @Override
    public boolean execute() {
        //iterator
        return false;
    }

}
