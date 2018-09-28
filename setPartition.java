package data.structures;

import java.util.ArrayList;
import java.util.Scanner;

public class setPartition{
  
 /* The set partion problem is intractable. It can be verified in polynomial 
  * time, but there is no known solution that has a running time faster than
  * O(2^n). In fact, the algorithm given in this program runs in O(2^n);
  */
  public static int total; //Sum of elements in given set.
  
  public static ArrayList<Integer> set; //Given set of integers.
  
  /*Finds total based on input values. Method will find the sum as well as
   * add each value to the arraylist. 
   */
  public static void find_total(){
    set = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int j, k = 0;
    do{
      int i = in.nextInt();
      if(i < 0){
        break;
      }
      set.add(i);
      total += i;
      j = i;
      k++;
    }while(j >= 0);
  }
  
 
  public static ArrayList<ArrayList<Integer>> findAllSubsets(ArrayList<Integer> arr){
    ArrayList<ArrayList<Integer>> collection = new ArrayList<ArrayList<Integer>>();
    if(arr.isEmpty()){
      collection.add(new ArrayList<Integer>());
    }
    else{
      ArrayList<Integer> subset = new ArrayList<>();
      ArrayList<ArrayList<Integer>> subset2 = new ArrayList<ArrayList<Integer>>();
      subset.addAll(arr);
      int first = subset.remove(0);
      subset2 = findAllSubsets(subset);
      collection.addAll(subset2);
      subset2 = findAllSubsets(subset);
      for(ArrayList<Integer> sub : subset2){
        sub.add(0,first);
      }
      collection.addAll(subset2);
    }
    return collection;
  }
  
  /* Upon finding the power set of the given set this method will find the total
   * of each set in the power set. It will then compare each sum to the 
   * difference of the total (sum of the whole set) and the sum of that subset.
   * If the sum are equal there are then two subsets of the set that have equal 
   * sums. The method will return a boolean as such. 
   */
  public static boolean partition(){
    find_total();
    if(total % 2 != 0){
      return false;
    }
    ArrayList<ArrayList<Integer>> collection = new ArrayList<ArrayList<Integer>>();
    collection = findAllSubsets(set);
    for(ArrayList<Integer> sub : collection){
      int sum = 0;
      for(int i = 0; i < sub.size(); i++){
        sum+=sub.get(i);
      }
      if(sum == (total - sum)){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args){
    if(partition()){
      System.out.println("There are two sudsets of the set that are equal in sum.");
    }
    else{
      System.out.println("There are no two subsets of the set that are equal in sum.");
    }
  }
}
