import apps.InitializeApps;
import utility.ExceptionHandler;
import utility.IOTools;
import utility.Menu.Menu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Menu menu = new Menu();
    private static final IOTools io = new IOTools();

    public static void main(String[] args) {
        pipeline();
    }

    public static void pipeline() {
        new InitializeApps();
        showWelcome();

        while (true) {
            try {
                showAndChooseFromMenu();
                showAppEnded();
            } catch (ExceptionHandler exceptionHandler) {
                io.print("****** ERROR ****** " + exceptionHandler.getMessage());
            }
        }
    }

    private static void showAndChooseFromMenu() throws ExceptionHandler {
        menu.showMenu();
        int appNumber = io.printInNewLine("Please select an option from the menu:\n").inputInt();
        menu.run(appNumber);
    }

    private static void showAppEnded() throws ExceptionHandler {
        io.printInNewLine("\n\n\n\n\n\n\n ***** App Ended *****");
        String answer = io.printInNewLine("would you exist? [Y/N] ").inputString();

        if (answer.equalsIgnoreCase("y")) {
            System.exit(0);
        }
    }

    private static void showWelcome() {
        io.printInNewLine("***************************************");
        io.printInNewLine("****** Welcome to this Java App! ******");
        io.printInNewLine("***************************************");
    }
}