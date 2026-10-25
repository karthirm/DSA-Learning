import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateElements {

    public static void main(String args[]) {
        int[] array = {5,2,5,7,2,9,7,1,5};
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int ele : array) {
            set.add(ele);
        }
        System.out.println(set);

        System.out.println(Arrays.stream(array).boxed().distinct().toList());
        
    }
    
}
