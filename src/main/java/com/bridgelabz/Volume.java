package com.bridgelabz;

import java.util.Objects;

public class Volume {
    private final Unit unit;
    private final double value;
    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }

    public enum Unit {GALLON,LITER}

}
