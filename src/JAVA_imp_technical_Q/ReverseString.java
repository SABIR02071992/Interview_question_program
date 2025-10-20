package JAVA_imp_technical_Q;

public class ReverseString {
    public static void main(String[] args) {
        String s = "sabir";
        String rev = "";
        int len = s.length();

        for (int i = len-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Revers string: "+rev);

        ///-- Revers array.
        int[] a = {1,2,3,4,5};

        for (int i = a.length-1; i>=0; i--){
            System.out.print(a[i]);
        }
    }

}
