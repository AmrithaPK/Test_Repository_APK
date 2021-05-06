package myFirstMaven;

import org.testng.annotations.*;

public class Sample2Test 
{
	@Test
	public void printCode()
	{
		System.out.println("Sample 2 code print success");
	}
	@Test
	public void sampleMath()
	{
		int a=10;
		int b=5;
		int c= a+b;
		System.out.println("Sample 2 math success. Product is : "+c);
	}
		public void sampleDiv()
	{
		int a=10;
		int b=5;
		int c= a/b;
		System.out.println("Sample 2 Div success. Result is : "+c);
	}
}
