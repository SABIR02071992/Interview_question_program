package JAVA_imp_technical_Q;

public class CheckingVowel {
    public static void main(String[] args) {
        String str = "Hello World";  // you can change this value
        str = str.toLowerCase();     // convert to lowercase to handle both cases

        if (str.matches(".*[aeiou].*")) {   // regex to check if vowels exist
            System.out.println("String contains vowel");
        } else {
            System.out.println("String does not contain vowel");
        }
    }
}
