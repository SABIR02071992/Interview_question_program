package JAVA_imp_technical_Q;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] a= {20,10,5,8,80,45};
        int temp;

        for (int i = 0; i<a.length; i++){
            for (int j = i+1; j<a.length; j++){

                if (a[i]<a[j]){

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }

        }
        System.out.print(a[1]); 
    }
}
