package com.blz;

public class UseCase<T extends Comparable<T>> {
    T x;
    T y;
    T z;

    public UseCase(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {

        Integer xint = 65, yint = 85, zint = 22;
        new UseCase(xint, yint, zint).testmaximum();
        Float xf = 9.7f, yf = 17.66f, zf = 55.5f;
        new UseCase(xf, yf, zf).testmaximum();
        String xs = "Pear", ys = "Apple", zs = "Orange";
        new UseCase(xs, ys, zs).testmaximum();
    }

    public static <T extends Comparable<T>> T testmaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println(max + " is maximum");
        return null;
    }

    public T testmaximum() {
        return UseCase.testmaximum(x, y, z);
    }
}
