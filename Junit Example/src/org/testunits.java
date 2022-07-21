package org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testunits {
	@Test
	public void checkFindBig()
	{
		assertEquals(20,Calculator.findBig(10, 20));
	}
	
	public class testunits1 {
		@Test
		public void checkFindBig1()
		{
			assertEquals(50,Calculator.findBiggest(10, 50,30));
		}
	}
}
