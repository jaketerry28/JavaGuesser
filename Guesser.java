import java.util.*;
import java.lang.*;

public class Guesser{
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args){
        new Guesser();
    } // end main

    public Guesser(){
        menu();
    } // end Guesser

    public void menu(){
        boolean keepGoing = true;
        while (keepGoing){

            System.out.println("0) Quit");
            System.out.println("1) Human Guesser");
            System.out.println("2) Computer Guesser");

            String response = input.nextLine();

            if (response.equals("0")){
                System.out.println("Goodbye!");
                keepGoing = false;

            } else if (response.equals("1")){
                

            } else if (response.equals("2")){
                System.out.println("Computer Guesser!");

            } else {
                System.out.println("Invalid input");
            }
        } // end while
    } // end menu

    public boolean Human(){
        int randInt = rand.nextInt(100) + 1; // randInt given random integer
        System.out.println("Try to guess the number!");
        System.out.println(randInt);   
        String guess = input.nextLine();
    } // end Human
}
