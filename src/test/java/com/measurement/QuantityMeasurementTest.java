package com.measurement;

import org.junit.Assert;
import org.junit.Test;
import com.measurment.Feet;

    /*
	 * Testing class 
	 */
public class QuantityMeasurementTest {
	/*
	 * UC1.1
	 */
	@Test
	public void givien0FeetAnd0Feet_ShouldReturnEqual() {
		/*
		 * creating object
		 */
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		/*
		 * checking by assert Equals method
		 */
		Assert.assertEquals(feet1, feet2);
	}
}
