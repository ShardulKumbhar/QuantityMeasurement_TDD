package com.measurement;

import org.junit.Assert;
import org.junit.Test;

/*
 * Testing class 
 */
public class QuantityMeasurementTest {
	/*
	 * Test Case UC 1.1
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

	/*
	 * Checking for negative Test Case UC 1.1
	 */
	@Test
	public void givien0FeetAnd1Feet_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
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
		Feet feet = new Feet(0.0);

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
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		/*
		 * Comparing reference of two objects by assert method
		 */
		Assert.assertSame(feet1, feet1);
	}

	/*
	 * Test Case 1.4
	 */
	@Test
	public void givenObject_whenSameType_shouldReturnTrue() {
		/*
		 * Created objects of feet
		 */
		Feet feet1 = new Feet();
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
		Feet feet1 = new Feet();
		feet1.setValue(3);
		Feet feet2 = new Feet();
		feet2.setValue(3);
		/*
		 * Initializing values in two variable
		 */
		double var1 = feet1.getValue();
		double var2 = feet2.getValue();
		/*
		 * Comparing both variables of same value
		 */
		Assert.assertEquals(var1, var2, 0);
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
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		/*
		 * Comparing two objects by assert Equals method
		 */
		Assert.assertEquals(inch1, inch2);
	}

	/**
	 * Test Case 1.7
	 */
	@Test
	public void givenNullInch_shouldReturnFalse() {
		/*
		 * Created a objects of Inch
		 */
		Inch inch1 = new Inch(0.0);
		/*
		 * Comparing objects value by null if true then test case fail
		 */
		Assert.assertFalse(inch1.equals(null));
	}
}
