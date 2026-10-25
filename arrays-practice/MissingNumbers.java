public class MissingNumbers {

    public static void main(String[] args) {
        int[] array = {1,4,2,7,5,8,3};
        int n = 8, sumOfArray =0, sumOfNElements=0;
        for(int i=0;i<array.length;i++){
            sumOfArray += array[i];
        }
        sumOfNElements += (n*(n+1))/2;
        System.out.println("Sum of N elements is :"+ sumOfNElements);
        System.out.println("SumOfArray is: "+ sumOfArray);
        int missingNumber = sumOfNElements - sumOfArray;
        System.out.println("missing number is :"+missingNumber);
        //1,2,3,4,5,6,7,8,10 , 55 - total, 46, missing is 9

    }
}