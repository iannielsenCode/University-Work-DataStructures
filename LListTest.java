package data.structures;

import java.util.Random;

public class LListTest {
  public static void main(String[] args){
      LList list = new LList();
      Random r = new Random();
      for(int i = 0;i < 50;i++){
          int n = r.nextInt(1000);
          list.insert(n);
      }
      
      list.print();
      
      System.out.println();
      System.out.print(list.noOfNodes());
  }  
}
