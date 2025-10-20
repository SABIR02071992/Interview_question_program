package JAVA_imp_technical_Q;

public class String_Cha_print {
    public static void main(String[] args) {
        String s = "sabir";
        int len = s.length();
        if (len % 2 == 0){
            System.out.println(s.charAt(len/2-1));
            System.out.println(s.charAt(len/2));
        }else {
            System.out.println(s.charAt(len/2-1));
            System.out.println(s.charAt(len/2));
            System.out.println(s.charAt(len/2+1));
        }
    }
}
