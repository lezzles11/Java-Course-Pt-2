/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lesleycheung
 */
import java.util.*;
import java.io.*;


public class Printer {
    private Scanner reader;
    private File file;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }

    /*
    public void openFile() {
        try {
            this.reader = new Scanner(this.file, "UTF-8");
        } catch (Exception e) {
            System.out.println("could not find file");
        }
    }
    */

    public void closeFile() {
        this.reader.close();
    }


    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(this.file);

        if (word.isEmpty()) {
            printEntireFile();
        } else {

            while (this.reader.hasNextLine()) {
                String line = this.reader.nextLine();

                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        }

        closeFile();
    }

    public void printEntireFile() {

        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();

            System.out.println(line);
        }
    }
}

