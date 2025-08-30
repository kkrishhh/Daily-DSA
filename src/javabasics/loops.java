package javabasics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num:");
        int userInput = sc.nextInt();
        int counter = 1;
        while (counter <= userInput){ //while will execute till conditions true;
            System.out.print(counter + " ");
            counter++;
            System.out.println(" ");
        }
        //print reverse num
        int n = 10899;
        while (n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n/10;
        }

    }
}
