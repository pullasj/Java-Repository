import java.util.Scanner;

public class Switch_calci {
    public static void main(String[] args){
        System.out.println("Enter value of 1st");
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        System.out.println("Enter value of 2nd");
        Scanner scanner1 = new Scanner(System.in);
        int int2 = scanner1.nextInt();
        System.out.println("Enter choice 1:add 2:sub 3:div 4:mod");
        Scanner scanner2 = new Scanner(System.in);
        int operator = scanner2.nextInt();
        switch (operator){
            case 1 : System.out.println(int1+int2);
                        break;
            case 2 : System.out.println(int1-int2);
                break;

            case 3 : System.out.println(int1/int2);
                break;
            case 4 : System.out.println(int1%int2);
                break;
            default: System.out.println("Invalid Operation");

        }
    }
}
