class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>>ans = new ArrayList<>();
      List<Integer>list = new ArrayList<>();
      backTracking(0,candidates,ans,list,target);
      return ans;
    }
    public void backTracking(int index,int[] candidates,List<List<Integer>>ans,List<Integer>list,int target){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
          if(i>index && candidates[i]==candidates[i-1]){
            continue;
          }
          if(candidates[i]>target){
            break;
          }
          list.add(candidates[i]);
          backTracking(i+1,candidates,ans,list,target-candidates[i]);
          list.remove(list.size()-1);
        }
    }
}