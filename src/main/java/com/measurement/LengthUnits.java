package com.measurement;

public enum LengthUnits implements Units {
	/*
	 * object of enum class ,Which are public ,static ,final.
	 */

	FEET(30), INCH(2.5), YARD(90), CM(1); // Cm as a base

	/*
	 * creatd varibale to manipulate
	 */
	public double unit;

	/*
	 * created Constructor to check for values
	 */
	LengthUnits(double units) {

		this.unit = units;
	}

	/*
	 * Overideing from superclass
	 */
	public double unitConversion(double value) {
		return unit * value;
	}
}
