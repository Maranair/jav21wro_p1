package com.sda.bunny;

import java.util.Scanner;

public class BunnyCounter {
    public static void main(String[] args) {
        System.out.println("Insert month number");
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int bNop = 0, bNo = 1;
        System.out.println(bunnyCounterRecurence(n, bNo, bNop));

    }
    static int bunnyCounterRecurence(int n, int bNo, int bNop){
        int tmp = bNo + bNop;
        bNop = bNo;
        bNo = tmp;
        int i = 2;
        i++;
        if (i<n)
        return bunnyCounterRecurence(n, bNo, bNop);
        else
            return bNo;


    }

}
