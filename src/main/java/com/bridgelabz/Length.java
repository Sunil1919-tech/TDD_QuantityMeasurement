package com.bridgelabz;

/**
 * purpose - Quantity measurement programming to perform different
 * measuring operations of UnitMeasurementSystems
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


    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return (units.value * conversionValue);
    }

    public boolean supportAddition() {
        return true;
    }
}
