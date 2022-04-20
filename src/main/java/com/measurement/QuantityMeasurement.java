package com.measurement;

public class QuantityMeasurement {
	/*
	 * create a variables
	 */
	double feet;
	double inch;

	/*
	 * created a method to check converstion by passing feet and inch
	 */
	public double getConvertedUnit(double value, Units unitType) {
		return value * unitType.unitType;
	}

	/*
	 * Equals method to compare the equality of objects
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		QuantityMeasurement that = (QuantityMeasurement) o;
		return Double.compare(that.feet, feet) == 0 && Double.compare(that.inch, inch) == 0;
	}

	public Double getConvertedUnit() {
		// TODO Auto-generated method stub
		return null;
	}

}
