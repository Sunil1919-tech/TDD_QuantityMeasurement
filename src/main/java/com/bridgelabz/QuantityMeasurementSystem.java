package com.bridgelabz;

/**
 * purpose- to perform the Quantity measurement operations for different units
 *
 * @author Sunil
 * @version 12.0
 * @since 31/10/2021
 */
public class QuantityMeasurementSystem {
    public double value;
    public UnitMeasurement unit;

    public QuantityMeasurementSystem(UnitMeasurement unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * method to compare the units/different lengths
     * @param that parameter which is taking as unit
     * @return compared value
     */
    public boolean compare(QuantityMeasurementSystem that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    /**
     * a method to perform Addition operation of different units
     * @param that parameter which is taking as unit
     * @param requiredUnit constant enum value
     * @return addition output
     */
    public QuantityMeasurementSystem addition(QuantityMeasurementSystem that, UnitMeasurement requiredUnit) {
        double sumOfInput = this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
        return new QuantityMeasurementSystem(requiredUnit, sumOfInput);
    }

    /**
     * overriding the equals() method to check the equality of reference objects
     * @param o parameter
     * @return value that checked by two objects
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurementSystem quantity = (QuantityMeasurementSystem) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }
}
