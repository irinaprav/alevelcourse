package com.company.hometask.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

abstract public class Helper {
    private File inputFile;
    private File outputFile;
    private int defaultLines;

    Helper(File inputFile) {

    }

    Helper(File inputFile, File outputFile) throws IOException{
        if (!inputFile.exists()) throw new FileNotFoundException("Your input file is not exists!");
        if (!outputFile.exists()) throw new FileNotFoundException("Your output file is not exists!");
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.defaultLines = countLines();
    }

    abstract int countLines() throws IOException;

    abstract void copyText() throws IOException;

    abstract void copyText(int countLines) throws IOException;


    protected static File newOutputFile() throws IOException {
        File outputFile = new File("resources/output.txt");
        outputFile.createNewFile();
        if (!outputFile.exists()) throw new FileNotFoundException("Illegal path!");
        return outputFile;
    }

    protected static File newOutputFileName(String path) throws IOException {
        File outputFile = new File(path);
        outputFile.createNewFile();
        if (!outputFile.exists()) throw new FileNotFoundException("Illegal path!");
        return outputFile;
    }


    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public int getDefaultLines() {
        return defaultLines;
    }

    public void setDefaultLines(int defaultLines) {
        this.defaultLines = defaultLines;
    }


}
