// import java.util.Arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int key = 40;
        System.out.println(Arrays.binarySearch(array, key));

    }
}
