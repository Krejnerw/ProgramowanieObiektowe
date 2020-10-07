package pl.edu.uwm.po.wklab1;

public class ZAD3_10do12 {
    public static void ZAD10(){
        System.out.println("ZAD10:");
        String[] a = {"AG","WC","KA"};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void ZAD11(){
        System.out.println("ZAD11:");
        System.out.println("Lalala jam jest wiersz bialy\n" +
                "prawie wspanialy\n" +
                "po co mi kropki\n" +
                "przecinki i zwrotki\n" +
                "jam jest wiersz bialy\n" +
                "niedlugi lecz bialy");
    }
    public static void ZAD12(){
        System.out.println("ZAD12:");
        for(int i=0;i<13;i++){
            if(i<7){
                if(i%2==0) {
                    System.out.println("*   *   *   *   *   * =================================");
                }
                else{
                    System.out.println("  *   *   *   *   *   =================================");
                }
            }
            else{
                System.out.println("=======================================================");
            }
        }
    }
    public static void main(String[] args){
        ZAD10();
        ZAD11();
        ZAD12();
    }
}
