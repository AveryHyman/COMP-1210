/**
*Public class Dog that extends Pet.
*
*@author Avery Hyman
*@version 11/10/2016
*/
public class Dog extends Pet
{
   /**
   *Sets static final varaible BASE_RATE.
   */
   public static final double BASE_RATE = 12;
   
   /**
   *Constructor of class.
   *
   *@param ownerIn sets owner.
   *@param nameIn sets name.
   *@param breedIn sets breed.
   *@param weightIn sets weight.
   *@param daysIn sets day.
   */
   public Dog(String ownerIn, String nameIn,
              String breedIn, double weightIn, int daysIn)
   {
      super(ownerIn, nameIn, breedIn, weightIn, daysIn);
   }
   
   /**
   *Sets boardingCost.
   *
   *@return cost.
   */
   public double boardingCost()
   {
      double cost = (BASE_RATE + this.getWeight() * 0.05) * this.getDays();
      
      return cost;
   }
   
}