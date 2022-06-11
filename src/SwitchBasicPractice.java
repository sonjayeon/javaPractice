public class SwitchBasicPractice {
    public static void main(String[] args) {
        int[] month = {1, 2, 4, 13};
        for(int i=0; i< month.length; i++) {
            System.out.println(month[i] + "월");
            switch (month[i]) {
                case 1: case 3: case 5: case 7: case 8:
                case 10: case 12:
                    System.out.println(month[i]+"월은 31일까지");
                    break;
                case 2:
                    System.out.println(month[i]+"월은 28일 또는 29일까지");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println(month[i]+"월은 30일까지");
                    break;
                default:
                    System.out.println("오류");
            }
            System.out.println();
        }
    }
}
