public class Q5{

    public static void main(String args[]){

        int a = 5, b = 10;
        System.out.println("Before swapping (using temp): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping (using temp): a = " + a + ", b = " + b);

        System.out.println("\nBefore swapping (without temp): a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping (without temp): a = " + a + ", b = " + b);
    }    
}
