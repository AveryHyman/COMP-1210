import java.util.Comparator;

/**
*Comparator for Pet by pet name.
*
*@author Avery Hyman
*@version 11/17/2016
*/
public class PetNameComparator implements Comparator<Pet>
{
   /**
   *Alternate ordering of Pet by pet name.
   *
   *@param p1 first Pet object
   *@param p2 second Pet object
   *@return int representing answer.
   */
   public int compare(Pet p1, Pet p2)
   {
      if (p1.getName().compareTo(p2.getName()) > 0)
      {
         return 1;
      }
      
      else if (p1.getName().compareTo(p2.getName()) < 0)
      {
         return -1;
      }
      
      else
      {
         return 0;
      }
   }
}