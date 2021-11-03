package com.bridgelabz;

public class Temperature {
    public enum Unit {FAHRENHEIT}

    private final Unit unit;
    private final double temperature;

    public Temperature(Unit unit, double temperature) {
        this.unit = unit;
        this.temperature = temperature;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.temperature, temperature) == 0 && unit == that.unit;
    }
}
