public class Q23 {

    public static void main(String[] args) {

        int num = 45;
        
        String result = ((num & 1) == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result);
    }
    
}
