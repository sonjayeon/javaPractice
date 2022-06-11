import jdk.swing.interop.SwingInterOpUtils;

public class ifCalculatePractice {
    public static void main(String[] args) {
        double[] weight = {88.0, 55.0};
        for (int i = 0; i < weight.length; i++) {
            double height = 170.0;
            System.out.println("신장:" + height + "(cm)");
            System.out.println("체중:" + weight[i] + "(kg)");
            double BMI = (weight[i] / (Math.pow(height, 2))) * 10000;
            System.out.println("당신의 BMI 값은 " + BMI + "입니다.");
            if (BMI >= 26.5) {
                System.out.println("비만입니다.");
            } else if (BMI >= 24 && BMI < 25.5) {
                System.out.println("과체중입니다.");
            } else if (BMI >= 20 && BMI < 24) {
                System.out.println("정상입니다.");
            } else if (BMI >= 0 && BMI < 20) {
                System.out.println("저체중입니다.");
            }
            System.out.println();
        }
    }
}
