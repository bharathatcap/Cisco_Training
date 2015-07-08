public class Calculator {
   public static int add(int number1, int number2) {
      return number1 + number2;
   }
 
   public static int subtract(int number1, int number2) {
      return number1 - number2;
   }
 
   public static int multiply(int number1, int number2) {
      return number1 * number2;
   }
 
  
   
 
   // Real number divide. Returns a int.First checks if no is not equal to 0
   public static int divide(int number1, int number2) {
      if (number2 == 0) {
         throw new IllegalArgumentException("Cannot divide by 0!");
      }
      else{
      return  number1 / number2;
   }
}}

