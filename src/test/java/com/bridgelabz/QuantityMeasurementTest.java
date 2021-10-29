package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 =new Length(0.0);
        Length feet2 = new Length(0.0);
        Assertions.assertEquals(feet1,feet2);
    }
}
