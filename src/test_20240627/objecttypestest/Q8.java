package test_20240627.objecttypestest;

public class Q8 {

    public static void main(String[] args) {
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };
        int total = 0;
        int cnt = 0;
        int avg;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
                cnt++;
            }
        }
        avg = total / cnt;

        System.out.println("총합: " + total + "\n평균: " + avg);
    }
}
