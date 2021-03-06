package com.measurement;

public enum Volume implements Units {
	/*
	 * object of enum class ,Which are public ,static ,final.
	 */
	GALLON(3.78 * 1000), LITRES(1000), ml(1),;

	/*
	 * creatd varibale to manipulate
	 */
	public double unit;

	/*
	 * created Constructor to check for values
	 */
	Volume(double units) {

		this.unit = units;
	}

	/*
	 * overide
	 */
	public double unitConversion(double value) {
		
		return unit*value;
	}

	
}
