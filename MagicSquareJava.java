import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquareJava {
    public static void main (String[] args) {
        char playAgain = 'y';
        while(playAgain != 'n') {
            int numberLimit = 1;
            ArrayList numberList = new ArrayList();

            Scanner input = new Scanner(System.in);

            // Create a loop to get all the user inputs
            int number = 0;
            while (numberLimit <= 9) {
                System.out.print("Enter number " + numberLimit + ": ");
                number = input.nextInt();
                numberList.add(number);
                numberLimit += 1;
            }
            // Print the magic square
            System.out.println(numberList.get(0) + " " + numberList.get(1) + " " + numberList.get(2));
            System.out.println(numberList.get(3) + " " + numberList.get(4) + " " + numberList.get(5));
            System.out.println(numberList.get(6) + " " + numberList.get(7) + " " + numberList.get(8));

            // The rows in the magic square
            int r1 = (int) numberList.get(0) + (int) numberList.get(1) + (int) numberList.get(2);
            int r2 = (int) numberList.get(3) + (int) numberList.get(4) + (int) numberList.get(5);
            int r3 = (int) numberList.get(6) + (int) numberList.get(7) + (int) numberList.get(8);

            // The columns in the magic square
            int c1 = (int) numberList.get(0) + (int) numberList.get(3) + (int) numberList.get(6);
            int c2 = (int) numberList.get(1) + (int) numberList.get(4) + (int) numberList.get(7);
            int c3 = (int) numberList.get(2) + (int) numberList.get(5) + (int) numberList.get(8);

            // The diagonals in the magic square
            int d1 = (int) numberList.get(0) + (int) numberList.get(4) + (int) numberList.get(8);
            int d2 = (int) numberList.get(2) + (int) numberList.get(4) + (int) numberList.get(6);

            if (number > 9) {
                if ((r1 == r2) && (r1 == r3) && (r1 == c1) && (r1 == c2) && (r1 == c3) && (r1 == d1) && (r1 == d2)) {
                    System.out.println("Is Magic Square: True");
                    System.out.println("Is Lo Shu Square: Flase");
                } else {
                    System.out.println("Is Magic Square: Flase");
                    System.out.println("Is Lo Shu Square: Flase");
                }
            } else {
                if ((r1 == r2) && (r1 == r3) && (r1 == c1) && (r1 == c2) && (r1 == c3) && (r1 == d1) && (r1 == c2)) {
                    System.out.println("Is Magic Square: True");
                    System.out.println("Is Lo Shu Square: True");
                } else {
                    System.out.println("Is Magic Square: False");
                    System.out.println("Is Lo Shu Square: False");
                }
            }
            System.out.print("Do you want to play again? (y/n) ");
            char choice = input.next().charAt(0);
            if (choice == 'n'){
                playAgain = 'n';
		System.out.println("Thanks for playing!");
                break;
            }
            else{
                System.out.println();
            }
        }
    }
}
