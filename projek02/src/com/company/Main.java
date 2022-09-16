package com.company;

import java.util.Scanner;

public class Main {
    /* static void =() {
         for (int i = 0; i < ; i++){

         }
         //fori
         int[] a ={0, 1, 2, 3};

         for (int i : a){

         }
     }*/


   /* static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadejte počet opakování:");
        int pocetOpakovani = sc.nextInt();
        fibSeq(0, 1, pocetOpakovani);

    }

    static void fibSeq(int a, int b, int rounds) {
        if (rounds == 0) return;
        if (a == 0) System.out.println(a + " " + b);
        int c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
        rounds = rounds - 1;
        fibSeq(a, b, rounds);
    }*/


    /* palindrom = umí číst obráceně
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        palindrom();
    }

    static void palindrom() {
        String tyna = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(tyna);
        stringBuilder.reverse();
        if (tyna.equals(stringBuilder.toString())) {
            System.out.println("Je palindrom");
        } else {
            System.out.println("Není palindrom");
        }
    }*/
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        count(userImput());

    }

    static void count(String sentence) {
        String[] pes = sentence.split(" ");
        System.out.println("Počet slov je: " + pes.length);
    }

    static String userImput() {
        return sc.nextLine();
    }
}








