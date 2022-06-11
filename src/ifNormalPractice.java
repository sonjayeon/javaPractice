public class ifNormalPractice {
    public static void main(String[] args) {
        int[] age = {25, 18, 12, -2};

        for(int i=0; i<age.length; i++) {
            System.out.println("나이:" + age[i]);
            if(age[i] >= 20) {
                System.out.println("성인입니다.");
            } else if(age[i] >=0 && age[i] < 20) {
                System.out.println("미성년입니다.");
                if(age[i]<6 || age[i]>14) {
                    System.out.println("지금은 의무 교육을 받지 않습니다.");
                } else {
                    System.out.println("지금은 의무 교육을 받고 있습니다.");
                }
            } else {
                System.out.println("오류");
            }
            System.out.println();
        }
    }
}
