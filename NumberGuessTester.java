package data.structures;

/**
 *Name: Ian Nielsen
 *Date Due: February 6th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Application for the NumberGuess class. The application creates an object of
//the NumberGuess class and calls the printInstructions method and modify
//range method. The method calls are placed in a infinite loop so once a game
//ends a new one begins. 
public class NumberGuessTester {
  public static void main(String[] args){
    NumberGuess player = new NumberGuess();
    while(true){
      player.printInstructions();
      player.modifyRange(player.getData(),0,200,150);
    }
  }
}
