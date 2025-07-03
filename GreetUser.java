public class GreetUser{
  public static void main(String Args[])
{
 if(args.length > 0)
 {
   System.out.println("hello, " + Args[0] + "!");
 }
 else{
    System.out.println("hello guest");
  }
}
