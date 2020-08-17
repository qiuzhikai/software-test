import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();
	
	@Test
	public void testAdd(){
		calculator.clear();
		calculator.add(3);
		calculator.add(4);
		assertEquals(7, calculator.getReuslt());
	}

	@Test
	public void testMultiply() {
		calculator.clear();
		calculator.square(3);
		assertEquals(9, calculator.getReuslt());
	}

//	@Test
//	public void testDivide() {
//		fail("尚未实现");
//	}
//
//	@Test
//	public void testSquare() {
//		fail("尚未实现");
//	}

}
