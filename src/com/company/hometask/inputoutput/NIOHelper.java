package com.company.hometask.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class NIOHelper extends Helper {

    NIOHelper(File inputFile) throws IOException {
        super(inputFile, newOutputFile());
    }

    NIOHelper(File inputFile, File outputFile) throws IOException {
        super(inputFile, outputFile);
    }

    public void copyText() throws IOException {
        copyText(super.getDefaultLines());
    }

    public void copyText(int countLines) throws IOException {
        if (countLines > super.getDefaultLines())
            throw new IllegalArgumentException("Your amount is such bigger than default amount of lines");
        if (countLines < 0)
            throw new IllegalArgumentException("Your amount is less than default amount of lines");
        List<String> list = Files.readAllLines(super.getInputFile().toPath());
        super.setDefaultLines(countLines);
        int count = 0;
        for (int i = 0; i < super.getDefaultLines(); i++) {
            count += list.get(i).getBytes().length;
        }
        ByteBuffer buffer = ByteBuffer.allocate(count);
        try (FileChannel channel = FileChannel.open(super.getInputFile().toPath(), READ)) {
            channel.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        buffer.flip();
        try (FileChannel channel = FileChannel.open(super.getOutputFile().toPath(), WRITE)) {
            channel.write(buffer);
            buffer.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int countLines() throws IOException {
        Path path = Paths.get(super.getInputFile().getPath());
        int result = (int) Files.lines(path).count();
        return result;
    }

}
