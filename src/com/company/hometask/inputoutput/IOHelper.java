package com.company.hometask.inputoutput;

import java.io.*;

public class IOHelper extends Helper {

    IOHelper(File inputFile) throws IOException {
        super(inputFile, newOutputFile());
    }

    IOHelper(File inputFile, File outputFile) throws IOException {
        super(inputFile, outputFile);
    }

    public void copyText() throws IOException {
        copyText(super.getDefaultLines());
    }

    public void copyText(int countLines) {
        if (countLines > super.getDefaultLines())
            throw new IllegalArgumentException("Your amount is such bigger than default amount of lines");
        if (countLines < 0)
            throw new IllegalArgumentException("Your amount is less than default amount of lines");
        super.setDefaultLines(countLines);
        StringBuilder builder = new StringBuilder();
        int amount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getInputFile()))) {
            String a;
            while ((a = reader.readLine()) != null) {
                if (amount == super.getDefaultLines()) break;
                builder.append(a);
                builder.append("\n");
                amount++;
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(super.getOutputFile()))) {
                writer.write(builder.toString());
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    protected int countLines() throws IOException {
        int result = 0;
        LineNumberReader r = new LineNumberReader(new FileReader(super.getInputFile()));
        while (r.readLine() != null) {
            result++;
        }
        return result;
    }


}
