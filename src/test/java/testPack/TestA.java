package testPack;

import org.testng.annotations.Test;

public class TestA {
	
	@Test
	public void test_a() throws InterruptedException{
		System.out.println("Test A");
		Thread.sleep(5000);
	}
	
	@Test
	public void test_a1(){
		System.out.println("Test 1 AA");
	}

}
