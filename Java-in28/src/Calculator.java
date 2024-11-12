import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
/*
* Description

Create a simple command-line calculator that takes two numbers as inputs and performs arithmetic operations on them. The calculator should support the following operations:

Addition (+) Subtraction (-) Multiplication (*) Division (/) Modulo (%) Exponentiation (^)
The calculator should also handle any type casting and display the result as accurately as possible.
Instructions:
Create a Java project in Eclipse or any IDE of your choice.
Create a class called "Calculator" that has a main method.
Within the main method, prompt the user to enter two numbers and the operation they want to perform.
Use the appropriate Java operators and data types to perform the arithmetic operation.
Display the result to the user.

* Example I:
Enter first number: 10
Enter second number: 5
Enter operation (+, -, *, /, %, ^): *
10 * 5 = 50
 */
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = scanner.nextInt();
        System.out.print("Enter second number ");
        int b = scanner.nextInt();
        System.out.print("Enter operation (+,-,/,%,^): ");
        char c = scanner.next().charAt(0);
        switch (c){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            case '%':
                result = a%b;
                break;
            case '^':
                result = a^b;
                break;
            default:
                System.out.println("Please enter correct operator");
                break;
        }
        System.out.println("Result is " + result);
    }
}
