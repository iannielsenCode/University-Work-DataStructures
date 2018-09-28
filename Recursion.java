/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author Ian
 */
public class Recursion {
  public static void main(String[] args){
   
    //int[] scores = {45,67,8,90,100,6,45,32,100,12};
    //selectionSort(scores,10);
    //System.out.println(java.util.Arrays.toString(scores));
    //minCoin(40);
    
    triangle(5);
  }
  public static void selectionSort(int[] a,int len){
    if(len < 2){
      return;
    }
    int i = getMaxIndex(a,len);
    int temp = a[i];
    a[i] = a[len-1];
    a[len-1] = temp;
    selectionSort(a,len-1);
  }
  public static int getMaxIndex(int[] a, int size){
    if(size == 1){
      return 0;
    }
    int i = getMaxIndex(a,size-1);
    if(a[size-1] > a[i]){
      return size -1;
    }
    else{
      return i;
    }
  }
  public static void m(String prefix,int n){
    if(n==0){
      return;
    }
    System.out.print(prefix);
    printNStars(n);
    System.out.println();
    m(prefix +" ",n-1);
  }
  public static void triangle(int n){
    if(n<2){
      System.out.println("*");
    }
    triangle(n-1);
    printNStars(n);
    
  }
  public static void printNStars(int n){
    if(n == 0){
      return;
    }
    printNStars(n-1);
    System.out.print("*");
  }
  public static void minCoin(int n){
    if(n < 1){
     
      System.out.print(1);
      return;
    }
    minCoin(n-25);
    minCoin(n-10);
    minCoin(n-5);
    minCoin(n-1);
  }
  public static void move(char from, char to, char temp,int discs){
    if(discs == 0){
      return;
    }
    move(from,temp,to,discs-1);
    System.out.println(from + "->" + to);
    move(temp,to,from,discs-1);
  }
}
