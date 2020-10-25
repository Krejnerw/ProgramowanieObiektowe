package pl.edu.uwm.po.wklab4.Napisy.ZAD2i3;

import pl.edu.uwm.po.wklab4.Napisy.ZAD1.ZAD1;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ZAD2i3 {

    public static int countCharInFile(char c, String nazwa)throws FileNotFoundException
    {
        int countChar = 0;
        Scanner file = new Scanner(new File(nazwa));
        while(file.hasNextLine()){
            String line = file.nextLine();
            countChar += ZAD1.countChar(nazwa,c);
            }
        file.close();
        return countChar;
    }
    public static int countWord(String word, String nazwa)throws FileNotFoundException
    {
        int count = 0;
        Scanner file = new Scanner(new File(nazwa));
        while(file.hasNextLine()){
            String line = file.nextLine();
            count += ZAD1.countSubStr(line,word);
        }
        file.close();
        return count;
    }
}
