public class nullvoid
{
   public static void main(String[] args)
   {
      int n1, n2;
      double d1, d2;
      
      //n1 = 17;
      //d1 = n1/4;
      //d2 = n1/2.0;
      
      //System.out.println(d1 + " " + d2);
      //n1 = 3 - 14 / 2 % 5 + -3;
      //System.out.println(n1);
      
      char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f' };
      int output = 0;
      int i = 0;
      do {
         if (letters[output] == 'b')
         {
            output = output + 2;
         }
         else if (letters[output] == 'a')
         {
            output++;
         }
         else
         {
            output = output / 2;
         }
         
         i++;
      } while (i < 3);
      System.out.println(letters[output]);
      
      int[] numbers= { 0, -5, 10, 7, 5, 5, 2, 1 };
      System.out.print(numbers[5] >= numbers[6]);
      /**
      int [] numbers = { -1, 0, 1 };
      int i = 0;
      do
      {
         switch(numbers[i])
         {
            case -1:
               numbers[i] += 1;
            case 0:
               numbers[i] += 2;
               break;
            default:
               numbers[i] += 3;
               break;
         }
         i++;
      } while (i < 3);
      System.out.println(numbers[0]);
      System.out.println(numbers[1]);
      System.out.println(numbers[2]);
      
      int myInt = 13 % 2;
      System.out.print(myInt);*/
   }
   
}