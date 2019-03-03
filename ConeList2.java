import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
/**
*Input a label, and cones, for a list of cones.
*
*@author Avery Hyman
*@version 10/03/2016
*/
public class ConeList2
{
   private String name;
   private Cone[] coneObject = new Cone[100];
   /**
   *Creates Cone List object.
   *
   *@param nameIn sets name
   *@param coneObjectIn sets coneObject
   */
   public ConeList2(String nameIn, Cone[] coneObjectIn)
   {
      name = nameIn;
      coneObject = coneObjectIn;
   }
   
   /**
   *Gets list name.
   *
   *@return name
   */
   public String getName()
   {
      return name;
   }
   
   /**
   *Gets Array List of Cone Objects.
   *
   *@return coneObject
   */
   public Cone[] getList()
   {
      return coneObject;
   }
   
   /**
   *Reads file and returns an Array List with the 
   *values found in file.
   *
   *@param fileNameIn for fileName to read
   *@return fileCone
   *@throws IOException for file reading
   */
   
   public ConeList2 readFile(String fileNameIn) throws IOException
   {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Cone[] myList = new Cone[100];
      String cListName = "";
      int height = 0, radius = 0;
      
      name = scanFile.nextLine();      
      while (scanFile.hasNext()) {
         height = Integer.parseInt(scanFile.nextLine());
         radius = Integer.parseInt(scanFile.nextLine());
         
         Cone[] c = new Cone[100];
         c = (cListName, height, radius);           
      }
      
      ConeList[] cL = new ConeList(cListName, myList);
      
      return cL;
   }

   
   /**
   *Gets number of Cones.
   *
   *@return coneObject.size()
   */
   public int numberOfCones()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         return coneObject.size();
      }
   }
   
   /**
   *Gets total Base Perimeter for all cones.
   *
   *@return total
   */
   public double totalBasePerimeter()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
         
         int index = 0;
         
         while (index < coneObject.size())
         {
            total += coneObject.get(index).basePerimeter();
            index++;
         }
         
         return total;
      }
   }
   
   /**
   *Gets Total Base Area for all cones. 
   *
   *@return total
   */
   public double totalBaseArea()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
      
         int index = 0;
      
         while (index < coneObject.size())
         {
            total += coneObject.get(index).baseArea();
            index++;
         }
      
         return total;
      }
   }
   
   /**
   *Gets total Slant Height for all cones.
   *
   *@return total
   */
   public double totalSlantHeight()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
      
         int index = 0;
      
         while (index < coneObject.size())
         {
            total += coneObject.get(index).slantHeight();
            index++;
         }
      
         return total;
      }
   }
   
   /**
   *Gets total side area for all cones.
   *
   *@return total
   */
   public double totalSideArea()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
      
         int index = 0;
      
         while (index < coneObject.size())
         {
            total += coneObject.get(index).sideArea();
            index++;
         }
         
         return total;
      }
   }
   
   /**
   *Gets total surface area for all cones.
   *
   *@return total
   */
   public double totalSurfaceArea()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
      
         int index = 0;
      
         while (index < coneObject.size())
         {
            total += coneObject.get(index).surfaceArea();
            index++;
         }
         return total;
      }
   }
   
   /**
   *Gets total volume for all cones.
   *
   *@return total
   */
   public double totalVolume()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double total = 0;
      
         int index = 0;
       
         while (index < coneObject.size())
         {
            total += coneObject.get(index).volume();
            index++;
         }
         return total;
      }
   }
   
   /**
   *Gets average surface area for all cones.
   *
   *@return averageSA
   */
   public double averageSurfaceArea()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double averageSA = totalSurfaceArea() / coneObject.size();
         return averageSA;
      }
   }
   
   /**
   *Gets the average volume for all cones.
   *
   *@return averageV
   */
   public double averageVolume()
   {
      if (coneObject.size() == 0)
      {
         return 0;
      }
      else
      {
         double avgerageV = totalVolume() / coneObject.size();
         return avgerageV;
      }
   }
   
   /**
   *Overrides toString method for cone object.
   *
   *@return result
   */
   public String toString()
   {
      String result = "\n" + name + "\n";
      int index = 0;
      while (index < coneObject.size()) {
         result += "\n" + coneObject.get(index) + "\n"; 
         index++;  
      }   
      return result;
   }
   
   /**
   *Overrides summaryInfo method for cone object.
   *
   *@return result
   */
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Cones: " + numberOfCones();
      result += "\nTotal Base Perimeter: " + totalBasePerimeter(); 
      result += "\nTotal Base Area: "  + totalBaseArea();
      result += "\nTotal Slant Height: "  + totalSlantHeight();
      result += "\nTotal Side Area: " + totalSideArea();
      result += "\nTotal Surface Area: " + totalSurfaceArea();
      result += "\nTotal Volume: " + totalVolume();
      result += "\nAverage Surface Area: " + averageSurfaceArea();
      result += "\nAverage Volume: " + averageVolume();
      
      return result;
   }
   
   /**
   *Add Cone.
   *
   *@param nIn sets new cone name
   *@param hIn sets new cone height
   *@param rIn sets new cone radius
   */
   public void addCone(String nIn, double hIn, double rIn)
   {
      Cone c = new Cone(nIn, hIn, rIn);
      coneObject.add(c);
   }
   
   /**
   *Delete cone.
   *
   *@param nIn gets name of cone to be deleted
   *@return result
   */
   public boolean deleteCone(String nIn)
   {
      boolean result = false;
      int index = -1;
      for (Cone c : coneObject) {
         if (c.getLabel().equals(nIn)) 
         {
            index = coneObject.indexOf(c);
            break;
         }
      }
      
      if (index >= 0) {
         coneObject.remove(index);
         result = true;
      }
      return result;
   }
   
   /**
   *Finds Cone.
   *
   *@param clIn finds cone based on input
   *@return varables of cone found
   */
   public String findCone(String clIn)
   {
      for (Cone c : coneObject)
      {
         if (c.getLabel().equals(clIn))
         {
            return c.getLabel();
         }
      }
      
      return "";
   }
   
   /**
   *Edits Cone.
   *
   *@param clIn finds cone based on input
   *@param chIn contains height to replace with
   *@param crIn contains radius to replace with
   *@return cone with changed hieght and radius
   */
   public String editCone(String clIn, double chIn, double crIn)
   {
      for (Cone c : coneObject)
      {
         if (c.getLabel().equals(clIn))
         {
            c.setRadius(crIn);
            c.setHeight(chIn);
            return c.getLabel();
         }
      }
      return "";
   }
}