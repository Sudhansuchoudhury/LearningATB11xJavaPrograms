package ex_03_Literals;

public class Lab030_ASCII_Unicode {
    public static void main(String[] args) {
        char c10 = 'A';
        /*ASCII, (limited numbers) - A -> 65
         * These codes are used by Americans
         * Indians, Chinese are using Unicode
         */
        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60'; // :) unicode
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60'; //To get any type of Unicode search on Google
    }
}
