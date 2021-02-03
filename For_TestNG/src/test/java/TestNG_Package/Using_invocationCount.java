package TestNG_Package;

import org.testng.annotations.Test;

public class Using_invocationCount {
	
	@Test(invocationCount = 1) 
    public void test1() {
           System.out.println("test1");
     }
	
	@Test(invocationCount = 1) 
    public void test2() {
           System.out.println("test2");
     }

}
