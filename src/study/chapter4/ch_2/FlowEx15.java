package study.chapter4.ch_2;

public class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i\t2*u\t2*i-1\ti*i\t11-i\ti%3\ti/3");
        System.out.println("----------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d\t %d\t%d\t%d\t%d\t%d\t%d\t\n",i,2*i,2*i-1,i*i,11-i, i%3,i/3);
        }
    }
}
