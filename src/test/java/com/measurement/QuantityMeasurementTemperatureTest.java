package com.measurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * Testing class 
 */
public class QuantityMeasurementTemperatureTest {

	public QuantityMeasurement quantityMeasurement;

	/*
	 * Creating object of class to run as setup
	 */
	@Before
	public void setup() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/*******************************************************
	 * UC 8 Temperature
	 *******************************************************/

	/*
	 * Test case 0f!=0c
	 */
	@Test
	public void given0FAnd0C_ShouldReturnNotEqual() {

		double value1 = quantityMeasurement.unitConversion(0.0, TemperatureUnit.FAHRENHEIT);
		double value2 = quantityMeasurement.unitConversion(0.0, TemperatureUnit.CELSIOUS);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/*
	 * Test case 212Farenheit=100Celsicus
	 */
	@Test
	public void given212FAnd100C_ShouldReturnEqual() {

		double value1 = quantityMeasurement.unitConversion(212.0, TemperatureUnit.FAHRENHEIT);
		double value2 = quantityMeasurement.unitConversion(100.0, TemperatureUnit.CELSIOUS);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2, 0.0);
	}
}
