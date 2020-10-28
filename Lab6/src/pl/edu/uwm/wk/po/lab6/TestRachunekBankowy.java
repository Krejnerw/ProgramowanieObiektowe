package pl.edu.uwm.wk.po.lab6;

public class TestRachunekBankowy {
    public static void main(String[] args){
        RachunekBankowy saver1 = new RachunekBankowy(2000.00);
        RachunekBankowy saver2 = new RachunekBankowy(3000.00);

        RachunekBankowy.setRocznaStopaProcentowa(0.04);
//        System.out.println(RachunekBankowy.rocznaStopaProcentowa);

        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());

        RachunekBankowy.setRocznaStopaProcentowa(0.05);

        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());

        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

//        System.out.println(saver1.toString());
//        System.out.println(saver2.toString());
    }
}
