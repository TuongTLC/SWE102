/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author trinh
 */
public class MyToys {
    public static long cF(int n){
        if (n <0  || n>15) 
            throw new IllegalArgumentException("n must be between 0...15");
       
        if (n==0) 
            return 1;
        
        long product=1;
        for (int i = 1; i <=n; i++) {
            product *= i;
        }
        return product;
    }
}
