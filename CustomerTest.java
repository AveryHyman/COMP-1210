import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .001);
   }
   
   @Test public void defaultTest2(){
      BankLoan.resetLoansCreated();
      BankLoan loan1 = new BankLoan("Avery", .10);
      BankLoan.resetLoansCreated();
      Assert.assertEquals(" ", 0, BankLoan.loansCreated);
   }
   
}
