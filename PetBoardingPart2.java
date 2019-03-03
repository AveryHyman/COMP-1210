import java.io.IOException;

/**
*Driver program for Pet and PetBoarding classes.
*
*@author Avery Hyman
*@version 11/17/2016
*/

public class PetBoardingPart2
{
   /**
   *Reads in a file and creates Pet object.
   *Prints summary of data.
   *
   *@throws IOException from reading files
   */
   
   public static void main(String[] args) throws IOException
   /**
   *@param agrs Command line arguments to specify filename
   */
   {
         
      try
      {
         String fileName = args[0].trim();
         PetBoardingList pet1 = new PetBoardingList();
         pet1.readPetFile(fileName);
         System.out.println(pet1.generateReport());
         System.out.println(pet1.generateReportByOwner());
         System.out.println(pet1.generateReportByPetName());
         System.out.println(pet1.generateReportByBoardingCost());
         System.out.println(pet1.generateExcludedRecordsReport());
      
      }
      
      catch (ArrayIndexOutOfBoundsException e)
      {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      
   }
}