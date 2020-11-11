package pl.imiajd.krejner;

import java.time.LocalDate;

public class Flet extends Instrument{

    public Flet(String prod, LocalDate data){
        super(prod,data);
    }

    @Override
    public String dzwiek() {
        return "flututu";
    }
}
