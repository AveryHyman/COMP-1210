import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
*Public class PetBoardingList.
*
*@author Avery Hyman
*@version 12/01/2016
*/
public class PetBoardingList
{
   private String listName;
   private Pet[] petList;
   private int petCount;
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
   
   /**
   *Constructor for class. 
   */
   public PetBoardingList()
   {
      listName = "not set";
      petList = new Pet[100];
      petCount = 0;
      excludedRecords = new String [30];
      excludedCount = 0;
      listCount++;
   }
   
   /**
   *Gets List name.
   *
   *@return listName.
   */
   public String getListName()
   {
      return this.listName;
   }
   
   /**
   *Set ListName.
   *
   *@param listNameIn extends listName.
   */
   public void setListName(String listNameIn)
   {
      listName = listNameIn;
   }
   
   /**
   *Gets Pet List.
   *
   *@return petList.
   */
   public Pet[] getPetList()
   {
      return petList;
   }
   
   /**
   *Set PetList.
   *
   *@param obj extends petList.
   */
   public void setPetList(Pet[] obj)
   {
      petList = obj;
      petCount++;
   }
   
   /**
   *Get PetCount.
   *
   *@return petCount.
   */
   public int getPetCount()
   {
      return petCount;
   }
   
   /**
   *Set PetCount.
   *
   *@param petCountIn extends petCount.
   */
   public void setPetCount(int petCountIn)
   {
      petCount = petCountIn;
   }
   
   /**
   *Get ExcludedRecords.
   *
   *@return excludedRecords.
   */
   public String[] getExcludedRecords()
   {
      return excludedRecords;
   }
   
   /**
   *Set ExcludedRecords.
   *
   *@param exclude extends excludedRecords.
   */
   public void setExcludedRecords(String[] exclude)
   {
      excludedRecords = exclude;
      excludedCount++;
   }
   
   /**
   *Get ExcludedCount.
   *
   *@return excludedCount.
   */
   public int getExcludedCount()
   {
      return excludedCount;
   }
   
   /**
   *Set ExcludedCount.
   *
   *@param excludedCountIn extends excludedCount.
   */
   public void setExcludedCount(int excludedCountIn)
   {
      excludedCount = excludedCountIn;
   }
   
   /**
   *Gets ListCount.
   *
   *@return listCount.
   */
   public static int getListCount()
   {
      return listCount;
   }
   
   /**
   *Resets listCount to 0.
   */
   public static void resetListCount()
   {
      listCount = 0;
   }
   
