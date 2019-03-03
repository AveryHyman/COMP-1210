import org.junit.Assert;
import org.junit.Test;

/**
*Tester for Dog class.
**/
public class DogTest {

   /** BoardingCost Test. **/
   @Test public void boardingCostTest() {
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      
      Assert.assertEquals("boadingCost Test:", 105.0, d.boardingCost(), 0);
   }
}
