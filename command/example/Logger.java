package command.example;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Logger {
    public void log(String message) {
        try (FileWriter fw = new FileWriter("logfile.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(message);
            System.out.println("Logged: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

