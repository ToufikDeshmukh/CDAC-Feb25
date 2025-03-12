public class Q3 {
    public static void main(String[] args) {

        int intValue = 100;
        double doubleValue = intValue; 
        
        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        
        double pi = 3.14159;
        int intPi = (int) pi; 
        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + pi);
        System.out.println("int value after casting: " + intPi);
    }
}