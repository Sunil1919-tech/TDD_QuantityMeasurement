package com.bridgelabz;

import java.util.Objects;

public class Weight {

    public enum Unit {
        KG, TONNE, GRAM
    }
    private static final double KILOGRAM_TO_GRAM = 1000.0;
    private final Unit unit;
    private final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }


    public boolean compare(Weight that) {
        if (this.unit.equals(Unit.KG) && that.unit.equals(Unit.GRAM))
            return Double.compare(this.value * KILOGRAM_TO_GRAM, that.value) == 0;
        if (this.unit.equals(Unit.GRAM) && that.unit.equals(Unit.KG))
            return Double.compare(this.value, that.value * KILOGRAM_TO_GRAM) == 0;

        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }

}
