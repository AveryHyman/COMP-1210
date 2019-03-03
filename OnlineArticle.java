public class OnlineArticle extends OnlineTextItem
{
   private int wordCount;
   
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   public boolean setWordCount(int wordCountIn)
   {
      if (wordCountIn > 0)
      {
         wordCount = wordCountIn;
         return true;
      }
      
      else 
      {
         return false;
      }
   }
}