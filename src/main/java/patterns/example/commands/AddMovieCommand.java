package patterns.example.commands;

import patterns.example.menu.Menu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddMovieCommand extends Command {

    private final String filePath = "Movie_Catalogue.txt";

    public AddMovieCommand(Menu menu){
        super(menu);
    }

    @Override
    public boolean execute() {
        if (menu.clipboard == null || menu.clipboard.isEmpty()) return false;
        menu.clipboard = menu.textField.getSelectedText();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(menu.clipboard);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
