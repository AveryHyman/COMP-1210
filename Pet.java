import java.text.DecimalFormat;
/**
*Abstract class with protected variables.
*
*@author Avery Hyman
*@version 11/10/2016
*/
public abstract class Pet implements Comparable<Pet>
{
   protected String owner;
   protected String name;
   protected String breed;
   protected double weight;
   protected int days;
   protected static int count = 0;
   
   /**
   *Constructor of class.
   *
   *@param ownerIn sets owner.
   *@param nameIn sets name.
   *@param breedIn sets breed.
   *@param weightIn sets weight.
   *@param daysIn sets day.
   */
   public Pet(String ownerIn, String nameIn, 
              String breedIn, double weightIn, int daysIn)
   {
      owner = ownerIn;
      name = nameIn;
      breed = breedIn;
      weight = weightIn;
      days = daysIn;
      count++;
   }
   
   /**
   *Gets owner.
   *
   *@return owner.
   */
   public String getOwner()
   {
      return owner;
   }
   
   /**
   *Sets owner.
   *
   *@param ownerIn sets owner.
   */
   public void setOwner(String ownerIn)
   {
      owner = ownerIn.trim();
   }
   
   /**
   *Gets name.
   *
   *@return name.
   */
   public String getName()
   {
      return name;
   }
   
   /**
   *Sets name.
   *
   *@param nameIn sets name.
   */
   public void setName(String nameIn)
   {
      name = nameIn.trim();
   }
   
   /**
   *Gets breed.
   *
   *@return breed.
   */
   public String getBreed()
   {
      return breed;
   }
   
   /**
   *Sets breed.
   *
   *@param breedIn sets breed.
   */
   public void setBreed(String breedIn)
   {
      breed = breedIn.trim();
   }
   
   /**
   *Gets weight.
   *
   *@return weight.
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
   *Sets weight.
   *
   *@param weightIn sets weight.
   */
   public void setWeight(double weightIn)
   {
      weight = weightIn;
   }
   
   /**
   *Gets days.
   *
   *@return days
   */
   public int getDays()
   {
      return days;
   }
   
   /**
   *Sets days.
   *
   *@param daysIn sets days.
   */
   public void setDays(int daysIn)
   {
      days = daysIn;
   }
   
   /**
   *Gets Count.
   *
   *@return count.
   */
   public static int getCount()
   {
      return count;
   }
   
   /**
   *Resets count.
   *
   */
   public static void resetCount()
   {
      count = 0;
   }
   
   /**
   *Creates abstract class boardingCost.
   *@return boardingCost.
   */
   public abstract double boardingCost();
   
   /**
   *Creates toString.
   *
   *@return endstring.
   */
   public String toString()
   {  
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      
      String endstring = "Owner: "  + this.getOwner()
               + "   " + "Pet: " + this.getName()
               + "   " + "Days: " + this.getDays()
               + "   " + "Boarding Cost: " + df.format(this.boardingCost())
               + "\n" + this.getClass().toString().substring(6)
               + ": " + this.getBreed()
               + "   " + "Weight: " + this.getWeight() + " lbs";
      return endstring;
   }
   
   /**
   *Changes compareTo method.
   *
   *@param obj set Pet object.
   *@return int.
   */
   public int compareTo(Pet obj)
   {      
      if (this.getOwner().toLowerCase().compareTo(
         obj.getOwner().toLowerCase()) > 0)
      {
         return 1;
      }
         
      else if (this.getOwner().toLowerCase().compareTo(
              obj.getOwner().toLowerCase()) < 0)
      {
         return -1;
      }
      
      else
      {
         return 0;
      }
   }
   
}