package com.bridgelabz;

public class UnitMeasurementSystem {
    public double value;
    public UnitMeasurement unit;

    public UnitMeasurementSystem(UnitMeasurement unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(UnitMeasurementSystem that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    public UnitMeasurementSystem addition(UnitMeasurementSystem that, UnitMeasurement requiredUnit) {
        double sumOfInput = this.unit.convertToBaseUnit(this) + that.unit.convertToBaseUnit(that);
        return new UnitMeasurementSystem(requiredUnit, sumOfInput);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem quantity = (UnitMeasurementSystem) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }
}
