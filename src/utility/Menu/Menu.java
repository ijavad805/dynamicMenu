package utility.Menu;

import utility.IOTools;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private IOTools io = new IOTools();
    private static List<IApp> menus = new ArrayList<>();

    public static void add(IApp app) {
        menus.add(app);
    }

    public void run(int appNumber) {
        menus.get(appNumber).run();
    }

    public void showMenu() {
        for (int i = 0; i < menus.size(); i++) {
            io.printInNewLine("[ " + i + " ] " + menus.get(i).appName());
        }
    }
}
