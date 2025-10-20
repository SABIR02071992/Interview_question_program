package JAVA_imp_technical_Q;

public class Shorting_Array {


    public static void main(String[] args) {
        int[] a = {1,2,10,5,20,15};
        int temp;
        int i=0,j=0;
        for ( i = 0;i<a.length;i++){
            for ( j = i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
