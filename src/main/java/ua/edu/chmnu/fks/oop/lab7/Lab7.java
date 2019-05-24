package ua.edu.chmnu.fks.oop.lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab7 {
    public static void main(String[] args) throws FileNotFoundException {
        Average average = new Average();
        double[]a = new double[]{3.0, 5.0, 1.0, 6.0};
        System.out.println(average.avg(a));
        FileInputStream fileName = new FileInputStream("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\Rin\\lab7\\file.txt");
        System.out.println(average.avg(fileName));
    }
}
