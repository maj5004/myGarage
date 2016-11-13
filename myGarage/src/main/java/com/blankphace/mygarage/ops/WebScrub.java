package com.blankphace.mygarage.ops;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class WebScrub {

    public String scrubYN(String input) throws NumberFormatException {

        if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            throw new NumberFormatException();
        }

        //Return value
        return input;
    }

    public double parseStringToDouble(String input) throws NumberFormatException {
        double returnVal = 0;

        //Parse to double, throw if fails
        returnVal = Double.parseDouble(input);

        //Return value
        return returnVal;
    }

    public double parseStringToDoubleRange(String input, double min, double max) throws NumberFormatException {
        //Call parseStringToDouble, then check parsed value
        double returnVal = parseStringToDouble(input);

        //Check range
        if (returnVal < min || returnVal > max) {
            throw new NumberFormatException();
        }

        //Return value
        return returnVal;
    }

    public float parseStringToFloat(String input) throws NumberFormatException {
        float returnVal = 0;

        //Parse to float, throw if fails
        returnVal = Float.parseFloat(input);

        //Return value
        return returnVal;
    }

    public float parseStringToFloatRange(String input, float min, float max) throws NumberFormatException {
        //Call parseStringToFloat, then check parsed value
        float returnVal = parseStringToFloat(input);

        //Check range
        if (returnVal < min || returnVal > max) {
            throw new NumberFormatException();
        }

        //Return value
        return returnVal;
    }

    public int parseStringToInt(String input) throws NumberFormatException {
        int returnVal = 0;

        //Parse to float, throw if fails
        returnVal = Integer.parseInt(input);

        //Return value
        return returnVal;
    }

    public int parseStringToIntRange(String input, int min, int max) throws NumberFormatException {
        //Call parseStringToInt, then check parsed value
        int returnVal = parseStringToInt(input);

        //Check range
        if (returnVal < min || returnVal > max) {
            throw new NumberFormatException();
        }

        //Return value
        return returnVal;
    }

    public String returnTwoDecimalString(double money) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(money);
    }
}
