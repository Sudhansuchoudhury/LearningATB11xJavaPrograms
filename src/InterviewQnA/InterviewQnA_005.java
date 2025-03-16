package InterviewQnA;

public class InterviewQnA_005 {
    public static void main(String[] args) {
        int XYZ_salary = 50;
        boolean b = !(XYZ_salary > 20 || XYZ_salary < 10);
        System.out.println(b);

        // A - XYZ_salary > 10 -> 12 > 10 -> true
        // B -> XYZ_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
