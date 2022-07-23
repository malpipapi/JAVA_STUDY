package study.chapter2.ch_1;

public class varEx1 {

    public static void main(String[] args) {
        int year=0;
        int age=0;

        System.out.println("age = " + age);
        System.out.println("year = " + year);

        year= age+2000; // 변수 age의 값에 2000을 더해서 변수 year 에 저장
        age =age+1; //변수 age의 값에 1을더해서 다시 변수 age에 저장
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }

}
