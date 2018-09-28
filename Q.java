/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author Ian
 */
public class Q {
    public Node[] data;
    private int cap;
    private int manyItems;
    private int front;
    private int rear;
    
    public Q(){
        cap = 5000000;
        data = new Node[cap];
        front=rear=0;
        manyItems=0;
    }
    public void enQ(Node n){
      data[rear++] = n;
      rear%=cap;
      manyItems++;
    }
    
    public void deQ(){
      int temp = front++;
      front%=cap;
      manyItems--;
    }
    
    public boolean isEmpty(){
      return manyItems==0;
    }
    
    public int getFront(){
      return front;
    }
}
