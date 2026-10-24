import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Duplicates {

    public static void main(String[] args) {
        int[] duplicates = {17,20,20,17,12,12,25};
        Arrays.sort(duplicates);
        for(int i=0;i<duplicates.length-1;i++){
            if(duplicates[i]==duplicates[i+1]){
                System.out.println(duplicates[i]);
            }
        }

        System.out.println("second approach");
        for(int i=0;i<duplicates.length;i++){
            for(int j=i+1;j<duplicates.length;j++){
                if(duplicates[i]==duplicates[j]){
                    System.out.println("duplicate element is " + duplicates[i] );
                }
            }
        }

        System.out.println("streams approach");
        List<Integer> list = Arrays.stream(duplicates).boxed()
        .distinct().collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Fourth approach");
        HashSet set = new HashSet<>();
        for(int num:duplicates){
                System.out.println(!(set.add(num)));
        }
        System.out.println(set);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : duplicates) {
            if(map.get(element) == null){
                map.put(element, 1);
            } else {
                map.put(element, map.get(element+1));
            }
        }

        

        
    }
    
}
