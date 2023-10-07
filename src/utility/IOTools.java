package utility;

import java.util.InputMismatchException;
import java.util.Scanner;

enum inputTypeEnum {
    INT,
    STRING,
}

public class IOTools {
    private final Scanner in = new Scanner(System.in);

    public IOTools print(String text) {
        System.out.print(text);
        return this;
    }

    public IOTools printInNewLine(String text) {
        System.out.println(text);
        return this;
    }

    public int inputInt() throws ExceptionHandler {
        try {
            return (int) this.input(inputTypeEnum.INT);
        } catch (InputMismatchException e) {
            throw new ExceptionHandler("Please enter a number");
        }
    }

    public String inputString() {
        return (String) this.input(inputTypeEnum.STRING);
    }

    private Object input(inputTypeEnum type) throws InputMismatchException {
        return switch (type) {
            case STRING -> this.in.next();
            case INT -> this.in.nextInt();
        };
    }
}
