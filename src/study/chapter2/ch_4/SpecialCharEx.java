package study.chapter2.ch_4;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');               // '''처럼할수없다
        System.out.println("abc\t123\b456");    // /b에의해 3이 지워진다
        System.out.println('\n');               // 개행(new line)문자 출력하고 개행
        System.out.println("\"Hello\"");        //큰따옴표를 출력하려면 이렇게 한다.
        System.out.println("c:\\");
    }
}
