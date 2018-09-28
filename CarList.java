package data.structures;

/*Name: Ian Nielsen
 *Date Due: February 20th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class represents a linked list of car nodes.
public class CarList {
  private CarNode head;//The head of the linked list.
  private CarNode tail;//The tail of the linked list.
  private int counter;//Represents the number of nodes in the list.
  
  //Default constructor that sets the head and tail to null and counter to 0.
  public CarList(){
    head = null;
    tail = null;
    counter = 0;
  }
  
  //Returns the size of the linked list.
  public int size(){
    return counter;
  }
  
  //Method returns true if the linked list is empty. Returns false if the list
  //has at least one node.
  public boolean empty(){
    if(counter == 0){
      return true;
    }
    return false;
  }
  
  //Returns the node that is at the head of the list.
  public CarNode first(){
    return head;
  }
  
  //Returns the node that is at the tail of the list.
  public CarNode last(){
    return tail;
  }
  
  //Finds the CarNode that is located at the given location in the linked list.
  public CarNode find(int index){
    int num = 0;
    CarNode temp = head;
    while(num < index){
      temp = temp.getNext();
    }
    return temp;
  }
  
  //Inserts the given car into the linked list based on its price and make.
  //The cars are first ordered by price, the lowest priced car being at the 
  //head and the highest priced car being at the tail. They are then ordered 
  //alphabetically if some cars have the same price. 
  public void insert(Car car){
    if(head == null || head.getCar().compareTo(car) >= 0){
      insertAtHead(car);
      return;
    }
    
    CarNode before, after;
    
    before = head;
    after = before.next;
    
    while(after != null && car.compareTo(after.getCar()) > 0){
      before = before.next;
      after = after.next;
    }
    
    before.next = new CarNode(car,after);
  }
  
  //Inserts the given car at the head of the linked list.
  public void insertAtHead(Car car){
      CarNode node = new CarNode(car);
      node.next = head;
      head = node;
  }
  
  //Removes and returns the first occurence of the given car from the list.
  public CarNode remove(Car car){
    CarNode before, after;
    before = head;
    after = before.next;
    if(before.getCar().getPrice() == car.getPrice()){
        head = after;
        return before;
    }
    while(after != null){
      if(after.getCar().getPrice() == car.getPrice()){
        before.next = after.next;
        return after;
      }
      else{
        before = before.next;
        after = after.next;
      }
    }
    return null;
  }
  
  //Prints the entire linked list of cars from head to tail, with each car on 
  //one line.
  public void printList(){
    CarNode temp = head;
    while(temp != null){
        System.out.println(temp.getCar().getPrice() + " " + temp.getCar().getMake());
        temp = temp.next;
    }
  }
}
