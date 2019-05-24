package ua.edu.chmnu.fks.oop.lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("топот", "база", "вафля");
        System.out.println(getPalindrome(list));
    }

    public static Boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static List<String> getPalindrome(List<String> list){
        return list.stream()
                .filter(c -> isPalindrome(c))
                .collect(Collectors.toList());
    }
}