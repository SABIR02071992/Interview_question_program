package JAVA_imp_technical_Q;

public class PrimeNumber {

    public static void main(String[] args){
        int n = 3;
        boolean isPrime = true;

       /* for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }*/

        for (int i = 2; i<n;i++){
            if (n%i==0){
                System.out.print("number is  not prime");
                break;

            }else {
                System.out.print("number is prime");
            }
        }

    }
}
