public class Q25 {

    public static void main(String[] args) {
        
        
        int num = 100024;
        int revNum=0;  
        while(num > 0){
             int ld =  num % 10; 
             revNum = revNum*10 + ld;
             num /= 10;   
        } 
        System.out.println("Reverse of Number is"+" "+revNum);
    }


    
}
