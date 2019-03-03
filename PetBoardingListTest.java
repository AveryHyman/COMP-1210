import org.junit.Assert;
import org.junit.Test;

/**
*Tests PetBoardingList class.
*
*@author Avery Hyman
*@version 11/17/2016
*/

public class PetBoardingListTest
{
   /**
   *Test for set name.
   */
   @Test public void setListNameTest()
   {
      PetBoardingList list = new PetBoardingList();
      list.setListName("test");
      Assert.assertEquals("", "test", list.getListName());
   }
    
   /**
   *Test for set pet list.
   */
   @Test public void setPetListTest()
   {
      PetBoardingList list = new PetBoardingList();
      list.setPetList(new Pet[54]);
      Assert.assertEquals("", 54, list.getPetList().length);
   }
   
   /**
   *Test for set pet count.
   */
   @Test public void setPetCount()
   {
      PetBoardingList list = new PetBoardingList();
      list.setPetCount(85);
      Assert.assertEquals("", 85, list.getPetCount());
   }
   
   /**
   *Test for excluded count.
   */
   
   @Test public void setEcludedCountTest()
   {
      PetBoardingList list = new PetBoardingList();
      list.setExcludedCount(45);
      Assert.assertEquals("", 45, list.getExcludedCount());
   }
}
