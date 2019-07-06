package ro.sda.java4.basic;

import java.text.DecimalFormat;

public class Math {

    /*Enter two values of type int. Display their division
casted to the double type and rounded to the third decimal point.*/
    public static void main(String[] args) {
        int value1= 100, value2=7;
        double result = (double)value1/value2;

        System.out.println( "Result = "+ result);


        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println( "Result rounded =" + decimalFormat.format(result));

    }

}
