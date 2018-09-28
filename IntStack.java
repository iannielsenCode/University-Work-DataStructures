package data.structures;

/*Name: Ian Nielsen
 *Date Due: February 20th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class IntStack represents an integer stack. The class contains private fields
//to represent the cap(maximum size of the stack), the top of the stack, and 
//an array to represent the actual stack. IntStack has one constructor that
//initializes cap to 1, top to 0, and the array to a new array with size of cap.
//The isEmpty method will return true if the stack is empty. The accessor method
//getData() will return the array of the class. The accessor method getTop() 
//will return the value of the top of the stack. The method push pushes the 
//integer to the top of the stack. If top equal the cap it will increase the 
//cap and store the current array into a new one with the new cap. The method
//pop pops the top off of the stack by decreasing the top by one and returning
//that value.
class IntStack {
    
  private int cap;
  private int top;
  private int[] data;
  
  public IntStack(){
      cap = 1;
      top = 0;
      data = new int[cap];
  }
 
  public boolean isEmpty(){
    return top==0;
  }
  
  public int[] getData(){
    return data;
  }
  
  public int getTop(){
    return top;
  }
  
  public void push(int target){
    if(top == cap){
      cap++;
      int[] temp = new int[cap];
      for(int i = 0;i<top;i++){
          temp[i] = data[i];
      }
      data = temp;
    }
    data[top++] = target;
  }
  
  public int pop(){
    return data[--top];
  }
  
  public void popNum(int num){
    while(num > 0){
      this.pop();
      num--;
    }
  }
  
  public void printStack(){
    for(int i = 0; i < this.top; i++){
        System.out.print(data[i] + " ");
    }
  }
}
