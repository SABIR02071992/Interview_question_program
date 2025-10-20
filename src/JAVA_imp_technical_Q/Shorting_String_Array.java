package JAVA_imp_technical_Q;

public class Shorting_String_Array {
    public static void main(String[] args) {
        String[] b = {"Apple","orange","Banana"};
        String temp1;
        for (int i = 0; i< b.length;i++){
            for (int j=0; j<b.length;j++){

                if(b[i].compareTo(b[j])>0){
                    temp1 = b[i];
                    b[i] = b[j];
                    b[j]=temp1;
                }

            }
        }
        for (int i = 0; i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
