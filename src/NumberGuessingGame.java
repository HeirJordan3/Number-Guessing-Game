import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();

        int numberToGuess = randomNumber.nextInt(10) + 1;

        System.out.println("Guess a number between 1 and 10 ");

        int userGuess = scanner.nextInt();

        if(userGuess == numberToGuess){
            System.out.println("Yay you it");
        }else{
            System.out.println("Ooops ! The number was " + numberToGuess);
        }








    }
}
