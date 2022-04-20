package com.measurement;

public enum Units {
	/*
	 * object of enum class ,Which are public ,static ,final.
	 */

	FEET(12.0), INCH(1), YARD(36);

	/*
	 * creatd varibale to manipulate
	 */
	public double unitType;

	/*
	 * created Constructor to check for values
	 */
	Units(double unit) {
		this.unitType = unit;
	}
}
