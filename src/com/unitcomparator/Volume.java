package com.unitcomparator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suparnad on 3/16/2015.
 */
public class Volume extends Units {
    private double value;
    private UnitsStorage unit;
    private static final Map<UnitsStorage,Double> conversionFactor =new HashMap<UnitsStorage, Double>();
    static {
        conversionFactor.put(UnitsStorage.GALLON,3.78);
        conversionFactor.put(UnitsStorage.LITRE,1.0);
        conversionFactor.put(UnitsStorage.CUBIC_METER,1000d);
    }
    public Volume(double value, UnitsStorage unit) {
        this.value = value;
        this.unit = unit;
    }

     double normalizeValue(){
        return  value*conversionFactor.get(unit);
    }

}
