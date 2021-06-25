package coding_game;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {

    }

    public static int findSmallestInterval(int[] numbers) {

       Arrays.sort(numbers);
        int interval = numbers[1]-numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[1]-numbers[0];
            if(temp < interval) interval = temp;
        }
        return interval;
    }


}
