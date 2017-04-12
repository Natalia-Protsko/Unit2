package com.nata;

/**
 * Created by nata on 13.04.2017.
 */
public class NJTax extends Tax {
    double adjustForStudents (double stateTax){
        double adjustedTax = stateTax - 500;
        return adjustedTax;
    }
}
