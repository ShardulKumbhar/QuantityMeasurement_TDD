package com.measurement;

public class QuantityMeasurement {
	/*
	 * create a variables
	 */
	double Inch;
	double cm;

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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuantityMeasurement other = (QuantityMeasurement) obj;
		if (Double.doubleToLongBits(Inch) != Double.doubleToLongBits(other.Inch))
			return false;
		if (Double.doubleToLongBits(cm) != Double.doubleToLongBits(other.cm))
			return false;
		return true;
	}

}
