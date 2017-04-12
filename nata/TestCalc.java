package com.nata;

/**
 * Created by nata on 13.04.2017.
 */
class TestTax{
    public static void main(String[] args){
        //Tax   t = new Tax(); // creating an instance
        NJTax  t= new NJTax();
        t.grossIncome= 50000;  // assigning the values
        t.dependents= 2;
        t.state= "NJ";

        double yourTax = t.calcTax(); //calculating tax

        // Printing the result
        System.out.println("Your tax is " + yourTax);
    }
}
