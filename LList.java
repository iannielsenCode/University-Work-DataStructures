package data.structures;

public class LList {
    private Node head;
    
    public LList(){
        head = null;
    }
    
    public void insert(int target){
        if(head == null || head.item > target){
            insertAtHead(target);
            return;
        }
        
        Node before, after;
        
        before = head; 
        after = before.next;
        
        while(after != null && target > after.item){
            before = before.next;
            after = after.next;
        }
        
        before.next = new Node(target,after);
    }
    public void insertAtHead(int target){
        Node newNode = new Node(target);
        
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtTail(int target){
        if(head == null){
            head = new Node(target);
            return;
        }
        
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = new Node(target);
    }
    
    public int noOfNodes(){
        Node temp = head;
        
        int num = 1;
        while(temp.next != null){
            num++;
            temp = temp.next;
        } 
        return num;
    }
    public void print(){
        Node temp = head; // a reference. not a new node.
        
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.item);
            }
            else{
                System.out.print(temp.item + "-->");
            }
            temp = temp.next;
        }
    }
}

class Node2{
    int item;
    Node next;
    
    public Node2(int n){
        item = n;
        next = null;
    }
    
    public Node2(int n, Node after){
        item = n;
        next = after;
    }
}
