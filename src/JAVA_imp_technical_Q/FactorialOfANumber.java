package JAVA_imp_technical_Q;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.print(fact);
    }
}
