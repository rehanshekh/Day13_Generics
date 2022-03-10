package com.blz;

public class UseCase {
    public static void main(String[] args) {

       // Integer xint = 65, yint = 85, zint = 22;
        Float xf = 9.7f, yf=17.66f, zf = 5.5f;
//        int max = xint;
//        if (yint.compareTo(max) > 0) {
//            max = yint;
//        }
//        if (zint.compareTo(max) > 0) {
//            max = zint;
//        }
//        System.out.println(max + " is max number");
        float max = xf;
        if (yf.compareTo(max) > 0) {
            max = yf;
        }
        if (zf.compareTo(max) > 0) {
            max = zf;
        }
        System.out.println(max + " is max number");

    }
}