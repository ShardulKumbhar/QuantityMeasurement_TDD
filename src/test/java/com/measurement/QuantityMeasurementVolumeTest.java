package com.measurement;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementVolumeTest {

	public QuantityMeasurement quantityMeasurement;

	/*
	 * Creating object of class to run as setup
	 */
	@Before
	public void setup() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/**************************************************
	 * UC -5 Volume
	 **************************************************/
	/*
	 * Test case 1.28 1gallon=3.78liters
	 */
	@Test
	public void given1gallonAnd378_ShouldReturnEqual() {

		double value1 = quantityMeasurement.unitConversion(1.0, Volume.GALLON);
		double value2 = quantityMeasurement.unitConversion(3.78, Volume.LITRES);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2,0.0);
	}

	/*
	 * Test case 1.29 1gallon=3.78lt
	 */
	@Test
	public void given1literAnd1000ml_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitConversion(1.0, Volume.LITRES);
		Double value2 = quantityMeasurement.unitConversion(1000.0, Volume.ml);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*********************************************
	 * UC6 Volume Addition
	 ********************************************/
	/*
	 * Test case 1.30 1gallon+3.78litres=7.56litters
	 */
	@Test
	public void given1and378litersgives757liters_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitAddition(1.0, Volume.GALLON, 3.78, Volume.LITRES);
		Double value2 = quantityMeasurement.unitConversion(7.56, Volume.LITRES);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}

	/*
	 * Test case 1.31 1gallon+3.78litres=7.56litters
	 */
	@Test
	public void given1litres1000mlgives2liters_ShouldReturnEqual() {

		Double value1 = quantityMeasurement.unitAddition(1.0, Volume.LITRES, 1000.0, Volume.ml);
		Double value2 = quantityMeasurement.unitConversion(2.0, Volume.LITRES);

		/*
		 * Checking by assert not Equals
		 */
		Assert.assertEquals(value1, value2);
	}
}
