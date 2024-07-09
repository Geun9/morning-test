package test_20240709.test1;
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        String str= scan.nextLine();

        try {
            int result= convert(str);
            System.out.println("변환된 숫자는 " + result + " 입니다.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        }
    }

    private static int convert(String str) {
        return Integer.parseInt(str);
    }

}