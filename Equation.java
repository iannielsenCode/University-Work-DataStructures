/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author Ian
 */
public class Equation {
  private double a,b,c,d;
  private double leftEnd,rightEnd;
  
  
  public Equation(double a,double b, double c, double d){
    this.b = b/a;
    this.c = c/a;
    this.d = d/a;
  }
  
  public double solve(double errorLevel){
      searchEnd();
      double mid = (leftEnd + rightEnd)/2;
      double midValue;
      
      while(rightEnd - leftEnd > errorLevel){
          midValue = mid*mid*mid+b*mid*mid+c*mid+d;
          if(midValue > 0)
            rightEnd = mid;
          else
            leftEnd = mid;
          mid = (leftEnd+rightEnd)/2;
      }
      return mid;
  }
  
  public void searchEnd(){
      double x = -1;
      while(x*x*x+b*x*x+c*x+d >= 0){
          x*= 2;
      }
      leftEnd = x;
      x = 1;
      while(x*x*x+b*x*x+c*x+d <= 0){
          x *= 2;
      }
      rightEnd = x;
  }
}
