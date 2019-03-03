import org.junit.Assert;
import org.junit.Test;

/**
*Tester for Cat class.
**/
public class CatTest {
   /** Test for counter. **/
   @Test public void counterTest() {
   
      Pet.resetCount();
      Assert.assertEquals("resetCount test:", Pet.getCount(), 0);
     
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9, 7, 9);
   
      Assert.assertEquals("getCount test:", Pet.getCount(), 1);
   }
   
   /** Test for owner. **/
   @Test public void ownerTest()
   {
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9, 7, 9);
      
      Assert.assertEquals("getOwner test:", c1.getOwner(), "Barb Jones");
      
      c1.setOwner("Barb");
      
      Assert.assertEquals("setOwner test:", c1.getOwner(), "Barb");
   }
   
   /** Test for name. **/
   @Test public void nameTest()
   {
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9, 7, 9);
      
      Assert.assertEquals("getName test:", c1.getName(), "Callie");
      
      c1.setName("Call");
      
      Assert.assertEquals("setName test:", c1.getName(), "Call");
   }
   
   /** Test for breed. **/
   @Test public void breedTest()
   {
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9, 7, 9);
      
      Assert.assertEquals("getBreed test:", c1.getBreed(), "Siamese");
      
      c1.setBreed("Cat");
      
      Assert.assertEquals("setBreed test:", c1.getBreed(), "Cat");
   }
   
   /** Test for weight. **/
   @Test public void weightTest()
   {
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9, 7, 9);
      
      Assert.assertEquals("getWeight test:", 9, c1.getWeight(), 0);
      
      c1.setWeight(10);
      
      Assert.assertEquals("setWeight test:", 10, c1.getWeight(), 0);
   }
   
   /** Test for days. **/
   @Test public void daysTest()
   {
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9, 7, 9);
      
      Assert.assertEquals("getDays test:", c1.getDays(), 7);
      
      c1.setDays(8);
      
      Assert.assertEquals("setDays test:", c1.getDays(), 8);
   }
   
   /** Test for toString. **/
   @Test public void toStringTest()
   {
      Cat c1 = new Cat("Barb Jones", "Callie", "Siamese", 9, 7, 9);
      
      Assert.assertEquals("toString test:", false, 
                          c1.toString().contains("Owner"  
         + ": Barb Jones Pet: Callie Days: 7 BoardingCost: $76.30 Cat: " 
         + "Siamese Weight: 9.0 lbs Lives Left: 9"));
   }
}
