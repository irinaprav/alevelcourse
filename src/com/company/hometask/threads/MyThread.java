package com.company.hometask.threads;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static java.nio.file.StandardOpenOption.WRITE;

public class MyThread extends Thread {
    private volatile InputMessage message;
    private volatile boolean isRunning;
    private String repository = "";

    MyThread(InputMessage message) {
        this.message = message;
        this.isRunning = true;
    }

    public void run() {
        while (isRunning) {
            synchronized (message) {
                if (message.getMessage().equals("quit")) {
                    ByteBuffer buffer = ByteBuffer.wrap(repository.getBytes());
                    try (FileChannel channel = FileChannel.open(new File("resources/forThread.txt").toPath(), WRITE)) {
                        channel.write(buffer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    kill();
                }

                if (message.isModified()) {
                    if (!message.getMessage().equals("quit"))
                        repository += message.getMessage() + " ";
                    message.setModified(false);
                }
                message.notify();
            }
        }

    }

    private void kill() {
        isRunning = false;
    }

    public String getRepository() {
        return repository;
    }

}
