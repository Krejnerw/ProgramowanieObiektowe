package pl.edu.uwm.po.wklab4.Napisy.ZAD1;

public class ZAD1 {
    //    ZAD1 a
    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
//    ZAD1 b

    /**
     * metoda zlicza ilosc wystapien danego podciagu w ciagu str
     *
     * @param str    łańcuch znaków
     * @param subStr podłańcuch
     * @return
     */
    public static int countSubStr(String str, String subStr) {
        int count = 0;
        int subStrLength = subStr.length();
        for (int i = 0; i < str.length(); i++) {
            if (i + subStrLength > str.length()) {
                return count;
            }
            if (subStr.equals(str.substring(i, i + subStrLength))) {
                count++;
            }
        }
        return count;
    }
//    ZAD1 c

    /**
     * wypisuje srodkowy znak jesli dl napisu jest nie parzysta
     * jesli jest parzysta wypisuje 2 srodkowe znaki
     *
     * @param str łańcuch znaków
     * @return
     */
    public static String middle(String str) {
        double midIndD = str.length() / 2.;
        int midIndInt = str.length() / 2;
        if (midIndD > midIndInt) {
            System.out.println("wieksza niz");
            return str.substring(midIndInt, midIndInt + 1);
        } else {
            System.out.println("mniejsza niz");
            return str.substring(midIndInt - 1, midIndInt + 1);
        }
    }

    //    ZAD1 d
    public static String repeat(String str, int n) {
        String tmp = "";
        for (int i = 0; i < n; i++) {
            tmp = tmp.concat(str);
        }
        return tmp;
    }

    //    ZAD1 e
    public static int[] where(String str, String subStr) {
        int[] tab = new int[str.length()];
        int tmp = 0;
        int subStrLength = subStr.length();
        for (int i = 0; i < str.length(); i++) {
            if (i + subStrLength > str.length()) {
                return tab;
            }
            if (subStr.equals(str.substring(i, i + subStrLength))) {
                tab[tmp] = i;
                tmp++;
            }
        }
        return tab;
    }

    //    ZAD1 f
    public static String change(String str) {
        StringBuffer strBuff = new StringBuffer("");
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
                strBuff.append((char) ((int) str.charAt(i) - 32));
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                strBuff.append((char) ((int) str.charAt(i) + 32));
            }
        }
        str = strBuff.toString();
        return str;
    }

    //    ZAD1 g
    public static String nice(String str) {
        StringBuffer strBuff = new StringBuffer();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            strBuff.append(str.charAt(i));
            count++;
            if (count % 3 == str.length() % 3 && i != str.length() - 1) {
                strBuff.append("-");
            }
        }
        return strBuff.toString();
    }
//    ZAD1 h
    public static String nice(String str, String sep, int n){
        StringBuffer strBuff = new StringBuffer();
        int count = 0;
        for(int i=0; i<str.length();i++){
            strBuff.append(str.charAt(i));
            count++;
            if(count%n == str.length()%n && i != str.length()-1){
                strBuff.append(sep);
            }
        }
        return strBuff.toString();
    }
}
