import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*int[] nums = {1, 3,4,6,9,10,11};*/
       /* List<Integer> nums = Arrays.asList(1, 3,4,6,9,10,11);
        System.out.println(returnMax(nums));*/
    }

    //********************************************************************************************

  //Write a Java function that largest element in a list
    //Example:
    //Input: [1, 3, 5, 12, 4. 21, 3. 21,3,2]
    //Output: 21
    //Input: [1]
    //Output: 1
    //hum) element in a list containing only positive integers,

/*   public static int returnMax(List<Integer> list){

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() ; i++){

            if(list.get(i) > largest){
                largest = list.get(i);
            }
        }
        return largest;
    }*/

    //********************************************************************************************

   /* Given an array of integers, find the sum of its positive elements.
            Example:
    Input: [1, 3, -5, 12, 4, -21, 3, -2]
    Output: 23
    Input: [-3, -5, 1, -87]
    Outout 1*/

    //********************************************************************************************
    // SUM OF POSITIVES
/*    public static int sumOfPositives(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length ; i++){
            if (nums[i] > 0){
                sum += nums[i];
            }
        }
        return sum;
    }*/

    //********************************************************************************************
    // NUMBERS SMALLER THAN TARGET NUMBER
/*    public static int targetNumber(int[] nums,int target){
        int counter = 0;
        for (int i = 0; i<nums.length ; i++){
            if (nums[i] < target){
                counter += 1;
            }
        }
        return counter;
    }*/
    //********************************************************************************************
    //  SECOND LARGEST


/*    public static int secondLargest(int[] nums) {
        if (nums.length == 1) return nums[0];
        else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            //int[] nums = {3, 1,6,4,9,10,11};
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] > largest){
                    secondLargest = largest;    // 0
                    largest = nums[i];          // 3
                }else if(nums[i] > secondLargest && nums[i] != largest){
                    secondLargest = nums[i];
                }
            }
            return secondLargest;
        }
    }*/

}