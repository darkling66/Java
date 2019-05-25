package ua.edu.chmnu.fks.oop.lab2;

public class Aud {
    public static void main(String[] args) {
        int n = 10;
        double j = 1, sum = 0;
        double[] a = new double[n];
        a[0] = 1;
        System.out.printf("a[0]:%f\n", a[0]);
        for(int i = 1; i < n; i++) {
            a[i] = a[i - 1] + j / (j + 1);
            j++;
            if(i < 10) {
                sum += a[i];
            }
            System.out.printf("a[%d]:%f\n", i ,a[i]);
        }
        System.out.printf("Sum:" + sum);
    }
}