package data.structures;

public class BinarySearch {
  public static int bSearch(int[] ar, int target, int begin, int end){
    int mid;
    while(end > begin){
      mid = (begin+end)/2;
      if(ar[mid] == target)
        return mid;
      if(ar[mid] < target)
        begin = mid+1;
      else
        end = mid;
    }
    
    return -1;
  }   
  
  public static void main(String[] args){
    int scores[] = new int[100];
    
    for(int i = 0;i < 100;i++){
      scores[i] = i;
    }
    
    System.out.print(bSearch(scores,45,0,scores.length));
  }
}
