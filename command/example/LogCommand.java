package command.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogCommand implements Command {
    private Logger receiver;
    private String messasge;

    public LogCommand(Logger receiver, String message) {
        this.receiver = receiver;
        this.messasge = message;
    }

    @Override
    public void excute() {
        receiver.log(messasge);
    }

    @Override
   public void store() {
        try (FileWriter fw = new FileWriter("commands.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(this.messasge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load(Logger receiver, String message) {
        this.receiver = receiver;
        this.messasge = message;
    }
    
}
