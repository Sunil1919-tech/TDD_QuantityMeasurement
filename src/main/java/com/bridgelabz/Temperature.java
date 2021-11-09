package com.bridgelabz;

import java.util.function.Function;

/**
 * purpose- creating enum as instance variables to implement the UnitMeasurement class
 *
 * @author Sunil
 * @version 12.0
 * @since 31/10/2021
 */
public enum Temperature implements UnitMeasurement {

    CELSIUS(false), FAHRENHEIT(true);

    private final Function<Double, Double> baseUnitConversion;
    private final Function<Double, Double> FahrenheitToCelsius = (Double degreeF) -> (degreeF - 32) * 5 / 9;
    private final Function<Double, Double> Celsius = (Double degreeC) -> (degreeC);

    Temperature(boolean temp) {
        if (temp) this.baseUnitConversion = FahrenheitToCelsius;
        else this.baseUnitConversion = Celsius;
    }

    /**
     * overriding the convertToBaseUnit() method
     *
     * @param units the temperature parameter  for converting to base value
     * @return conversionValue
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem units) {

        return baseUnitConversion.apply(units.value);
    }
}
