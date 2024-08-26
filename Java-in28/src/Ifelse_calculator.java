import java.util.Scanner;

public class Ifelse_calculator {
    public static void main(String[] args){
        // if else calci
        // input 2 numbers
        // input choice operator
        System.out.println("Enter value of 1st");
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        System.out.println("Enter value of 2nd");
        Scanner scanner1 = new Scanner(System.in);
        int int2 = scanner1.nextInt();
        System.out.println("Enter choice 1:add 2:sub 3:div 4:mod");
        Scanner scanner2 = new Scanner(System.in);
        int operator = scanner2.nextInt();
        int int3;
        if(operator==1)
        {
            int3 = int1+int2;
            System.out.println(int3);
        } else if (operator==2) {
            int3 = int1-int2;
            System.out.println(int3);
        }else if (operator==3) {
            int3 = int1-int2;
            System.out.println(int3);
        }else if (operator==4) {
            int3 = int1-int2;
            System.out.println(int3);
        }else {
            System.out.println("Invalid problem");
        }
    }
}
