package com.techtraversal.bittwiddling;


public final class ShiftOperators {

    private ShiftOperators() {}

    public static void main(String[] args) {

        final int posNum = 7,       // 0b0000_0000_0000_0000_0000_0000_0000_0111
                  negNum = -9;      // 0b1111_1111_1111_1111_1111_1111_1111_0111

        int shift = 2;
        // left shift
        print(posNum, posNum << shift, "<<", shift);
        print(negNum, negNum << shift, "<<", shift);

        // signed right shift
        print(posNum, posNum >> shift, ">>", shift);
        print(negNum, negNum >> shift, ">>", shift);

        // unsigned right shift
        print(posNum, posNum >>> shift, ">>>", shift);
        print(negNum, negNum >>> shift, ">>>", shift);
    }

    private static void print(int a, int b, String op, int shiftVal) {
        String out = String.format("Before: %2d (%s),\tAfter %3s shift by %d: %10d (%s)",
                a, String.format("%32s", Integer.toBinaryString(a)).replace(" ", "0"),
                op, shiftVal,
                b, String.format("%32s", Integer.toBinaryString(b)).replace(" ", "0"));
        System.out.println(out);
    }
}
