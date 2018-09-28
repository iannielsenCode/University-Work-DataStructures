package data.structures;

import java.util.Scanner;

/**
 * @author Ian
 */
public class IntBin {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String par = in.nextLine();
    IntStack s = new IntStack();
    int i;
    char current;
    for(i = 0; i<par.length(); i++){
      current = par.charAt(i); 
      if(isLeft(current)){
        s.push((int)current);
      }
      if(isRight(current)){
        if(s.isEmpty()){
          System.out.println("Unbalanced");
          System.exit(0);
        }
        if(!match((char)s.pop(),current)){
          System.out.println("Unbalanced");
          System.exit(0);    
        }        
      }
    }
    if(s.isEmpty()){
      System.out.println("Balanced");
    }
  }
  
  public static boolean isLeft(char c){
    return (c == '(') || (c == '{') || (c == '[');
  }
  
  public static boolean isRight(char c){
    return (c == '}') || (c == ']') || (c == ')');
  }
  
  public static boolean match(char left, char right){
    if(left == '(' && right == ')'){
      return true;
    }
    if(left == '{' && right == '}'){
      return true;
    }
    if(left == '[' && right == ']'){
      return true;
    }
    else{
      return false;
    }
  }
}

