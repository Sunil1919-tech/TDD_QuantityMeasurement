package com.bridgelabz;

/**
 * purpose - Quantity measurement programming to perform different
 * measuring operations
 *
 * @author Sunil
 * @version 12.0
 * @since 31/10/2021
 */
public class Length {
    public enum Unit {
        FEET, INCH, YARD, CENTIMETER
    }

    private static final double YARD_TO_FEET = 3.0;
    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_INCH = 36.0;
    private static final double INCH_TO_CM = 2.5;
    private final Unit unit;
    private final double value;
    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Method to compare the Lengths
     * @param that
     * @return actualValue
     */
    public boolean compare(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value * FEET_TO_INCH) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_FEET) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value, that.value * YARD_TO_INCH) == 0;
        if (this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH, that.value) == 0;
        if (this.unit.equals(Unit.CENTIMETER) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.CENTIMETER))
            return Double.compare(this.value * INCH_TO_CM, that.value) == 0;
        if (this.unit.equals(Unit.CENTIMETER) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value, that.value * INCH_TO_CM) == 0;
        return false;
    }

    /**
     * equals method to compare the object values with different references
     * @param o
     * @return true
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(that.value, value) == 0 && unit == that.unit;
    }
}
