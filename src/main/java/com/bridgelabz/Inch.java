package com.bridgelabz;

public class Inch {
    private final double value;

    public Inch(double value) {
        this.value = value;
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

    //getValue method
    public double getValue() {
        return value;
    }
}
