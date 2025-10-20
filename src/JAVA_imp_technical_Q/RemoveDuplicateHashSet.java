package JAVA_imp_technical_Q;

import java.util.HashSet;

public class RemoveDuplicateHashSet {
    public static void main(String[] args) {
        int[]a = {1,2,3,3,4,4};

        HashSet<Integer> h = new HashSet<>();

        for (int i=0; i<a.length;i++){
            h.add(a[i]);
        }
        System.out.println("dddd"+h);

    }
}
