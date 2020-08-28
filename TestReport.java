import java.lang.*;
public class TestReport {
	private String testName;
	private String testId;
	private double testCost;
	
	public TestReport (){
		 System.out.println ( " EMPTY! THANKS");
	}
	 public TestReport ( String testName, String testId, double testCost)
	 {
		 System.out.println ( " Information About the Particular Test ");
		 this.testName= testName;
		 this.testId= testId;
		 this.testCost= testCost;
	 }
	 
	 public void setTestName ( String testName)
	 {
		 this.testName= testName;
	 }
	 public void setTestId ( String testId)
	 {
		 this.testId=testId;
	 }
	 public void setTestCost ( double testCost)
	 {
		 this.testCost= testCost;
	 }
	 
	 public String getTestName()
	 {
		 return testName;
	 }
	 
	 public String getTestId()
	 {
		 return testId;
	 }
	 public double getTestCost()
	 {
		 return testCost;
	 }
	 
	 public void showTestDetails()
	 {
		 System.out.println ( " Test Name : "+getTestName());
		 System.out.println ( " Test Id : "+getTestId());
		 System.out.println ( " Test Cost : "+getTestCost());
		 
	 }
}