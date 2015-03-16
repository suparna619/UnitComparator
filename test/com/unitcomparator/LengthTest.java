package com.unitcomparator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by suparnad on 3/16/2015.
 */
public class LengthTest {
    @Test
    public void test_one_feet_is_equal_12_inches() {
        Length feet = new Length(1, Units.Feet);
        Length inch = new Length(12, Units.Inch);
        assertTrue(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_not_equal_10_inches() {
        Length feet = new Length(1, Units.Feet);
        Length inch = new Length(10, Units.Inch);
        assertFalse(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_equal_0p4_centimeters() {
        Length feet = new Length(1, Units.Feet);
        Length centimeter = new Length(30.48, Units.CENTIMETER);
        assertTrue(feet.equals(centimeter));
    }
}
