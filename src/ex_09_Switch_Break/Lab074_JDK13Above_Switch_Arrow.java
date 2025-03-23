package ex_09_Switch_Break;

public class Lab074_JDK13Above_Switch_Arrow {
    public static void main(String[] args) {
        // in JDK > 13
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
//   Here we don't need any break point. JDK 13 above will work with arrow mark only
        }
    }
}
