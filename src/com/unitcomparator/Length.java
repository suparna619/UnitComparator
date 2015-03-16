package com.unitcomparator;

/**
 * Created by suparnad on 3/16/2015.
 */
public class Length {
    private double value;
    private Units unit;
    public Length(double value, Units unit) {
        this.value =value;
        this.unit =unit;
    }
    public boolean equals(Object other){
        Length that = (Length)other;
        double thisLengthInches = value * UnitComparator.getFactor(unit);
        double otherLengthInches = that.value * UnitComparator.getFactor(that.unit);
        return Math.abs(otherLengthInches-thisLengthInches)<=0.1;
    }
}
