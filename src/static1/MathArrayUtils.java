package static1;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        return Arrays.stream(values)
                .sum();
    }

    public static double average(int[] values) {
        return Arrays.stream(values)
                .average()
                .orElse(0.0);
    }

    public static int min(int[] values) {
        return Arrays.stream(values)
                .min()
                .orElse(0);
    }

    public static int max(int[] values) {
        return Arrays.stream(values)
                .max()
                .orElse(0);
    }
}
