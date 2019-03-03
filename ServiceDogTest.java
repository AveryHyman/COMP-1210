import org.junit.Assert;
import org.junit.Test;

/** 
*Tester for ServiceDog class.
**/
public class ServiceDogTest {


   /** Service Test. **/
   @Test public void serviceTest() {
      String[] command = {"sit", "down", "stay", "come", "around", 
                          "forward", "right", "left"};
      ServiceDog d2 = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7, 
                                     "guide dog", command);
      Assert.assertEquals("guide dog", d2.getService());
      
      d2.setService("seeing eye dog");
      
      Assert.assertEquals("seeing eye dog", d2.getService());
   }
   
   /** Commands Test. **/
   @Test public void commandsTest()
   {
      String[] command = {"sit", "down", "stay", "come", "around", 
                          "forward", "right", "left"};
      ServiceDog d2 = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7, 
                                     "guide dog", command);
      
      Assert.assertEquals(command, d2.getCommands());
   }
   
   /** BoardingCost Test. **/
   @Test public void boardingCostTest() {
      String[] command = {"sit", "down", "stay", "come", "around", 
                          "forward", "right", "left"};
      ServiceDog d2 = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7, 
                                     "guide dog", command);
      
      Assert.assertEquals("boadingCost Test:", 168.0, d2.boardingCost(), 0);
   }
}
