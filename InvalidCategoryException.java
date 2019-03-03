/**
*Defines exception for InvalidCategoryException.
*
*@author Avery Hyman
*@version 12/01/2016
*/
public class InvalidCategoryException extends RuntimeException
{
   /**
   *Constructor.
   *
   *@param category extends tag
   */
   public InvalidCategoryException(String category)
   {
      super("For category: " + "\"" + category + "\"");
   }
}