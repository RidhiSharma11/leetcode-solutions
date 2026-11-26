class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        Arrays.sort(nums);
        findSub(0,nums,ans,list);
        return ans;
    }
    public void findSub(int idx,int[] nums,List<List<Integer>>ans,List<Integer>list){
        ans.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }

            list.add(nums[i]);
            findSub(i+1,nums,ans,list);
            list.remove(list.size()-1);
        }
    }
}