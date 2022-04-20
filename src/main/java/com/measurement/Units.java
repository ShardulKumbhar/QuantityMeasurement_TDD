package com.measurement;

public enum Units {
	/*
	 * object of enum class ,Which are public ,static ,final.
	 */

	FEET(30), INCH(2.5), YARD(90),CM(1); //Cm as a base

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
