package JAVA_imp_technical_Q;

public class PseudoProgram {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a > b && a > c) {
            System.out.println(a + " is largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}
