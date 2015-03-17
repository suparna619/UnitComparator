package com.unitcomparator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by suparnad on 3/16/2015.
 */
public class Length extends ScalarUnits<Length> {
    private enum lengthUnit{
        CENTIMETER,FEET, INCH
    }
    private static Map<Units,Double> cmConversionFactor =new HashMap<Units, Double>();
    private double value;
    private Units unit;
    static {
        cmConversionFactor.put(Units.FEET, 30.48);
        cmConversionFactor.put(Units.INCH, 2.54);
        cmConversionFactor.put(Units.CENTIMETER, 1.0);
    }



    private Length(double value, Units unit) {
        this.value = value;
        this.unit =unit;
        super.baseUnit = Units.CENTIMETER;
    }
    public static Length createLength(double value,Units unit){
        for(lengthUnit u :lengthUnit.values()){
            if(u.toString().equals(unit.toString())){
               return  new Length(value,unit);
            };
        }
        return  null;
    }
    @Override
    double changeTo(Units unit) {
        return (value*cmConversionFactor.get(this.unit))/cmConversionFactor.get(unit) ;
    }

    @Override
    Length create(double value,Units unit) {
        return createLength(value,unit);
    }
}
