package data.structures;

public class Tree {
  static char[] tr = {'X','A','B','C','X','D','E','X','X','X','X','X','F','G'};
  
  static int parent(int n){
      return n/2;
  }
  
  static int leftChild(int n){
      return 2*n;
  }
  
  static int rightChild(int n){
      return 2*n + 1;
  }
  
  static boolean isNull(int n){
      return (n>=tr.length || tr[n] == 'X');
  }
  
  public static void preOrder(int root){
      if(isNull(root)){
          return;
      }
      System.out.print(tr[root]);
      preOrder(leftChild(root));
      preOrder(rightChild(root));
  }
  
  public static void inOrder(int root){
      if(isNull(root)){
          return;
      }
      inOrder(leftChild(root));
      System.out.print(tr[root]);
      inOrder(rightChild(root));
  }
  
  public static void postOrder(int root){
      if(isNull(root)){
          return;
      }
      postOrder(leftChild(root));
      postOrder(rightChild(root));
      System.out.print(tr[root]);
  }
  
  public static void levelFirst(int root){
      Q nodeKeeper = new Q();
      int current;
      
      nodeKeeper.enQ(root);
      while(!nodeKeeper.isEmpty()){
          current= nodeKeeper.deQ();
          if(isNull(current)){
            continue;
          }
          System.out.print(tr[current]);
          nodeKeeper.enQ(leftChild(current));
          nodeKeeper.enQ(rightChild(current));
      }
  }
  
  public static void main(String[] args){
    levelFirst(1);
  }
}