   /**
   *Reads file.
   *
   *@param fileName extends petList.
   *@throws IOException after reading file.
   */
   public void readPetFile(String fileName) throws IOException
   {
      Scanner fileRead = new Scanner(new File(fileName));
      listName = fileRead.nextLine().trim();
      
      while (fileRead.hasNext())
      {
         String currentLine = fileRead.nextLine();
         Scanner petRead = new Scanner(currentLine);
         petRead.useDelimiter(",");
         
         String owner;
         String petName;
         String breed;
         double weight;
         int days;
         String serviceType;
         String commands = "";
         String delimiter = ",";
         double exerciseFee;
         int lives;
         
         
         try
         {
            String type = petRead.next().trim().toUpperCase();
            switch (type.charAt(0))
            {
               case 'C':
                  owner = petRead.next().trim();
                  petName = petRead.next().trim();
                  breed = petRead.next().trim();
                  weight = Double.parseDouble(petRead.next().trim());
                  days = Integer.parseInt(petRead.next().trim());
                  lives = Integer.parseInt(petRead.next().trim());
                  Cat c = new Cat(owner, petName, breed, weight, days,
                        lives);
                  petList[petCount] = c;
                  petCount++;
               
                  break;
            
               case'D':
                  owner = petRead.next().trim();
                  petName = petRead.next().trim();
                  breed = petRead.next().trim();
                  weight = Double.parseDouble(petRead.next().trim());
                  days = Integer.parseInt(petRead.next().trim());
                  Dog d = new Dog(owner, petName, breed, weight, days);
                  petList[petCount] = d;
                  petCount++;
               
                  break;
            
               case'S':
                  owner = petRead.next().trim();
                  petName = petRead.next().trim();
                  breed = petRead.next().trim();
                  weight = Double.parseDouble(petRead.next().trim());
                  days = Integer.parseInt(petRead.next().trim());
                  serviceType = petRead.next().trim();
                  
                  int i = 0; 
                  while (petRead.hasNext())
                  {
                     commands += petRead.next() + " ";
                     i++;
                  }
                  
                  ServiceDog sD = new ServiceDog(owner, petName, breed, weight,
                     days, serviceType, commands);
                  petList[petCount] = sD;
                  petCount++;
                       
                  break;
            
               case'H':
                  owner = petRead.next().trim();
                  petName = petRead.next().trim();
                  breed = petRead.next().trim();
                  weight = Double.parseDouble(petRead.next().trim());
                  days = Integer.parseInt(petRead.next().trim());
                  exerciseFee = Double.parseDouble(petRead.next().trim());
                  
                  Horse h = new Horse(owner, petName, breed, weight, days,
                     exerciseFee);
                  petList[petCount] = h;
                  petCount++;
               
                  break;
               default:
                  throw new InvalidCategoryException(type);
            }
         }
         
         catch (InvalidCategoryException e)
         {
            excludedRecords[excludedCount] = e + " in: " + currentLine;
            excludedCount++;
         }
         
         catch (NumberFormatException e)
         {
            excludedRecords[excludedCount] = e + " in: " + currentLine;
            excludedCount++;
         }
         
         catch (NoSuchElementException e)
         {
            excludedRecords[excludedCount] = e + " in: " + currentLine;
            excludedCount++;
         }
            
      } 
   }
   /**
   *Generates Report.
   *
   *@return output.
   */
   public String generateReport()
   {
      String output;
      output = "---------------------------------------\n";
      output += "Pet Boarding report for " + getListName() + "\n";
      output += 
                "---------------------------------------\n\n";
      for (int i = 0; i < petCount; i++)
      {
         output += petList[i].toString();
         output += "\n\n";
      }
         
      return output;
   }
   
   /**
   *Generate Report orderd by Owner.
   *
   *@return output.
   */
   public String generateReportByOwner()
   {
      String output;
      output = "---------------------------------------\n";
      output += "Pet Boarding Report for " + getListName()
         + " (By Owner)" + "\n";
      output += "---------------------------------------\n\n";
      Pet[] petByOwner = Arrays.copyOf(petList, petCount);
      
      Arrays.sort(petByOwner);
      
      for (int i = 0; i < petCount; i++)
      {
         output += petByOwner[i].toString();
         output += "\n\n";
      }
      
      return output;
   }
   
   /**
   *Generate Report sorted by Pet Name.
   *
   *@return output.
   */
   public String generateReportByPetName()
   {
      String output;
      output = "---------------------------------------\n";
      output += "Pet Boarding Report for " + getListName()
         + " (By Pet Name)" + "\n";
      output += "---------------------------------------\n\n";
      
      Pet[] petByName = Arrays.copyOf(petList, petCount);
      
      Arrays.sort(petByName, new PetNameComparator());
      
      for (int i = 0; i < petCount; i++)
      {
         output += petByName[i].toString();
         output += "\n\n";
      }
      
      return output;
   }
   
   /**
   *Generates report sorted by BoradingCost.
   *
   *@return output.
   */
   public String generateReportByBoardingCost()
   {
      String output; 
      output = "---------------------------------------\n";
      output += "Pet Boarding Report for " + getListName() 
         + " (By Boarding Cost)" + "\n";
      output += "---------------------------------------\n\n";
      
      Pet[] petByBoardingCost = Arrays.copyOf(petList, petCount);
      
      Arrays.sort(petByBoardingCost, new BoardingCostComparator());
      
      for (int i = 0; i < petCount; i++)
      {
         output += petByBoardingCost[i].toString();
         output += "\n\n";
      }
         
      return output;
   }
   
   /**
   *Generate Report based on ExcludedRecords.
   *
   *@return output.
   */
   public String generateExcludedRecordsReport()
   {
      String output; 
      output = "---------------------------------------\n";
      output += "Excluded Records Report" + "\n";
      output += "---------------------------------------\n\n";
      
      for (int i = 0; i < excludedCount; i++)
      {
         output += excludedRecords[i];
         output += "\n";
      }
      
      return output;
   }
}