package com.measurement;

public class QuantityMeasurement {
	/*
	 * create a variables
	 */
	double value;
	double unit;
	double unit1;

	/*
	 * created a method to check converstion by passing feet and inch
	 */
	public double getConvertedUnit(double value, Units unitType) {
		return value * unitType.unitType;
	}

	public Double getConvertedUnit() {

		return null;
	}

	/*
	 * Equals method to compare the equality of objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuantityMeasurement other = (QuantityMeasurement) obj;
		if (Double.doubleToLongBits(unit) != Double.doubleToLongBits(other.unit))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

	/*
	 * created method to do addition in inches
	 */
	public Double unitAddition(double value, Units unitType, double value1, Units unit1) {

		return value * unitType.unitType + value1 * unit1.unitType;
	}

	/*
	 * created method to convert in volume
	 */
	public Double convertVolume(Double value, Volume unitvolume) {

		return value * unitvolume.units;
	}

}
