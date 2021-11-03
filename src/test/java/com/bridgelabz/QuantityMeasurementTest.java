package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNull_ShouldReturnNotEquals() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0FeetAnd0FeetFromDiffReference_ShouldReturnFalse() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 0.0);
        boolean result = feet1 == feet2;
        Assertions.assertFalse(result);
    }

    @Test
    void given0FeetFromSameReference_ShouldReturnTrue() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 0.0);
        boolean result = feet == feet;
        Assertions.assertTrue(result);
    }

    @Test
    void givenFeetWithDiffType_shouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 0.0);
        boolean feet2 = true;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenInchWithSameReference_ShouldReturnTrue() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        boolean result = inch == inch;
        Assertions.assertTrue(result);
    }

    @Test
    void givenInchWithDiffReference_ShouldReturnFalse() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 0.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 0.0);
        boolean result = inch1 == inch2;
        Assertions.assertFalse(result);
    }

    @Test
    void givenInchAndDifferentType_ShouldReturnNotEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 0.0);
        boolean inch1 = true;
        Assertions.assertNotEquals(inch, inch1);
    }

    @Test
    void given1InchAnd1Inch_ShouldReturnEqual() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd12Inches_WhenCompared_ShouldReturnEquals() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);

    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        UnitMeasurementSystem yard1 = new UnitMeasurementSystem(Length.YARD, 0.0);
        UnitMeasurementSystem yard2 = new UnitMeasurementSystem(Length.YARD, 0.0);
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEquals() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 1.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36nchAnd1Yard_WhenCompared_ShouldReturnEquals() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEquals() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEquals() {
        UnitMeasurementSystem yard = new UnitMeasurementSystem(Length.YARD, 1.0);
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CMand0CM_ShouldReturnEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMand1CM_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CMandNull_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(Length.CENTIMETER, 0.0);
        UnitMeasurementSystem centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given2InchAnd5CM_WhenCompared_ShouldReturnEqual() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CMAnd2Inch_whenCompared_ShouldReturnEquals() {
        UnitMeasurementSystem cm = new UnitMeasurementSystem(Length.CENTIMETER, 5.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        boolean compareCheck = cm.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem expectedSum = new UnitMeasurementSystem(Length.INCH, 4.0);
        UnitMeasurementSystem actualSum = inch1.addition(inch2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inches() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem expectedSum = new UnitMeasurementSystem(Length.INCH, 14.0);
        UnitMeasurementSystem actualSum = feet.addition(inch, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inches() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(Length.FEET, 1.0);
        UnitMeasurementSystem expectedSum = new UnitMeasurementSystem(Length.INCH, 24.0);
        UnitMeasurementSystem actualSum = feet1.addition(feet2, Length.INCH);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given2InchAnd2point5Cm_WhenAdded_ShouldReturn3Inches() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(Length.INCH, 2.0);
        UnitMeasurementSystem cm = new UnitMeasurementSystem(Length.CENTIMETER, 2.5);
        UnitMeasurementSystem expectedSum = new UnitMeasurementSystem(Length.INCH, 3.0);
        UnitMeasurementSystem actualSum = inch.addition(cm, Length.INCH);
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
        UnitMeasurementSystem feet = new UnitMeasurementSystem(Length.FEET, 1.0);
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
        Volume liter = new Volume(Volume.Unit.LITER, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITER, 1000.0);
        Volume expectedValue = new Volume(Volume.Unit.LITER, 2.0);
        Volume actualValue = liter.sumOfVolume(ml);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0GramAnd0Gram_ShouldReturnEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd1Gram_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNull_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffRef_ShouldReturnNotEqualWeight() {
        Weight gram1 = new Weight(Weight.Unit.GRAM, 0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertNotSame(gram1, gram2);
    }

    @Test
    void given0GramAnd0GramFromDiffType_ShouldReturnNotEqualWeight() {
        Weight weight = new Weight(Weight.Unit.GRAM, 0.0);
        Volume volume = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertNotEquals(weight, volume);
    }

    @Test
    void given0KgAnd0Kg_shouldReturnEqualWeight() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = new Weight(Weight.Unit.KG, 0.0);
        Assertions.assertEquals(kg1, kg2);
    }

    @Test
    void given0KgAnd1Kg_shouldReturnNotEqualWeight() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = new Weight(Weight.Unit.KG, 1.0);
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    void given0KgAndNull_shouldReturnNotEqualWeight() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = null;
        Assertions.assertNotEquals(kg1, kg2);
    }

    @Test
    void given0KgAnd0KgFromDiffRef_ShouldReturnNotEqualWeight() {
        Weight kg1 = new Weight(Weight.Unit.KG, 0.0);
        Weight kg2 = new Weight(Weight.Unit.KG, 0.0);
        Assertions.assertNotSame(kg1, kg2);
    }

    @Test
    void given0GKgAnd0GallonFromDiffType_ShouldReturnNotEqualWeight() {
        Weight kg = new Weight(Weight.Unit.KG, 0.0);
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertNotEquals(kg, gallon);
    }

    @Test
    void given0TonneAnd0Tonne_shouldReturnEqualWeight() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight tonne2 = new Weight(Weight.Unit.TONNE, 0.0);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAnd1Tonne_shouldReturnNotEqualWeight() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight tonne2 = new Weight(Weight.Unit.TONNE, 1.0);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAndNull_shouldReturnNotEqualWeight() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight tonne2 = null;
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAnd0TonneFromDiffRef_ShouldReturnNotEqualWeight() {
        Weight tonne1 = new Weight(Weight.Unit.TONNE, 0.0);
        Weight tonne2 = new Weight(Weight.Unit.TONNE, 0.0);
        Assertions.assertNotSame(tonne1, tonne2);
    }

    @Test
    void given0TonneAnd0GallonFromDiffType_ShouldReturnNotEqualWeight() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 0.0);
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Assertions.assertNotEquals(tonne, gallon);
    }

    @Test
    void given1KgAnd1Gram_WhenCompared_shouldReturnNotEqualWeight() {
        Weight kg = new Weight(Weight.Unit.KG, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1.0);
        Assertions.assertNotEquals(kg, gram);
    }

    @Test
    void given1KgAnd1000Gram_WhenCompared_shouldReturnEqualWeight() {
        Weight kg = new Weight(Weight.Unit.KG, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        boolean compareCheck = kg.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000GramsAnd1Kg_WhenCompared_ShouldReturnEqual() {
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        Weight kg = new Weight(Weight.Unit.KG, 1.0);
        boolean compareCheck = gram.compare(kg);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1Kg_WhenCompared_ShouldReturnNotEqualWeight() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight kilogram = new Weight(Weight.Unit.KG, 1.0);
        Assertions.assertNotEquals(tonne, kilogram);
    }

    @Test
    void given1TonneAnd1000Kg_WhenCompared_ShouldReturnEqualWeight() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight kilogram = new Weight(Weight.Unit.KG, 1000.0);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000KgAnd1Tonne_WhenCompared_ShouldReturnEqualWeight() {
        Weight kilogram = new Weight(Weight.Unit.KG, 1000.0);
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        boolean compareCheck = kilogram.compare(tonne);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void giveen1TonneAnd10000Gram_whenAdded_shouldReturn1001Kg() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        Weight expectedSum = new Weight(Weight.Unit.KG, 1001.0);
        Weight actualSum = tonne.sumOfWeight(gram);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temparature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertEquals(temparature1, temparature2);
    }

    @Test
    void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temparature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Assertions.assertNotEquals(temparature1, temparature2);
    }

    @Test
    void given1FahrenheitAndNull_ShouldReturnNotEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 1.0);
        Temperature temparature2 = null;
        Assertions.assertNotEquals(temparature1, temparature2);
    }

    @Test
    void given0FahrenheitAnd0FahrenheitFromDiffRef_ShouldReturnNotEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Temperature temparature2 = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Assertions.assertNotSame(temparature1, temparature2);
    }

    @Test
    void given0FahrenheitAnd0GramFromDiffType_ShouldReturnNotEqualTemperature() {
        Temperature temperature = new Temperature(Temperature.Unit.FAHRENHEIT, 0.0);
        Weight weight = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertNotEquals(temperature, weight);
    }

    @Test
    void given0CelsiusAnd0Celsius_ShouldReturnEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature temparature2 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Assertions.assertEquals(temparature1, temparature2);
    }

    @Test
    void given0CelsiusAnd1Celsius_ShouldReturnNotEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature temparature2 = new Temperature(Temperature.Unit.CELSIUS, 1.0);
        Assertions.assertNotEquals(temparature1, temparature2);
    }

    @Test
    void given0CelsiusAndNull_ShouldReturnNotEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature temperature2 = null;
        Assertions.assertNotEquals(temparature1, temperature2);
    }

    @Test
    void given0CelsiusAnd0CelsiusFromDiffRef_ShouldReturnNotEqualTemperature() {
        Temperature temparature1 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Temperature temparature2 = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Assertions.assertNotSame(temparature1, temparature2);
    }

    @Test
    void given0CelsiusAnd0GramFromDiffType_ShouldReturnNotEqualTemperature() {
        Temperature temparature = new Temperature(Temperature.Unit.CELSIUS, 0.0);
        Weight weight = new Weight(Weight.Unit.GRAM, 0.0);
        Assertions.assertNotEquals(temparature, weight);
    }

    @Test
    void given212FahrenheitAnd100Celsius_WhenCompared_ShouldReturnEqualTemperature() {
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compare(celsius);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given100CelsiusAnd212Celsius_WhenCompared_ShouldReturnEqualTemperature() {
        Temperature celsius = new Temperature(Temperature.Unit.CELSIUS, 100.0);
        Temperature fahrenheit = new Temperature(Temperature.Unit.FAHRENHEIT, 212.0);
        boolean compareCheck = celsius.compare(fahrenheit);
        Assertions.assertTrue(compareCheck);
    }


}
