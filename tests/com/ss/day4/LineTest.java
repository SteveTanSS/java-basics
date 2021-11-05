package com.ss.day4;
import static org.junit.Assert.*;
import org.junit.Test;


public class LineTest {
	

	Line linetest = new Line();
	
	@SuppressWarnings("deprecation")
	@Test
	public void slopeTest(){
		
		assertEquals(linetest.getSlope(1,3),3, .0001);
		
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void distanceTest(){
		
		assertEquals(linetest.getDistance(1,0,5,0),4, .0001);//1,0,5,0 expect 4
		
	}
	@Test
	public void parrallelTest() {
		
		assertEquals(linetest.parrallelTo(4,2,6,3), true);// 4,2, 6,3 expect true
		assertEquals(linetest.parrallelTo(2,5,7,9), false);// 2, 5, 7,9 expect false
	}
}
