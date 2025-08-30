package javabasics;

public class patterns {
    public static void main(String[] args) {
        // inverted star pattern
        for (int i = 4; i >= 1; i--) {       // rows
            for (int star = 1; star <= i; star++) {  // stars in each row
                System.out.print("*");  // stay on same line
            }
            System.out.println(); // move to next line after row
        }
    }
}
