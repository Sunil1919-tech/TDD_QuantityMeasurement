package com.bridgelabz;

public class QuantityMeasurement {

    public Inch convertFtToInch(double feetValue) {

        return new Inch(feetValue * 12.0);
    }

    public Yard convertFtToYard(double feet) {
        return new Yard(feet * 0.33);
    }

    public Yard convertInchToYard(double inch) {
        return new Yard(inch * 0.0277);
    }
}
