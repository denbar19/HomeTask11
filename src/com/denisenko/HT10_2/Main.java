package com.denisenko.HT10_2;

import com.denisenko.HT10_3.DivideByZeroException;

public class Main {

    public static void main(String[] args) throws DivideByZeroException, ArrayIndexOutOfBoundsException {

        double[] array = {1, 2, 0};
        int i1 = 1;
        int i2 = 2;
        double res;
        try {
            res = array[i1] / array[i2];
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            i1--;
            i2--;
            try {
                res = array[i1] / array[i2];
                System.out.println(res);
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new ArrayIndexOutOfBoundsException();
            } catch (DivideByZeroException ex) {
                throw new DivideByZeroException("don't divide by 0");
            }
        } catch (DivideByZeroException e) {
            i1--;
            i2--;
            try {
                res = array[i1] / array[i2];
                System.out.println(res);
            } catch (DivideByZeroException ex) {
                throw new DivideByZeroException("array[i2]");
            }

        }
    }
}
