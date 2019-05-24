package ua.edu.chmnu.fks.oop.lab2;

import java.util.Scanner;
    /**
     *
     * @author User
     */
public class Lab2 {

    public static void main(String[] args) {
        System.out.println("1. Обчислити значення виразу із заданими параметрами");
        System.out.println("2. Обчислити значення виразу з випадковими параметрами");
        System.out.println("3. Обчислити екстремуми");
        try (Scanner in = new Scanner(System.in)) {
            double y;
            int s = in.nextInt();
            switch (s) {
                case 1:
                    y = f(6.05, 14.22, 7.67, 10.12);
                    System.out.println("y = " + y);
                    break;
                case 2:
                    double a, b, c, x;
                    do {
                        a = Math.random() * 10;
                        b = Math.random() * 10;
                        c = Math.random() * 10;
                        x = Math.random() * 10;
                    } while ((c * x - 2) < 0);
                    y = f(a, b, c, x);
                    System.out.println("y = " + y);
                    break;
                case 3:
                    int N = 200;
                    double xl = -4.4,
                            x2 = 4.4,
                            h = (x2 - xl) / N;
                    for (int i = 1; i < N; ++i) {
                        double xx = xl + i * h;
                        double y1 = f(6.05, 14.22, 7.67, xx - h), y2 = f(6.05, 14.22, 7.67, xx + h);
                        y = f(6.05, 14.22, 7.67, xx);
                        double dy1 = y - y1, dy2 = y2 - y;
                        if (dy1 < 0 && dy2 > 0) {
                            System.out.printf("Min (%.3f, %.3f)\n", xx, y);
                        }
                        else if (dy1 > 0 && dy2 < 0) {
                            System.out.printf("Max (%.3f, %.3f)\n", xx, y);
                        }
                    }
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Неверные данные");
        }
    }

    private static double f(double a, double b, double c, double x) {
        return x * Math.atan(a * x - Math.tan((b * Math.cos(x))/(c * x - 2)));
    }
}