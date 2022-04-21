package com.measurement;

public enum WeightUnits implements Units {
	GRAM(1), KG(1000), TONNE(1000 * 1000);

	public double unit;

	WeightUnits(double units) {
		this.unit = units;
	}

	/*
	 * Overiding
	 */
	public double unitConversion(double value) {
		return value * unit;
	}
}
