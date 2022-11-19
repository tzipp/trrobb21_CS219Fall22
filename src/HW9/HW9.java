package HW9;

import java.math.BigInteger;
/*
Tzipporah Robbins
Homework 9
BIGPOW
 */

public class HW9 {


    public static BigInteger bigpow(BigInteger x, int y){
        BigInteger prod = BigInteger.ONE;
        for (int i = 0; i < y; i++)
            prod = prod.multiply(x);
        return prod;
    }

    /*
    Recursion POW
     */

    public static BigInteger fastbigpow(BigInteger x, int y){
        if (y == 1)
            return x;
        if (y % 2 == 0)
            return fastbigpow(x, y/2).multiply(fastbigpow(x, y/2));
        else
            return x.multiply(fastbigpow(x, y-1));

    }

    public static void main(String [] args){
        BigInteger x = new BigInteger("1098886988758757685");

        bigpow(x, 4);
        fastbigpow(x, 7);
    }

}
