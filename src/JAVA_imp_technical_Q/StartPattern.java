package JAVA_imp_technical_Q;

public class StartPattern {

    public static void main(String[] args) {
       int n1= 5;

       for (int i=1; i<=n1; i++){
           for (int j = 1; j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
        System.out.println("--------n2-------");

       int n2=5;

        for (int i=1; i<=n1; i++){
            for (int j = 5; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------n3-------");

        int n3 = 5;

        for (int i = 1; i<=n3; i++){
            for (int j=2;j<=i;j++){
                System.out.print(" ");
            }

            for (int k=n3; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------n4-------");

        int n4 = 5;

        for (int i = 0; i<=n4; i++){
            for (int j = n4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------n5-------");

        int n5= 5;

        for (int i = 1; i<=n5; i++){
            for (int j= 4; j>=i; j--){
                System.out.print("-");
            }
            for (int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------n6-------");

        int n6 = 5;

        for (int i=1; i<=n6; i++){
            for (int j = 2; j<=i ; j++){
                System.out.print(" ");
            }
            for (int k = n6; k>=i; k--){
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("--------n7-------");

        int n7=4;

        for (int i = 1; i<=n7;i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int k= 3; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }











    }

}
