/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarrey;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("----myArrey----");
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(99-0+1)+0;
            System.out.printf("%4d", numbers[i]);
        }
        System.out.println();
    }
    
    
}