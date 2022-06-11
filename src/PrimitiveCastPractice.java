public class PrimitiveCastPractice {
    public static void main(String[] args) {
        short s1 = 65;
        byte b = (byte)s1;
        char c = (char)b;
        short s2 = (short)(s1+b);

        System.out.println(s1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s2);

    }
}
