package com.bridgelabz;

/**
 * @author : Anji Raj Ardula
 * @version :16.0
 * @since  :16/10/2021
 */

public class Maximum {
    public static void main(String[] args) {
        Maximum.findMaximum(1.5f,5.5f,6.7f);

    }
    public static Float findMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(a)>0 && b.compareTo(c)>0) {
            max = b;
        } if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println(max);
        return max;
    }
}
