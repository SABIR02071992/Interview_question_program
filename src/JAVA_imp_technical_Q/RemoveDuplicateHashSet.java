package JAVA_imp_technical_Q;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class RemoveDuplicateHashSet {
    public static void main(String[] args) {
        int[]a = {1,2,8,3,3,4,4};

        //HashSet<Integer> h = new HashSet<>();
        LinkedHashSet<Integer>h = new LinkedHashSet<>();
        // if use LinkedHashSet then return same array list with remove duplicate element

        for (int i=0; i<a.length;i++){
            h.add(a[i]);
        }
        System.out.println("dddd"+h);

    }
}
