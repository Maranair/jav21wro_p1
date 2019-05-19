package com.sda.powtorka;

import java.util.Scanner;

public class PowtorkaMain {
    public static void main(String[] args) {
        System.out.println("To write rectangle type 1");
        System.out.println("To write square type 2");
        System.out.println("To write triangle type 3");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sideA = 0, sideB = 0;

        switch (number) {
            case 1:
                System.out.println("Please insert lenght of sideA");
                sideA = scanner.nextInt();
                System.out.println("Please insert lenght of sideB");
                sideB = scanner.nextInt();
                Rectangle rec = new Rectangle(sideA, sideB);
                rec.draw();
                break;
            case 2:
                System.out.println("Please insert lenght of side");
                int side = scanner.nextInt();
                Square square = new Square(side);
                square.draw();
                break;


        }


    }
}
