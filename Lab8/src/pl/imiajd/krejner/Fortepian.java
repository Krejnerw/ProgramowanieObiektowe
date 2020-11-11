package pl.imiajd.krejner;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String prod, LocalDate data){
        super(prod,data);
    }

    @Override
    public String dzwiek() {
        return "dadada da";
    }
}
