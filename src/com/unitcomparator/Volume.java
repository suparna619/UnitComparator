package com.unitcomparator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suparnad on 3/16/2015.
 */
public class Volume extends ScalarUnits {
    private double value;
    private Units unit;
    private static final Map<Units,Double> litreConversionFactor =new HashMap<Units, Double>();
    static {
        litreConversionFactor.put(Units.GALLON, 3.78);
        litreConversionFactor.put(Units.LITRE, 1.0);
        litreConversionFactor.put(Units.CUBIC_METER, 1000d);
    }
    public Volume(double value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

     double normalizeValue(){
        return  value* litreConversionFactor.get(unit);
    }

}
