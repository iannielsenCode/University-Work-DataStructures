package data.structures;

import java.util.ArrayList;

public class Dijkstra {
  public static void main(String[] args){
    char[] nodes = {'A', 'B', 'C', 'D', 'E'};
    String[] edges = { "AB", "AC", "CD", "BE", "BD", "BC" };
    double[] weights = {3.90, 4.59, 2.39, 1.90, 3.40, 5.78};
    Graph graph = new Graph(nodes,edges,weights);
    double[] paths =findShortestPaths(graph, graph.nodes.get(0));
    for(int i = 0; i < paths.length; i++){
      System.out.println(paths[i]);
    }
  }
  
  public static ArrayList<Node> findAdjacentVertices(Graph graph, Node source){
    ArrayList<Node> adjacentEdges = new ArrayList<>();
    for(int i = 0; i < graph.edges.size(); i++){
      if(source.vertex == graph.edges.get(i).one.vertex){
        adjacentEdges.add(graph.edges.get(i).two);
      }
      if(source.vertex == graph.edges.get(i).two.vertex){
       adjacentEdges.add(graph.edges.get(i).one);
      }
    }
    return adjacentEdges;
  }
  
  public static double[] findShortestPaths(Graph graph, Node Source){
    double infinity = Double.POSITIVE_INFINITY;
    double[] estimate = new double[graph.nodes.size()];
    Q priorityQ = new Q();
    for(int i = 0; i < graph.nodes.size(); i++){
      priorityQ.enQ(graph.nodes.get(i));
      estimate[i] = infinity;
    }
    int i = graph.nodes.indexOf(Source);
    estimate[i] = 0;
    while(priorityQ.isEmpty() == false){
      Node u = priorityQ.data[0];
      priorityQ.deQ();
      ArrayList<Node> adjacentNodes = findAdjacentVertices(graph, u);
      for(int j = 1; j < adjacentNodes.size(); j++){
        if(estimate[adjacentNodes.indexOf(j)] > (estimate[j] + 
                graph.findWeight(u,adjacentNodes.get(j)))){
          estimate[adjacentNodes.indexOf(j)] = estimate[j] + 
                graph.findWeight(u,adjacentNodes.get(j));
        }
      }
    }
    return estimate;
  }
}