import java.util.*;
public class HelloWorld
{
   public static void main(String[]args)
   {
      System.out.println("Hello World");
      
      for(int x=0; x<100; x++)
      {
         System.out.println(x);
      }
      Scanner input = new Scanner(System.in);
      int [] array2= new int[10];
      int total=0;
      for(int j=0; j<array2.length; j++)
      {
           //System.out.println(j + "\t" + array2[j]);
         System.out.println("Enter a Number between 1 - 50");
         array2[j]=input.nextInt();
         if(array2[j]<1 || array2[j]>50)
         {
            j--;
            System.out.println("Please enter a number between 1 - 50");
            array2[j]=input.nextInt();
         }
         total+=array2[j];
      }
      for(int u=0; u<10; u++)
      {
         System.out.println(u);
      }
      int u=0;
      if(u<11)
      { 
         System.out.println("Array U not comopleted, please check code.");
      }
      
      int [] array3= new int[20];
      
      for(int e=0; e<=10; e++)
      {
         System.out.println("Please enter a number between, 1 - 100");
         array3[e]=input.nextInt();
         if(array3[e]<1 || array3[e]>100)
         {
            e--;
            System.out.println("Please enter a number between, 1 - 100");
            array3[e]=input.nextInt();
         }
      }
      for(int w=0; w<=10; w++)
      {
         System.out.println(array3[w]);
      }
   }
}