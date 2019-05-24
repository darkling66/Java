package ua.edu.chmnu.fks.oop.lab9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lab9 {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File from = new File("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\Rin\\lab9\\from.txt");
        File to = new File("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\Rin\\lab9\\to.txt");

        //openFile(from, to);

        int c = 0;
        BufferedReader reader = new BufferedReader(new FileReader(new File(String.valueOf(from))));

        while ((c = reader.read()) != -1) {
            list.add(c);
        }

        reader.close();

        Writer writer = new FileWriter(to);
        for (int line : list) {
            if(isSimple(line)) {
                writer.write(line);
            }
//                тут мог бы быть пробел если надо в одну строку
            writer.write(System.getProperty("line.separator"));
        }
        writer.flush();
        if (writer != null) {
            writer.close();
        }
    }


    public static boolean isSimple(int k) {
        if (k % 2 == 0 && k != 2) {
            return false;
        }
        int maxDiv = (int) Math.sqrt(k);
        for (int i = 3; i <= maxDiv; i += 2) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*static void openFile(File from, File to) throws IOException {
        int c = 0;
        FileReader reader = new FileReader(from);
        // читаем посимвольно
        while((c=reader.read())!=-1){
            Scanner scan = new Scanner(from);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(scan.nextInt());
            System.out.print(list);
        }

        FileWriter writer = new FileWriter(to, false);
        if(isSimple(c)) {
            writer.write((char)c);
        }
        writer.append('\n');
        writer.flush();
    }*/


}
