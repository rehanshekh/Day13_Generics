package com.blz;

public class UseCase {
    public static void main(String[] args) {

        // Integer xint = 65, yint = 85, zint = 22;
//        Float xf = 9.7f, yf=17.66f, zf = 55.5f;
        String xs = "Pear", ys = "Apple", zs = "Orange";
//        int max = xint;
//        if (yint.compareTo(max) > 0) {
//            max = yint;
//        }
//        if (zint.compareTo(max) > 0) {
//            max = zint;
//        }
//        System.out.println(max + " is max number");
//       float maxt = xf;
//        if (yf.compareTo(maxt) > 0) {
//            maxt = yf;
//        }
//        if (zf.compareTo(maxt) > 0) {
//            maxt = zf;
//        }
//        System.out.println(maxt + " is max number");

        if ((ys.compareTo(xs) > 0) && (ys.compareTo(zs) > 0)) {
            System.out.println(ys + " is max String");
        }
        if ((zs.compareTo(xs) > 0) && (zs.compareTo(ys) > 0)) {
            System.out.println(zs + " is max String");
        }
        if ((xs.compareTo(ys) > 0) && (xs.compareTo(zs) > 0)) {
            System.out.println(xs + " is max String");
        }
    }
}