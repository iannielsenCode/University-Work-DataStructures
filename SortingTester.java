package data.structures;
import java.util.*;
/**
 *
 * @author Ian
 */
public class SortingTester {
  public static void main(String[] args){
    int[] a = {8,23,12,9,1,3,56,45,32};
    SortingMethods.mergeSort(a,0,a.length-1);
    System.out.print(Arrays.toString(a));
  }
}
