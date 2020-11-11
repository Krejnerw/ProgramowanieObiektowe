package pl.imiajd.krejner;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String prod, LocalDate data){
        super(prod,data);
    }

    @Override
    public String dzwiek() {
        return "skrzypu skrzypu skrzyp";
    }
}
