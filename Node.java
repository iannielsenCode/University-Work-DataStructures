package data.structures;

public class Node{
  
  public boolean visited;
  public char vertex;
  
  public Node(char vertex){
    this.vertex = vertex;
  }
  
  public void visited(){
    visited = true;
  }
  
  public void unvisited(){
    visited = false;
  }
}
