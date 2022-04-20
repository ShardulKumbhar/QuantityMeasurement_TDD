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
	 * Test case 1.13 - 3feet =1yard
	 */
	@Test
	public void given3FeetAnd1YardValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(3.0, Units.FEET);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Assert.assertEquals(value1, value2);
	}
	
	/*
	 * Test case 1.14 - 1feet != 1yards
	 */
	@Test
	public void given1FeetAnd1YardValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Assert.assertNotEquals(value1, value2);
	}

}
