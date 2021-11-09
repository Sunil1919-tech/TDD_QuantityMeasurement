package com.bridgelabz;

/**
 * purpose- creating enum to implement the UnitMeasurement Class
 *
 */
public enum Weight implements UnitMeasurement {

    KG(1.0), TONNE(1000.0), GRAM(0.001);
    private final double baseUnitConversion;

    Weight(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    /**
     * overriding the convertToBaseUnit() method
     * @param units the weight parameter  for converting to base value
     * @return conversionValue
     */
    @Override
    public double convertToBaseUnit(QuantityMeasurementSystem units) {
        return units.value * baseUnitConversion;
    }

}
