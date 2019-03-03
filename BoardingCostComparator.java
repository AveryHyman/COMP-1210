import java.util.Comparator;

/**
*Comparator for Pet by Boarding Cost.
*
*@author Avery Hyman
*@version 11/17/2016
*/

public class BoardingCostComparator implements Comparator<Pet>
{
   /**
   *Alternate ordering of Pet by boardingCost.
   *
   *@param p1 first Pet object
   *@param p2 second Pet Object
   *@return int representing result.
   */
   
   public int compare(Pet p1, Pet p2)
   {
      if (p1.boardingCost() == p2.boardingCost())
      {
         return 1;
      }
      else if (p1.boardingCost() == p2.boardingCost())
      {
         return -1;
      }
      
      else
      {
         return 0;
      }
   }
}