public class UnaryOperator {
    public static void main(String[] args) {
        //Unary Operator
        //++ & -- postInc & preInc ,PostDec & PreDec
        int i = 6;
        System.out.println("i value = " + i);
        System.out.println("i value after pre increment = " + ++i);//7
        System.out.println("i value after post increment = " + i++);//7
        System.out.println("i value = " + i);


        int j = 7;
          System.out.println("j value = " + j);//7
            System.out.println("j value after pre decrement = " + --j);//6
            System.out.println("j value after post decrement = " + j--);//6
            System.out.println("j value = " + j);//5
    }
}
