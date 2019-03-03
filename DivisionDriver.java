import java.util.Scanner;
import javax.swing.JOptionPane;
public class DivisionDriver extends Division
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      
      String numInput
         = JOptionPane.showInputDialog("Enter the neumerator:");
      String domInput
         = JOptionPane.showInputDialog("Enter the denominator:");
      
      try
      {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(domInput);
      
         String result = "Integer division: \n"
                     + Division.intDivide(num, denom)
                     + "\n\nFloating point division: \n"
                     + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical interger values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch(IllegalArgumentException e)
      {
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
      
   }
}