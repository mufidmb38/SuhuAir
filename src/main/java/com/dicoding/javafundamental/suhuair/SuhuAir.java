/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

/**
 *
 * @author znxt38
 */
public class SuhuAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String celcius = "\u00b0" + "C";
        int T;
        
        // Program
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (" + celcius + "): " );
        
        // Scanner unutk memasukan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        
        // Proses cek dengan IF
        String[] wujudAir = new String[] { 
            "Wujud air beku",
            "Wujud air cair",
            "Wujud air uap/gas"
        };
        
        int posisiWujud = 0;
        if (T < 0) {
            posisiWujud = 0;
        } else if ((0 <= T) && (T <= 100)) {
            posisiWujud = 1;
        } else if (T > 100) {
            posisiWujud = 2;
        }
        
        System.out.println(wujudAir[posisiWujud] + " " + T + celcius);
    }
    
}
