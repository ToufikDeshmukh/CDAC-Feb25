public class Q01 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b; // Step 1
        b = a ^ b; // Step 2
        a = a ^ b; // Step 3

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}