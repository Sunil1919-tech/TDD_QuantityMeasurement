package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(0.0);
        Length feet2 = new Length(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(0.0);
        Length feet2 = new Length(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        Length feet1 = new Length(1.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        Length feet1 = new Length(0.0);
        Length feet2 = new Length(0.0);
        boolean result = feet1 == feet2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0FeetFromSameReference_ShouldReturnTrue() {
        Length feet = new Length(0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    void givenFeetWithDiffType_shouldReturnNotEqual() {
        Length feet1 = new Length(0.0);
        boolean feet2 = true;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        Inch inch = new Inch(1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchWithDiffReference_ShouldReturnFalse() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchandDifferentType_ShouldReturnNotEqual() {
        Inch inch = new Inch(0.0);
        boolean inch1 = true;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        Inch inch1 = new Inch(2.0);
        Inch inch2 = new Inch(2.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1Feet_comparedTo12Inches_ShouldReturnEquals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Length feet = new Length(1.0);
        Inch result = quantityMeasurement.convertFtToInch(feet.getValue());
        Assertions.assertEquals(12.0, result.getValue());
    }
}
