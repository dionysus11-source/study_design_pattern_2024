package command.example;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        LogInvoker invoker = new LogInvoker(logger);

        Command command1 = new LogCommand(logger,"This is the first log");
        Command command2 = new LogCommand(logger,"This is the second log");

        invoker.addCommand(command1);
        invoker.addCommand(command2);

        invoker.excuteCommand();

        invoker.loadCommands();
        invoker.excuteCommand();
    }
    
}
