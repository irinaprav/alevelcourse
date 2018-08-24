package com.company.hometask.hangleman;

public class ListOfWords {

    private Word[] words;
    private int amount;

    ListOfWords() {
        words = new Word[15];
        this.amount = words.length;
    }

    ListOfWords(int amount) {
        words = new Word[amount];
        this.amount = words.length;
    }

    ListOfWords(Word[] words) {
        this.words = words;
        this.amount = words.length;
    }

    public void fillWithWords(Word... words) {
        this.words = words;
        this.amount = words.length;
    }

    public void addWord(Word word) {
        Word tmplist[] = new Word[amount + 1];
        for (int i = 0; i < this.words.length; i++) {
            tmplist[i] = words[i];
        }
        tmplist[amount + 1] = word;
        this.words = tmplist;
        this.amount = words.length;
    }

    public void addWord(String word) {
        Word word1 = new Word(word);
        addWord(word1);
    }

    public void removeWord(Word word) {
        Word tmplist[] = new Word[amount - 1];
        for (int i = 0; i < this.words.length; i++) {
            if (words[i].getWord().equals(word.getWord())) {
                for (int j = i; j < this.words.length - 1; j++) {
                    tmplist[i] = words[i + 1];
                }
            } else {
                tmplist[i] = words[i];
            }
        }
        this.words = tmplist;
        this.amount = words.length;
    }

    public void removeWord(String word) {
        Word word1 = new Word(word);
        removeWord(word1);
    }

    public Word[] getWords() {
        return words;
    }

    public int getAmount() {
        return amount;
    }
}
