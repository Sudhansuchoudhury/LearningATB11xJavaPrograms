package Daily_Java_Task;

public class Task002_MathFunctions {
    public static void main(String[] args) {

        int X = 10, Y = 10, Z = 10;

        //1st Way
        System.out.println(Math.cbrt((X*X)+(Y*Y)-Math.abs(Z)));

       //2nd Way
        // Again given values to deduplicate the code
        int x = 10;
        int y = 10;
        int z = 10;

        // cube root of (x^2 + y^2 - |z|)
        double result = Math.cbrt((x*x) + (y*y) - Math.abs(z));
        System.out.println("Result: "+ result);


    }
}
