package com.blz;

public class UseCase {
    public static void main(String[] args) {

        Integer xint = 65, yint = 85, zint = 22;
        int max = xint;
        if (yint.compareTo(max) > 0) {
            max = yint;
        }
        if (zint.compareTo(max) > 0) {
            max = zint;
        }
        System.out.println(max + " is max number");


    }
}