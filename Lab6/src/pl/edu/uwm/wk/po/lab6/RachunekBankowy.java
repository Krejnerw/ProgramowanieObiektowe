package pl.edu.uwm.wk.po.lab6;

public class RachunekBankowy extends Object {
    public static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }
    public double obliczMiesieczneOdsetki(){
        this.saldo += this.saldo*rocznaStopaProcentowa/12;
        return this.saldo*rocznaStopaProcentowa/12;
    }
    public static void setRocznaStopaProcentowa(double value){
        rocznaStopaProcentowa = value;
    }
    public double getSaldo(){
        return this.saldo;
    }
//    @Override
//    public String toString(){
//        return "Saldo: "+this.saldo;
//    }
}
