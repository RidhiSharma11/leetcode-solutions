class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []>list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] current=list.get(list.size()-1);
            int[] next = intervals[i];

            if(next[0]<=current[1]){
                current[1]=Math.max(current[1],next[1]);
            }
            else{
                list.add(next);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}