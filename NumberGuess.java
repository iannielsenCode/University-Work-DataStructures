package data.structures;

import java.util.*;

/**
 *Name: Ian Nielsen
 *Date Due: March 3rd 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//The NumberGuess class contains methods that construct a number guessing game.
//The class contains the private fields guess, that represents the current
//guess, and an array data, that contains the range of values that the number
//is in. The class also contains accessor methods for these fields.
public class NumberGuess {
  private int guess;
  private int[] data;
  
  public int getGuess(){
    return guess;
  }
  
  public int[] getData(){
    return data;
  }
  
  //Prints the instructions for the user. This method will be called at the 
  //beginning of every new game in the application class.
  public void printInstructions(){
    System.out.println("You've just taken a midterm with a score in the range"
            + " of 0 to 200. I will ask questions to try to guess what your"
            + " score is.");
  }
  
  //Returns an integer value that represents the next number that will be 
  //guessed. A random number will be choosen that is less than one. In order to
  //choose a number that is in the new range of possible values the random 
  //number will be multiplied by the difference of the maximum and minimum 
  //values plus one. To stay in the range the minimum value will be added on. 
  public int randomGuess(int min,int max){
    return (min + (int)(Math.random() * ((max-min) + 1)));
  }
  
  //Where the program guesses a number. The randomGuess method will be called
  //and the method will ask the user if the target number is greater that of
  //equal to it's guess. The method returns the users' answer (yes or no).
  public boolean guess(int high,int low){
    System.out.println("Is your score larger than or equal to " + getGuess() + "?");
    System.out.print("Enter y or n:");
    Scanner in = new Scanner(System.in);
    String answer = in.next();
    if(answer.equals("y") || answer.equals("Y")){
      return true;
    }
    else{
      return false;
    }
  }
  
  //modifyRange parameters represents the array of values that the target number
  //is in, the smallest number in the range, the biggest number in the range,
  //and the target number. It will call the randomGuess method using the 
  //smallest and biggest numbers in the range, which will create the next guess.
  //The method will create a boolean that represents the users' answer
  //using the guess method. If the guess is equal to the target the game will
  //end. If the user answered that the guess is greater than the target the 
  //range will be modified for values greater than the guess. If the guess is 
  //less than the target the range will be modified for values less than the 
  //guess.
  public void modifyRange(int[] data,int low,int high,int score){
    this.guess = randomGuess(low,high);
    boolean answer = guess(high,low);
    if(this.guess == score){
      System.out.println("My guess was correct. Your score was " + score +".");
    }
    else if(answer){
      modifyRange(data,this.guess+1,high,score);
    }
    else{
      modifyRange(data,low,this.guess-1,score);
    }
  }
}
