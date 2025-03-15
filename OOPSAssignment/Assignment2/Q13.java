class Q13 {

    public static void main(String[] args) {
        
        int n = -24;

        int abs = (n ^ (n >> 31)) - (n >> 31);
        
        System.out.println("Absolute value of " + n + " is " + abs);
    }
    
}