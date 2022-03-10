package com.blz;

public class UseCase {
    public static void main(String[] args) {

        Integer xint = 65, yint = 85, zint = 22;
        UseCase.compute(xint, yint, zint);
        Float xf = 9.7f, yf = 17.66f, zf = 55.5f;
        UseCase.compute(xf, yf, zf);
        String xs = "Pear", ys = "Apple", zs = "Orange";
        UseCase.compute(xs, ys, zs);
    }

    public static <T extends Comparable<T>> void compute(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println(max + " is maximum");
    }
}