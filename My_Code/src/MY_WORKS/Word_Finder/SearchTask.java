package MY_WORKS.Word_Finder;

import java.io.*;

public class SearchTask implements Runnable{
    private int line;
    private File file;
    private String keyWord;

    public SearchTask(File path, String keyWord) {
        this.file = path;
        this.keyWord = keyWord;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String str;
            while ((str = reader.readLine()) != null){
                if (str.toUpperCase().contains(keyWord.toUpperCase())){
                    System.out.println("Keyword found!  File Name: '"+file.getName()+"' At line: "+line);
                    line++;
                }
                line++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}