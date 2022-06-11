public class ifBasicPractice {
    public static void main(String[] args) {
        int[] value = {16, 15, 50};

        for (int i = 0; i < value.length; i++) {
            System.out.println("value:" + value[i]);
            if (value[i] % 2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
            if (value[i] % 3 == 0) {
                System.out.println("3의 배수입니다.");
            }
            if (value[i] % 4 == 0) {
                System.out.println("4의 배수입니다.");
            }
            if (value[i] % 5 == 0) {
                System.out.println("5의 배수입니다.");
            }
            System.out.println();
        }
    }
}

