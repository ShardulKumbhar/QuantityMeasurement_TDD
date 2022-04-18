package com.measurement;

import org.junit.Assert;
import org.junit.Test;
import com.measurment.Feet;

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
}
