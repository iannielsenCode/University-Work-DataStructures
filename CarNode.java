package data.structures;

/*Name: Ian Nielsen
 *Date Due: February 20th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class represents a node that's item is a car object. 
public class CarNode {
  CarNode next; //Represents the next node in the list.
  private Car car; //The car object that represents this node in the list.
    
  //Constructor that sets the data field car to the given car and the next
  //node to null.
  public CarNode(Car car2){
    car = car2;
    next = null;
  }
    
  //Constructor that constructs the data field car with the given price and 
  //make and sets the next node to null.
  public CarNode(double price, String make){
    car = new Car(price,make);
    next = null;
  }
    
  //Constructor that sets the data field car to the given car object and the 
  //next node to the given node.
  public CarNode(Car car2, CarNode after){
    car = car2;
    next = after;
  }
  
  //Accessor method that returns the node after the current node.
  public CarNode getNext(){
    return next;
  }
  
  //Accessor method that returns the car object of the current node.
  public Car getCar(){
    return car;
  }
}
