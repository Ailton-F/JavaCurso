package academy.java.oop;
import java.sql.SQLOutput;
import java.util.Scanner;

public class OopClasses {
    public static void main(String[] args) {
        int random = (int) (Math.random()*100) + 1;
        int tries = 10;

        System.out.println("Lets play, GUESS THE NUMBER!!!");
        System.out.println("Insert a number that is between 1 and 100");
        System.out.println("You have 10 tries! Insert the number below: ");


        while(true){
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            if (tries < 2){
                System.out.println("You ran out of tries, the number was: "+random);
                break;
            } else if(number != random){
                --tries;
                System.out.println("Not the answer! You have "+tries+" tries");
                if(number > random){
                    System.out.println("Tip: the random number is lower than: "+number);
                } else {
                    System.out.println("Tip: the random number is higher than: "+number);
                }
            } else {
                System.out.println("Congrats the answer was: "+random);
                break;
            }
        }
    }
}