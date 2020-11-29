package pl.imiajd.krejner;

import javax.lang.model.type.NullType;

public class Adres {

//    public Adres(String ul, int nr_d, int nr_m, String miasto = null, String kod_p = null){

    /**
     *
     * @param ul String ulicy
     * @param nr_d int nr domu
     * @param nr_m int nr mieszkania
     * @param miasto String miasta
     * @param kod_p String kodu-pocztowego np '10-963'
     */
    public Adres(String ul, int nr_d, int nr_m, String miasto , String kod_p){
        this.ulica = ul;
        this.nr_domu = nr_d;
        this.nr_mieszkania = nr_m;
        this.miasto = miasto;
        this.kod_pocztowy = kod_p;
    }
    public Adres(String ul, int nr_d, String miasto , String kod_p){
        this.ulica = ul;
        this.nr_domu = nr_d;
        this.miasto = miasto;
        this.kod_pocztowy = kod_p;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void pokaz(){
        System.out.println(miasto+" "+kod_pocztowy);
        if(nr_mieszkania != 0){
            System.out.println(ulica+" "+nr_domu+"/"+nr_mieszkania);
        }
        else{
            System.out.println(ulica+" "+nr_domu);
        }
    }
//    Zdefiniuj także metodę public boolean przed,
//    która sprawdza, czy dany adres występuje przed innym (porównuj tylko kody pocztowe).
    public boolean przed(String kod_p){
        for(int i=0; i<this.kod_pocztowy.length();i++){
            if(this.kod_pocztowy.charAt(i) < kod_p.charAt(i)){
                return true;
            }
            if(this.kod_pocztowy.charAt(i) > kod_p.charAt(i)){
                return false;
            }
        }
        return false;
    }

    private String ulica;
    private int nr_domu;
    private int nr_mieszkania;
    private String miasto;
    private String kod_pocztowy;
}
