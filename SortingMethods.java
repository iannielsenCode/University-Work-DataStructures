package data.structures;

import java.util.Arrays;

/**
 *
 * @author Ian
 */
public class SortingMethods {
  public static void insertionSort(int[] data,int first,int n){
    int biggest;
    int temp;
    for(int i = n-1;i > 0;i--){
      biggest = first;
      for(int j = first+1;j <= first+i;j++){
        if(data[biggest] < data[j]){
          biggest = j;
        }
      }
      temp = data[first+i];
      data[first+i] = data[biggest];
      data[biggest] = temp;
    }
  }
  
  public static void mergeSort(int[] data,int first,int n){
    int size1;
    int size2;
    
    if(n > 1){
      size1 = n / 2;
      size2 = n - size1;
      
      mergeSort(data,first,size1);
      mergeSort(data,first + size1,size2);
      
      int[] temp = new int[size1+size2];
      int copied = 0;
      int copied1 = 0;
      int copied2 = 0;
      
      while((copied1 < size1) && (copied2 < size2)){
        if(data[first + copied1] < data[first+ size1 + copied2]){
          temp[copied++] = data[first + (copied1++)];
        }
        else{
          temp[copied++] = data[first + size1 + (copied2++)];
        }
      }
      
      while(copied1 < size1){
        temp[copied++] = data[first + (copied1++)];
      }
      
      for(int i = 0;i < copied;i++){
        data[first+i] = temp[i];
      }
    }
  }
  
  public static void hSort(int[] a, int h){
    int i,j;
    for(int sub = 0;sub < h;sub++){
      for(i = sub;i < a.length;i+=h){
        j = i;
        while(j >= h && a[j] < a[j-h]){
          int temp = a[j];
          a[j] = a[j-h];
          a[j-h] = temp;
          j-=h;
        }
      }
    }
  } 
  
  public static void shellSort(int[] a){
    int shell = 1;
    while(shell < a.length){
      shell = 3*shell+1;
    }
    
    while(shell > 0){
      SortingMethods.hSort(a,shell);
      System.out.println(Arrays.toString(a));
      shell /= 3;
    }
  }
            
}

