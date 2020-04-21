import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	static int count=0;
	@Test(priority=1)
	public void doLogin(){
		System.out.println("Executing Login Test");
		
	}
	
	@Test(priority=2)
	public void registerUser(){
		count++;
		System.out.println(count);
		
		//Assert.fail("Execution failed while registering user");
		Assert.assertEquals(count, 3);
		
	}

	
	

}
