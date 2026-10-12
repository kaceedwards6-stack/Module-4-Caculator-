import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    public Calc() {
        num1 = 0.0;
        num2 = 0.0;
    }

    // Keep asking until the user enters a finite numeric value.
    public double getValidNumber(Scanner input, String prompt) {
        while (true) {
            System.out.println(prompt);
            String userInput = input.nextLine().trim();

            try {
                double number = Double.parseDouble(userInput);
                if (Double.isFinite(number)) {
                    return number;
                }
            } catch (NumberFormatException e) {
                // Invalid input is handled by the message below.
            }

            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n" +
               "Num1: " + num1 + "\n" +
               "Num2: " + num2;
    }
}
