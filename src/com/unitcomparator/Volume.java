package com.unitcomparator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suparnad on 3/16/2015.
 */
public class Volume {

    private static final double PRICISION = 0.2;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume volume = (Volume) o;
        return Math.abs(normalizeValue() - volume.normalizeValue())<= PRICISION;
    }
    private  double normalizeValue(){
        return  value*conversionFactor.get(unit);
    }
    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }
}
