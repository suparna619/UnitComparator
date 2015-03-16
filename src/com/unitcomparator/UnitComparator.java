package com.unitcomparator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suparnad on 3/16/2015.
 */
public class UnitComparator {
    private static Map<Units,Double> inchesConversionFactor=new HashMap<Units, Double>();
    static {
        inchesConversionFactor.put(Units.Feet,12.0);
        inchesConversionFactor.put(Units.Inch,1.0);
        inchesConversionFactor.put(Units.Centimeter,0.3937);
    }
    public static double getFactor(Units unit) {
        return inchesConversionFactor.get(unit);
    }
}
