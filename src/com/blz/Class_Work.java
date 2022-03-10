package com.blz;

public class Class_Work<T extends Comparable<T>> {
    T x;
    T y;
    T z;

    public Class_Work(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        return Class_Work.maximum(x,y,z);
    }

    public static  <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
            System.out.println(max);
        } else if (z.compareTo(max) > 0) {
            max = z;
            System.out.println(max);
        } else System.out.println(max);
        return null; }

    public static void main(String[] args) {
        Integer xint = 122, yint = 22, zint = 55;
        Float xf = 2.2f, yf = 3.4f, zf = 10.5f;
        String str1 = "Rehan", str2 = "Rameez", str3 = "Sharmin";
        new Class_Work<>(xint, yint, zint).maximum();
        new Class_Work<>(xf, yf, zf).maximum();
        new Class_Work<>(str1, str2, str3).maximum();
    }
}


