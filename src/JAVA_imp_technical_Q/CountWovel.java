package JAVA_imp_technical_Q;

public class CountWovel {
    public static void main(String[] args) {
        String word = "Flutter";
       int count = 0;

       word = word.toLowerCase();
       for (int i=0; i<word.length();i++){
           char c = word.charAt(i);

           if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
               count++;
           }
       }
       System.out.print(count);
    }
}
