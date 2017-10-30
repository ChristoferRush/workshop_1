package pl.coderslab.christoferrush.lottery;

import java.util.*;

public class Lotto {

    public static void main(String[] args) {

        System.out.println(drawNumbers());
        System.out.println(chooseSixNumbers());
    }

    /**
     * draws six completely random numbers
     * from 1 to 49
     */
    public static List<Integer> drawNumbers(){
        List<Integer> listOfSix = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 6; i++){
            while (true) {
                int tmp = rand.nextInt(49 + 1);
                if (!listOfSix.contains(tmp)){
                    listOfSix.add(tmp);
                    break;
                }
            }
        }
        Collections.sort(listOfSix);
        return listOfSix;
    }

    /**
     * insert six numbers that don't repeat
     */
    public static List<Integer> chooseSixNumbers(){
        Scanner scan = new Scanner(System.in);
        List<Integer> listOfSix = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            while (true){
                int tmp = scan.nextInt();
                if (!listOfSix.contains(tmp) && tmp > 0 && tmp < 50){
                    listOfSix.add(tmp);
                    break;
                } else if (tmp < 1 || tmp > 49){
                    System.out.println("You should insert a number between 1 and 49");
                }
            }
        }
        Collections.sort(listOfSix);
        return listOfSix;
    }

    public static void checkIfWon(List<Integer> drawnSix, List<Integer> insertSix){

    }
}







