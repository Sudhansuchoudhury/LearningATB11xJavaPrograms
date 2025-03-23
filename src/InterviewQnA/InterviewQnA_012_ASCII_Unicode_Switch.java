package InterviewQnA;

public class InterviewQnA_012_ASCII_Unicode_Switch {
    public static void main(String[] args) {
       // char ch= 'A';
        char ch = 'B';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
