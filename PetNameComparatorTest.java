import org.junit.Assert;
import org.junit.Test;

/**
*Test for the PetNameComparator class.
*
*@author Avery Hyman
*@version 11/17/2016
*/
public class PetNameComparatorTest {

   /** Test for comparing two pets by name. **/
   @Test public void defaultTest() {
      
      PetNameComparator pnComp = new PetNameComparator();
      
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      Cat d1 = new Cat("Jake Smith", "Honey", "Great Dane", 60.0, 7,9);
      Cat h1 = new Cat("Barb Jones", "Callie", "Quarter Horse", 
                           1000, 7, 10);
      
      int expected1 = 1;
      Assert.assertEquals("Not compared alphabetically", expected1,
                           pnComp.compare(d1, h1));
      
      int expected2 = -1;
      Assert.assertEquals("Not compared alphabetically", expected2,
                           pnComp.compare(h1, d1));
      
      int expected3 = 0;
      Assert.assertEquals("Did not see two Strings that are equal.", expected3,
                           pnComp.compare(h1, c1));
   }
}
