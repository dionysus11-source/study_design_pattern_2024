package command.example;

public interface Command {
    void excute();
    void store();
    void load(Logger receiver, String message);
}
