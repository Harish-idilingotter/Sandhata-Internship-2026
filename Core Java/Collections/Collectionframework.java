package Collections;

import java.util.*;

public class Collectionframework {
    public static void main(String[]args){
        Collection<Integer> nums = new TreeSet<>();
        nums.add(13);
        nums.add(12);
        nums.add(45);
        nums.add(70);
        Iterator<Integer> iter = nums.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
