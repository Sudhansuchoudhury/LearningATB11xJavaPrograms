package Daily_Java_Task;

public class Task012_Vowel_and_Consonant {
    public static void main(String[] args) {
        String X = "Pramod Dutta".toLowerCase();
        int vowels = 0;
        int consonants = 0;
        System.out.println(X);
        for (int i = 0; i < X.length(); i++) {
            char ch = X.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}