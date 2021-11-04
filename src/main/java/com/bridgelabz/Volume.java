package com.bridgelabz;

/**
 * purpose - creating enum to implement UnitMeasurement class
 *
 * @author Sunil
 * @version 12.0
 * @since 01/10/2021
 */
public enum Volume implements UnitMeasurement {

    GALLON(3.78), LITER(1.0), MILLI_LITER(0.001);

    private final double conversionValue;

    Volume(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    /**
     * overriding the convertToBaseUnit() method
     * @param units the volume parameter for converting to base value
     * @return conversionValue
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem units) {
        return units.value * conversionValue;
    }

}
