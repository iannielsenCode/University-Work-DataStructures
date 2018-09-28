package data.structures;

/*Name: Ian Nielsen
 *Date Due: February 20th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class represents a car. Each car has both a make and a price that is a double.
public class Car implements Comparable{
  private double price;//Represents the price of the car.
  private String make;//Represents the make of the car.
  
  //Default constructor. Sets the price to zero and the make to an empty string.
  public Car(){
    price = 0.;
    make = "";
  }
  
  //Constructor. Sets the price to the given price and the make to the given 
  //make.
  public Car(double price2, String make2){
    price = price2;
    make = make2;
  }
  
  //Accessor method for the private data field price.
  public double getPrice(){
      return price;
  }
  
  //Accessor method for the private data field make.
  public String getMake(){
      return make;
  }
  
  //Sets the data field price to the given value.
  public void setPrice(double price2){
      price = price2;
  }
  
  //Sets the data field make to the given string.
  public void setMake(String make2){
      make = make2;
  }
  
  //Compares the car that is calling the method to the given car. If the car 
  //that is calling the method is more expensive than the given car the method
  //will return 1. If the given car is more expensive the method will return 
  //-1. If the cars have identical prices the cars will be ordered 
  //alphabetically. If the two cars are identical the method will return 0.
  public int compareTo(Object otherObject){
    Car other = (Car) otherObject;
    if(price > other.price){
      return 1;
    }
    else if(price < other.price){
      return -1;
    }
    else{
      if(make.compareTo(other.make) < 0){
        return 1;
      }
      else if(make.compareTo(other.make) > 0){
        return -1;
      }
      return 0;
    }
  }
}
