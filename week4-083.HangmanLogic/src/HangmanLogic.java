
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!this.guessedLetters.contains(letter)) {
            if (!this.word.contains(letter)) {
                numberOfFaults++;
            }
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        String hidden="";
        String letter;
        int i=0;
        while(i<this.word.length()){
            letter=""+this.word.charAt(i);
            if(this.guessedLetters.contains(letter)){
                hidden+=letter;
            }else{
                hidden+="_";
            }
            i++;
        }
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        return hidden;
    }
}
