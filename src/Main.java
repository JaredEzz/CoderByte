import java.util.*;
import java.io.*;

class Main {
    public static String TimeConvert(int num) {

        int hours;
        int minutes;

        if (num >= 60) {
            hours = num / 60;
            minutes = num % 60;
        } else {
            minutes = num;
            hours = 0;
        }



        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        return String.valueOf(hours) + ':' + String.valueOf(minutes);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(TimeConvert(45));
    }

}
