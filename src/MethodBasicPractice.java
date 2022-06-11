public class MethodBasicPractice {
    public static void main(String[] args) {
        display("테스트", 5);
    }
    public static void display(String s, int v) {
        for(int i=1; i<=v; i++) {
            System.out.println(s);
        }
    }
}
