package de.dfki.matcher;

/**
 * Created by alvaro on 6/6/17.
 */
public class Word {
    private final String word;
    private final String originalWord;

    public Word(String word) {
        this.originalWord = word;
        this.word = word.toLowerCase().trim();
    }

    public String getWord(){
        return word;
    }

    public boolean equals(Object obj){
        Word toCompare = (Word) obj;
        return toCompare.getWord().equals(this.word);
    }

    public String toString(){
        return originalWord;
    }

}
