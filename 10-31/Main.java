package L15_Activity;

import java.util.Scanner;

import L15_Activity.Calculator;
import L15_Activity.Operations;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Calculator.number1();
            Double num1 = scanner.nextDouble();

            Calculator.number2();
            Double num2 = scanner.nextDouble();
            
            Calculator.listOfOperations();
            char operation = scanner.next().charAt(0);

            if (operation == 'E' || operation == 'e') {
                Calculator.displayExitMessage();
                break;
            }

            Double result = null;
            boolean validOperation = true;
            String operatorSymbol = "";
            
            switch (operation) {
                case 'A':
                case 'a':
                    result = Operations.add(num1, num2);
	                operatorSymbol = "+";    
                    break;
                case 'B':
                case 'b':
                    result = Operations.subtract(num1, num2);
                    operatorSymbol = "-";
                    break;
                case 'C':
                case 'c':
                    result = Operations.multiply(num1, num2);
                    operatorSymbol = "*";
                    break;
                case 'D':
                case 'd':
                    if (num2 != 0) {
                        result = Operations.divide(num1, num2);
                        operatorSymbol = "/";
                    } else {
                        Calculator.zeroNotAllowed();
                        validOperation = false;
                    }
                    break;
                default:
                    Calculator.notInMenu();
                    validOperation = false;
                    break;
            }

            if (validOperation && result != null) {
                Calculator.displayResult(num1, operatorSymbol, num2, result);
            }
        }

        scanner.close();
    }
}
