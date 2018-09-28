package data.structures;

/*Name: Ian Nielsen
 *Date Due: February 20th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class tests CarList class.
public class CarListTest {
  public static void main(String[] args){
      
    Car car = new Car(20000.,"Toyota"); //Creates a new car object with a price
                                        //of $20,000 and Totota as the make
    Car car2 = new Car(40000.,"Toyota");//Creates a new car object with a price 
                                        //of $40,000 and Toyota as the make.
    Car car3 = new Car(35000.,"Subaru");//Creates a new car object with a price 
                                        //of $35,000 and Subaru as the make.
    Car car4 = new Car(50000.,"Chevy");//Creates a new car object with a price 
                                       //of $50,000 and Chevy as the make.
    CarList list = new CarList();//Creates a new CarList object.
   
    list.insert(car);//Inserts the car object into the list of nodes.
    list.insert(car2);//Inserts the car object into the list of nodes.
    list.insert(car2);
    list.insert(car3);//Inserts the car object into the list of nodes.
    list.insert(car4);//Inserts the car object into the list of nodes.
    list.remove(car3);//Removes the car object from the list of nodes.
    list.insert(car4);//Inserts the car object into the list of nodes.
    list.remove(car);
    list.printList();//Prints the list of car objects with each car's make
                     //and price on one line.
  }
}
