package study.chapter4.ch_2;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        int num=0;
        System.out.println("*을 출력할 라인수를 입력하세요");
        Scanner scanner=new Scanner(System.in);
        String tmp=scanner.nextLine();
        num=Integer.parseInt(tmp);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
