import java.text.DecimalFormat;
/**
*
*Instantiates a label, radius, and height for a cone.
*Calculates values for cone using the formulas.
*
*@author Avery Hyman
*@version 10/03/2016
*/
public class Cone 
//instance variables
{
   private String label;
   private double height;
   private double radius;
   private static int count = 0;
 
 //constructor  
 
 /**
 *Creates cone object.
 *
 *@param labelIn sets label.
 *@param heightIn sets height.
 *@param radiusIn sets radius.
 */
   public Cone(String labelIn, double heightIn, double radiusIn)
   {
      label = labelIn.trim();
      height = heightIn;
      radius = radiusIn;
      count++;
   }
   
 //methods
 
 /**
 *Gets cone label.
 *
 *@return label.
 */
   public String getLabel()
   {
      return label;
   }
 /**
 *Gets number of cones.
 *
 *@return count
 */
   public static int getCount()
   {
      return count;
   }
   
 /**
 *Resets counter.
 */
   public static void resetCount()
   {
      count = 0;
   }
 /**
 *Sets label of cone.
 *
 *@return boolean
 *@param labelIn sets label
 */
   public boolean setLabel(String labelIn)
   {
      if (labelIn != null)
      {
         label = labelIn.trim();
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
  /**
  *Cone object tester.
  *
  *@return boolean
  *@param obj sets c
  */
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Cone))
      {
         return false;
      }
      
      else 
      {
         Cone c = (Cone) obj;
         return (label.equalsIgnoreCase(c.getLabel())
                  && Math.abs(height - c.getHeight()) < .00001
                  && Math.abs(radius - c.getRadius()) < .00001);
      }
   }
  
  /**
  *Gets height of cone.
  *
  *@return height
  */
   public double getHeight()
   {
      return height;
   }
   
   /**
   *Sets height of cone.
   *
   *@param heightIn sets height.
   *@return boolean
   */
   public boolean setHeight(double heightIn)
   {
      if (heightIn > 0)
      {
         height = heightIn;
         return true;
      }
      else
      {
         return false;
      }
   
   }
   
   /**
   *Gets radius of cone.
   *
   *@return radius
   */
   public double getRadius()
   {
      return radius;
   }
   
   /**
   *Sets Radius of cone.
   *
   *@param radiusIn sets radius.
   *@return boolean
   */
   public boolean setRadius(double radiusIn)
   {
      if (radiusIn > 0)
      {
         radius = radiusIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   //Math formulas
   
   /**
   *Perimeter formula.
   *
   *@return perimeter of cone base
   */
   public double basePerimeter()
   {
      return (Math.PI * 2 * radius);
   }
   
   /**
   *Area formula.
   *
   *@return area of cone base
   */
   public double baseArea()
   {
      return (Math.PI * (radius * radius));
   }
   
   /**
   *Slant height.
   *
   *@return slant height of cone
   */
   public double slantHeight()
   {
      return (Math.sqrt((radius * radius) + (height * height)));
   }
   
   /**
   *Side area formula.
   *
   *@return area of side of cone
   */
   public double sideArea()
   {
      return (Math.PI * radius 
               * (Math.sqrt((radius * radius) + (height * height))));
   }
   
   /**
   *Surface area formula.
   *
   *@return sureface area of cone
   */
   public double surfaceArea()
   {
      return (Math.PI * radius 
               * (radius + (Math.sqrt((radius * radius) + (height * height)))));
   }
   
   /**
   *Volume formaula.
   *
   *@return volume of cone
   */
   public double volume()
   {
      return (Math.PI * Math.pow(radius, 2) * height) / 3;
   }
   
   /**
   *Overrides toString method for cone object.
   *
   *@return output
   */
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      
      String output = "\"" + this.getLabel() + "\" "
                    + "is a cone with height = " + fmt.format(this.getHeight())
                    + " units and radius = " + fmt.format(this.getRadius())
                    + " units,\nwhich has base perimeter = " 
                    + fmt.format(this.basePerimeter())
                    + " units, base area = " 
                    + fmt.format(this.baseArea())
                    + " square units,\nslant height = " 
                    + fmt.format(this.slantHeight())
                    + " units, side area = " + fmt.format(this.sideArea())
                    + " square units,\nsurface area = " 
                    + fmt.format(this.surfaceArea())
                    + " square units, and volume = " 
                    + fmt.format(this.volume()) + " cubic units.";
      return output.trim();
   }
 
}