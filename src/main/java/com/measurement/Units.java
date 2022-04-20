package com.measurement;

public enum Units {
	/*
	 * object of enum class ,Which are public ,static ,final.
	 */

	INCH(2.5), CM(1);

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
