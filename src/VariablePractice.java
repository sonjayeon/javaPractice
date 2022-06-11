class  Orange{
        int orange;
        int num;
        int total;

        Orange(int orange, int num) {
           this.orange = orange;
           this.num = num;
           this.total = orange * num;
        }
}
class VariablePractice {
    public static void main(String[] args) {
        Orange o = new Orange(1300, 6);
        System.out.println("오렌지의 가격: " + o.orange);
        System.out.println("오렌지 갯수: " + o.num);
        System.out.println("오렌지 총합 : " + o.total);
    }
}
