package corejavaexamples.regexexample;


import java.util.StringTokenizer;
import java.util.regex.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamsu
 */
public class RegexExample {
    public static void main(String[] arg){
        String t = "Longlonglong ago, in a galaxy far far away.";
    
        Pattern p1 = Pattern.compile("ago.*");
        Matcher m1 = p1.matcher(t);
        if (m1.find()) System.out.println("Found: " + m1.group());
        
        Pattern p2 = Pattern.compile("gal.{3}");
        Matcher m2 = p2.matcher(t);
        if (m2.find()) System.out.println("Found: " + m2.group());
        
        Pattern p3 = Pattern.compile("(long){2}");
        Matcher m3 = p3.matcher(t);
        if (m3.find()) System.out.println("Found: " + m3.group());   
        
        String t2 = "Jo told me 20 ways to San Jose in 15 minutes.";
        System.out.println(t2);
    
        Pattern p4 = Pattern.compile("\\d\\d");
        Matcher m4 = p1.matcher(t);
        while (m4.find()){
            System.out.println("Found: " + m4.group());
        }
        
        Pattern p5 = Pattern.compile("\\sin\\s");
        Matcher m5 = p5.matcher(t2);
        if (m5.find()) System.out.println("Found: " + m5.group());
        
        Pattern p6 = Pattern.compile("\\Sin\\S");
        Matcher m6 = p6.matcher(t2);
        if (m3.find()) System.out.println("Found: " + m3.group()); 
        
        String t3 = "It was the best of times";

        Pattern p7 = Pattern.compile("w.s");
        Matcher m7 = p7.matcher(t3);
        if (m7.find()) { System.out.println("Found: " + m7.group());
        }

        Pattern p8 = Pattern.compile("w[abc]s");
        Matcher m8 = p8.matcher(t3);
        if (m8.find()) { System.out.println("Found: " + m8.group());
        }

        Pattern p9 = Pattern.compile("t[^eou]mes");
        Matcher m9 = p9.matcher(t3);
        if (m9.find()) { System.out.println("Found: " + m9.group());
        }
    }
}
