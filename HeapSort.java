package data.structures;

import java.util.Arrays;
import java.util.Random;


public class HeapSort {
  private int[] data;
  private int top;
  
  //Constructor for HeapSort class. Sets the top value to one, the array data
  //to an array of size 1000000, and the first value in the array to -1.
  public HeapSort(){
    top = 1;
    data = new int[1000000];
    data[0] = -1;
  }
  
  //Inserts a given integer into the heap. 
  public void insert(int target){
    int temp1, temp2 = top;
    data[top++] = target;
    while( data[temp2] < data[ temp2/2 ]){
      temp1 = data[temp2];
      data[temp2] = data[ temp2/2 ];
      data[ temp2/2 ] = temp1;
      temp2 = temp2/2;
    }     
  }
  
  //Deletes the root of the heap. The minimum value should be the root of the 
  //heap so the method will return that value and adjust the heap after the 
  //value is deleted. 
  public int deleteMin(){
    int minValue = data[1];
    data[1] = data[--top];
    int temp = 1;
    while(true){
      temp = adjust(temp);
      if(temp == -1)
        break;
    }
    return minValue;
  }
  
  
  
  
  public void sort(int[] a){
    int i;
    Heap h = new Heap();
    for(i = 0; i < a.length; i++)
       insert(a[i]);
    for(i = 0; i < a.length; i++)
        a[i] = deleteMin();
  }
  
  private int adjust(int index){
    int temp;
    if( 2*index >= top )
      return -1;
    if( 2*index == top - 1 ){
      if (data[index] > data[2*index] ){
        temp = data[index];
        data[index] = data[2*index];
        data[2*index] = temp;
      }
      return -1;     
    }

    if( data[index] <= data[2*index] && data[index] <=data[2*index+1])
      return -1;

    if(data[2*index] <= data[2*index+1]){
      temp = data[index];
      data[index] = data[2*index];
      data[2*index] = temp;

      return 2*index;
    }

    temp = data[index];
    data[index] = data[2*index+1];
    data[2*index+1] = temp;
    return 2*index+1;    
  }
  
  public static void main(String[] args){
    int size = 60000;
    HeapSort h = new HeapSort();
    int[] array = {32,41,5,8,9,10,35,90,78,11,6,1};    
    h.sort(array);
    System.out.println(Arrays.toString(array));
  }
}
