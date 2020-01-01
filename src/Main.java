import java.util.HashMap;

public class Main {



    // A TreeMap is a great data structure to implement this function
    // with because it doesn't allow duplicate keys
    static int duplicatCount(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) == 1) {
                    count++;
                    map.put(s.charAt(i), 2);
                }
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        return count;
    }

    static int charToInt(String s) {
        int colInt = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (i == (s.length() - 1)) {
                int ascii = (int) s.charAt(i);
                ascii = ascii - 64;
                colInt = colInt + ascii;
            }
        else {
                colInt = colInt + 26;
            }
        }

        return colInt;
    }

    static char winner(String s) {
        char result = 'C';

        if (s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2)) {
            return s.charAt(0);
        }
        else if (s.charAt(3) == s.charAt(4) && s.charAt(3) == s.charAt(4)) {
            return s.charAt(3);
        }
        else if (s.charAt(6) == s.charAt(7) && s.charAt(6) == s.charAt(8)) {
            return s.charAt(6);
        }
        else if (s.charAt(0) == s.charAt(3) && s.charAt(0) == s.charAt(6)) {
            return s.charAt(0);
        }
        else if (s.charAt(1) == s.charAt(4) && s.charAt(7) == s.charAt(4)) {
            return s.charAt(1);
        }
        else if (s.charAt(2) == s.charAt(5) && s.charAt(2) == s.charAt(8)) {
            return s.charAt(2);
        }
        else if (s.charAt(0) == s.charAt(4) && s.charAt(0) == s.charAt(8)) {
            return s.charAt(0);
        }
        else if (s.charAt(2) == s.charAt(4) && s.charAt(2) == s.charAt(6)) {
            return s.charAt(2);
        }

        return result;
    }

    public static void main(String[] args){
        System.out.print(winner("A-OXAOXOA"));
    }
}



// Thanks for watching through that!