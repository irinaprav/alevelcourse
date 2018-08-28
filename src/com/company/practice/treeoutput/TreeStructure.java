package com.company.practice.treeoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class TreeStructure {
    private final StringBuilder builder = new StringBuilder();
    private int folderAmount;
    private int fileAmount;
    private static final String divider = "   ";

    TreeStructure() {
        this.folderAmount = 0;
        this.fileAmount = 0;
    }

    private void printTree(File folder, int dividerAmount) throws FileNotFoundException {
        File[] files = folder.listFiles();
        //Arrays.sort(files);
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    folderAmount++;
                    builder.append("\n").append(tabulate(dividerAmount)).append("—").append(file.getName());
                    printTree(file, dividerAmount + 1);
                } else {
                    fileAmount++;
                    builder.append("\n").append(tabulate(dividerAmount)).append("|").append(file.getName());
                }
            }
        } else {
            throw new FileNotFoundException("Wrong path!");
        }
    }

    private String tabulate(int dividerAmount) {
        StringBuilder temporaryBuilder = new StringBuilder();
        for (int i = 0; i < dividerAmount; i++) {
            temporaryBuilder.append(divider);
        }
        return temporaryBuilder.toString();
    }


    public String getTreeStructure(File folder) throws FileNotFoundException {
        builder.append("STRUCTURE").append("\n");
        builder.append("—").append(folder.getName());
        printTree(folder, 1);
        builder.append("\nFOLDER AMOUNT: ").append(folderAmount).append(" FILE AMOUNT: ").append(fileAmount);
        return builder.toString();
    }


    public int getFolderAmount() {
        return folderAmount;
    }

    public void setFolderAmount(int folderAmount) {
        this.folderAmount = folderAmount;
    }

    public int getFileAmount() {
        return fileAmount;
    }

    public void setFileAmount(int fileAmount) {
        this.fileAmount = fileAmount;
    }

}
