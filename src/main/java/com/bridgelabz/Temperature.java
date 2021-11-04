package com.bridgelabz;

import java.util.function.Function;

/**
 * purpose- creating enum to implement the UnitMeasurement class
 */
public enum Temperature implements UnitMeasurement {

    CELSIUS(false), FAHRENHEIT(true);

    private final Function<Double, Double> baseUnitConversion;
    private final Function<Double, Double> FahrenheitToCelsius = (Double degreeF) -> (degreeF - 32) * 5 / 9;
    private final Function<Double, Double> CelsiusToFahrenheit = (Double degreeC) -> degreeC;

    Temperature(boolean temp) {
        if (temp) this.baseUnitConversion = FahrenheitToCelsius;
        else this.baseUnitConversion = CelsiusToFahrenheit;
    }

    /**
     * overriding the convertToBaseUnit() method
     * @param units the temperature parameter  for converting to base value
     * @return conversionValue
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem units) {
        return baseUnitConversion.apply(units.value);
    }
}
