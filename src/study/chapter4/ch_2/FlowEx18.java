package study.chapter4.ch_2;

import java.util.Scanner;

public class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.printf("%d * %d = %d",i,j,i*j);
            }
            System.out.println();
        }
    }
}
