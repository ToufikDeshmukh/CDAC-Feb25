public class Q04 {
    

    public static void main(String[] args){

        int a  = 20;
        int b = 15;

        System.out.println("Before Swapping:" +"a:"+ a +" "+"b:" + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("After Swapping:" +"a:"+ a+" "+"b:"+ b);

    }
}
