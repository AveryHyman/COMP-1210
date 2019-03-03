public class Division
{
   public static int intDivide(int n, int d)
   {
      try
      {
         return n / d;
      }
      
      catch(ArithmeticException e)
      {
         return 0;
      }
      
   }
   
   public static float decimalDivide(int n, int d)
   {
      if (d == 0)
      {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero");
      }
      return (float) n / d;
   }
}