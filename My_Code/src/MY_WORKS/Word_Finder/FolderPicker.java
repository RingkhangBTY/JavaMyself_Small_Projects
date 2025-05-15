package MY_WORKS.Word_Finder;

import javax.swing.*;
import java.io.File;

public class FolderPicker {

    public String chooseFolder(){

        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select Folder Containing Text Files");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = chooser.getSelectedFile();
            return selectedFolder.getAbsolutePath();
        } else {
            System.out.println("No folder selected.");
            return null;
        }
    }
}
