import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElementOccurrence {
    
    public static void main(String[] args) {
        int[] array = {3,5,3,2,5,3,8,2};
        int occurrences = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : array) {
            if(map.containsKey(ele)) {
                System.out.println("inside if loop "+ ele);
                map.put(ele, occurrences+1);
            // } else {
            //     System.out.println("inside else loop "+ ele);
            //     map.put(ele,occurrences);
            // }
        } 
    }

        System.out.println(map);
    //}
        // int occurrences = 0;
        // for(int i=0;i<array.length;i++) {
        //     if(map.containsKey(array[i])) {
        //         System.out.println("inside if loop, iteration is "+ i + " element searched array[i] is: "+ array[i]);
        //         map.put(array[i],occurrences+1);
        //     } else {
        //         System.out.println("inside else loop, iteration is "+ i + " element searched array[i] is: "+array[i]);
        //         map.put(array[i], 0);
        //     }
        // }
        // System.out.println(map);


        // int occurrences = 0;
        // for(int element:array) {
        //     if(map.get(element)==null) {
        //         System.out.println("inside if loop, iteration is:  element searched array[i] is: "+ element);
        //         map.put(element,0);
        //     } else {
        //         System.out.println("inside else loop, iteration is:  element searched array[i] is: "+ element);
        //         map.put(element, map.get(element+1));
        //     }
        // }
        // System.out.println(map);

        //List<Integer> list = List.of(1,2,1,2,3,4,3,4,6);
        //Map<Integer,Long> map1 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Integer,Long> map2 = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map2);
    }

}
