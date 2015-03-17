package com.unitcomparator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by suparnad on 3/16/2015.
 */
public class VolumeTest {
    @Test
    public void test_1_gallon_equals_with_3p78_litters() {
        Volume g = new Volume(1, Units.GALLON);
        Volume li = new Volume(3.78, Units.LITRE);
        assertTrue(g.equals(li));
        assertTrue(li.equals(g));
    }

    @Test
    public void test_1_gallon_equals_with_0p003785_cubic_meters() {
        Volume g = new Volume(1, Units.GALLON);
        Volume cu_m = new Volume(0.0037, Units.CUBIC_METER);
        assertTrue(g.equals(cu_m));
        assertTrue(cu_m.equals(g));
    }
    @Test
    public void test_one_Litre_Plus_1litre_2_litre() {
        Volume oneLiter =new Volume(1, Units.LITRE);
        Volume twoLiter =new Volume(2, Units.LITRE);
        Volume actual =oneLiter.add(oneLiter, Units.LITRE);
        assertTrue(twoLiter.equals(actual));
    }
}
