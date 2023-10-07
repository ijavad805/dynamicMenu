package apps.HowItWork;

import utility.IOTools;
import utility.Menu.IApp;

public class HowItsWorkApp implements IApp {
    private final IOTools io = new IOTools();
    public String appName() {
        return "Documentation";
    }

    public void run(){
        // Print the documentation text
        io.printInNewLine("Java Application Menu System\n");
        io.printInNewLine("This Java application demonstrates a simple menu system that allows users to select and run different applications. It uses object-oriented programming concepts to achieve modularity and flexibility.\n");
        io.printInNewLine("Components:\n");
        io.printInNewLine("App Interface / Base Class (App):\n");
        io.printInNewLine("Defines a common interface/base class for all application classes.");
        io.printInNewLine("Requires the implementation of the run method, which contains the specific logic for each application.");
        io.printInNewLine("Individual Application Classes (App1, App2, etc.):\n");
        io.printInNewLine("Implements the App interface or extends the App base class.");
        io.printInNewLine("Provides unique implementations of the run method for each application.");
        io.printInNewLine("Menu Class (Menu):\n");
        io.printInNewLine("Manages a list of application instances.");
        io.printInNewLine("Provides a static add method to add application instances to the menu.");
        io.printInNewLine("Offers a static getMenuItems method to retrieve the list of available applications.");
        io.printInNewLine("Main Class (Main):\n");
        io.printInNewLine("The main entry point of the application.");
        io.printInNewLine("Adds different application instances to the menu.");
        io.printInNewLine("Displays a menu to the user, showing available options.");
        io.printInNewLine("Accepts user input for selecting an option.");
        io.printInNewLine("Executes the selected application's run method based on user input.");
        io.printInNewLine("Usage:\n");
        io.printInNewLine("Create custom application classes by implementing the App interface or extending the App base class.");
        io.printInNewLine("Add your application instances to the menu using the Menu.add method.");
        io.printInNewLine("Customize the menu display and user input handling in the Main class.");
        io.printInNewLine("Run the application to present the menu to the user and execute the selected application.");
        io.printInNewLine("This approach allows you to easily expand your menu system by adding new application classes without modifying existing code. It promotes code reusability and maintainability.\n");
        io.printInNewLine("Feel free to adapt and extend this code to build more complex menu systems or applications based on your specific requirements.");
    }
}
