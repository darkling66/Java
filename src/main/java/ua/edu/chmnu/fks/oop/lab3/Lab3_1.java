/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab3;

/**
 *
 * @author User
 */
public class Lab3_2 {
    public static void main(String[] args) {
        int n = 3;
        int [][] matrix = new int [n][n];
        System.out.println("Было");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Стало");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
    }

}