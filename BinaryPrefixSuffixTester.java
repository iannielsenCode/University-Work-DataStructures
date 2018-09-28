package data.structures;

/*Name: Ian Nielsen
 *Date Due: April 17th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//A tester class for the BinaryPrefixSuffix class. The tester class sets the 
//static variable originalK to k, a random integer, and calls the numbers method
//with k and the string "10010" as arguments.
public class BinaryPrefixSuffixTester {
  public static void main(String[] args){
    int k = 4;
    BinaryPrefixSuffix.originalK = k;
    BinaryPrefixSuffix.numbers("10010",k);
  }
}
