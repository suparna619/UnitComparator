package com.unitcomparator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suparnad on 3/16/2015.
 */
public class Length extends Units {
    private enum lengthUnit{
        CENTIMETER,FEET, INCH
    }
    private static Map<UnitsStorage,Double> cmConversionFactor =new HashMap<UnitsStorage, Double>();
    private double value;
    private UnitsStorage unit;
    static {
        cmConversionFactor.put(UnitsStorage.FEET, 30.48);
        cmConversionFactor.put(UnitsStorage.INCH, 2.54);
        cmConversionFactor.put(UnitsStorage.CENTIMETER, 1.0);
    }



    private Length(double value, UnitsStorage unit) {
        this.value = value;
        this.unit =unit;
    }
    public static Length createLength(double value,UnitsStorage unit){
        for(lengthUnit u :lengthUnit.values()){
            if(u.toString().equals(unit.toString())){
               return  new Length(value,unit);
            };
        }
        return  null;
    }
    @Override
    double normalizeValue() {
        return value*cmConversionFactor.get(unit) ;
    }
}
