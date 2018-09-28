package data.structures;

import java.io.FileNotFoundException;

/**
 *Name: Ian Nielsen
 *Date Due: February 6th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class is a tester class for the WordCounter class.
public class WordCounterTester {
    
  public static void main(String[] args) throws FileNotFoundException{
    WordCounter object = new WordCounter(); //Creates a WordCounter object.
    object.readFromFile("framingham.txt"); //Reads from the file specified.
    object.printTable(); //Prints the table of the occurences of each word 
                         //length in the file.
  }
}

