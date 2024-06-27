package test_20240627.classtest.member;

public class MemberService {

    boolean login(String id, String password) {
        boolean isValidLogin = false;

        if (id.equals("hong") && password.equals("12345")) {
            isValidLogin = !isValidLogin;
        }

        return isValidLogin;
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

}
