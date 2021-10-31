package com.bridgelabz;

/**
 * purpose - Quantity measurement programming to perform different
 *           measuring operations
 *
 * @author Sunil
 * @version 12.0
 * @since 31/10/2021
 */
public class QmLengths {
    public enum Unit {FEET, INCH, YARD,CENTIMETER

    }

    private final Unit unit;
    private final double value;

    public QmLengths(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * method to convert Feet to Inch
     * @return result value
     */
    public double convertFtToInch() {
        return value * 12.0;
    }

    /**
     * Method to convert Feet to Yard
     * @return resultValue
     */
    public double convertFtToYard() {
        return value / 3;
    }

    /**
     * Method to convert Inch to Yard
     * @return resultValue
     */
    public double convertInchToYard() {
        return value / 36;
    }

    /**
     * Method to convert Yard to Inch
     * @return resultValue
     */
    public double convertYardToInch() {
        return value * 36.0;
    }

    /**
     * Method to convert Yard to Feet
     * @return resultValue
     */
    public double convertYardToFeet() {
        return value * 3.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QmLengths that = (QmLengths) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }
}
