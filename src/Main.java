
public class Main {
    public static void main(String[] args) {
        int n=3;
        for (int i=1; i<=n; i++){
            for (int j = n; j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int a= 2;
        for (int l=1; l<=a;l++){
            for (int m = a; m>=l;m--){
                System.out.print(" ");
            }
            for(int p=a; p<=l;p++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}