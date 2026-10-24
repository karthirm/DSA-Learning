import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        System.out.println("Streams approach");
        int[] array = {34,45,6,7,89,91};
        System.out.println(Arrays.stream(array).boxed().
        sorted(Collections.reverseOrder())
        .distinct().skip(1).findFirst());

        System.out.println("Second approach");
        Arrays.sort(array);
        System.out.println("Second largest is: "+ 
        array[array.length-2]);

        System.out.println("third approach");
        int secondMax = array[0];
        int max = array[1];
        for(int element: array){
            if(element > max ) {
                secondMax = max;
                max = element;
            } else if(element>secondMax && element < max) {
                secondMax = element;
            }
        }
        System.out.println("Second largest ele is :"+ secondMax);

    }
}
