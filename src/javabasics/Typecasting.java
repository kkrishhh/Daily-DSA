package javabasics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        int age = 13;
        if(age <= 18){//if else
            System.out.println("can vote");
        }else{
            System.out.println("you cant");
        }

    }
}
