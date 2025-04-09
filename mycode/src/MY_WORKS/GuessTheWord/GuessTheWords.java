package MY_WORKS.GuessTheWord;

public class GuessTheWords {
    private boolean play = false;

    private Words randomWords = new Words();

    public void start(){
        do {
            showWords();
            getInput();
            checkInput();
        }while (play);
    }

    private void checkInput() {
        System.out.println("checkInput");
    }

    private void getInput() {
        System.out.println("getInput");
    }

    private void showWords() {
        System.out.println(randomWords);
    }
}
