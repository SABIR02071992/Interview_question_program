package JAVA_imp_technical_Q;

import java.util.HashSet;

public class RemoveDuplicateHashSet {
    public static void main(String[] args) {
        int[]a = {1,2,3,3,4,4,10,6};
        int temp;

        for (int i = 0; i<a.length;i++){

            for (int j = i+1; j<a.length;j++){
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j]= temp;

                }
            }

        }
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

        //HashSet<Integer> h = new HashSet<>();

        /*for (int i=0; i<a.length;i++){
            h.add(a[i]);
        }*/
        //System.out.println("dddd"+h);

    }
}
