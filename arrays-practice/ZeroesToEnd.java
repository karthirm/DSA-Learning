import java.util.Arrays;
public class ZeroesToEnd {

    public static void main(String[] args) {
        int[] array = {0,5,0,3,8,0,2,0,7};
        //Arrays.sort(array);
        for(int i=array.length-1;i>0;i--){
            System.out.println(array[i]);
        }

        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[index] = array[i];
                index++;
            }
        }
        System.out.println("Second approach, index  is: "+ index);

        for(int i=index;i<array.length;i++){
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
        
    }

}
