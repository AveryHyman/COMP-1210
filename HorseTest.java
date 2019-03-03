import org.junit.Assert;
import org.junit.Test;

/**
*Tester for Horse class.
**/
public class HorseTest {

   /** Exercies Fee Test. **/
   @Test public void exerciseFee() {
      Horse h = new Horse("Jessie Rider", "King", 
                          "Quarter Horse", 1000, 7, 10.0);
      
      Assert.assertEquals("getExerciseFee test:", 10.0, h.getExerciseFee(), 0);
      
      h.setExerciseFee(11.0);
      
      Assert.assertEquals("setExerciseFee test:", 11.0, h.getExerciseFee(), 0);
   }
   
   /** Boarding Cost Test. **/
   @Test public void boardingCostTest() {
      Horse h = new Horse("Jessie Rider", "King", 
                          "Quarter Horse", 1000, 7, 10.0);
      
      Assert.assertEquals("boadingCost Test:", 245.00, h.boardingCost(), 0);
   }
}
