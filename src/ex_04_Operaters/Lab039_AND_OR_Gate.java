package ex_04_Operaters;

public class Lab039_AND_OR_Gate {
    public static void main(String[] args){
        // || - OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);// Only in this case the value will be false and others are true

        //  And  && // only true && true returns true
        // T || T -> T  Here the final value will be true and others are false
        // T || F -> F
        // F || T -> F
        // F || F -> F

       // &&- AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        boolean c= true || false;
        System.out.println(c);
        /*Here it follows the OR Gate
         * So here the result will be True
         */
    }
}
