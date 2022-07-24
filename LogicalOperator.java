public class LogicalOperator {
    public static void main(String[] args) {
        // Logical Operators && ,||
        System.out.println("Result = " + ((20 > 30) && (5 > 8)));
        System.out.println("Result = " + ((20 < 30) && (5 > 8)));
        System.out.println("Result = " + ((20 < 30) && (5 < 8)));
        System.out.println("Result = " + ((20 < 30) || (5 < 8)));
        System.out.println("Result = " + ((10 > 20) || (7 < 5)));
    }
}
