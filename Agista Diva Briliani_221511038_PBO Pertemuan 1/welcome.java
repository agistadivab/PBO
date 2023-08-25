public class Welcome
{
   public static void main(String[] args)
   {
      String greeting = "Welcome to Core Java";
      System.out.println(greeting);
      for (int i = 0; i < greeting.lenght(); i++) {
         System.out.print("=");
      }
      System.out.println("");
   }
}