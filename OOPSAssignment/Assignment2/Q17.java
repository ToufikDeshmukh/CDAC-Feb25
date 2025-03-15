public class Q17 {

    public static void main(String[] args) {
        
        int a = 10, b = 20, c=30, d=40;  

        String result = ((a<b && a<c) && a<d) ? "a is minimum" : (( b<a && b<c) && b<d) ? "b is minimum" : ((c<a && c<b) && c<d) ? "c is minimum":"d is minimum";   

        System.out.println(result);
    }
    
}
