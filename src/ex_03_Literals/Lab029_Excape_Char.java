package ex_03_Literals;

public class Lab029_Excape_Char {
    public static void main(String[] args){
        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("Sudhansu Choudhury");
        System.out.println("Sudhansu"+new_line+"Choudhury"); //For writing choudhury in next line
        System.out.println("Sudhansu"+tab_line+"Choudhury"); // Tab between 1st & Last name
        System.out.println("Sudhansu"+back_space+"Choudhury");// Back space upto last letter
        System.out.println("Sudhansu"+carriage_return+"Choudhury");//Delete the last (Sudhansu) word/ sentence

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


    }
}
