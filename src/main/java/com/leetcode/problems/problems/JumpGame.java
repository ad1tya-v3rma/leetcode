package com.leetcode.problems.problems;

public class JumpGame {
    public boolean canJump(int[] nums) {
        //[2,3,1,5,4]
        //[2,2,1,0,4]
        for(int i=1;i<nums.length;i++){
            int curPos = i;
            int maxJumpVal=0;
            int maxJumpIndex=0;
            while(i<nums[curPos]){
                if(maxJumpVal<nums[i]){
                    maxJumpVal = nums[i];
                    maxJumpIndex = i;
                }
                i++;
            }
            i=maxJumpIndex;
            if(i>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
