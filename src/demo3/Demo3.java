package demo3;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("x=");
        int x = scanner.nextInt(); 
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
