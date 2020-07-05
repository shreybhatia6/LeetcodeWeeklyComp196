import java.util.Arrays;

public class Question1 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif = arr[1]-arr[0];
        int i = 2;
        while (i < arr.length){
            if (arr[i] == arr[i-1]+dif)
                i++;
            else
                return false;
        }
        return true;
    }

}
