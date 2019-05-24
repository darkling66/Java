package ua.edu.chmnu.fks.oop.Lab8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.edu.chmnu.fks.oop.Rin.lab8.Lab8.getPalindrome;
import static ua.edu.chmnu.fks.oop.Rin.lab8.Lab8.isPalindrome;

public class Lab8_Test {

    @Test
    public void isPalimdromeTest(){
        assertEquals(true, isPalindrome("топот"));
    }

    @Test
    public void getPalimdromeTest(){
        List<String> list = Arrays.asList("топот", "база", "вафля");
        List<String> expected = Arrays.asList("топот");
        assertEquals(expected, getPalindrome(list));
    }
}