/**
*Public class Cat that extends Pet.
*
*@author Avery Hyman
*@version 11/10/2016
*/

public class Cat extends Pet
{
   private int lives;
   
   /**
   *Sets static final varaible BASE_RATE.
   */
   public static final double BASE_RATE = 10;
   
   /**
   *Constructor of class.
   *
   *@param ownerIn sets owner.
   *@param nameIn sets name.
   *@param breedIn sets breed.
   *@param weightIn sets weight.
   *@param daysIn sets day.
   *@param livesIn sets lives.
   */
   public Cat(String ownerIn, String nameIn, String breedIn,
      double weightIn, int daysIn, int livesIn)
   {
      super(ownerIn, nameIn, breedIn, weightIn, daysIn);
      lives = livesIn;
   }
   
   /**
   *Gets lives.
   *
   *@return lives.
   */
   public int getLivesLeft()
   {
      return lives;
   }
   
   /**
   *Sets lives.
   *
   *@param livesIn sets lives.
   */
   public void setLivesLeft(int livesIn)
   {
      lives = livesIn;
   }
   
   /**
   *Sets boardingCost.
   *
   *@return cost.
   */
   public double boardingCost()
   {
      double cost = (BASE_RATE + weight * 0.10)
                   * days * (9.0 / lives);
      return cost;
   }
   
   /**
   *Creates new toString.
   *
   *@return endstring.
   */
   public String toString()
   {
      String endstring = super.toString()
                       + "   Lives Left: " + this.getLivesLeft();
      return endstring;
   }
}