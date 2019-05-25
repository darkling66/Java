package ua.edu.chmnu.fks.oop.Lab5;

import org.junit.jupiter.api.Test;
import ua.edu.chmnu.fks.oop.lab5.Cube;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab5_Test {

    @Test
    public void constructorTest(){
        Cube cube = new Cube(3.0);
        assertEquals(3.0, cube.getEdge());
    }

    @Test
    public void edgeTest(){
        Cube cube = new Cube();
        cube.setEdge(3.0);
        assertEquals(3.0, cube.getEdge());
    }

    @Test
    public void volumeTest(){
        Cube cube = new Cube(5.0);
        assertEquals(150.0, cube.volume());
    }


    @Test
    public void diagonalTest(){
        Cube cube = new Cube(5.0);
        assertEquals(8.660254037844386, cube.diagonal());
    }
}