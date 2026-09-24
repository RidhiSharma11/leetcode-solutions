class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       ArrayList<int[]>list = new ArrayList<>();
       int n = intervals.length;
       list.add(intervals[0]);
       for(int i=1;i<n;i++){
        int[] current = list.get(list.size()-1);
        int[] next = intervals[i];

        if(current[1]>=next[0]){
            current[1] = Math.max(current[1],next[1]);
        }
        else{
            list.add(next);
        }
      }
      return list.toArray(new int[list.size()][]);
    }
}