/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.localization;

import java.math.RoundingMode;
import java.util.*;
import java.text.*;
/**
 *
 * @author iamsu
 */
public class LocalizationExampleForNumber {
    public static void main(String[] arg) throws ParseException{
        Locale locale = new Locale("da", "DK");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String number = numberFormat.format(100.99);
        System.out.println(number);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        String currency = currencyFormat.format(100.999);
        System.out.println(currency);
        Currency currencyy = currencyFormat.getCurrency();
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        String percentage = percentageFormat.format(99.999);
        System.out.println(percentage);
        
        int digits = numberFormat.getMinimumIntegerDigits();
        digits = numberFormat.getMaximumIntegerDigits();
        digits = numberFormat.getMinimumFractionDigits();
        digits = numberFormat.getMaximumFractionDigits();
        
        numberFormat.setRoundingMode(RoundingMode.HALF_DOWN);
        numberFormat.setMinimumFractionDigits(0);
        numberFormat.setMaximumFractionDigits(0);

        number = numberFormat.format(99.50);
        System.out.println(number);
        
        Number parse = numberFormat.parse("100,00");
        System.out.println(parse.intValue());
    }
}
