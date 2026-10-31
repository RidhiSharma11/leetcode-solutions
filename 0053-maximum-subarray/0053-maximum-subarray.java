class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            max=Math.max(max,cs);

          if(cs<0){
            cs=0;
          }
        }

        return max;
    }
}