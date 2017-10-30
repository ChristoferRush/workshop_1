package pl.coderslab.christoferrush.guessthenumbergame;

import java.util.Scanner;

public class GuessTheNumberTwo {

    public static void main(String[] args){

        System.out.println("Think a number between 0 - 1000");
        int min = 0;
        int max = 1000;
        while (true){
            int guess = ((max - min) / 2) + min;
            String answer = "";
            System.out.println("I guess it's: " + guess);
            System.out.println("Insert one of: ('too much', 'too less', 'exactly'");
            Scanner scan = new Scanner(System.in);
            answer = scan.nextLine();
            if (answer.equals("too much")){
                max = guess;
            } else if (answer.equals("too less")){
                min = guess;
            } else {
                System.out.println("I won!!!");
                break;
            }
            System.out.println("Don't cheat.");
        }
    }
}
