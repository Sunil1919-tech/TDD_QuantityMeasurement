package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        boolean result = feet1 == feet2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0FeetFromSameReference_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET, 0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    void givenFeetWithDiffType_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        boolean feet2 = true;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchWithDiffReference_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchAndDifferentType_ShouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 0.0);
        boolean inch1 = true;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd12Inches_WhenCompared_ShouldReturnEquals() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);

    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET, 3.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36nchAnd1Yard_WhenCompared_ShouldReturnEquals() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEquals() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEquals() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length feet = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CMand0CM_ShouldReturnEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMand1CM_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = new Length(Length.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMandNull_ShouldReturnNotEqual() {
        Length centimeter1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given2InchAnd5CM_WhenCompared_ShouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CMAnd2Inch_whenCompared_ShouldReturnEquals() {
        Length cm = new Length(Length.Unit.CENTIMETER, 5.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        boolean compareCheck = cm.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Length inch1 = new Length(Length.Unit.INCH, 2.0);
        Length inch2 = new Length(Length.Unit.INCH, 2.0);
        Length expectedSum = new Length(Length.Unit.INCH, 4.0);
        Length actualSum = inch1.sumOfLengths(inch2);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inches() {
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length expectedSum = new Length(Length.Unit.INCH, 14.0);
        Length actualSum = feet.sumOfLengths(inch);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inches() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Length expectedSum = new Length(Length.Unit.INCH, 24.0);
        Length actualSum = feet1.sumOfLengths(feet2);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given2InchAnd2point5Cm_WhenAdded_ShouldReturn3Inches() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTIMETER, 2.5);
        Length expectedSum = new Length(Length.Unit.INCH, 3.0);
        Length actualSum = inch.sumOfLengths(cm);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAndNullValue_ShouldReturnNotEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1FeetFromDiffType_ShouldReturnNotEqual() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Length feet = new Length(Length.Unit.FEET, 1.0);
        Assertions.assertNotEquals(gallon, feet);
    }

    @Test
    void given1GallonAnd1GallonFromDifReference_ShouldReturnNotEquals() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 1.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    void give0LiterAnd0Liter_ShouldReturnEquals() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 0.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    void give1LiterAnd2Liter_ShouldReturnNotEquals() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given0GallonAndNull_ShouldReturnsNotEquals() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 1.0);
        Volume liter2 = null;
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given1LiterAndDifferentType_ShouldReturnNotEqual() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 010);
        boolean liter2 = true;
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given1LiterWithSameReference_ShouldReturnTrue() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean result = liter == liter;
        Assertions.assertTrue(result);
    }

    @Test
    void givenLiterWithDiffReference_ShouldReturnFalse() {
        Volume liter1 = new Volume(Volume.Unit.LITER, 0.0);
        Volume liter2 = new Volume(Volume.Unit.LITER, 0.0);
        boolean result = liter1 == liter2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0GallonAnd0Liter_WhenCompared_ShouldReturnTrue() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Volume liter = new Volume(Volume.Unit.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0GallonAnd1Liter_WhenCompared_ShouldReturnNotEqual() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3pt78Liters_WhenCompared_ShouldReturnEquals() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3pt78LitersAnd1Gallon_WhenCompared_ShouldReturnEquals() {
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0LiterAnd0ML_WhenCompared_ShouldReturnNotEqual() {
        Volume liter = new Volume(Volume.Unit.LITER, 0.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 0.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LiterAnd1000ML_WhenCompared_ShouldReturnEqualVolume() {
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MLAnd1Litre_WhenCompared_ShouldReturnEqualVolume() {
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3point78Liter_WhenAdded_ShouldReturn7point56Liter() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume liter = new Volume(Volume.Unit.LITER, 3.78);
        Volume expectedValue = new Volume(Volume.Unit.LITER, 7.56);
        Volume actualValue = gallon.sumOfVolume(liter);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1LiterAnd1000ML_WhenAdded_ShouldReturn2Liter() {
        Volume liter =new Volume(Volume.Unit.LITER,1.0);
        Volume ml=new Volume(Volume.Unit.MILLI_LITER,1000.0);
        Volume expectedValue =new Volume(Volume.Unit.LITER,2.0);
        Volume actualValue =liter.sumOfVolume(ml);
        Assertions.assertEquals(expectedValue,actualValue);
    }
}
