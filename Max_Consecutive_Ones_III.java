class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int j = -1;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
            while(count > k) {
                j++;
                if(nums[j] == 0) {
                    count--;
                }
            }
            max = Math.max(max, i - j);
        }
        return max;
    }
}


// Related Questions 1:
// Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;    
            } else {
                count = 0;
            } 
            max = Math.max(max, count);
        }
        return max;
    }
}


//Related Questions 2
//Max Consecutive Ones 2

//Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

//fix k = 1 with longestOnes problem.
