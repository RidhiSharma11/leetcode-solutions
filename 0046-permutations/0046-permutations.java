class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Solve(visited,nums,ans,list);
        return ans;
    }

    public void Solve(boolean[] visited,int[] nums,List<List<Integer>>ans,List<Integer>list){
       if(list.size()==nums.length){
        ans.add(new ArrayList<>(list));
        return;
       } 

       for(int i=0;i<nums.length;i++){
        if(!visited[i]){
            list.add(nums[i]);
            visited[i]=true;
            Solve(visited,nums,ans,list);
            list.remove(list.size()-1);
            visited[i]=false;
        }
       }
    }
}