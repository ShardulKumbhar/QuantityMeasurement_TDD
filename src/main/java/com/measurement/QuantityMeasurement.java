package com.measurement;

public class QuantityMeasurement {

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	/*
	 * Created Method To Compare Values and Unit
	 */
	public double unitConversion(double value, Units units) {
		return units.unitConversion(value);
	}

	/*
	 * Created Method Ton Add To Unit values
	 */
	public double unitAddition(double value1, Units unit1, double value2, Units unit2) {
		return unit1.unitConversion(value1) + unit2.unitConversion(value2);
	}

	public Double unitConversion() {

		return null;
	}

}
