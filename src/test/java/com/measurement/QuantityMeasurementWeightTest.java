package com.measurement;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementWeightTest {

	public QuantityMeasurement quantityMeasurement;

	/*
	 * Creating object of class to run as setup
	 */
	@Before
	public void setup() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/*******************************************************
	 * UC 7 Comparing Weights
	 *******************************************************/

	/*
	 * Test case 1.32 1kg =1000grams
	 */
	@Test
	public void given1kgand1000grams_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(1.0, WeightUnits.KG);
		Double value2 = quantityMeasurement.unitConversion(1000.0, WeightUnits.GRAM);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.33 1kg =1000grams
	 */
	@Test
	public void given1tonneand1000kgs_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(1.0, WeightUnits.TONNE);
		Double value2 = quantityMeasurement.unitConversion(1000.0, WeightUnits.KG);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	@Test
	public void given1tonneand1000gmgives1001kg_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitAddition(1.0, WeightUnits.TONNE, 1000.0, WeightUnits.GRAM);
		Double value2 = quantityMeasurement.unitConversion(1001.0, WeightUnits.KG);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

}
