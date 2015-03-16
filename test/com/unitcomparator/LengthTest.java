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
        Length feet =Length.createLength(1, UnitsStorage.FEET);
        Length inch =Length.createLength(12, UnitsStorage.INCH);
        assertTrue(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_not_equal_10_inches() {
        Length feet =Length.createLength(1, UnitsStorage.FEET);
        Length inch =Length.createLength(10, UnitsStorage.INCH);
        assertFalse(feet.equals(inch));
    }

    @Test
    public void test_one_feet_is_equal_0p4_centimeters() {
        Length feet =Length.createLength(1, UnitsStorage.FEET);
        Length centimeter =Length.createLength(30.48, UnitsStorage.CENTIMETER);
        assertTrue(feet.equals(centimeter));
    }

    @Test
    public void test_length_cannt_be_creted_with_gallon(){
        Length gallon =Length.createLength(1, UnitsStorage.GALLON);
       assertNull(gallon);
    }
}
