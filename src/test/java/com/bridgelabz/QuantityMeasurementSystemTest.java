package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementSystemTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        boolean result = feet1 == feet2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0FeetFromSameReference_ShouldReturnTrue() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    void givenFeetWithDiffType_shouldReturnNotEqual() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 0.0);
        boolean feet2 = true;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchWithDiffReference_ShouldReturnFalse() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchAndDifferentType_ShouldReturnNotEqual() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 0.0);
        boolean inch1 = true;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd12Inches_WhenCompared_ShouldReturnEquals() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);

    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        QuantityMeasurementSystem yard1 = new QuantityMeasurementSystem(Length.YARD, 0.0);
        QuantityMeasurementSystem yard2 = new QuantityMeasurementSystem(Length.YARD, 0.0);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 1.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36nchAnd1Yard_WhenCompared_ShouldReturnEquals() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEquals() {
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEquals() {
        QuantityMeasurementSystem yard = new QuantityMeasurementSystem(Length.YARD, 1.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CMand0CM_ShouldReturnEqual() {
        QuantityMeasurementSystem centimeter1 = new QuantityMeasurementSystem(Length.CENTIMETER, 0.0);
        QuantityMeasurementSystem centimeter2 = new QuantityMeasurementSystem(Length.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMand1CM_ShouldReturnNotEqual() {
        QuantityMeasurementSystem centimeter1 = new QuantityMeasurementSystem(Length.CENTIMETER, 0.0);
        QuantityMeasurementSystem centimeter2 = new QuantityMeasurementSystem(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMandNull_ShouldReturnNotEqual() {
        QuantityMeasurementSystem centimeter1 = new QuantityMeasurementSystem(Length.CENTIMETER, 0.0);
        QuantityMeasurementSystem centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given2InchAnd5CM_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CMAnd2Inch_whenCompared_ShouldReturnEquals() {
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTIMETER, 5.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        boolean compareCheck = cm.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurementSystem inch1 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem inch2 = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 4.0);
        QuantityMeasurementSystem actualSum = inch1.addition(inch2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inches() {
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 14.0);
        QuantityMeasurementSystem actualSum = feet.addition(inch, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inches() {
        QuantityMeasurementSystem feet1 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem feet2 = new QuantityMeasurementSystem(Length.FEET, 1.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 24.0);
        QuantityMeasurementSystem actualSum = feet1.addition(feet2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given2InchAnd2point5Cm_WhenAdded_ShouldReturn3Inches() {
        QuantityMeasurementSystem inch = new QuantityMeasurementSystem(Length.INCH, 2.0);
        QuantityMeasurementSystem cm = new QuantityMeasurementSystem(Length.CENTIMETER, 2.5);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Length.INCH, 3.0);
        QuantityMeasurementSystem actualSum = inch.addition(cm, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void given0GallonAnd0Gallon_ShouldReturnEqual() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAndNullValue_ShouldReturnNotEqual() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given1GallonAnd1FeetFromDiffType_ShouldReturnNotEqual() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem feet = new QuantityMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(gallon, feet);
    }

    @Test
    void given1GallonAnd1GallonFromDifReference_ShouldReturnNotEquals() {
        QuantityMeasurementSystem gallon1 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem gallon2 = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        Assertions.assertNotSame(gallon1, gallon2);
    }

    @Test
    void give0LiterAnd0Liter_ShouldReturnEquals() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        Assertions.assertEquals(liter1, liter2);
    }

    @Test
    void give1LiterAnd2Liter_ShouldReturnNotEquals() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 2.0);
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given0GallonAndNull_ShouldReturnsNotEquals() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem liter2 = null;
        Assertions.assertNotEquals(liter1, liter2);
    }

    @Test
    void given1LiterAndDifferentType_ShouldReturnNotEqual() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 010);
        boolean liter2 = true;
        Assertions.assertNotEquals(liter1, liter2);
    }


    @Test
    void givenLiterWithDiffReference_ShouldReturnFalse() {
        QuantityMeasurementSystem liter1 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        QuantityMeasurementSystem liter2 = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        boolean result = liter1 == liter2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0GallonAnd0Liter_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0GallonAnd1Liter_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3pt78Liters_WhenCompared_ShouldReturnEquals() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3pt78LitersAnd1Gallon_WhenCompared_ShouldReturnEquals() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        boolean compareCheck = gallon.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0LiterAnd0ML_WhenCompared_ShouldReturnNotEqual() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 0.0);
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 0.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LiterAnd1000ML_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        boolean compareCheck = liter.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MLAnd1Litre_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        boolean compareCheck = ml.compare(liter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3point78Liter_WhenAdded_ShouldReturn7point56Liter() {
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 1.0);
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 3.78);
        QuantityMeasurementSystem expectedValue = new QuantityMeasurementSystem(Volume.LITER, 7.56);
        QuantityMeasurementSystem actualValue = gallon.addition(liter, Volume.LITER);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1LiterAnd1000ML_WhenAdded_ShouldReturn2Liter() {
        QuantityMeasurementSystem liter = new QuantityMeasurementSystem(Volume.LITER, 1.0);
        QuantityMeasurementSystem ml = new QuantityMeasurementSystem(Volume.MILLI_LITER, 1000.0);
        QuantityMeasurementSystem expectedValue = new QuantityMeasurementSystem(Volume.LITER, 2.0);
        QuantityMeasurementSystem actualValue = liter.addition(ml, Volume.LITER);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0GramAnd0Gram_ShouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd1Gram_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = new QuantityMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNull_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem gram1 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gram2 = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertNotEquals(gram, gallon);
    }

    @Test
    void given0KgAnd0Kg_shouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kg1 = new QuantityMeasurementSystem(Weight.KG, 0.0);
        QuantityMeasurementSystem kg2 = new QuantityMeasurementSystem(Weight.KG, 0.0);
        Assertions.assertEquals(kg1, kg2);
    }

    @Test
    void given0KgAnd1Kg_shouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kg1 = new QuantityMeasurementSystem(Weight.KG, 0.0);
        QuantityMeasurementSystem kg2 = new QuantityMeasurementSystem(Weight.KG, 1.0);
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    void given0KgAndNull_shouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kg1 = new QuantityMeasurementSystem(Weight.KG, 0.0);
        QuantityMeasurementSystem kg2 = null;
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    void given0KgAnd0KgFromDiffRef_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kg1 = new QuantityMeasurementSystem(Weight.KG, 0.0);
        QuantityMeasurementSystem kg2 = new QuantityMeasurementSystem(Weight.KG, 0.0);
        Assertions.assertNotSame(kg1, kg2);
    }

    @Test
    void given0GKgAnd0GallonFromDiffType_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KG, 0.0);
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertNotEquals(kg, gallon);
    }

    @Test
    void given0TonneAnd0Tonne_shouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem tonne1 = new QuantityMeasurementSystem(Weight.TONNE, 0.0);
        QuantityMeasurementSystem tonne2 = new QuantityMeasurementSystem(Weight.TONNE, 0.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAnd1Tonne_shouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem tonne1 = new QuantityMeasurementSystem(Weight.TONNE, 0.0);
        QuantityMeasurementSystem tonne2 = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAndNull_shouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem tonne1 = new QuantityMeasurementSystem(Weight.TONNE, 0.0);
        QuantityMeasurementSystem tonne2 = null;
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAnd0TonneFromDiffRef_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem tonne1 = new QuantityMeasurementSystem(Weight.TONNE, 0.0);
        QuantityMeasurementSystem tonne2 = new QuantityMeasurementSystem(Weight.TONNE, 0.0);
        Assertions.assertNotSame(tonne1, tonne2);
    }

    @Test
    void given0TonneAnd0GallonFromDiffType_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 0.0);
        QuantityMeasurementSystem gallon = new QuantityMeasurementSystem(Volume.GALLON, 0.0);
        Assertions.assertNotEquals(tonne, gallon);
    }

    @Test
    void given1KgAnd1Gram_WhenCompared_shouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KG, 1.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1.0);
        Assertions.assertNotEquals(kg, gram);
    }

    @Test
    void given1KgAnd1000Gram_WhenCompared_shouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KG, 1.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000GramsAnd1Kg_WhenCompared_ShouldReturnEqual() {
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
        QuantityMeasurementSystem kg = new QuantityMeasurementSystem(Weight.KG, 1.0);
        boolean compareCheck = gram.compare(kg);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1Kg_WhenCompared_ShouldReturnNotEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        QuantityMeasurementSystem kilogram = new QuantityMeasurementSystem(Weight.KG, 1.0);
        Assertions.assertNotEquals(tonne, kilogram);
    }

    @Test
    void given1TonneAnd1000Kg_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        QuantityMeasurementSystem kilogram = new QuantityMeasurementSystem(Weight.KG, 1000.0);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000KgAnd1Tonne_WhenCompared_ShouldReturnEqualUnitMeasurementSystem() {
        QuantityMeasurementSystem kilogram = new QuantityMeasurementSystem(Weight.KG, 1000.0);
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        boolean compareCheck = kilogram.compare(tonne);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Gram_whenAdded_shouldReturn1001Kg() {
        QuantityMeasurementSystem tonne = new QuantityMeasurementSystem(Weight.TONNE, 1.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 1000.0);
        QuantityMeasurementSystem expectedSum = new QuantityMeasurementSystem(Weight.KG, 1001.0);
        QuantityMeasurementSystem actualSum = tonne.addition(gram, Weight.KG);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        QuantityMeasurementSystem temparature2 = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temparature1, temparature2);
    }

    @Test
    void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        QuantityMeasurementSystem temparature2 = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temparature1, temparature2);
    }

    @Test
    void given1FahrenheitAndNull_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 1.0);
        QuantityMeasurementSystem temparature2 = null;
        Assertions.assertNotEquals(temparature1, temparature2);
    }

    @Test
    void given0FahrenheitAnd0FahrenheitFromDiffRef_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        QuantityMeasurementSystem temparature2 = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        Assertions.assertNotSame(temparature1, temparature2);
    }

    @Test
    void given0FahrenheitAnd0GramFromDiffType_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temperature = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 0.0);
        QuantityMeasurementSystem weight = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertNotEquals(temperature, weight);
    }

    @Test
    void given0CelsiusAnd0Celsius_ShouldReturnEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.CELSIUS, 0.0);
        QuantityMeasurementSystem temparature2 = new QuantityMeasurementSystem(Temperature.CELSIUS, 0.0);
        Assertions.assertEquals(temparature1, temparature2);
    }

    @Test
    void given0CelsiusAnd1Celsius_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.CELSIUS, 0.0);
        QuantityMeasurementSystem temparature2 = new QuantityMeasurementSystem(Temperature.CELSIUS, 1.0);
        Assertions.assertNotEquals(temparature1, temparature2);
    }

    @Test
    void given0CelsiusAndNull_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.CELSIUS, 0.0);
        QuantityMeasurementSystem temperature2 = null;
        Assertions.assertNotEquals(temparature1, temperature2);
    }

    @Test
    void given0CelsiusAnd0CelsiusFromDiffRef_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature1 = new QuantityMeasurementSystem(Temperature.CELSIUS, 0.0);
        QuantityMeasurementSystem temparature2 = new QuantityMeasurementSystem(Temperature.CELSIUS, 0.0);
        Assertions.assertNotSame(temparature1, temparature2);
    }

    @Test
    void given0CelsiusAnd0GramFromDiffType_ShouldReturnNotEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem temparature = new QuantityMeasurementSystem(Temperature.CELSIUS, 0.0);
        QuantityMeasurementSystem gram = new QuantityMeasurementSystem(Weight.GRAM, 0.0);
        Assertions.assertNotEquals(temparature, gram);
    }

    @Test
    void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem fahrenheit = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 212.0);
        QuantityMeasurementSystem celsius = new QuantityMeasurementSystem(Temperature.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given100CelsiusAnd212Celsius_WhenCompared_ShouldReturnEqualQuantityMeasurementSystem() {
        QuantityMeasurementSystem celsius = new QuantityMeasurementSystem(Temperature.CELSIUS, 100.0);
        QuantityMeasurementSystem fahrenheit = new QuantityMeasurementSystem(Temperature.FAHRENHEIT, 212.0);
        boolean compareCheck = celsius.compare(fahrenheit);
        Assertions.assertTrue(compareCheck);
    }



}
