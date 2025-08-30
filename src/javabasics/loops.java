package javabasics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int userInput = sc.nextInt();
        int counter = 1;
        while (counter <= userInput){ //while will execute till conditions true;
            System.out.println(counter + " ");
            counter++;
        }
    }
}
