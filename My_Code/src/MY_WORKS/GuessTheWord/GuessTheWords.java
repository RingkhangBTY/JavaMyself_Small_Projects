package MY_WORKS.GuessTheWord;
import java.util.Scanner;
import static MY_WORKS.GuessTheWord.Words.getWord;

public class GuessTheWords {
    private Scanner sc = new Scanner(System.in);
    private boolean play = true;
    private Words randomWords = new Words();
    private int triesLeft = 10;
    private char lastRound;


    public void start(){
        do {
            showWords();
            getInput();
            checkInput();
        }while (play);
    }

    private void checkInput() {

        boolean isGuessRight = randomWords.guess(lastRound);
        if (isGuessRight){
            if (randomWords.isGuess()){
                System.out.println("Congrats, you won! ");
                System.out.println("The word is: "+getWord());
                play = true;
            }
        }else {
            triesLeft --;
            System.out.println(triesLeft+" tries left!  ");

            if (triesLeft==0){
                System.out.println("game Over! ");
                System.out.println("The word is: "+getWord());
                play = false;
            }
        }
    }

//    private void playMore(){
//        System.out.println("Want to play more? (Y/N)");
//        String userRes = sc.nextLine();
//        play = userRes.equalsIgnoreCase("y");
//    }

    private void getInput() {
        System.out.println("Enter a word to guess the word.");
        String userGuess = sc.nextLine();
        lastRound = userGuess.charAt(0);
    }

    private void showWords() {
        System.out.println(randomWords);

    }

    public void end() {
        sc.close();
    }
}