package com.denisenko.HT10_2;

import com.denisenko.HT10_3.DivideByZeroException;

public class Main {

    public static void main(String[] args) {

        int[] array = {4, 2, 1, 0};
        int i1 = 1;
        int i2 = 5;
        int res;
        try {
            res = divide(array[i1], array[i2]);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            i1--;
            i2--;
            try {
                res = divide(array[i1], array[i2]);
                System.out.println(res);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            } catch (DivideByZeroException ex) {
                System.out.println("Dividing by = " + ex.getMessage());
            }
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
            i1--;
            i2--;
            try {
                res = divide(array[i1], array[i2]);
                System.out.println(res);
            } catch (DivideByZeroException ex) {
                System.out.println("Answer  = " + ex.getMessage() + "-> Exception is handled");
            }

        }
    }

    public static int divide(int a, int b) throws DivideByZeroException, ArrayIndexOutOfBoundsException {
        if (b == 0) {
            throw new DivideByZeroException(String.valueOf(b));
        }
        return a / b;
    }
}
