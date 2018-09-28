package data.structures;

public class IntSet {
    private static int cap = 1024;
    private int[] data;
    private int top;
    
    public IntSet(){
        data = new int[cap];
        top = 0;
    }
    
    public int getSize(){
        return top;
    }
    
    public boolean isElement(int target){
        for(int i = 0;i< top;i++){
            if(data[i] == target){
                return true;
            }
        }
        return false;
    }
    
    private int position(int target){
        for(int i = 0;i< top;i++){
            if(data[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public void insert(int target){
        if(isElement(target)){
            return;
        }
        
        data[top++] = target;
    }
    
    public void print(){
        for(int i = 0; i< top; i++){
            System.out.print(data[i] + ";");
        }
        System.out.println();
    }
    
    public void remove(int target){
        if(position(target) == -1){
            return;
        }
        data[position(target)] = data[--top];
    }
    
    public static IntSet union(IntSet s1, IntSet s2){
        IntSet s = new IntSet();
        for(int i = 0; i < s1.top;i++){
            s.insert(s1.data[i]);
        }
        for(int j = 0; j < s2.top;j++){
            s.insert(s2.data[j]);
        }
        return s;
    }
    
    public static IntSet diff(IntSet s1, IntSet s2){
        IntSet s = new IntSet();
        for(int i = 0; i < s1.top;i++){
            s.insert(s1.data[i]);
        }
        for(int j = 0; j < s2.top;j++){
            s.remove(s2.data[j]);
        }
        return s;
    }
    
    public static IntSet intersection(IntSet s1, IntSet s2){
        return diff(s1,diff(s1,s2));
    }
    
    public static boolean equals(IntSet s1, IntSet s2){
        return diff(s1,s2).getSize() == 0 && diff(s2,s1).getSize() == 0;
    }
}

