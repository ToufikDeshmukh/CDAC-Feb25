public class Q4{

    public static void main(String[] args) {

        Integer intValue = 10;
        Double doubleValue = intValue.doubleValue();
        
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);
        
        System.out.println();
        
        Double doubleNum = 15.75;
        Integer intNum = doubleNum.intValue();
        
        System.out.println("Double value: " + doubleNum);
        System.out.println("Converted to Integer: " + intNum);
    }   
}
