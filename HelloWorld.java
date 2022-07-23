public class HelloWorld {
    public static void main(String[] args) {

        int x = 10;
        int y = 20 - x;
        System.out.println(y);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.toBinaryString(Byte.MAX_VALUE));

        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.toBinaryString(2147483647));
        System.out.println(Integer.toBinaryString(2147483647).length());
    }
}

