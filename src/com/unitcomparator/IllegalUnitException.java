package com.unitcomparator;

/**
 * Created by suparnad on 3/16/2015.
 */
public class IllegalUnitException extends  Exception {
    @Override
    public String getMessage(){
        return "Unit can not be generated with Specified Unit";
    }
}
