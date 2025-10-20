package JAVA_imp_technical_Q;



public class RemoveDuplicateNumber {
    public static void main(String[] args) {



        // make sure array must be shorted.
        int[] a = {1,2,2,3,3,5,5,8,8};
        int[] temp = new int[a.length];

        int j=0;

        for (int i = 0; i <a.length-1; i++) {

                if (a[i]!= a[i+1]){
                    temp[j]=a[i];
                    j++;

                }
        }
        temp[j] = a[a.length-1];

        for (int i=0; i<a.length;i++){
            System.out.println(temp[i]);

        }

    }

}
