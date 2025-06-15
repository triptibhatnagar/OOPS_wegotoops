public class E_AddFirstLast {
    public int sumOfFirstAndLast(int[] nums) {
        if(nums.length == 0) return -1;
        return nums[0]+nums[nums.length-1]; 
    }
}