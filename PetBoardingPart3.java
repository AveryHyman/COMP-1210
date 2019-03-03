import java.io.IOException;
/**
*Main method for Pet.
*
*@author Avery Hyman
*@version 12/01/2016
*/
public class PetBoardingPart3
{

/**
*Main Method for PetBoardingPart3.
*
*@param args extends IOEception.
*/
   public static void main(String []args)
   {
      if (args.length == 0)
      {
         System.out.println("File Name expected as command line argument.");
         System.out.println("Program ending.");
         
         return;
      }
      
      String fileName = args[0].trim();
      PetBoardingList list1 = new PetBoardingList();
      
      try
      {
         list1.readPetFile(fileName);
      }
      
      catch (IOException e)
      {
         System.out.println("Attempted to read file:"
            + fileName + "(No such file or directory)");
         System.out.println("Program ending.");
         
         return;
      }
      
      System.out.println(list1.generateReport());
      System.out.println(list1.generateReportByOwner());
      System.out.println(list1.generateReportByPetName());
      System.out.println(list1.generateReportByBoardingCost());
      System.out.println(list1.generateExcludedRecordsReport());
   }
}