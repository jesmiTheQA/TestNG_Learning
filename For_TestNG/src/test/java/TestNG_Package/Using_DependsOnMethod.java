package TestNG_Package;

import org.testng.annotations.Test;

public class Using_DependsOnMethod {
	
	@Test
	public void  Login(){
		System.out.println("From  Login() ");

	}
	
	@Test(dependsOnMethods="Login")
	public void Search() {
		  System.out.println("From Search");
	}

	@Test(dependsOnMethods={"Login"})
	public void Search1() {
		  System.out.println("From Search1");
	}
	
	@Test(dependsOnMethods={"Login","Search1"})
	public void Search2() {
		  System.out.println("From Search2");
	}
}
