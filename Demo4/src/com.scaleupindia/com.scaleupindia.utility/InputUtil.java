package src.com.scaleupindia.com.scaleupindia.utility;

import java.util.Scanner;

public class InputUtil {
    private InputUtil() {
    }

    public static int acceptMarksToFindEmployee(Scanner scanner) {
        System.out.println("Enter employee marks to find employee using marks : ");
        return scanner.nextInt();
    }
}
