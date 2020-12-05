import java.util.*;

public class Kolekcja{
    public static <T extends Iterable<?>> void print(T obj){
        Iterator<?> iter = obj.iterator();
        int tmp = 0;
        while (iter.hasNext()){
            System.out.print(iter.next());
            if (iter.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static <T> void redukuj(LinkedList<T> pracownicy, int n){
        Collection<T> col = pracownicy;
        Iterator<T> iter = col.iterator();
        int tmp = 1;
        while (iter.hasNext()){
            iter.next();
            if ( tmp != n){
                tmp++;
            }else{
                iter.remove();
                tmp = 1;
            }
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        for (int i = 0; i< lista.size()/2; i++){
             T elem = lista.set(i, lista.get(lista.size() - 1 - i) );
             lista.set(lista.size() - 1 - i, elem);
        }
    }

   public static String naOpak(String tekst){
       List<String> listaZdan = Arrays.asList(tekst.split(" "));
       Stack<String> stos = new Stack<>();
       Iterator<String> iter = listaZdan.listIterator();
       StringBuilder zdanie = new StringBuilder("");

       while (iter.hasNext()){
           String elem = iter.next();
           stos.push(elem);
//           if((int) elem.charAt(elem.length()-1)== (int)'.'){
           if(elem.endsWith(".")){

               String first = stos.pop().replace('.',' ');
               first = first.substring(0,1).toUpperCase() + first.substring(1);
               zdanie.append(first);

               while(!stos.isEmpty()){
                   zdanie.append(stos.pop().toLowerCase());
                   if (!stos.isEmpty()){
                       zdanie.append(" ");
                   }
               }
               zdanie.append(". ");
           }
       }
       return zdanie.toString();
   }
   public static void printCyfry(int liczba){
        Stack <Integer> stos = new Stack<>();
        while (liczba != 0){
            int elem = liczba%10;
            stos.push(elem);
            liczba = liczba/10;
        }
        while (!stos.isEmpty()){
            System.out.print(stos.pop()+" ");
        }
       System.out.println();
   }

   public static void sitoEratostenesa(int n){
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for( int i = 2; i<=n; i++){
            pierwsze.add(i);
        }
        Iterator<Integer> zbior = pierwsze.iterator();
        int modulo = zbior.next();
        int tmp = 1;

        while(modulo < Math.sqrt(n)){
            while (zbior.hasNext()){

                int elem = zbior.next();
                if( elem% modulo == 0){
                    zbior.remove();
                }
            }
            tmp++;
            zbior = pierwsze.iterator();

            for( int i = 0; i<tmp;i++){
                modulo = zbior.next();
            }
        }
       System.out.println("liczby pierwsze od 2 do " + n +" to:");
       System.out.println(pierwsze);
   }
}
