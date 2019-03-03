public class OnlineBook extends OnlineTextItem
{
   protected String author;
   
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   public boolean setAuthor(String authorIn)
   {
      if (authorIn != "")
      {
         author = authorIn;
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
   public String toString()
   {
      return name + " - " + author + ": $" + price;
   }
}