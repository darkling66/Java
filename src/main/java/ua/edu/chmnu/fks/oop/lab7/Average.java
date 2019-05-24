package ua.edu.chmnu.fks.oop.lab7;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Average implements ArrayIntProcess{

    @Override
    public double avg(double[] a) {
        double sum = 0, avg = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            avg = sum / a.length;
        }
        return avg;
    }

    @Override
    public double avg(FileInputStream file) {
        Scanner scan = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(scan.nextInt());

        double sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

}
