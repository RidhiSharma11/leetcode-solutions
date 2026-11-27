class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        backTrack(ans,list,nums,0);
        return ans;
    }

    public void backTrack(List<List<Integer>>ans,List<Integer>list,int[] nums,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        backTrack(ans,list,nums,idx+1);
        list.remove(list.size()-1);
        backTrack(ans,list,nums,idx+1);
    }
}