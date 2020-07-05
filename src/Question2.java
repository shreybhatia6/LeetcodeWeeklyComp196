public class Question2 {

    public int getLastMoment(int n, int[] left, int[] right) {

        int maxTime = Integer.MIN_VALUE;

        for (int i = 0; i < left.length; i++) {
            if (left[i] > maxTime) {
                maxTime = left[i];
            }
        }

        for (int i = 0; i < right.length; i++) {
            if (n - right[i] > maxTime) {
                maxTime = n - right[i];
            }
        }
        return maxTime;
    }
}
