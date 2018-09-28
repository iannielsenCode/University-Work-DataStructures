package data.structures;

/*Name: Ian Nielsen
 *Date Due: February 20th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class tests the LotteryBag class.
public class LotteryBagTest {
 public static void main(String[] args){
   boolean a; //Boolean lets the user know if there is a winner or multiple.
   do{
     LotteryBag bag = new LotteryBag(); //Creates a LotteryBag object.
     System.out.println("Lottery: The range of ticket values is 1 through "
     + bag.getLength()+". Please enter the ticket numbers."
     + " Enter -1 to stop."); //Prints how to stop and the range for the user.
     bag.addInput(); //Adds the individual ticket numbers to the bag.
     a = bag.chooseWinner(); //Chooses a random winner for the lottery.
    }while(!a); //If there was no winner or no ticket entries the lottery will
  }               //continue.
}
