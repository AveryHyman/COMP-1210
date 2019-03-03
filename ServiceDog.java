/**
*Public class ServiceDog that extends Dog.
*
*@author Avery Hyman
*@version 11/10/2016
*/
public class ServiceDog extends Dog
{
   private String service;
   private String[] commands;
   
   /**
   *Sets static final varaible BASE_RATE.
   */
   public static final double BASE_RATE = 13;
   
   /**
   *Constructor of class.
   *
   *@param ownerIn sets owner.
   *@param nameIn sets name.
   *@param breedIn sets breed.
   *@param weightIn sets weight.
   *@param daysIn sets day.
   *@param serviceIn sets service.
   *@param commandsIn sets commands.
   */
   public ServiceDog(String ownerIn, String nameIn, String breedIn, 
                     double weightIn, int daysIn, String serviceIn,
                     String ... commandsIn)
   {
      super(ownerIn, nameIn, breedIn, weightIn, daysIn);
      service = serviceIn;
      commands = commandsIn;
   }
   
   /**
   *Gets service.
   *
   *@return service.
   */
   public String getService()
   {
      return service;
   }
   
   /**
   *Sets service.
   *
   *@param serviceIn sets service.
   */
   public void setService(String serviceIn)
   {
      service = serviceIn.trim();
   }
   
   /**
   *Gets commands.
   *
   *@return commands.
   */
   public String[] getCommands()
   {
      return commands;
   }
   
   /**
   *Sets Command.
   *
   *@param commandsIn sets commands
   */
   public void setCommands(String ... commandsIn)
   {
      commands = commandsIn;
   }
   
   /**
   *Sets boardingCost.
   *
   *@return cost.
   */
   public double boardingCost()
   {
      double cost = (BASE_RATE + this.getWeight()
         * 0.05 + commands.length) * this.getDays();
      return cost;
   }
   
   /**
   *Creates new toString.
   *
   *@return endstring.
   */
   public String toString()
   {
      String ifcommands = "\nCommands: ";
      
      if (commands != null)
      {
         for (int i = 0; i < commands.length; i++)
         {
            ifcommands += commands[i] + " ";
         }
         
         String endstring = super.toString()
            + "   " + "Service: " + this.getService()
            + ifcommands;
         return endstring;
      }
      
      else
      {
         String endstring = super.toString()
            + "   " + "Service: " + this.getService();
         return endstring;
      }
      /**String endstring = super.toString()
                       + "   " + "Service: " + this.getService()
         + ifcommands;
      
      return endstring;*/
   }
}