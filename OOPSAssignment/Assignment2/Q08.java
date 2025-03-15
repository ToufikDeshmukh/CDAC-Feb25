import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();
        
        if ((a && b) || (b && c) || (a && c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        sc.close();
    }
}
