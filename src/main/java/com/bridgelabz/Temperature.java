package com.bridgelabz;

public class Temperature {

    public enum Unit {CELSIUS, FAHRENHEIT}

    private final Unit unit;
    private final double temperature;

    public Temperature(Unit unit, double temperature) {
        this.unit = unit;
        this.temperature = temperature;
    }

    public boolean compare(Temperature that) {
        if (this.unit.equals(Unit.FAHRENHEIT) && that.unit.equals(Unit.CELSIUS))
            return Double.compare((this.temperature - 32) * 5 / 9, that.temperature) == 0;
        if (this.unit.equals(Unit.CELSIUS) && that.unit.equals(Unit.FAHRENHEIT))
            return Double.compare((this.temperature * 9 / 5) + 32, that.temperature) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.temperature, temperature) == 0 && unit == that.unit;
    }
}
