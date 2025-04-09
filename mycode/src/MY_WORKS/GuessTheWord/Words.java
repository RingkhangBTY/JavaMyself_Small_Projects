package MY_WORKS.GuessTheWord;

import java.util.Arrays;
import java.util.Random;

public class Words {
    private String [] randomWords = {"animal","human","birthday","university","computer","forest",
    "climate","town","india","village"};

    private String selectedWord;
    private Random random = new Random();
    private char[] letters;

    public Words(){
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }


    public String toString(){
        StringBuilder word = new StringBuilder();
        for (char letter : letters){
            word.append(letter == '\u0000'? "_ ":letter+" ");
        }
        return word.toString();
    }

    public boolean isGuess(){
        for (char letter : letters){
            if (letter == '\u0000'){
                return false;
            }
        }
        return true;
    }

    public boolean guess(char letter) {
        boolean guessRight = false;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (letter == selectedWord.charAt(i)){
                letters[i] = letter;
                guessRight = true;
            }
        }
        return guessRight;
    }
}