/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.localization;

import java.io.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author iamsu
 */
public class LocalizationExample {
    public static void main(String[] args) {
        SampleApp ui = new SampleApp();
        ui.run();
    }
}
class SampleApp {

    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Locale usLocale = Locale.US;
    Locale frLocale = Locale.FRANCE;
    Locale zhLocale = new Locale("zh", "CN");
    Locale ruLocale = new Locale("ru", "RU");
    Locale currentLocale = Locale.getDefault();
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    NumberFormat currency;
    Double money = new Double(1000000.00);
    Date today = new Date();
    DateFormat df;

    

    public void run() {
        String line = "";

        while (!(line.equals("q"))) {
            this.printMenu();
            try {
                line = this.br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (line) {
                case "1": setEnglish(); break;
                case "2": setFrench(); break;
                case "3": setChinese(); break;
                case "4": setRussian(); break;
                case "5": showDate();  break;
                case "6": showMoney(); break;
            }
        }
    }

    public void printMenu() {
        pw.println("=== Localization App ===");
        pw.println("1. " + messages.getString("menu1"));
        pw.println("2. " + messages.getString("menu2"));
        pw.println("3. " + messages.getString("menu3"));
        pw.println("4. " + messages.getString("menu4"));
        pw.println("5. " + messages.getString("menu5"));
        pw.println("6. " + messages.getString("menu6"));
        pw.println("q. " + messages.getString("menuq"));
        System.out.print(messages.getString("menucommand")+" ");
    }

    public void setEnglish() {
        currentLocale = usLocale;
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }

    public void setFrench() {
        currentLocale = frLocale;
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }

    public void setChinese() {
        currentLocale = zhLocale;
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }

    public void setRussian() {
        currentLocale = ruLocale;
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    }

    public void showDate() {
        df = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
        pw.println(df.format(today) + " " + currentLocale.toString());

    }

    public void showMoney() {
        currency = NumberFormat.getCurrencyInstance(currentLocale);
        pw.println(currency.format(money) + " " + currentLocale.toString());
    }
}
class SampleUI {
    PrintWriter pw = new PrintWriter(System.out, true);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    
    
    public void run(){
        String line = "";
        
        while (!(line.equals("q"))){
            this.printMenu();
            try { line = this.br.readLine(); } 
            catch (Exception e){ e.printStackTrace(); }
            
            switch (line){
                case "1": setEnglish(); break;
                case "2": setFrench(); break;
                case "3": setChinese(); break;
                case "4": setRussian(); break;
                case "5": showDate(); break;
                case "6": showMoney(); break;
            }
        }
        
        
    }
    
    public void printMenu(){
        pw.println("=== Localization App ===");
        pw.println("1. Set to English");
        pw.println("2. Set to French");
        pw.println("3. Set to Chinese");
        pw.println("4. Set to Russian");
        pw.println("5. Show me the date");
        pw.println("6. Show me the money!");
        pw.println("q. Enter q to quit");
        System.out.print("Enter a command: ");        
    }
    
    public void setEnglish(){
        
    }
    
    public void setFrench(){

    }
    
    public void setChinese(){
        
    }
    
    public void setRussian(){
        
    }
    
    public void showDate(){
        
    }
    
    public void showMoney(){
        
    }
}
