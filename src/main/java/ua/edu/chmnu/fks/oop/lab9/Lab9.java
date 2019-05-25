package ua.edu.chmnu.fks.oop.lab9;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lab9 {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args){
        File from = new File("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\lab9\\from.txt");
        File to = new File("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\lab9\\to.txt");

        readFromFile(from);
        writeInFile(to);
    }

    public static ArrayList<Integer> readFromFile(File from){
        String line = null;
        try {
            FileReader fileReader = new FileReader(from);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(Integer.valueOf(line));
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<Integer> writeInFile(File to) {
        ArrayList<Integer> filteredList = new ArrayList<>();
        try(FileWriter recorder = new FileWriter(to)) {
            filteredList = (ArrayList<Integer>) list.stream()
                    .filter(c -> isSimple(c))
                    .collect(Collectors.toList());
            String line1 = filteredList.toString();
            for(char x : line1.toCharArray()) {
                recorder.write(x);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return filteredList;
    }

    public static boolean isSimple(int i) {
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}

