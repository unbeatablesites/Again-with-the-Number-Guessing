import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        logic();

    }

    static void logic(){

        System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");

        System.out.print("Your guess: ");

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();

        int random = 1 + rand.nextInt(10);

        int userInput = scan.nextInt();

        int count = 1;

        do {

            count++;
            System.out.println("That is incorrect.  Guess again.");
            System.out.print("Your guess: ");
            userInput = scan.nextInt();

        }while (userInput != random);

        System.out.println("That's right!  You're a good guesser.");
        System.out.println("It only took you " + count + " tries.");

    }

}
