package test_20240627.objecttypestest;

public class Q7 {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = 0;

        for (int arr : array) {
            max = max < arr ? arr : max;
        }

        System.out.println(max);
    }
}
