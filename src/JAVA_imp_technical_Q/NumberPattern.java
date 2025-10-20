package JAVA_imp_technical_Q;

public class NumberPattern {

    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i<=num; i++){
            for (int j = num; j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(i);
            }
            System.out.println();
        }

        int n = 5; // total rows

        for (int i = 1; i <= n; i++) {
            // spaces print karna
            for (int j = 4; j>=i; j--) {
                System.out.print(" ");
            }

            // number print karna
            for (int k = 1; k <= i; k++) {
                System.out.print(n - i + 1); // n-i+1 => 5,4,3,2,1
            }

            System.out.println(); // next line
        }


        int number = 5;
        for (int i=1; i<=number; i++){

            for (int j=1; j<=i; j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }

}

