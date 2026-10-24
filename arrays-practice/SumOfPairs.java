import java.util.Arrays;
import java.util.HashSet;

public class SumOfPairs {

    public static void main(String[] args) {
        int[] array = {8,7,2,5,3,1,9,4,6};
        int targetSum = 10;
        System.out.println("Target sum is: "+ targetSum);
        //Arrays.sort(array);
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] + array[j]==targetSum){
                    System.out.println("i and j elements are :"+ array[i] 
                    + " "+ array[j]);
                   // System.out.println("Pair is: "+ i + " "+ j);
                }
            }
        }

        System.out.println("Second approach");
        HashSet<Integer> set = new HashSet<>();
        for(int element : array) {
            int value = targetSum - element;
            if(set.contains(value)){
                System.out.println("Pair is :" + value + " "+ element);
            }
            set.add(element);
        }
    }
    
}
