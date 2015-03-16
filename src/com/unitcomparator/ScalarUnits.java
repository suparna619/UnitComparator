package com.unitcomparator;

/**
 * Created by suparnad on 3/16/2015.
 */
public abstract class ScalarUnits {
    private static final double PRECISION = 0.2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScalarUnits volume = (ScalarUnits) o;
        try {
            return Math.abs(normalizeValue() - volume.normalizeValue())<= PRECISION;
        } catch (Exception e) {
           return  false;
        }
    }
    abstract double normalizeValue() ;

}