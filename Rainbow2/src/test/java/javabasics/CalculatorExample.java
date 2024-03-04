package javabasics;

public class CalculatorExample {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        String operator = "+";
        if (operator.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (operator.equals("-")) {
            if (firstNumber > secondNumber) {
                System.out.println(firstNumber - secondNumber);
            } else {
                System.out.println(secondNumber - firstNumber);
            }

                }
    }
}