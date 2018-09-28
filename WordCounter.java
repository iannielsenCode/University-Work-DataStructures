package data.structures;

import java.io.*;
import java.util.Scanner;

/**
 *Name: Ian Nielsen
 *Date Due: February 6th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class WordCounter reads from a file and prints the number of occurences of 
//words of length 1,2,3, etc. 
public class WordCounter{
  private int[] counter; //Stores the number of occurences of each length. The
  //length will be equal to the index.
  private int counter2 = 0; //Stores the maximum length of a word. Where the 
  //program should stop printing. 
 
  //Method reads from the file and determines the number of occurences of each
  //word length.
  public void readFromFile(String file) throws FileNotFoundException{
    File input = new File(file);
    Scanner in = new Scanner(input);
    counter = new int[100];
    for(int i = 0;in.hasNext();){
      String letter = in.next();
      char[] myChar;
      myChar = letter.toCharArray(); //Converts the string into a character.
      if(Character.isLetter(myChar[i])){
        i++;
      }
      else{
        counter[i]++;
      }
    }
  }
  
  //Methos prints a table with the number of words that have the smallest length
  //known up to the maximum length known.
  public void printTable(){
    for(int i = 99;counter[i] != 0;){ //Used to find the last known index that
      i--;                            //is valued at zero.
      counter2 = i;
    }
    int j = 0;
    while(j <= counter2){
      if(counter[j] > 0){
        System.out.print(j);
        System.out.print("    ");
        System.out.print(counter[j]);
          j++;
      }
    }
  }
}
