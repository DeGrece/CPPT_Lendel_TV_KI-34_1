package main.kzp.lab3;

import java.io.*;

public class LoggerInFile {

    public static void printLogToFile(String data) {
        try(FileWriter fileWriter = new FileWriter("Lab3Logger.txt", true)){
            fileWriter.write(data + '\n');
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
