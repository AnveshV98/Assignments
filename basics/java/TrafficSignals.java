package com.yash.basics.java;
public class TrafficSignals {

    enum Color {green, yellow, red}
    
    public static void main(String[] args) {    
      
        char colorOfLight = 0;
        Color signal;
        
        System.out.print("What color is the traffic light? (G/Y/R) ");
        colorOfLight = 'G';
        
        if (colorOfLight == 'G') {
            signal = Color.green; 
        } else if (colorOfLight == 'Y') {
            signal = Color.yellow;
        } else {
            signal = Color.red;
        }

        System.out.print("The signal is "+signal);
      
        
    }

}
