package test_20240627.objecttypestest;

import java.util.Scanner;

public class Q9 {
    static Scanner sc = new Scanner(System.in);
    static final String MENU_BORDER_LINE = "---------------------------------------------------";
    static final String MENU_LIST = "1. 학생 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료";
    static int studentNum;
    static int[] scores;
    static int totalScore;
    static int bestScore;
    static double avgScore;
    public static void main(String[] args) {
        Q9 q9 = new Q9();
        boolean isQuit = false;
        int inputMenuNum;
        while (!isQuit) {
            System.out.println(MENU_BORDER_LINE);
            System.out.println(MENU_LIST);
            System.out.println(MENU_BORDER_LINE);
            System.out.print("선택> ");
            inputMenuNum = sc.nextInt();

            switch (inputMenuNum) {
                case 1:
                    q9.studentCnt();
                    break;
                case  2:
                    q9.inputStudentScore();
                    break;
                case 3:
                    q9.scoreList();
                    break;
                case 4:
                    q9.analysis();
                    break;
                case 5:
                    isQuit = !isQuit;
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }

    void studentCnt() {
        studentNum = 0;
        System.out.print("학생수> ");
        studentNum = sc.nextInt();
        scores = new int[studentNum];
    }

    void inputStudentScore() {
        for (int i = 0; i < studentNum; i++) {
            System.out.printf("scores[%d]> ", i);
            scores[i] = sc.nextInt();
        }
    }

    void scoreList() {
        for (int i = 0; i < studentNum; i++) {
            System.out.printf("scores[%d]: %d\n", i, scores[i]);
        }
    }

    void analysis() {
        bestScore = 0;
        for (int score : scores) {
            bestScore = bestScore > score ? bestScore : score;
            totalScore += score;
        }
        avgScore = (double) totalScore / studentNum;

        System.out.println("최고 점수: " + bestScore);
        System.out.printf("평균 점수: %.1f\n", avgScore);
    }
}
