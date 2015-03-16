package com.unitcomparator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suparnad on 3/16/2015.
 */
public class Volume extends ScalarUnits {
    private double value;
    private Units unit;
    private static final Map<Units,Double> conversionFactor =new HashMap<Units, Double>();
    static {
        conversionFactor.put(Units.GALLON,3.78);
        conversionFactor.put(Units.LITRE,1.0);
        conversionFactor.put(Units.CUBIC_METER,1000d);
    }
    public Volume(double value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

     double normalizeValue(){
        return  value*conversionFactor.get(unit);
    }

}
