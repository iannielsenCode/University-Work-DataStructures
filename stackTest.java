package data.structures;

/**
 * @author Ian
 */
public class stackTest {
  public static void main(String[] args){
    IntStack stack = new IntStack();
    for(int i = 1; i <= 20; i++){
      stack.push(i);
    }
    stack.printStack();
    System.out.println();
    stack.popNum(2);
    stack.printStack();
  }
}
