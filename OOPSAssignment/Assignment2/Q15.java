import java.util.Scanner;

public class Q15{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 25;

        int evenBits = n & 0xAAAAAAAA; 
        int oddBits = n & 0x55555555;  
        
        evenBits >>= 1;
        oddBits <<= 1;
        
        int result = evenBits | oddBits;
        
        System.out.println("Result after swapping odd and even bits: " + result);
    }

}
