package ua.edu.chmnu.fks.oop.Lab7;

import org.junit.jupiter.api.Test;
import ua.edu.chmnu.fks.oop.Rin.lab7.Average;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab7_Test {

    @Test
    public void avgArrayTest(){
        Average average = new Average();
        double[]a = new double[]{3.0, 5.0, 1.0, 6.0};
        assertEquals(3.75, average.avg(a));
    }

    @Test
    public void avgFileTest() throws FileNotFoundException {
        Average average = new Average();
        FileInputStream fileName = new FileInputStream("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\Rin\\lab7\\file.txt");
        assertEquals(3.0, average.avg(fileName));
    }

}