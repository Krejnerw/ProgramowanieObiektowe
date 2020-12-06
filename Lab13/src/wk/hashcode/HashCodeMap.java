package wk.hashcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HashCodeMap {
    private Map<Integer, HashSet<String>> wordsHashSet;

    public HashCodeMap() {
        wordsHashSet = new HashMap<>();
        wczytajPlik();
    }

    private void wczytajPlik() {
        try {
            File file = new File("E:\\Users\\weron\\Documents\\ProgramowanieObiektowe\\Lab13\\src\\wk\\hashcode\\DlugiTekst.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                String word = scan.next();
                if( word.endsWith(".") || word.endsWith(",")){
                   word = word.substring(0,word.length()-1);
                }
                HashSet<String> words = new HashSet<>();
                words.add(word);
                wordsHashSet.put(words.hashCode(), words);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public void show() {
        boolean AllSingleValues = true;
        for (Map.Entry<Integer, HashSet<String>> hash : wordsHashSet.entrySet()) {
            Integer key = hash.getKey();
            HashSet<String> values = hash.getValue();
            System.out.println(key + ": " + values);
            if (values.size() > 1) {
                System.out.println(key + ": " + values);
                AllSingleValues = false;
            }

        }
        if (AllSingleValues) {
            System.out.println("zaden hashCode sie nie powtorzyl");
        }
    }


}
