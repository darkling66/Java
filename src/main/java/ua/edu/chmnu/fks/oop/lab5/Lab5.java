package ua.edu.chmnu.fks.oop.lab5;

public class Lab5 {

    public static void main(String[] args){
        Cube cube = new Cube(5.0);
        System.out.println("Площадь куба: " + cube.volume());
        System.out.println("Длина диагонали: " + cube.diagonal());
    }
}