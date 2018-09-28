/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author Ian
 */
public class SquareRoot {
  public static void main(String[] args){
      double r = 1;
      double d = 10000;
      for(int i = 0;i < 100;i++){
        r = (r+d/r)/2;
        System.out.println(r);
      }
      System.out.println(r);
      
      
  }
}
