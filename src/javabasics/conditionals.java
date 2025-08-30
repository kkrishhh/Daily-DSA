package javabasics;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 23;
        if(num1 >= num2){
            System.out.println("num 1 is largest");
        }else{
            System.out.println("num 2 is largest");
        }
        //odd even
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

    }
}
