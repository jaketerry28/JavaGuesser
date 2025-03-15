//Guesser.java

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
                System.out.println("Human Guesser!");
                Human();


            } else if (response.equals("2")){
                System.out.println("Computer Guesser!");
                Computer();

            } else {
                System.out.println("Invalid input");
            }
        } // end while
    } // end menu

    public void Human(){
        int randInt = rand.nextInt(100) + 1; // randInt given random integer
        System.out.println("Try to guess the number between 1 and 100!");
        //System.out.println(randInt);   
        boolean keepGoing = true;
        int turns = 0;

        while (keepGoing){
            String guess = input.nextLine();

            try {
                int guessInt = Integer.parseInt(guess); // Convert input to int
                if (guessInt < randInt) {
                    System.out.println("Too low! Try again.");
                    turns += 1;
                } else if (guessInt > randInt){
                    System.out.println("Too high! Try again.");
                    turns += 1;
                } else {
                    turns += 1;
                    System.out.println("Correct! It took you " + turns + " turns!");

                    keepGoing = false;
                } // end if
            } catch (NumberFormatException e) {
                if (guess.equalsIgnoreCase("q")){
                    System.out.println("Quitting");
                    keepGoing = false;
                } else {               
                 System.out.println("Invalid input! Please enter a number.");
                } // end if
            } // end catch
        } // end while
    } // end Human

    public void Computer(){
        int lowerBound = 1;
        int upperBound = 100;
        int guess = 50;
        int turns = 0;
        System.out.println("Think of a number between 1 and 100 and the computer will guess it in 7 turns or less!");
        System.out.println("Type H if too high, L if too low, or C if correct.");

        boolean keepGoing = true;
        while (keepGoing){
            System.out.println("My guess is " + guess + ", is that too (H)igh, (L)ow, or (C)orrect?");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("l")){
                lowerBound = guess + 1; // update lower bound 
                guess = (lowerBound + upperBound) / 2; // guess equals midpoint
                turns += 1;
            }

            else if (answer.equalsIgnoreCase("h")){
                upperBound = guess - 1; // update upper bound
                guess = (lowerBound + upperBound) / 2; // guess equals midpoint
                turns += 1;
            }

            else if (answer.equalsIgnoreCase("c")){
                turns += 1;
                System.out.println("I got it in " + turns + " turns!");
                keepGoing = false;
            }

            else if (answer.equalsIgnoreCase("q")){
                System.out.println("Goodbye!");
                keepGoing = false;
            } 

            else {
                System.out.println("Invalid input, try again please!");
            } // end if 
        } // end while
    } // end Computer
}
