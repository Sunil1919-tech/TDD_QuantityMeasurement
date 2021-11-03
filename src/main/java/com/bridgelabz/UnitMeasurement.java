package com.bridgelabz;

public interface UnitMeasurement {
    double convertToBaseUnit(UnitMeasurementSystem units);

    boolean supportAddition();
}
