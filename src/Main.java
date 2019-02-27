import java.util.*;
import java.io.*;

class Main {
    public static String AlphabetSoup(String str) {

        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c < 'z'; c++) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSoup("coderbyte"));
    }

}