import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        int n = 8;
        
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
        
        System.out.println(n + (isPowerOfTwo ? " is a power of 2." : " is not a power of 2."));

    }
    
}    