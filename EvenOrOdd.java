package LEC3;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Int Number:");
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.println(N + " is even");
        } else {
            System.out.println(N + " is odd");
        }
    }
}

