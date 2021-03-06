package com.measurement;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementLengthTest {

	public QuantityMeasurement quantityMeasurement;

	/*
	 * Creating object of class to run as setup
	 */
	@Before
	public void setup() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/**************************************************************
	 * FEET to FEET
	 ***************************************************************/

	/*
	 * Test Case UC 1.1
	 */
	@Test
	public void givien0FeetAnd0Feet_ShouldReturnEqual() {
		/*
		 * creating object
		 */
		Double feet1 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);
		Double feet2 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);

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
		Double feet1 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);
		Double feet2 = quantityMeasurement.unitConversion(1.0, LengthUnits.FEET);
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
		Double feet = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);

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
		Double feet1 = quantityMeasurement.unitConversion();

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
		Double feet1 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);
		Double feet2 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);

		Object var1 = feet1;
		Object var2 = feet2;
		/*
		 * Comparing both variables of same value
		 */
		Assert.assertEquals(var1, var2);
	}

	/*************************************************************************************
	 * INCH to INCH
	 *************************************************************************************/

	/**
	 * Test Case 1.6
	 */
	@Test
	public void givenOInch0Inch_shouldReturnEquals() {
		/*
		 * Created two objects of Inch
		 */
		Double value1 = quantityMeasurement.unitConversion(0.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(0.0, LengthUnits.INCH);
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
		Double value1 = quantityMeasurement.unitConversion(0.0, LengthUnits.INCH);
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
		Double value1 = quantityMeasurement.unitConversion(0.0, LengthUnits.INCH);

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
		Double value1 = quantityMeasurement.unitConversion(0.0, LengthUnits.INCH);
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
		Double value1 = quantityMeasurement.unitConversion(0.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);
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
		Double value1 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);
		Double value2 = quantityMeasurement.unitConversion(0.0, LengthUnits.FEET);

		Object var1 = value1;
		Object var2 = value2;
		/*
		 * Comparing both variables of same value
		 */
		Assert.assertEquals(value1, value1);

	}

	/***************************************************************************
	 * FEET to Yard
	 *******************************************************************************/

	/*
	 * Test case 1.13 - 3feet =1yard
	 */
	@Test
	public void given3FeetAnd1YardValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(3.0, LengthUnits.FEET);
		Double value2 = quantityMeasurement.unitConversion(1.0, LengthUnits.YARD);
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.14 - 1feet != 1yards
	 */
	@Test
	public void given1FeetAnd1YardValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.unitConversion(1.0, LengthUnits.FEET);
		Double value2 = quantityMeasurement.unitConversion(1.0, LengthUnits.YARD);
		Assert.assertNotEquals(value1, value2);
	}

	/*
	 * Test case 1.15 - 1inch !=1yard
	 */
	@Test
	public void given1InchAnd1YardValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.unitConversion(1.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(1.0, LengthUnits.YARD);
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

		Double value1 = quantityMeasurement.unitConversion(1.0, LengthUnits.YARD);
		Double value2 = quantityMeasurement.unitConversion(36.0, LengthUnits.INCH);
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

		Double value1 = quantityMeasurement.unitConversion(36.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(1.0, LengthUnits.YARD);
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

		Double value1 = quantityMeasurement.unitConversion(1.0, LengthUnits.YARD);
		Double value2 = quantityMeasurement.unitConversion(3.0, LengthUnits.FEET);
		/*
		 * Checking by assert Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*********************************************************
	 * INCH to CM
	 ***********************************************************/
	/*
	 * Test case 1.19 - 2Inch =5cm
	 */
	@Test
	public void given2inchAnd5cmValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(2.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(5.0, LengthUnits.CM);
		/*
		 * Checking by assert Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.20 - 1Inch !=1cm
	 */
	@Test
	public void given1inchAnd1cmValue_ShouldReturnNotEqual() {

		Double value1 = quantityMeasurement.unitConversion(1.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(1.0, LengthUnits.CM);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertNotEquals(value1, value2);
	}

	/*
	 * Test case 1.21 - 5cm=2inch
	 */
	@Test
	public void given5cmAnd2inchValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(5.0, LengthUnits.CM);
		Double value2 = quantityMeasurement.unitConversion(2.0, LengthUnits.INCH);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.22 - 30cm=1feet
	 */
	@Test
	public void given30cmAnd1feetValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(30.0, LengthUnits.CM);
		Double value2 = quantityMeasurement.unitConversion(1.0, LengthUnits.FEET);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.23 - 90cm=1yard
	 */
	@Test
	public void given90cmAnd1yardValue_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(90.0, LengthUnits.CM);
		Double value2 = quantityMeasurement.unitConversion(1.0, LengthUnits.YARD);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/***********************************************
	 * ADDITION
	 **********************************************/
	/*
	 * Test case 1.24 1in+1in=4in
	 */
	@Test
	public void given1inAnd1inEquals4in_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitAddition(2.0, LengthUnits.INCH, 2.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(4.0, LengthUnits.INCH);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.25 1ft+2in=24in
	 */
	@Test
	public void given1FeetAnd2inEquals24in_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitAddition(1.0, LengthUnits.FEET, 2.0, LengthUnits.INCH);
		Double value2 = quantityMeasurement.unitConversion(14.0, LengthUnits.INCH);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.26 1ft+1ft=24in
	 */
	@Test
	public void given1FeetAnd1FeetEquals24in_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitAddition(1.0, LengthUnits.FEET, 1.0, LengthUnits.FEET);
		Double value2 = quantityMeasurement.unitConversion(24.0, LengthUnits.INCH);
		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.27 2in +2.5cm =3in
	 */
	@Test
	public void given2InchAnd2_5CmEquals3in_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitAddition(2.0, LengthUnits.INCH, 2.5, LengthUnits.CM);
		Double value2 = quantityMeasurement.unitConversion(3.0, LengthUnits.INCH);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

}
