import java.util.Scanner;

public class Q10{

    public static void main(String[] args) {
       
        char ch = 'A';
        
        // Ternary operator to check vowel or consonant
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                         ? "Vowel" : "Consonant";
        
        System.out.println(ch + " is a " + result);
        
    }
}

