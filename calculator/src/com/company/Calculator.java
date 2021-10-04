package com.company;

public class Calculator {
    private String sign; //Знак выражения
    private int firstNumber;
    private int secondNumber;

    public Calculator(String expression) throws Exception {
        expression = expression.trim(); //Убирает пробелы в начале и в конце строки
        String[] strings = expression.split(" "); //Преобразование строки в массив строк. В качестве разделителя используется пробел
        if (expression.isEmpty()) {
            throw new Exception("Введенное выражение пусто");
        }
        if (strings.length !=3) {
            throw new Exception("Выражение введено неверно");
        }
        firstNumber = Integer.parseInt(strings[0]); //Преобразует строковое число в целое число
        secondNumber = Integer.parseInt(strings[2]);
        sign = strings[1];
    }

    public void calculate() throws Exception {
        int result = 0;
        switch (sign) {
            case "+":
                result = sum(firstNumber, secondNumber);
                System.out.println(result);
                break;

            case "-":
                result = sub(firstNumber, secondNumber);
                System.out.println(result);
                break;

            case "/":
                result = div(firstNumber, secondNumber);
                System.out.println(result);
                break;
            case "*":
                result = mull (firstNumber, secondNumber);
                System.out.println(result);
                break;

            case "%":
                result = remainder(firstNumber, secondNumber);
                System.out.println(result);
                break;

            case "^":
                result = construction (firstNumber, secondNumber);
                System.out.println(result);
                break;

            default:
                throw new Exception("Знак задан неправильно");
        }
    }

    private int sum(int a, int b) { return a + b; }
    private int remainder(int a, int b){ return a % b;}
    private int sub(int a, int b){ return a - b;}
    private int mull (int a, int b){ return a * b;}
    private int div (int a, int b){ return a / b;}
    private int construction(int a, int b){return a ^ b;}
}

