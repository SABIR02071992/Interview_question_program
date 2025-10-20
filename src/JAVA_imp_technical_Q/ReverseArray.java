package JAVA_imp_technical_Q;

public class ReverseArray {
    public static void main(String[] args) {
        int d = 121;
        int[] a = {1,2,3,4,5,};
        int rev = 0;
        for (int i=a.length-1; i>=0;i--){

            rev = rev+a[i];// also sum of total list
            System.out.println(a[i]);/// reverse array
        }
        System.out.println(rev);
        
    }
}
