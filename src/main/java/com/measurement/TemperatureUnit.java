package com.measurement;

import java.util.function.Function;

public enum TemperatureUnit implements Units {

	CELSIOUS(false), FAHRENHEIT(true);

	final Function<Double, Double> degFToCelcius = new Function<Double, Double>() {
		public Double apply(Double degF) {
			return ((degF.doubleValue() - 32) * 5 / 9);
		}
	};

	final Function<Double, Double> degCToCelcius = new Function<Double, Double>() {
		public Double apply(Double degC) {
			return degC.doubleValue();
		}
	};
	private final Function<Double, Double> conversion_value;

	TemperatureUnit(boolean isFahrenheit) {
		if (isFahrenheit) {
			this.conversion_value = degFToCelcius;
		} else {
			this.conversion_value = degCToCelcius;
		}
	}

	public double unitConversion(double value) {
		return conversion_value.apply(value);
	}

}
