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
    void given0FeetAnd0FeetFromDiffReference_ShouldReturnNotSame() {
        Length feet1=new Length(0.0);
        Length feet2= new Length(0.0);
        Assertions.assertNotSame(feet1,feet2);
    }
}
