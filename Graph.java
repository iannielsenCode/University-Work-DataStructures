package data.structures;

import java.util.ArrayList;

public final class Graph{
  public ArrayList<Node> nodes = new ArrayList<>(); 
  public ArrayList<Edge> edges = new ArrayList<>();
  
  public void addNode(Node a){
    nodes.add(a);
  }
  
  public void addEdge(Edge a){
    edges.add(a);
  }
  
  public Graph(char[] vertices, String[] edges, double[] weights){
    for(int i = 0;i < vertices.length;i++){
      Node node = new Node(vertices[i]);
     this.addNode(node);
    }
    for(int j = 0;j < edges.length;j++){
     Node node = new Node(edges[j].charAt(0));
     Node node2 = new Node(edges[j].charAt(1));
     Edge edge = new Edge(node,node2);
     edge.addWeight(weights[j]);
     this.addEdge(edge);
    }
  }
  
  public void printGraph(){
    System.out.print("{ ");
    for(int i = 0;i < edges.size();i++){
      System.out.print("(" + edges.get(i).one.vertex + "," + 
      edges.get(i).two.vertex + ")");
    }
    System.out.print(" }");
  }
  
  public double findWeight(Node a, Node b){
    for(int i = 0; i < this.edges.size(); i++){
      Node one = this.edges.get(i).one;
      Node two = this.edges.get(i).two;
      if((a.vertex == one.vertex && b.vertex == two.vertex) 
       || (a.vertex == two.vertex && b.vertex == one.vertex)){
        return this.edges.get(i).weight;
      }
    }
    return 0.;
  }
  
}
