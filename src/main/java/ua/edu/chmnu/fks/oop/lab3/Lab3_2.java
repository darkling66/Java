package ua.edu.chmnu.fks.oop.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        int[] mas = {5, 2, 4, 6, 1, 3};
        print(mas);
        System.out.println("");
        inverse(mas);
        print(mas);
    }

    private static void inverse(int[] mas){
        for (int i = 0; i < mas.length / 2; i++) {
            int tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }
    }
    private static void print(int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}