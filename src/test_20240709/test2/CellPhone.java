package test_20240709.test2;

public class CellPhone {

    private String model;
    private double battery;
    private static final int MAX_CHARGE = 100;
    private static final int MIN_CHARGE = 0;
    public CellPhone() {}

    public CellPhone(String model) {
        this.model = model;
    }

    public void call(int time) {
        if (0 > time) {
            throw new IllegalArgumentException("통화 시간 입력 오류");
        }

        System.out.println("통화 시간 : " + time + "분");
        this.battery -= (time * 0.5);
    }

    public void charge(int time) {
        if (0 > time) {
            throw new IllegalArgumentException("충전 시간 입력 오류");
        }

        System.out.println("충전 시간 : " + time + "분");
        this.battery += (time * 3);

    }

    public void printBattery() {
        if (this.battery > MAX_CHARGE) {
            this.battery = MAX_CHARGE;
        } else if (MIN_CHARGE > this.battery) {
            this.battery = MIN_CHARGE;
        }

        System.out.println("남은 배터리 양 : " + this.battery);
    }

}
