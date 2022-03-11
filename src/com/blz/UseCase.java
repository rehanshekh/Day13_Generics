package com.blz;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Collections;

public class UseCase<T extends Comparable<T>> {
    T x;
    T y;
    T z;
    T r;

    public UseCase(T x, T y, T z, T r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }

    public static void main(String[] args) {

        Integer xint = 65, yint = 85, zint = 22, rint = 99;
        new UseCase(xint, yint, zint, rint).testmaximum();
        Float xf = 9.7f, yf = 17.66f, zf = 55.5f, rf = 69.4f;
        new UseCase(xf, yf, zf, rf).testmaximum();
        String xs = "Pear", ys = "Apple", zs = "Orange", rs = "Strawberry";
        new UseCase(xs, ys, zs, rs).testmaximum();
    }


    public static <T extends Comparable<T>> @Nullable T testmaximum(T... a) {
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(a[0] + " is maximum");
        return null;
    }

    public T testmaximum() {
        return UseCase.testmaximum(x, y, z, r);
    }
}
