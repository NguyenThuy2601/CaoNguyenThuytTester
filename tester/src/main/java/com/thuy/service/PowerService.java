/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thuy.service;

/**
 *
 * @author admin
 */
public class PowerService {
    public static double Power(double x, int n){
        if(n == 0)
            return 1.0;
        else if(n > 0)
            return n * Power(x, n - 1);
        else 
            return Power(x, n + 1) / x;
    }
}
            
           
