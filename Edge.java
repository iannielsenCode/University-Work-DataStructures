package data.structures;

public class Edge {
  public Node one, two;
  public double weight;
  
  public Edge(Node one, Node two){
    this.one = one;
    this.two = two;
  }
  public Edge(Node one, Node two, double weight){
    this.one = one;
    this.two = two;
    this.weight = weight;
  }
  
  public void addWeight(double weight){
    this.weight = weight;
  }
  
 
}
