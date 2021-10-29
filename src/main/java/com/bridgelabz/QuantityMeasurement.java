package com.bridgelabz;

public class QuantityMeasurement {

    public Inch convertFtToInch(double feet) {
        return new Inch(feet * 12.0);
    }
}
