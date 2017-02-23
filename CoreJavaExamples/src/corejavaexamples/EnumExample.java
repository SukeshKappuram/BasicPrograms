/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples;

import static corejavaexamples.PowerState.*;

/**
 *
 * @author iamsu
 */
public class EnumExample {
       public static void main(String[] args) {
            Computer comp = new Computer();
            comp.setState(PowerState.SUSPEND);
       }
}
abstract class ElectronicDevices {
    
    public abstract void turnOn();
    
    public abstract void turnOff();
    
}

enum PowerState {

    OFF("The power is off"),
    ON("The usage power is high"),
    SUSPEND("The power usage is low");
    
    private String description;
    
    private PowerState(String d) {
        description = d;
    }
    
    public String getDescription() {
        return description;
    }
    
    @Override
    public String toString() {
        return getDescription();
    }
}
class Computer extends ElectronicDevices {
    
    private PowerState powerState = OFF;
    
    @Override
    public void turnOn() {
        powerState = ON;
    }

    @Override
    public void turnOff() {
        powerState = OFF;
    }
    
    public void suspend() {
        powerState = SUSPEND;
        System.out.println(powerState);
    }
    
    public void setState(PowerState state) {
        switch(state) {
            case OFF:
                turnOn();
                break;
            case ON:
                turnOff();
                break;
            case SUSPEND:
                suspend();
                break;
            
        }
    }
    
}