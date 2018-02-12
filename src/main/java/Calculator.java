public class Calculator {

    public double add (double num1, double num2){
        double sum = num1 + num2;
        System.out.println("\nYour result is " + sum);
        return sum;
    }

    public double subtract (double num1, double num2){
        double less = num1 - num2;
        System.out.println("\nYour result is " + less);
        return less;
    }

    public double multiply (double num1, double num2){
        double product = num1 * num2;
        System.out.println("\nYour result is " + product);
        return product;
    }

    public double divide (double num1, double num2){
        double divided = num1 / num2;
        System.out.println("\nYour result is " + divided);
        return divided;
    }
}
