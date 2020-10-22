package by.javatr.task3.main;

import by.javatr.service.Input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String number = Input.getStringFromIn();
        char [] numbers = number.toCharArray();
        for(char num : numbers) {
            stack.push(num);
        }

        while(!stack.empty()) {
            char stackNumber;
            stackNumber = stack.pop();
            System.out.print(stackNumber);
        }


    }
}

