package ua.edu.chmnu.fks.oop.Lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ua.edu.chmnu.fks.oop.Rin.lab4.Lab4.mergeSort;

public class Lab4_Test {

    @Test
    public void mergeSortTest(){
        int[] arr = {5, 2, 4, 6, 1, 3};
        int[] expected = {1, 2, 3, 4, 5, 6};
        mergeSort(arr);
        assertArrayEquals(expected, arr);
    }
}