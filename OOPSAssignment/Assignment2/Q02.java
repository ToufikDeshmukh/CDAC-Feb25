public class Q02{
    public static void main(String[] args)
    {
        int a=5;
        int b=10;

        checkEvenOdd(a);
        checkEvenOdd(b);
                     
        
        
    } 

    static void checkEvenOdd(int num){
        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    } 
}