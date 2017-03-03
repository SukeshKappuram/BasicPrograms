/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.regexexample;
import java.util.regex.*;
/**
 *
 * @author iamsu
 */
public class PatternExample
{
    public static void main(String[] args)
    {
        String t = "It was the best of times";
        Pattern pattern = Pattern.compile("they");
        Matcher matcher = pattern.matcher(t);
        if ( matcher.find())
        {
            System.out.println("Found match!");
        }
    }
}

