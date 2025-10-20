package JAVA_imp_technical_Q;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] a = {1,2,8,20,6};

       for (int i =0; i<a.length-1; i++){
           int diff = a[i+1]-a[i];

           if (diff>1){

               for (int j = 1; j<diff; j++){
                   System.out.println(a[i]+j);
               }
           }
       }
    }
}
