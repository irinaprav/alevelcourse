package com.company.hometask.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IONIODemo {
    public static void main(String[] args) {
        System.out.println("---IO & NIO FILE READER/WRITER---");
        System.out.println("Default input file or your path?");
        File input;
        File output;
        Scanner in = new Scanner(System.in);
        switch (in.next().trim().toLowerCase()) {
            case "default":
                input = new File("resources/smth.txt");
                break;
            case "path":
                System.out.println("Enter your path");
                input = new File(in.next());
                break;
            default:
                input = new File("resources/smth.txt");
                break;
        }
        System.out.println("Default output file or your path?");
        switch (in.next().trim().toLowerCase()) {
            case "random":
                output = new File("resources/output.txt");
                break;
            case "path":
                System.out.println("Enter your path");
                output = new File(in.next());
                break;
            default:
                output = new File("resources/output.txt");
                break;
        }
        int menuChoice = 0;
        System.out.println("IO or your NIO?");
        Helper helper;
        try {
            switch (in.next().trim().toLowerCase()) {
                case "io":
                    helper = new IOHelper(input, output);
                    break;
                case "nio":
                    helper = new NIOHelper(input, output);
                    break;
                default:
                    helper = new IOHelper(input, output);
                    break;
            }
            System.out.println("Default amount of lines or your amount?");
            switch (in.next().trim().toLowerCase()) {
                case "default":
                    helper.copyText();
                    break;
                case "amount":
                    System.out.println("Enter amount");
                    helper.copyText(in.nextInt());
                    break;
                default:
                    helper.copyText();
                    break;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
