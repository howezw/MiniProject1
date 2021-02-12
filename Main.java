/* Mini Project 1
 Zac Howe
Evan Vujcec
Jacob Hartman
Zachary Preszler
February 17 2021*/
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please enter and positive whole number:");
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum) - 1;
    System.out.println("A Random number to guess has been generated");
    playGame(randomNum, userNum);
  }
  
  static void playGame(int guessNum, int originalNum){
    System.out.println("Please guess a number between 0 and" + " " + originalNum);
    Scanner s = new Scanner(System.in);
    int userGuess;
    int numTries = 1;
    userGuess = s.nextInt();
    while(userGuess != guessNum){
      if(userGuess < guessNum)
         System.out.println("Guess Higher");
      else
          System.out.println("Guess Lower");
          System.out.println("Enter your new guess:");
          userGuess = s.nextInt();
          numTries ++;
          
         }
      System.out.println("Great, you win! It took you" + " "+ numTries + " " + "tries");
  }
}