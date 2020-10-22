package by.javatr.task2.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(new File("input2.txt"));
             FileWriter writer = new FileWriter(new File("output2.txt"))) {
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i) + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}