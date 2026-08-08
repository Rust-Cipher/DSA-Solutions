import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1 ;
        int [] indexes = new int[2];

        while(left < right){
            int sum = nums[left] + nums[right];
            
            if(sum == target){
                indexes[0] = left;
                indexes[1] = right;
            }else if( sum < target){git 
                left ++;

            }else if(sum > target ){
                right --;
            }
        }
        return indexes;
    }
}