import java.util.Scanner;

public class Prompts {

    Scanner userInput = new Scanner(System.in);
    private double num1;
    private double num2;
    private int operation;

    public int getOperation() {

        do {
            System.out.println("Calculator: Please enter..." +
                    "\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
            operation = userInput.nextInt();

        } while (operation < 1 || operation > 4);

        return operation;
    }

    public double getFirstNumber() {
        System.out.println("Please enter your first number:");
        num1 = userInput.nextDouble();
        return num1;
    }

    public double getSecondNumber() {
        System.out.println("Please enter your second number:");
        num2 = userInput.nextDouble();
        return num2;
    }

}
