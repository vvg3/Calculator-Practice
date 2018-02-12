import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Prompts userInterface = new Prompts();
        int operation = userInterface.getOperation();
        double num1 = userInterface.getFirstNumber();
        double num2 = userInterface.getSecondNumber();

        Calculator basicMath = new Calculator();

        switch (operation) {
            case 1:
                basicMath.add(num1, num2);
                break;

            case 2:
                basicMath.subtract(num1, num2);
                break;

            case 3:
                basicMath.multiply(num1, num2);
                break;

            case 4:
                basicMath.divide(num1, num2);
                break;

            default:
                break;
        }
    }
}



