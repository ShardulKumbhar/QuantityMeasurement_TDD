package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * Testing class 
 */
public class QuantityMeasurementTest {
	public QuantityMeasurement quantityMeasurement;

	/*
	 * Creating object of class to run as setup
	 */
	@Before
	public void setup() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/*
	 * Test case 1.19 - 2Inch =5cm
	 */
	@Test
	public void given2inchAnd5cmValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(2.0, Units.INCH);
		Double value2 = quantityMeasurement.getConvertedUnit(5.0, Units.CM);
		Assert.assertEquals(value1, value2);
	}

}
