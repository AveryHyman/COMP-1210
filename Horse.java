/**
*Public class Horse that extends Pet.
*
*@author Avery Hyman
*@version 11/10/2016
*/
public class Horse extends Pet
{
   private double exerciseFee;
   
   /**
   *Sets static final varaible BASE_RATE.
   */
   public static final double BASE_RATE = 15;
   
   /**
   *Constructor of class.
   *
   *@param ownerIn sets owner.
   *@param nameIn sets name.
   *@param breedIn sets breed.
   *@param weightIn sets weight.
   *@param daysIn sets day.
   *@param exerciseFeeIn sets exerciseFee.
   */
   public Horse(String ownerIn, String nameIn, String breedIn,
                double weightIn, int daysIn, double exerciseFeeIn)
   {
      super(ownerIn, nameIn, breedIn, weightIn, daysIn);
      exerciseFee = exerciseFeeIn;
   }
   
   /**
   *Gets exerciseFee.
   *
   *@return exerciseFee
   */
   public double getExerciseFee()
   {
      return exerciseFee;
   }
   
   /**
   *Sets exerciseFee.
   *
   *@param exerciseFeeIn sets exerciseFee.
   */
   public void setExerciseFee(double exerciseFeeIn)
   {
      exerciseFee = exerciseFeeIn;
   }
   
   /**
   *Sets boardingCost.
   *
   *@return cost.
   */
   public double boardingCost()
   {
      double cost = (BASE_RATE + this.getWeight() * 0.01
                     + this.getExerciseFee()) * this.getDays();
      
      return cost;
   }
   
   /**
   *Creates new toString.
   *
   *@return endstring.
   */
   public String toString()
   {
      String endstring = super.toString() + "   Exercise Fee: "
                         + this.getExerciseFee();
      
      return endstring;
   }
}