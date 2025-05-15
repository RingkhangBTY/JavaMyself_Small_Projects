package MY_WORKS.Word_Finder;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FolderPicker folderPicker = new FolderPicker();
        System.out.println("Choose the folder where you want to search..");
        String path = folderPicker.chooseFolder();

        System.out.println("Enter the keyword you want to search: ");
        String keyWord = sc.nextLine();

        FileSearcher fileSearcher = new FileSearcher();
        fileSearcher.searchInFolder(path,keyWord);
    }
}