import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i <nums.length; i++){
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)){
                return new int[] {numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }

        return new int[] {};

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Index1: " + result[0] + ", Index2: " + result[1]);
        } else {
            System.out.println("No solution found");
        }

    }
}