import java.util.Scanner; 
public class Q22 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        double num1 = sc.nextDouble();

        double num2 = sc.nextDouble(); 

        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }        


    }
}
