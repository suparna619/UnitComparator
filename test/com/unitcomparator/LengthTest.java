package com.unitcomparator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by suparnad on 3/16/2015.
 */
public class LengthTest {
    @Test
    public void test_one_feet_is_equal_12_inches() {
        Length feet =Length.createLength(1, Units.FEET);
        Length inch =Length.createLength(12, Units.INCH);
        assertTrue(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_not_equal_10_inches() {
        Length feet =Length.createLength(1, Units.FEET);
        Length inch =Length.createLength(10, Units.INCH);
        assertFalse(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_equal_0p4_centimeters() {
        Length feet =Length.createLength(1, Units.FEET);
        Length centimeter =Length.createLength(30.48, Units.CENTIMETER);
        assertTrue(feet.equals(centimeter));
    }

    @Test
    public void test_length_cannt_be_creted_with_gallon(){
        Length gallon =Length.createLength(1, Units.GALLON);
       assertNull(gallon);
    }
}
