public class Q05 {
    public static void main(String[] args) {
        int num = 27;
        if (num < 0){ 
            num = -num; // Convert to positive
        }
        while (num > 3) {
           
                num = (num & 3) + (num >> 2); // Add last bit
                 // Equivalent to removing 2s place value without division

        }

        if (num == 0 || num == 3) {
            System.out.println(num + "divisible by 3");
        } else {
            System.out.println( num + "not divisible by 3");
        }
    }
}
