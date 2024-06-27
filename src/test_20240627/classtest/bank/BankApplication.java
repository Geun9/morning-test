package test_20240627.classtest.bank;

import java.util.Scanner;

public class BankApplication {
    static final String MENU_LIST_BORDER_LINE = "---------------------------------------------------";
    static final String MENU_BORDER_LINE = "----------";
    static final String MENU_LIST = "1.계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료";
    static final String MENU1 = "계좌 생성";
    static final String MENU2 = "계좌 목록";
    static final String MENU3 = "예금";
    static final String MENU4 = "출금";
    static final String MENU5 = "프로그램 종료";

    static int accountCreationCount = 0;
    static boolean isQuit = false;
    static Account[] account = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputMenuOption;

        while (!isQuit) {
            displayMenu();
            inputMenuOption = selectMenuOption();

            switch (inputMenuOption) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    getAccountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdrawal();
                    break;
                case 5:
                    quit();
                    break;
                default:
                    System.out.println("다시 입력해 주세요.");
            }
        }
    }

    static void displayMenu() {
        System.out.println(MENU_LIST_BORDER_LINE);
        System.out.println(MENU_LIST);
        System.out.println(MENU_LIST_BORDER_LINE);
    }

    static int selectMenuOption() {
        System.out.print("선택> ");
        return Integer.parseInt(sc.nextLine());
    }

    static void createAccount() {
        System.out.println(MENU_BORDER_LINE);
        System.out.println(MENU1);
        System.out.println(MENU_BORDER_LINE);
        account[accountCreationCount] = new Account();
        System.out.print("계좌번호: ");
        account[accountCreationCount].accountNumber = sc.nextLine();
        System.out.print("계좌주: ");
        account[accountCreationCount].accountHolder = sc.nextLine();
        System.out.print("초기 입금액: ");
        account[accountCreationCount].balance = Integer.parseInt(sc.nextLine());
        System.out.println("결과: 계좌가 생성되었습니다.");
        accountCreationCount++;
    }

    static void getAccountList() {
        System.out.println(MENU_BORDER_LINE);
        System.out.println(MENU2);
        System.out.println(MENU_BORDER_LINE);
        for (int i = 0; i < accountCreationCount; i++) {
            System.out.println(account[i].accountNumber + "\t" + account[i].accountHolder + "\t" + account[i].balance);
        }
    }

    static void deposit() {
        String inputAccountNum;

        System.out.println(MENU_BORDER_LINE);
        System.out.println(MENU3);
        System.out.println(MENU_BORDER_LINE);
        System.out.print("계좌번호: ");
        inputAccountNum = sc.nextLine();
        for (int i = 0; i < accountCreationCount; i++) {
            if (account[i].accountNumber.equals(inputAccountNum)) {
                System.out.print("예금액: ");
                account[i].balance += Integer.parseInt(sc.nextLine());
                break;
            }
        }

    }

    static void withdrawal() {
        String inputAccountNum;
        int withdrawalAmount;

        System.out.println(MENU_BORDER_LINE);
        System.out.println(MENU4);
        System.out.println(MENU_BORDER_LINE);
        System.out.print("계좌번호: ");
        inputAccountNum = sc.nextLine();
        for (int i = 0; i < accountCreationCount; i++) {
            if (account[i].accountNumber.equals(inputAccountNum)) {
                System.out.print("출금액: ");
                withdrawalAmount = Integer.parseInt(sc.nextLine());
                if (account[i].balance >= withdrawalAmount) {
                    account[i].balance -= withdrawalAmount;
                    System.out.println("결과: 출금이 성공되었습니다.");
                    break;
                }
                System.out.println("결과: 잔액이 부족합니다.");
                break;
            }
        }
    }

    static void quit() {
        System.out.println(MENU5);
        isQuit = !isQuit;
    }
}
