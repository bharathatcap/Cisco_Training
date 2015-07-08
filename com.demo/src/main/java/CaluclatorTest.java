import junit.framework.TestCase;


 
public class CaluclatorTest extends TestCase {
	
	//AssertEqual checks if expected and obtained value are same 
	
	//Assert not same checks if expected and obtained value are not same
  
   public void testAddPass() {
      
      assertEquals(5,Calculator.add(3,2));
   }
 
   
   public void testAddFail() {
    
     assertNotSame(6, Calculator.add(3,2));
   }
 
   public void testSubtractPass() {
	      assertEquals(  3, Calculator.subtract(4, 1));
	      
	   }
	 
	   
	   public void testSubtractFail() {
	      assertNotSame("error in subtract()",5, Calculator.subtract(4, 1) );
	   }   

	   public void testmultiplyPass() {
		      assertEquals(  3, Calculator.multiply(3, 1));
		      
		   }
		 
		   
		   public void testmultiplyFail() {
		      assertNotSame("error in nultiply()",6, Calculator.multiply(4, 2) );
		   }   

		   public void testdividePass() {
			      assertEquals(  3, Calculator.divide(3, 1));
			      
			   }
			 
			   
			   public void testdivideFail() {
			      assertNotSame("error in divide()",4, Calculator.divide(24, 4) );
			   }   

}