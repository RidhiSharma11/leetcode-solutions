class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        backTracking(0,candidates,ans,list,target);
        return ans;
    }

    public void backTracking(int index,int[] candidates,List<List<Integer>>ans,List<Integer>list,int target){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || index==candidates.length){
            return;
        }

        list.add(candidates[index]);
        backTracking(index,candidates,ans,list,target-candidates[index]);
        list.remove(list.size()-1);
        backTracking(index+1,candidates,ans,list,target);        
    }
}