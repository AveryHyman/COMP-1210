import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** A test that always fails. **/
   @Test public void countTest() {
   
      Cone.resetCount();
      Cone c1 = new Cone("Avery", 10, 10);
      Cone c2 = new Cone("Bob", 2, 2);
      Assert.assertEquals("Method is incorrect", 2, Cone.getCount());
   }
}
