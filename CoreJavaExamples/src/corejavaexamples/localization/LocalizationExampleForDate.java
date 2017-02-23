/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.localization;

import java.text.*;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author iamsu
 */
public class LocalizationExampleForDate {
    public static void main(String[] arg){
        Date d=new Date();
        System.out.println(d);
        DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(d));
        df=DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df.format(d));
        df=DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df.format(d));
        df=DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d));
        
        Locale locale = new Locale("da", "DK");
        //Locale locale = new Locale("en", "UK");
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
        DateFormat.DEFAULT,DateFormat.DEFAULT, locale);

        String date = dateFormat.format(new Date());
        System.out.println(date);

    }
}
