import java.util.Arrays;

public class ArrayCircularAlgorithm {
    public static void rotLeft(int d) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++){
            a[i] = a[d++];

            if (d == a.length) {
                d = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
