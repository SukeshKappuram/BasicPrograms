/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.string;

/**
 *
 * @author iamsu
 */
public class StringBuilderExample { //S-17-11502-00-234=13
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(500);
        sb.append(",the lightning flashed and the thunder rumbled.\n");
        sb.insert(0, "It was a dark and stormy night");
        sb.append("The lightning struck...\n").append("[");
        for(int i = 1; i < 11; i++){
            sb.append(i).append(" ");
        }
        sb.append("] times");
        System.out.println(sb.toString());
        
    }
}
