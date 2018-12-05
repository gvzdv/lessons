package patterns.command;

public class ProcessCommand extends Command {
    public ProcessCommand(TextProcessor processor) {
        super(processor);
    }

    @Override
    String name() {
        return "ProcessCommand";
    }

    @Override
    boolean execute() {
        // some implementation here
        // process, repeat, cancel, exit
        System.out.println("Реализация ProcessCommand");
        return true;
    }
}
