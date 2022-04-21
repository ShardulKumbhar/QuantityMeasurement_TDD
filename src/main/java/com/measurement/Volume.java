package com.measurement;

public enum Volume {
	/*
	 * object of enum class ,Which are public ,static ,final.
	 */
	GALLON(3.78 * 1000), LITERS(1000), ml(1);

	/*
	 * creatd varibale to manipulate
	 */
	public double units;

	/*
	 * created Constructor to check for values
	 */
	Volume(double units) {

		this.units = units;
	}
}
