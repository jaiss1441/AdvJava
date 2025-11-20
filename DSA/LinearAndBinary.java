package DSA;

public class LinearAndBinary {

    static void main() {
        int target = 2;
        int nums[] = {2,3,4,8,6,9,7};


            int result = linearSearch(nums,target);

            if(result != -1){
                System.out.println(result);
            }else {
                System.out.println("Element not found");
            }

    }

    public static int linearSearch(int nums[], int target){
        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
