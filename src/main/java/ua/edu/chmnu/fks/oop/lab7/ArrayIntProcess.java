package ua.edu.chmnu.fks.oop.lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public interface ArrayIntProcess {
    double avg(double[] a);
    double avg(FileInputStream f) throws FileNotFoundException;
}
