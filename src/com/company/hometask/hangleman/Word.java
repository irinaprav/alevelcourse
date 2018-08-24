package com.company.hometask.hangleman;

public class Word {

    private static char PLACEHOLDER = '*';
    private String word;
    private String hiddenword;

    Word() {
        this("basic");
    }

    Word(String word) {
        this.word = word;
        setHiddenword(this.word);
    }

    public String getHiddenword() {
        return hiddenword;
    }

    private void setHiddenword(String currentWord) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < currentWord.length(); i++) {
            builder.append(PLACEHOLDER);
        }
        this.hiddenword = builder.toString();
    }

    public String getWord() {
        return word;
    }

    public static char getPLACEHOLDER() {
        return PLACEHOLDER;
    }

    public static void setPlacegolder(char PLACEHOLDER) {
        Word.PLACEHOLDER = PLACEHOLDER;
    }

}
