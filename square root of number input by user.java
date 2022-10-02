import java.util.*;

 // Compiler version JDK 11.0.2

 class Main
 {
   public static void main(String args[])
   {
     System.out.println("Enter a number:");
     double input;
     Scanner in = new Scanner(System.in);
     input = in.nextFloat();
     double result = Math.sqrt(input);
     System.out.println("Input: " + input);
     System.out.println("Square root of " + input + " is: " + result);
     
     }
     }
