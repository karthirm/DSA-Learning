import java.util.Arrays;
import java.util.HashSet;

public class ArraysIntersection {

    public static void main(String[] args) {
        int[] array1 = {4,9,5,4,8};
        int[] array2 = {9,4,9,8,10};
        //find distinct values common to both arrays
        //Arrays.stream(array1).boxed();
        HashSet<Integer> set1 = new HashSet<>();
        for(int ele1 : array1) {
            set1.add(ele1);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int ele2 : array2) {
            set2.add(ele2);
        }
        System.out.println("set1 values are : "+set1);
        System.out.println("set2 values are : "+set2);
        for(int ele : set1) {
            //System.out.println(set1);
        if(set2.contains(ele)){
            System.out.println("element is : " + ele);
        }
        }
        


    }
    
}
