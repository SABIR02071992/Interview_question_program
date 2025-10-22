package JAVA_imp_technical_Q;

public class SortAndRemoveDuplicates {

    public static void main(String[] args) {
        int[] a = {1, 2, 10, 5, 20, 15, 2, 5, 1, 20};
        int temp;

        // STEP 1: Sort array in descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // STEP 2: Remove duplicates from sorted array
        int[] tempArray = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                tempArray[j] = a[i];
                j++;
            }
        }
        tempArray[j] = a[a.length - 1];

        // STEP 3: Print result (unique sorted array)
        System.out.println("Sorted (Descending) & Unique Array:");
        for (int i = 0; i <= j; i++) {
            System.out.println(tempArray[i]);
        }
    }
}

