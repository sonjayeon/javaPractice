public class ForHiLevelPractice {
    public static void main(String[] args) {
        int level = 5;
        for(int i=1; i<=level; i++) {
            for(int j=level-i; j>0; j--) {
                System.out.print("□");
            }
            for(int k=1; k<=i*2-1; k++) {
                System.out.print("■");
            }
            System.out.println("");
        }
    }
}