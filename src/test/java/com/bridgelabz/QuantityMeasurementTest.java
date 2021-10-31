package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        QmLengths feet1 = new QmLengths(QmLengths.Unit.FEET, 0.0);
        QmLengths feet2 = new QmLengths(QmLengths.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QmLengths feet1 = new QmLengths(QmLengths.Unit.FEET, 0.0);
        QmLengths feet2 = new QmLengths(QmLengths.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        QmLengths feet1 = new QmLengths(QmLengths.Unit.FEET, 1.0);
        QmLengths feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        QmLengths feet1 = new QmLengths(QmLengths.Unit.FEET, 0.0);
        QmLengths feet2 = new QmLengths(QmLengths.Unit.FEET, 0.0);
        boolean result = feet1 == feet2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0FeetFromSameReference_ShouldReturnTrue() {
        QmLengths feet = new QmLengths(QmLengths.Unit.FEET, 0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    void givenFeetWithDiffType_shouldReturnNotEqual() {
        QmLengths feet1 = new QmLengths(QmLengths.Unit.FEET, 0.0);
        boolean feet2 = true;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        QmLengths inch1 = new QmLengths(QmLengths.Unit.INCH, 0.0);
        QmLengths inch2 = new QmLengths(QmLengths.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEqual() {
        QmLengths inch1 = new QmLengths(QmLengths.Unit.INCH, 0.0);
        QmLengths inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        QmLengths inch = new QmLengths(QmLengths.Unit.INCH, 1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchWithDiffReference_ShouldReturnFalse() {
        QmLengths inch1 = new QmLengths(QmLengths.Unit.INCH, 0.0);
        QmLengths inch2 = new QmLengths(QmLengths.Unit.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchAndDifferentType_ShouldReturnNotEqual() {
        QmLengths inch = new QmLengths(QmLengths.Unit.INCH, 0.0);
        boolean inch1 = true;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        QmLengths inch1 = new QmLengths(QmLengths.Unit.INCH, 2.0);
        QmLengths inch2 = new QmLengths(QmLengths.Unit.INCH, 2.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1Feet_comparedTo12Inches_ShouldReturnEquals() {
        QmLengths feet = new QmLengths(QmLengths.Unit.FEET, 1.0);
        double result = feet.convertFtToInch();
        Assertions.assertEquals(12.0, result);
    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        QmLengths yard1 = new QmLengths(QmLengths.Unit.YARD, 0.0);
        QmLengths yard2 = new QmLengths(QmLengths.Unit.YARD, 0.0);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        QmLengths feet = new QmLengths(QmLengths.Unit.FEET, 3.0);
        double result = feet.convertFtToYard();
        Assertions.assertEquals(1.0, result);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        QmLengths feet = new QmLengths(QmLengths.Unit.FEET, 1.0);
        double result = feet.convertFtToYard();
        Assertions.assertNotEquals(1.0, result);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        QmLengths inch = new QmLengths(QmLengths.Unit.INCH, 1.0);
        double result = inch.convertInchToYard();
        Assertions.assertNotEquals(1.0, result);
    }

    @Test
    void given36nchAnd1Yard_WhenCompared_ShouldReturnEquals() {
        QmLengths inch = new QmLengths(QmLengths.Unit.INCH, 36.0);
        double result = inch.convertInchToYard();
        Assertions.assertEquals(1.0, result);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEquals() {
        QmLengths yard = new QmLengths(QmLengths.Unit.YARD, 1.0);
        double result = yard.convertYardToInch();
        Assertions.assertEquals(36.0, result);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEquals() {
        QmLengths yard = new QmLengths(QmLengths.Unit.YARD, 1.0);
        double result = yard.convertYardToFeet();
        Assertions.assertEquals(3.0, result);
    }

    @Test
    void given0CMand0CM_ShouldReturnEqual() {
        QmLengths centimeter1 = new QmLengths(QmLengths.Unit.CENTIMETER, 0.0);
        QmLengths centimeter2 = new QmLengths(QmLengths.Unit.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMand1CM_ShouldReturnNotEqual() {
        QmLengths centimeter1 = new QmLengths(QmLengths.Unit.CENTIMETER, 0.0);
        QmLengths centimeter2 = new QmLengths(QmLengths.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMandNull_ShouldReturnNotEqual() {
        QmLengths centimeter1 = new QmLengths(QmLengths.Unit.CENTIMETER, 0.0);
        QmLengths centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }
}
