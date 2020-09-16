/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarrey;

import java.util.Random;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("----myArrey----");
        System.out.println("Задание:");
        System.out.println("Вычислите массив из 20 случайных четных целых чисел.");
        System.out.println("Вычислите среднее арифметическое элементов массива");
        System.out.println("без учета минимального и максимального элементов массива");
        System.out.println("Решение: ");
        System.out.println("Массив четных целых чисел");
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(99-0+1)+0;
            System.out.printf("%4d", numbers[i]);
        }
        System.out.println();
    }
    
    
}

