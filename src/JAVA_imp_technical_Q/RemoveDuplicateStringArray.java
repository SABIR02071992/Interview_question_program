package JAVA_imp_technical_Q;

public class RemoveDuplicateStringArray {
    public static void main(String[] args) {
        // make sure array must be sorted
        String[] b = {"Apple", "Apple", "Ball", "Ball", "Cat", "Cat"};
        String[] temp1 = new String[b.length];
        int k = 0;

        for (int i = 0; i < b.length - 1; i++) {
           if (!b[i].equals(b[i + 1])) {
                temp1[k] = b[i];
                k++;
            }
            /*if (!(b[i] ==b[i+1])){
                temp1[k] = b[i];
                k++;
            }*/
        }
        temp1[k] = b[b.length - 1];

        // print unique elements
        for (int i = 0; i <= k; i++) {
            System.out.println(temp1[i]);
        }

    }
}
