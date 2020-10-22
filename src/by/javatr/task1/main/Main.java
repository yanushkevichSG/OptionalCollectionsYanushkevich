package by.javatr.task1.main;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(new File("input1.txt"));
             FileWriter writer = new FileWriter(new File("output1.txt"))) {
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                writer.write(list.get(i) + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
