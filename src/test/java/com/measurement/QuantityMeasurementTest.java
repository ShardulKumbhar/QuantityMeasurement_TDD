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
	 * Test Case UC 1.1
	 */
	@Test
	public void givien0FeetAnd0Feet_ShouldReturnEqual() {
		/*
		 * creating object
		 */
		Double feet1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
		Double feet2 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);

		/*
		 * checking by assert Equals method
		 */
		Assert.assertEquals(feet1, feet2);

	}

	/*
	 * Checking for negative Test Case UC 1.1
	 */
	@Test
	public void givien0FeetAnd1Feet_ShouldReturnNotEqual() {
		Double feet1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
		Double feet2 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
		/*
		 * Checking by assert not Equals method
		 */
		Assert.assertNotEquals(feet1, feet2);

	}

	/*
	 * Test Case UC1.2
	 */
	@Test
	public void givenNullFeetValue_shouldReturnFalse() {
		Double feet = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);

		/*
		 * checking by assert not null
		 */
		Assert.assertNotNull(feet);

	}

	/*
	 * TestCase 1.3
	 */
	@Test
	public void givenReferenceObject_WhenSame_ShouldReturnTrue() {

		/*
		 * Comparing reference of two objects by assert method
		 */
		Assert.assertSame(quantityMeasurement, quantityMeasurement);
	}

	/*
	 * Test Case 1.4
	 */
	@Test
	public void givenObject_whenSameType_shouldReturnTrue() {
		/*
		 * Created objects of feet
		 */
		Double feet1 = quantityMeasurement.getConvertedUnit();

		/*
		 * Comparing object of same type
		 */
		Assert.assertEquals(feet1, feet1);
	}

	/*
	 * Test Case 1.5
	 */
	@Test
	public void givenTwoObectsWithSameValue_shouldReturnTrue() {
		/*
		 * Created objects of feet and set value
		 */
		Double feet1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
		Double feet2 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);

		Object var1 = feet1;
		Object var2 = feet2;
		/*
		 * Comparing both variables of same value
		 */
		Assert.assertEquals(var1, var2);
	}

	/******************* INCH ************************************/

	/**
	 * Test Case 1.6
	 */
	@Test
	public void givenOInch0Inch_shouldReturnEquals() {
		/*
		 * Created two objects of Inch
		 */
		Double value1 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
		Double value2 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
		/*
		 * Comparing two objects by assert Equals method
		 */
		Assert.assertEquals(value1, value2);
	}

	/**
	 * Test Case 1.7
	 */
	@Test
	public void givenNullInch_shouldReturnFalse() {
		/*
		 * Created a objects of Inch
		 */
		Double value1 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
		/*
		 * Comparing objects value by null if true then test case fail
		 */
		Assert.assertFalse(value1.equals(null));
	}

	/**
	 * Test Case 1.8
	 */
	@Test
	public void givenReferenceInch_shouldReturn_sameReferenceInch() {
		/*
		 * Created two objects of Inch
		 */
		Double value1 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);

		/*
		 * Comparing reference of two objects by assert method
		 */
		Assert.assertSame(value1, value1);
	}

	/*
	 * Test Case 1.9
	 */
	@Test
	public void givenInch_whenSameType_shouldReturnTrue() {
		/*
		 * Created objects of inch
		 */
		Double value1 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
		/*
		 * Comparing object of same type
		 */
		Assert.assertEquals(value1, value1);
	}

	/*
	 * 1.9 when not same
	 */
	@Test
	public void givenInch_whenNotSameType_shouldReturnFalse() {
		/*
		 * Created objects of feet and inch
		 */
		Double value1 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
		Double value2 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
		/*
		 * Comparing objects of different types
		 */
		Assert.assertNotSame(value1, value2);
	}

	/*
	 * Test Case 1.10
	 */
	@Test
	public void givenObectsWithSameValue_shouldReturnTrue() {
		/*
		 * Created objects of feet and set value
		 */
		Double value1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
		Double value2 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);

		Object var1 = value1;
		Object var2 = value2;
		/*
		 * Comparing both variables of same value
		 */
		Assert.assertEquals(value1, value1);

	}

}
