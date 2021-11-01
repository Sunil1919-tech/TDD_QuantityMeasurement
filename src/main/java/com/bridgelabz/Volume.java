package com.bridgelabz;

/**
 * purpose - Quantity measurement programming to perform different Volume
 * measuring operations
 *
 * @author Sunil
 * @version 12.0
 * @since 01/10/2021
 */
public class Volume {
    public enum Unit {GALLON, LITER, MILLI_LITER
    }
    private static final double GALLON_TO_LITER = 3.78;
    private static final double LITER_TO_ML = 1000.0;
    private final Unit unit;
    private final double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Method to Implement comparing operation to check equality
     * @param that
     * @return actualValue
     */
    public boolean compare(Volume that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITER))
            return Double.compare(this.value * GALLON_TO_LITER, that.value) == 0;
        if (this.unit.equals(Unit.LITER) && that.unit.equals(Unit.GALLON))
            return Double.compare(this.value, that.value * GALLON_TO_LITER) == 0;
        if (this.unit.equals(Unit.MILLI_LITER) && that.unit.equals(Unit.MILLI_LITER))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.LITER) && that.unit.equals(Unit.MILLI_LITER))
            return Double.compare(this.value * LITER_TO_ML, that.value) == 0;
        if (this.unit.equals(Unit.MILLI_LITER) && that.unit.equals(Unit.LITER))
            return Double.compare(this.value, that.value * LITER_TO_ML) == 0;
        return false;
    }

    /**
     * Equals method to compare the Volume Units
     * @param o
     * @return true
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }




}
