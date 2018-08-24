package com.company.hometask.hangleman;

import java.util.Random;

public class Game {

    private int attemts;
    private ListOfWords listOfWords;
    private Word currentWord;
    private String usersWord;
    private boolean win;

    Game() {
        this.listOfWords = new ListOfWords(new Word[]{
                new Word("programming"),
                new Word("java"),
                new Word("perfect"),
                new Word("database"),
                new Word("cat"),
                new Word("site"),
                new Word("spreadsheet")
        });
        this.win = false;
    }

    Game(Word[] words) {
        this.listOfWords = new ListOfWords(words);
        this.win = false;
    }

    private Word makeRandomChoice(Word[] words) {
        return words[(new Random()).nextInt(words.length - 1)];
    }

    public String newWord() {
        this.currentWord = makeRandomChoice(listOfWords.getWords());
        this.attemts = currentWord.getWord().length() + 5;
        this.usersWord = currentWord.getHiddenword();
        return currentWord.getHiddenword();
    }

    public String newWord(int attemts) {
        this.currentWord = makeRandomChoice(listOfWords.getWords());
        this.attemts = attemts;
        this.usersWord = currentWord.getHiddenword();
        return currentWord.getHiddenword();
    }

    public void startthegame(char userChance) {
        StringBuilder builder = new StringBuilder();
        int lastIndex = 0;
        int amount = 0;

        while (lastIndex != -1) {

            lastIndex = currentWord.getWord().indexOf(userChance, lastIndex);

            if (lastIndex != -1) {
                amount++;
                lastIndex += 1;
            }
        }
        char usersChars[] = usersWord.toCharArray();
        if (amount > 0) {
            int positions[] = new int[amount];
            amount = 0;
            lastIndex = 0;
            while (lastIndex != -1) {

                lastIndex = currentWord.getWord().indexOf(userChance, lastIndex);

                if (lastIndex != -1) {
                    positions[amount] = lastIndex;
                    amount++;
                    lastIndex += 1;
                }
            }
            amount = 0;
            for (int i = 0; i < currentWord.getWord().length(); i++) {
                if (i == positions[amount]) {
                    builder.append(userChance);
                    int tmp = amount + 1;
                    if (positions.length > tmp) {
                        amount++;
                    }
                } else {
                    builder.append(usersChars[i]);
                }
            }
        } else {
            for (int i = 0; i < currentWord.getWord().length(); i++) {
                builder.append(usersChars[i]);
            }
        }
        this.usersWord = builder.toString();
        --this.attemts;
    }

    public boolean yourWin() {
        return this.usersWord.equals(currentWord.getWord());
    }

    public int getAttemts() {
        return attemts;
    }

    public String getUsersWord() {
        return usersWord;
    }

}
