package TestNG_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Using_Anotations {
	

	@BeforeSuite
	public void For_BeforeSuite(){
		System.out.println("From @BeforeSuite Annotations ");
	}
	
	@BeforeTest
	public void For_BeforeTest(){
		System.out.println("From @BeforeTest Annotations ");
	}
	
	@BeforeClass
	public void For_BeforeClass(){
		System.out.println("From @BeforeClass Annotations ");
	}
	
	@BeforeMethod
	public void For_BeforeMethod(){
		System.out.println("From @BeforeMethod Annotations ");
	}
	
	@Test(priority=2, groups="Same")
	public void For_Test(){
		System.out.println("From @Test Annotations ");
	}
	
	@Test(priority=1,groups="Same1")
	public void For_Test1(){
		System.out.println("From @Test1 Annotations ");
	}
	
	@Test(priority=3,groups="Same1")
	public void For_Test2(){
		System.out.println("From @Test2 Annotations ");
	}
	
	@Test(priority=4, groups="Same")
	public void For_Test3(){
		System.out.println("From @Test3 Annotations ");
	}
	

	
	@AfterMethod
	public void For_AfterMethod(){
		System.out.println("From @AfterMethod Annotations ");
	}

	@AfterTest
	public void For_AfterTest(){
		System.out.println("From @AfterTest Annotations ");
	}
	
	@AfterClass
	public void For_AfterClass(){
		System.out.println("From @AfterClass Annotations ");
	}
	
	@AfterSuite
	public void For_AfterSuite(){
		System.out.println("From @AfterSuite Annotations ");
	}

}
