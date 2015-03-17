package com.unitcomparator;

/**
 * Created by suparnad on 3/16/2015.
 */
public abstract class ScalarUnits<E> {
    private static final double PRECISION = 0.2;
    Units baseUnit;
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
    private double normalizeValue(){
        return changeTo(baseUnit);
    }
    abstract double changeTo(Units unit);
    abstract  E create(double value,Units unit) ;
    public E add(ScalarUnits<E> sunit,Units unit){
        double result =0;
        double thisVal = this.normalizeValue();
        double thatVal =sunit.normalizeValue();
            result =thatVal+thatVal;
       ScalarUnits<E> base = (ScalarUnits<E>)create(result,baseUnit);
        return create(base.changeTo(unit),unit);
    }
}
