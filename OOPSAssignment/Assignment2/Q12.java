public class Q12 {
     public static void main(String[] args) {
        

        int abs= -4;
        int result = (abs ^ (abs >> 31 )) - (abs >> 31); 
        System.out.println("Absolute value of " + abs+ " is" + " "+ result);

     }
}
