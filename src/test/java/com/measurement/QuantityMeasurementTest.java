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

	/*
	 * Test case 1.15 - 1inch !=1yard
	 */
	@Test
	public void given1InchAnd1YardValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.INCH);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertNotEquals(value1, value2);
	}

	/*
	 * Test case 1.16 1yard = 36 inch
	 */
	@Test
	public void given1YardAnd36InchValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Double value2 = quantityMeasurement.getConvertedUnit(36.0, Units.INCH);
		/*
		 * Checking by assert Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.17 - 36inch = 1yard
	 */
	@Test
	public void given36InchAnd1YardValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(36.0, Units.INCH);
		Double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		/*
		 * Checking by assert Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.18 -1yard=3feet
	 */
	@Test
	public void giveniYardAnd3FeetValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
		Double value2 = quantityMeasurement.getConvertedUnit(3.0, Units.FEET);
		/*
		 * Checking by assert Equals
		 */
		Assert.assertEquals(value1, value2);
	}
}
