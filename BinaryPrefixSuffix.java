package data.structures;

import java.util.ArrayList;

/*Name: Ian Nielsen
 *Date Due: April 17th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//The BinaryPrefixSuffix class prints all combinations of the string prefix and
//k more binary digits. All of the combinations are printed followed by the
//string prefix which is followed by nothing.
public class BinaryPrefixSuffix {
  public static int originalK;
  
  //The method numbers uses recursion in order to print all combinations of the
  //prefix and the suffix which are both binary digits. When k is zero is the 
  //stopping condition and the method will print the combination of the prefix
  //and the suffix which is zero in binary form, followed by the prefix alone.
  //The number of possible combinations is 2^k and we need to print the binary
  //representation of 0 to (2^k)-1. The number of digits in the binary 
  //representation of (2^k) is k, and if you keep decreasing k by one there 
  //should be k digits in each binary representation until you hit ((2^k)-1)/2.
  //In each loop the method will print the prefix followed by the binary form
  //of (2^k)-1, with this number decreasing for every loop.The method loops 
  //until it hits ((2^k)-1)/2 and will call itself with k-1.
  public static void numbers(String prefix, int k){
    if(k < 1){
      System.out.print(prefix);
      print_binary(0);
      System.out.println(prefix);
    }
    else{
      int a = (int)((Math.pow(2,k))-1)/2;
      int b = (int)(Math.pow(2,k)-1);
      while(b > a){
        System.out.print(prefix);
        print_binary(b);
        b--;
      }
      numbers(prefix,(k-1));
    }
  }
  //print_binary prints the binary representation of the given integer. In order
  //to account for the difference in the length of k and some of the binary
  //numbers, the method will check if the size of the binary number of less than
  //the k given, or the original k, and will print a zero for every size the 
  //binary number is less than k.
  public static void print_binary(int a){
    ArrayList<Integer> array = new ArrayList<>();
      while(a != 0){
        array.add(a%2);
        a=a/2;
      }
      if(array.size() < originalK){
        int c = originalK;
        while(array.size() < c){
          System.out.print(0);
          c--;
        }
      }
      for(int i=1;i<=array.size();i++){
        System.out.print(array.get(array.size()-i));
      }
      System.out.println("");
    }
  }

