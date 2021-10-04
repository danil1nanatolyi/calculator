package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expression = in.nextLine();

        Calculator calc = new Calculator(expression);
        calc.calculate();
    }
}