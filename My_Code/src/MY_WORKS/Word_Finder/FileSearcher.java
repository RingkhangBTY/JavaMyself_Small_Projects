package MY_WORKS.Word_Finder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {

    public void searchInFolder(String folderPath, String keyword){
        try {
            File folder = new File(folderPath);
            File[] files = folder.listFiles(((dir, name) -> name.endsWith(".txt"))); // This line add every text file that are present in the given folder path.

            if (files.length == 0 || files == null){
                System.out.println("The folder is empty! Try again....");
                return;
            }

            List <Thread> threads = new ArrayList<>();

            for (File file: files){
                Thread thread = new Thread(new SearchTask(file,keyword));
                threads.add(thread);
                thread.start();
            }

            for (Thread t : threads){
                t.join();
            }
            System.out.println("Search completed...");

        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}