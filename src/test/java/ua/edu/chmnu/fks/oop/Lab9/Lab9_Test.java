package ua.edu.chmnu.fks.oop.Lab9;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.edu.chmnu.fks.oop.lab9.Lab9.*;

public class Lab9_Test {

    @Test
    public void fileTest(){
        File from = new File("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\lab9\\from.txt");
        File to = new File("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\lab9\\to.txt");

        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        readFromFile(from);
        assertEquals(expected, writeInFile(to));
    }

    @Test
    public void isSimpleTest(){
        assertEquals(true, isSimple(2));
        assertEquals(true, isSimple(3));
        assertEquals(true, isSimple(5));
        assertEquals(true, isSimple(7));

        assertEquals(false, isSimple(1));
        assertEquals(false, isSimple(4));
        assertEquals(false, isSimple(6));
        assertEquals(false, isSimple(9));
    }
}
