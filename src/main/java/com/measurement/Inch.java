package com.measurement;

public class Inch {
	/*
	 * Created a variable
	 */
	private double value;

	/*
	 * Created Constructor
	 */
	public Inch(double d) {
		this.value = value;
	}

	/*
	 * Equals to method to compare the equality of objects
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inch other = (Inch) obj;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}
}
