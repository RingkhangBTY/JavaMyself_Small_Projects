package MY_WORKS.GuessTheWord;
import java.util.Scanner;

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
                System.out.println("The word is: "+randomWords);
                play = false;
            }
        }else {
            triesLeft --;

            System.out.println(triesLeft+" tries left!  ");

            if (triesLeft==0){
                System.out.println("game Over! ");
                play = false;
            }
        }
    }

    private void getInput() {
        System.out.println("Enter a word to guess the word.");
        String userGuess = sc.nextLine();
//        randomWords.guess(userGuess.charAt(0));
        lastRound = userGuess.charAt(0);
    }

    private void showWords() {
        System.out.println(randomWords);

    }

    public void end() {
        sc.close();
    }
}
