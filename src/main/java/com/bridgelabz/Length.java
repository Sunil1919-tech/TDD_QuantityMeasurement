package com.bridgelabz;

/**
 * purpose - creating enum to implement the UnitMeasurement class
 *
 * @author Sunil
 * @version 12.0
 * @since 31/10/2021
 */
public enum Length implements UnitMeasurement {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    public final double conversionValue;

    Length(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    /**
     * overriding the convertToBaseUnit() method
     * @param units the length parameter  for converting to base value
     * @return conversionValue
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem units) {
        return (units.value * conversionValue);
    }

}
