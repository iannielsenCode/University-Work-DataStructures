package data.structures;

import java.util.Scanner;

/*Name: Ian Nielsen
 *Date Due: March 13th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class InToPostFix changes an infixed expression to a postfixed expression.
public class InToPostFix {
  //The main method will have the user enter in the infixed expression and
  //convert it to a string. An IntStack object is created to represent the 
  //stack that will be used. The char current will represent the current 
  //character the method is working on. The string postExpress represents the
  //postfixed expression. The method will loop through each character in the
  //infixed expression. If the character is an operand the character will be
  //added to the postfixed expression. If the character is a left parentheses
  //the character will be push on the stack. If the character is a right
  //parentheses, while the stack is not empty and the top is not a left 
  //parentheses the program will pop the stack and append it the the postfixed
  //expression. If the stack is still not empty the stack will be poped once 
  //more. If the character is an operator and the stack is empty it will 
  //push the character to the stack. If the stack is not empty and the top
  //has higher precedence it will pop and append it to the postfixed expression
  //Then it will push the character to the stack. It will then pop the 
  //remaining characters in the stack and print the postfixed expression.
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String fixExpress = in.nextLine();
    IntStack s = new IntStack();
    char current;
    String postExpress = "";
    for(int i = 0;i < fixExpress.length();i++){
      current = fixExpress.charAt(i);
      if(isOperand(current)){
        postExpress += current;  
      }
      else if(isLeft(current)){
        s.push(((int)current));
      }
      else if(isRight(current)){
        while((!(s.isEmpty())) && ((char)(s.getTop()) != '(')){
            postExpress += (char)(s.pop());
        }
        if(!s.isEmpty())
            s.pop();
      }
      else if(isOperator(current)){
        while((!(s.isEmpty())) || ((char)(s.getTop()) != '(')){
          if(InToPostFix.ComparePrecedence(current,(char)(s.getTop()))){
            postExpress += (char)(s.pop());
          }
          else{
            break;
          }
        }
        s.push(current);
      }
    }
    while(!(s.isEmpty())){
      postExpress += (char)(s.pop());
    } 
    System.out.println(postExpress);
  }
  
  //This method compares the precendence of two operators. If the first 
  //operator is an addition or subtraction symbol and the second is a division
  //or multiplication symbol then the method will return false indicating that
  //the top of the stack does not proceed the current operator. If the method
  //returns true then this is the case.
  public static boolean ComparePrecedence(char a, char b){
    if((a == '+') && ((b == '*') || (b == '/'))){
        return false;
    }
    if((a == '-') && ((b == '*') || (b == '/'))){
        return false;
    }
    return true;
  }
  
  //Methods isLeft, isRight, isOperator, and isOperand will return true if the
  //characte is what the method is looking for(a left or right parentheses an
  //operator or an operand.
  public static boolean isLeft(char c){
    return (c == '(');
  }
  
  public static boolean isRight(char c){
    return (c == ')');
  }
  
  public static boolean isOperator(char c){
      return ((c == '+') || (c == '-') || (c == '*') || (c == '/'));
  }
  
  public static boolean isOperand(char c){
    return ((c == 'A') || (c == 'B') || (c == 'C') || (c == 'D') || (c == 'E') 
           || (c == 'F') || (c == 'G') || (c == 'H') || (c == 'I') || (c == 'J') 
           || (c == 'K') || (c == 'L') || (c == 'M') || (c == 'N') || (c == 'O') 
           || (c == 'P') || (c == 'Q') || (c == 'R') || (c == 'S') || (c == 'T')
           || (c == 'U') || (c == 'V') || (c == 'W') || (c == 'X') || (c == 'Y') 
           || (c == 'Z'));
  }
}
