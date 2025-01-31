import java.util.Scanner;

public class Dice_game {
    public static void main(String[] args){
        System.out.print("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int Dice_number = sc.nextInt();
        while(Dice_number<=10){
            if(Dice_number<=6){
                System.out.print("You won the game"+Dice_number);
                break;
            }
            else {
                System.out.print("you lost the game"+Dice_number);
                break;
            }

        }
    }
}
