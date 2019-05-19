package com.sda.bubleSorting;

import java.util.Random;

public class BubleMain {
    static void bubbleSort(int[] Tab) {
        int n = Tab.length;
        int temp = 0;

        for(int i = 0; i < n; i++) {
            for(int j=1; j < (n-i); j++) {
                if(Tab[j-1] > Tab[j]) {
                    temp = Tab[j-1];
                    Tab[j-1] = Tab[j];
                    Tab[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
    int Tab[] = new int[20];


            Random r = new Random();
            for (int i = 0; i<Tab.length; i++) {
                Tab[i] = r.nextInt(26 - 5);
                System.out.println(Tab[i]);
        }

        System.out.println();
        bubbleSort(Tab);
        System.out.println("Array After Bubble Sort");

        for(int i = 0; i < Tab.length; i++) {
            System.out.print(Tab[i] + " ");
        }
    }
}

