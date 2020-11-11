package pl.imiajd.krejner;

import java.time.LocalDate;

abstract class Instrument {

    public Instrument(String producent, LocalDate data){
        this.producent = producent;
        this.rokProdukcji = data;
    }
    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public abstract String dzwiek();

    @Override
    public boolean equals(Object b){
        return this.dzwiek().equals(b);
    }
//    public boolean equals(Object obj) {
//        return this.toString().equals(obj.toString());
//    }

    @Override
    public String toString(){
        return "Producent: "+producent+"\nrok produkcji: "+rokProdukcji;
    }
    private String producent;
    private LocalDate rokProdukcji;
}
