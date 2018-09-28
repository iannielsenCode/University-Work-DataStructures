package data.structures;

import java.util.*;

/*Name: Ian Nielsen
 *Date Due: February 27th 2014
 *Class: Data Structures
 *Pledge: I, Ian Nielsen, did not receive 
 *any help for this programming assignment.
 */

//Class represents a bag of lottery ticket numbers. The user can access the 
//number of tickets puchased, add tickets to the bag, and can choose a winner.
public class LotteryBag {
  private int[] tickets; //Represents the bad of lottery tickets, the index
                         //representing the ticket number.
  private int numOfTickets; //Represent the number of tickets purchased.
  private int length = 10; //Represents the maximum value of a lottery ticket.
  private int jackpot = 4000; //Represent the jackpot for the lottery.
  
  //Constructor. Sets numOfTickets to 0, and creates a new array will size of
  //length + 1, since 0 will not be considered a ticket number.
  public LotteryBag(){
    numOfTickets = 0;
    tickets = new int[length + 1];
  }
  
  //Returns the maximum value of a ticket number.
  public int getLength(){
    return length;
  }
  
  //Adds the ticket number to the bag. The value of each index will represent
  //the number of that index(ticket) that were sold. 
  public void add(int ticket){
    if((ticket > length) || (ticket < 1)){
      System.out.println("That ticket number is out of range.");
      System.exit(0);
    }
    tickets[ticket]++;
    numOfTickets++;
  }
  
  //Allows the user to enter the ticket numbers. The method will stop once the
  //user enters -1.
  public void addInput(){
    Scanner in = new Scanner(System.in);
    boolean a = true;
    while(a){
      int number = in.nextInt();
      if(number == -1){
        a = false;
      }
      else{
        add(number);
      }
    }
  }
  //Chooses a random ticket number as the winner. If there were no tickets 
  //purchased the program will display a message and the jackpot will roll over.
  //If there were multiple winners, the jackpot will be split evenly between
  //them. If there was only one winner the entire jackpot will go to that 
  //winner. If no tickets were purchased or there was no winner the method 
  //will return false and the kjackpot will roll over. Otherwise the method will
  //return true and the lottery will end.
  public boolean chooseWinner(){
    if(numOfTickets == 0){
      System.out.println("No tickets were purchased");
      return false;
    }
    else{
      Random r = new Random();
      int x = r.nextInt(tickets.length);
      if(tickets[x] == 0){
        System.out.println("There was no winner. "
        + "The jackpot price will be rolled over to the "
        + "next drawing.");
        return false;
      }
      if(tickets[x] > 1){
        System.out.println("Ticket number " + x + " is the winner. There are " 
        + tickets[x] + " winners. You each will receive $" 
        + jackpot/tickets[x]);
        return true;
      }
      else{
        System.out.println("Ticket number " + x 
        + " is the winner. You have won $" + jackpot);
        return true;
      }
    }
  }
}
