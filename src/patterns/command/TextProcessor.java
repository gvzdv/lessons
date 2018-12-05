package patterns.command;

import java.util.Scanner;

public class TextProcessor {
    private CommandsHistory history = new CommandsHistory();
    // перечислить все команды в виде констант

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.addCommand(command);
        }
    }

    public void start() {
        Scanner in = new Scanner(System.in);
//        while (true) {
//            if (in.nextLine().equals("process")) {
//                executeCommand(new ProcessCommand(this));

        while (true) {
            switch (in.nextLine()) {
                case "process":
                    executeCommand(new ProcessCommand(this));
                    break;
                case "exit":
                    executeCommand(new ExitCommand(this));
                    break;
            }
        }

    }
}
