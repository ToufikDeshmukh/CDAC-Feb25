public class Q07 {

    public static void main(String[] args) {

        int leap = 2024;
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("It is a leap year");
        } 
        else{
            System.out.println("It is not a leap year");
        }
    }    
        
    
}
