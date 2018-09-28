package data.structures;

import java.util.Random;

public class IntSetTest {
    public static void main(String[] args){
        IntSet set = new IntSet();
        IntSet set2 = new IntSet();
        
        set.insert(1);
        set.insert(2);
        set.insert(3);
        set.insert(4);
        
        set2.insert(1);
        set2.insert(2);
        set2.insert(3);
        set2.insert(4);
        
        IntSet.intersection(set,set2).print();
        System.out.print(IntSet.equals(set,set2));
    }
}
