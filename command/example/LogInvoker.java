package command.example;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class LogInvoker {
    private Queue<Command> commandQueue = new LinkedList<>();
    private Logger logger;

    public LogInvoker(Logger logger) {
        this.logger = logger;
    }

    public void addCommand(Command command) {
        commandQueue.add(command);
        command.store();
    }

    public void excuteCommand() {
        while(!commandQueue.isEmpty()) {
            Command command = commandQueue.poll();
            if (command != null) {
                command.excute();
            }
        }
    }

    public void loadCommands() {
        try (BufferedReader br = new BufferedReader(new FileReader("commands.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Command command = new LogCommand(logger, "");
                command.load(logger, line);
                commandQueue.add(command);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
