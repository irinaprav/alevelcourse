package com.company.practice.cat;

import java.io.*;
import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.next();
        try (InputStream input = new FileInputStream(path)) {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
            while (true) {
                String line = buffer.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not Found Exception");

        } catch (IOException ex) {
            System.err.println("IOException");
        }
    }
}
