package javabasics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                System.out.println("enter number1");
        int number1 = input.nextInt();
                System.out.println("enter num2");
        int number2 = input.nextInt();
                System.out.println("enter operator");
        char operator = input.next().charAt(0);

        switch(operator){
            case '+' :
                System.out.println(number1 + number2);
            case '-' :
                System.out.println(number1 - number2);
            case '*' :
                System.out.println(number1 * number2);
            case '/' :
                System.out.println(number1 / number2);
            case '%' :
                System.out.println(number1 % number2);
        }

    }
}
