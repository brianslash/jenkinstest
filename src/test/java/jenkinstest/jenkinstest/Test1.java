package jenkinstest.jenkinstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@BeforeMethod
	public void setup(){
		
	}
	
	@Test
	public void test1(){
		System.out.println("hello1"); 
	}
	
	@Test
	public void test2(){
		System.out.println("hello2"); 
		
	}
	@Test
	public void test3(){
		System.out.println("hello3"); 
		
	}
	
	@AfterMethod
	public void teardown(){
		
	}

}
