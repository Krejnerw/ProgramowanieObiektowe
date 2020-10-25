package pl.edu.uwm.po.wklab4.ZmienneBig;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class ZmienneBig{
    public static BigInteger zad4a(int n){
        BigInteger sum = new BigInteger("0");
        BigInteger tmp = new BigInteger("1");
        BigInteger mn = new BigInteger("2");
//        System.out.println(tmp);
        if (n == 1){
            return tmp;
        }
        for(int i=0; i<n; i++){
            sum = sum.add(tmp);
            tmp = tmp.multiply(mn);
        }
        sum = sum.multiply(BigInteger.valueOf(n));
        return sum;
    }
    public static BigInteger Zad4b(int n){
        BigInteger sum = new BigInteger("0");
        BigInteger tmp = new BigInteger("1");
        BigInteger mn = new BigInteger("2");
        if (n == 1){
            return tmp;
        }
        for(int i=0; i<n*n; i++){
            sum = sum.add(tmp);
            tmp = tmp.multiply(mn);
        }
        return sum;
    }
    public static BigDecimal zad5(double k, double p, int n){
        BigDecimal kapital = new BigDecimal(String.valueOf(k));
        BigDecimal stopa = new BigDecimal(String.valueOf(p));
        for(int i=0;i<n;i++){
            kapital = kapital.add(kapital.multiply(stopa));
        }
        return kapital.setScale(2, RoundingMode.HALF_UP);
    }
}
