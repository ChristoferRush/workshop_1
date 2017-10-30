package pl.coderslab.christoferrush.guessthenumbergame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args){

        Random rand = new Random();
        int randNumber = rand.nextInt(100 + 1);
        boolean resultOfGuess = false;
        do {
             resultOfGuess = guessTheNumber(randNumber);
        } while (resultOfGuess == false);
    }

    public static boolean guessTheNumber(int randNumber){
        int number;
        Scanner scan = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Guess the number");
                number = scan.nextInt();
                if (number < randNumber) {
                    System.out.println("Too less");
                    return false;
                } else if (number > randNumber) {
                    System.out.println("Too much");
                    return false;
                } else {
                    System.out.println("You have successfully guessed the number");
                    return true;
                }
            } catch (Exception e) {
                System.out.println("Not a number..");
                return false;
            }
        }
    }
}
